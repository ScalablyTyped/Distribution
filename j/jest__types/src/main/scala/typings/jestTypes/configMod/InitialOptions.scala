package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.anon.Global
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  automock :boolean,   bail :boolean | number,   cache :boolean,   cacheDirectory :@jest/types.@jest/types/build/Config.Path,   clearMocks :boolean,   changedFilesWithAncestor :boolean,   changedSince :string,   collectCoverage :boolean,   collectCoverageFrom :std.Array<@jest/types.@jest/types/build/Config.Glob>,   collectCoverageOnlyFrom :{[key: string] : boolean},   coverageDirectory :string,   coveragePathIgnorePatterns :std.Array<string>,   coverageProvider :@jest/types.@jest/types/build/Config.CoverageProvider,   coverageReporters :@jest/types.@jest/types/build/Config.CoverageReporters,   coverageThreshold :{  global :{[key: string] : number}},   dependencyExtractor :string,   detectLeaks :boolean,   detectOpenHandles :boolean,   displayName :string | @jest/types.@jest/types/build/Config.DisplayName,   expand :boolean,   extraGlobals :std.Array<string>,   filter :@jest/types.@jest/types/build/Config.Path,   findRelatedTests :boolean,   forceCoverageMatch :std.Array<@jest/types.@jest/types/build/Config.Glob>,   forceExit :boolean,   json :boolean,   globals :@jest/types.@jest/types/build/Config.ConfigGlobals,   globalSetup :string | null | undefined,   globalTeardown :string | null | undefined,   haste :@jest/types.@jest/types/build/Config.HasteConfig,   injectGlobals :boolean,   reporters :std.Array<string | @jest/types.@jest/types/build/Config.ReporterConfig>,   logHeapUsage :boolean,   lastCommit :boolean,   listTests :boolean,   mapCoverage :boolean,   maxConcurrency :number,   maxWorkers :number | string,   moduleDirectories :std.Array<string>,   moduleFileExtensions :std.Array<string>,   moduleLoader :@jest/types.@jest/types/build/Config.Path,   moduleNameMapper :{[key: string] : string | std.Array<string>},   modulePathIgnorePatterns :std.Array<string>,   modulePaths :std.Array<string>,   name :string,   noStackTrace :boolean,   notify :boolean,   notifyMode :string,   onlyChanged :boolean,   onlyFailures :boolean,   outputFile :@jest/types.@jest/types/build/Config.Path,   passWithNoTests :boolean,   preprocessorIgnorePatterns :std.Array<@jest/types.@jest/types/build/Config.Glob>,   preset :string | null | undefined,   prettierPath :string | null | undefined,   projects :std.Array<@jest/types.@jest/types/build/Config.Glob>,   replname :string | null | undefined,   resetMocks :boolean,   resetModules :boolean,   resolver :@jest/types.@jest/types/build/Config.Path | null | undefined,   restoreMocks :boolean,   rootDir :@jest/types.@jest/types/build/Config.Path,   roots :std.Array<@jest/types.@jest/types/build/Config.Path>,   runner :string,   runTestsByPath :boolean,   scriptPreprocessor :string,   setupFiles :std.Array<@jest/types.@jest/types/build/Config.Path>,   setupTestFrameworkScriptFile :@jest/types.@jest/types/build/Config.Path,   setupFilesAfterEnv :std.Array<@jest/types.@jest/types/build/Config.Path>,   silent :boolean,   skipFilter :boolean,   skipNodeResolution :boolean,   slowTestThreshold :number,   snapshotResolver :@jest/types.@jest/types/build/Config.Path,   snapshotSerializers :std.Array<@jest/types.@jest/types/build/Config.Path>,   errorOnDeprecated :boolean,   testEnvironment :string,   testEnvironmentOptions :std.Record<string, unknown>,   testFailureExitCode :string | number,   testLocationInResults :boolean,   testMatch :std.Array<@jest/types.@jest/types/build/Config.Glob>,   testNamePattern :string,   testPathDirs :std.Array<@jest/types.@jest/types/build/Config.Path>,   testPathIgnorePatterns :std.Array<string>,   testRegex :string | std.Array<string>,   testResultsProcessor :string,   testRunner :string,   testSequencer :string,   testURL :string,   testTimeout :number,   timers :@jest/types.@jest/types/build/Config.Timers,   transform :{[regex: string] : @jest/types.@jest/types/build/Config.Path | @jest/types.@jest/types/build/Config.TransformerConfig},   transformIgnorePatterns :std.Array<@jest/types.@jest/types/build/Config.Glob>,   watchPathIgnorePatterns :std.Array<string>,   unmockedModulePathPatterns :std.Array<string>,   updateSnapshot :boolean,   useStderr :boolean,   verbose :boolean | undefined,   watch :boolean,   watchAll :boolean,   watchman :boolean,   watchPlugins :std.Array<string | [string, std.Record<string, unknown>]>}> */
@js.native
trait InitialOptions extends js.Object {
  
