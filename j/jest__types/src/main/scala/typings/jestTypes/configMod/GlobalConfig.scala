package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.anon.Config
import typings.jestTypes.jestTypesStrings.`json-summary`
import typings.jestTypes.jestTypesStrings.`text-lcov`
import typings.jestTypes.jestTypesStrings.`text-summary`
import typings.jestTypes.jestTypesStrings.clover
import typings.jestTypes.jestTypesStrings.cobertura
import typings.jestTypes.jestTypesStrings.html
import typings.jestTypes.jestTypesStrings.json_
import typings.jestTypes.jestTypesStrings.lcovonly
import typings.jestTypes.jestTypesStrings.none
import typings.jestTypes.jestTypesStrings.teamcity
import typings.jestTypes.jestTypesStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var bail: Double
  var changedFilesWithAncestor: Boolean
  var changedSince: String
  var collectCoverage: Boolean
  var collectCoverageFrom: js.Array[Glob]
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.undefined
  var coverageDirectory: String
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var coverageReporters: js.Array[
    clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
  ]
  var coverageThreshold: CoverageThreshold
  var detectLeaks: Boolean
  var detectOpenHandles: Boolean
  var enabledTestsMap: js.UndefOr[StringDictionary[StringDictionary[Boolean]] | Null] = js.undefined
  var errorOnDeprecated: Boolean
  var expand: Boolean
  var extraGlobals: js.Array[String]
  var filter: js.UndefOr[Path | Null] = js.undefined
  var findRelatedTests: Boolean
  var forceExit: Boolean
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  var json: Boolean
  var lastCommit: Boolean
  var listTests: Boolean
  var logHeapUsage: Boolean
  var maxConcurrency: Double
  var maxWorkers: Double
  var noSCM: js.UndefOr[Boolean | Null] = js.undefined
  var noStackTrace: Boolean
  var nonFlagArgs: js.Array[String]
  var notifyMode: NotifyMode
  @JSName("notify")
  var notify_FGlobalConfig: Boolean
  var onlyChanged: Boolean
  var onlyFailures: Boolean
  var outputFile: js.UndefOr[Path | Null] = js.undefined
  var passWithNoTests: Boolean
  var projects: js.Array[Glob]
  var replname: js.UndefOr[String | Null] = js.undefined
  var reporters: js.Array[String | ReporterConfig]
  var rootDir: Path
  var runTestsByPath: Boolean
  var silent: Boolean
  var skipFilter: Boolean
  var testFailureExitCode: Double
  var testNamePattern: String
  var testPathPattern: String
  var testResultsProcessor: js.UndefOr[String | Null] = js.undefined
  var testSequencer: String
  var testTimeout: Double
  var updateSnapshot: SnapshotUpdateState
  var useStderr: Boolean
  var verbose: js.UndefOr[Boolean | Null] = js.undefined
  var watch: Boolean
  var watchAll: Boolean
  var watchPlugins: js.UndefOr[js.Array[Config] | Null] = js.undefined
  var watchman: Boolean
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
      clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
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
    watchman: Boolean,
    collectCoverageOnlyFrom: js.UndefOr[Null | StringDictionary[Boolean]] = js.undefined,
    coveragePathIgnorePatterns: js.Array[String] = null,
    enabledTestsMap: js.UndefOr[Null | StringDictionary[StringDictionary[Boolean]]] = js.undefined,
    filter: js.UndefOr[Null | Path] = js.undefined,
    globalSetup: js.UndefOr[Null | String] = js.undefined,
    globalTeardown: js.UndefOr[Null | String] = js.undefined,
    noSCM: js.UndefOr[Null | Boolean] = js.undefined,
    outputFile: js.UndefOr[Null | Path] = js.undefined,
    replname: js.UndefOr[Null | String] = js.undefined,
    testResultsProcessor: js.UndefOr[Null | String] = js.undefined,
    verbose: js.UndefOr[Null | Boolean] = js.undefined,
    watchPlugins: js.UndefOr[Null | js.Array[Config]] = js.undefined
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], changedSince = changedSince.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], coverageThreshold = coverageThreshold.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testNamePattern = testNamePattern.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (!js.isUndefined(collectCoverageOnlyFrom)) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (coveragePathIgnorePatterns != null) __obj.updateDynamic("coveragePathIgnorePatterns")(coveragePathIgnorePatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledTestsMap)) __obj.updateDynamic("enabledTestsMap")(enabledTestsMap.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(globalSetup)) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (!js.isUndefined(globalTeardown)) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (!js.isUndefined(noSCM)) __obj.updateDynamic("noSCM")(noSCM.asInstanceOf[js.Any])
    if (!js.isUndefined(outputFile)) __obj.updateDynamic("outputFile")(outputFile.asInstanceOf[js.Any])
    if (!js.isUndefined(replname)) __obj.updateDynamic("replname")(replname.asInstanceOf[js.Any])
    if (!js.isUndefined(testResultsProcessor)) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (!js.isUndefined(watchPlugins)) __obj.updateDynamic("watchPlugins")(watchPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
}

