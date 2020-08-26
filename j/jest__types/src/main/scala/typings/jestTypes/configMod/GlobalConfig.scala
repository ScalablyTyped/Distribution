package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.anon.Config
import typings.jestTypes.jestTypesStrings.`html-spa`
import typings.jestTypes.jestTypesStrings.`json-summary`
import typings.jestTypes.jestTypesStrings.`text-lcov`
import typings.jestTypes.jestTypesStrings.`text-summary`
import typings.jestTypes.jestTypesStrings.clover
import typings.jestTypes.jestTypesStrings.cobertura
import typings.jestTypes.jestTypesStrings.html
import typings.jestTypes.jestTypesStrings.json_
import typings.jestTypes.jestTypesStrings.lcov
import typings.jestTypes.jestTypesStrings.lcovonly
import typings.jestTypes.jestTypesStrings.teamcity
import typings.jestTypes.jestTypesStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalConfig extends js.Object {
  var bail: Double = js.native
  var changedFilesWithAncestor: Boolean = js.native
  var changedSince: String = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.Array[Glob] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.native
  var coverageDirectory: String = js.native
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  var coverageReporters: js.Array[
    clover | cobertura | `html-spa` | html | json_ | `json-summary` | lcov | lcovonly | teamcity | text | `text-lcov` | `text-summary`
  ] = js.native
  var coverageThreshold: CoverageThreshold = js.native
  var detectLeaks: Boolean = js.native
  var detectOpenHandles: Boolean = js.native
  var enabledTestsMap: js.UndefOr[StringDictionary[StringDictionary[Boolean]] | Null] = js.native
  var errorOnDeprecated: Boolean = js.native
  var expand: Boolean = js.native
  var extraGlobals: js.Array[String] = js.native
  var filter: js.UndefOr[Path | Null] = js.native
  var findRelatedTests: Boolean = js.native
  var forceExit: Boolean = js.native
  var globalSetup: js.UndefOr[String | Null] = js.native
  var globalTeardown: js.UndefOr[String | Null] = js.native
  var json: Boolean = js.native
  var lastCommit: Boolean = js.native
  var listTests: Boolean = js.native
  var logHeapUsage: Boolean = js.native
  var maxConcurrency: Double = js.native
  var maxWorkers: Double = js.native
  var noSCM: js.UndefOr[Boolean | Null] = js.native
  var noStackTrace: Boolean = js.native
  var nonFlagArgs: js.Array[String] = js.native
  var notifyMode: NotifyMode = js.native
  @JSName("notify")
  var notify_FGlobalConfig: Boolean = js.native
  var onlyChanged: Boolean = js.native
  var onlyFailures: Boolean = js.native
  var outputFile: js.UndefOr[Path | Null] = js.native
  var passWithNoTests: Boolean = js.native
  var projects: js.Array[Glob] = js.native
  var replname: js.UndefOr[String | Null] = js.native
  var reporters: js.Array[String | ReporterConfig] = js.native
  var rootDir: Path = js.native
  var runTestsByPath: Boolean = js.native
  var silent: Boolean = js.native
  var skipFilter: Boolean = js.native
  var testFailureExitCode: Double = js.native
  var testNamePattern: String = js.native
  var testPathPattern: String = js.native
  var testResultsProcessor: js.UndefOr[String | Null] = js.native
  var testSequencer: String = js.native
  var testTimeout: Double = js.native
  var updateSnapshot: SnapshotUpdateState = js.native
  var useStderr: Boolean = js.native
  var verbose: js.UndefOr[Boolean | Null] = js.native
  var watch: Boolean = js.native
  var watchAll: Boolean = js.native
  var watchPlugins: js.UndefOr[js.Array[Config] | Null] = js.native
  var watchman: Boolean = js.native
}

