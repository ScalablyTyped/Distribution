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
    val __obj = js.Dynamic.literal(automock = automock, browser = browser, cache = cache, cacheDirectory = cacheDirectory, clearMocks = clearMocks, coveragePathIgnorePatterns = coveragePathIgnorePatterns, cwd = cwd, detectLeaks = detectLeaks, detectOpenHandles = detectOpenHandles, errorOnDeprecated = errorOnDeprecated, extraGlobals = extraGlobals, forceCoverageMatch = forceCoverageMatch, globals = globals, haste = haste, moduleDirectories = moduleDirectories, moduleFileExtensions = moduleFileExtensions, moduleLoader = moduleLoader, moduleNameMapper = moduleNameMapper, modulePathIgnorePatterns = modulePathIgnorePatterns, modulePaths = modulePaths, name = name, prettierPath = prettierPath, resetMocks = resetMocks, resetModules = resetModules, restoreMocks = restoreMocks, rootDir = rootDir, roots = roots, runner = runner, setupFiles = setupFiles, setupFilesAfterEnv = setupFilesAfterEnv, skipFilter = skipFilter, skipNodeResolution = skipNodeResolution, snapshotSerializers = snapshotSerializers, testEnvironment = testEnvironment, testEnvironmentOptions = testEnvironmentOptions, testLocationInResults = testLocationInResults, testMatch = testMatch, testPathIgnorePatterns = testPathIgnorePatterns, testRegex = testRegex, testRunner = testRunner, testURL = testURL, timers = timers.asInstanceOf[js.Any], transform = transform, transformIgnorePatterns = transformIgnorePatterns, watchPathIgnorePatterns = watchPathIgnorePatterns)
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup)
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    if (snapshotResolver != null) __obj.updateDynamic("snapshotResolver")(snapshotResolver)
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns)
    __obj.asInstanceOf[ProjectConfig]
  }
}

