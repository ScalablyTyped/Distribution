package typings.atJestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: Boolean
  var automock: Boolean
  var bail: Boolean | Double
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
  var maxWorkers: Double | String
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
    bail: Boolean | Double,
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
    maxWorkers: Double | String,
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
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], changedSince = changedSince.asInstanceOf[js.Any], ci = ci.asInstanceOf[js.Any], clearCache = clearCache.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], collectCoverageOnlyFrom = collectCoverageOnlyFrom.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], coverage = coverage.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], coverageThreshold = coverageThreshold.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], outputFile = outputFile.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runInBand = runInBand.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], showConfig = showConfig.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testNamePattern = testNamePattern.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (prettierPath != null) __obj.updateDynamic("prettierPath")(prettierPath.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (testFailureExitCode != null) __obj.updateDynamic("testFailureExitCode")(testFailureExitCode.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_All]
  }
}

