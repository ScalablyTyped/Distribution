package typings.jestDashConfig.buildNormalizeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJestTypes.Anon_Config
import typings.atJestTypes.buildConfigMod.ConfigGlobals
import typings.atJestTypes.buildConfigMod.CoverageThreshold
import typings.atJestTypes.buildConfigMod.DisplayName
import typings.atJestTypes.buildConfigMod.Glob
import typings.atJestTypes.buildConfigMod.HasteConfig
import typings.atJestTypes.buildConfigMod.NotifyMode
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ReporterConfig
import typings.atJestTypes.buildConfigMod.SnapshotUpdateState
import typings.jestDashConfig.jestDashConfigStrings.`json-summary`
import typings.jestDashConfig.jestDashConfigStrings.`text-lcov`
import typings.jestDashConfig.jestDashConfigStrings.`text-summary`
import typings.jestDashConfig.jestDashConfigStrings.clover
import typings.jestDashConfig.jestDashConfigStrings.cobertura
import typings.jestDashConfig.jestDashConfigStrings.fake
import typings.jestDashConfig.jestDashConfigStrings.html
import typings.jestDashConfig.jestDashConfigStrings.json_
import typings.jestDashConfig.jestDashConfigStrings.lcovonly
import typings.jestDashConfig.jestDashConfigStrings.none
import typings.jestDashConfig.jestDashConfigStrings.real
import typings.jestDashConfig.jestDashConfigStrings.teamcity
import typings.jestDashConfig.jestDashConfigStrings.text
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/types.@jest/types.Config.ProjectConfig & @jest/types.@jest/types.Config.GlobalConfig */
trait AllOptions extends js.Object {
  var automock: Boolean
  var bail: Double
  var browser: Boolean
  var cache: Boolean
  var cacheDirectory: Path
  var changedFilesWithAncestor: Boolean
  var changedSince: String
  var clearMocks: Boolean
  var collectCoverage: Boolean
  var collectCoverageFrom: js.Array[Glob]
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.undefined
  var coverageDirectory: String
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var coverageReporters: js.Array[
    clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
  ]
  var coverageThreshold: CoverageThreshold
  var cwd: Path
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  var detectLeaks: Boolean
  var detectOpenHandles: Boolean
  var displayName: js.UndefOr[DisplayName] = js.undefined
  var enabledTestsMap: js.UndefOr[StringDictionary[StringDictionary[Boolean]] | Null] = js.undefined
  var errorOnDeprecated: Boolean
  var expand: Boolean
  var extraGlobals: (js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
  ]) with js.Array[String]
  var filter: js.UndefOr[Path | Null] = js.undefined
  var findRelatedTests: Boolean
  var forceCoverageMatch: js.Array[Glob]
  var forceExit: Boolean
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  var globals: ConfigGlobals
  var haste: HasteConfig
  var json: Boolean
  var lastCommit: Boolean
  var listTests: Boolean
  var logHeapUsage: Boolean
  var maxConcurrency: Double
  var maxWorkers: Double
  var moduleDirectories: js.Array[String]
  var moduleFileExtensions: js.Array[String]
  var moduleLoader: Path
  var moduleNameMapper: js.Array[js.Tuple2[String, String]]
  var modulePathIgnorePatterns: js.Array[String]
  var modulePaths: js.Array[String]
  var name: String
  var noSCM: js.UndefOr[Boolean | Null] = js.undefined
  var noStackTrace: Boolean
  var nonFlagArgs: js.Array[String]
  var notifyMode: NotifyMode
  @JSName("notify")
  var notify_FAllOptions: Boolean
  var onlyChanged: Boolean
  var onlyFailures: Boolean
  var outputFile: js.UndefOr[Path | Null] = js.undefined
  var passWithNoTests: Boolean
  var prettierPath: String
  var projects: js.Array[Glob]
  var replname: js.UndefOr[String | Null] = js.undefined
  var reporters: js.Array[String | ReporterConfig]
  var resetMocks: Boolean
  var resetModules: Boolean
  var resolver: js.UndefOr[Path | Null] = js.undefined
  var restoreMocks: Boolean
  var rootDir: Path
  var roots: js.Array[Path]
  var runTestsByPath: Boolean
  var runner: String
  var setupFiles: js.Array[Path]
  var setupFilesAfterEnv: js.Array[Path]
  var silent: Boolean
  var skipFilter: Boolean
  var skipNodeResolution: Boolean
  var snapshotResolver: js.UndefOr[Path | Null] = js.undefined
  var snapshotSerializers: js.Array[Path]
  var testEnvironment: String
  var testEnvironmentOptions: Record[String, _]
  var testFailureExitCode: Double
  var testLocationInResults: Boolean
  var testMatch: js.Array[Glob]
  var testNamePattern: String
  var testPathIgnorePatterns: js.Array[String]
  var testPathPattern: String
  var testRegex: js.Array[String]
  var testResultsProcessor: js.UndefOr[String | Null] = js.undefined
  var testRunner: String
  var testSequencer: String
  var testTimeout: Double
  var testURL: String
  var timers: real | fake
  var transform: js.Array[js.Tuple3[String, Path, Record[String, _]]]
  var transformIgnorePatterns: js.Array[Glob]
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String] | Null] = js.undefined
  var updateSnapshot: SnapshotUpdateState
  var useStderr: Boolean
  var verbose: js.UndefOr[Boolean | Null] = js.undefined
  var watch: Boolean
  var watchAll: Boolean
  var watchPathIgnorePatterns: js.Array[String]
  var watchPlugins: js.UndefOr[js.Array[Anon_Config] | Null] = js.undefined
  var watchman: Boolean
}

