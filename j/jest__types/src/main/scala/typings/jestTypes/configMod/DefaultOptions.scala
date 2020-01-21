package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.AnonGlobal
import typings.jestTypes.jestTypesStrings.fake
import typings.jestTypes.jestTypesStrings.real
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
  var coverageThreshold: js.UndefOr[AnonGlobal | Null] = js.undefined
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
    coverageThreshold: AnonGlobal = null,
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
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom.asInstanceOf[js.Any])
    if (coverageDirectory != null) __obj.updateDynamic("coverageDirectory")(coverageDirectory.asInstanceOf[js.Any])
    if (coverageThreshold != null) __obj.updateDynamic("coverageThreshold")(coverageThreshold.asInstanceOf[js.Any])
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (prettierPath != null) __obj.updateDynamic("prettierPath")(prettierPath.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (testRunner != null) __obj.updateDynamic("testRunner")(testRunner.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
}

