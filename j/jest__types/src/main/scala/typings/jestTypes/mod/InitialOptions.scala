package typings.jestTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jestSchemas.mod.SnapshotFormat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  automock :boolean,   bail :boolean | number,   cache :boolean,   cacheDirectory :string,   ci :boolean,   clearMocks :boolean,   changedFilesWithAncestor :boolean,   changedSince :string,   collectCoverage :boolean,   collectCoverageFrom :std.Array<string>,   coverageDirectory :string,   coveragePathIgnorePatterns :std.Array<string>,   coverageProvider :@jest/types.@jest/types.CoverageProvider,   coverageReporters :@jest/types.@jest/types.CoverageReporters,   coverageThreshold :@jest/types.@jest/types.CoverageThreshold,   dependencyExtractor :string,   detectLeaks :boolean,   detectOpenHandles :boolean,   displayName :string | @jest/types.@jest/types.DisplayName,   expand :boolean,   extensionsToTreatAsEsm :std.Array<string>,   fakeTimers :@jest/types.@jest/types.FakeTimers,   filter :string,   findRelatedTests :boolean,   forceCoverageMatch :std.Array<string>,   forceExit :boolean,   json :boolean,   globals :@jest/types.@jest/types.ConfigGlobals,   globalSetup :string | null | undefined,   globalTeardown :string | null | undefined,   haste :@jest/types.@jest/types.HasteConfig,   id :string,   injectGlobals :boolean,   reporters :std.Array<string | @jest/types.@jest/types.ReporterConfig>,   logHeapUsage :boolean,   lastCommit :boolean,   listTests :boolean,   maxConcurrency :number,   maxWorkers :number | string,   moduleDirectories :std.Array<string>,   moduleFileExtensions :std.Array<string>,   moduleNameMapper :{[key: string] : string | std.Array<string>},   modulePathIgnorePatterns :std.Array<string>,   modulePaths :std.Array<string>,   noStackTrace :boolean,   notify :boolean,   notifyMode :string,   onlyChanged :boolean,   onlyFailures :boolean,   outputFile :string,   passWithNoTests :boolean,   preset :string | null | undefined,   prettierPath :string | null | undefined,   projects :std.Array<string | @jest/types.@jest/types.InitialProjectOptions>,   replname :string | null | undefined,   resetMocks :boolean,   resetModules :boolean,   resolver :string | null | undefined,   restoreMocks :boolean,   rootDir :string,   roots :std.Array<string>,   runner :string,   runTestsByPath :boolean,   runtime :string,   sandboxInjectedGlobals :std.Array<string>,   setupFiles :std.Array<string>,   setupFilesAfterEnv :std.Array<string>,   showSeed :boolean,   silent :boolean,   skipFilter :boolean,   skipNodeResolution :boolean,   slowTestThreshold :number,   snapshotResolver :string,   snapshotSerializers :std.Array<string>,   snapshotFormat :@jest/schemas.@jest/schemas.SnapshotFormat,   errorOnDeprecated :boolean,   testEnvironment :string,   testEnvironmentOptions :std.Record<string, unknown>,   testFailureExitCode :string | number,   testLocationInResults :boolean,   testMatch :std.Array<string>,   testNamePattern :string,   testPathIgnorePatterns :std.Array<string>,   testRegex :string | std.Array<string>,   testResultsProcessor :string,   testRunner :string,   testSequencer :string,   testTimeout :number,   transform :{[regex: string] : string | @jest/types.@jest/types.TransformerConfig},   transformIgnorePatterns :std.Array<string>,   watchPathIgnorePatterns :std.Array<string>,   unmockedModulePathPatterns :std.Array<string>,   updateSnapshot :boolean,   useStderr :boolean,   verbose :boolean | undefined,   watch :boolean,   watchAll :boolean,   watchman :boolean,   watchPlugins :std.Array<string | [string, std.Record<string, unknown>]>,   workerIdleMemoryLimit :number | string}> */
trait InitialOptions extends StObject {
  
