package typings.jestHasteMap

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jestHasteMap.anon.FilePath
import typings.jestHasteMap.jestHasteMapInts.`0`
import typings.jestHasteMap.jestHasteMapInts.`1`
import typings.jestHasteMap.jestHasteMapInts.`2`
import typings.jestHasteMap.jestHasteMapInts.`3`
import typings.jestHasteMap.jestHasteMapInts.`4`
import typings.jestHasteMap.jestHasteMapInts.`5`
import typings.jestHasteMap.jestHasteMapStrings.change
import typings.jestHasteMap.jestHasteMapStrings.g
import typings.jestHasteMap.jestHasteMapStrings.native
import typings.jestTypes.mod.ProjectConfig
import typings.std.Console
import typings.std.Error
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jest-haste-map", JSImport.Default)
  @js.native
  val default: IJestHasteMap = js.native
  
  @JSImport("jest-haste-map", "DuplicateError")
  @js.native
  open class DuplicateError protected ()
    extends StObject
       with Error {
    def this(mockPath1: String, mockPath2: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    var mockPath1: String = js.native
    
    var mockPath2: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  object ModuleMap {
    
    @JSImport("jest-haste-map", "ModuleMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(rootPath: String): IModuleMap[SerializableModuleMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rootPath.asInstanceOf[js.Any]).asInstanceOf[IModuleMap[SerializableModuleMap]]
  }
  
  trait ChangeEvent extends StObject {
    
    var eventsQueue: EventsQueue
    
    var hasteFS: HasteFS
    
    var moduleMap: ModuleMap2
  }
  object ChangeEvent {
    
    inline def apply(eventsQueue: EventsQueue, hasteFS: HasteFS, moduleMap: ModuleMap2): ChangeEvent = {
      val __obj = js.Dynamic.literal(eventsQueue = eventsQueue.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
    
    extension [Self <: ChangeEvent](x: Self) {
      
      inline def setEventsQueue(value: EventsQueue): Self = StObject.set(x, "eventsQueue", value.asInstanceOf[js.Any])
      
      inline def setEventsQueueVarargs(value: FilePath*): Self = StObject.set(x, "eventsQueue", js.Array(value*))
      
      inline def setHasteFS(value: HasteFS): Self = StObject.set(x, "hasteFS", value.asInstanceOf[js.Any])
      
      inline def setModuleMap(value: ModuleMap2): Self = StObject.set(x, "moduleMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait DuplicateHasteCandidatesError
    extends StObject
       with Error {
    
    var duplicatesSet: DuplicatesSet
    
    var hasteName: String
    
    var platform: String | Null
    
    var supportsNativePlatform: Boolean
  }
  object DuplicateHasteCandidatesError {
    
    inline def apply(
      duplicatesSet: DuplicatesSet,
      hasteName: String,
      message: String,
      name: String,
      supportsNativePlatform: Boolean
    ): DuplicateHasteCandidatesError = {
      val __obj = js.Dynamic.literal(duplicatesSet = duplicatesSet.asInstanceOf[js.Any], hasteName = hasteName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsNativePlatform = supportsNativePlatform.asInstanceOf[js.Any], platform = null)
      __obj.asInstanceOf[DuplicateHasteCandidatesError]
    }
    
    extension [Self <: DuplicateHasteCandidatesError](x: Self) {
      
      inline def setDuplicatesSet(value: DuplicatesSet): Self = StObject.set(x, "duplicatesSet", value.asInstanceOf[js.Any])
      
      inline def setHasteName(value: String): Self = StObject.set(x, "hasteName", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformNull: Self = StObject.set(x, "platform", null)
      
      inline def setSupportsNativePlatform(value: Boolean): Self = StObject.set(x, "supportsNativePlatform", value.asInstanceOf[js.Any])
    }
  }
  
  type DuplicatesIndex = Map[String, Map[String, DuplicatesSet]]
  
  type DuplicatesSet = Map[String, /* type */ Double]
  
  type EventsQueue = js.Array[FilePath]
  
  type FileData = Map[String, FileMetaData]
  
  type FileMetaData = js.Tuple6[
    /* id */ String, 
    /* mtime */ Double, 
    /* size */ Double, 
    /* visited */ `0` | `1`, 
    /* dependencies */ String, 
    /* sha1 */ js.UndefOr[String | Null]
  ]
  
  trait HType extends StObject {
    
    var DEPENDENCIES: `4`
    
    var DEPENDENCY_DELIM: typings.jestHasteMap.jestHasteMapStrings.Null
    
    var GENERIC_PLATFORM: g
    
    var ID: `0`
    
    var MODULE: `0`
    
    var MTIME: `1`
    
    var NATIVE_PLATFORM: native
    
    var PACKAGE: `1`
    
    var PATH: `0`
    
    var SHA1: `5`
    
    var SIZE: `2`
    
    var TYPE: `1`
    
    var VISITED: `3`
  }
  object HType {
    
    inline def apply(): HType = {
      val __obj = js.Dynamic.literal(DEPENDENCIES = 4, DEPENDENCY_DELIM = "\u0000", GENERIC_PLATFORM = "g", ID = 0, MODULE = 0, MTIME = 1, NATIVE_PLATFORM = "native", PACKAGE = 1, PATH = 0, SHA1 = 5, SIZE = 2, TYPE = 1, VISITED = 3)
      __obj.asInstanceOf[HType]
    }
    
    extension [Self <: HType](x: Self) {
      
      inline def setDEPENDENCIES(value: `4`): Self = StObject.set(x, "DEPENDENCIES", value.asInstanceOf[js.Any])
      
      inline def setDEPENDENCY_DELIM(value: typings.jestHasteMap.jestHasteMapStrings.Null): Self = StObject.set(x, "DEPENDENCY_DELIM", value.asInstanceOf[js.Any])
      
      inline def setGENERIC_PLATFORM(value: g): Self = StObject.set(x, "GENERIC_PLATFORM", value.asInstanceOf[js.Any])
      
      inline def setID(value: `0`): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setMODULE(value: `0`): Self = StObject.set(x, "MODULE", value.asInstanceOf[js.Any])
      
      inline def setMTIME(value: `1`): Self = StObject.set(x, "MTIME", value.asInstanceOf[js.Any])
      
      inline def setNATIVE_PLATFORM(value: native): Self = StObject.set(x, "NATIVE_PLATFORM", value.asInstanceOf[js.Any])
      
      inline def setPACKAGE(value: `1`): Self = StObject.set(x, "PACKAGE", value.asInstanceOf[js.Any])
      
      inline def setPATH(value: `0`): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
      
      inline def setSHA1(value: `5`): Self = StObject.set(x, "SHA1", value.asInstanceOf[js.Any])
      
      inline def setSIZE(value: `2`): Self = StObject.set(x, "SIZE", value.asInstanceOf[js.Any])
      
      inline def setTYPE(value: `1`): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setVISITED(value: `3`): Self = StObject.set(x, "VISITED", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined jest-haste-map.jest-haste-map.HType[keyof jest-haste-map.jest-haste-map.HType] */
  /* Rewritten from type alias, can be one of: 
    - typings.jestHasteMap.jestHasteMapInts.`3`
    - typings.jestHasteMap.jestHasteMapInts.`2`
    - typings.jestHasteMap.jestHasteMapInts.`4`
    - typings.jestHasteMap.jestHasteMapInts.`0`
    - typings.jestHasteMap.jestHasteMapInts.`5`
    - typings.jestHasteMap.jestHasteMapInts.`1`
    - typings.jestHasteMap.jestHasteMapStrings.g
    - typings.jestHasteMap.jestHasteMapStrings.native
    - typings.jestHasteMap.jestHasteMapStrings.Null
  */
  trait HTypeValue extends StObject
  object HTypeValue {
    
    inline def `0`: typings.jestHasteMap.jestHasteMapInts.`0` = 0.asInstanceOf[typings.jestHasteMap.jestHasteMapInts.`0`]
    
    inline def `1`: typings.jestHasteMap.jestHasteMapInts.`1` = 1.asInstanceOf[typings.jestHasteMap.jestHasteMapInts.`1`]
    
    inline def `2`: typings.jestHasteMap.jestHasteMapInts.`2` = 2.asInstanceOf[typings.jestHasteMap.jestHasteMapInts.`2`]
    
    inline def `3`: typings.jestHasteMap.jestHasteMapInts.`3` = 3.asInstanceOf[typings.jestHasteMap.jestHasteMapInts.`3`]
    
    inline def `4`: typings.jestHasteMap.jestHasteMapInts.`4` = 4.asInstanceOf[typings.jestHasteMap.jestHasteMapInts.`4`]
    
    inline def `5`: typings.jestHasteMap.jestHasteMapInts.`5` = 5.asInstanceOf[typings.jestHasteMap.jestHasteMapInts.`5`]
    
    inline def Null: typings.jestHasteMap.jestHasteMapStrings.Null = "\u0000".asInstanceOf[typings.jestHasteMap.jestHasteMapStrings.Null]
    
    inline def g: typings.jestHasteMap.jestHasteMapStrings.g = "g".asInstanceOf[typings.jestHasteMap.jestHasteMapStrings.g]
    
    inline def native: typings.jestHasteMap.jestHasteMapStrings.native = "native".asInstanceOf[typings.jestHasteMap.jestHasteMapStrings.native]
  }
  
  @js.native
  trait HasteFS
    extends StObject
       with IHasteFS {
    
    /* private */ val _files: Any = js.native
    
    /* private */ var _getFileData: Any = js.native
    
    /* private */ val _rootDir: Any = js.native
    
    def getFileIterator(): js.Iterable[String] = js.native
    
    def getModuleName(file: String): String | Null = js.native
    
    def getSha1(file: String): String | Null = js.native
  }
  
  trait HasteMapStatic[S] extends StObject {
    
    def getCacheFilePath(tmpdir: String, name: String, extra: String*): String
    
    def getModuleMapFromJSON(json: S): IModuleMap[S]
  }
  object HasteMapStatic {
    
    inline def apply[S](
      getCacheFilePath: (String, String, /* repeated */ String) => String,
      getModuleMapFromJSON: S => IModuleMap[S]
    ): HasteMapStatic[S] = {
      val __obj = js.Dynamic.literal(getCacheFilePath = js.Any.fromFunction3(getCacheFilePath), getModuleMapFromJSON = js.Any.fromFunction1(getModuleMapFromJSON))
      __obj.asInstanceOf[HasteMapStatic[S]]
    }
    
    extension [Self <: HasteMapStatic[?], S](x: Self & HasteMapStatic[S]) {
      
      inline def setGetCacheFilePath(value: (String, String, /* repeated */ String) => String): Self = StObject.set(x, "getCacheFilePath", js.Any.fromFunction3(value))
      
      inline def setGetModuleMapFromJSON(value: S => IModuleMap[S]): Self = StObject.set(x, "getModuleMapFromJSON", js.Any.fromFunction1(value))
    }
  }
  
  type HasteRegExp = js.RegExp | (js.Function1[/* str */ String, Boolean])
  
  @js.native
  trait IHasteFS extends StObject {
    
    def exists(path: String): Boolean = js.native
    
    def getAbsoluteFileIterator(): js.Iterable[String] = js.native
    
    def getAllFiles(): js.Array[String] = js.native
    
    def getDependencies(file: String): js.Array[String] | Null = js.native
    
    def getSize(path: String): Double | Null = js.native
    
    def matchFiles(pattern: String): js.Array[String] = js.native
    def matchFiles(pattern: js.RegExp): js.Array[String] = js.native
    
    def matchFilesWithGlob(globs: js.Array[String]): Set[String] = js.native
    def matchFilesWithGlob(globs: js.Array[String], root: String): Set[String] = js.native
  }
  
  trait IHasteMap extends StObject {
    
    def build(): js.Promise[typings.jestHasteMap.anon.HasteFS]
    
    @JSName("on")
    def on_change(eventType: change, handler: js.Function1[/* event */ ChangeEvent, Unit]): Unit
  }
  object IHasteMap {
    
    inline def apply(
      build: () => js.Promise[typings.jestHasteMap.anon.HasteFS],
      on: (change, js.Function1[/* event */ ChangeEvent, Unit]) => Unit
    ): IHasteMap = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[IHasteMap]
    }
    
    extension [Self <: IHasteMap](x: Self) {
      
      inline def setBuild(value: () => js.Promise[typings.jestHasteMap.anon.HasteFS]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      inline def setOn(value: (change, js.Function1[/* event */ ChangeEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait IJestHasteMap
    extends StObject
       with HasteMapStatic[SerializableModuleMap] {
    
    def create(options: Options): js.Promise[IHasteMap]
    
    def getStatic(config: ProjectConfig): HasteMapStatic[SerializableModuleMap]
  }
  object IJestHasteMap {
    
    inline def apply(
      create: Options => js.Promise[IHasteMap],
      getCacheFilePath: (String, String, /* repeated */ String) => String,
      getModuleMapFromJSON: SerializableModuleMap => IModuleMap[SerializableModuleMap],
      getStatic: ProjectConfig => HasteMapStatic[SerializableModuleMap]
    ): IJestHasteMap = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), getCacheFilePath = js.Any.fromFunction3(getCacheFilePath), getModuleMapFromJSON = js.Any.fromFunction1(getModuleMapFromJSON), getStatic = js.Any.fromFunction1(getStatic))
      __obj.asInstanceOf[IJestHasteMap]
    }
    
    extension [Self <: IJestHasteMap](x: Self) {
      
      inline def setCreate(value: Options => js.Promise[IHasteMap]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setGetStatic(value: ProjectConfig => HasteMapStatic[SerializableModuleMap]): Self = StObject.set(x, "getStatic", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IModuleMap[S] extends StObject {
    
    def getMockModule(name: String): js.UndefOr[String] = js.native
    
    def getModule(name: String): String | Null = js.native
    def getModule(name: String, platform: String): String | Null = js.native
    def getModule(name: String, platform: String, supportsNativePlatform: Boolean): String | Null = js.native
    def getModule(name: String, platform: String, supportsNativePlatform: Boolean, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: String, supportsNativePlatform: Null, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: String, supportsNativePlatform: Unit, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: Null, supportsNativePlatform: Boolean): String | Null = js.native
    def getModule(name: String, platform: Null, supportsNativePlatform: Boolean, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: Null, supportsNativePlatform: Null, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: Null, supportsNativePlatform: Unit, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: Unit, supportsNativePlatform: Boolean): String | Null = js.native
    def getModule(name: String, platform: Unit, supportsNativePlatform: Boolean, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: Unit, supportsNativePlatform: Null, `type`: HTypeValue): String | Null = js.native
    def getModule(name: String, platform: Unit, supportsNativePlatform: Unit, `type`: HTypeValue): String | Null = js.native
    
    def getPackage(name: String): String | Null = js.native
    def getPackage(name: String, platform: String): String | Null = js.native
    def getPackage(name: String, platform: String, _supportsNativePlatform: Boolean): String | Null = js.native
    def getPackage(name: String, platform: Null, _supportsNativePlatform: Boolean): String | Null = js.native
    def getPackage(name: String, platform: Unit, _supportsNativePlatform: Boolean): String | Null = js.native
    
    def getRawModuleMap(): RawModuleMap = js.native
    
    def toJSON(): S = js.native
  }
  
  type MockData = Map[String, String]
  
  @js.native
  trait ModuleMap2
    extends StObject
       with IModuleMap[SerializableModuleMap] {
    
    /* private */ var _assertNoDuplicates: Any = js.native
    
    /**
      * When looking up a module's data, we walk through each eligible platform for
      * the query. For each platform, we want to check if there are known
      * duplicates for that name+platform pair. The duplication logic normally
      * removes elements from the `map` object, but we want to check upfront to be
      * extra sure. If metadata exists both in the `duplicates` object and the
      * `map`, this would be a bug.
      */
    /* private */ var _getModuleMetadata: Any = js.native
    
    /* private */ val _raw: Any = js.native
    
    /* private */ var json: Any = js.native
  }
  
  type ModuleMapData = Map[String, ModuleMapItem]
  
  type ModuleMapItem = StringDictionary[ModuleMetaData]
  
  type ModuleMetaData = js.Tuple2[/* path */ String, /* type */ Double]
  
  trait Options extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var computeDependencies: js.UndefOr[Boolean] = js.undefined
    
    var computeSha1: js.UndefOr[Boolean] = js.undefined
    
    var console: js.UndefOr[Console] = js.undefined
    
    var dependencyExtractor: js.UndefOr[String | Null] = js.undefined
    
    var enableSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.Array[String]
    
    var forceNodeFilesystemAPI: js.UndefOr[Boolean] = js.undefined
    
    var hasteImplModulePath: js.UndefOr[String] = js.undefined
    
    var hasteMapModulePath: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var ignorePattern: js.UndefOr[HasteRegExp] = js.undefined
    
    var maxWorkers: Double
    
    var mocksPattern: js.UndefOr[String] = js.undefined
    
    var platforms: js.Array[String]
    
    var resetCache: js.UndefOr[Boolean] = js.undefined
    
    var retainAllFiles: Boolean
    
    var rootDir: String
    
    var roots: js.Array[String]
    
    var skipPackageJson: js.UndefOr[Boolean] = js.undefined
    
    var throwOnModuleCollision: js.UndefOr[Boolean] = js.undefined
    
    var useWatchman: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(
      extensions: js.Array[String],
      id: String,
      maxWorkers: Double,
      platforms: js.Array[String],
      retainAllFiles: Boolean,
      rootDir: String,
      roots: js.Array[String]
    ): Options = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], retainAllFiles = retainAllFiles.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setComputeDependencies(value: Boolean): Self = StObject.set(x, "computeDependencies", value.asInstanceOf[js.Any])
      
      inline def setComputeDependenciesUndefined: Self = StObject.set(x, "computeDependencies", js.undefined)
      
      inline def setComputeSha1(value: Boolean): Self = StObject.set(x, "computeSha1", value.asInstanceOf[js.Any])
      
      inline def setComputeSha1Undefined: Self = StObject.set(x, "computeSha1", js.undefined)
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
      
      inline def setDependencyExtractorNull: Self = StObject.set(x, "dependencyExtractor", null)
      
      inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
      
      inline def setEnableSymlinks(value: Boolean): Self = StObject.set(x, "enableSymlinks", value.asInstanceOf[js.Any])
      
      inline def setEnableSymlinksUndefined: Self = StObject.set(x, "enableSymlinks", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setForceNodeFilesystemAPI(value: Boolean): Self = StObject.set(x, "forceNodeFilesystemAPI", value.asInstanceOf[js.Any])
      
      inline def setForceNodeFilesystemAPIUndefined: Self = StObject.set(x, "forceNodeFilesystemAPI", js.undefined)
      
      inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
      
      inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
      
      inline def setHasteMapModulePath(value: String): Self = StObject.set(x, "hasteMapModulePath", value.asInstanceOf[js.Any])
      
      inline def setHasteMapModulePathUndefined: Self = StObject.set(x, "hasteMapModulePath", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIgnorePattern(value: HasteRegExp): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternFunction1(value: /* str */ String => Boolean): Self = StObject.set(x, "ignorePattern", js.Any.fromFunction1(value))
      
      inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMocksPattern(value: String): Self = StObject.set(x, "mocksPattern", value.asInstanceOf[js.Any])
      
      inline def setMocksPatternUndefined: Self = StObject.set(x, "mocksPattern", js.undefined)
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
      
      inline def setRetainAllFiles(value: Boolean): Self = StObject.set(x, "retainAllFiles", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
      
      inline def setSkipPackageJson(value: Boolean): Self = StObject.set(x, "skipPackageJson", value.asInstanceOf[js.Any])
      
      inline def setSkipPackageJsonUndefined: Self = StObject.set(x, "skipPackageJson", js.undefined)
      
      inline def setThrowOnModuleCollision(value: Boolean): Self = StObject.set(x, "throwOnModuleCollision", value.asInstanceOf[js.Any])
      
      inline def setThrowOnModuleCollisionUndefined: Self = StObject.set(x, "throwOnModuleCollision", js.undefined)
      
      inline def setUseWatchman(value: Boolean): Self = StObject.set(x, "useWatchman", value.asInstanceOf[js.Any])
      
      inline def setUseWatchmanUndefined: Self = StObject.set(x, "useWatchman", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait RawModuleMap extends StObject {
    
    var duplicates: DuplicatesIndex
    
    var map: ModuleMapData
    
    var mocks: MockData
    
    var rootDir: String
  }
  object RawModuleMap {
    
    inline def apply(duplicates: DuplicatesIndex, map: ModuleMapData, mocks: MockData, rootDir: String): RawModuleMap = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawModuleMap]
    }
    
    extension [Self <: RawModuleMap](x: Self) {
      
      inline def setDuplicates(value: DuplicatesIndex): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setMap(value: ModuleMapData): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMocks(value: MockData): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializableModuleMap extends StObject {
    
    var duplicates: js.Array[
        js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
      ]
    
    var map: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]]
    
    var mocks: js.Array[js.Tuple2[String, ValueType[MockData]]]
    
    var rootDir: String
  }
  object SerializableModuleMap {
    
    inline def apply(
      duplicates: js.Array[
          js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
        ],
      map: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]],
      mocks: js.Array[js.Tuple2[String, ValueType[MockData]]],
      rootDir: String
    ): SerializableModuleMap = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializableModuleMap]
    }
    
    extension [Self <: SerializableModuleMap](x: Self) {
      
      inline def setDuplicates(
        value: js.Array[
              js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
            ]
      ): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setDuplicatesVarargs(value: (js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]])*): Self = StObject.set(x, "duplicates", js.Array(value*))
      
      inline def setMap(value: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapVarargs(value: (js.Tuple2[String, ValueType[ModuleMapData]])*): Self = StObject.set(x, "map", js.Array(value*))
      
      inline def setMocks(value: js.Array[js.Tuple2[String, ValueType[MockData]]]): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setMocksVarargs(value: (js.Tuple2[String, ValueType[MockData]])*): Self = StObject.set(x, "mocks", js.Array(value*))
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Map<string, infer V> ? V : never
    }}}
    */
  @js.native
  trait ValueType[T] extends StObject
  
  type _To = IJestHasteMap
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IJestHasteMap = default
}
