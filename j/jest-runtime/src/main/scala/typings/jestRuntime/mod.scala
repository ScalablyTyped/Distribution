package typings.jestRuntime

import typings.jestEnvironment.mod.JestEnvironment
import typings.jestExpect.mod.Inverse
import typings.jestExpect.mod.JestExpect_
import typings.jestExpect.mod.JestMatchers
import typings.jestExpect.mod.PromiseMatchers
import typings.jestHasteMap.mod.IHasteMap
import typings.jestHasteMap.mod.IModuleMap
import typings.jestHasteMap.mod.SerializableModuleMap
import typings.jestRuntime.anon.Console
import typings.jestRuntime.anon.Virtual
import typings.jestSourceMap.mod.SourceMapRegistry
import typings.jestTestResult.mod.TestContext
import typings.jestTestResult.mod.V8CoverageResult
import typings.jestTransform.mod.ScriptTransformer
import typings.jestTransform.mod.ShouldInstrumentOptions
import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import typings.jestTypes.mod.Describe
import typings.jestTypes.mod.DescribeBase
import typings.jestTypes.mod.GlobalConfig
import typings.jestTypes.mod.HookFn
import typings.jestTypes.mod.ItBase
import typings.jestTypes.mod.ItConcurrent
import typings.jestTypes.mod.ProjectConfig
import typings.jestTypes.mod.TestFrameworkGlobals
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-runtime", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Runtime {
    def this(
      config: ProjectConfig,
      environment: JestEnvironment[Any],
      resolver: typings.jestResolve.mod.default,
      transformer: ScriptTransformer,
      cacheFS: Map[String, String],
      coverageOptions: ShouldInstrumentOptions,
      testPath: String
    ) = this()
    def this(
      config: ProjectConfig,
      environment: JestEnvironment[Any],
      resolver: typings.jestResolve.mod.default,
      transformer: ScriptTransformer,
      cacheFS: Map[String, String],
      coverageOptions: ShouldInstrumentOptions,
      testPath: String,
      globalConfig: GlobalConfig
    ) = this()
  }
  object default {
    
    @JSImport("jest-runtime", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createContext(config: ProjectConfig, options: Console): js.Promise[TestContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestContext]]
    
    /* static member */
    inline def createHasteMap(config: ProjectConfig): js.Promise[IHasteMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHasteMap")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasteMap]]
    inline def createHasteMap(config: ProjectConfig, options: HasteMapOptions): js.Promise[IHasteMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHasteMap")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasteMap]]
    
    /* static member */
    inline def createResolver(config: ProjectConfig, moduleMap: IModuleMap[SerializableModuleMap]): typings.jestResolve.mod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolver")(config.asInstanceOf[js.Any], moduleMap.asInstanceOf[js.Any])).asInstanceOf[typings.jestResolve.mod.default]
    
    /* static member */
    inline def getCLIOptions(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("getCLIOptions")().asInstanceOf[scala.Nothing]
    
    /* static member */
    inline def runCLI(): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("runCLI")().asInstanceOf[js.Promise[scala.Nothing]]
    
    /* static member */
    /* was `typeof shouldInstrument` */
    @JSImport("jest-runtime", "default.shouldInstrument")
    @js.native
    def shouldInstrument: js.Function3[
        /* filename */ String, 
        /* options */ ShouldInstrumentOptions, 
        /* config */ ProjectConfig, 
        Boolean
      ] = js.native
    inline def shouldInstrument_=(
      x: js.Function3[
          /* filename */ String, 
          /* options */ ShouldInstrumentOptions, 
          /* config */ ProjectConfig, 
          Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldInstrument")(x.asInstanceOf[js.Any])
  }
  
  trait HasteMapOptions extends StObject {
    
    var console: js.UndefOr[typings.std.Console] = js.undefined
    
    var maxWorkers: Double
    
    var resetCache: Boolean
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var watchman: Boolean
  }
  object HasteMapOptions {
    
    inline def apply(maxWorkers: Double, resetCache: Boolean, watchman: Boolean): HasteMapOptions = {
      val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasteMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasteMapOptions] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: typings.std.Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Required<@jest/transform.@jest/transform.CallerTransformOptions> */
  trait InternalModuleOptions extends StObject {
    
    var isInternalModule: Boolean
    
    var supportsDynamicImport: Boolean
    
    var supportsExportNamespaceFrom: Boolean
    
    var supportsStaticESM: Boolean
    
    var supportsTopLevelAwait: Boolean
  }
  object InternalModuleOptions {
    
    inline def apply(
      isInternalModule: Boolean,
      supportsDynamicImport: Boolean,
      supportsExportNamespaceFrom: Boolean,
      supportsStaticESM: Boolean,
      supportsTopLevelAwait: Boolean
    ): InternalModuleOptions = {
      val __obj = js.Dynamic.literal(isInternalModule = isInternalModule.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalModuleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalModuleOptions] (val x: Self) extends AnyVal {
      
      inline def setIsInternalModule(value: Boolean): Self = StObject.set(x, "isInternalModule", value.asInstanceOf[js.Any])
      
      inline def setSupportsDynamicImport(value: Boolean): Self = StObject.set(x, "supportsDynamicImport", value.asInstanceOf[js.Any])
      
      inline def setSupportsExportNamespaceFrom(value: Boolean): Self = StObject.set(x, "supportsExportNamespaceFrom", value.asInstanceOf[js.Any])
      
      inline def setSupportsStaticESM(value: Boolean): Self = StObject.set(x, "supportsStaticESM", value.asInstanceOf[js.Any])
      
      inline def setSupportsTopLevelAwait(value: Boolean): Self = StObject.set(x, "supportsTopLevelAwait", value.asInstanceOf[js.Any])
    }
  }
  
  trait JestGlobals
    extends StObject
       with TestFrameworkGlobals {
    
    def expect[T](actual: T): (JestMatchers[Unit, T]) & (Inverse[JestMatchers[Unit, T]]) & PromiseMatchers[T]
    @JSName("expect")
    var expect_Original: JestExpect_
  }
  object JestGlobals {
    
    inline def apply(
      afterAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      afterEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      describe: Describe,
      expect: JestExpect_,
      fdescribe: DescribeBase,
      fit: ItBaseconcurrentItConcurr,
      it: ItConcurrent,
      test: ItConcurrent,
      xdescribe: DescribeBase,
      xit: ItBase,
      xtest: ItBase
    ): JestGlobals = {
      val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction2(afterAll), afterEach = js.Any.fromFunction2(afterEach), beforeAll = js.Any.fromFunction2(beforeAll), beforeEach = js.Any.fromFunction2(beforeEach), describe = describe.asInstanceOf[js.Any], expect = expect.asInstanceOf[js.Any], fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestGlobals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JestGlobals] (val x: Self) extends AnyVal {
      
      inline def setExpect(value: JestExpect_): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Runtime extends StObject {
    
    /* private */ val _cacheFS: Any = js.native
    
    /* private */ val _cacheFSBuffer: Any = js.native
    
    /* private */ val _cjsNamedExports: Any = js.native
    
    /* private */ val _config: Any = js.native
    
    /* private */ val _coverageOptions: Any = js.native
    
    /* private */ var _createJestObjectFor: Any = js.native
    
    /* private */ var _createRequireImplementation: Any = js.native
    
    /* private */ var _currentlyExecutingModulePath: Any = js.native
    
    /* private */ val _environment: Any = js.native
    
    /* private */ val _esmModuleLinkingMap: Any = js.native
    
    /* private */ val _esmoduleRegistry: Any = js.native
    
    /* private */ var _execModule: Any = js.native
    
    /* private */ val _explicitShouldMock: Any = js.native
    
    /* private */ val _explicitShouldMockModule: Any = js.native
    
    /* private */ var _fakeTimersImplementation: Any = js.native
    
    /* private */ val _fileTransforms: Any = js.native
    
    /* private */ val _fileTransformsMutex: Any = js.native
    
    /* private */ var _generateMock: Any = js.native
    
    /* private */ var _getFullTransformationOptions: Any = js.native
    
    /* private */ var _getMockedNativeModule: Any = js.native
    
    /* private */ val _globalConfig: Any = js.native
    
    /* private */ var _importCoreModule: Any = js.native
    
    /* private */ var _importWasmModule: Any = js.native
    
    /* private */ val _internalModuleRegistry: Any = js.native
    
    /* private */ var _isCurrentlyExecutingManualMock: Any = js.native
    
    /* private */ var _isolatedMockRegistry: Any = js.native
    
    /* private */ var _isolatedModuleRegistry: Any = js.native
    
    /* private */ var _loadModule: Any = js.native
    
    /* private */ var _logFormattedReferenceError: Any = js.native
    
    /* private */ var _mainModule: Any = js.native
    
    /* private */ val _mockFactories: Any = js.native
    
    /* private */ val _mockMetaDataCache: Any = js.native
    
    /* private */ var _mockRegistry: Any = js.native
    
    /* private */ var _moduleImplementation: Any = js.native
    
    /* private */ val _moduleMockFactories: Any = js.native
    
    /* private */ val _moduleMockRegistry: Any = js.native
    
    /* private */ val _moduleMocker: Any = js.native
    
    /* private */ var _moduleRegistry: Any = js.native
    
    /* private */ var _requireCoreModule: Any = js.native
    
    /* private */ var _requireResolve: Any = js.native
    
    /* private */ var _requireResolvePaths: Any = js.native
    
    /* private */ var _resolveCjsModule: Any = js.native
    
    /* private */ var _resolveModule: Any = js.native
    
    /* private */ val _resolver: Any = js.native
    
    /* private */ val _scriptTransformer: Any = js.native
    
    /* private */ var _shouldAutoMock: Any = js.native
    
    /* private */ var _shouldMockCjs: Any = js.native
    
    /* private */ var _shouldMockModule: Any = js.native
    
    /* private */ val _shouldMockModuleCache: Any = js.native
    
    /* private */ val _shouldUnmockTransitiveDependenciesCache: Any = js.native
    
    /* private */ val _sourceMapRegistry: Any = js.native
    
    /* private */ val _testPath: Any = js.native
    
    /* private */ val _transitiveShouldMock: Any = js.native
    
    /* private */ var _unmockList: Any = js.native
    
    /* private */ var _v8CoverageInstrumenter: Any = js.native
    
    /* private */ var _v8CoverageResult: Any = js.native
    
    /* private */ var _v8CoverageSources: Any = js.native
    
    /* private */ val _virtualMocks: Any = js.native
    
    /* private */ val _virtualModuleMocks: Any = js.native
    
    /* private */ val cjsConditions: Any = js.native
    
    def clearAllMocks(): Unit = js.native
    
    def collectV8Coverage(): js.Promise[Unit] = js.native
    
    /* private */ var constructInjectedModuleParameters: Any = js.native
    
    /* private */ var constructModuleWrapperStart: Any = js.native
    
    /* private */ var createScriptFromCode: Any = js.native
    
    /* private */ val esmConditions: Any = js.native
    
    def getAllCoverageInfoCopy(): /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.JestEnvironment<unknown>['global']['__coverage__'] */ js.Any = js.native
    
    def getAllV8CoverageInfoCopy(): V8CoverageResult = js.native
    
    /* private */ var getExportsOfCjs: Any = js.native
    
    /* private */ var getGlobalsForCjs: Any = js.native
    
    /* private */ var getGlobalsForEsm: Any = js.native
    
    /* private */ var getGlobalsFromEnvironment: Any = js.native
    
    def getSourceMaps(): SourceMapRegistry = js.native
    
    /* private */ var handleExecutionError: Any = js.native
    
    /* private */ var importMock: Any = js.native
    
    /* private */ var isTornDown: Any = js.native
    
    def isolateModules(fn: js.Function0[Unit]): Unit = js.native
    
    /* private */ var jestGlobals: Any = js.native
    
    /* private */ val jestObjectCaches: Any = js.native
    
    /* private */ var linkAndEvaluateModule: Any = js.native
    
    /* private */ var loadCjsAsEsm: Any = js.native
    
    /* private */ var loadEsmModule: Any = js.native
    
    /* private */ var readFile: Any = js.native
    
    /* private */ var readFileBuffer: Any = js.native
    
    def requireActual[T](from: String, moduleName: String): T = js.native
    
    def requireInternalModule[T](from: String): T = js.native
    def requireInternalModule[T](from: String, to: String): T = js.native
    
    def requireMock[T](from: String, moduleName: String): T = js.native
    
    def requireModule[T](from: String): T = js.native
    def requireModule[T](from: String, moduleName: String): T = js.native
    def requireModule[T](from: String, moduleName: String, options: Unit, isRequireActual: Boolean): T = js.native
    def requireModule[T](from: String, moduleName: String, options: InternalModuleOptions): T = js.native
    def requireModule[T](from: String, moduleName: String, options: InternalModuleOptions, isRequireActual: Boolean): T = js.native
    def requireModule[T](from: String, moduleName: Unit, options: Unit, isRequireActual: Boolean): T = js.native
    def requireModule[T](from: String, moduleName: Unit, options: InternalModuleOptions): T = js.native
    def requireModule[T](from: String, moduleName: Unit, options: InternalModuleOptions, isRequireActual: Boolean): T = js.native
    
    def requireModuleOrMock[T](from: String, moduleName: String): T = js.native
    
    def resetAllMocks(): Unit = js.native
    
    def resetModules(): Unit = js.native
    
    /* private */ var resolveModule: Any = js.native
    
    def restoreAllMocks(): Unit = js.native
    
    def setGlobalsForRuntime(globals: JestGlobals): Unit = js.native
    
    def setMock(from: String, moduleName: String, mockFactory: js.Function0[Any]): Unit = js.native
    def setMock(from: String, moduleName: String, mockFactory: js.Function0[Any], options: Virtual): Unit = js.native
    
    /* private */ var setModuleMock: Any = js.native
    
    def stopCollectingV8Coverage(): js.Promise[Unit] = js.native
    
    def teardown(): Unit = js.native
    
    /* private */ var transformFile: Any = js.native
    
    /* private */ var transformFileAsync: Any = js.native
    
    def unstable_importModule(from: String): js.Promise[Any | Unit] = js.native
    def unstable_importModule(from: String, moduleName: String): js.Promise[Any | Unit] = js.native
    
    def unstable_shouldLoadAsEsm(modulePath: String): Boolean = js.native
    
    /* private */ var wrapCodeInModuleWrapper: Any = js.native
  }
}
