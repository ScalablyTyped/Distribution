package typings.atJestTypes.buildConfigMod

import typings.atJestTypes.atJestTypesStrings.fake
import typings.atJestTypes.atJestTypesStrings.real
import typings.std.Record
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
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  var detectLeaks: Boolean
  var detectOpenHandles: Boolean
  var displayName: js.UndefOr[DisplayName] = js.undefined
  var errorOnDeprecated: Boolean
  var extraGlobals: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
  ]
  var filter: js.UndefOr[Path | Null] = js.undefined
  var forceCoverageMatch: js.Array[Glob]
  var globalSetup: js.UndefOr[String | Null] = js.undefined
  var globalTeardown: js.UndefOr[String | Null] = js.undefined
  var globals: ConfigGlobals
  var haste: HasteConfig
  var moduleDirectories: js.Array[String]
  var moduleFileExtensions: js.Array[String]
  var moduleLoader: Path
  var moduleNameMapper: js.Array[js.Tuple2[String, String]]
  var modulePathIgnorePatterns: js.Array[String]
  var modulePaths: js.Array[String]
  var name: String
  var prettierPath: String
  var resetMocks: Boolean
  var resetModules: Boolean
  var resolver: js.UndefOr[Path | Null] = js.undefined
  var restoreMocks: Boolean
  var rootDir: Path
  var roots: js.Array[Path]
  var runner: String
  var setupFiles: js.Array[Path]
  var setupFilesAfterEnv: js.Array[Path]
  var skipFilter: Boolean
  var skipNodeResolution: Boolean
  var snapshotResolver: js.UndefOr[Path | Null] = js.undefined
  var snapshotSerializers: js.Array[Path]
  var testEnvironment: String
  var testEnvironmentOptions: Record[String, _]
  var testLocationInResults: Boolean
  var testMatch: js.Array[Glob]
  var testPathIgnorePatterns: js.Array[String]
  var testRegex: js.Array[String]
  var testRunner: String
  var testURL: String
  var timers: real | fake
  var transform: js.Array[js.Tuple3[String, Path, Record[String, _]]]
  var transformIgnorePatterns: js.Array[Glob]
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String] | Null] = js.undefined
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
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    extraGlobals: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
    ],
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
    prettierPath: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    rootDir: Path,
    roots: js.Array[Path],
    runner: String,
    setupFiles: js.Array[Path],
    setupFilesAfterEnv: js.Array[Path],
    skipFilter: Boolean,
    skipNodeResolution: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, _],
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String],
    testRunner: String,
    testURL: String,
    timers: real | fake,
    transform: js.Array[js.Tuple3[String, Path, Record[String, _]]],
    transformIgnorePatterns: js.Array[Glob],
    watchPathIgnorePatterns: js.Array[String],
    dependencyExtractor: String = null,
    displayName: DisplayName = null,
    filter: Path = null,
    globalSetup: String = null,
    globalTeardown: String = null,
    resolver: Path = null,
    snapshotResolver: Path = null,
    unmockedModulePathPatterns: js.Array[String] = null
  ): ProjectConfig = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleLoader = moduleLoader.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], skipNodeResolution = skipNodeResolution.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any])
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (snapshotResolver != null) __obj.updateDynamic("snapshotResolver")(snapshotResolver.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfig]
  }
}

