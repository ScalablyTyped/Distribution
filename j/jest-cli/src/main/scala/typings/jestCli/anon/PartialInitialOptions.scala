package typings.jestCli.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jestCli.jestCliStrings.fake
import typings.jestCli.jestCliStrings.real
import typings.jestTypes.anon.Global
import typings.jestTypes.configMod.ConfigGlobals
import typings.jestTypes.configMod.DisplayName
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.HasteConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ReporterConfig
import typings.jestTypes.configMod.TransformerConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jest/types.@jest/types.Config.InitialOptions> */
trait PartialInitialOptions extends js.Object {
  var automock: js.UndefOr[Boolean] = js.undefined
  var bail: js.UndefOr[Boolean | Double] = js.undefined
  var browser: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var cacheDirectory: js.UndefOr[Path] = js.undefined
  var changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined
  var changedSince: js.UndefOr[java.lang.String] = js.undefined
  var clearMocks: js.UndefOr[Boolean] = js.undefined
  var collectCoverage: js.UndefOr[Boolean] = js.undefined
  var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var coverageDirectory: js.UndefOr[java.lang.String] = js.undefined
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var coverageReporters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var coverageThreshold: js.UndefOr[Global] = js.undefined
  var dependencyExtractor: js.UndefOr[java.lang.String] = js.undefined
  var detectLeaks: js.UndefOr[Boolean] = js.undefined
  var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
  var displayName: js.UndefOr[DisplayName] = js.undefined
  var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var extraGlobals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[Path] = js.undefined
  var findRelatedTests: js.UndefOr[Boolean] = js.undefined
  var forceCoverageMatch: js.UndefOr[js.Array[Glob]] = js.undefined
  var forceExit: js.UndefOr[Boolean] = js.undefined
  var globalSetup: js.UndefOr[java.lang.String] = js.undefined
  var globalTeardown: js.UndefOr[java.lang.String] = js.undefined
  var globals: js.UndefOr[ConfigGlobals] = js.undefined
  var haste: js.UndefOr[HasteConfig] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var lastCommit: js.UndefOr[Boolean] = js.undefined
  var listTests: js.UndefOr[Boolean] = js.undefined
  var logHeapUsage: js.UndefOr[Boolean] = js.undefined
  var mapCoverage: js.UndefOr[Boolean] = js.undefined
  var maxConcurrency: js.UndefOr[Double] = js.undefined
  var maxWorkers: js.UndefOr[Double | java.lang.String] = js.undefined
  var moduleDirectories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var moduleFileExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var moduleLoader: js.UndefOr[Path] = js.undefined
  var moduleNameMapper: js.UndefOr[StringDictionary[java.lang.String]] = js.undefined
  var modulePathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var modulePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noStackTrace: js.UndefOr[Boolean] = js.undefined
  var notifyMode: js.UndefOr[java.lang.String] = js.undefined
  @JSName("notify")
  var notify_FPartialInitialOptions: js.UndefOr[Boolean] = js.undefined
  var onlyChanged: js.UndefOr[Boolean] = js.undefined
  var outputFile: js.UndefOr[Path] = js.undefined
  var passWithNoTests: js.UndefOr[Boolean] = js.undefined
  var preprocessorIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
  var preset: js.UndefOr[java.lang.String] = js.undefined
  var prettierPath: js.UndefOr[java.lang.String] = js.undefined
  var projects: js.UndefOr[js.Array[Glob]] = js.undefined
  var replname: js.UndefOr[java.lang.String] = js.undefined
  var reporters: js.UndefOr[js.Array[java.lang.String | ReporterConfig]] = js.undefined
  var resetMocks: js.UndefOr[Boolean] = js.undefined
  var resetModules: js.UndefOr[Boolean] = js.undefined
  var resolver: js.UndefOr[Path] = js.undefined
  var restoreMocks: js.UndefOr[Boolean] = js.undefined
  var rootDir: js.UndefOr[Path] = js.undefined
  var roots: js.UndefOr[js.Array[Path]] = js.undefined
  var runTestsByPath: js.UndefOr[Boolean] = js.undefined
  var runner: js.UndefOr[java.lang.String] = js.undefined
  var scriptPreprocessor: js.UndefOr[java.lang.String] = js.undefined
  var setupFiles: js.UndefOr[js.Array[Path]] = js.undefined
  var setupFilesAfterEnv: js.UndefOr[js.Array[Path]] = js.undefined
  var setupTestFrameworkScriptFile: js.UndefOr[Path] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var skipFilter: js.UndefOr[Boolean] = js.undefined
  var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
  var snapshotResolver: js.UndefOr[Path] = js.undefined
  var snapshotSerializers: js.UndefOr[js.Array[Path]] = js.undefined
  var testEnvironment: js.UndefOr[java.lang.String] = js.undefined
  var testEnvironmentOptions: js.UndefOr[Record[java.lang.String, _]] = js.undefined
  var testFailureExitCode: js.UndefOr[java.lang.String | Double] = js.undefined
  var testLocationInResults: js.UndefOr[Boolean] = js.undefined
  var testMatch: js.UndefOr[js.Array[Glob]] = js.undefined
  var testNamePattern: js.UndefOr[java.lang.String] = js.undefined
  var testPathDirs: js.UndefOr[js.Array[Path]] = js.undefined
  var testPathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var testRegex: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var testResultsProcessor: js.UndefOr[java.lang.String] = js.undefined
  var testRunner: js.UndefOr[java.lang.String] = js.undefined
  var testSequencer: js.UndefOr[java.lang.String] = js.undefined
  var testTimeout: js.UndefOr[Double] = js.undefined
  var testURL: js.UndefOr[java.lang.String] = js.undefined
  var timers: js.UndefOr[real | fake] = js.undefined
  var transform: js.UndefOr[StringDictionary[Path | TransformerConfig]] = js.undefined
  var transformIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
  var unmockedModulePathPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var updateSnapshot: js.UndefOr[Boolean] = js.undefined
  var useStderr: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchAll: js.UndefOr[Boolean] = js.undefined
  var watchPathIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var watchPlugins: js.UndefOr[
    js.Array[java.lang.String | (js.Tuple2[java.lang.String, Record[java.lang.String, _]])]
  ] = js.undefined
  var watchman: js.UndefOr[Boolean] = js.undefined
}