  var automock: js.UndefOr[Boolean] = js.native
  
  var bail: js.UndefOr[Boolean | Double] = js.native
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var cacheDirectory: js.UndefOr[Path] = js.native
  
  var changedFilesWithAncestor: js.UndefOr[Boolean] = js.native
  
  var changedSince: js.UndefOr[String] = js.native
  
  var clearMocks: js.UndefOr[Boolean] = js.native
  
  var collectCoverage: js.UndefOr[Boolean] = js.native
  
  var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.native
  
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var coverageDirectory: js.UndefOr[String] = js.native
  
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  
  var coverageProvider: js.UndefOr[CoverageProvider] = js.native
  
  var coverageReporters: js.UndefOr[CoverageReporters] = js.native
  
  var coverageThreshold: js.UndefOr[Global] = js.native
  
  var dependencyExtractor: js.UndefOr[String] = js.native
  
  var detectLeaks: js.UndefOr[Boolean] = js.native
  
  var detectOpenHandles: js.UndefOr[Boolean] = js.native
  
  var displayName: js.UndefOr[String | DisplayName] = js.native
  
  var errorOnDeprecated: js.UndefOr[Boolean] = js.native
  
  var expand: js.UndefOr[Boolean] = js.native
  
  var extraGlobals: js.UndefOr[js.Array[String]] = js.native
  
  var filter: js.UndefOr[Path] = js.native
  
  var findRelatedTests: js.UndefOr[Boolean] = js.native
  
  var forceCoverageMatch: js.UndefOr[js.Array[Glob]] = js.native
  
  var forceExit: js.UndefOr[Boolean] = js.native
  
  var globalSetup: js.UndefOr[String | Null] = js.native
  
  var globalTeardown: js.UndefOr[String | Null] = js.native
  
  var globals: js.UndefOr[ConfigGlobals] = js.native
  
  var haste: js.UndefOr[HasteConfig] = js.native
  
  var injectGlobals: js.UndefOr[Boolean] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
  
  var lastCommit: js.UndefOr[Boolean] = js.native
  
  var listTests: js.UndefOr[Boolean] = js.native
  
  var logHeapUsage: js.UndefOr[Boolean] = js.native
  
  var mapCoverage: js.UndefOr[Boolean] = js.native
  
  var maxConcurrency: js.UndefOr[Double] = js.native
  
  var maxWorkers: js.UndefOr[Double | String] = js.native
  
  var moduleDirectories: js.UndefOr[js.Array[String]] = js.native
  
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.native
  
  var moduleLoader: js.UndefOr[Path] = js.native
  
  var moduleNameMapper: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  
  var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  
  var modulePaths: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noStackTrace: js.UndefOr[Boolean] = js.native
  
  var notifyMode: js.UndefOr[String] = js.native
  
  @JSName("notify")
  var notify_FInitialOptions: js.UndefOr[Boolean] = js.native
  
  var onlyChanged: js.UndefOr[Boolean] = js.native
  
  var onlyFailures: js.UndefOr[Boolean] = js.native
  
  var outputFile: js.UndefOr[Path] = js.native
  
  var passWithNoTests: js.UndefOr[Boolean] = js.native
  
  var preprocessorIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.native
  
  var preset: js.UndefOr[String | Null] = js.native
  
  var prettierPath: js.UndefOr[String | Null] = js.native
  
  var projects: js.UndefOr[js.Array[Glob]] = js.native
  
  var replname: js.UndefOr[String | Null] = js.native
  
  var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.native
  
  var resetMocks: js.UndefOr[Boolean] = js.native
  