  var automock: js.UndefOr[Boolean] = js.undefined
  
  var bail: js.UndefOr[Boolean | Double] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var cacheDirectory: js.UndefOr[String] = js.undefined
  
  var changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined
  
  var changedSince: js.UndefOr[String] = js.undefined
  
  var ci: js.UndefOr[Boolean] = js.undefined
  
  var clearMocks: js.UndefOr[Boolean] = js.undefined
  
  var collectCoverage: js.UndefOr[Boolean] = js.undefined
  
  var collectCoverageFrom: js.UndefOr[js.Array[String]] = js.undefined
  
  var coverageDirectory: js.UndefOr[String] = js.undefined
  
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var coverageProvider: js.UndefOr[CoverageProvider] = js.undefined
  
  var coverageReporters: js.UndefOr[CoverageReporters] = js.undefined
  
  var coverageThreshold: js.UndefOr[CoverageThreshold] = js.undefined
  
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  
  var detectLeaks: js.UndefOr[Boolean] = js.undefined
  
  var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
  
  var displayName: js.UndefOr[String | DisplayName] = js.undefined
  
  var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var extensionsToTreatAsEsm: js.UndefOr[js.Array[String]] = js.undefined
  
  var fakeTimers: js.UndefOr[FakeTimers] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var findRelatedTests: js.UndefOr[Boolean] = js.undefined
  
  var forceCoverageMatch: js.UndefOr[js.Array[String]] = js.undefined
  
  var forceExit: js.UndefOr[Boolean] = js.undefined
  
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  
  var globals: js.UndefOr[ConfigGlobals] = js.undefined
  
  var haste: js.UndefOr[HasteConfig] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var injectGlobals: js.UndefOr[Boolean] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
  
  var lastCommit: js.UndefOr[Boolean] = js.undefined
  
  var listTests: js.UndefOr[Boolean] = js.undefined
  
  var logHeapUsage: js.UndefOr[Boolean] = js.undefined
  
  var maxConcurrency: js.UndefOr[Double] = js.undefined
  
  var maxWorkers: js.UndefOr[Double | String] = js.undefined
  
  var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
  
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var moduleNameMapper: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  
  var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var noStackTrace: js.UndefOr[Boolean] = js.undefined
  
  var notifyMode: js.UndefOr[String] = js.undefined
  
  @JSName("notify")
  var notify_FInitialOptions: js.UndefOr[Boolean] = js.undefined
  
  var onlyChanged: js.UndefOr[Boolean] = js.undefined
  
  var onlyFailures: js.UndefOr[Boolean] = js.undefined
  
  var outputFile: js.UndefOr[String] = js.undefined
  
  var passWithNoTests: js.UndefOr[Boolean] = js.undefined
  
  var preset: js.UndefOr[String | Null] = js.undefined
  
  var prettierPath: js.UndefOr[String | Null] = js.undefined
  
  var projects: js.UndefOr[js.Array[String | InitialProjectOptions]] = js.undefined
  
  var replname: js.UndefOr[String | Null] = js.undefined
  
  var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.undefined
  
  var resetMocks: js.UndefOr[Boolean] = js.undefined
  
  var resetModules: js.UndefOr[Boolean] = js.undefined
  
  var resolver: js.UndefOr[String | Null] = js.undefined
  
  var restoreMocks: js.UndefOr[Boolean] = js.undefined
  
  var rootDir: js.UndefOr[String] = js.undefined
  
  var roots: js.UndefOr[js.Array[String]] = js.undefined
  
  var runTestsByPath: js.UndefOr[Boolean] = js.undefined
  
  var runner: js.UndefOr[String] = js.undefined
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var sandboxInjectedGlobals: js.UndefOr[js.Array[String]] = js.undefined
  
