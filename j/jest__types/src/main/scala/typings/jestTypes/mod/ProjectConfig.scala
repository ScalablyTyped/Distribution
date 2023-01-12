package typings.jestTypes.mod

import typings.jestSchemas.mod.SnapshotFormat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectConfig extends StObject {
  
  var automock: Boolean
  
  var cache: Boolean
  
  var cacheDirectory: String
  
  var clearMocks: Boolean
  
  var coveragePathIgnorePatterns: js.Array[String]
  
  var cwd: String
  
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  
  var detectLeaks: Boolean
  
  var detectOpenHandles: Boolean
  
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  var errorOnDeprecated: Boolean
  
  var extensionsToTreatAsEsm: js.Array[String]
  
  var fakeTimers: FakeTimers
  
  var filter: js.UndefOr[String] = js.undefined
  
  var forceCoverageMatch: js.Array[String]
  
  var globalSetup: js.UndefOr[String] = js.undefined
  
  var globalTeardown: js.UndefOr[String] = js.undefined
  
  var globals: ConfigGlobals
  
  var haste: HasteConfig
  
  var id: String
  
  var injectGlobals: Boolean
  
  var moduleDirectories: js.Array[String]
  
  var moduleFileExtensions: js.Array[String]
  
  var moduleNameMapper: js.Array[js.Tuple2[String, String]]
  
  var modulePathIgnorePatterns: js.Array[String]
  
  var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var preset: js.UndefOr[String] = js.undefined
  
  var prettierPath: String
  
  var resetMocks: Boolean
  
  var resetModules: Boolean
  
  var resolver: js.UndefOr[String] = js.undefined
  
  var restoreMocks: Boolean
  
  var rootDir: String
  
  var roots: js.Array[String]
  
  var runner: String
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var sandboxInjectedGlobals: js.Array[/* keyof / * globalThis * / any */ String]
  
  var setupFiles: js.Array[String]
  
  var setupFilesAfterEnv: js.Array[String]
  
  var skipFilter: Boolean
  
  var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
  
  var slowTestThreshold: Double
  
  var snapshotFormat: SnapshotFormat
  
  var snapshotResolver: js.UndefOr[String] = js.undefined
  
  var snapshotSerializers: js.Array[String]
  
  var testEnvironment: String
  
  var testEnvironmentOptions: Record[String, Any]
  
  var testLocationInResults: Boolean
  
  var testMatch: js.Array[String]
  
  var testPathIgnorePatterns: js.Array[String]
  
  var testRegex: js.Array[String | js.RegExp]
  
  var testRunner: String
  
  var transform: js.Array[js.Tuple3[String, String, Record[String, Any]]]
  
  var transformIgnorePatterns: js.Array[String]
  
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var watchPathIgnorePatterns: js.Array[String]
  
  var workerIdleMemoryLimit: js.UndefOr[Double] = js.undefined
}
object ProjectConfig {
  