  var resetModules: js.UndefOr[Boolean] = js.native
  
  var resolver: js.UndefOr[Path | Null] = js.native
  
  var restoreMocks: js.UndefOr[Boolean] = js.native
  
  var rootDir: js.UndefOr[Path] = js.native
  
  var roots: js.UndefOr[js.Array[Path]] = js.native
  
  var runTestsByPath: js.UndefOr[Boolean] = js.native
  
  var runner: js.UndefOr[String] = js.native
  
  var scriptPreprocessor: js.UndefOr[String] = js.native
  
  var setupFiles: js.UndefOr[js.Array[Path]] = js.native
  
  var setupFilesAfterEnv: js.UndefOr[js.Array[Path]] = js.native
  
  var setupTestFrameworkScriptFile: js.UndefOr[Path] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var skipFilter: js.UndefOr[Boolean] = js.native
  
  var skipNodeResolution: js.UndefOr[Boolean] = js.native
  
  var slowTestThreshold: js.UndefOr[Double] = js.native
  
  var snapshotResolver: js.UndefOr[Path] = js.native
  
  var snapshotSerializers: js.UndefOr[js.Array[Path]] = js.native
  
  var testEnvironment: js.UndefOr[String] = js.native
  
  var testEnvironmentOptions: js.UndefOr[Record[String, _]] = js.native
  
  var testFailureExitCode: js.UndefOr[String | Double] = js.native
  
  var testLocationInResults: js.UndefOr[Boolean] = js.native
  
  var testMatch: js.UndefOr[js.Array[Glob]] = js.native
  
  var testNamePattern: js.UndefOr[String] = js.native
  
  var testPathDirs: js.UndefOr[js.Array[Path]] = js.native
  
  var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  
  var testRegex: js.UndefOr[String | js.Array[String]] = js.native
  
  var testResultsProcessor: js.UndefOr[String] = js.native
  
  var testRunner: js.UndefOr[String] = js.native
  
  var testSequencer: js.UndefOr[String] = js.native
  
  var testTimeout: js.UndefOr[Double] = js.native
  
  var testURL: js.UndefOr[String] = js.native
  
  var timers: js.UndefOr[Timers] = js.native
  
  var transform: js.UndefOr[StringDictionary[Path | TransformerConfig]] = js.native
  
  var transformIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.native
  
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.native
  
  var updateSnapshot: js.UndefOr[Boolean] = js.native
  
  var useStderr: js.UndefOr[Boolean] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
  
  var watch: js.UndefOr[Boolean] = js.native
  
  var watchAll: js.UndefOr[Boolean] = js.native
  
  var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  
  var watchPlugins: js.UndefOr[js.Array[String | (js.Tuple2[String, Record[String, _]])]] = js.native
  
  var watchman: js.UndefOr[Boolean] = js.native
}
object InitialOptions {
  
