package typings.jest.jestMod.jest

import typings.jest.jestStrings.fake
import typings.jest.jestStrings.real
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectConfig extends js.Object {
  var automock: Boolean
  var browser: Boolean
  var cache: Boolean
  var cacheDirectory: Path
  var clearMocks: Boolean
  var coveragePathIgnorePatterns: js.Array[String]
  var cwd: Path
  var detectLeaks: Boolean
  var displayName: Maybe[String]
  var forceCoverageMatch: js.Array[Glob]
  var globals: ConfigGlobals
  var haste: HasteConfig
  var moduleDirectories: js.Array[String]
  var moduleFileExtensions: js.Array[String]
  var moduleLoader: Path
  var moduleNameMapper: js.Array[js.Tuple2[String, String]]
  var modulePathIgnorePatterns: js.Array[String]
  var modulePaths: js.Array[String]
  var name: String
  var resetMocks: Boolean
  var resetModules: Boolean
  var resolver: Maybe[Path]
  var rootDir: Path
  var roots: js.Array[Path]
  var runner: String
  var setupFiles: js.Array[Path]
  var setupTestFrameworkScriptFile: Path
  var skipNodeResolution: Boolean
  var snapshotSerializers: js.Array[Path]
  var testEnvironment: String
  var testEnvironmentOptions: js.Object
  var testLocationInResults: Boolean
  var testMatch: js.Array[Glob]
  var testPathIgnorePatterns: js.Array[String]
  var testRegex: String
  var testRunner: String
  var testURL: String
  var timers: real | fake
  var transform: js.Array[js.Tuple2[String, Path]]
  var transformIgnorePatterns: js.Array[Glob]
  var unmockedModulePathPatterns: Maybe[js.Array[String]]
  var watchPathIgnorePatterns: js.Array[String]
}

object ProjectConfig {
  @scala.inline
  def apply(
    automock: Boolean,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: Path,
    clearMocks: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    cwd: Path,
    detectLeaks: Boolean,
    forceCoverageMatch: js.Array[Glob],
    globals: ConfigGlobals,
    haste: HasteConfig,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleLoader: Path,
    moduleNameMapper: js.Array[js.Tuple2[String, String]],
    modulePathIgnorePatterns: js.Array[String],
    modulePaths: js.Array[String],
    name: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    rootDir: Path,
    roots: js.Array[Path],
    runner: String,
    setupFiles: js.Array[Path],
    setupTestFrameworkScriptFile: Path,
    skipNodeResolution: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: js.Object,
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testPathIgnorePatterns: js.Array[String],
    testRegex: String,
    testRunner: String,
    testURL: String,
    timers: real | fake,
    transform: js.Array[js.Tuple2[String, Path]],
    transformIgnorePatterns: js.Array[Glob],
    watchPathIgnorePatterns: js.Array[String],
    displayName: Maybe[String] = null,
    resolver: Maybe[Path] = null,
    unmockedModulePathPatterns: Maybe[js.Array[String]] = null
  ): ProjectConfig = {
    val __obj = js.Dynamic.literal(automock = automock, browser = browser, cache = cache, cacheDirectory = cacheDirectory, clearMocks = clearMocks, coveragePathIgnorePatterns = coveragePathIgnorePatterns, cwd = cwd, detectLeaks = detectLeaks, forceCoverageMatch = forceCoverageMatch, globals = globals, haste = haste, moduleDirectories = moduleDirectories, moduleFileExtensions = moduleFileExtensions, moduleLoader = moduleLoader, moduleNameMapper = moduleNameMapper, modulePathIgnorePatterns = modulePathIgnorePatterns, modulePaths = modulePaths, name = name, resetMocks = resetMocks, resetModules = resetModules, rootDir = rootDir, roots = roots, runner = runner, setupFiles = setupFiles, setupTestFrameworkScriptFile = setupTestFrameworkScriptFile, skipNodeResolution = skipNodeResolution, snapshotSerializers = snapshotSerializers, testEnvironment = testEnvironment, testEnvironmentOptions = testEnvironmentOptions, testLocationInResults = testLocationInResults, testMatch = testMatch, testPathIgnorePatterns = testPathIgnorePatterns, testRegex = testRegex, testRunner = testRunner, testURL = testURL, timers = timers.asInstanceOf[js.Any], transform = transform, transformIgnorePatterns = transformIgnorePatterns, watchPathIgnorePatterns = watchPathIgnorePatterns)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfig]
  }
}