object PartialInitialOptions {
  @scala.inline
  def apply(
    automock: js.UndefOr[Boolean] = js.undefined,
    bail: Boolean | Double = null,
    browser: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheDirectory: Path = null,
    changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined,
    changedSince: java.lang.String = null,
    clearMocks: js.UndefOr[Boolean] = js.undefined,
    collectCoverage: js.UndefOr[Boolean] = js.undefined,
    collectCoverageFrom: js.Array[Glob] = null,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null,
    coverageDirectory: java.lang.String = null,
    coveragePathIgnorePatterns: js.Array[java.lang.String] = null,
    coverageReporters: js.Array[java.lang.String] = null,
    coverageThreshold: Global = null,
    dependencyExtractor: java.lang.String = null,
    detectLeaks: js.UndefOr[Boolean] = js.undefined,
    detectOpenHandles: js.UndefOr[Boolean] = js.undefined,
    displayName: DisplayName = null,
    errorOnDeprecated: js.UndefOr[Boolean] = js.undefined,
    expand: js.UndefOr[Boolean] = js.undefined,
    extraGlobals: js.Array[java.lang.String] = null,
    filter: Path = null,
    findRelatedTests: js.UndefOr[Boolean] = js.undefined,
    forceCoverageMatch: js.Array[Glob] = null,
    forceExit: js.UndefOr[Boolean] = js.undefined,
    globalSetup: java.lang.String = null,
    globalTeardown: java.lang.String = null,
    globals: ConfigGlobals = null,
    haste: HasteConfig = null,
    json: js.UndefOr[Boolean] = js.undefined,
    lastCommit: js.UndefOr[Boolean] = js.undefined,
    listTests: js.UndefOr[Boolean] = js.undefined,
    logHeapUsage: js.UndefOr[Boolean] = js.undefined,
    mapCoverage: js.UndefOr[Boolean] = js.undefined,
    maxConcurrency: js.UndefOr[Double] = js.undefined,
    maxWorkers: Double | java.lang.String = null,
    moduleDirectories: js.Array[java.lang.String] = null,
    moduleFileExtensions: js.Array[java.lang.String] = null,
    moduleLoader: Path = null,
    moduleNameMapper: StringDictionary[java.lang.String] = null,
    modulePathIgnorePatterns: js.Array[java.lang.String] = null,
    modulePaths: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    noStackTrace: js.UndefOr[Boolean] = js.undefined,
    notify: js.UndefOr[Boolean] = js.undefined,
    notifyMode: java.lang.String = null,
    onlyChanged: js.UndefOr[Boolean] = js.undefined,
    outputFile: Path = null,
    passWithNoTests: js.UndefOr[Boolean] = js.undefined,
    preprocessorIgnorePatterns: js.Array[Glob] = null,
    preset: java.lang.String = null,
    prettierPath: java.lang.String = null,
    projects: js.Array[Glob] = null,
    replname: java.lang.String = null,
    reporters: js.Array[java.lang.String | ReporterConfig] = null,
    resetMocks: js.UndefOr[Boolean] = js.undefined,
    resetModules: js.UndefOr[Boolean] = js.undefined,
    resolver: Path = null,
    restoreMocks: js.UndefOr[Boolean] = js.undefined,
    rootDir: Path = null,
    roots: js.Array[Path] = null,
    runTestsByPath: js.UndefOr[Boolean] = js.undefined,
    runner: java.lang.String = null,
    scriptPreprocessor: java.lang.String = null,
    setupFiles: js.Array[Path] = null,
    setupFilesAfterEnv: js.Array[Path] = null,
    setupTestFrameworkScriptFile: Path = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    skipFilter: js.UndefOr[Boolean] = js.undefined,
    skipNodeResolution: js.UndefOr[Boolean] = js.undefined,
    snapshotResolver: Path = null,
    snapshotSerializers: js.Array[Path] = null,
    testEnvironment: java.lang.String = null,
    testEnvironmentOptions: Record[java.lang.String, _] = null,
    testFailureExitCode: java.lang.String | Double = null,
    testLocationInResults: js.UndefOr[Boolean] = js.undefined,
    testMatch: js.Array[Glob] = null,
    testNamePattern: java.lang.String = null,
    testPathDirs: js.Array[Path] = null,
    testPathIgnorePatterns: js.Array[java.lang.String] = null,
    testRegex: java.lang.String | js.Array[java.lang.String] = null,
    testResultsProcessor: java.lang.String = null,
    testRunner: java.lang.String = null,
    testSequencer: java.lang.String = null,
    testTimeout: js.UndefOr[Double] = js.undefined,
    testURL: java.lang.String = null,
    timers: real | fake = null,
    transform: StringDictionary[Path | TransformerConfig] = null,
    transformIgnorePatterns: js.Array[Glob] = null,
    unmockedModulePathPatterns: js.Array[java.lang.String] = null,
    updateSnapshot: js.UndefOr[Boolean] = js.undefined,
    useStderr: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined,
    watchAll: js.UndefOr[Boolean] = js.undefined,
    watchPathIgnorePatterns: js.Array[java.lang.String] = null,
    watchPlugins: js.Array[java.lang.String | (js.Tuple2[java.lang.String, Record[java.lang.String, _]])] = null,
    watchman: js.UndefOr[Boolean] = js.undefined
  ): PartialInitialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automock)) __obj.updateDynamic("automock")(automock.get.asInstanceOf[js.Any])
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(changedFilesWithAncestor)) __obj.updateDynamic("changedFilesWithAncestor")(changedFilesWithAncestor.get.asInstanceOf[js.Any])
    if (changedSince != null) __obj.updateDynamic("changedSince")(changedSince.asInstanceOf[js.Any])
    if (!js.isUndefined(clearMocks)) __obj.updateDynamic("clearMocks")(clearMocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collectCoverage)) __obj.updateDynamic("collectCoverage")(collectCoverage.get.asInstanceOf[js.Any])
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (coverageDirectory != null) __obj.updateDynamic("coverageDirectory")(coverageDirectory.asInstanceOf[js.Any])
    if (coveragePathIgnorePatterns != null) __obj.updateDynamic("coveragePathIgnorePatterns")(coveragePathIgnorePatterns.asInstanceOf[js.Any])
    if (coverageReporters != null) __obj.updateDynamic("coverageReporters")(coverageReporters.asInstanceOf[js.Any])
    if (coverageThreshold != null) __obj.updateDynamic("coverageThreshold")(coverageThreshold.asInstanceOf[js.Any])
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor.asInstanceOf[js.Any])
    if (!js.isUndefined(detectLeaks)) __obj.updateDynamic("detectLeaks")(detectLeaks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detectOpenHandles)) __obj.updateDynamic("detectOpenHandles")(detectOpenHandles.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnDeprecated)) __obj.updateDynamic("errorOnDeprecated")(errorOnDeprecated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (extraGlobals != null) __obj.updateDynamic("extraGlobals")(extraGlobals.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(findRelatedTests)) __obj.updateDynamic("findRelatedTests")(findRelatedTests.get.asInstanceOf[js.Any])
    if (forceCoverageMatch != null) __obj.updateDynamic("forceCoverageMatch")(forceCoverageMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(forceExit)) __obj.updateDynamic("forceExit")(forceExit.get.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (haste != null) __obj.updateDynamic("haste")(haste.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastCommit)) __obj.updateDynamic("lastCommit")(lastCommit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(listTests)) __obj.updateDynamic("listTests")(listTests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logHeapUsage)) __obj.updateDynamic("logHeapUsage")(logHeapUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapCoverage)) __obj.updateDynamic("mapCoverage")(mapCoverage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrency)) __obj.updateDynamic("maxConcurrency")(maxConcurrency.get.asInstanceOf[js.Any])
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (moduleDirectories != null) __obj.updateDynamic("moduleDirectories")(moduleDirectories.asInstanceOf[js.Any])
    if (moduleFileExtensions != null) __obj.updateDynamic("moduleFileExtensions")(moduleFileExtensions.asInstanceOf[js.Any])
    if (moduleLoader != null) __obj.updateDynamic("moduleLoader")(moduleLoader.asInstanceOf[js.Any])
    if (moduleNameMapper != null) __obj.updateDynamic("moduleNameMapper")(moduleNameMapper.asInstanceOf[js.Any])
    if (modulePathIgnorePatterns != null) __obj.updateDynamic("modulePathIgnorePatterns")(modulePathIgnorePatterns.asInstanceOf[js.Any])
    if (modulePaths != null) __obj.updateDynamic("modulePaths")(modulePaths.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noStackTrace)) __obj.updateDynamic("noStackTrace")(noStackTrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.get.asInstanceOf[js.Any])
    if (notifyMode != null) __obj.updateDynamic("notifyMode")(notifyMode.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyChanged)) __obj.updateDynamic("onlyChanged")(onlyChanged.get.asInstanceOf[js.Any])
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile.asInstanceOf[js.Any])
    if (!js.isUndefined(passWithNoTests)) __obj.updateDynamic("passWithNoTests")(passWithNoTests.get.asInstanceOf[js.Any])
    if (preprocessorIgnorePatterns != null) __obj.updateDynamic("preprocessorIgnorePatterns")(preprocessorIgnorePatterns.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (prettierPath != null) __obj.updateDynamic("prettierPath")(prettierPath.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (replname != null) __obj.updateDynamic("replname")(replname.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (!js.isUndefined(resetMocks)) __obj.updateDynamic("resetMocks")(resetMocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetModules)) __obj.updateDynamic("resetModules")(resetModules.get.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreMocks)) __obj.updateDynamic("restoreMocks")(restoreMocks.get.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    if (!js.isUndefined(runTestsByPath)) __obj.updateDynamic("runTestsByPath")(runTestsByPath.get.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
    if (scriptPreprocessor != null) __obj.updateDynamic("scriptPreprocessor")(scriptPreprocessor.asInstanceOf[js.Any])
    if (setupFiles != null) __obj.updateDynamic("setupFiles")(setupFiles.asInstanceOf[js.Any])
    if (setupFilesAfterEnv != null) __obj.updateDynamic("setupFilesAfterEnv")(setupFilesAfterEnv.asInstanceOf[js.Any])
    if (setupTestFrameworkScriptFile != null) __obj.updateDynamic("setupTestFrameworkScriptFile")(setupTestFrameworkScriptFile.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFilter)) __obj.updateDynamic("skipFilter")(skipFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipNodeResolution)) __obj.updateDynamic("skipNodeResolution")(skipNodeResolution.get.asInstanceOf[js.Any])
    if (snapshotResolver != null) __obj.updateDynamic("snapshotResolver")(snapshotResolver.asInstanceOf[js.Any])
    if (snapshotSerializers != null) __obj.updateDynamic("snapshotSerializers")(snapshotSerializers.asInstanceOf[js.Any])
    if (testEnvironment != null) __obj.updateDynamic("testEnvironment")(testEnvironment.asInstanceOf[js.Any])
    if (testEnvironmentOptions != null) __obj.updateDynamic("testEnvironmentOptions")(testEnvironmentOptions.asInstanceOf[js.Any])
    if (testFailureExitCode != null) __obj.updateDynamic("testFailureExitCode")(testFailureExitCode.asInstanceOf[js.Any])
    if (!js.isUndefined(testLocationInResults)) __obj.updateDynamic("testLocationInResults")(testLocationInResults.get.asInstanceOf[js.Any])
    if (testMatch != null) __obj.updateDynamic("testMatch")(testMatch.asInstanceOf[js.Any])
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern.asInstanceOf[js.Any])
    if (testPathDirs != null) __obj.updateDynamic("testPathDirs")(testPathDirs.asInstanceOf[js.Any])
    if (testPathIgnorePatterns != null) __obj.updateDynamic("testPathIgnorePatterns")(testPathIgnorePatterns.asInstanceOf[js.Any])
    if (testRegex != null) __obj.updateDynamic("testRegex")(testRegex.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (testRunner != null) __obj.updateDynamic("testRunner")(testRunner.asInstanceOf[js.Any])
    if (testSequencer != null) __obj.updateDynamic("testSequencer")(testSequencer.asInstanceOf[js.Any])
    if (!js.isUndefined(testTimeout)) __obj.updateDynamic("testTimeout")(testTimeout.get.asInstanceOf[js.Any])
    if (testURL != null) __obj.updateDynamic("testURL")(testURL.asInstanceOf[js.Any])
    if (timers != null) __obj.updateDynamic("timers")(timers.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformIgnorePatterns != null) __obj.updateDynamic("transformIgnorePatterns")(transformIgnorePatterns.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSnapshot)) __obj.updateDynamic("updateSnapshot")(updateSnapshot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useStderr)) __obj.updateDynamic("useStderr")(useStderr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watchAll)) __obj.updateDynamic("watchAll")(watchAll.get.asInstanceOf[js.Any])
    if (watchPathIgnorePatterns != null) __obj.updateDynamic("watchPathIgnorePatterns")(watchPathIgnorePatterns.asInstanceOf[js.Any])
    if (watchPlugins != null) __obj.updateDynamic("watchPlugins")(watchPlugins.asInstanceOf[js.Any])
    if (!js.isUndefined(watchman)) __obj.updateDynamic("watchman")(watchman.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInitialOptions]
  }
}

