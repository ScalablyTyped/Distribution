package typings.atJestTypes.buildConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJestTypes.Anon_Global
import typings.atJestTypes.atJestTypesStrings.fake
import typings.atJestTypes.atJestTypesStrings.real
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var automock: Boolean
  var bail: Double
  var browser: Boolean
  var cache: Boolean
  var cacheDirectory: Path
  var changedFilesWithAncestor: Boolean
  var clearMocks: Boolean
  var collectCoverage: Boolean
  var collectCoverageFrom: js.UndefOr[js.Array[String] | Null] = js.undefined
  var coverageDirectory: js.UndefOr[String | Null] = js.undefined
  var coveragePathIgnorePatterns: js.Array[String]
  var coverageReporters: js.Array[String]
  var coverageThreshold: js.UndefOr[Anon_Global | Null] = js.undefined
  var dependencyExtractor: js.UndefOr[String | Null] = js.undefined
  var errorOnDeprecated: Boolean
  var expand: Boolean
  var filter: js.UndefOr[Path | Null] = js.undefined
  var forceCoverageMatch: js.Array[Glob]
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  var globals: ConfigGlobals
  var haste: HasteConfig
  var maxConcurrency: Double
  var maxWorkers: Double | String
  var moduleDirectories: js.Array[String]
  var moduleFileExtensions: js.Array[String]
  var moduleNameMapper: StringDictionary[String]
  var modulePathIgnorePatterns: js.Array[String]
  var noStackTrace: Boolean
  var notifyMode: String
  @JSName("notify")
  var notify_FDefaultOptions: Boolean
  var preset: js.UndefOr[String | Null] = js.undefined
  var prettierPath: js.UndefOr[String | Null] = js.undefined
  var projects: js.UndefOr[(js.Array[String | ProjectConfig]) | Null] = js.undefined
  var resetMocks: Boolean
  var resetModules: Boolean
  var resolver: js.UndefOr[Path | Null] = js.undefined
  var restoreMocks: Boolean
  var rootDir: js.UndefOr[Path | Null] = js.undefined
  var roots: js.UndefOr[js.Array[Path] | Null] = js.undefined
  var runTestsByPath: Boolean
  var runner: String
  var setupFiles: js.Array[Path]
  var setupFilesAfterEnv: js.Array[Path]
  var skipFilter: Boolean
  var snapshotSerializers: js.Array[Path]
  var testEnvironment: String
  var testEnvironmentOptions: Record[String, _]
  var testFailureExitCode: String | Double
  var testLocationInResults: Boolean
  var testMatch: js.Array[Glob]
  var testPathIgnorePatterns: js.Array[String]
  var testRegex: js.Array[String]
  var testResultsProcessor: js.UndefOr[String | Null] = js.undefined
  var testRunner: js.UndefOr[String | Null] = js.undefined
  var testSequencer: String
  var testURL: String
  var timers: real | fake
  var transform: js.UndefOr[(StringDictionary[Path | TransformerConfig]) | Null] = js.undefined
  var transformIgnorePatterns: js.Array[Glob]
  var useStderr: Boolean
  var verbose: js.UndefOr[Boolean | Null] = js.undefined
  var watch: Boolean
  var watchPathIgnorePatterns: js.Array[String]
  var watchman: Boolean
}

object DefaultOptions {
  @scala.inline
  def apply(
    automock: Boolean,
    bail: Double,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: Path,
    changedFilesWithAncestor: Boolean,
    clearMocks: Boolean,
    collectCoverage: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    coverageReporters: js.Array[String],
    errorOnDeprecated: Boolean,
    expand: Boolean,
    forceCoverageMatch: js.Array[Glob],
    globals: ConfigGlobals,
    haste: HasteConfig,
    maxConcurrency: Double,
    maxWorkers: Double | String,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleNameMapper: StringDictionary[String],
    modulePathIgnorePatterns: js.Array[String],
    noStackTrace: Boolean,
    notify: Boolean,
    notifyMode: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    runTestsByPath: Boolean,
    runner: String,
    setupFiles: js.Array[Path],
    setupFilesAfterEnv: js.Array[Path],
    skipFilter: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, _],
    testFailureExitCode: String | Double,
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String],
    testSequencer: String,
    testURL: String,
    timers: real | fake,
    transformIgnorePatterns: js.Array[Glob],
    useStderr: Boolean,
    watch: Boolean,
    watchPathIgnorePatterns: js.Array[String],
    watchman: Boolean,
    collectCoverageFrom: js.Array[String] = null,
    coverageDirectory: String = null,
    coverageThreshold: Anon_Global = null,
    dependencyExtractor: String = null,
    filter: Path = null,
    globalSetup: String = null,
    globalTeardown: String = null,
    preset: String = null,
    prettierPath: String = null,
    projects: js.Array[String | ProjectConfig] = null,
    resolver: Path = null,
    rootDir: Path = null,
    roots: js.Array[Path] = null,
    testResultsProcessor: String = null,
    testRunner: String = null,
    transform: StringDictionary[Path | TransformerConfig] = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal(automock = automock, bail = bail, browser = browser, cache = cache, cacheDirectory = cacheDirectory, changedFilesWithAncestor = changedFilesWithAncestor, clearMocks = clearMocks, collectCoverage = collectCoverage, coveragePathIgnorePatterns = coveragePathIgnorePatterns, coverageReporters = coverageReporters, errorOnDeprecated = errorOnDeprecated, expand = expand, forceCoverageMatch = forceCoverageMatch, globals = globals, haste = haste, maxConcurrency = maxConcurrency, maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories, moduleFileExtensions = moduleFileExtensions, moduleNameMapper = moduleNameMapper, modulePathIgnorePatterns = modulePathIgnorePatterns, noStackTrace = noStackTrace, notify = notify, notifyMode = notifyMode, resetMocks = resetMocks, resetModules = resetModules, restoreMocks = restoreMocks, runTestsByPath = runTestsByPath, runner = runner, setupFiles = setupFiles, setupFilesAfterEnv = setupFilesAfterEnv, skipFilter = skipFilter, snapshotSerializers = snapshotSerializers, testEnvironment = testEnvironment, testEnvironmentOptions = testEnvironmentOptions, testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults, testMatch = testMatch, testPathIgnorePatterns = testPathIgnorePatterns, testRegex = testRegex, testSequencer = testSequencer, testURL = testURL, timers = timers.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns, useStderr = useStderr, watch = watch, watchPathIgnorePatterns = watchPathIgnorePatterns, watchman = watchman)
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom)
    if (coverageDirectory != null) __obj.updateDynamic("coverageDirectory")(coverageDirectory)
    if (coverageThreshold != null) __obj.updateDynamic("coverageThreshold")(coverageThreshold)
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup)
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown)
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (prettierPath != null) __obj.updateDynamic("prettierPath")(prettierPath)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    if (roots != null) __obj.updateDynamic("roots")(roots)
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor)
    if (testRunner != null) __obj.updateDynamic("testRunner")(testRunner)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[DefaultOptions]
  }
}

