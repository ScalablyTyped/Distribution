package typings.jestDashCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: Boolean
  var automock: Boolean
  var bail: Double | Boolean
  var browser: Boolean
  var cache: Boolean
  var cacheDirectory: String
  var changedFilesWithAncestor: Boolean
  var changedSince: String
  var ci: Boolean
  var clearCache: Boolean
  var clearMocks: Boolean
  var collectCoverage: Boolean
  var collectCoverageFrom: String
  var collectCoverageOnlyFrom: js.Array[String]
  var color: Boolean
  var colors: Boolean
  var config: String
  var coverage: Boolean
  var coverageDirectory: String
  var coveragePathIgnorePatterns: js.Array[String]
  var coverageReporters: js.Array[String]
  var coverageThreshold: String
  var debug: Boolean
  var env: String
  var expand: Boolean
  var findRelatedTests: Boolean
  var forceExit: Boolean
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  var globals: String
  var haste: String
  var init: Boolean
  var json: Boolean
  var lastCommit: Boolean
  var logHeapUsage: Boolean
  var maxWorkers: String | Double
  var moduleDirectories: js.Array[String]
  var moduleFileExtensions: js.Array[String]
  var moduleNameMapper: String
  var modulePathIgnorePatterns: js.Array[String]
  var modulePaths: js.Array[String]
  var noStackTrace: Boolean
  var notifyMode: String
  @JSName("notify")
  var notify_FAnon_All: Boolean
  var onlyChanged: Boolean
  var outputFile: String
  var preset: js.UndefOr[String | Null] = js.undefined
  var prettierPath: js.UndefOr[String | Null] = js.undefined
  var projects: js.Array[String]
  var resetMocks: Boolean
  var resetModules: Boolean
  var resolver: js.UndefOr[String | Null] = js.undefined
  var restoreMocks: Boolean
  var rootDir: String
  var roots: js.Array[String]
  var runInBand: Boolean
  var setupFiles: js.Array[String]
  var setupFilesAfterEnv: js.Array[String]
  var showConfig: Boolean
  var silent: Boolean
  var snapshotSerializers: js.Array[String]
  var testEnvironment: String
  var testFailureExitCode: js.UndefOr[String | Null] = js.undefined
  var testMatch: js.Array[String]
  var testNamePattern: String
  var testPathIgnorePatterns: js.Array[String]
  var testPathPattern: js.Array[String]
  var testRegex: String | js.Array[String]
  var testResultsProcessor: js.UndefOr[String | Null] = js.undefined
  var testRunner: String
  var testSequencer: String
  var testTimeout: js.UndefOr[Double | Null] = js.undefined
  var testURL: String
  var timers: String
  var transform: String
  var transformIgnorePatterns: js.Array[String]
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String] | Null] = js.undefined
  var updateSnapshot: Boolean
  var useStderr: Boolean
  var verbose: js.UndefOr[Boolean | Null] = js.undefined
  var version: Boolean
  var watch: Boolean
  var watchAll: Boolean
  var watchPathIgnorePatterns: js.Array[String]
  var watchman: Boolean
}

