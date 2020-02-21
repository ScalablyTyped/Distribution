package typings.jestHasteMap.mod

import typings.jestHasteMap.moduleMapMod.default
import typings.jestHasteMap.typesMod.InternalHasteMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ trait HasteMap extends js.Object {
  /**
    * 2. crawl the file system.
    */
  var _buildFileMap: js.Any
  var _buildHasteMap: js.Any
  var _buildPromise: js.Any
  var _cachePath: js.Any
  var _changeInterval: js.UndefOr[js.Any] = js.undefined
  var _cleanup: js.Any
  var _console: js.Any
  var _crawl: js.Any
  var _createEmptyMap: js.Any
  /**
    * Creates workers or parses files and extracts metadata in-process.
    */
  var _getWorker: js.Any
  /**
    * Helpers
    */
  var _ignore: js.Any
  var _isNodeModulesDir: js.Any
  var _options: js.Any
  /**
    * 4. serialize the new `HasteMap` in a cache file.
    */
  var _persist: js.Any
  /**
    * 3. parse and extract metadata from changed files.
    */
  var _processFile: js.Any
  /**
    * This function should be called when the file under `filePath` is removed
    * or changed. When that happens, we want to figure out if that file was
    * part of a group of files that had the same ID. If it was, we want to
    * remove it from the group. Furthermore, if there is only one file
    * remaining in the group, then we want to restore that single file as the
    * correct resolution for its ID, and cleanup the duplicates index.
    */
  var _recoverDuplicates: js.Any
  /**
    * Watch mode
    */
  var _watch: js.Any
  var _watchers: js.Any
  var _whitelist: js.Any
  var _worker: js.Any
  def build(): js.Promise[typings.jestHasteMap.typesMod.HasteMap]
  def end(): js.Promise[Unit]
  def getCacheFilePath(): String
  /**
    * 1. read data from the cache or create an empty structure.
    */
  def read(): InternalHasteMap
  def readModuleMap(): default
}

object HasteMap {
  @scala.inline
  def apply(
    _buildFileMap: js.Any,
    _buildHasteMap: js.Any,
    _buildPromise: js.Any,
    _cachePath: js.Any,
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
    readModuleMap: () => default,
    _changeInterval: js.Any = null
  ): HasteMap = {
    val __obj = js.Dynamic.literal(_buildFileMap = _buildFileMap.asInstanceOf[js.Any], _buildHasteMap = _buildHasteMap.asInstanceOf[js.Any], _buildPromise = _buildPromise.asInstanceOf[js.Any], _cachePath = _cachePath.asInstanceOf[js.Any], _cleanup = _cleanup.asInstanceOf[js.Any], _console = _console.asInstanceOf[js.Any], _crawl = _crawl.asInstanceOf[js.Any], _createEmptyMap = _createEmptyMap.asInstanceOf[js.Any], _getWorker = _getWorker.asInstanceOf[js.Any], _ignore = _ignore.asInstanceOf[js.Any], _isNodeModulesDir = _isNodeModulesDir.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _persist = _persist.asInstanceOf[js.Any], _processFile = _processFile.asInstanceOf[js.Any], _recoverDuplicates = _recoverDuplicates.asInstanceOf[js.Any], _watch = _watch.asInstanceOf[js.Any], _watchers = _watchers.asInstanceOf[js.Any], _whitelist = _whitelist.asInstanceOf[js.Any], _worker = _worker.asInstanceOf[js.Any], build = js.Any.fromFunction0(build), end = js.Any.fromFunction0(end), getCacheFilePath = js.Any.fromFunction0(getCacheFilePath), read = js.Any.fromFunction0(read), readModuleMap = js.Any.fromFunction0(readModuleMap))
    if (_changeInterval != null) __obj.updateDynamic("_changeInterval")(_changeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMap]
  }
}

