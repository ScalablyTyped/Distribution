package typings.jestTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jestSchemas.mod.SnapshotFormat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jest/types.@jest/types.InitialOptions & {  cwd :string | undefined}, keyof @jest/types.@jest/types.ProjectConfig> */
trait InitialProjectOptions extends StObject {
  
  var automock: js.UndefOr[Boolean] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var cacheDirectory: js.UndefOr[String] = js.undefined
  
  var clearMocks: js.UndefOr[Boolean] = js.undefined
  
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  
  var detectLeaks: js.UndefOr[Boolean] = js.undefined
  
  var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
  
  var displayName: js.UndefOr[String | DisplayName] = js.undefined
  
  var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
  
  var extensionsToTreatAsEsm: js.UndefOr[js.Array[String]] = js.undefined
  
  var fakeTimers: js.UndefOr[FakeTimers] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var forceCoverageMatch: js.UndefOr[js.Array[String]] = js.undefined
  
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  
  var globals: js.UndefOr[ConfigGlobals] = js.undefined
  
  var haste: js.UndefOr[HasteConfig] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var injectGlobals: js.UndefOr[Boolean] = js.undefined
  
  var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
  
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var moduleNameMapper: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  
  var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var openHandlesTimeout: js.UndefOr[Double] = js.undefined
  
  var preset: js.UndefOr[String | Null] = js.undefined
  
  var prettierPath: js.UndefOr[String | Null] = js.undefined
  
  var resetMocks: js.UndefOr[Boolean] = js.undefined
  
  var resetModules: js.UndefOr[Boolean] = js.undefined
  
  var resolver: js.UndefOr[String | Null] = js.undefined
  
  var restoreMocks: js.UndefOr[Boolean] = js.undefined
  
  var rootDir: js.UndefOr[String] = js.undefined
  
  var roots: js.UndefOr[js.Array[String]] = js.undefined
  
  var runner: js.UndefOr[String] = js.undefined
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var sandboxInjectedGlobals: js.UndefOr[js.Array[String]] = js.undefined
  
  var setupFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var setupFilesAfterEnv: js.UndefOr[js.Array[String]] = js.undefined
  
  var skipFilter: js.UndefOr[Boolean] = js.undefined
  
  var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
  
  var slowTestThreshold: js.UndefOr[Double] = js.undefined
  
  var snapshotFormat: js.UndefOr[SnapshotFormat] = js.undefined
  
  var snapshotResolver: js.UndefOr[String] = js.undefined
  
  var snapshotSerializers: js.UndefOr[js.Array[String]] = js.undefined
  
  var testEnvironment: js.UndefOr[String] = js.undefined
  
  var testEnvironmentOptions: js.UndefOr[Record[String, Any]] = js.undefined
  
  var testLocationInResults: js.UndefOr[Boolean] = js.undefined
  
  var testMatch: js.UndefOr[js.Array[String]] = js.undefined
  
  var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var testRegex: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var testRunner: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[StringDictionary[String | TransformerConfig]] = js.undefined
  
  var transformIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var workerIdleMemoryLimit: js.UndefOr[Double | String] = js.undefined
}
object InitialProjectOptions {
  
  inline def apply(): InitialProjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialProjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialProjectOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
    
