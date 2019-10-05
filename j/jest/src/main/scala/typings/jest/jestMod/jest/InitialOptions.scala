package typings.jest.jestMod.jest

import org.scalablytyped.runtime.StringDictionary
import typings.jest.Anon_Global
import typings.jest.jestStrings.fake
import typings.jest.jestStrings.real
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialOptions extends js.Object {
  var automock: js.UndefOr[Boolean] = js.undefined
  var bail: js.UndefOr[Boolean] = js.undefined
  var browser: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var cacheDirectory: js.UndefOr[Path] = js.undefined
  var changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined
  var changedSince: js.UndefOr[String] = js.undefined
  var clearMocks: js.UndefOr[Boolean] = js.undefined
  var collectCoverage: js.UndefOr[Boolean] = js.undefined
  var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var coverageDirectory: js.UndefOr[String] = js.undefined
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var coverageReporters: js.UndefOr[js.Array[String]] = js.undefined
  var coverageThreshold: js.UndefOr[Anon_Global] = js.undefined
  var detectLeaks: js.UndefOr[Boolean] = js.undefined
  var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Path] = js.undefined
  var findRelatedTests: js.UndefOr[Boolean] = js.undefined
  var forceCoverageMatch: js.UndefOr[js.Array[Glob]] = js.undefined
  var forceExit: js.UndefOr[Boolean] = js.undefined
  var globalSetup: js.UndefOr[Maybe[String]] = js.undefined
  var globalTeardown: js.UndefOr[Maybe[String]] = js.undefined
  var globals: js.UndefOr[ConfigGlobals] = js.undefined
  var haste: js.UndefOr[HasteConfig] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var lastCommit: js.UndefOr[Boolean] = js.undefined
  var listTests: js.UndefOr[Boolean] = js.undefined
  var logHeapUsage: js.UndefOr[Boolean] = js.undefined
  var mapCoverage: js.UndefOr[Boolean] = js.undefined
  var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var moduleLoader: js.UndefOr[Path] = js.undefined
  var moduleNameMapper: js.UndefOr[StringDictionary[String]] = js.undefined
  var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noStackTrace: js.UndefOr[Boolean] = js.undefined
  var notifyMode: js.UndefOr[String] = js.undefined
  @JSName("notify")
  var notify_FInitialOptions: js.UndefOr[Boolean] = js.undefined
  var onlyChanged: js.UndefOr[Boolean] = js.undefined
  var outputFile: js.UndefOr[Path] = js.undefined
  var passWithNoTests: js.UndefOr[Boolean] = js.undefined
  var preprocessorIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
  var preset: js.UndefOr[Maybe[String]] = js.undefined
  var projects: js.UndefOr[js.Array[Glob]] = js.undefined
  var replname: js.UndefOr[Maybe[String]] = js.undefined
  var reporters: js.UndefOr[js.Array[ReporterConfig | String]] = js.undefined
  var resetMocks: js.UndefOr[Boolean] = js.undefined
  var resetModules: js.UndefOr[Boolean] = js.undefined
  var resolver: js.UndefOr[Maybe[Path]] = js.undefined
  var restoreMocks: js.UndefOr[Boolean] = js.undefined
  var rootDir: js.UndefOr[Path] = js.undefined
  var roots: js.UndefOr[js.Array[Path]] = js.undefined
  var runTestsByPath: js.UndefOr[Boolean] = js.undefined
  var runner: js.UndefOr[String] = js.undefined
  var scriptPreprocessor: js.UndefOr[String] = js.undefined
  var setupFiles: js.UndefOr[js.Array[Path]] = js.undefined
  var setupFilesAfterEnv: js.UndefOr[js.Array[Path]] = js.undefined
  var setupTestFrameworkScriptFile: js.UndefOr[Path] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var skipFilter: js.UndefOr[Boolean] = js.undefined
  var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
  var snapshotSerializers: js.UndefOr[js.Array[Path]] = js.undefined
  var testEnvironment: js.UndefOr[String] = js.undefined
  var testEnvironmentOptions: js.UndefOr[js.Object] = js.undefined
  var testFailureExitCode: js.UndefOr[String | Double] = js.undefined
  var testLocationInResults: js.UndefOr[Boolean] = js.undefined
  var testMatch: js.UndefOr[js.Array[Glob]] = js.undefined
  var testNamePattern: js.UndefOr[String] = js.undefined
  var testPathDirs: js.UndefOr[js.Array[Path]] = js.undefined
  var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var testRegex: js.UndefOr[String] = js.undefined
  var testResultsProcessor: js.UndefOr[Maybe[String]] = js.undefined
  var testRunner: js.UndefOr[String] = js.undefined
  var testURL: js.UndefOr[String] = js.undefined
  var timers: js.UndefOr[real | fake] = js.undefined
  var transform: js.UndefOr[StringDictionary[String]] = js.undefined
  var transformIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var updateSnapshot: js.UndefOr[Boolean] = js.undefined
  var useStderr: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Maybe[Boolean]] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchAll: js.UndefOr[Boolean] = js.undefined
  var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var watchPlugins: js.UndefOr[js.Array[String]] = js.undefined
  var watchman: js.UndefOr[Boolean] = js.undefined
}

