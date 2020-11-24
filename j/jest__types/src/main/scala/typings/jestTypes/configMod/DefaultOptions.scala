package typings.jestTypes.configMod

import typings.jestTypes.jestTypesStrings.`jest-runner`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultOptions extends js.Object {
  
  var automock: Boolean = js.native
  
  var bail: Double = js.native
  
  var cache: Boolean = js.native
  
  var cacheDirectory: Path = js.native
  
  var changedFilesWithAncestor: Boolean = js.native
  
  var clearMocks: Boolean = js.native
  
  var collectCoverage: Boolean = js.native
  
  var coveragePathIgnorePatterns: js.Array[String] = js.native
  
  var coverageProvider: CoverageProvider = js.native
  
  var coverageReporters: js.Array[CoverageReporterName] = js.native
  
  var errorOnDeprecated: Boolean = js.native
  
  var expand: Boolean = js.native
  
  var forceCoverageMatch: js.Array[Glob] = js.native
  
  var globals: ConfigGlobals = js.native
  
  var haste: HasteConfig = js.native
  
  var injectGlobals: Boolean = js.native
  
  var maxConcurrency: Double = js.native
  
  var maxWorkers: Double | String = js.native
  
  var moduleDirectories: js.Array[String] = js.native
  
  var moduleFileExtensions: js.Array[String] = js.native
  
  var moduleNameMapper: Record[String, String | js.Array[String]] = js.native
  
  var modulePathIgnorePatterns: js.Array[String] = js.native
  
  var noStackTrace: Boolean = js.native
  
  var notifyMode: NotifyMode = js.native
  
  @JSName("notify")
  var notify_FDefaultOptions: Boolean = js.native
  
  var prettierPath: String = js.native
  
  var resetMocks: Boolean = js.native
  
  var resetModules: Boolean = js.native
  
  var restoreMocks: Boolean = js.native
  
  var roots: js.Array[Path] = js.native
  
  var runTestsByPath: Boolean = js.native
  
  var runner: `jest-runner` = js.native
  
  var setupFiles: js.Array[Path] = js.native
  
  var setupFilesAfterEnv: js.Array[Path] = js.native
  
  var skipFilter: Boolean = js.native
  
  var slowTestThreshold: Double = js.native
  
  var snapshotSerializers: js.Array[Path] = js.native
  
  var testEnvironment: String = js.native
  
  var testEnvironmentOptions: Record[String, _] = js.native
  
  var testFailureExitCode: String | Double = js.native
  
  var testLocationInResults: Boolean = js.native
  
  var testMatch: js.Array[Glob] = js.native
  
  var testPathIgnorePatterns: js.Array[String] = js.native
  
  var testRegex: js.Array[String] = js.native
  
  var testRunner: String = js.native
  
  var testSequencer: String = js.native
  
  var testURL: String = js.native
  
  var timers: Timers = js.native
  
  var transformIgnorePatterns: js.Array[Glob] = js.native
  
  var useStderr: Boolean = js.native
  
  var watch: Boolean = js.native
  
  var watchPathIgnorePatterns: js.Array[String] = js.native
  
  var watchman: Boolean = js.native
}
object DefaultOptions {
  
  @scala.inline
  def apply(
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
    notify: Boolean,
    notifyMode: NotifyMode,
    prettierPath: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    roots: js.Array[Path],
    runTestsByPath: Boolean,
    runner: `jest-runner`,
    setupFiles: js.Array[Path],
    setupFilesAfterEnv: js.Array[Path],
    skipFilter: Boolean,
    slowTestThreshold: Double,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, _],
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
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], injectGlobals = injectGlobals.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
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
    def setCoverageProvider(value: CoverageProvider): Self = this.set("coverageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageReportersVarargs(value: CoverageReporterName*): Self = this.set("coverageReporters", js.Array(value :_*))
    
    @scala.inline
    def setCoverageReporters(value: js.Array[CoverageReporterName]): Self = this.set("coverageReporters", value.asInstanceOf[js.Any])
    
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
    def setInjectGlobals(value: Boolean): Self = this.set("injectGlobals", value.asInstanceOf[js.Any])
    
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
    def setModuleNameMapper(value: Record[String, String | js.Array[String]]): Self = this.set("moduleNameMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulePathIgnorePatternsVarargs(value: String*): Self = this.set("modulePathIgnorePatterns", js.Array(value :_*))
    
    @scala.inline
    def setModulePathIgnorePatterns(value: js.Array[String]): Self = this.set("modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoStackTrace(value: Boolean): Self = this.set("noStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyMode(value: NotifyMode): Self = this.set("notifyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettierPath(value: String): Self = this.set("prettierPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetMocks(value: Boolean): Self = this.set("resetMocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetModules(value: Boolean): Self = this.set("resetModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreMocks(value: Boolean): Self = this.set("restoreMocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootsVarargs(value: Path*): Self = this.set("roots", js.Array(value :_*))
    
    @scala.inline
    def setRoots(value: js.Array[Path]): Self = this.set("roots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunTestsByPath(value: Boolean): Self = this.set("runTestsByPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner(value: `jest-runner`): Self = this.set("runner", value.asInstanceOf[js.Any])
    
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
    def setSlowTestThreshold(value: Double): Self = this.set("slowTestThreshold", value.asInstanceOf[js.Any])
    
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
    def setTestRunner(value: String): Self = this.set("testRunner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSequencer(value: String): Self = this.set("testSequencer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestURL(value: String): Self = this.set("testURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimers(value: Timers): Self = this.set("timers", value.asInstanceOf[js.Any])
    
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
  }
}