    inline def setAutomockUndefined: Self = StObject.set(x, "automock", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
    
    inline def setClearMocksUndefined: Self = StObject.set(x, "clearMocks", js.undefined)
    
    inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatternsUndefined: Self = StObject.set(x, "coveragePathIgnorePatterns", js.undefined)
    
    inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value*))
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
    
    inline def setDetectLeaks(value: Boolean): Self = StObject.set(x, "detectLeaks", value.asInstanceOf[js.Any])
    
    inline def setDetectLeaksUndefined: Self = StObject.set(x, "detectLeaks", js.undefined)
    
    inline def setDetectOpenHandles(value: Boolean): Self = StObject.set(x, "detectOpenHandles", value.asInstanceOf[js.Any])
    
    inline def setDetectOpenHandlesUndefined: Self = StObject.set(x, "detectOpenHandles", js.undefined)
    
    inline def setDisplayName(value: String | DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
    
    inline def setErrorOnDeprecatedUndefined: Self = StObject.set(x, "errorOnDeprecated", js.undefined)
    
    inline def setExtensionsToTreatAsEsm(value: js.Array[String]): Self = StObject.set(x, "extensionsToTreatAsEsm", value.asInstanceOf[js.Any])
    
    inline def setExtensionsToTreatAsEsmUndefined: Self = StObject.set(x, "extensionsToTreatAsEsm", js.undefined)
    
    inline def setExtensionsToTreatAsEsmVarargs(value: String*): Self = StObject.set(x, "extensionsToTreatAsEsm", js.Array(value*))
    
    inline def setFakeTimers(value: FakeTimers): Self = StObject.set(x, "fakeTimers", value.asInstanceOf[js.Any])
    
    inline def setFakeTimersUndefined: Self = StObject.set(x, "fakeTimers", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setForceCoverageMatch(value: js.Array[String]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
    
    inline def setForceCoverageMatchUndefined: Self = StObject.set(x, "forceCoverageMatch", js.undefined)
    
    inline def setForceCoverageMatchVarargs(value: String*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value*))
    
    inline def setGlobalSetup(value: String): Self = StObject.set(x, "globalSetup", value.asInstanceOf[js.Any])
    
    inline def setGlobalSetupNull: Self = StObject.set(x, "globalSetup", null)
    
    inline def setGlobalSetupUndefined: Self = StObject.set(x, "globalSetup", js.undefined)
    
    inline def setGlobalTeardown(value: String): Self = StObject.set(x, "globalTeardown", value.asInstanceOf[js.Any])
    
    inline def setGlobalTeardownNull: Self = StObject.set(x, "globalTeardown", null)
    
    inline def setGlobalTeardownUndefined: Self = StObject.set(x, "globalTeardown", js.undefined)
    
    inline def setGlobals(value: ConfigGlobals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setHaste(value: HasteConfig): Self = StObject.set(x, "haste", value.asInstanceOf[js.Any])
    
    inline def setHasteUndefined: Self = StObject.set(x, "haste", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInjectGlobals(value: Boolean): Self = StObject.set(x, "injectGlobals", value.asInstanceOf[js.Any])
    
    inline def setInjectGlobalsUndefined: Self = StObject.set(x, "injectGlobals", js.undefined)
    
    inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
    
    inline def setModuleDirectoriesUndefined: Self = StObject.set(x, "moduleDirectories", js.undefined)
    
    inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value*))
    
    inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setModuleFileExtensionsUndefined: Self = StObject.set(x, "moduleFileExtensions", js.undefined)
    
    inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value*))
    
    inline def setModuleNameMapper(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
    
    inline def setModuleNameMapperUndefined: Self = StObject.set(x, "moduleNameMapper", js.undefined)
    
    inline def setModulePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setModulePathIgnorePatternsUndefined: Self = StObject.set(x, "modulePathIgnorePatterns", js.undefined)
    
    inline def setModulePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value*))
    
    inline def setModulePaths(value: js.Array[String]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
    
    inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
    
    inline def setModulePathsVarargs(value: String*): Self = StObject.set(x, "modulePaths", js.Array(value*))
    
    inline def setOpenHandlesTimeout(value: Double): Self = StObject.set(x, "openHandlesTimeout", value.asInstanceOf[js.Any])
    
    inline def setOpenHandlesTimeoutUndefined: Self = StObject.set(x, "openHandlesTimeout", js.undefined)
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetNull: Self = StObject.set(x, "preset", null)
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
    
    inline def setPrettierPathNull: Self = StObject.set(x, "prettierPath", null)
    
    inline def setPrettierPathUndefined: Self = StObject.set(x, "prettierPath", js.undefined)
    
    inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
    
    inline def setResetMocksUndefined: Self = StObject.set(x, "resetMocks", js.undefined)
    
    inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
    
    inline def setResetModulesUndefined: Self = StObject.set(x, "resetModules", js.undefined)
    
    inline def setResolver(value: String): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverNull: Self = StObject.set(x, "resolver", null)
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    inline def setRestoreMocks(value: Boolean): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
    
    inline def setRestoreMocksUndefined: Self = StObject.set(x, "restoreMocks", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
    
    inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    
    inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSandboxInjectedGlobals(value: js.Array[String]): Self = StObject.set(x, "sandboxInjectedGlobals", value.asInstanceOf[js.Any])
    
    inline def setSandboxInjectedGlobalsUndefined: Self = StObject.set(x, "sandboxInjectedGlobals", js.undefined)
    
    inline def setSandboxInjectedGlobalsVarargs(value: String*): Self = StObject.set(x, "sandboxInjectedGlobals", js.Array(value*))
    
    inline def setSetupFiles(value: js.Array[String]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnv(value: js.Array[String]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnvUndefined: Self = StObject.set(x, "setupFilesAfterEnv", js.undefined)
    
    inline def setSetupFilesAfterEnvVarargs(value: String*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value*))
    
    inline def setSetupFilesUndefined: Self = StObject.set(x, "setupFiles", js.undefined)
    
    inline def setSetupFilesVarargs(value: String*): Self = StObject.set(x, "setupFiles", js.Array(value*))
    
    inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
    
    inline def setSkipFilterUndefined: Self = StObject.set(x, "skipFilter", js.undefined)
    
    inline def setSkipNodeResolution(value: Boolean): Self = StObject.set(x, "skipNodeResolution", value.asInstanceOf[js.Any])
    
    inline def setSkipNodeResolutionUndefined: Self = StObject.set(x, "skipNodeResolution", js.undefined)
    
    inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
    
    inline def setSlowTestThresholdUndefined: Self = StObject.set(x, "slowTestThreshold", js.undefined)
    
    inline def setSnapshotFormat(value: SnapshotFormat): Self = StObject.set(x, "snapshotFormat", value.asInstanceOf[js.Any])
    
    inline def setSnapshotFormatUndefined: Self = StObject.set(x, "snapshotFormat", js.undefined)
    
    inline def setSnapshotResolver(value: String): Self = StObject.set(x, "snapshotResolver", value.asInstanceOf[js.Any])
    
    inline def setSnapshotResolverUndefined: Self = StObject.set(x, "snapshotResolver", js.undefined)
    
    inline def setSnapshotSerializers(value: js.Array[String]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSerializersUndefined: Self = StObject.set(x, "snapshotSerializers", js.undefined)
    
    inline def setSnapshotSerializersVarargs(value: String*): Self = StObject.set(x, "snapshotSerializers", js.Array(value*))
    
    inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTestEnvironmentOptions(value: Record[String, Any]): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
    
    inline def setTestEnvironmentOptionsUndefined: Self = StObject.set(x, "testEnvironmentOptions", js.undefined)
    
    inline def setTestEnvironmentUndefined: Self = StObject.set(x, "testEnvironment", js.undefined)
    
    inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
    
    inline def setTestLocationInResultsUndefined: Self = StObject.set(x, "testLocationInResults", js.undefined)
    
    inline def setTestMatch(value: js.Array[String]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
    
    inline def setTestMatchUndefined: Self = StObject.set(x, "testMatch", js.undefined)
    
    inline def setTestMatchVarargs(value: String*): Self = StObject.set(x, "testMatch", js.Array(value*))
    
    inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTestPathIgnorePatternsUndefined: Self = StObject.set(x, "testPathIgnorePatterns", js.undefined)
    
    inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value*))
    
    inline def setTestRegex(value: String | js.Array[String]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
    
    inline def setTestRegexUndefined: Self = StObject.set(x, "testRegex", js.undefined)
    
    inline def setTestRegexVarargs(value: String*): Self = StObject.set(x, "testRegex", js.Array(value*))
    
    inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    inline def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
    
    inline def setTransform(value: StringDictionary[String | TransformerConfig]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatternsUndefined: Self = StObject.set(x, "transformIgnorePatterns", js.undefined)
    
    inline def setTransformIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value*))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUnmockedModulePathPatterns(value: js.Array[String]): Self = StObject.set(x, "unmockedModulePathPatterns", value.asInstanceOf[js.Any])
    
    inline def setUnmockedModulePathPatternsUndefined: Self = StObject.set(x, "unmockedModulePathPatterns", js.undefined)
    
    inline def setUnmockedModulePathPatternsVarargs(value: String*): Self = StObject.set(x, "unmockedModulePathPatterns", js.Array(value*))
    
    inline def setWatchPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setWatchPathIgnorePatternsUndefined: Self = StObject.set(x, "watchPathIgnorePatterns", js.undefined)
    
    inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value*))
    
    inline def setWorkerIdleMemoryLimit(value: Double | String): Self = StObject.set(x, "workerIdleMemoryLimit", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdleMemoryLimitUndefined: Self = StObject.set(x, "workerIdleMemoryLimit", js.undefined)
  }
}
