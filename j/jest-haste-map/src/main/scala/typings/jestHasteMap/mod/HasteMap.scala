package typings.jestHasteMap.mod

import typings.jestHasteMap.moduleMapMod.default
import typings.jestHasteMap.typesMod.InternalHasteMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HasteMap is a JavaScript implementation of Facebook's haste module system.
  *
  * This implementation is inspired by https://github.com/facebook/node-haste
  * and was built with for high-performance in large code repositories with
  * hundreds of thousands of files. This implementation is scalable and provides
  * predictable performance.
  *
  * Because the haste map creation and synchronization is critical to startup
  * performance and most tasks are blocked by I/O this class makes heavy use of
  * synchronous operations. It uses worker processes for parallelizing file
  * access and metadata extraction.
  *
  * The data structures created by `jest-haste-map` can be used directly from the
  * cache without further processing. The metadata objects in the `files` and
  * `map` objects contain cross-references: a metadata object from one can look
  * up the corresponding metadata object in the other map. Note that in most
  * projects, the number of files will be greater than the number of haste
  * modules one module can refer to many files based on platform extensions.
  *
  * type HasteMap = {
  *   clocks: WatchmanClocks,
  *   files: {[filepath: string]: FileMetaData},
  *   map: {[id: string]: ModuleMapItem},
  *   mocks: {[id: string]: string},
  * }
  *
  * // Watchman clocks are used for query synchronization and file system deltas.
  * type WatchmanClocks = {[filepath: string]: string};
  *
  * type FileMetaData = {
  *   id: ?string, // used to look up module metadata objects in `map`.
  *   mtime: number, // check for outdated files.
  *   size: number, // size of the file in bytes.
  *   visited: boolean, // whether the file has been parsed or not.
  *   dependencies: Array<string>, // all relative dependencies of this file.
  *   sha1: ?string, // SHA-1 of the file, if requested via options.
  * };
  *
  * // Modules can be targeted to a specific platform based on the file name.
  * // Example: platform.ios.js and Platform.android.js will both map to the same
  * // `Platform` module. The platform should be specified during resolution.
  * type ModuleMapItem = {[platform: string]: ModuleMetaData};
  *
  * //
  * type ModuleMetaData = {
  *   path: string, // the path to look up the file object in `files`.
  *   type: string, // the module type (either `package` or `module`).
  * };
  *
  * Note that the data structures described above are conceptual only. The actual
  * implementation uses arrays and constant keys for metadata storage. Instead of
  * `{id: 'flatMap', mtime: 3421, size: 42, visited: true, dependencies: []}` the real
  * representation is similar to `['flatMap', 3421, 42, 1, []]` to save storage space
  * and reduce parse and write time of a big JSON blob.
  *
  * The HasteMap is created as follows:
  *  1. read data from the cache or create an empty structure.
  *
  *  2. crawl the file system.
  *     * empty cache: crawl the entire file system.
  *     * cache available:
  *       * if watchman is available: get file system delta changes.
  *       * if watchman is unavailable: crawl the entire file system.
  *     * build metadata objects for every file. This builds the `files` part of
  *       the `HasteMap`.
  *
  *  3. parse and extract metadata from changed files.
  *     * this is done in parallel over worker processes to improve performance.
  *     * the worst case is to parse all files.
  *     * the best case is no file system access and retrieving all data from
  *       the cache.
  *     * the average case is a small number of changed files.
  *
  *  4. serialize the new `HasteMap` in a cache file.
  *     Worker processes can directly access the cache through `HasteMap.read()`.
  *
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ @js.native
trait HasteMap extends js.Object {
  
  /**
    * 2. crawl the file system.
    */
  var _buildFileMap: js.Any = js.native
  
  var _buildHasteMap: js.Any = js.native
  
  var _buildPromise: js.Any = js.native
  
  var _cachePath: js.Any = js.native
  
  var _changeInterval: js.Any = js.native
  
  var _cleanup: js.Any = js.native
  
  var _console: js.Any = js.native
  
  var _crawl: js.Any = js.native
  
  var _createEmptyMap: js.Any = js.native
  
  /**
    * Creates workers or parses files and extracts metadata in-process.
    */
  var _getWorker: js.Any = js.native
  
  /**
    * Helpers
    */
  var _ignore: js.Any = js.native
  
  var _isNodeModulesDir: js.Any = js.native
  
  var _options: js.Any = js.native
  
  /**
    * 4. serialize the new `HasteMap` in a cache file.
    */
  var _persist: js.Any = js.native
  
  /**
    * 3. parse and extract metadata from changed files.
    */
  var _processFile: js.Any = js.native
  
  /**
    * This function should be called when the file under `filePath` is removed
    * or changed. When that happens, we want to figure out if that file was
    * part of a group of files that had the same ID. If it was, we want to
    * remove it from the group. Furthermore, if there is only one file
    * remaining in the group, then we want to restore that single file as the
    * correct resolution for its ID, and cleanup the duplicates index.
    */
  var _recoverDuplicates: js.Any = js.native
  