object GlobalConfig {
  @scala.inline
  def apply(
    bail: Double,
    changedFilesWithAncestor: Boolean,
    changedSince: String,
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[Glob],
    coverageDirectory: String,
    coverageReporters: js.Array[
      clover | cobertura | `html-spa` | html | json_ | `json-summary` | lcov | lcovonly | teamcity | text | `text-lcov` | `text-summary`
    ],
    coverageThreshold: CoverageThreshold,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    expand: Boolean,
    extraGlobals: js.Array[String],
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
    notify: Boolean,
    notifyMode: NotifyMode,
    onlyChanged: Boolean,
    onlyFailures: Boolean,
    passWithNoTests: Boolean,
    projects: js.Array[Glob],
    reporters: js.Array[String | ReporterConfig],
    rootDir: Path,
    runTestsByPath: Boolean,
    silent: Boolean,
    skipFilter: Boolean,
    testFailureExitCode: Double,
    testNamePattern: String,
    testPathPattern: String,
    testSequencer: String,
    testTimeout: Double,
    updateSnapshot: SnapshotUpdateState,
    useStderr: Boolean,
    watch: Boolean,
    watchAll: Boolean,
    watchman: Boolean
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], changedSince = changedSince.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], coverageThreshold = coverageThreshold.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testNamePattern = testNamePattern.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
  @scala.inline
  implicit class GlobalConfigOps[Self <: GlobalConfig] (val x: Self) extends AnyVal {
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
    def setBail(value: Double): Self = this.set("bail", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedFilesWithAncestor(value: Boolean): Self = this.set("changedFilesWithAncestor", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedSince(value: String): Self = this.set("changedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectCoverage(value: Boolean): Self = this.set("collectCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectCoverageFromVarargs(value: Glob*): Self = this.set("collectCoverageFrom", js.Array(value :_*))
    @scala.inline
    def setCollectCoverageFrom(value: js.Array[Glob]): Self = this.set("collectCoverageFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverageDirectory(value: String): Self = this.set("coverageDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverageReportersVarargs(
      value: (clover | cobertura | `html-spa` | html | json_ | `json-summary` | lcov | lcovonly | teamcity | text | `text-lcov` | `text-summary`)*
    ): Self = this.set("coverageReporters", js.Array(value :_*))
    @scala.inline
    def setCoverageReporters(
      value: js.Array[
          clover | cobertura | `html-spa` | html | json_ | `json-summary` | lcov | lcovonly | teamcity | text | `text-lcov` | `text-summary`
        ]
    ): Self = this.set("coverageReporters", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverageThreshold(value: CoverageThreshold): Self = this.set("coverageThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectLeaks(value: Boolean): Self = this.set("detectLeaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectOpenHandles(value: Boolean): Self = this.set("detectOpenHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorOnDeprecated(value: Boolean): Self = this.set("errorOnDeprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraGlobalsVarargs(value: String*): Self = this.set("extraGlobals", js.Array(value :_*))
    @scala.inline
    def setExtraGlobals(value: js.Array[String]): Self = this.set("extraGlobals", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindRelatedTests(value: Boolean): Self = this.set("findRelatedTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceExit(value: Boolean): Self = this.set("forceExit", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastCommit(value: Boolean): Self = this.set("lastCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setListTests(value: Boolean): Self = this.set("listTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogHeapUsage(value: Boolean): Self = this.set("logHeapUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoStackTrace(value: Boolean): Self = this.set("noStackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonFlagArgsVarargs(value: String*): Self = this.set("nonFlagArgs", js.Array(value :_*))
    @scala.inline
    def setNonFlagArgs(value: js.Array[String]): Self = this.set("nonFlagArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyMode(value: NotifyMode): Self = this.set("notifyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyChanged(value: Boolean): Self = this.set("onlyChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyFailures(value: Boolean): Self = this.set("onlyFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassWithNoTests(value: Boolean): Self = this.set("passWithNoTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectsVarargs(value: Glob*): Self = this.set("projects", js.Array(value :_*))
    @scala.inline
    def setProjects(value: js.Array[Glob]): Self = this.set("projects", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportersVarargs(value: (String | ReporterConfig)*): Self = this.set("reporters", js.Array(value :_*))
    @scala.inline
    def setReporters(value: js.Array[String | ReporterConfig]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunTestsByPath(value: Boolean): Self = this.set("runTestsByPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipFilter(value: Boolean): Self = this.set("skipFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestFailureExitCode(value: Double): Self = this.set("testFailureExitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestNamePattern(value: String): Self = this.set("testNamePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPathPattern(value: String): Self = this.set("testPathPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSequencer(value: String): Self = this.set("testSequencer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestTimeout(value: Double): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateSnapshot(value: SnapshotUpdateState): Self = this.set("updateSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseStderr(value: Boolean): Self = this.set("useStderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchAll(value: Boolean): Self = this.set("watchAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchman(value: Boolean): Self = this.set("watchman", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = this.set("collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectCoverageOnlyFrom: Self = this.set("collectCoverageOnlyFrom", js.undefined)
    @scala.inline
    def setCollectCoverageOnlyFromNull: Self = this.set("collectCoverageOnlyFrom", null)
    @scala.inline
    def setCoveragePathIgnorePatternsVarargs(value: String*): Self = this.set("coveragePathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = this.set("coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoveragePathIgnorePatterns: Self = this.set("coveragePathIgnorePatterns", js.undefined)
    @scala.inline
    def setEnabledTestsMap(value: StringDictionary[StringDictionary[Boolean]]): Self = this.set("enabledTestsMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledTestsMap: Self = this.set("enabledTestsMap", js.undefined)
    @scala.inline
    def setEnabledTestsMapNull: Self = this.set("enabledTestsMap", null)
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
    def setNoSCM(value: Boolean): Self = this.set("noSCM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSCM: Self = this.set("noSCM", js.undefined)
    @scala.inline
    def setNoSCMNull: Self = this.set("noSCM", null)
    @scala.inline
    def setOutputFile(value: Path): Self = this.set("outputFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFile: Self = this.set("outputFile", js.undefined)
    @scala.inline
    def setOutputFileNull: Self = this.set("outputFile", null)
    @scala.inline
    def setReplname(value: String): Self = this.set("replname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplname: Self = this.set("replname", js.undefined)
    @scala.inline
    def setReplnameNull: Self = this.set("replname", null)
    @scala.inline
    def setTestResultsProcessor(value: String): Self = this.set("testResultsProcessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestResultsProcessor: Self = this.set("testResultsProcessor", js.undefined)
    @scala.inline
    def setTestResultsProcessorNull: Self = this.set("testResultsProcessor", null)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setVerboseNull: Self = this.set("verbose", null)
    @scala.inline
    def setWatchPluginsVarargs(value: Config*): Self = this.set("watchPlugins", js.Array(value :_*))
    @scala.inline
    def setWatchPlugins(value: js.Array[Config]): Self = this.set("watchPlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchPlugins: Self = this.set("watchPlugins", js.undefined)
    @scala.inline
    def setWatchPluginsNull: Self = this.set("watchPlugins", null)
  }
  
}