  var setupFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var setupFilesAfterEnv: js.UndefOr[js.Array[String]] = js.undefined
  
  var showSeed: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var skipFilter: js.UndefOr[Boolean] = js.undefined
  
  var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
  
  var slowTestThreshold: js.UndefOr[Double] = js.undefined
  
  var snapshotFormat: js.UndefOr[SnapshotFormat] = js.undefined
  
  var snapshotResolver: js.UndefOr[String] = js.undefined
  
  var snapshotSerializers: js.UndefOr[js.Array[String]] = js.undefined
  
  var testEnvironment: js.UndefOr[String] = js.undefined
  
  var testEnvironmentOptions: js.UndefOr[Record[String, Any]] = js.undefined
  
  var testFailureExitCode: js.UndefOr[String | Double] = js.undefined
  
  var testLocationInResults: js.UndefOr[Boolean] = js.undefined
  
  var testMatch: js.UndefOr[js.Array[String]] = js.undefined
  
  var testNamePattern: js.UndefOr[String] = js.undefined
  
  var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var testRegex: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var testResultsProcessor: js.UndefOr[String] = js.undefined
  
  var testRunner: js.UndefOr[String] = js.undefined
  
  var testSequencer: js.UndefOr[String] = js.undefined
  
  var testTimeout: js.UndefOr[Double] = js.undefined
  
  var transform: js.UndefOr[StringDictionary[String | TransformerConfig]] = js.undefined
  
  var transformIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var updateSnapshot: js.UndefOr[Boolean] = js.undefined
  
  var useStderr: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var watch: js.UndefOr[Boolean] = js.undefined
  
  var watchAll: js.UndefOr[Boolean] = js.undefined
  
  var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var watchPlugins: js.UndefOr[js.Array[String | (js.Tuple2[String, Record[String, Any]])]] = js.undefined
  
  var watchman: js.UndefOr[Boolean] = js.undefined
  
  var workerIdleMemoryLimit: js.UndefOr[Double | String] = js.undefined
}
object InitialOptions {
  
