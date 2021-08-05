package typings.jestTypes

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.anon.Config
import typings.jestTypes.anon.Global
import typings.jestTypes.jestTypesStrings.`jest-runner`
import typings.std.Partial
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  type Argv = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Arguments<Partial<{  all :boolean,   automock :boolean,   bail :boolean | number,   cache :boolean,   cacheDirectory :string,   changedFilesWithAncestor :boolean,   changedSince :string,   ci :boolean,   clearCache :boolean,   clearMocks :boolean,   collectCoverage :boolean,   collectCoverageFrom :string,   collectCoverageOnlyFrom :Array<string>,   color :boolean,   colors :boolean,   config :string,   coverage :boolean,   coverageDirectory :string,   coveragePathIgnorePatterns :Array<string>,   coverageReporters :Array<string>,   coverageThreshold :string,   debug :boolean,   env :string,   expand :boolean,   findRelatedTests :boolean,   forceExit :boolean,   globals :string,   globalSetup :string | null | undefined,   globalTeardown :string | null | undefined,   haste :string,   init :boolean,   injectGlobals :boolean,   json :boolean,   lastCommit :boolean,   logHeapUsage :boolean,   maxWorkers :number | string,   moduleDirectories :Array<string>,   moduleFileExtensions :Array<string>,   moduleNameMapper :string,   modulePathIgnorePatterns :Array<string>,   modulePaths :Array<string>,   noStackTrace :boolean,   notify :boolean,   notifyMode :string,   onlyChanged :boolean,   onlyFailures :boolean,   outputFile :string,   preset :string | null | undefined,   projects :Array<string>,   prettierPath :string | null | undefined,   resetMocks :boolean,   resetModules :boolean,   resolver :string | null | undefined,   restoreMocks :boolean,   rootDir :string,   roots :Array<string>,   runInBand :boolean,   selectProjects :Array<string>,   setupFiles :Array<string>,   setupFilesAfterEnv :Array<string>,   showConfig :boolean,   silent :boolean,   snapshotSerializers :Array<string>,   testEnvironment :string,   testFailureExitCode :string | null | undefined,   testMatch :Array<string>,   testNamePattern :string,   testPathIgnorePatterns :Array<string>,   testPathPattern :Array<string>,   testRegex :string | Array<string>,   testResultsProcessor :string,   testRunner :string,   testSequencer :string,   testURL :string,   testTimeout :number | null | undefined,   timers :string,   transform :string,   transformIgnorePatterns :Array<string>,   unmockedModulePathPatterns :Array<string> | null | undefined,   updateSnapshot :boolean,   useStderr :boolean,   verbose :boolean,   version :boolean,   watch :boolean,   watchAll :boolean,   watchman :boolean,   watchPathIgnorePatterns :Array<string>}>> */ js.Any
  
  type ConfigGlobals = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestTypes.jestTypesStrings.babel
    - typings.jestTypes.jestTypesStrings.v8
  */
  trait CoverageProvider extends StObject
  object CoverageProvider {
    
    inline def babel: typings.jestTypes.jestTypesStrings.babel = "babel".asInstanceOf[typings.jestTypes.jestTypesStrings.babel]
    
    inline def v8: typings.jestTypes.jestTypesStrings.v8 = "v8".asInstanceOf[typings.jestTypes.jestTypesStrings.v8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestTypes.jestTypesStrings.clover
    - typings.jestTypes.jestTypesStrings.cobertura
    - typings.jestTypes.jestTypesStrings.`html-spa`
    - typings.jestTypes.jestTypesStrings.html
    - typings.jestTypes.jestTypesStrings.json_
    - typings.jestTypes.jestTypesStrings.`json-summary`
    - typings.jestTypes.jestTypesStrings.lcov
    - typings.jestTypes.jestTypesStrings.lcovonly
    - typings.jestTypes.jestTypesStrings.teamcity
    - typings.jestTypes.jestTypesStrings.text
    - typings.jestTypes.jestTypesStrings.`text-lcov`
    - typings.jestTypes.jestTypesStrings.`text-summary`
  */
  trait CoverageReporterName extends StObject
  
  type CoverageReporterWithOptions[K] = js.Tuple2[
    K, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: istanbul-reports.istanbul-reports.ReportOptions[K] */ js.Any
    ]
  ]
  
  type CoverageReporters = js.Array[CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName]]
  
  trait CoverageThreshold
    extends StObject
       with /* path */ StringDictionary[CoverageThresholdValue] {
    
    var global: CoverageThresholdValue
  }
  object CoverageThreshold {
    
    inline def apply(global: CoverageThresholdValue): CoverageThreshold = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageThreshold]
    }
    
    extension [Self <: CoverageThreshold](x: Self) {
      
      inline def setGlobal(value: CoverageThresholdValue): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  trait CoverageThresholdValue extends StObject {
    
    var branches: js.UndefOr[Double] = js.undefined
    
    var functions: js.UndefOr[Double] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var statements: js.UndefOr[Double] = js.undefined
  }
  object CoverageThresholdValue {
    
    inline def apply(): CoverageThresholdValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoverageThresholdValue]
    }
    
    extension [Self <: CoverageThresholdValue](x: Self) {
      
      inline def setBranches(value: Double): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setFunctions(value: Double): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setStatements(value: Double): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
  
  trait DefaultOptions extends StObject {
    
    var automock: Boolean
    
    var bail: Double
    
    var cache: Boolean
    
    var cacheDirectory: Path
    
    var changedFilesWithAncestor: Boolean
    
    var clearMocks: Boolean
    
    var collectCoverage: Boolean
    
    var coveragePathIgnorePatterns: js.Array[String]
    
    var coverageProvider: CoverageProvider
    
    var coverageReporters: js.Array[CoverageReporterName]
    
    var errorOnDeprecated: Boolean
    
    var expand: Boolean
    
    var forceCoverageMatch: js.Array[Glob]
    
    var globals: ConfigGlobals
    
    var haste: HasteConfig
    
    var injectGlobals: Boolean
    
    var maxConcurrency: Double
    
    var maxWorkers: Double | String
    
    var moduleDirectories: js.Array[String]
    
    var moduleFileExtensions: js.Array[String]
    
    var moduleNameMapper: Record[String, String | js.Array[String]]
    
    var modulePathIgnorePatterns: js.Array[String]
    
    var noStackTrace: Boolean
    
    var notifyMode: NotifyMode
    
    @JSName("notify")
    var notify_FDefaultOptions: Boolean
    
    var prettierPath: String
    
    var resetMocks: Boolean
    
    var resetModules: Boolean
    
    var restoreMocks: Boolean
    
    var roots: js.Array[Path]
    
    var runTestsByPath: Boolean
    
    var runner: `jest-runner`
    
    var setupFiles: js.Array[Path]
    
    var setupFilesAfterEnv: js.Array[Path]
    
    var skipFilter: Boolean
    
    var slowTestThreshold: Double
    
    var snapshotSerializers: js.Array[Path]
    
    var testEnvironment: String
    
    var testEnvironmentOptions: Record[String, js.Any]
    
    var testFailureExitCode: String | Double
    
    var testLocationInResults: Boolean
    
    var testMatch: js.Array[Glob]
    
    var testPathIgnorePatterns: js.Array[String]
    
    var testRegex: js.Array[String]
    
    var testRunner: String
    
    var testSequencer: String
    
    var testURL: String
    
    var timers: Timers
    
    var transformIgnorePatterns: js.Array[Glob]
    
    var useStderr: Boolean
    
    var watch: Boolean
    
    var watchPathIgnorePatterns: js.Array[String]
    
    var watchman: Boolean
  }
  object DefaultOptions {
    
    inline def apply(
      automock: Boolean,
      bail: Double,
      cache: Boolean,
      cacheDirectory: Path,
      changedFilesWithAncestor: Boolean,
      clearMocks: Boolean,
      collectCoverage: Boolean,
      coveragePathIgnorePatterns: js.Array[String],
      coverageProvider: CoverageProvider,
      coverageReporters: js.Array[CoverageReporterName],
      errorOnDeprecated: Boolean,
      expand: Boolean,
      forceCoverageMatch: js.Array[Glob],
      globals: ConfigGlobals,
      haste: HasteConfig,
      injectGlobals: Boolean,
      maxConcurrency: Double,
      maxWorkers: Double | String,
      moduleDirectories: js.Array[String],
      moduleFileExtensions: js.Array[String],
      moduleNameMapper: Record[String, String | js.Array[String]],
      modulePathIgnorePatterns: js.Array[String],
      noStackTrace: Boolean,
      notifyMode: NotifyMode,
      notify_ : Boolean,
      prettierPath: String,
      resetMocks: Boolean,
      resetModules: Boolean,
      restoreMocks: Boolean,
      roots: js.Array[Path],
      runTestsByPath: Boolean,
      setupFiles: js.Array[Path],
      setupFilesAfterEnv: js.Array[Path],
      skipFilter: Boolean,
      slowTestThreshold: Double,
      snapshotSerializers: js.Array[Path],
      testEnvironment: String,
      testEnvironmentOptions: Record[String, js.Any],
      testFailureExitCode: String | Double,
      testLocationInResults: Boolean,
      testMatch: js.Array[Glob],
      testPathIgnorePatterns: js.Array[String],
      testRegex: js.Array[String],
      testRunner: String,
      testSequencer: String,
      testURL: String,
      timers: Timers,
      transformIgnorePatterns: js.Array[Glob],
      useStderr: Boolean,
      watch: Boolean,
      watchPathIgnorePatterns: js.Array[String],
      watchman: Boolean
    ): DefaultOptions = {
      val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], injectGlobals = injectGlobals.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = "jest-runner", setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
      
      inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectory(value: Path): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
      
      inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value :_*))
      
      inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
      
      inline def setCoverageReporters(value: js.Array[CoverageReporterName]): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersVarargs(value: CoverageReporterName*): Self = StObject.set(x, "coverageReporters", js.Array(value :_*))
      
      inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setForceCoverageMatch(value: js.Array[Glob]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
      
      inline def setForceCoverageMatchVarargs(value: Glob*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value :_*))
      
      inline def setGlobals(value: ConfigGlobals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setHaste(value: HasteConfig): Self = StObject.set(x, "haste", value.asInstanceOf[js.Any])
      
      inline def setInjectGlobals(value: Boolean): Self = StObject.set(x, "injectGlobals", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkers(value: Double | String): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value :_*))
      
      inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value :_*))
      
      inline def setModuleNameMapper(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
      
      inline def setModulePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setModulePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value :_*))
      
      inline def setNoStackTrace(value: Boolean): Self = StObject.set(x, "noStackTrace", value.asInstanceOf[js.Any])
      
      inline def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
      
      inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
      
      inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
      
      inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
      
      inline def setRestoreMocks(value: Boolean): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
      
      inline def setRoots(value: js.Array[Path]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: Path*): Self = StObject.set(x, "roots", js.Array(value :_*))
      
      inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
      
      inline def setRunner(value: `jest-runner`): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setSetupFiles(value: js.Array[Path]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnv(value: js.Array[Path]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnvVarargs(value: Path*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value :_*))
      
      inline def setSetupFilesVarargs(value: Path*): Self = StObject.set(x, "setupFiles", js.Array(value :_*))
      
      inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
      
      inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializers(value: js.Array[Path]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializersVarargs(value: Path*): Self = StObject.set(x, "snapshotSerializers", js.Array(value :_*))
      
      inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentOptions(value: Record[String, js.Any]): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
      
      inline def setTestFailureExitCode(value: String | Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
      
      inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
      
      inline def setTestMatch(value: js.Array[Glob]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      inline def setTestMatchVarargs(value: Glob*): Self = StObject.set(x, "testMatch", js.Array(value :_*))
      
      inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value :_*))
      
      inline def setTestRegex(value: js.Array[String]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
      
      inline def setTestRegexVarargs(value: String*): Self = StObject.set(x, "testRegex", js.Array(value :_*))
      
      inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
      
      inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
      
      inline def setTestURL(value: String): Self = StObject.set(x, "testURL", value.asInstanceOf[js.Any])
      
      inline def setTimers(value: Timers): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatterns(value: js.Array[Glob]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatternsVarargs(value: Glob*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value :_*))
      
      inline def setUseStderr(value: Boolean): Self = StObject.set(x, "useStderr", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value :_*))
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayName extends StObject {
    
    var color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ js.Any
    
    var name: String
  }
  object DisplayName {
    
    inline def apply(
      color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ js.Any,
      name: String
    ): DisplayName = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    extension [Self <: DisplayName](x: Self) {
      
      inline def setColor(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Glob = String
  
  trait GlobalConfig extends StObject {
    
    var bail: Double
    
    var changedFilesWithAncestor: Boolean
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var collectCoverage: Boolean
    
    var collectCoverageFrom: js.Array[Glob]
    
    var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var coverageDirectory: String
    
    var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var coverageProvider: CoverageProvider
    
    var coverageReporters: CoverageReporters
    
    var coverageThreshold: js.UndefOr[CoverageThreshold] = js.undefined
    
    var detectLeaks: Boolean
    
    var detectOpenHandles: Boolean
    
    var enabledTestsMap: js.UndefOr[StringDictionary[StringDictionary[Boolean]]] = js.undefined
    
    var errorOnDeprecated: Boolean
    
    var expand: Boolean
    
    var filter: js.UndefOr[Path] = js.undefined
    
    var findRelatedTests: Boolean
    
    var forceExit: Boolean
    
    var globalSetup: js.UndefOr[String] = js.undefined
    
    var globalTeardown: js.UndefOr[String] = js.undefined
    
    var json: Boolean
    
    var lastCommit: Boolean
    
    var listTests: Boolean
    
    var logHeapUsage: Boolean
    
    var maxConcurrency: Double
    
    var maxWorkers: Double
    
    var noSCM: js.UndefOr[Boolean] = js.undefined
    
    var noStackTrace: Boolean
    
    var nonFlagArgs: js.Array[String]
    
    var notifyMode: NotifyMode
    
    @JSName("notify")
    var notify_FGlobalConfig: Boolean
    
    var onlyChanged: Boolean
    
    var onlyFailures: Boolean
    
    var outputFile: js.UndefOr[Path] = js.undefined
    
    var passWithNoTests: Boolean
    
    var projects: js.Array[Glob]
    
    var replname: js.UndefOr[String] = js.undefined
    
    var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.undefined
    
    var rootDir: Path
    
    var runTestsByPath: Boolean
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var skipFilter: Boolean
    
    var testFailureExitCode: Double
    
    var testNamePattern: js.UndefOr[String] = js.undefined
    
    var testPathPattern: String
    
    var testResultsProcessor: js.UndefOr[String] = js.undefined
    
    var testSequencer: String
    
    var testTimeout: js.UndefOr[Double] = js.undefined
    
    var updateSnapshot: SnapshotUpdateState
    
    var useStderr: Boolean
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watch: Boolean
    
    var watchAll: Boolean
    
    var watchPlugins: js.UndefOr[js.Array[Config] | Null] = js.undefined
    
    var watchman: Boolean
  }
  object GlobalConfig {
    
    inline def apply(
      bail: Double,
      changedFilesWithAncestor: Boolean,
      collectCoverage: Boolean,
      collectCoverageFrom: js.Array[Glob],
      coverageDirectory: String,
      coverageProvider: CoverageProvider,
      coverageReporters: CoverageReporters,
      detectLeaks: Boolean,
      detectOpenHandles: Boolean,
      errorOnDeprecated: Boolean,
      expand: Boolean,
      findRelatedTests: Boolean,
      forceExit: Boolean,
      json: Boolean,
      lastCommit: Boolean,
      listTests: Boolean,
      logHeapUsage: Boolean,
      maxConcurrency: Double,
      maxWorkers: Double,
      noStackTrace: Boolean,
      nonFlagArgs: js.Array[String],
      notifyMode: NotifyMode,
      notify_ : Boolean,
      onlyChanged: Boolean,
      onlyFailures: Boolean,
      passWithNoTests: Boolean,
      projects: js.Array[Glob],
      rootDir: Path,
      runTestsByPath: Boolean,
      skipFilter: Boolean,
      testFailureExitCode: Double,
      testPathPattern: String,
      testSequencer: String,
      updateSnapshot: SnapshotUpdateState,
      useStderr: Boolean,
      watch: Boolean,
      watchAll: Boolean,
      watchman: Boolean
    ): GlobalConfig = {
      val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalConfig]
    }
    
    extension [Self <: GlobalConfig](x: Self) {
      
      inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFrom(value: js.Array[Glob]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromVarargs(value: Glob*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value :_*))
      
      inline def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = StObject.set(x, "collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageOnlyFromUndefined: Self = StObject.set(x, "collectCoverageOnlyFrom", js.undefined)
      
      inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatternsUndefined: Self = StObject.set(x, "coveragePathIgnorePatterns", js.undefined)
      
      inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value :_*))
      
      inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
      
      inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value :_*))
      
      inline def setCoverageThreshold(value: CoverageThreshold): Self = StObject.set(x, "coverageThreshold", value.asInstanceOf[js.Any])
      
      inline def setCoverageThresholdUndefined: Self = StObject.set(x, "coverageThreshold", js.undefined)
      
      inline def setDetectLeaks(value: Boolean): Self = StObject.set(x, "detectLeaks", value.asInstanceOf[js.Any])
      
      inline def setDetectOpenHandles(value: Boolean): Self = StObject.set(x, "detectOpenHandles", value.asInstanceOf[js.Any])
      
      inline def setEnabledTestsMap(value: StringDictionary[StringDictionary[Boolean]]): Self = StObject.set(x, "enabledTestsMap", value.asInstanceOf[js.Any])
      
      inline def setEnabledTestsMapUndefined: Self = StObject.set(x, "enabledTestsMap", js.undefined)
      
      inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: Path): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      inline def setForceExit(value: Boolean): Self = StObject.set(x, "forceExit", value.asInstanceOf[js.Any])
      
      inline def setGlobalSetup(value: String): Self = StObject.set(x, "globalSetup", value.asInstanceOf[js.Any])
      
      inline def setGlobalSetupUndefined: Self = StObject.set(x, "globalSetup", js.undefined)
      
      inline def setGlobalTeardown(value: String): Self = StObject.set(x, "globalTeardown", value.asInstanceOf[js.Any])
      
      inline def setGlobalTeardownUndefined: Self = StObject.set(x, "globalTeardown", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setLastCommit(value: Boolean): Self = StObject.set(x, "lastCommit", value.asInstanceOf[js.Any])
      
      inline def setListTests(value: Boolean): Self = StObject.set(x, "listTests", value.asInstanceOf[js.Any])
      
      inline def setLogHeapUsage(value: Boolean): Self = StObject.set(x, "logHeapUsage", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setNoSCM(value: Boolean): Self = StObject.set(x, "noSCM", value.asInstanceOf[js.Any])
      
      inline def setNoSCMUndefined: Self = StObject.set(x, "noSCM", js.undefined)
      
      inline def setNoStackTrace(value: Boolean): Self = StObject.set(x, "noStackTrace", value.asInstanceOf[js.Any])
      
      inline def setNonFlagArgs(value: js.Array[String]): Self = StObject.set(x, "nonFlagArgs", value.asInstanceOf[js.Any])
      
      inline def setNonFlagArgsVarargs(value: String*): Self = StObject.set(x, "nonFlagArgs", js.Array(value :_*))
      
      inline def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
      
      inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setOnlyChanged(value: Boolean): Self = StObject.set(x, "onlyChanged", value.asInstanceOf[js.Any])
      
      inline def setOnlyFailures(value: Boolean): Self = StObject.set(x, "onlyFailures", value.asInstanceOf[js.Any])
      
      inline def setOutputFile(value: Path): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: js.Array[Glob]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsVarargs(value: Glob*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      inline def setReplname(value: String): Self = StObject.set(x, "replname", value.asInstanceOf[js.Any])
      
      inline def setReplnameUndefined: Self = StObject.set(x, "replname", js.undefined)
      
      inline def setReporters(value: js.Array[String | ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: (String | ReporterConfig)*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      inline def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
      
      inline def setTestFailureExitCode(value: Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
      
      inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      inline def setTestPathPattern(value: String): Self = StObject.set(x, "testPathPattern", value.asInstanceOf[js.Any])
      
      inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
      
      inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
      
      inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
      
      inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
      
      inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
      
      inline def setUpdateSnapshot(value: SnapshotUpdateState): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
      
      inline def setUseStderr(value: Boolean): Self = StObject.set(x, "useStderr", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchAll(value: Boolean): Self = StObject.set(x, "watchAll", value.asInstanceOf[js.Any])
      
      inline def setWatchPlugins(value: js.Array[Config]): Self = StObject.set(x, "watchPlugins", value.asInstanceOf[js.Any])
      
      inline def setWatchPluginsNull: Self = StObject.set(x, "watchPlugins", null)
      
      inline def setWatchPluginsUndefined: Self = StObject.set(x, "watchPlugins", js.undefined)
      
      inline def setWatchPluginsVarargs(value: Config*): Self = StObject.set(x, "watchPlugins", js.Array(value :_*))
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasteConfig extends StObject {
    
    /** Whether to hash files using SHA-1. */
    var computeSha1: js.UndefOr[Boolean] = js.undefined
    
    /** The platform to use as the default, e.g. 'ios'. */
    var defaultPlatform: js.UndefOr[String | Null] = js.undefined
    
    /** Path to a custom implementation of Haste. */
    var hasteImplModulePath: js.UndefOr[String] = js.undefined
    
    /** All platforms to target, e.g ['ios', 'android']. */
    var platforms: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Whether to throw on error on module collision. */
    var throwOnModuleCollision: js.UndefOr[Boolean] = js.undefined
  }
  object HasteConfig {
    
    inline def apply(): HasteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasteConfig]
    }
    
    extension [Self <: HasteConfig](x: Self) {
      
      inline def setComputeSha1(value: Boolean): Self = StObject.set(x, "computeSha1", value.asInstanceOf[js.Any])
      
      inline def setComputeSha1Undefined: Self = StObject.set(x, "computeSha1", js.undefined)
      
      inline def setDefaultPlatform(value: String): Self = StObject.set(x, "defaultPlatform", value.asInstanceOf[js.Any])
      
      inline def setDefaultPlatformNull: Self = StObject.set(x, "defaultPlatform", null)
      
      inline def setDefaultPlatformUndefined: Self = StObject.set(x, "defaultPlatform", js.undefined)
      
      inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
      
      inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value :_*))
      
      inline def setThrowOnModuleCollision(value: Boolean): Self = StObject.set(x, "throwOnModuleCollision", value.asInstanceOf[js.Any])
      
      inline def setThrowOnModuleCollisionUndefined: Self = StObject.set(x, "throwOnModuleCollision", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  automock :boolean,   bail :boolean | number,   cache :boolean,   cacheDirectory :@jest/types.@jest/types/build/Config.Path,   clearMocks :boolean,   changedFilesWithAncestor :boolean,   changedSince :string,   collectCoverage :boolean,   collectCoverageFrom :std.Array<@jest/types.@jest/types/build/Config.Glob>,   collectCoverageOnlyFrom :{[key: string] : boolean},   coverageDirectory :string,   coveragePathIgnorePatterns :std.Array<string>,   coverageProvider :@jest/types.@jest/types/build/Config.CoverageProvider,   coverageReporters :@jest/types.@jest/types/build/Config.CoverageReporters,   coverageThreshold :{  global :{[key: string] : number}},   dependencyExtractor :string,   detectLeaks :boolean,   detectOpenHandles :boolean,   displayName :string | @jest/types.@jest/types/build/Config.DisplayName,   expand :boolean,   extraGlobals :std.Array<string>,   filter :@jest/types.@jest/types/build/Config.Path,   findRelatedTests :boolean,   forceCoverageMatch :std.Array<@jest/types.@jest/types/build/Config.Glob>,   forceExit :boolean,   json :boolean,   globals :@jest/types.@jest/types/build/Config.ConfigGlobals,   globalSetup :string | null | undefined,   globalTeardown :string | null | undefined,   haste :@jest/types.@jest/types/build/Config.HasteConfig,   injectGlobals :boolean,   reporters :std.Array<string | @jest/types.@jest/types/build/Config.ReporterConfig>,   logHeapUsage :boolean,   lastCommit :boolean,   listTests :boolean,   mapCoverage :boolean,   maxConcurrency :number,   maxWorkers :number | string,   moduleDirectories :std.Array<string>,   moduleFileExtensions :std.Array<string>,   moduleLoader :@jest/types.@jest/types/build/Config.Path,   moduleNameMapper :{[key: string] : string | std.Array<string>},   modulePathIgnorePatterns :std.Array<string>,   modulePaths :std.Array<string>,   name :string,   noStackTrace :boolean,   notify :boolean,   notifyMode :string,   onlyChanged :boolean,   onlyFailures :boolean,   outputFile :@jest/types.@jest/types/build/Config.Path,   passWithNoTests :boolean,   preprocessorIgnorePatterns :std.Array<@jest/types.@jest/types/build/Config.Glob>,   preset :string | null | undefined,   prettierPath :string | null | undefined,   projects :std.Array<@jest/types.@jest/types/build/Config.Glob>,   replname :string | null | undefined,   resetMocks :boolean,   resetModules :boolean,   resolver :@jest/types.@jest/types/build/Config.Path | null | undefined,   restoreMocks :boolean,   rootDir :@jest/types.@jest/types/build/Config.Path,   roots :std.Array<@jest/types.@jest/types/build/Config.Path>,   runner :string,   runTestsByPath :boolean,   scriptPreprocessor :string,   setupFiles :std.Array<@jest/types.@jest/types/build/Config.Path>,   setupTestFrameworkScriptFile :@jest/types.@jest/types/build/Config.Path,   setupFilesAfterEnv :std.Array<@jest/types.@jest/types/build/Config.Path>,   silent :boolean,   skipFilter :boolean,   skipNodeResolution :boolean,   slowTestThreshold :number,   snapshotResolver :@jest/types.@jest/types/build/Config.Path,   snapshotSerializers :std.Array<@jest/types.@jest/types/build/Config.Path>,   errorOnDeprecated :boolean,   testEnvironment :string,   testEnvironmentOptions :std.Record<string, unknown>,   testFailureExitCode :string | number,   testLocationInResults :boolean,   testMatch :std.Array<@jest/types.@jest/types/build/Config.Glob>,   testNamePattern :string,   testPathDirs :std.Array<@jest/types.@jest/types/build/Config.Path>,   testPathIgnorePatterns :std.Array<string>,   testRegex :string | std.Array<string>,   testResultsProcessor :string,   testRunner :string,   testSequencer :string,   testURL :string,   testTimeout :number,   timers :@jest/types.@jest/types/build/Config.Timers,   transform :{[regex: string] : @jest/types.@jest/types/build/Config.Path | @jest/types.@jest/types/build/Config.TransformerConfig},   transformIgnorePatterns :std.Array<@jest/types.@jest/types/build/Config.Glob>,   watchPathIgnorePatterns :std.Array<string>,   unmockedModulePathPatterns :std.Array<string>,   updateSnapshot :boolean,   useStderr :boolean,   verbose :boolean | undefined,   watch :boolean,   watchAll :boolean,   watchman :boolean,   watchPlugins :std.Array<string | [string, std.Record<string, unknown>]>}> */
  trait InitialOptions extends StObject {
    
    var automock: js.UndefOr[Boolean] = js.undefined
    
    var bail: js.UndefOr[Boolean | Double] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cacheDirectory: js.UndefOr[Path] = js.undefined
    
    var changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var clearMocks: js.UndefOr[Boolean] = js.undefined
    
    var collectCoverage: js.UndefOr[Boolean] = js.undefined
    
    var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var coverageDirectory: js.UndefOr[String] = js.undefined
    
    var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var coverageProvider: js.UndefOr[CoverageProvider] = js.undefined
    
    var coverageReporters: js.UndefOr[CoverageReporters] = js.undefined
    
    var coverageThreshold: js.UndefOr[Global] = js.undefined
    
    var dependencyExtractor: js.UndefOr[String] = js.undefined
    
    var detectLeaks: js.UndefOr[Boolean] = js.undefined
    
    var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
    
    var displayName: js.UndefOr[String | DisplayName] = js.undefined
    
    var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
    
    var expand: js.UndefOr[Boolean] = js.undefined
    
    var extraGlobals: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[Path] = js.undefined
    
    var findRelatedTests: js.UndefOr[Boolean] = js.undefined
    
    var forceCoverageMatch: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var forceExit: js.UndefOr[Boolean] = js.undefined
    
    var globalSetup: js.UndefOr[String | Null] = js.undefined
    
    var globalTeardown: js.UndefOr[String | Null] = js.undefined
    
    var globals: js.UndefOr[ConfigGlobals] = js.undefined
    
    var haste: js.UndefOr[HasteConfig] = js.undefined
    
    var injectGlobals: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var lastCommit: js.UndefOr[Boolean] = js.undefined
    
    var listTests: js.UndefOr[Boolean] = js.undefined
    
    var logHeapUsage: js.UndefOr[Boolean] = js.undefined
    
    var mapCoverage: js.UndefOr[Boolean] = js.undefined
    
    var maxConcurrency: js.UndefOr[Double] = js.undefined
    
    var maxWorkers: js.UndefOr[Double | String] = js.undefined
    
    var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
    
    var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var moduleLoader: js.UndefOr[Path] = js.undefined
    
    var moduleNameMapper: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noStackTrace: js.UndefOr[Boolean] = js.undefined
    
    var notifyMode: js.UndefOr[String] = js.undefined
    
    @JSName("notify")
    var notify_FInitialOptions: js.UndefOr[Boolean] = js.undefined
    
    var onlyChanged: js.UndefOr[Boolean] = js.undefined
    
    var onlyFailures: js.UndefOr[Boolean] = js.undefined
    
    var outputFile: js.UndefOr[Path] = js.undefined
    
    var passWithNoTests: js.UndefOr[Boolean] = js.undefined
    
    var preprocessorIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var preset: js.UndefOr[String | Null] = js.undefined
    
    var prettierPath: js.UndefOr[String | Null] = js.undefined
    
    var projects: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var replname: js.UndefOr[String | Null] = js.undefined
    
    var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.undefined
    
    var resetMocks: js.UndefOr[Boolean] = js.undefined
    
    var resetModules: js.UndefOr[Boolean] = js.undefined
    
    var resolver: js.UndefOr[Path | Null] = js.undefined
    
    var restoreMocks: js.UndefOr[Boolean] = js.undefined
    
    var rootDir: js.UndefOr[Path] = js.undefined
    
    var roots: js.UndefOr[js.Array[Path]] = js.undefined
    
    var runTestsByPath: js.UndefOr[Boolean] = js.undefined
    
    var runner: js.UndefOr[String] = js.undefined
    
    var scriptPreprocessor: js.UndefOr[String] = js.undefined
    
    var setupFiles: js.UndefOr[js.Array[Path]] = js.undefined
    
    var setupFilesAfterEnv: js.UndefOr[js.Array[Path]] = js.undefined
    
    var setupTestFrameworkScriptFile: js.UndefOr[Path] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var skipFilter: js.UndefOr[Boolean] = js.undefined
    
    var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
    
    var slowTestThreshold: js.UndefOr[Double] = js.undefined
    
    var snapshotResolver: js.UndefOr[Path] = js.undefined
    
    var snapshotSerializers: js.UndefOr[js.Array[Path]] = js.undefined
    
    var testEnvironment: js.UndefOr[String] = js.undefined
    
    var testEnvironmentOptions: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var testFailureExitCode: js.UndefOr[String | Double] = js.undefined
    
    var testLocationInResults: js.UndefOr[Boolean] = js.undefined
    
    var testMatch: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var testNamePattern: js.UndefOr[String] = js.undefined
    
    var testPathDirs: js.UndefOr[js.Array[Path]] = js.undefined
    
    var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var testRegex: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var testResultsProcessor: js.UndefOr[String] = js.undefined
    
    var testRunner: js.UndefOr[String] = js.undefined
    
    var testSequencer: js.UndefOr[String] = js.undefined
    
    var testTimeout: js.UndefOr[Double] = js.undefined
    
    var testURL: js.UndefOr[String] = js.undefined
    
    var timers: js.UndefOr[Timers] = js.undefined
    
    var transform: js.UndefOr[StringDictionary[Path | TransformerConfig]] = js.undefined
    
    var transformIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var updateSnapshot: js.UndefOr[Boolean] = js.undefined
    
    var useStderr: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var watchAll: js.UndefOr[Boolean] = js.undefined
    
    var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var watchPlugins: js.UndefOr[js.Array[String | (js.Tuple2[String, Record[String, js.Any]])]] = js.undefined
    
    var watchman: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setCacheDirectory(value: Path): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesWithAncestorUndefined: Self = StObject.set(x, "changedFilesWithAncestor", js.undefined)
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
      
      inline def setClearMocksUndefined: Self = StObject.set(x, "clearMocks", js.undefined)
      
      inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFrom(value: js.Array[Glob]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
      
      inline def setCollectCoverageFromVarargs(value: Glob*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value :_*))
      
      inline def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = StObject.set(x, "collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageOnlyFromUndefined: Self = StObject.set(x, "collectCoverageOnlyFrom", js.undefined)
      
      inline def setCollectCoverageUndefined: Self = StObject.set(x, "collectCoverage", js.undefined)
      
      inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      inline def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
      
      inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatternsUndefined: Self = StObject.set(x, "coveragePathIgnorePatterns", js.undefined)
      
      inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value :_*))
      
      inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
      
      inline def setCoverageProviderUndefined: Self = StObject.set(x, "coverageProvider", js.undefined)
      
      inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
      
      inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value :_*))
      
      inline def setCoverageThreshold(value: Global): Self = StObject.set(x, "coverageThreshold", value.asInstanceOf[js.Any])
      
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
      
      inline def setExtraGlobals(value: js.Array[String]): Self = StObject.set(x, "extraGlobals", value.asInstanceOf[js.Any])
      
      inline def setExtraGlobalsUndefined: Self = StObject.set(x, "extraGlobals", js.undefined)
      
      inline def setExtraGlobalsVarargs(value: String*): Self = StObject.set(x, "extraGlobals", js.Array(value :_*))
      
      inline def setFilter(value: Path): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      inline def setFindRelatedTestsUndefined: Self = StObject.set(x, "findRelatedTests", js.undefined)
      
      inline def setForceCoverageMatch(value: js.Array[Glob]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
      
      inline def setForceCoverageMatchUndefined: Self = StObject.set(x, "forceCoverageMatch", js.undefined)
      
      inline def setForceCoverageMatchVarargs(value: Glob*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value :_*))
      
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
      
      inline def setMapCoverage(value: Boolean): Self = StObject.set(x, "mapCoverage", value.asInstanceOf[js.Any])
      
      inline def setMapCoverageUndefined: Self = StObject.set(x, "mapCoverage", js.undefined)
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      inline def setMaxWorkers(value: Double | String): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoriesUndefined: Self = StObject.set(x, "moduleDirectories", js.undefined)
      
      inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value :_*))
      
      inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensionsUndefined: Self = StObject.set(x, "moduleFileExtensions", js.undefined)
      
      inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value :_*))
      
      inline def setModuleLoader(value: Path): Self = StObject.set(x, "moduleLoader", value.asInstanceOf[js.Any])
      
      inline def setModuleLoaderUndefined: Self = StObject.set(x, "moduleLoader", js.undefined)
      
      inline def setModuleNameMapper(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
      
      inline def setModuleNameMapperUndefined: Self = StObject.set(x, "moduleNameMapper", js.undefined)
      
      inline def setModulePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setModulePathIgnorePatternsUndefined: Self = StObject.set(x, "modulePathIgnorePatterns", js.undefined)
      
      inline def setModulePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value :_*))
      
      inline def setModulePaths(value: js.Array[String]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
      
      inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
      
      inline def setModulePathsVarargs(value: String*): Self = StObject.set(x, "modulePaths", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
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
      
      inline def setOutputFile(value: Path): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
      
      inline def setPassWithNoTestsUndefined: Self = StObject.set(x, "passWithNoTests", js.undefined)
      
      inline def setPreprocessorIgnorePatterns(value: js.Array[Glob]): Self = StObject.set(x, "preprocessorIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setPreprocessorIgnorePatternsUndefined: Self = StObject.set(x, "preprocessorIgnorePatterns", js.undefined)
      
      inline def setPreprocessorIgnorePatternsVarargs(value: Glob*): Self = StObject.set(x, "preprocessorIgnorePatterns", js.Array(value :_*))
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetNull: Self = StObject.set(x, "preset", null)
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
      
      inline def setPrettierPathNull: Self = StObject.set(x, "prettierPath", null)
      
      inline def setPrettierPathUndefined: Self = StObject.set(x, "prettierPath", js.undefined)
      
      inline def setProjects(value: js.Array[Glob]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      inline def setProjectsVarargs(value: Glob*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      inline def setReplname(value: String): Self = StObject.set(x, "replname", value.asInstanceOf[js.Any])
      
      inline def setReplnameNull: Self = StObject.set(x, "replname", null)
      
      inline def setReplnameUndefined: Self = StObject.set(x, "replname", js.undefined)
      
      inline def setReporters(value: js.Array[String | ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: (String | ReporterConfig)*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
      
      inline def setResetMocksUndefined: Self = StObject.set(x, "resetMocks", js.undefined)
      
      inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
      
      inline def setResetModulesUndefined: Self = StObject.set(x, "resetModules", js.undefined)
      
      inline def setResolver(value: Path): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverNull: Self = StObject.set(x, "resolver", null)
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setRestoreMocks(value: Boolean): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
      
      inline def setRestoreMocksUndefined: Self = StObject.set(x, "restoreMocks", js.undefined)
      
      inline def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRoots(value: js.Array[Path]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
      
      inline def setRootsVarargs(value: Path*): Self = StObject.set(x, "roots", js.Array(value :_*))
      
      inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
      
      inline def setRunTestsByPathUndefined: Self = StObject.set(x, "runTestsByPath", js.undefined)
      
      inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      inline def setScriptPreprocessor(value: String): Self = StObject.set(x, "scriptPreprocessor", value.asInstanceOf[js.Any])
      
      inline def setScriptPreprocessorUndefined: Self = StObject.set(x, "scriptPreprocessor", js.undefined)
      
      inline def setSetupFiles(value: js.Array[Path]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnv(value: js.Array[Path]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnvUndefined: Self = StObject.set(x, "setupFilesAfterEnv", js.undefined)
      
      inline def setSetupFilesAfterEnvVarargs(value: Path*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value :_*))
      
      inline def setSetupFilesUndefined: Self = StObject.set(x, "setupFiles", js.undefined)
      
      inline def setSetupFilesVarargs(value: Path*): Self = StObject.set(x, "setupFiles", js.Array(value :_*))
      
      inline def setSetupTestFrameworkScriptFile(value: Path): Self = StObject.set(x, "setupTestFrameworkScriptFile", value.asInstanceOf[js.Any])
      
      inline def setSetupTestFrameworkScriptFileUndefined: Self = StObject.set(x, "setupTestFrameworkScriptFile", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
      
      inline def setSkipFilterUndefined: Self = StObject.set(x, "skipFilter", js.undefined)
      
      inline def setSkipNodeResolution(value: Boolean): Self = StObject.set(x, "skipNodeResolution", value.asInstanceOf[js.Any])
      
      inline def setSkipNodeResolutionUndefined: Self = StObject.set(x, "skipNodeResolution", js.undefined)
      
      inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
      
      inline def setSlowTestThresholdUndefined: Self = StObject.set(x, "slowTestThreshold", js.undefined)
      
      inline def setSnapshotResolver(value: Path): Self = StObject.set(x, "snapshotResolver", value.asInstanceOf[js.Any])
      
      inline def setSnapshotResolverUndefined: Self = StObject.set(x, "snapshotResolver", js.undefined)
      
      inline def setSnapshotSerializers(value: js.Array[Path]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializersUndefined: Self = StObject.set(x, "snapshotSerializers", js.undefined)
      
      inline def setSnapshotSerializersVarargs(value: Path*): Self = StObject.set(x, "snapshotSerializers", js.Array(value :_*))
      
      inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentOptions(value: Record[String, js.Any]): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentOptionsUndefined: Self = StObject.set(x, "testEnvironmentOptions", js.undefined)
      
      inline def setTestEnvironmentUndefined: Self = StObject.set(x, "testEnvironment", js.undefined)
      
      inline def setTestFailureExitCode(value: String | Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
      
      inline def setTestFailureExitCodeUndefined: Self = StObject.set(x, "testFailureExitCode", js.undefined)
      
      inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
      
      inline def setTestLocationInResultsUndefined: Self = StObject.set(x, "testLocationInResults", js.undefined)
      
      inline def setTestMatch(value: js.Array[Glob]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      inline def setTestMatchUndefined: Self = StObject.set(x, "testMatch", js.undefined)
      
      inline def setTestMatchVarargs(value: Glob*): Self = StObject.set(x, "testMatch", js.Array(value :_*))
      
      inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      inline def setTestPathDirs(value: js.Array[Path]): Self = StObject.set(x, "testPathDirs", value.asInstanceOf[js.Any])
      
      inline def setTestPathDirsUndefined: Self = StObject.set(x, "testPathDirs", js.undefined)
      
      inline def setTestPathDirsVarargs(value: Path*): Self = StObject.set(x, "testPathDirs", js.Array(value :_*))
      
      inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTestPathIgnorePatternsUndefined: Self = StObject.set(x, "testPathIgnorePatterns", js.undefined)
      
      inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value :_*))
      
      inline def setTestRegex(value: String | js.Array[String]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
      
      inline def setTestRegexUndefined: Self = StObject.set(x, "testRegex", js.undefined)
      
      inline def setTestRegexVarargs(value: String*): Self = StObject.set(x, "testRegex", js.Array(value :_*))
      
      inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
      
      inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
      
      inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
      
      inline def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
      
      inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
      
      inline def setTestSequencerUndefined: Self = StObject.set(x, "testSequencer", js.undefined)
      
      inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
      
      inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
      
      inline def setTestURL(value: String): Self = StObject.set(x, "testURL", value.asInstanceOf[js.Any])
      
      inline def setTestURLUndefined: Self = StObject.set(x, "testURL", js.undefined)
      
      inline def setTimers(value: Timers): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
      
      inline def setTransform(value: StringDictionary[Path | TransformerConfig]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatterns(value: js.Array[Glob]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatternsUndefined: Self = StObject.set(x, "transformIgnorePatterns", js.undefined)
      
      inline def setTransformIgnorePatternsVarargs(value: Glob*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value :_*))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUnmockedModulePathPatterns(value: js.Array[String]): Self = StObject.set(x, "unmockedModulePathPatterns", value.asInstanceOf[js.Any])
      
      inline def setUnmockedModulePathPatternsUndefined: Self = StObject.set(x, "unmockedModulePathPatterns", js.undefined)
      
      inline def setUnmockedModulePathPatternsVarargs(value: String*): Self = StObject.set(x, "unmockedModulePathPatterns", js.Array(value :_*))
      
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
      
      inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value :_*))
      
      inline def setWatchPlugins(value: js.Array[String | (js.Tuple2[String, Record[String, js.Any]])]): Self = StObject.set(x, "watchPlugins", value.asInstanceOf[js.Any])
      
      inline def setWatchPluginsUndefined: Self = StObject.set(x, "watchPlugins", js.undefined)
      
      inline def setWatchPluginsVarargs(value: (String | (js.Tuple2[String, Record[String, js.Any]]))*): Self = StObject.set(x, "watchPlugins", js.Array(value :_*))
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
      
      inline def setWatchmanUndefined: Self = StObject.set(x, "watchman", js.undefined)
    }
  }
  
  /* Inlined @jest/types.@jest/types/build/Config.InitialOptions & std.Required<std.Pick<@jest/types.@jest/types/build/Config.InitialOptions, 'rootDir'>> */
  trait InitialOptionsWithRootDir extends StObject {
    
    var automock: js.UndefOr[Boolean] = js.undefined
    
    var bail: js.UndefOr[Boolean | Double] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cacheDirectory: js.UndefOr[Path] = js.undefined
    
    var changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var clearMocks: js.UndefOr[Boolean] = js.undefined
    
    var collectCoverage: js.UndefOr[Boolean] = js.undefined
    
    var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var coverageDirectory: js.UndefOr[String] = js.undefined
    
    var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var coverageProvider: js.UndefOr[CoverageProvider] = js.undefined
    
    var coverageReporters: js.UndefOr[CoverageReporters] = js.undefined
    
    var coverageThreshold: js.UndefOr[Global] = js.undefined
    
    var dependencyExtractor: js.UndefOr[String] = js.undefined
    
    var detectLeaks: js.UndefOr[Boolean] = js.undefined
    
    var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
    
    var displayName: js.UndefOr[String | DisplayName] = js.undefined
    
    var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
    
    var expand: js.UndefOr[Boolean] = js.undefined
    
    var extraGlobals: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[Path] = js.undefined
    
    var findRelatedTests: js.UndefOr[Boolean] = js.undefined
    
    var forceCoverageMatch: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var forceExit: js.UndefOr[Boolean] = js.undefined
    
    var globalSetup: js.UndefOr[String | Null] = js.undefined
    
    var globalTeardown: js.UndefOr[String | Null] = js.undefined
    
    var globals: js.UndefOr[ConfigGlobals] = js.undefined
    
    var haste: js.UndefOr[HasteConfig] = js.undefined
    
    var injectGlobals: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var lastCommit: js.UndefOr[Boolean] = js.undefined
    
    var listTests: js.UndefOr[Boolean] = js.undefined
    
    var logHeapUsage: js.UndefOr[Boolean] = js.undefined
    
    var mapCoverage: js.UndefOr[Boolean] = js.undefined
    
    var maxConcurrency: js.UndefOr[Double] = js.undefined
    
    var maxWorkers: js.UndefOr[Double | String] = js.undefined
    
    var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
    
    var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var moduleLoader: js.UndefOr[Path] = js.undefined
    
    var moduleNameMapper: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noStackTrace: js.UndefOr[Boolean] = js.undefined
    
    var notifyMode: js.UndefOr[String] = js.undefined
    
    @JSName("notify")
    var notify_FInitialOptionsWithRootDir: js.UndefOr[Boolean] = js.undefined
    
    var onlyChanged: js.UndefOr[Boolean] = js.undefined
    
    var onlyFailures: js.UndefOr[Boolean] = js.undefined
    
    var outputFile: js.UndefOr[Path] = js.undefined
    
    var passWithNoTests: js.UndefOr[Boolean] = js.undefined
    
    var preprocessorIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var preset: js.UndefOr[String | Null] = js.undefined
    
    var prettierPath: js.UndefOr[String | Null] = js.undefined
    
    var projects: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var replname: js.UndefOr[String | Null] = js.undefined
    
    var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.undefined
    
    var resetMocks: js.UndefOr[Boolean] = js.undefined
    
    var resetModules: js.UndefOr[Boolean] = js.undefined
    
    var resolver: js.UndefOr[Path | Null] = js.undefined
    
    var restoreMocks: js.UndefOr[Boolean] = js.undefined
    
    var rootDir: js.UndefOr[Path] & Path
    
    var roots: js.UndefOr[js.Array[Path]] = js.undefined
    
    var runTestsByPath: js.UndefOr[Boolean] = js.undefined
    
    var runner: js.UndefOr[String] = js.undefined
    
    var scriptPreprocessor: js.UndefOr[String] = js.undefined
    
    var setupFiles: js.UndefOr[js.Array[Path]] = js.undefined
    
    var setupFilesAfterEnv: js.UndefOr[js.Array[Path]] = js.undefined
    
    var setupTestFrameworkScriptFile: js.UndefOr[Path] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var skipFilter: js.UndefOr[Boolean] = js.undefined
    
    var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
    
    var slowTestThreshold: js.UndefOr[Double] = js.undefined
    
    var snapshotResolver: js.UndefOr[Path] = js.undefined
    
    var snapshotSerializers: js.UndefOr[js.Array[Path]] = js.undefined
    
    var testEnvironment: js.UndefOr[String] = js.undefined
    
    var testEnvironmentOptions: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var testFailureExitCode: js.UndefOr[String | Double] = js.undefined
    
    var testLocationInResults: js.UndefOr[Boolean] = js.undefined
    
    var testMatch: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var testNamePattern: js.UndefOr[String] = js.undefined
    
    var testPathDirs: js.UndefOr[js.Array[Path]] = js.undefined
    
    var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var testRegex: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var testResultsProcessor: js.UndefOr[String] = js.undefined
    
    var testRunner: js.UndefOr[String] = js.undefined
    
    var testSequencer: js.UndefOr[String] = js.undefined
    
    var testTimeout: js.UndefOr[Double] = js.undefined
    
    var testURL: js.UndefOr[String] = js.undefined
    
    var timers: js.UndefOr[Timers] = js.undefined
    
    var transform: js.UndefOr[StringDictionary[Path | TransformerConfig]] = js.undefined
    
    var transformIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var updateSnapshot: js.UndefOr[Boolean] = js.undefined
    
    var useStderr: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var watchAll: js.UndefOr[Boolean] = js.undefined
    
    var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var watchPlugins: js.UndefOr[js.Array[String | (js.Tuple2[String, Record[String, js.Any]])]] = js.undefined
    
    var watchman: js.UndefOr[Boolean] = js.undefined
  }
  object InitialOptionsWithRootDir {
    
    inline def apply(rootDir: js.UndefOr[Path] & Path): InitialOptionsWithRootDir = {
      val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialOptionsWithRootDir]
    }
    
    extension [Self <: InitialOptionsWithRootDir](x: Self) {
      
      inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
      
      inline def setAutomockUndefined: Self = StObject.set(x, "automock", js.undefined)
      
      inline def setBail(value: Boolean | Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectory(value: Path): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesWithAncestorUndefined: Self = StObject.set(x, "changedFilesWithAncestor", js.undefined)
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
      
      inline def setClearMocksUndefined: Self = StObject.set(x, "clearMocks", js.undefined)
      
      inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFrom(value: js.Array[Glob]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
      
      inline def setCollectCoverageFromVarargs(value: Glob*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value :_*))
      
      inline def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = StObject.set(x, "collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageOnlyFromUndefined: Self = StObject.set(x, "collectCoverageOnlyFrom", js.undefined)
      
      inline def setCollectCoverageUndefined: Self = StObject.set(x, "collectCoverage", js.undefined)
      
      inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      inline def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
      
      inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatternsUndefined: Self = StObject.set(x, "coveragePathIgnorePatterns", js.undefined)
      
      inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value :_*))
      
      inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
      
      inline def setCoverageProviderUndefined: Self = StObject.set(x, "coverageProvider", js.undefined)
      
      inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
      
      inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value :_*))
      
      inline def setCoverageThreshold(value: Global): Self = StObject.set(x, "coverageThreshold", value.asInstanceOf[js.Any])
      
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
      
      inline def setExtraGlobals(value: js.Array[String]): Self = StObject.set(x, "extraGlobals", value.asInstanceOf[js.Any])
      
      inline def setExtraGlobalsUndefined: Self = StObject.set(x, "extraGlobals", js.undefined)
      
      inline def setExtraGlobalsVarargs(value: String*): Self = StObject.set(x, "extraGlobals", js.Array(value :_*))
      
      inline def setFilter(value: Path): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      inline def setFindRelatedTestsUndefined: Self = StObject.set(x, "findRelatedTests", js.undefined)
      
      inline def setForceCoverageMatch(value: js.Array[Glob]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
      
      inline def setForceCoverageMatchUndefined: Self = StObject.set(x, "forceCoverageMatch", js.undefined)
      
      inline def setForceCoverageMatchVarargs(value: Glob*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value :_*))
      
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
      
      inline def setMapCoverage(value: Boolean): Self = StObject.set(x, "mapCoverage", value.asInstanceOf[js.Any])
      
      inline def setMapCoverageUndefined: Self = StObject.set(x, "mapCoverage", js.undefined)
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      inline def setMaxWorkers(value: Double | String): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoriesUndefined: Self = StObject.set(x, "moduleDirectories", js.undefined)
      
      inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value :_*))
      
      inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensionsUndefined: Self = StObject.set(x, "moduleFileExtensions", js.undefined)
      
      inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value :_*))
      
      inline def setModuleLoader(value: Path): Self = StObject.set(x, "moduleLoader", value.asInstanceOf[js.Any])
      
      inline def setModuleLoaderUndefined: Self = StObject.set(x, "moduleLoader", js.undefined)
      
      inline def setModuleNameMapper(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
      
      inline def setModuleNameMapperUndefined: Self = StObject.set(x, "moduleNameMapper", js.undefined)
      
      inline def setModulePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setModulePathIgnorePatternsUndefined: Self = StObject.set(x, "modulePathIgnorePatterns", js.undefined)
      
      inline def setModulePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value :_*))
      
      inline def setModulePaths(value: js.Array[String]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
      
      inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
      
      inline def setModulePathsVarargs(value: String*): Self = StObject.set(x, "modulePaths", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
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
      
      inline def setOutputFile(value: Path): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
      
      inline def setPassWithNoTestsUndefined: Self = StObject.set(x, "passWithNoTests", js.undefined)
      
      inline def setPreprocessorIgnorePatterns(value: js.Array[Glob]): Self = StObject.set(x, "preprocessorIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setPreprocessorIgnorePatternsUndefined: Self = StObject.set(x, "preprocessorIgnorePatterns", js.undefined)
      
      inline def setPreprocessorIgnorePatternsVarargs(value: Glob*): Self = StObject.set(x, "preprocessorIgnorePatterns", js.Array(value :_*))
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetNull: Self = StObject.set(x, "preset", null)
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
      
      inline def setPrettierPathNull: Self = StObject.set(x, "prettierPath", null)
      
      inline def setPrettierPathUndefined: Self = StObject.set(x, "prettierPath", js.undefined)
      
      inline def setProjects(value: js.Array[Glob]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      inline def setProjectsVarargs(value: Glob*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      inline def setReplname(value: String): Self = StObject.set(x, "replname", value.asInstanceOf[js.Any])
      
      inline def setReplnameNull: Self = StObject.set(x, "replname", null)
      
      inline def setReplnameUndefined: Self = StObject.set(x, "replname", js.undefined)
      
      inline def setReporters(value: js.Array[String | ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: (String | ReporterConfig)*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
      
      inline def setResetMocksUndefined: Self = StObject.set(x, "resetMocks", js.undefined)
      
      inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
      
      inline def setResetModulesUndefined: Self = StObject.set(x, "resetModules", js.undefined)
      
      inline def setResolver(value: Path): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverNull: Self = StObject.set(x, "resolver", null)
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setRestoreMocks(value: Boolean): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
      
      inline def setRestoreMocksUndefined: Self = StObject.set(x, "restoreMocks", js.undefined)
      
      inline def setRootDir(value: js.UndefOr[Path] & Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRoots(value: js.Array[Path]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
      
      inline def setRootsVarargs(value: Path*): Self = StObject.set(x, "roots", js.Array(value :_*))
      
      inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
      
      inline def setRunTestsByPathUndefined: Self = StObject.set(x, "runTestsByPath", js.undefined)
      
      inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      inline def setScriptPreprocessor(value: String): Self = StObject.set(x, "scriptPreprocessor", value.asInstanceOf[js.Any])
      
      inline def setScriptPreprocessorUndefined: Self = StObject.set(x, "scriptPreprocessor", js.undefined)
      
      inline def setSetupFiles(value: js.Array[Path]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnv(value: js.Array[Path]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnvUndefined: Self = StObject.set(x, "setupFilesAfterEnv", js.undefined)
      
      inline def setSetupFilesAfterEnvVarargs(value: Path*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value :_*))
      
      inline def setSetupFilesUndefined: Self = StObject.set(x, "setupFiles", js.undefined)
      
      inline def setSetupFilesVarargs(value: Path*): Self = StObject.set(x, "setupFiles", js.Array(value :_*))
      
      inline def setSetupTestFrameworkScriptFile(value: Path): Self = StObject.set(x, "setupTestFrameworkScriptFile", value.asInstanceOf[js.Any])
      
      inline def setSetupTestFrameworkScriptFileUndefined: Self = StObject.set(x, "setupTestFrameworkScriptFile", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
      
      inline def setSkipFilterUndefined: Self = StObject.set(x, "skipFilter", js.undefined)
      
      inline def setSkipNodeResolution(value: Boolean): Self = StObject.set(x, "skipNodeResolution", value.asInstanceOf[js.Any])
      
      inline def setSkipNodeResolutionUndefined: Self = StObject.set(x, "skipNodeResolution", js.undefined)
      
      inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
      
      inline def setSlowTestThresholdUndefined: Self = StObject.set(x, "slowTestThreshold", js.undefined)
      
      inline def setSnapshotResolver(value: Path): Self = StObject.set(x, "snapshotResolver", value.asInstanceOf[js.Any])
      
      inline def setSnapshotResolverUndefined: Self = StObject.set(x, "snapshotResolver", js.undefined)
      
      inline def setSnapshotSerializers(value: js.Array[Path]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializersUndefined: Self = StObject.set(x, "snapshotSerializers", js.undefined)
      
      inline def setSnapshotSerializersVarargs(value: Path*): Self = StObject.set(x, "snapshotSerializers", js.Array(value :_*))
      
      inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentOptions(value: Record[String, js.Any]): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentOptionsUndefined: Self = StObject.set(x, "testEnvironmentOptions", js.undefined)
      
      inline def setTestEnvironmentUndefined: Self = StObject.set(x, "testEnvironment", js.undefined)
      
      inline def setTestFailureExitCode(value: String | Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
      
      inline def setTestFailureExitCodeUndefined: Self = StObject.set(x, "testFailureExitCode", js.undefined)
      
      inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
      
      inline def setTestLocationInResultsUndefined: Self = StObject.set(x, "testLocationInResults", js.undefined)
      
      inline def setTestMatch(value: js.Array[Glob]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      inline def setTestMatchUndefined: Self = StObject.set(x, "testMatch", js.undefined)
      
      inline def setTestMatchVarargs(value: Glob*): Self = StObject.set(x, "testMatch", js.Array(value :_*))
      
      inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      inline def setTestPathDirs(value: js.Array[Path]): Self = StObject.set(x, "testPathDirs", value.asInstanceOf[js.Any])
      
      inline def setTestPathDirsUndefined: Self = StObject.set(x, "testPathDirs", js.undefined)
      
      inline def setTestPathDirsVarargs(value: Path*): Self = StObject.set(x, "testPathDirs", js.Array(value :_*))
      
      inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTestPathIgnorePatternsUndefined: Self = StObject.set(x, "testPathIgnorePatterns", js.undefined)
      
      inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value :_*))
      
      inline def setTestRegex(value: String | js.Array[String]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
      
      inline def setTestRegexUndefined: Self = StObject.set(x, "testRegex", js.undefined)
      
      inline def setTestRegexVarargs(value: String*): Self = StObject.set(x, "testRegex", js.Array(value :_*))
      
      inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
      
      inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
      
      inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
      
      inline def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
      
      inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
      
      inline def setTestSequencerUndefined: Self = StObject.set(x, "testSequencer", js.undefined)
      
      inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
      
      inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
      
      inline def setTestURL(value: String): Self = StObject.set(x, "testURL", value.asInstanceOf[js.Any])
      
      inline def setTestURLUndefined: Self = StObject.set(x, "testURL", js.undefined)
      
      inline def setTimers(value: Timers): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
      
      inline def setTransform(value: StringDictionary[Path | TransformerConfig]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatterns(value: js.Array[Glob]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatternsUndefined: Self = StObject.set(x, "transformIgnorePatterns", js.undefined)
      
      inline def setTransformIgnorePatternsVarargs(value: Glob*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value :_*))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUnmockedModulePathPatterns(value: js.Array[String]): Self = StObject.set(x, "unmockedModulePathPatterns", value.asInstanceOf[js.Any])
      
      inline def setUnmockedModulePathPatternsUndefined: Self = StObject.set(x, "unmockedModulePathPatterns", js.undefined)
      
      inline def setUnmockedModulePathPatternsVarargs(value: String*): Self = StObject.set(x, "unmockedModulePathPatterns", js.Array(value :_*))
      
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
      
      inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value :_*))
      
      inline def setWatchPlugins(value: js.Array[String | (js.Tuple2[String, Record[String, js.Any]])]): Self = StObject.set(x, "watchPlugins", value.asInstanceOf[js.Any])
      
      inline def setWatchPluginsUndefined: Self = StObject.set(x, "watchPlugins", js.undefined)
      
      inline def setWatchPluginsVarargs(value: (String | (js.Tuple2[String, Record[String, js.Any]]))*): Self = StObject.set(x, "watchPlugins", js.Array(value :_*))
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
      
      inline def setWatchmanUndefined: Self = StObject.set(x, "watchman", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestTypes.jestTypesStrings.always
    - typings.jestTypes.jestTypesStrings.failure
    - typings.jestTypes.jestTypesStrings.success
    - typings.jestTypes.jestTypesStrings.change
    - typings.jestTypes.jestTypesStrings.`success-change`
    - typings.jestTypes.jestTypesStrings.`failure-change`
  */
  trait NotifyMode extends StObject
  object NotifyMode {
    
    inline def always: typings.jestTypes.jestTypesStrings.always = "always".asInstanceOf[typings.jestTypes.jestTypesStrings.always]
    
    inline def change: typings.jestTypes.jestTypesStrings.change = "change".asInstanceOf[typings.jestTypes.jestTypesStrings.change]
    
    inline def failure: typings.jestTypes.jestTypesStrings.failure = "failure".asInstanceOf[typings.jestTypes.jestTypesStrings.failure]
    
    inline def `failure-change`: typings.jestTypes.jestTypesStrings.`failure-change` = "failure-change".asInstanceOf[typings.jestTypes.jestTypesStrings.`failure-change`]
    
    inline def success: typings.jestTypes.jestTypesStrings.success = "success".asInstanceOf[typings.jestTypes.jestTypesStrings.success]
    
    inline def `success-change`: typings.jestTypes.jestTypesStrings.`success-change` = "success-change".asInstanceOf[typings.jestTypes.jestTypesStrings.`success-change`]
  }
  
  type Path = String
  
  trait ProjectConfig extends StObject {
    
    var automock: Boolean
    
    var cache: Boolean
    
    var cacheDirectory: Path
    
    var clearMocks: Boolean
    
    var coveragePathIgnorePatterns: js.Array[String]
    
    var cwd: Path
    
    var dependencyExtractor: js.UndefOr[String] = js.undefined
    
    var detectLeaks: Boolean
    
    var detectOpenHandles: Boolean
    
    var displayName: js.UndefOr[DisplayName] = js.undefined
    
    var errorOnDeprecated: Boolean
    
    var extraGlobals: js.Array[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
      ]
    
    var filter: js.UndefOr[Path] = js.undefined
    
    var forceCoverageMatch: js.Array[Glob]
    
    var globalSetup: js.UndefOr[String] = js.undefined
    
    var globalTeardown: js.UndefOr[String] = js.undefined
    
    var globals: ConfigGlobals
    
    var haste: HasteConfig
    
    var injectGlobals: Boolean
    
    var moduleDirectories: js.Array[String]
    
    var moduleFileExtensions: js.Array[String]
    
    var moduleLoader: js.UndefOr[Path] = js.undefined
    
    var moduleNameMapper: js.Array[js.Tuple2[String, String]]
    
    var modulePathIgnorePatterns: js.Array[String]
    
    var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var prettierPath: String
    
    var resetMocks: Boolean
    
    var resetModules: Boolean
    
    var resolver: js.UndefOr[Path] = js.undefined
    
    var restoreMocks: Boolean
    
    var rootDir: Path
    
    var roots: js.Array[Path]
    
    var runner: String
    
    var setupFiles: js.Array[Path]
    
    var setupFilesAfterEnv: js.Array[Path]
    
    var skipFilter: Boolean
    
    var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
    
    var slowTestThreshold: Double
    
    var snapshotResolver: js.UndefOr[Path] = js.undefined
    
    var snapshotSerializers: js.Array[Path]
    
    var testEnvironment: String
    
    var testEnvironmentOptions: Record[String, js.Any]
    
    var testLocationInResults: Boolean
    
    var testMatch: js.Array[Glob]
    
    var testPathIgnorePatterns: js.Array[String]
    
    var testRegex: js.Array[String | RegExp]
    
    var testRunner: String
    
    var testURL: String
    
    var timers: Timers
    
    var transform: js.Array[js.Tuple3[String, Path, Record[String, js.Any]]]
    
    var transformIgnorePatterns: js.Array[Glob]
    
    var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var watchPathIgnorePatterns: js.Array[String]
  }
  object ProjectConfig {
    
    inline def apply(
      automock: Boolean,
      cache: Boolean,
      cacheDirectory: Path,
      clearMocks: Boolean,
      coveragePathIgnorePatterns: js.Array[String],
      cwd: Path,
      detectLeaks: Boolean,
      detectOpenHandles: Boolean,
      errorOnDeprecated: Boolean,
      extraGlobals: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
        ],
      forceCoverageMatch: js.Array[Glob],
      globals: ConfigGlobals,
      haste: HasteConfig,
      injectGlobals: Boolean,
      moduleDirectories: js.Array[String],
      moduleFileExtensions: js.Array[String],
      moduleNameMapper: js.Array[js.Tuple2[String, String]],
      modulePathIgnorePatterns: js.Array[String],
      name: String,
      prettierPath: String,
      resetMocks: Boolean,
      resetModules: Boolean,
      restoreMocks: Boolean,
      rootDir: Path,
      roots: js.Array[Path],
      runner: String,
      setupFiles: js.Array[Path],
      setupFilesAfterEnv: js.Array[Path],
      skipFilter: Boolean,
      slowTestThreshold: Double,
      snapshotSerializers: js.Array[Path],
      testEnvironment: String,
      testEnvironmentOptions: Record[String, js.Any],
      testLocationInResults: Boolean,
      testMatch: js.Array[Glob],
      testPathIgnorePatterns: js.Array[String],
      testRegex: js.Array[String | RegExp],
      testRunner: String,
      testURL: String,
      timers: Timers,
      transform: js.Array[js.Tuple3[String, Path, Record[String, js.Any]]],
      transformIgnorePatterns: js.Array[Glob],
      watchPathIgnorePatterns: js.Array[String]
    ): ProjectConfig = {
      val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], injectGlobals = injectGlobals.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectConfig]
    }
    
    extension [Self <: ProjectConfig](x: Self) {
      
      inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectory(value: Path): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value :_*))
      
      inline def setCwd(value: Path): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
      
      inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
      
      inline def setDetectLeaks(value: Boolean): Self = StObject.set(x, "detectLeaks", value.asInstanceOf[js.Any])
      
      inline def setDetectOpenHandles(value: Boolean): Self = StObject.set(x, "detectOpenHandles", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
      
      inline def setExtraGlobals(
        value: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
            ]
      ): Self = StObject.set(x, "extraGlobals", value.asInstanceOf[js.Any])
      
      inline def setExtraGlobalsVarargs(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any)*): Self = StObject.set(x, "extraGlobals", js.Array(value :_*))
      
      inline def setFilter(value: Path): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setForceCoverageMatch(value: js.Array[Glob]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
      
      inline def setForceCoverageMatchVarargs(value: Glob*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value :_*))
      
      inline def setGlobalSetup(value: String): Self = StObject.set(x, "globalSetup", value.asInstanceOf[js.Any])
      
      inline def setGlobalSetupUndefined: Self = StObject.set(x, "globalSetup", js.undefined)
      
      inline def setGlobalTeardown(value: String): Self = StObject.set(x, "globalTeardown", value.asInstanceOf[js.Any])
      
      inline def setGlobalTeardownUndefined: Self = StObject.set(x, "globalTeardown", js.undefined)
      
      inline def setGlobals(value: ConfigGlobals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setHaste(value: HasteConfig): Self = StObject.set(x, "haste", value.asInstanceOf[js.Any])
      
      inline def setInjectGlobals(value: Boolean): Self = StObject.set(x, "injectGlobals", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value :_*))
      
      inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value :_*))
      
      inline def setModuleLoader(value: Path): Self = StObject.set(x, "moduleLoader", value.asInstanceOf[js.Any])
      
      inline def setModuleLoaderUndefined: Self = StObject.set(x, "moduleLoader", js.undefined)
      
      inline def setModuleNameMapper(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
      
      inline def setModuleNameMapperVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "moduleNameMapper", js.Array(value :_*))
      
      inline def setModulePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setModulePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value :_*))
      
      inline def setModulePaths(value: js.Array[String]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
      
      inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
      
      inline def setModulePathsVarargs(value: String*): Self = StObject.set(x, "modulePaths", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
      
      inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
      
      inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
      
      inline def setResolver(value: Path): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setRestoreMocks(value: Boolean): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRoots(value: js.Array[Path]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: Path*): Self = StObject.set(x, "roots", js.Array(value :_*))
      
      inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setSetupFiles(value: js.Array[Path]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnv(value: js.Array[Path]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
      
      inline def setSetupFilesAfterEnvVarargs(value: Path*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value :_*))
      
      inline def setSetupFilesVarargs(value: Path*): Self = StObject.set(x, "setupFiles", js.Array(value :_*))
      
      inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
      
      inline def setSkipNodeResolution(value: Boolean): Self = StObject.set(x, "skipNodeResolution", value.asInstanceOf[js.Any])
      
      inline def setSkipNodeResolutionUndefined: Self = StObject.set(x, "skipNodeResolution", js.undefined)
      
      inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
      
      inline def setSnapshotResolver(value: Path): Self = StObject.set(x, "snapshotResolver", value.asInstanceOf[js.Any])
      
      inline def setSnapshotResolverUndefined: Self = StObject.set(x, "snapshotResolver", js.undefined)
      
      inline def setSnapshotSerializers(value: js.Array[Path]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializersVarargs(value: Path*): Self = StObject.set(x, "snapshotSerializers", js.Array(value :_*))
      
      inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentOptions(value: Record[String, js.Any]): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
      
      inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
      
      inline def setTestMatch(value: js.Array[Glob]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      inline def setTestMatchVarargs(value: Glob*): Self = StObject.set(x, "testMatch", js.Array(value :_*))
      
      inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value :_*))
      
      inline def setTestRegex(value: js.Array[String | RegExp]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
      
      inline def setTestRegexVarargs(value: (String | RegExp)*): Self = StObject.set(x, "testRegex", js.Array(value :_*))
      
      inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
      
      inline def setTestURL(value: String): Self = StObject.set(x, "testURL", value.asInstanceOf[js.Any])
      
      inline def setTimers(value: Timers): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: js.Array[js.Tuple3[String, Path, Record[String, js.Any]]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatterns(value: js.Array[Glob]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatternsVarargs(value: Glob*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value :_*))
      
      inline def setTransformVarargs(value: (js.Tuple3[String, Path, Record[String, js.Any]])*): Self = StObject.set(x, "transform", js.Array(value :_*))
      
      inline def setUnmockedModulePathPatterns(value: js.Array[String]): Self = StObject.set(x, "unmockedModulePathPatterns", value.asInstanceOf[js.Any])
      
      inline def setUnmockedModulePathPatternsUndefined: Self = StObject.set(x, "unmockedModulePathPatterns", js.undefined)
      
      inline def setUnmockedModulePathPatternsVarargs(value: String*): Self = StObject.set(x, "unmockedModulePathPatterns", js.Array(value :_*))
      
      inline def setWatchPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value :_*))
    }
  }
  
  type ReporterConfig = js.Tuple2[String, Record[String, js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestTypes.jestTypesStrings.all
    - typings.jestTypes.jestTypesStrings.`new`
    - typings.jestTypes.jestTypesStrings.none
  */
  trait SnapshotUpdateState extends StObject
  object SnapshotUpdateState {
    
    inline def all: typings.jestTypes.jestTypesStrings.all = "all".asInstanceOf[typings.jestTypes.jestTypesStrings.all]
    
    inline def `new`: typings.jestTypes.jestTypesStrings.`new` = "new".asInstanceOf[typings.jestTypes.jestTypesStrings.`new`]
    
    inline def none: typings.jestTypes.jestTypesStrings.none = "none".asInstanceOf[typings.jestTypes.jestTypesStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestTypes.jestTypesStrings.real
    - typings.jestTypes.jestTypesStrings.fake
    - typings.jestTypes.jestTypesStrings.modern
    - typings.jestTypes.jestTypesStrings.legacy
  */
  trait Timers extends StObject
  object Timers {
    
    inline def fake: typings.jestTypes.jestTypesStrings.fake = "fake".asInstanceOf[typings.jestTypes.jestTypesStrings.fake]
    
    inline def legacy: typings.jestTypes.jestTypesStrings.legacy = "legacy".asInstanceOf[typings.jestTypes.jestTypesStrings.legacy]
    
    inline def modern: typings.jestTypes.jestTypesStrings.modern = "modern".asInstanceOf[typings.jestTypes.jestTypesStrings.modern]
    
    inline def real: typings.jestTypes.jestTypesStrings.real = "real".asInstanceOf[typings.jestTypes.jestTypesStrings.real]
  }
  
  type TransformerConfig = js.Tuple2[String, Record[String, js.Any]]
}
