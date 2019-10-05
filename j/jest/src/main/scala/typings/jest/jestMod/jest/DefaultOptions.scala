package typings.jest.jestMod.jest

import org.scalablytyped.runtime.StringDictionary
import typings.jest.Anon_Global
import typings.jest.jestStrings.fake
import typings.jest.jestStrings.real
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var automock: Boolean
  var bail: Boolean
  var browser: Boolean
  var cache: Boolean
  var cacheDirectory: Path
  var changedFilesWithAncestor: Boolean
  var clearMocks: Boolean
  var collectCoverage: Boolean
  var collectCoverageFrom: Maybe[js.Array[String]]
  var coverageDirectory: Maybe[String]
  var coveragePathIgnorePatterns: js.Array[String]
  var coverageReporters: js.Array[String]
  var coverageThreshold: Maybe[Anon_Global]
  var detectLeaks: Boolean
  var detectOpenHandles: Boolean
  var errorOnDeprecated: Boolean
  var expand: Boolean
  var filter: Maybe[Path]
  var forceCoverageMatch: js.Array[Glob]
  var globalSetup: Maybe[String]
  var globalTeardown: Maybe[String]
  var globals: ConfigGlobals
  var haste: HasteConfig
  var moduleDirectories: js.Array[String]
  var moduleFileExtensions: js.Array[String]
  var moduleNameMapper: StringDictionary[String]
  var modulePathIgnorePatterns: js.Array[String]
  var noStackTrace: Boolean
  var notifyMode: String
  @JSName("notify")
  var notify_FDefaultOptions: Boolean
  var preset: Maybe[String]
  var projects: Maybe[js.Array[String | ProjectConfig]]
  var resetMocks: Boolean
  var resetModules: Boolean
  var resolver: Maybe[Path]
  var restoreMocks: Boolean
  var rootDir: Maybe[Path]
  var roots: Maybe[js.Array[Path]]
  var runTestsByPath: Boolean
  var runner: String
  var setupFiles: js.Array[Path]
  var setupTestFrameworkScriptFile: Maybe[Path]
  var skipFilter: Boolean
  var snapshotSerializers: js.Array[Path]
  var testEnvironment: String
  var testEnvironmentOptions: js.Object
  var testFailureExitCode: String | Double
  var testLocationInResults: Boolean
  var testMatch: js.Array[Glob]
  var testPathIgnorePatterns: js.Array[String]
  var testRegex: String
  var testResultsProcessor: Maybe[String]
  var testRunner: Maybe[String]
  var testURL: String
  var timers: real | fake
  var transform: Maybe[StringDictionary[String]]
  var transformIgnorePatterns: js.Array[Glob]
  var useStderr: Boolean
  var verbose: Maybe[Boolean]
  var watch: Boolean
  var watchPathIgnorePatterns: js.Array[String]
  var watchman: Boolean
}

object DefaultOptions {
  @scala.inline
  def apply(
    automock: Boolean,
    bail: Boolean,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: Path,
    changedFilesWithAncestor: Boolean,
    clearMocks: Boolean,
    collectCoverage: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    coverageReporters: js.Array[String],
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    expand: Boolean,
    forceCoverageMatch: js.Array[Glob],
    globals: ConfigGlobals,
    haste: HasteConfig,
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
    skipFilter: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: js.Object,
    testFailureExitCode: String | Double,
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testPathIgnorePatterns: js.Array[String],
    testRegex: String,
    testURL: String,
    timers: real | fake,
    transformIgnorePatterns: js.Array[Glob],
    useStderr: Boolean,
    watch: Boolean,
    watchPathIgnorePatterns: js.Array[String],
    watchman: Boolean,
    collectCoverageFrom: Maybe[js.Array[String]] = null,
    coverageDirectory: Maybe[String] = null,
    coverageThreshold: Maybe[Anon_Global] = null,
    filter: Maybe[Path] = null,
    globalSetup: Maybe[String] = null,
    globalTeardown: Maybe[String] = null,
    preset: Maybe[String] = null,
    projects: Maybe[js.Array[String | ProjectConfig]] = null,
    resolver: Maybe[Path] = null,
    rootDir: Maybe[Path] = null,
    roots: Maybe[js.Array[Path]] = null,
    setupTestFrameworkScriptFile: Maybe[Path] = null,
    testResultsProcessor: Maybe[String] = null,
    testRunner: Maybe[String] = null,
    transform: Maybe[StringDictionary[String]] = null,
    verbose: Maybe[Boolean] = null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal(automock = automock, bail = bail, browser = browser, cache = cache, cacheDirectory = cacheDirectory, changedFilesWithAncestor = changedFilesWithAncestor, clearMocks = clearMocks, collectCoverage = collectCoverage, coveragePathIgnorePatterns = coveragePathIgnorePatterns, coverageReporters = coverageReporters, detectLeaks = detectLeaks, detectOpenHandles = detectOpenHandles, errorOnDeprecated = errorOnDeprecated, expand = expand, forceCoverageMatch = forceCoverageMatch, globals = globals, haste = haste, moduleDirectories = moduleDirectories, moduleFileExtensions = moduleFileExtensions, moduleNameMapper = moduleNameMapper, modulePathIgnorePatterns = modulePathIgnorePatterns, noStackTrace = noStackTrace, notify = notify, notifyMode = notifyMode, resetMocks = resetMocks, resetModules = resetModules, restoreMocks = restoreMocks, runTestsByPath = runTestsByPath, runner = runner, setupFiles = setupFiles, skipFilter = skipFilter, snapshotSerializers = snapshotSerializers, testEnvironment = testEnvironment, testEnvironmentOptions = testEnvironmentOptions, testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults, testMatch = testMatch, testPathIgnorePatterns = testPathIgnorePatterns, testRegex = testRegex, testURL = testURL, timers = timers.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns, useStderr = useStderr, watch = watch, watchPathIgnorePatterns = watchPathIgnorePatterns, watchman = watchman)
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom.asInstanceOf[js.Any])
    if (coverageDirectory != null) __obj.updateDynamic("coverageDirectory")(coverageDirectory.asInstanceOf[js.Any])
    if (coverageThreshold != null) __obj.updateDynamic("coverageThreshold")(coverageThreshold.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    if (setupTestFrameworkScriptFile != null) __obj.updateDynamic("setupTestFrameworkScriptFile")(setupTestFrameworkScriptFile.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (testRunner != null) __obj.updateDynamic("testRunner")(testRunner.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
}

