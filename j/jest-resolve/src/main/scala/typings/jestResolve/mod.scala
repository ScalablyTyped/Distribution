package typings.jestResolve

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.jestHasteMap.mod.IModuleMap
import typings.jestHasteMap.mod.SerializableModuleMap
import typings.jestResolve.anon.FilePath
import typings.jestResolve.anon.RequireResolveFunction
import typings.jestResolve.anon.TypeofModuleNotFoundError
import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-resolve", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Resolver {
    def this(moduleMap: IModuleMap[SerializableModuleMap], options: ResolverConfig) = this()
  }
  object default {
    
    @JSImport("jest-resolve", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("jest-resolve", "default.ModuleNotFoundError")
    @js.native
    open class ModuleNotFoundError protected ()
      extends StObject
         with typings.jestResolve.mod.ModuleNotFoundError {
      def this(message: String) = this()
      def this(message: String, moduleName: String) = this()
      
      /* private */ /* CompleteClass */
      var _originalMessage: Any = js.native
      
      /* CompleteClass */
      override def buildMessage(rootDir: String): Unit = js.native
      
      /* CompleteClass */
      var code: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
    }
    /* static member */
    /* was `typeof ModuleNotFoundError` */
    @JSImport("jest-resolve", "default.ModuleNotFoundError")
    @js.native
    def ModuleNotFoundError: TypeofModuleNotFoundError & (Instantiable2[
        /* message */ String, 
        /* moduleName */ js.UndefOr[String], 
        typings.jestResolve.mod.ModuleNotFoundError
      ]) = js.native
    inline def ModuleNotFoundError_=(
      x: TypeofModuleNotFoundError & (Instantiable2[
          /* message */ String, 
          /* moduleName */ js.UndefOr[String], 
          typings.jestResolve.mod.ModuleNotFoundError
        ])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModuleNotFoundError")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def clearDefaultResolverCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDefaultResolverCache")().asInstanceOf[Unit]
    
    /* static member */
    inline def findNodeModule(path: String, options: FindNodeModuleConfig): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeModule")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    /* static member */
    inline def findNodeModuleAsync(path: String, options: FindNodeModuleConfig): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeModuleAsync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
    
    /* static member */
    inline def tryCastModuleNotFoundError(error: Any): typings.jestResolve.mod.ModuleNotFoundError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCastModuleNotFoundError")(error.asInstanceOf[js.Any]).asInstanceOf[typings.jestResolve.mod.ModuleNotFoundError | Null]
    
    /* was `typeof cachedShouldLoadAsEsm` */
    inline def unstableShouldLoadAsEsm(path: String, extensionsToTreatAsEsm: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_shouldLoadAsEsm")(path.asInstanceOf[js.Any], extensionsToTreatAsEsm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  inline def resolveRunner(resolver: String, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRunner")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveRunner(resolver: Null, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRunner")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveRunner(resolver: Unit, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRunner")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveSequencer(resolver: String, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSequencer")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveSequencer(resolver: Null, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSequencer")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveSequencer(resolver: Unit, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSequencer")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveTestEnvironment(hasRootDirTestEnvironmentRequireResolveFunction: RequireResolveFunction): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveTestEnvironment")(hasRootDirTestEnvironmentRequireResolveFunction.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveWatchPlugin(resolver: String, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWatchPlugin")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveWatchPlugin(resolver: Null, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWatchPlugin")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveWatchPlugin(resolver: Unit, hasFilePathRootDirRequireResolveFunction: FilePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWatchPlugin")(resolver.asInstanceOf[js.Any], hasFilePathRootDirRequireResolveFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type AsyncResolver = js.Function2[/* path */ String, /* options */ ResolverOptions, js.Promise[String]]
  
  trait FindNodeModuleConfig extends StObject {
    
    var basedir: String
    
    var conditions: js.UndefOr[js.Array[String]] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var moduleDirectory: js.UndefOr[js.Array[String]] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    var resolver: js.UndefOr[String | Null] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var throwIfNotFound: js.UndefOr[Boolean] = js.undefined
  }
  object FindNodeModuleConfig {
    
    inline def apply(basedir: String): FindNodeModuleConfig = {
      val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindNodeModuleConfig]
    }
    
    extension [Self <: FindNodeModuleConfig](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setModuleDirectory(value: js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setResolver(value: String): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverNull: Self = StObject.set(x, "resolver", null)
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setThrowIfNotFound(value: Boolean): Self = StObject.set(x, "throwIfNotFound", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNotFoundUndefined: Self = StObject.set(x, "throwIfNotFound", js.undefined)
    }
  }
  
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[JSONValue]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  type JSONValue = String | Double | Boolean | JSONObject | js.Array[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestResolve.mod.ResolverSyncObject
    - typings.jestResolve.mod.ResolverAsyncObject
  */
  trait JestResolver extends StObject
  object JestResolver {
    
    inline def ResolverAsyncObject(async: (/* path */ String, /* options */ ResolverOptions) => js.Promise[String]): typings.jestResolve.mod.ResolverAsyncObject = {
      val __obj = js.Dynamic.literal(async = js.Any.fromFunction2(async))
      __obj.asInstanceOf[typings.jestResolve.mod.ResolverAsyncObject]
    }
    
    inline def ResolverSyncObject(sync: (/* path */ String, /* options */ ResolverOptions) => String): typings.jestResolve.mod.ResolverSyncObject = {
      val __obj = js.Dynamic.literal(sync = js.Any.fromFunction2(sync))
      __obj.asInstanceOf[typings.jestResolve.mod.ResolverSyncObject]
    }
  }
  
  trait ModuleNameMapperConfig extends StObject {
    
    var moduleName: String | js.Array[String]
    
    var regex: js.RegExp
  }
  object ModuleNameMapperConfig {
    
    inline def apply(moduleName: String | js.Array[String], regex: js.RegExp): ModuleNameMapperConfig = {
      val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleNameMapperConfig]
    }
    
    extension [Self <: ModuleNameMapperConfig](x: Self) {
      
      inline def setModuleName(value: String | js.Array[String]): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setModuleNameVarargs(value: String*): Self = StObject.set(x, "moduleName", js.Array(value*))
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleNotFoundError
    extends StObject
       with Error {
    
    /* private */ var _originalMessage: Any
    
    def buildMessage(rootDir: String): Unit
    
    var code: String
    
    var hint: js.UndefOr[String] = js.undefined
    
    var moduleName: js.UndefOr[String] = js.undefined
    
    var requireStack: js.UndefOr[js.Array[String]] = js.undefined
    
    var siblingWithSimilarExtensionFound: js.UndefOr[Boolean] = js.undefined
  }
  object ModuleNotFoundError {
    
    inline def apply(_originalMessage: Any, buildMessage: String => Unit, code: String, message: String, name: String): ModuleNotFoundError = {
      val __obj = js.Dynamic.literal(_originalMessage = _originalMessage.asInstanceOf[js.Any], buildMessage = js.Any.fromFunction1(buildMessage), code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleNotFoundError]
    }
    
    extension [Self <: ModuleNotFoundError](x: Self) {
      
      inline def setBuildMessage(value: String => Unit): Self = StObject.set(x, "buildMessage", js.Any.fromFunction1(value))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
      
      inline def setRequireStack(value: js.Array[String]): Self = StObject.set(x, "requireStack", value.asInstanceOf[js.Any])
      
      inline def setRequireStackUndefined: Self = StObject.set(x, "requireStack", js.undefined)
      
      inline def setRequireStackVarargs(value: String*): Self = StObject.set(x, "requireStack", js.Array(value*))
      
      inline def setSiblingWithSimilarExtensionFound(value: Boolean): Self = StObject.set(x, "siblingWithSimilarExtensionFound", value.asInstanceOf[js.Any])
      
      inline def setSiblingWithSimilarExtensionFoundUndefined: Self = StObject.set(x, "siblingWithSimilarExtensionFound", js.undefined)
      
      inline def set_originalMessage(value: Any): Self = StObject.set(x, "_originalMessage", value.asInstanceOf[js.Any])
    }
  }
  
  type PackageFilter = js.Function3[/* pkg */ PackageJSON, /* file */ String, /* dir */ String, PackageJSON]
  
  type PackageJSON = JSONObject
  
  type PathFilter = js.Function3[/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String, String]
  
  trait ResolveModuleConfig extends StObject {
    
    var conditions: js.UndefOr[js.Array[String]] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
  }
  object ResolveModuleConfig {
    
    inline def apply(): ResolveModuleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveModuleConfig]
    }
    
    extension [Self <: ResolveModuleConfig](x: Self) {
      
      inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setSkipNodeResolution(value: Boolean): Self = StObject.set(x, "skipNodeResolution", value.asInstanceOf[js.Any])
      
      inline def setSkipNodeResolutionUndefined: Self = StObject.set(x, "skipNodeResolution", js.undefined)
    }
  }
  
  @js.native
  trait Resolver extends StObject {
    
    /* private */ var _getAbsolutePath: Any = js.native
    
    /* private */ var _getAbsolutePathAsync: Any = js.native
    
    /**
      * _getHasteModulePath attempts to return the path to a haste module.
      */
    /* private */ var _getHasteModulePath: Any = js.native
    
    /* private */ var _getMapModuleName: Any = js.native
    
    /* private */ var _getMockPath: Any = js.native
    
    /* private */ var _getMockPathAsync: Any = js.native
    
    /* private */ var _getModuleType: Any = js.native
    
    /* private */ var _getVirtualMockPath: Any = js.native
    
    /* private */ var _getVirtualMockPathAsync: Any = js.native
    
    /* private */ var _isAliasModule: Any = js.native
    
    /* private */ var _isModuleResolved: Any = js.native
    
    /* private */ var _isModuleResolvedAsync: Any = js.native
    
    /* private */ val _moduleIDCache: Any = js.native
    
    /* private */ val _moduleMap: Any = js.native
    
    /* private */ val _moduleNameCache: Any = js.native
    
    /* private */ val _modulePathCache: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /**
      * _prepareForResolution is shared between the sync and async module resolution
      * methods, to try to keep them as DRY as possible.
      */
    /* private */ var _prepareForResolution: Any = js.native
    
    /* private */ val _supportsNativePlatform: Any = js.native
    
    /* private */ var _throwModNotFoundError: Any = js.native
    
    def getMockModule(from: String, name: String): String | Null = js.native
    
    def getMockModuleAsync(from: String, name: String): js.Promise[String | Null] = js.native
    
    def getModule(name: String): String | Null = js.native
    
    def getModuleID(virtualMocks: Map[String, Boolean], from: String): String = js.native
    def getModuleID(virtualMocks: Map[String, Boolean], from: String, moduleName: String): String = js.native
    def getModuleID(virtualMocks: Map[String, Boolean], from: String, moduleName: String, options: ResolveModuleConfig): String = js.native
    def getModuleID(virtualMocks: Map[String, Boolean], from: String, moduleName: Unit, options: ResolveModuleConfig): String = js.native
    
    def getModuleIDAsync(virtualMocks: Map[String, Boolean], from: String): js.Promise[String] = js.native
    def getModuleIDAsync(virtualMocks: Map[String, Boolean], from: String, moduleName: String): js.Promise[String] = js.native
    def getModuleIDAsync(virtualMocks: Map[String, Boolean], from: String, moduleName: String, options: ResolveModuleConfig): js.Promise[String] = js.native
    def getModuleIDAsync(virtualMocks: Map[String, Boolean], from: String, moduleName: Unit, options: ResolveModuleConfig): js.Promise[String] = js.native
    
    def getModulePath(from: String, moduleName: String): String = js.native
    
    def getModulePaths(from: String): js.Array[String] = js.native
    
    def getPackage(name: String): String | Null = js.native
    
    def isCoreModule(moduleName: String): Boolean = js.native
    
    def resolveModule(from: String, moduleName: String): String = js.native
    def resolveModule(from: String, moduleName: String, options: ResolveModuleConfig): String = js.native
    
    def resolveModuleAsync(from: String, moduleName: String): js.Promise[String] = js.native
    def resolveModuleAsync(from: String, moduleName: String, options: ResolveModuleConfig): js.Promise[String] = js.native
    
    def resolveModuleFromDirIfExists(dirname: String, moduleName: String): String | Null = js.native
    def resolveModuleFromDirIfExists(dirname: String, moduleName: String, options: ResolveModuleConfig): String | Null = js.native
    
    def resolveModuleFromDirIfExistsAsync(dirname: String, moduleName: String): js.Promise[String | Null] = js.native
    def resolveModuleFromDirIfExistsAsync(dirname: String, moduleName: String, options: ResolveModuleConfig): js.Promise[String | Null] = js.native
    
    def resolveStubModuleName(from: String, moduleName: String): String | Null = js.native
    
    def resolveStubModuleNameAsync(from: String, moduleName: String): js.Promise[String | Null] = js.native
  }
  
  trait ResolverAsyncObject
    extends StObject
       with JestResolver {
    
    var async: AsyncResolver
    
    var sync: js.UndefOr[SyncResolver] = js.undefined
  }
  object ResolverAsyncObject {
    
    inline def apply(async: (/* path */ String, /* options */ ResolverOptions) => js.Promise[String]): ResolverAsyncObject = {
      val __obj = js.Dynamic.literal(async = js.Any.fromFunction2(async))
      __obj.asInstanceOf[ResolverAsyncObject]
    }
    
    extension [Self <: ResolverAsyncObject](x: Self) {
      
      inline def setAsync(value: (/* path */ String, /* options */ ResolverOptions) => js.Promise[String]): Self = StObject.set(x, "async", js.Any.fromFunction2(value))
      
      inline def setSync(value: (/* path */ String, /* options */ ResolverOptions) => String): Self = StObject.set(x, "sync", js.Any.fromFunction2(value))
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  trait ResolverConfig extends StObject {
    
    var defaultPlatform: js.UndefOr[String | Null] = js.undefined
    
    var extensions: js.Array[String]
    
    var hasCoreModules: Boolean
    
    var moduleDirectories: js.Array[String]
    
    var moduleNameMapper: js.UndefOr[js.Array[ModuleNameMapperConfig] | Null] = js.undefined
    
    var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var platforms: js.UndefOr[js.Array[String]] = js.undefined
    
    var resolver: js.UndefOr[String | Null] = js.undefined
    
    var rootDir: String
  }
  object ResolverConfig {
    
    inline def apply(
      extensions: js.Array[String],
      hasCoreModules: Boolean,
      moduleDirectories: js.Array[String],
      rootDir: String
    ): ResolverConfig = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], hasCoreModules = hasCoreModules.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverConfig]
    }
    
    extension [Self <: ResolverConfig](x: Self) {
      
      inline def setDefaultPlatform(value: String): Self = StObject.set(x, "defaultPlatform", value.asInstanceOf[js.Any])
      
      inline def setDefaultPlatformNull: Self = StObject.set(x, "defaultPlatform", null)
      
      inline def setDefaultPlatformUndefined: Self = StObject.set(x, "defaultPlatform", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setHasCoreModules(value: Boolean): Self = StObject.set(x, "hasCoreModules", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value*))
      
      inline def setModuleNameMapper(value: js.Array[ModuleNameMapperConfig]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
      
      inline def setModuleNameMapperNull: Self = StObject.set(x, "moduleNameMapper", null)
      
      inline def setModuleNameMapperUndefined: Self = StObject.set(x, "moduleNameMapper", js.undefined)
      
      inline def setModuleNameMapperVarargs(value: ModuleNameMapperConfig*): Self = StObject.set(x, "moduleNameMapper", js.Array(value*))
      
      inline def setModulePaths(value: js.Array[String]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
      
      inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
      
      inline def setModulePathsVarargs(value: String*): Self = StObject.set(x, "modulePaths", js.Array(value*))
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setResolver(value: String): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverNull: Self = StObject.set(x, "resolver", null)
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverOptions extends StObject {
    
    /** Directory to begin resolving from. */
    var basedir: String
    
    /** List of export conditions. */
    var conditions: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Instance of default resolver. */
    var defaultResolver: SyncResolver
    
    /** List of file extensions to search in order. */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * List of directory names to be looked up for modules recursively.
      *
      * @defaultValue
      * The default is `['node_modules']`.
      */
    var moduleDirectory: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Allows transforming parsed `package.json` contents. */
    var packageFilter: js.UndefOr[PackageFilter] = js.undefined
    
    /** Allows transforms a path within a package. */
    var pathFilter: js.UndefOr[PathFilter] = js.undefined
    
    /**
      * List of `require.paths` to use if nothing is found in `node_modules`.
      *
      * @defaultValue
      * The default is `undefined`.
      */
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Current root directory. */
    var rootDir: js.UndefOr[String] = js.undefined
  }
  object ResolverOptions {
    
    inline def apply(basedir: String, defaultResolver: (/* path */ String, /* options */ ResolverOptions) => String): ResolverOptions = {
      val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], defaultResolver = js.Any.fromFunction2(defaultResolver))
      __obj.asInstanceOf[ResolverOptions]
    }
    
    extension [Self <: ResolverOptions](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setDefaultResolver(value: (/* path */ String, /* options */ ResolverOptions) => String): Self = StObject.set(x, "defaultResolver", js.Any.fromFunction2(value))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setModuleDirectory(value: js.Array[String]): Self = StObject.set(x, "moduleDirectory", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoryUndefined: Self = StObject.set(x, "moduleDirectory", js.undefined)
      
      inline def setModuleDirectoryVarargs(value: String*): Self = StObject.set(x, "moduleDirectory", js.Array(value*))
      
      inline def setPackageFilter(value: (/* pkg */ PackageJSON, /* file */ String, /* dir */ String) => PackageJSON): Self = StObject.set(x, "packageFilter", js.Any.fromFunction3(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPathFilter(value: (/* pkg */ PackageJSON, /* path */ String, /* relativePath */ String) => String): Self = StObject.set(x, "pathFilter", js.Any.fromFunction3(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    }
  }
  
  trait ResolverSyncObject
    extends StObject
       with JestResolver {
    
    var async: js.UndefOr[AsyncResolver] = js.undefined
    
    var sync: SyncResolver
  }
  object ResolverSyncObject {
    
    inline def apply(sync: (/* path */ String, /* options */ ResolverOptions) => String): ResolverSyncObject = {
      val __obj = js.Dynamic.literal(sync = js.Any.fromFunction2(sync))
      __obj.asInstanceOf[ResolverSyncObject]
    }
    
    extension [Self <: ResolverSyncObject](x: Self) {
      
      inline def setAsync(value: (/* path */ String, /* options */ ResolverOptions) => js.Promise[String]): Self = StObject.set(x, "async", js.Any.fromFunction2(value))
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setSync(value: (/* path */ String, /* options */ ResolverOptions) => String): Self = StObject.set(x, "sync", js.Any.fromFunction2(value))
    }
  }
  
  type SyncResolver = js.Function2[/* path */ String, /* options */ ResolverOptions, String]
}
