package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.anon.Global
import typings.jestTypes.jestTypesStrings.fake
import typings.jestTypes.jestTypesStrings.real
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOptions extends js.Object {
  var automock: Boolean = js.native
  var bail: Double = js.native
  var browser: Boolean = js.native
  var cache: Boolean = js.native
  var cacheDirectory: Path = js.native
  var changedFilesWithAncestor: Boolean = js.native
  var clearMocks: Boolean = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.UndefOr[js.Array[String] | Null] = js.native
  var coverageDirectory: js.UndefOr[String | Null] = js.native
  var coveragePathIgnorePatterns: js.Array[String] = js.native
  var coverageReporters: js.Array[String] = js.native
  var coverageThreshold: js.UndefOr[Global | Null] = js.native
  var dependencyExtractor: js.UndefOr[String | Null] = js.native
  var errorOnDeprecated: Boolean = js.native
  var expand: Boolean = js.native
  var filter: js.UndefOr[Path | Null] = js.native
  var forceCoverageMatch: js.Array[Glob] = js.native
  var globalSetup: js.UndefOr[String | Null] = js.native
  var globalTeardown: js.UndefOr[String | Null] = js.native
  var globals: ConfigGlobals = js.native
  var haste: HasteConfig = js.native
  var maxConcurrency: Double = js.native
  var maxWorkers: Double | String = js.native
  var moduleDirectories: js.Array[String] = js.native
  var moduleFileExtensions: js.Array[String] = js.native
  var moduleNameMapper: StringDictionary[String] = js.native
  var modulePathIgnorePatterns: js.Array[String] = js.native
  var noStackTrace: Boolean = js.native
  var notifyMode: String = js.native
  @JSName("notify")
  var notify_FDefaultOptions: Boolean = js.native
  var preset: js.UndefOr[String | Null] = js.native
  var prettierPath: js.UndefOr[String | Null] = js.native
  var projects: js.UndefOr[(js.Array[String | ProjectConfig]) | Null] = js.native
  var resetMocks: Boolean = js.native
  var resetModules: Boolean = js.native
  var resolver: js.UndefOr[Path | Null] = js.native
  var restoreMocks: Boolean = js.native
  var rootDir: js.UndefOr[Path | Null] = js.native
  var roots: js.UndefOr[js.Array[Path] | Null] = js.native
  var runTestsByPath: Boolean = js.native
  var runner: String = js.native
  var setupFiles: js.Array[Path] = js.native
  var setupFilesAfterEnv: js.Array[Path] = js.native
  var skipFilter: Boolean = js.native
  var snapshotSerializers: js.Array[Path] = js.native
  var testEnvironment: String = js.native
  var testEnvironmentOptions: Record[String, _] = js.native
  var testFailureExitCode: String | Double = js.native
  var testLocationInResults: Boolean = js.native
  var testMatch: js.Array[Glob] = js.native
  var testPathIgnorePatterns: js.Array[String] = js.native
  var testRegex: js.Array[String] = js.native
  var testResultsProcessor: js.UndefOr[String | Null] = js.native
  var testRunner: js.UndefOr[String | Null] = js.native
  var testSequencer: String = js.native
  var testURL: String = js.native
  var timers: real | fake = js.native
  var transform: js.UndefOr[(StringDictionary[Path | TransformerConfig]) | Null] = js.native
  var transformIgnorePatterns: js.Array[Glob] = js.native
  var useStderr: Boolean = js.native
  var verbose: js.UndefOr[Boolean | Null] = js.native
  var watch: Boolean = js.native
  var watchPathIgnorePatterns: js.Array[String] = js.native
  var watchman: Boolean = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(
    automock: Boolean,
    bail: Double,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: Path,
    changedFilesWithAncestor: Boolean,
    clearMocks: Boolean,
    collectCoverage: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    coverageReporters: js.Array[String],
    errorOnDeprecated: Boolean,
    expand: Boolean,
    forceCoverageMatch: js.Array[Glob],
    globals: ConfigGlobals,
    haste: HasteConfig,
    maxConcurrency: Double,
    maxWorkers: Double | String,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleNameMapper: StringDictionary[String],
    modulePathIgnorePatterns: js.Array[String],
    noStackTrace: Boolean,
    notify: Boolean,
    notifyMode: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    runTestsByPath: Boolean,
    runner: String,
    setupFiles: js.Array[Path],
    setupFilesAfterEnv: js.Array[Path],
    skipFilter: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, _],
    testFailureExitCode: String | Double,
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String],
    testSequencer: String,
    testURL: String,
    timers: real | fake,
    transformIgnorePatterns: js.Array[Glob],
    useStderr: Boolean,
    watch: Boolean,
    watchPathIgnorePatterns: js.Array[String],
    watchman: Boolean
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
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
    def setBail(value: Double): Self = this.set("bail", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheDirectory(value: Path): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedFilesWithAncestor(value: Boolean): Self = this.set("changedFilesWithAncestor", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearMocks(value: Boolean): Self = this.set("clearMocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectCoverage(value: Boolean): Self = this.set("collectCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoveragePathIgnorePatternsVarargs(value: String*): Self = this.set("coveragePathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = this.set("coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverageReportersVarargs(value: String*): Self = this.set("coverageReporters", js.Array(value :_*))
    @scala.inline
    def setCoverageReporters(value: js.Array[String]): Self = this.set("coverageReporters", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorOnDeprecated(value: Boolean): Self = this.set("errorOnDeprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceCoverageMatchVarargs(value: Glob*): Self = this.set("forceCoverageMatch", js.Array(value :_*))
    @scala.inline
    def setForceCoverageMatch(value: js.Array[Glob]): Self = this.set("forceCoverageMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobals(value: ConfigGlobals): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def setHaste(value: HasteConfig): Self = this.set("haste", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWorkers(value: Double | String): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleDirectoriesVarargs(value: String*): Self = this.set("moduleDirectories", js.Array(value :_*))
    @scala.inline
    def setModuleDirectories(value: js.Array[String]): Self = this.set("moduleDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleFileExtensionsVarargs(value: String*): Self = this.set("moduleFileExtensions", js.Array(value :_*))
    @scala.inline
    def setModuleFileExtensions(value: js.Array[String]): Self = this.set("moduleFileExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleNameMapper(value: StringDictionary[String]): Self = this.set("moduleNameMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setModulePathIgnorePatternsVarargs(value: String*): Self = this.set("modulePathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setModulePathIgnorePatterns(value: js.Array[String]): Self = this.set("modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoStackTrace(value: Boolean): Self = this.set("noStackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyMode(value: String): Self = this.set("notifyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetMocks(value: Boolean): Self = this.set("resetMocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetModules(value: Boolean): Self = this.set("resetModules", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestoreMocks(value: Boolean): Self = this.set("restoreMocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunTestsByPath(value: Boolean): Self = this.set("runTestsByPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunner(value: String): Self = this.set("runner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetupFilesVarargs(value: Path*): Self = this.set("setupFiles", js.Array(value :_*))
    @scala.inline
    def setSetupFiles(value: js.Array[Path]): Self = this.set("setupFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetupFilesAfterEnvVarargs(value: Path*): Self = this.set("setupFilesAfterEnv", js.Array(value :_*))
    @scala.inline
    def setSetupFilesAfterEnv(value: js.Array[Path]): Self = this.set("setupFilesAfterEnv", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipFilter(value: Boolean): Self = this.set("skipFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotSerializersVarargs(value: Path*): Self = this.set("snapshotSerializers", js.Array(value :_*))
    @scala.inline
    def setSnapshotSerializers(value: js.Array[Path]): Self = this.set("snapshotSerializers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestEnvironment(value: String): Self = this.set("testEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestEnvironmentOptions(value: Record[String, _]): Self = this.set("testEnvironmentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestFailureExitCode(value: String | Double): Self = this.set("testFailureExitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestLocationInResults(value: Boolean): Self = this.set("testLocationInResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestMatchVarargs(value: Glob*): Self = this.set("testMatch", js.Array(value :_*))
    @scala.inline
    def setTestMatch(value: js.Array[Glob]): Self = this.set("testMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPathIgnorePatternsVarargs(value: String*): Self = this.set("testPathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setTestPathIgnorePatterns(value: js.Array[String]): Self = this.set("testPathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestRegexVarargs(value: String*): Self = this.set("testRegex", js.Array(value :_*))
    @scala.inline
    def setTestRegex(value: js.Array[String]): Self = this.set("testRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSequencer(value: String): Self = this.set("testSequencer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestURL(value: String): Self = this.set("testURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimers(value: real | fake): Self = this.set("timers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformIgnorePatternsVarargs(value: Glob*): Self = this.set("transformIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setTransformIgnorePatterns(value: js.Array[Glob]): Self = this.set("transformIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseStderr(value: Boolean): Self = this.set("useStderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchPathIgnorePatternsVarargs(value: String*): Self = this.set("watchPathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setWatchPathIgnorePatterns(value: js.Array[String]): Self = this.set("watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchman(value: Boolean): Self = this.set("watchman", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectCoverageFromVarargs(value: String*): Self = this.set("collectCoverageFrom", js.Array(value :_*))
    @scala.inline
    def setCollectCoverageFrom(value: js.Array[String]): Self = this.set("collectCoverageFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectCoverageFrom: Self = this.set("collectCoverageFrom", js.undefined)
    @scala.inline
    def setCollectCoverageFromNull: Self = this.set("collectCoverageFrom", null)
    @scala.inline
    def setCoverageDirectory(value: String): Self = this.set("coverageDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageDirectory: Self = this.set("coverageDirectory", js.undefined)
    @scala.inline
    def setCoverageDirectoryNull: Self = this.set("coverageDirectory", null)
    @scala.inline
    def setCoverageThreshold(value: Global): Self = this.set("coverageThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageThreshold: Self = this.set("coverageThreshold", js.undefined)
    @scala.inline
    def setCoverageThresholdNull: Self = this.set("coverageThreshold", null)
    @scala.inline
    def setDependencyExtractor(value: String): Self = this.set("dependencyExtractor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencyExtractor: Self = this.set("dependencyExtractor", js.undefined)
    @scala.inline
    def setDependencyExtractorNull: Self = this.set("dependencyExtractor", null)
    @scala.inline
    def setFilter(value: Path): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterNull: Self = this.set("filter", null)
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
    def setProjectsVarargs(value: (String | ProjectConfig)*): Self = this.set("projects", js.Array(value :_*))
    @scala.inline
    def setProjects(value: js.Array[String | ProjectConfig]): Self = this.set("projects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    @scala.inline
    def setProjectsNull: Self = this.set("projects", null)
    @scala.inline
    def setResolver(value: Path): Self = this.set("resolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    @scala.inline
    def setResolverNull: Self = this.set("resolver", null)
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    @scala.inline
    def setRootDirNull: Self = this.set("rootDir", null)
    @scala.inline
    def setRootsVarargs(value: Path*): Self = this.set("roots", js.Array(value :_*))
    @scala.inline
    def setRoots(value: js.Array[Path]): Self = this.set("roots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoots: Self = this.set("roots", js.undefined)
    @scala.inline
    def setRootsNull: Self = this.set("roots", null)
    @scala.inline
    def setTestResultsProcessor(value: String): Self = this.set("testResultsProcessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestResultsProcessor: Self = this.set("testResultsProcessor", js.undefined)
    @scala.inline
    def setTestResultsProcessorNull: Self = this.set("testResultsProcessor", null)
    @scala.inline
    def setTestRunner(value: String): Self = this.set("testRunner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestRunner: Self = this.set("testRunner", js.undefined)
    @scala.inline
    def setTestRunnerNull: Self = this.set("testRunner", null)
    @scala.inline
    def setTransform(value: StringDictionary[Path | TransformerConfig]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTransformNull: Self = this.set("transform", null)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setVerboseNull: Self = this.set("verbose", null)
  }
  
}