object InitialOptions {
  @scala.inline
  def apply(
    automock: js.UndefOr[Boolean] = js.undefined,
    bail: js.UndefOr[Boolean] = js.undefined,
    browser: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheDirectory: Path = null,
    changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined,
    changedSince: String = null,
    clearMocks: js.UndefOr[Boolean] = js.undefined,
    collectCoverage: js.UndefOr[Boolean] = js.undefined,
    collectCoverageFrom: js.Array[Glob] = null,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null,
    coverageDirectory: String = null,
    coveragePathIgnorePatterns: js.Array[String] = null,
    coverageReporters: js.Array[String] = null,
    coverageThreshold: Anon_Global = null,
    detectLeaks: js.UndefOr[Boolean] = js.undefined,
    detectOpenHandles: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    errorOnDeprecated: js.UndefOr[Boolean] = js.undefined,
    expand: js.UndefOr[Boolean] = js.undefined,
    filter: Path = null,
    findRelatedTests: js.UndefOr[Boolean] = js.undefined,
    forceCoverageMatch: js.Array[Glob] = null,
    forceExit: js.UndefOr[Boolean] = js.undefined,
    globalSetup: Maybe[String] = null,
    globalTeardown: Maybe[String] = null,
    globals: ConfigGlobals = null,
    haste: HasteConfig = null,
    json: js.UndefOr[Boolean] = js.undefined,
    lastCommit: js.UndefOr[Boolean] = js.undefined,
    listTests: js.UndefOr[Boolean] = js.undefined,
    logHeapUsage: js.UndefOr[Boolean] = js.undefined,
    mapCoverage: js.UndefOr[Boolean] = js.undefined,
    moduleDirectories: js.Array[String] = null,
    moduleFileExtensions: js.Array[String] = null,
    moduleLoader: Path = null,
    moduleNameMapper: StringDictionary[String] = null,
    modulePathIgnorePatterns: js.Array[String] = null,
    modulePaths: js.Array[String] = null,
    name: String = null,
    noStackTrace: js.UndefOr[Boolean] = js.undefined,
    notify: js.UndefOr[Boolean] = js.undefined,
    notifyMode: String = null,
    onlyChanged: js.UndefOr[Boolean] = js.undefined,
    outputFile: Path = null,
    passWithNoTests: js.UndefOr[Boolean] = js.undefined,
    preprocessorIgnorePatterns: js.Array[Glob] = null,
    preset: Maybe[String] = null,
    projects: js.Array[Glob] = null,
    replname: Maybe[String] = null,
    reporters: js.Array[ReporterConfig | String] = null,
    resetMocks: js.UndefOr[Boolean] = js.undefined,
    resetModules: js.UndefOr[Boolean] = js.undefined,
    resolver: Maybe[Path] = null,
    restoreMocks: js.UndefOr[Boolean] = js.undefined,
    rootDir: Path = null,
    roots: js.Array[Path] = null,
    runTestsByPath: js.UndefOr[Boolean] = js.undefined,
    runner: String = null,
    scriptPreprocessor: String = null,
    setupFiles: js.Array[Path] = null,
    setupFilesAfterEnv: js.Array[Path] = null,
    setupTestFrameworkScriptFile: Path = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    skipFilter: js.UndefOr[Boolean] = js.undefined,
    skipNodeResolution: js.UndefOr[Boolean] = js.undefined,
    snapshotSerializers: js.Array[Path] = null,
    testEnvironment: String = null,
    testEnvironmentOptions: js.Object = null,
    testFailureExitCode: String | Double = null,
    testLocationInResults: js.UndefOr[Boolean] = js.undefined,
    testMatch: js.Array[Glob] = null,
    testNamePattern: String = null,
    testPathDirs: js.Array[Path] = null,
    testPathIgnorePatterns: js.Array[String] = null,
    testRegex: String = null,
    testResultsProcessor: Maybe[String] = null,
    testRunner: String = null,
    testURL: String = null,
    timers: real | fake = null,
    transform: StringDictionary[String] = null,
    transformIgnorePatterns: js.Array[Glob] = null,
    unmockedModulePathPatterns: js.Array[String] = null,
    updateSnapshot: js.UndefOr[Boolean] = js.undefined,
    useStderr: js.UndefOr[Boolean] = js.undefined,
    verbose: Maybe[Boolean] = null,
    watch: js.UndefOr[Boolean] = js.undefined,
    watchAll: js.UndefOr[Boolean] = js.undefined,
    watchPathIgnorePatterns: js.Array[String] = null,
    watchPlugins: js.Array[String] = null,
    watchman: js.UndefOr[Boolean] = js.undefined
  ): InitialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automock)) __obj.updateDynamic("automock")(automock)
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail)
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory)
    if (!js.isUndefined(changedFilesWithAncestor)) __obj.updateDynamic("changedFilesWithAncestor")(changedFilesWithAncestor)
    if (changedSince != null) __obj.updateDynamic("changedSince")(changedSince)
    if (!js.isUndefined(clearMocks)) __obj.updateDynamic("clearMocks")(clearMocks)
    if (!js.isUndefined(collectCoverage)) __obj.updateDynamic("collectCoverage")(collectCoverage)
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom)
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom)
    if (coverageDirectory != null) __obj.updateDynamic("coverageDirectory")(coverageDirectory)
    if (coveragePathIgnorePatterns != null) __obj.updateDynamic("coveragePathIgnorePatterns")(coveragePathIgnorePatterns)
    if (coverageReporters != null) __obj.updateDynamic("coverageReporters")(coverageReporters)
    if (coverageThreshold != null) __obj.updateDynamic("coverageThreshold")(coverageThreshold)
    if (!js.isUndefined(detectLeaks)) __obj.updateDynamic("detectLeaks")(detectLeaks)
    if (!js.isUndefined(detectOpenHandles)) __obj.updateDynamic("detectOpenHandles")(detectOpenHandles)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(errorOnDeprecated)) __obj.updateDynamic("errorOnDeprecated")(errorOnDeprecated)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(findRelatedTests)) __obj.updateDynamic("findRelatedTests")(findRelatedTests)
    if (forceCoverageMatch != null) __obj.updateDynamic("forceCoverageMatch")(forceCoverageMatch)
    if (!js.isUndefined(forceExit)) __obj.updateDynamic("forceExit")(forceExit)
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (haste != null) __obj.updateDynamic("haste")(haste)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (!js.isUndefined(lastCommit)) __obj.updateDynamic("lastCommit")(lastCommit)
    if (!js.isUndefined(listTests)) __obj.updateDynamic("listTests")(listTests)
    if (!js.isUndefined(logHeapUsage)) __obj.updateDynamic("logHeapUsage")(logHeapUsage)
    if (!js.isUndefined(mapCoverage)) __obj.updateDynamic("mapCoverage")(mapCoverage)
    if (moduleDirectories != null) __obj.updateDynamic("moduleDirectories")(moduleDirectories)
    if (moduleFileExtensions != null) __obj.updateDynamic("moduleFileExtensions")(moduleFileExtensions)
    if (moduleLoader != null) __obj.updateDynamic("moduleLoader")(moduleLoader)
    if (moduleNameMapper != null) __obj.updateDynamic("moduleNameMapper")(moduleNameMapper)
    if (modulePathIgnorePatterns != null) __obj.updateDynamic("modulePathIgnorePatterns")(modulePathIgnorePatterns)
    if (modulePaths != null) __obj.updateDynamic("modulePaths")(modulePaths)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noStackTrace)) __obj.updateDynamic("noStackTrace")(noStackTrace)
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify)
    if (notifyMode != null) __obj.updateDynamic("notifyMode")(notifyMode)
    if (!js.isUndefined(onlyChanged)) __obj.updateDynamic("onlyChanged")(onlyChanged)
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile)
    if (!js.isUndefined(passWithNoTests)) __obj.updateDynamic("passWithNoTests")(passWithNoTests)
    if (preprocessorIgnorePatterns != null) __obj.updateDynamic("preprocessorIgnorePatterns")(preprocessorIgnorePatterns)
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (replname != null) __obj.updateDynamic("replname")(replname.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    if (!js.isUndefined(resetMocks)) __obj.updateDynamic("resetMocks")(resetMocks)
    if (!js.isUndefined(resetModules)) __obj.updateDynamic("resetModules")(resetModules)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreMocks)) __obj.updateDynamic("restoreMocks")(restoreMocks)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    if (roots != null) __obj.updateDynamic("roots")(roots)
    if (!js.isUndefined(runTestsByPath)) __obj.updateDynamic("runTestsByPath")(runTestsByPath)
    if (runner != null) __obj.updateDynamic("runner")(runner)
    if (scriptPreprocessor != null) __obj.updateDynamic("scriptPreprocessor")(scriptPreprocessor)
    if (setupFiles != null) __obj.updateDynamic("setupFiles")(setupFiles)
    if (setupFilesAfterEnv != null) __obj.updateDynamic("setupFilesAfterEnv")(setupFilesAfterEnv)
    if (setupTestFrameworkScriptFile != null) __obj.updateDynamic("setupTestFrameworkScriptFile")(setupTestFrameworkScriptFile)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(skipFilter)) __obj.updateDynamic("skipFilter")(skipFilter)
    if (!js.isUndefined(skipNodeResolution)) __obj.updateDynamic("skipNodeResolution")(skipNodeResolution)
    if (snapshotSerializers != null) __obj.updateDynamic("snapshotSerializers")(snapshotSerializers)
    if (testEnvironment != null) __obj.updateDynamic("testEnvironment")(testEnvironment)
    if (testEnvironmentOptions != null) __obj.updateDynamic("testEnvironmentOptions")(testEnvironmentOptions)
    if (testFailureExitCode != null) __obj.updateDynamic("testFailureExitCode")(testFailureExitCode.asInstanceOf[js.Any])
    if (!js.isUndefined(testLocationInResults)) __obj.updateDynamic("testLocationInResults")(testLocationInResults)
    if (testMatch != null) __obj.updateDynamic("testMatch")(testMatch)
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern)
    if (testPathDirs != null) __obj.updateDynamic("testPathDirs")(testPathDirs)
    if (testPathIgnorePatterns != null) __obj.updateDynamic("testPathIgnorePatterns")(testPathIgnorePatterns)
    if (testRegex != null) __obj.updateDynamic("testRegex")(testRegex)
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (testRunner != null) __obj.updateDynamic("testRunner")(testRunner)
    if (testURL != null) __obj.updateDynamic("testURL")(testURL)
    if (timers != null) __obj.updateDynamic("timers")(timers.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transformIgnorePatterns != null) __obj.updateDynamic("transformIgnorePatterns")(transformIgnorePatterns)
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns)
    if (!js.isUndefined(updateSnapshot)) __obj.updateDynamic("updateSnapshot")(updateSnapshot)
    if (!js.isUndefined(useStderr)) __obj.updateDynamic("useStderr")(useStderr)
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    if (!js.isUndefined(watchAll)) __obj.updateDynamic("watchAll")(watchAll)
    if (watchPathIgnorePatterns != null) __obj.updateDynamic("watchPathIgnorePatterns")(watchPathIgnorePatterns)
    if (watchPlugins != null) __obj.updateDynamic("watchPlugins")(watchPlugins)
    if (!js.isUndefined(watchman)) __obj.updateDynamic("watchman")(watchman)
    __obj.asInstanceOf[InitialOptions]
  }
}

