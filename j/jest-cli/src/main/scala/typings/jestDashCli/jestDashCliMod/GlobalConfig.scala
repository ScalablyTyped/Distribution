package typings.jestDashCli.jestDashCliMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestDashCli.Anon_Config
import typings.jestDashCli.Anon_Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var bail: Boolean
  var changedFilesWithAncestor: Boolean
  var changedSince: String
  var collectCoverage: Boolean
  var collectCoverageFrom: js.Array[String]
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var coverageDirectory: String
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var coverageReporters: js.Array[String]
  var coverageThreshold: Anon_Global
  var detectLeaks: Boolean
  var detectOpenHandles: Boolean
  var enabledTestsMap: js.UndefOr[StringDictionary[StringDictionary[Boolean]]] = js.undefined
  var errorOnDeprecated: Boolean
  var expand: Boolean
  var filter: js.UndefOr[String] = js.undefined
  var findRelatedTests: Boolean
  var forceExit: Boolean
  var globalSetup: js.UndefOr[String] = js.undefined
  var globalTeardown: js.UndefOr[String] = js.undefined
  var json: Boolean
  var lastCommit: Boolean
  var listTests: Boolean
  var logHeapUsage: Boolean
  var maxWorkers: Double
  var noSCM: js.UndefOr[Boolean] = js.undefined
  var noStackTrace: Boolean
  var nonFlagArgs: js.Array[String]
  var notifyMode: String
  @JSName("notify")
  var notify_FGlobalConfig: Boolean
  var onlyChanged: Boolean
  var onlyFailures: Boolean
  var outputFile: js.UndefOr[String] = js.undefined
  var passWithNoTests: Boolean
  var projects: js.Array[String]
  var replname: js.UndefOr[String] = js.undefined
  var reporters: js.Array[String | ReporterConfig]
  var rootDir: String
  var runTestsByPath: Boolean
  var silent: Boolean
  var skipFilter: Boolean
  var testFailureExitCode: Double
  var testNamePattern: String
  var testPathPattern: String
  var testResultsProcessor: js.UndefOr[String] = js.undefined
  var updateSnapshot: SnapshotUpdateState
  var useStderr: Boolean
  var verbose: js.UndefOr[Boolean] = js.undefined
  var watch: Boolean
  var watchAll: Boolean
  var watchPlugins: js.UndefOr[js.Array[Anon_Config]] = js.undefined
  var watchman: Boolean
}

object GlobalConfig {
  @scala.inline
  def apply(
    bail: Boolean,
    changedFilesWithAncestor: Boolean,
    changedSince: String,
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[String],
    coverageDirectory: String,
    coverageReporters: js.Array[String],
    coverageThreshold: Anon_Global,
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
    maxWorkers: Double,
    noStackTrace: Boolean,
    nonFlagArgs: js.Array[String],
    notify: Boolean,
    notifyMode: String,
    onlyChanged: Boolean,
    onlyFailures: Boolean,
    passWithNoTests: Boolean,
    projects: js.Array[String],
    reporters: js.Array[String | ReporterConfig],
    rootDir: String,
    runTestsByPath: Boolean,
    silent: Boolean,
    skipFilter: Boolean,
    testFailureExitCode: Double,
    testNamePattern: String,
    testPathPattern: String,
    updateSnapshot: SnapshotUpdateState,
    useStderr: Boolean,
    watch: Boolean,
    watchAll: Boolean,
    watchman: Boolean,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null,
    coveragePathIgnorePatterns: js.Array[String] = null,
    enabledTestsMap: StringDictionary[StringDictionary[Boolean]] = null,
    filter: String = null,
    globalSetup: String = null,
    globalTeardown: String = null,
    noSCM: js.UndefOr[Boolean] = js.undefined,
    outputFile: String = null,
    replname: String = null,
    testResultsProcessor: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watchPlugins: js.Array[Anon_Config] = null
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(bail = bail, changedFilesWithAncestor = changedFilesWithAncestor, changedSince = changedSince, collectCoverage = collectCoverage, collectCoverageFrom = collectCoverageFrom, coverageDirectory = coverageDirectory, coverageReporters = coverageReporters, coverageThreshold = coverageThreshold, detectLeaks = detectLeaks, detectOpenHandles = detectOpenHandles, errorOnDeprecated = errorOnDeprecated, expand = expand, findRelatedTests = findRelatedTests, forceExit = forceExit, json = json, lastCommit = lastCommit, listTests = listTests, logHeapUsage = logHeapUsage, maxWorkers = maxWorkers, noStackTrace = noStackTrace, nonFlagArgs = nonFlagArgs, notify = notify, notifyMode = notifyMode, onlyChanged = onlyChanged, onlyFailures = onlyFailures, passWithNoTests = passWithNoTests, projects = projects, reporters = reporters, rootDir = rootDir, runTestsByPath = runTestsByPath, silent = silent, skipFilter = skipFilter, testFailureExitCode = testFailureExitCode, testNamePattern = testNamePattern, testPathPattern = testPathPattern, updateSnapshot = updateSnapshot, useStderr = useStderr, watch = watch, watchAll = watchAll, watchman = watchman)
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom)
    if (coveragePathIgnorePatterns != null) __obj.updateDynamic("coveragePathIgnorePatterns")(coveragePathIgnorePatterns)
    if (enabledTestsMap != null) __obj.updateDynamic("enabledTestsMap")(enabledTestsMap)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup)
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown)
    if (!js.isUndefined(noSCM)) __obj.updateDynamic("noSCM")(noSCM)
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile)
    if (replname != null) __obj.updateDynamic("replname")(replname)
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (watchPlugins != null) __obj.updateDynamic("watchPlugins")(watchPlugins)
    __obj.asInstanceOf[GlobalConfig]
  }
}

