package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var bail: scala.Boolean
  var changedFilesWithAncestor: scala.Boolean
  var changedSince: java.lang.String
  var collectCoverage: scala.Boolean
  var collectCoverageFrom: js.Array[java.lang.String]
  var collectCoverageOnlyFrom: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var coverageDirectory: java.lang.String
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var coverageReporters: js.Array[java.lang.String]
  var coverageThreshold: jestDashCliLib.Anon_Global
  var detectLeaks: scala.Boolean
  var detectOpenHandles: scala.Boolean
  var enabledTestsMap: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  ] = js.undefined
  var errorOnDeprecated: scala.Boolean
  var expand: scala.Boolean
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var findRelatedTests: scala.Boolean
  var forceExit: scala.Boolean
  var globalSetup: js.UndefOr[java.lang.String] = js.undefined
  var globalTeardown: js.UndefOr[java.lang.String] = js.undefined
  var json: scala.Boolean
  var lastCommit: scala.Boolean
  var listTests: scala.Boolean
  var logHeapUsage: scala.Boolean
  var maxWorkers: scala.Double
  var noSCM: js.UndefOr[scala.Boolean] = js.undefined
  var noStackTrace: scala.Boolean
  var nonFlagArgs: js.Array[java.lang.String]
  var notifyMode: java.lang.String
  @JSName("notify")
  var notify_FGlobalConfig: scala.Boolean
  var onlyChanged: scala.Boolean
  var onlyFailures: scala.Boolean
  var outputFile: js.UndefOr[java.lang.String] = js.undefined
  var passWithNoTests: scala.Boolean
  var projects: js.Array[java.lang.String]
  var replname: js.UndefOr[java.lang.String] = js.undefined
  var reporters: js.Array[java.lang.String | ReporterConfig]
  var rootDir: java.lang.String
  var runTestsByPath: scala.Boolean
  var silent: scala.Boolean
  var skipFilter: scala.Boolean
  var testFailureExitCode: scala.Double
  var testNamePattern: java.lang.String
  var testPathPattern: java.lang.String
  var testResultsProcessor: js.UndefOr[java.lang.String] = js.undefined
  var updateSnapshot: SnapshotUpdateState
  var useStderr: scala.Boolean
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var watch: scala.Boolean
  var watchAll: scala.Boolean
  var watchPlugins: js.UndefOr[js.Array[jestDashCliLib.Anon_Config]] = js.undefined
  var watchman: scala.Boolean
}

object GlobalConfig {
  @scala.inline
  def apply(
    bail: scala.Boolean,
    changedFilesWithAncestor: scala.Boolean,
    changedSince: java.lang.String,
    collectCoverage: scala.Boolean,
    collectCoverageFrom: js.Array[java.lang.String],
    coverageDirectory: java.lang.String,
    coverageReporters: js.Array[java.lang.String],
    coverageThreshold: jestDashCliLib.Anon_Global,
    detectLeaks: scala.Boolean,
    detectOpenHandles: scala.Boolean,
    errorOnDeprecated: scala.Boolean,
    expand: scala.Boolean,
    findRelatedTests: scala.Boolean,
    forceExit: scala.Boolean,
    json: scala.Boolean,
    lastCommit: scala.Boolean,
    listTests: scala.Boolean,
    logHeapUsage: scala.Boolean,
    maxWorkers: scala.Double,
    noStackTrace: scala.Boolean,
    nonFlagArgs: js.Array[java.lang.String],
    notify: scala.Boolean,
    notifyMode: java.lang.String,
    onlyChanged: scala.Boolean,
    onlyFailures: scala.Boolean,
    passWithNoTests: scala.Boolean,
    projects: js.Array[java.lang.String],
    reporters: js.Array[java.lang.String | ReporterConfig],
    rootDir: java.lang.String,
    runTestsByPath: scala.Boolean,
    silent: scala.Boolean,
    skipFilter: scala.Boolean,
    testFailureExitCode: scala.Double,
    testNamePattern: java.lang.String,
    testPathPattern: java.lang.String,
    updateSnapshot: SnapshotUpdateState,
    useStderr: scala.Boolean,
    watch: scala.Boolean,
    watchAll: scala.Boolean,
    watchman: scala.Boolean,
    collectCoverageOnlyFrom: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    coveragePathIgnorePatterns: js.Array[java.lang.String] = null,
    enabledTestsMap: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = null,
    filter: java.lang.String = null,
    globalSetup: java.lang.String = null,
    globalTeardown: java.lang.String = null,
    noSCM: js.UndefOr[scala.Boolean] = js.undefined,
    outputFile: java.lang.String = null,
    replname: java.lang.String = null,
    testResultsProcessor: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    watchPlugins: js.Array[jestDashCliLib.Anon_Config] = null
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