  /**
    * Watch mode
    */
  var _watch: js.Any = js.native
  
  var _watchers: js.Any = js.native
  
  var _whitelist: js.Any = js.native
  
  var _worker: js.Any = js.native
  
  def build(): js.Promise[typings.jestHasteMap.typesMod.HasteMap] = js.native
  
  def end(): js.Promise[Unit] = js.native
  
  def getCacheFilePath(): String = js.native
  
  /**
    * 1. read data from the cache or create an empty structure.
    */
  def read(): InternalHasteMap = js.native
  
  def readModuleMap(): default = js.native
}
object HasteMap {
  
  @scala.inline
  def apply(
    _buildFileMap: js.Any,
    _buildHasteMap: js.Any,
    _buildPromise: js.Any,
    _cachePath: js.Any,
    _changeInterval: js.Any,
    _cleanup: js.Any,
    _console: js.Any,
    _crawl: js.Any,
    _createEmptyMap: js.Any,
    _getWorker: js.Any,
    _ignore: js.Any,
    _isNodeModulesDir: js.Any,
    _options: js.Any,
    _persist: js.Any,
    _processFile: js.Any,
    _recoverDuplicates: js.Any,
    _watch: js.Any,
    _watchers: js.Any,
    _whitelist: js.Any,
    _worker: js.Any,
    build: () => js.Promise[typings.jestHasteMap.typesMod.HasteMap],
    end: () => js.Promise[Unit],
    getCacheFilePath: () => String,
    read: () => InternalHasteMap,
    readModuleMap: () => default
  ): HasteMap = {
    val __obj = js.Dynamic.literal(_buildFileMap = _buildFileMap.asInstanceOf[js.Any], _buildHasteMap = _buildHasteMap.asInstanceOf[js.Any], _buildPromise = _buildPromise.asInstanceOf[js.Any], _cachePath = _cachePath.asInstanceOf[js.Any], _changeInterval = _changeInterval.asInstanceOf[js.Any], _cleanup = _cleanup.asInstanceOf[js.Any], _console = _console.asInstanceOf[js.Any], _crawl = _crawl.asInstanceOf[js.Any], _createEmptyMap = _createEmptyMap.asInstanceOf[js.Any], _getWorker = _getWorker.asInstanceOf[js.Any], _ignore = _ignore.asInstanceOf[js.Any], _isNodeModulesDir = _isNodeModulesDir.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _persist = _persist.asInstanceOf[js.Any], _processFile = _processFile.asInstanceOf[js.Any], _recoverDuplicates = _recoverDuplicates.asInstanceOf[js.Any], _watch = _watch.asInstanceOf[js.Any], _watchers = _watchers.asInstanceOf[js.Any], _whitelist = _whitelist.asInstanceOf[js.Any], _worker = _worker.asInstanceOf[js.Any], build = js.Any.fromFunction0(build), end = js.Any.fromFunction0(end), getCacheFilePath = js.Any.fromFunction0(getCacheFilePath), read = js.Any.fromFunction0(read), readModuleMap = js.Any.fromFunction0(readModuleMap))
    __obj.asInstanceOf[HasteMap]
  }
  
  @scala.inline
  implicit class HasteMapOps[Self <: HasteMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_buildFileMap(value: js.Any): Self = this.set("_buildFileMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_buildHasteMap(value: js.Any): Self = this.set("_buildHasteMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_buildPromise(value: js.Any): Self = this.set("_buildPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cachePath(value: js.Any): Self = this.set("_cachePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_changeInterval(value: js.Any): Self = this.set("_changeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cleanup(value: js.Any): Self = this.set("_cleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_console(value: js.Any): Self = this.set("_console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_crawl(value: js.Any): Self = this.set("_crawl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createEmptyMap(value: js.Any): Self = this.set("_createEmptyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getWorker(value: js.Any): Self = this.set("_getWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ignore(value: js.Any): Self = this.set("_ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isNodeModulesDir(value: js.Any): Self = this.set("_isNodeModulesDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_options(value: js.Any): Self = this.set("_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_persist(value: js.Any): Self = this.set("_persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_processFile(value: js.Any): Self = this.set("_processFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_recoverDuplicates(value: js.Any): Self = this.set("_recoverDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_watch(value: js.Any): Self = this.set("_watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_watchers(value: js.Any): Self = this.set("_watchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_whitelist(value: js.Any): Self = this.set("_whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_worker(value: js.Any): Self = this.set("_worker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: () => js.Promise[typings.jestHasteMap.typesMod.HasteMap]): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: () => js.Promise[Unit]): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCacheFilePath(value: () => String): Self = this.set("getCacheFilePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRead(value: () => InternalHasteMap): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadModuleMap(value: () => default): Self = this.set("readModuleMap", js.Any.fromFunction0(value))
  }
}