  @scala.inline
  def apply(): InitialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialOptions]
  }
  
  @scala.inline
  implicit class InitialOptionsOps[Self <: InitialOptions] (val x: Self) extends AnyVal {
    
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
    def setAutomock(value: Boolean): Self = this.set("automock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomock: Self = this.set("automock", js.undefined)
    
    @scala.inline
    def setBail(value: Boolean | Double): Self = this.set("bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheDirectory(value: Path): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDirectory: Self = this.set("cacheDirectory", js.undefined)
    
    @scala.inline
    def setChangedFilesWithAncestor(value: Boolean): Self = this.set("changedFilesWithAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedFilesWithAncestor: Self = this.set("changedFilesWithAncestor", js.undefined)
    
    @scala.inline
    def setChangedSince(value: String): Self = this.set("changedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedSince: Self = this.set("changedSince", js.undefined)
    
    @scala.inline
    def setClearMocks(value: Boolean): Self = this.set("clearMocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearMocks: Self = this.set("clearMocks", js.undefined)
    
    @scala.inline
    def setCollectCoverage(value: Boolean): Self = this.set("collectCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectCoverage: Self = this.set("collectCoverage", js.undefined)
    
    @scala.inline
    def setCollectCoverageFromVarargs(value: Glob*): Self = this.set("collectCoverageFrom", js.Array(value :_*))
    
    @scala.inline
    def setCollectCoverageFrom(value: js.Array[Glob]): Self = this.set("collectCoverageFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectCoverageFrom: Self = this.set("collectCoverageFrom", js.undefined)
    
    @scala.inline
    def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = this.set("collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectCoverageOnlyFrom: Self = this.set("collectCoverageOnlyFrom", js.undefined)
    
    @scala.inline
    def setCoverageDirectory(value: String): Self = this.set("coverageDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageDirectory: Self = this.set("coverageDirectory", js.undefined)
    
    @scala.inline
    def setCoveragePathIgnorePatternsVarargs(value: String*): Self = this.set("coveragePathIgnorePatterns", js.Array(value :_*))
    
    @scala.inline
    def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = this.set("coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoveragePathIgnorePatterns: Self = this.set("coveragePathIgnorePatterns", js.undefined)
    
    @scala.inline
    def setCoverageProvider(value: CoverageProvider): Self = this.set("coverageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageProvider: Self = this.set("coverageProvider", js.undefined)
    
    @scala.inline
    def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = this.set("coverageReporters", js.Array(value :_*))
    
    @scala.inline
    def setCoverageReporters(value: CoverageReporters): Self = this.set("coverageReporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageReporters: Self = this.set("coverageReporters", js.undefined)
    
    @scala.inline
    def setCoverageThreshold(value: Global): Self = this.set("coverageThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageThreshold: Self = this.set("coverageThreshold", js.undefined)
    
    @scala.inline
    def setDependencyExtractor(value: String): Self = this.set("dependencyExtractor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencyExtractor: Self = this.set("dependencyExtractor", js.undefined)
    
    @scala.inline
    def setDetectLeaks(value: Boolean): Self = this.set("detectLeaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectLeaks: Self = this.set("detectLeaks", js.undefined)
    
    @scala.inline
    def setDetectOpenHandles(value: Boolean): Self = this.set("detectOpenHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectOpenHandles: Self = this.set("detectOpenHandles", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String | DisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setErrorOnDeprecated(value: Boolean): Self = this.set("errorOnDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOnDeprecated: Self = this.set("errorOnDeprecated", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setExtraGlobalsVarargs(value: String*): Self = this.set("extraGlobals", js.Array(value :_*))
    
    @scala.inline
    def setExtraGlobals(value: js.Array[String]): Self = this.set("extraGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraGlobals: Self = this.set("extraGlobals", js.undefined)
    
    @scala.inline
    def setFilter(value: Path): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFindRelatedTests(value: Boolean): Self = this.set("findRelatedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindRelatedTests: Self = this.set("findRelatedTests", js.undefined)
    
    @scala.inline
    def setForceCoverageMatchVarargs(value: Glob*): Self = this.set("forceCoverageMatch", js.Array(value :_*))
    
    @scala.inline
    def setForceCoverageMatch(value: js.Array[Glob]): Self = this.set("forceCoverageMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceCoverageMatch: Self = this.set("forceCoverageMatch", js.undefined)
    
    @scala.inline
    def setForceExit(value: Boolean): Self = this.set("forceExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceExit: Self = this.set("forceExit", js.undefined)
    
    @scala.inline
    def setGlobalSetup(value: String): Self = this.set("globalSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSetup: Self = this.set("globalSetup", js.undefined)
    
    @scala.inline
    def setGlobalSetupNull: Self = this.set("globalSetup", null)
    
    @scala.inline
    def setGlobalTeardown(value: String): Self = this.set("globalTeardown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTeardown: Self = this.set("globalTeardown", js.undefined)
    
    @scala.inline
    def setGlobalTeardownNull: Self = this.set("globalTeardown", null)
    
    @scala.inline
    def setGlobals(value: ConfigGlobals): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setHaste(value: HasteConfig): Self = this.set("haste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaste: Self = this.set("haste", js.undefined)
    
    @scala.inline
    def setInjectGlobals(value: Boolean): Self = this.set("injectGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectGlobals: Self = this.set("injectGlobals", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setLastCommit(value: Boolean): Self = this.set("lastCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCommit: Self = this.set("lastCommit", js.undefined)
    
    @scala.inline
    def setListTests(value: Boolean): Self = this.set("listTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListTests: Self = this.set("listTests", js.undefined)
    
    @scala.inline
    def setLogHeapUsage(value: Boolean): Self = this.set("logHeapUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogHeapUsage: Self = this.set("logHeapUsage", js.undefined)
    
    @scala.inline
    def setMapCoverage(value: Boolean): Self = this.set("mapCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapCoverage: Self = this.set("mapCoverage", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("maxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxWorkers(value: Double | String): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
    
    @scala.inline
    def setModuleDirectoriesVarargs(value: String*): Self = this.set("moduleDirectories", js.Array(value :_*))
    
    @scala.inline
    def setModuleDirectories(value: js.Array[String]): Self = this.set("moduleDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleDirectories: Self = this.set("moduleDirectories", js.undefined)
    
    @scala.inline
    def setModuleFileExtensionsVarargs(value: String*): Self = this.set("moduleFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setModuleFileExtensions(value: js.Array[String]): Self = this.set("moduleFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleFileExtensions: Self = this.set("moduleFileExtensions", js.undefined)
    
    @scala.inline
    def setModuleLoader(value: Path): Self = this.set("moduleLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleLoader: Self = this.set("moduleLoader", js.undefined)
    
    @scala.inline
    def setModuleNameMapper(value: StringDictionary[String | js.Array[String]]): Self = this.set("moduleNameMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleNameMapper: Self = this.set("moduleNameMapper", js.undefined)
    
    @scala.inline
    def setModulePathIgnorePatternsVarargs(value: String*): Self = this.set("modulePathIgnorePatterns", js.Array(value :_*))
    
    @scala.inline
    def setModulePathIgnorePatterns(value: js.Array[String]): Self = this.set("modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulePathIgnorePatterns: Self = this.set("modulePathIgnorePatterns", js.undefined)
    
    @scala.inline
    def setModulePathsVarargs(value: String*): Self = this.set("modulePaths", js.Array(value :_*))
    
    @scala.inline
    def setModulePaths(value: js.Array[String]): Self = this.set("modulePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulePaths: Self = this.set("modulePaths", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoStackTrace(value: Boolean): Self = this.set("noStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoStackTrace: Self = this.set("noStackTrace", js.undefined)
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    
    @scala.inline
    def setNotifyMode(value: String): Self = this.set("notifyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyMode: Self = this.set("notifyMode", js.undefined)
    
    @scala.inline
    def setOnlyChanged(value: Boolean): Self = this.set("onlyChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyChanged: Self = this.set("onlyChanged", js.undefined)
    
    @scala.inline
    def setOnlyFailures(value: Boolean): Self = this.set("onlyFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyFailures: Self = this.set("onlyFailures", js.undefined)
    
    @scala.inline
    def setOutputFile(value: Path): Self = this.set("outputFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFile: Self = this.set("outputFile", js.undefined)
    
    @scala.inline
    def setPassWithNoTests(value: Boolean): Self = this.set("passWithNoTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassWithNoTests: Self = this.set("passWithNoTests", js.undefined)
    
    @scala.inline
    def setPreprocessorIgnorePatternsVarargs(value: Glob*): Self = this.set("preprocessorIgnorePatterns", js.Array(value :_*))
    
    @scala.inline
    def setPreprocessorIgnorePatterns(value: js.Array[Glob]): Self = this.set("preprocessorIgnorePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreprocessorIgnorePatterns: Self = this.set("preprocessorIgnorePatterns", js.undefined)
    
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setPresetNull: Self = this.set("preset", null)
    
    @scala.inline
    def setPrettierPath(value: String): Self = this.set("prettierPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettierPath: Self = this.set("prettierPath", js.undefined)
    
    @scala.inline
    def setPrettierPathNull: Self = this.set("prettierPath", null)
    
    @scala.inline
    def setProjectsVarargs(value: Glob*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[Glob]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    
    @scala.inline
    def setReplname(value: String): Self = this.set("replname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplname: Self = this.set("replname", js.undefined)
    
    @scala.inline
    def setReplnameNull: Self = this.set("replname", null)
    
    @scala.inline
    def setReportersVarargs(value: (String | ReporterConfig)*): Self = this.set("reporters", js.Array(value :_*))
    
    @scala.inline
    def setReporters(value: js.Array[String | ReporterConfig]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
    
    @scala.inline
    def setResetMocks(value: Boolean): Self = this.set("resetMocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetMocks: Self = this.set("resetMocks", js.undefined)
    
    @scala.inline
    def setResetModules(value: Boolean): Self = this.set("resetModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetModules: Self = this.set("resetModules", js.undefined)
    
    @scala.inline
    def setResolver(value: Path): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    
    @scala.inline
    def setResolverNull: Self = this.set("resolver", null)
    
    @scala.inline
    def setRestoreMocks(value: Boolean): Self = this.set("restoreMocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreMocks: Self = this.set("restoreMocks", js.undefined)
    
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    
    @scala.inline
    def setRootsVarargs(value: Path*): Self = this.set("roots", js.Array(value :_*))
    
    @scala.inline
    def setRoots(value: js.Array[Path]): Self = this.set("roots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoots: Self = this.set("roots", js.undefined)
    
    @scala.inline
    def setRunTestsByPath(value: Boolean): Self = this.set("runTestsByPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunTestsByPath: Self = this.set("runTestsByPath", js.undefined)
    
    @scala.inline
    def setRunner(value: String): Self = this.set("runner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunner: Self = this.set("runner", js.undefined)
    
    @scala.inline
    def setScriptPreprocessor(value: String): Self = this.set("scriptPreprocessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPreprocessor: Self = this.set("scriptPreprocessor", js.undefined)
    
    @scala.inline
    def setSetupFilesVarargs(value: Path*): Self = this.set("setupFiles", js.Array(value :_*))
    
    @scala.inline
    def setSetupFiles(value: js.Array[Path]): Self = this.set("setupFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupFiles: Self = this.set("setupFiles", js.undefined)
    
    @scala.inline
    def setSetupFilesAfterEnvVarargs(value: Path*): Self = this.set("setupFilesAfterEnv", js.Array(value :_*))
    
    @scala.inline
    def setSetupFilesAfterEnv(value: js.Array[Path]): Self = this.set("setupFilesAfterEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupFilesAfterEnv: Self = this.set("setupFilesAfterEnv", js.undefined)
    
    @scala.inline
    def setSetupTestFrameworkScriptFile(value: Path): Self = this.set("setupTestFrameworkScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupTestFrameworkScriptFile: Self = this.set("setupTestFrameworkScriptFile", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setSkipFilter(value: Boolean): Self = this.set("skipFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFilter: Self = this.set("skipFilter", js.undefined)
    
    @scala.inline
    def setSkipNodeResolution(value: Boolean): Self = this.set("skipNodeResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNodeResolution: Self = this.set("skipNodeResolution", js.undefined)
    
    @scala.inline
    def setSlowTestThreshold(value: Double): Self = this.set("slowTestThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowTestThreshold: Self = this.set("slowTestThreshold", js.undefined)
    
    @scala.inline
    def setSnapshotResolver(value: Path): Self = this.set("snapshotResolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotResolver: Self = this.set("snapshotResolver", js.undefined)
    
    @scala.inline
    def setSnapshotSerializersVarargs(value: Path*): Self = this.set("snapshotSerializers", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotSerializers(value: js.Array[Path]): Self = this.set("snapshotSerializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotSerializers: Self = this.set("snapshotSerializers", js.undefined)
    
    @scala.inline
    def setTestEnvironment(value: String): Self = this.set("testEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestEnvironment: Self = this.set("testEnvironment", js.undefined)
    
    @scala.inline
    def setTestEnvironmentOptions(value: Record[String, _]): Self = this.set("testEnvironmentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestEnvironmentOptions: Self = this.set("testEnvironmentOptions", js.undefined)
    
    @scala.inline
    def setTestFailureExitCode(value: String | Double): Self = this.set("testFailureExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestFailureExitCode: Self = this.set("testFailureExitCode", js.undefined)
    
    @scala.inline
    def setTestLocationInResults(value: Boolean): Self = this.set("testLocationInResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestLocationInResults: Self = this.set("testLocationInResults", js.undefined)
    
    @scala.inline
    def setTestMatchVarargs(value: Glob*): Self = this.set("testMatch", js.Array(value :_*))
    
    @scala.inline
    def setTestMatch(value: js.Array[Glob]): Self = this.set("testMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestMatch: Self = this.set("testMatch", js.undefined)
    
    @scala.inline
    def setTestNamePattern(value: String): Self = this.set("testNamePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestNamePattern: Self = this.set("testNamePattern", js.undefined)
    
    @scala.inline
    def setTestPathDirsVarargs(value: Path*): Self = this.set("testPathDirs", js.Array(value :_*))
    
    @scala.inline
    def setTestPathDirs(value: js.Array[Path]): Self = this.set("testPathDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestPathDirs: Self = this.set("testPathDirs", js.undefined)
    
    @scala.inline
    def setTestPathIgnorePatternsVarargs(value: String*): Self = this.set("testPathIgnorePatterns", js.Array(value :_*))
    
    @scala.inline
    def setTestPathIgnorePatterns(value: js.Array[String]): Self = this.set("testPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestPathIgnorePatterns: Self = this.set("testPathIgnorePatterns", js.undefined)
    
    @scala.inline
    def setTestRegexVarargs(value: String*): Self = this.set("testRegex", js.Array(value :_*))
    
    @scala.inline
    def setTestRegex(value: String | js.Array[String]): Self = this.set("testRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRegex: Self = this.set("testRegex", js.undefined)
    
    @scala.inline
    def setTestResultsProcessor(value: String): Self = this.set("testResultsProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestResultsProcessor: Self = this.set("testResultsProcessor", js.undefined)
    
    @scala.inline
    def setTestRunner(value: String): Self = this.set("testRunner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRunner: Self = this.set("testRunner", js.undefined)
    
    @scala.inline
    def setTestSequencer(value: String): Self = this.set("testSequencer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSequencer: Self = this.set("testSequencer", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: Double): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
    
    @scala.inline
    def setTestURL(value: String): Self = this.set("testURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestURL: Self = this.set("testURL", js.undefined)
    
    @scala.inline
    def setTimers(value: Timers): Self = this.set("timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimers: Self = this.set("timers", js.undefined)
    
    @scala.inline
    def setTransform(value: StringDictionary[Path | TransformerConfig]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransformIgnorePatternsVarargs(value: Glob*): Self = this.set("transformIgnorePatterns", js.Array(value :_*))
    
    @scala.inline
    def setTransformIgnorePatterns(value: js.Array[Glob]): Self = this.set("transformIgnorePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformIgnorePatterns: Self = this.set("transformIgnorePatterns", js.undefined)
    
    @scala.inline
    def setUnmockedModulePathPatternsVarargs(value: String*): Self = this.set("unmockedModulePathPatterns", js.Array(value :_*))
    
    @scala.inline
    def setUnmockedModulePathPatterns(value: js.Array[String]): Self = this.set("unmockedModulePathPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmockedModulePathPatterns: Self = this.set("unmockedModulePathPatterns", js.undefined)
    
    @scala.inline
    def setUpdateSnapshot(value: Boolean): Self = this.set("updateSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSnapshot: Self = this.set("updateSnapshot", js.undefined)
    
    @scala.inline
    def setUseStderr(value: Boolean): Self = this.set("useStderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStderr: Self = this.set("useStderr", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    
    @scala.inline
    def setWatchAll(value: Boolean): Self = this.set("watchAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchAll: Self = this.set("watchAll", js.undefined)
    
    @scala.inline
    def setWatchPathIgnorePatternsVarargs(value: String*): Self = this.set("watchPathIgnorePatterns", js.Array(value :_*))
    
    @scala.inline
    def setWatchPathIgnorePatterns(value: js.Array[String]): Self = this.set("watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchPathIgnorePatterns: Self = this.set("watchPathIgnorePatterns", js.undefined)
    
    @scala.inline
    def setWatchPluginsVarargs(value: (String | (js.Tuple2[String, Record[String, js.Any]]))*): Self = this.set("watchPlugins", js.Array(value :_*))
    
    @scala.inline
    def setWatchPlugins(value: js.Array[String | (js.Tuple2[String, Record[String, _]])]): Self = this.set("watchPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchPlugins: Self = this.set("watchPlugins", js.undefined)
    
    @scala.inline
    def setWatchman(value: Boolean): Self = this.set("watchman", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchman: Self = this.set("watchman", js.undefined)
  }
}