object AllOptions {
  @scala.inline
  def apply(
    automock: Boolean,
    bail: Double,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: Path,
    changedFilesWithAncestor: Boolean,
    changedSince: String,
    clearMocks: Boolean,
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[Glob],
    coverageDirectory: String,
    coverageReporters: js.Array[
      clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
    ],
    coverageThreshold: CoverageThreshold,
    cwd: Path,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    expand: Boolean,
    extraGlobals: (js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
    ]) with js.Array[String],
    findRelatedTests: Boolean,
    forceCoverageMatch: js.Array[Glob],
    forceExit: Boolean,
    globals: ConfigGlobals,
    haste: HasteConfig,
    json: Boolean,
    lastCommit: Boolean,
    listTests: Boolean,
    logHeapUsage: Boolean,
    maxConcurrency: Double,
    maxWorkers: Double,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleLoader: Path,
    moduleNameMapper: js.Array[js.Tuple2[String, String]],
    modulePathIgnorePatterns: js.Array[String],
    modulePaths: js.Array[String],
    name: String,
    noStackTrace: Boolean,
    nonFlagArgs: js.Array[String],
    notify: Boolean,
    notifyMode: NotifyMode,
    onlyChanged: Boolean,
    onlyFailures: Boolean,
    passWithNoTests: Boolean,
    prettierPath: String,
    projects: js.Array[Glob],
    reporters: js.Array[String | ReporterConfig],
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    rootDir: Path,
    roots: js.Array[Path],
    runTestsByPath: Boolean,
    runner: String,
    setupFiles: js.Array[Path],
    setupFilesAfterEnv: js.Array[Path],
    silent: Boolean,
    skipFilter: Boolean,
    skipNodeResolution: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, _],
    testFailureExitCode: Double,
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testNamePattern: String,
    testPathIgnorePatterns: js.Array[String],
    testPathPattern: String,
    testRegex: js.Array[String],
    testRunner: String,
    testSequencer: String,
    testTimeout: Double,
    testURL: String,
    timers: real | fake,
    transform: js.Array[js.Tuple3[String, Path, Record[String, _]]],
    transformIgnorePatterns: js.Array[Glob],
    updateSnapshot: SnapshotUpdateState,
    useStderr: Boolean,
    watch: Boolean,
    watchAll: Boolean,
    watchPathIgnorePatterns: js.Array[String],
    watchman: Boolean,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null,
    coveragePathIgnorePatterns: js.Array[String] = null,
    dependencyExtractor: String = null,
    displayName: DisplayName = null,
    enabledTestsMap: StringDictionary[StringDictionary[Boolean]] = null,
    filter: Path = null,
    globalSetup: String = null,
    globalTeardown: String = null,
    noSCM: js.UndefOr[Boolean] = js.undefined,
    outputFile: Path = null,
    replname: String = null,
    resolver: Path = null,
    snapshotResolver: Path = null,
    testResultsProcessor: String = null,
    unmockedModulePathPatterns: js.Array[String] = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watchPlugins: js.Array[Anon_Config] = null
  ): AllOptions = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], changedSince = changedSince.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], coverageThreshold = coverageThreshold.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleLoader = moduleLoader.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], skipNodeResolution = skipNodeResolution.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testNamePattern = testNamePattern.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (coveragePathIgnorePatterns != null) __obj.updateDynamic("coveragePathIgnorePatterns")(coveragePathIgnorePatterns.asInstanceOf[js.Any])
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enabledTestsMap != null) __obj.updateDynamic("enabledTestsMap")(enabledTestsMap.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (!js.isUndefined(noSCM)) __obj.updateDynamic("noSCM")(noSCM.asInstanceOf[js.Any])
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile.asInstanceOf[js.Any])
    if (replname != null) __obj.updateDynamic("replname")(replname.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (snapshotResolver != null) __obj.updateDynamic("snapshotResolver")(snapshotResolver.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (watchPlugins != null) __obj.updateDynamic("watchPlugins")(watchPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllOptions]
  }
}