  inline def apply(): InitialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialOptions]
  }
  
  extension [Self <: InitialOptions](x: Self) {
    
    inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
    
    inline def setAutomockUndefined: Self = StObject.set(x, "automock", js.undefined)
    
    inline def setBail(value: Boolean | Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
    
    inline def setChangedFilesWithAncestorUndefined: Self = StObject.set(x, "changedFilesWithAncestor", js.undefined)
    
    inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
    
    inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
    
    inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
    
    inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
    
    inline def setClearMocksUndefined: Self = StObject.set(x, "clearMocks", js.undefined)
    
    inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverageFrom(value: js.Array[String]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
    
    inline def setCollectCoverageFromVarargs(value: String*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value*))
    
    inline def setCollectCoverageUndefined: Self = StObject.set(x, "collectCoverage", js.undefined)
    
    inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
    
    inline def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
    
    inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatternsUndefined: Self = StObject.set(x, "coveragePathIgnorePatterns", js.undefined)
    
    inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value*))
    
    inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
    
    inline def setCoverageProviderUndefined: Self = StObject.set(x, "coverageProvider", js.undefined)
    
    inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
    
    inline def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
    
    inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value*))
    
    inline def setCoverageThreshold(value: CoverageThreshold): Self = StObject.set(x, "coverageThreshold", value.asInstanceOf[js.Any])
    
    inline def setCoverageThresholdUndefined: Self = StObject.set(x, "coverageThreshold", js.undefined)
    
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
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExtensionsToTreatAsEsm(value: js.Array[String]): Self = StObject.set(x, "extensionsToTreatAsEsm", value.asInstanceOf[js.Any])
    
    inline def setExtensionsToTreatAsEsmUndefined: Self = StObject.set(x, "extensionsToTreatAsEsm", js.undefined)
    
    inline def setExtensionsToTreatAsEsmVarargs(value: String*): Self = StObject.set(x, "extensionsToTreatAsEsm", js.Array(value*))
    
    inline def setFakeTimers(value: FakeTimers): Self = StObject.set(x, "fakeTimers", value.asInstanceOf[js.Any])
    
    inline def setFakeTimersUndefined: Self = StObject.set(x, "fakeTimers", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
    
    inline def setFindRelatedTestsUndefined: Self = StObject.set(x, "findRelatedTests", js.undefined)
    
    inline def setForceCoverageMatch(value: js.Array[String]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
    
    inline def setForceCoverageMatchUndefined: Self = StObject.set(x, "forceCoverageMatch", js.undefined)
    
    inline def setForceCoverageMatchVarargs(value: String*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value*))
    
    inline def setForceExit(value: Boolean): Self = StObject.set(x, "forceExit", value.asInstanceOf[js.Any])
    
    inline def setForceExitUndefined: Self = StObject.set(x, "forceExit", js.undefined)
    
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
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setLastCommit(value: Boolean): Self = StObject.set(x, "lastCommit", value.asInstanceOf[js.Any])
    
    inline def setLastCommitUndefined: Self = StObject.set(x, "lastCommit", js.undefined)
    
    inline def setListTests(value: Boolean): Self = StObject.set(x, "listTests", value.asInstanceOf[js.Any])
    
    inline def setListTestsUndefined: Self = StObject.set(x, "listTests", js.undefined)
    
    inline def setLogHeapUsage(value: Boolean): Self = StObject.set(x, "logHeapUsage", value.asInstanceOf[js.Any])
    
    inline def setLogHeapUsageUndefined: Self = StObject.set(x, "logHeapUsage", js.undefined)
    
    inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
    
    inline def setMaxWorkers(value: Double | String): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
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
    
    inline def setNoStackTrace(value: Boolean): Self = StObject.set(x, "noStackTrace", value.asInstanceOf[js.Any])
    
    inline def setNoStackTraceUndefined: Self = StObject.set(x, "noStackTrace", js.undefined)
    
    inline def setNotifyMode(value: String): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
    
    inline def setNotifyModeUndefined: Self = StObject.set(x, "notifyMode", js.undefined)
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    inline def setOnlyChanged(value: Boolean): Self = StObject.set(x, "onlyChanged", value.asInstanceOf[js.Any])
    
    inline def setOnlyChangedUndefined: Self = StObject.set(x, "onlyChanged", js.undefined)
    
    inline def setOnlyFailures(value: Boolean): Self = StObject.set(x, "onlyFailures", value.asInstanceOf[js.Any])
    
    inline def setOnlyFailuresUndefined: Self = StObject.set(x, "onlyFailures", js.undefined)
    
    inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
    
    inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
    
    inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
    
    inline def setPassWithNoTestsUndefined: Self = StObject.set(x, "passWithNoTests", js.undefined)
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetNull: Self = StObject.set(x, "preset", null)
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
    
    inline def setPrettierPathNull: Self = StObject.set(x, "prettierPath", null)
    
    inline def setPrettierPathUndefined: Self = StObject.set(x, "prettierPath", js.undefined)
    
    inline def setProjects(value: js.Array[String | InitialProjectOptions]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: (String | InitialProjectOptions)*): Self = StObject.set(x, "projects", js.Array(value*))
    
    inline def setReplname(value: String): Self = StObject.set(x, "replname", value.asInstanceOf[js.Any])
    
    inline def setReplnameNull: Self = StObject.set(x, "replname", null)
    
    inline def setReplnameUndefined: Self = StObject.set(x, "replname", js.undefined)
    
    inline def setReporters(value: js.Array[String | ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
    
    inline def setReportersVarargs(value: (String | ReporterConfig)*): Self = StObject.set(x, "reporters", js.Array(value*))
    
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
    
    inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
    
    inline def setRunTestsByPathUndefined: Self = StObject.set(x, "runTestsByPath", js.undefined)
    
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
    
    inline def setShowSeed(value: Boolean): Self = StObject.set(x, "showSeed", value.asInstanceOf[js.Any])
    
    inline def setShowSeedUndefined: Self = StObject.set(x, "showSeed", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
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
    
    inline def setTestFailureExitCode(value: String | Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
    
    inline def setTestFailureExitCodeUndefined: Self = StObject.set(x, "testFailureExitCode", js.undefined)
    
    inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
    
    inline def setTestLocationInResultsUndefined: Self = StObject.set(x, "testLocationInResults", js.undefined)
    
    inline def setTestMatch(value: js.Array[String]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
    
    inline def setTestMatchUndefined: Self = StObject.set(x, "testMatch", js.undefined)
    
    inline def setTestMatchVarargs(value: String*): Self = StObject.set(x, "testMatch", js.Array(value*))
    
    inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
    
    inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
    
    inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTestPathIgnorePatternsUndefined: Self = StObject.set(x, "testPathIgnorePatterns", js.undefined)
    
    inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value*))
    
    inline def setTestRegex(value: String | js.Array[String]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
    
    inline def setTestRegexUndefined: Self = StObject.set(x, "testRegex", js.undefined)
    
    inline def setTestRegexVarargs(value: String*): Self = StObject.set(x, "testRegex", js.Array(value*))
    
    inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
    
    inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
    
    inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    inline def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
    
    inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
    
    inline def setTestSequencerUndefined: Self = StObject.set(x, "testSequencer", js.undefined)
    
    inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
    
    inline def setTransform(value: StringDictionary[String | TransformerConfig]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatternsUndefined: Self = StObject.set(x, "transformIgnorePatterns", js.undefined)
    
    inline def setTransformIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value*))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUnmockedModulePathPatterns(value: js.Array[String]): Self = StObject.set(x, "unmockedModulePathPatterns", value.asInstanceOf[js.Any])
    
    inline def setUnmockedModulePathPatternsUndefined: Self = StObject.set(x, "unmockedModulePathPatterns", js.undefined)
    
    inline def setUnmockedModulePathPatternsVarargs(value: String*): Self = StObject.set(x, "unmockedModulePathPatterns", js.Array(value*))
    
    inline def setUpdateSnapshot(value: Boolean): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
    
    inline def setUpdateSnapshotUndefined: Self = StObject.set(x, "updateSnapshot", js.undefined)
    
    inline def setUseStderr(value: Boolean): Self = StObject.set(x, "useStderr", value.asInstanceOf[js.Any])
    
    inline def setUseStderrUndefined: Self = StObject.set(x, "useStderr", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchAll(value: Boolean): Self = StObject.set(x, "watchAll", value.asInstanceOf[js.Any])
    
    inline def setWatchAllUndefined: Self = StObject.set(x, "watchAll", js.undefined)
    
    inline def setWatchPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setWatchPathIgnorePatternsUndefined: Self = StObject.set(x, "watchPathIgnorePatterns", js.undefined)
    
    inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value*))
    
    inline def setWatchPlugins(value: js.Array[String | (js.Tuple2[String, Record[String, Any]])]): Self = StObject.set(x, "watchPlugins", value.asInstanceOf[js.Any])
    
    inline def setWatchPluginsUndefined: Self = StObject.set(x, "watchPlugins", js.undefined)
    
    inline def setWatchPluginsVarargs(value: (String | (js.Tuple2[String, Record[String, Any]]))*): Self = StObject.set(x, "watchPlugins", js.Array(value*))
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    
    inline def setWatchmanUndefined: Self = StObject.set(x, "watchman", js.undefined)
    
    inline def setWorkerIdleMemoryLimit(value: Double | String): Self = StObject.set(x, "workerIdleMemoryLimit", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdleMemoryLimitUndefined: Self = StObject.set(x, "workerIdleMemoryLimit", js.undefined)
  }
}