  inline def apply(
    automock: Boolean,
    cache: Boolean,
    cacheDirectory: String,
    clearMocks: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    cwd: String,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    extensionsToTreatAsEsm: js.Array[String],
    fakeTimers: FakeTimers,
    forceCoverageMatch: js.Array[String],
    globals: ConfigGlobals,
    haste: HasteConfig,
    id: String,
    injectGlobals: Boolean,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleNameMapper: js.Array[js.Tuple2[String, String]],
    modulePathIgnorePatterns: js.Array[String],
    prettierPath: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    rootDir: String,
    roots: js.Array[String],
    runner: String,
    sandboxInjectedGlobals: js.Array[/* keyof / * globalThis * / any */ String],
    setupFiles: js.Array[String],
    setupFilesAfterEnv: js.Array[String],
    skipFilter: Boolean,
    slowTestThreshold: Double,
    snapshotFormat: SnapshotFormat,
    snapshotSerializers: js.Array[String],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, Any],
    testLocationInResults: Boolean,
    testMatch: js.Array[String],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String | js.RegExp],
    testRunner: String,
    transform: js.Array[js.Tuple3[String, String, Record[String, Any]]],
    transformIgnorePatterns: js.Array[String],
    watchPathIgnorePatterns: js.Array[String]
  ): ProjectConfig = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], extensionsToTreatAsEsm = extensionsToTreatAsEsm.asInstanceOf[js.Any], fakeTimers = fakeTimers.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], injectGlobals = injectGlobals.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], sandboxInjectedGlobals = sandboxInjectedGlobals.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], snapshotFormat = snapshotFormat.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectConfig] (val x: Self) extends AnyVal {
    
    inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value*))
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
    
    inline def setDetectLeaks(value: Boolean): Self = StObject.set(x, "detectLeaks", value.asInstanceOf[js.Any])
    
    inline def setDetectOpenHandles(value: Boolean): Self = StObject.set(x, "detectOpenHandles", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
    
    inline def setExtensionsToTreatAsEsm(value: js.Array[String]): Self = StObject.set(x, "extensionsToTreatAsEsm", value.asInstanceOf[js.Any])
    
    inline def setExtensionsToTreatAsEsmVarargs(value: String*): Self = StObject.set(x, "extensionsToTreatAsEsm", js.Array(value*))
    
    inline def setFakeTimers(value: FakeTimers): Self = StObject.set(x, "fakeTimers", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setForceCoverageMatch(value: js.Array[String]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
    
    inline def setForceCoverageMatchVarargs(value: String*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value*))
    
    inline def setGlobalSetup(value: String): Self = StObject.set(x, "globalSetup", value.asInstanceOf[js.Any])
    
    inline def setGlobalSetupUndefined: Self = StObject.set(x, "globalSetup", js.undefined)
    
    inline def setGlobalTeardown(value: String): Self = StObject.set(x, "globalTeardown", value.asInstanceOf[js.Any])
    
    inline def setGlobalTeardownUndefined: Self = StObject.set(x, "globalTeardown", js.undefined)
    
    inline def setGlobals(value: ConfigGlobals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setHaste(value: HasteConfig): Self = StObject.set(x, "haste", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInjectGlobals(value: Boolean): Self = StObject.set(x, "injectGlobals", value.asInstanceOf[js.Any])
    
    inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
    
    inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value*))
    
    inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value*))
    
    inline def setModuleNameMapper(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
    
    inline def setModuleNameMapperVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "moduleNameMapper", js.Array(value*))
    
    inline def setModulePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setModulePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value*))
    
    inline def setModulePaths(value: js.Array[String]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
    
    inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
    
    inline def setModulePathsVarargs(value: String*): Self = StObject.set(x, "modulePaths", js.Array(value*))
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
    
    inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
    
    inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
    
    inline def setResolver(value: String): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    inline def setRestoreMocks(value: Boolean): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
    
    inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSandboxInjectedGlobals(value: js.Array[/* keyof / * globalThis * / any */ String]): Self = StObject.set(x, "sandboxInjectedGlobals", value.asInstanceOf[js.Any])
    
    inline def setSandboxInjectedGlobalsVarargs(value: (/* keyof / * globalThis * / any */ String)*): Self = StObject.set(x, "sandboxInjectedGlobals", js.Array(value*))
    
    inline def setSetupFiles(value: js.Array[String]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnv(value: js.Array[String]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnvVarargs(value: String*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value*))
    
    inline def setSetupFilesVarargs(value: String*): Self = StObject.set(x, "setupFiles", js.Array(value*))
    
    inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
    
    inline def setSkipNodeResolution(value: Boolean): Self = StObject.set(x, "skipNodeResolution", value.asInstanceOf[js.Any])
    
    inline def setSkipNodeResolutionUndefined: Self = StObject.set(x, "skipNodeResolution", js.undefined)
    
    inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
    
    inline def setSnapshotFormat(value: SnapshotFormat): Self = StObject.set(x, "snapshotFormat", value.asInstanceOf[js.Any])
    
    inline def setSnapshotResolver(value: String): Self = StObject.set(x, "snapshotResolver", value.asInstanceOf[js.Any])
    
    inline def setSnapshotResolverUndefined: Self = StObject.set(x, "snapshotResolver", js.undefined)
    
    inline def setSnapshotSerializers(value: js.Array[String]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSerializersVarargs(value: String*): Self = StObject.set(x, "snapshotSerializers", js.Array(value*))
    
    inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTestEnvironmentOptions(value: Record[String, Any]): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
    
    inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
    
    inline def setTestMatch(value: js.Array[String]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
    
    inline def setTestMatchVarargs(value: String*): Self = StObject.set(x, "testMatch", js.Array(value*))
    
    inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value*))
    
    inline def setTestRegex(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
    
    inline def setTestRegexVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "testRegex", js.Array(value*))
    
    inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: js.Array[js.Tuple3[String, String, Record[String, Any]]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value*))
    
    inline def setTransformVarargs(value: (js.Tuple3[String, String, Record[String, Any]])*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setUnmockedModulePathPatterns(value: js.Array[String]): Self = StObject.set(x, "unmockedModulePathPatterns", value.asInstanceOf[js.Any])
    
    inline def setUnmockedModulePathPatternsUndefined: Self = StObject.set(x, "unmockedModulePathPatterns", js.undefined)
    
    inline def setUnmockedModulePathPatternsVarargs(value: String*): Self = StObject.set(x, "unmockedModulePathPatterns", js.Array(value*))
    
    inline def setWatchPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value*))
    
    inline def setWorkerIdleMemoryLimit(value: Double): Self = StObject.set(x, "workerIdleMemoryLimit", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdleMemoryLimitUndefined: Self = StObject.set(x, "workerIdleMemoryLimit", js.undefined)
  }
}
