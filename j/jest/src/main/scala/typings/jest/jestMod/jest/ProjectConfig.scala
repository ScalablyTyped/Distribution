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
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleLoader = moduleLoader.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupTestFrameworkScriptFile = setupTestFrameworkScriptFile.asInstanceOf[js.Any], skipNodeResolution = skipNodeResolution.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfig]
  }
}