object Anon_All {
  @scala.inline
  def apply(
    all: Boolean,
    automock: Boolean,
    bail: Double | Boolean,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: String,
    changedFilesWithAncestor: Boolean,
    changedSince: String,
    ci: Boolean,
    clearCache: Boolean,
    clearMocks: Boolean,
    collectCoverage: Boolean,
    collectCoverageFrom: String,
    collectCoverageOnlyFrom: js.Array[String],
    color: Boolean,
    colors: Boolean,
    config: String,
    coverage: Boolean,
    coverageDirectory: String,
    coveragePathIgnorePatterns: js.Array[String],
    coverageReporters: js.Array[String],
    coverageThreshold: String,
    debug: Boolean,
    env: String,
    expand: Boolean,
    findRelatedTests: Boolean,
    forceExit: Boolean,
    globals: String,
    haste: String,
    init: Boolean,
    json: Boolean,
    lastCommit: Boolean,
    logHeapUsage: Boolean,
    maxWorkers: String | Double,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleNameMapper: String,
    modulePathIgnorePatterns: js.Array[String],
    modulePaths: js.Array[String],
    noStackTrace: Boolean,
    notify: Boolean,
    notifyMode: String,
    onlyChanged: Boolean,
    outputFile: String,
    projects: js.Array[String],
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    rootDir: String,
    roots: js.Array[String],
    runInBand: Boolean,
    setupFiles: js.Array[String],
    setupFilesAfterEnv: js.Array[String],
    showConfig: Boolean,
    silent: Boolean,
    snapshotSerializers: js.Array[String],
    testEnvironment: String,
    testMatch: js.Array[String],
    testNamePattern: String,
    testPathIgnorePatterns: js.Array[String],
    testPathPattern: js.Array[String],
    testRegex: String | js.Array[String],
    testRunner: String,
    testSequencer: String,
    testURL: String,
    timers: String,
    transform: String,
    transformIgnorePatterns: js.Array[String],
    updateSnapshot: Boolean,
    useStderr: Boolean,
    version: Boolean,
    watch: Boolean,
    watchAll: Boolean,
    watchPathIgnorePatterns: js.Array[String],
    watchman: Boolean,
    globalSetup: String = null,
    globalTeardown: String = null,
    preset: String = null,
    prettierPath: String = null,
    resolver: String = null,
    testFailureExitCode: String = null,
    testResultsProcessor: String = null,
    testTimeout: Int | Double = null,
    unmockedModulePathPatterns: js.Array[String] = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Anon_All = {
    val __obj = js.Dynamic.literal(all = all, automock = automock, bail = bail.asInstanceOf[js.Any], browser = browser, cache = cache, cacheDirectory = cacheDirectory, changedFilesWithAncestor = changedFilesWithAncestor, changedSince = changedSince, ci = ci, clearCache = clearCache, clearMocks = clearMocks, collectCoverage = collectCoverage, collectCoverageFrom = collectCoverageFrom, collectCoverageOnlyFrom = collectCoverageOnlyFrom, color = color, colors = colors, config = config, coverage = coverage, coverageDirectory = coverageDirectory, coveragePathIgnorePatterns = coveragePathIgnorePatterns, coverageReporters = coverageReporters, coverageThreshold = coverageThreshold, debug = debug, env = env, expand = expand, findRelatedTests = findRelatedTests, forceExit = forceExit, globals = globals, haste = haste, init = init, json = json, lastCommit = lastCommit, logHeapUsage = logHeapUsage, maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories, moduleFileExtensions = moduleFileExtensions, moduleNameMapper = moduleNameMapper, modulePathIgnorePatterns = modulePathIgnorePatterns, modulePaths = modulePaths, noStackTrace = noStackTrace, notify = notify, notifyMode = notifyMode, onlyChanged = onlyChanged, outputFile = outputFile, projects = projects, resetMocks = resetMocks, resetModules = resetModules, restoreMocks = restoreMocks, rootDir = rootDir, roots = roots, runInBand = runInBand, setupFiles = setupFiles, setupFilesAfterEnv = setupFilesAfterEnv, showConfig = showConfig, silent = silent, snapshotSerializers = snapshotSerializers, testEnvironment = testEnvironment, testMatch = testMatch, testNamePattern = testNamePattern, testPathIgnorePatterns = testPathIgnorePatterns, testPathPattern = testPathPattern, testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner, testSequencer = testSequencer, testURL = testURL, timers = timers, transform = transform, transformIgnorePatterns = transformIgnorePatterns, updateSnapshot = updateSnapshot, useStderr = useStderr, version = version, watch = watch, watchAll = watchAll, watchPathIgnorePatterns = watchPathIgnorePatterns, watchman = watchman)
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup)
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown)
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (prettierPath != null) __obj.updateDynamic("prettierPath")(prettierPath)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    if (testFailureExitCode != null) __obj.updateDynamic("testFailureExitCode")(testFailureExitCode)
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor)
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_All]
  }
}

