package typings.jestTypes.configMod

import typings.jestTypes.jestTypesStrings.fake
import typings.jestTypes.jestTypesStrings.real
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectConfig extends js.Object {
  var automock: Boolean = js.native
  var browser: Boolean = js.native
  var cache: Boolean = js.native
  var cacheDirectory: Path = js.native
  var clearMocks: Boolean = js.native
  var coveragePathIgnorePatterns: js.Array[String] = js.native
  var cwd: Path = js.native
  var dependencyExtractor: js.UndefOr[String] = js.native
  var detectLeaks: Boolean = js.native
  var detectOpenHandles: Boolean = js.native
  var displayName: js.UndefOr[DisplayName] = js.native
  var errorOnDeprecated: Boolean = js.native
  var extraGlobals: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
  ] = js.native
  var filter: js.UndefOr[Path | Null] = js.native
  var forceCoverageMatch: js.Array[Glob] = js.native
  var globalSetup: js.UndefOr[String | Null] = js.native
  var globalTeardown: js.UndefOr[String | Null] = js.native
  var globals: ConfigGlobals = js.native
  var haste: HasteConfig = js.native
  var moduleDirectories: js.Array[String] = js.native
  var moduleFileExtensions: js.Array[String] = js.native
  var moduleLoader: Path = js.native
  var moduleNameMapper: js.Array[js.Tuple2[String, String]] = js.native
  var modulePathIgnorePatterns: js.Array[String] = js.native
  var modulePaths: js.Array[String] = js.native
  var name: String = js.native
  var prettierPath: String = js.native
  var resetMocks: Boolean = js.native
  var resetModules: Boolean = js.native
  var resolver: js.UndefOr[Path | Null] = js.native
  var restoreMocks: Boolean = js.native
  var rootDir: Path = js.native
  var roots: js.Array[Path] = js.native
  var runner: String = js.native
  var setupFiles: js.Array[Path] = js.native
  var setupFilesAfterEnv: js.Array[Path] = js.native
  var skipFilter: Boolean = js.native
  var skipNodeResolution: Boolean = js.native
  var snapshotResolver: js.UndefOr[Path | Null] = js.native
  var snapshotSerializers: js.Array[Path] = js.native
  var testEnvironment: String = js.native
  var testEnvironmentOptions: Record[String, _] = js.native
  var testLocationInResults: Boolean = js.native
  var testMatch: js.Array[Glob] = js.native
  var testPathIgnorePatterns: js.Array[String] = js.native
  var testRegex: js.Array[String] = js.native
  var testRunner: String = js.native
  var testURL: String = js.native
  var timers: real | fake = js.native
  var transform: js.Array[js.Tuple3[String, Path, Record[String, _]]] = js.native
  var transformIgnorePatterns: js.Array[Glob] = js.native
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String] | Null] = js.native
  var watchPathIgnorePatterns: js.Array[String] = js.native
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
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
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
    watchPathIgnorePatterns: js.Array[String]
  ): ProjectConfig = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleLoader = moduleLoader.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], skipNodeResolution = skipNodeResolution.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfig]
  }
  @scala.inline
  implicit class ProjectConfigOps[Self <: ProjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutomock(value: Boolean): Self = this.set("automock", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheDirectory(value: Path): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearMocks(value: Boolean): Self = this.set("clearMocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoveragePathIgnorePatternsVarargs(value: String*): Self = this.set("coveragePathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = this.set("coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setCwd(value: Path): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectLeaks(value: Boolean): Self = this.set("detectLeaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectOpenHandles(value: Boolean): Self = this.set("detectOpenHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorOnDeprecated(value: Boolean): Self = this.set("errorOnDeprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraGlobalsVarargs(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any)*): Self = this.set("extraGlobals", js.Array(value :_*))
    @scala.inline
    def setExtraGlobals(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
        ]
    ): Self = this.set("extraGlobals", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceCoverageMatchVarargs(value: Glob*): Self = this.set("forceCoverageMatch", js.Array(value :_*))
    @scala.inline
    def setForceCoverageMatch(value: js.Array[Glob]): Self = this.set("forceCoverageMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobals(value: ConfigGlobals): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def setHaste(value: HasteConfig): Self = this.set("haste", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleDirectoriesVarargs(value: String*): Self = this.set("moduleDirectories", js.Array(value :_*))
    @scala.inline
    def setModuleDirectories(value: js.Array[String]): Self = this.set("moduleDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleFileExtensionsVarargs(value: String*): Self = this.set("moduleFileExtensions", js.Array(value :_*))
    @scala.inline
    def setModuleFileExtensions(value: js.Array[String]): Self = this.set("moduleFileExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleLoader(value: Path): Self = this.set("moduleLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleNameMapperVarargs(value: (js.Tuple2[String, String])*): Self = this.set("moduleNameMapper", js.Array(value :_*))
    @scala.inline
    def setModuleNameMapper(value: js.Array[js.Tuple2[String, String]]): Self = this.set("moduleNameMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setModulePathIgnorePatternsVarargs(value: String*): Self = this.set("modulePathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setModulePathIgnorePatterns(value: js.Array[String]): Self = this.set("modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setModulePathsVarargs(value: String*): Self = this.set("modulePaths", js.Array(value :_*))
    @scala.inline
    def setModulePaths(value: js.Array[String]): Self = this.set("modulePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrettierPath(value: String): Self = this.set("prettierPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetMocks(value: Boolean): Self = this.set("resetMocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetModules(value: Boolean): Self = this.set("resetModules", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestoreMocks(value: Boolean): Self = this.set("restoreMocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootsVarargs(value: Path*): Self = this.set("roots", js.Array(value :_*))
    @scala.inline
    def setRoots(value: js.Array[Path]): Self = this.set("roots", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunner(value: String): Self = this.set("runner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetupFilesVarargs(value: Path*): Self = this.set("setupFiles", js.Array(value :_*))
    @scala.inline
    def setSetupFiles(value: js.Array[Path]): Self = this.set("setupFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetupFilesAfterEnvVarargs(value: Path*): Self = this.set("setupFilesAfterEnv", js.Array(value :_*))
    @scala.inline
    def setSetupFilesAfterEnv(value: js.Array[Path]): Self = this.set("setupFilesAfterEnv", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipFilter(value: Boolean): Self = this.set("skipFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipNodeResolution(value: Boolean): Self = this.set("skipNodeResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotSerializersVarargs(value: Path*): Self = this.set("snapshotSerializers", js.Array(value :_*))
    @scala.inline
    def setSnapshotSerializers(value: js.Array[Path]): Self = this.set("snapshotSerializers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestEnvironment(value: String): Self = this.set("testEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestEnvironmentOptions(value: Record[String, _]): Self = this.set("testEnvironmentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestLocationInResults(value: Boolean): Self = this.set("testLocationInResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestMatchVarargs(value: Glob*): Self = this.set("testMatch", js.Array(value :_*))
    @scala.inline
    def setTestMatch(value: js.Array[Glob]): Self = this.set("testMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPathIgnorePatternsVarargs(value: String*): Self = this.set("testPathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setTestPathIgnorePatterns(value: js.Array[String]): Self = this.set("testPathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestRegexVarargs(value: String*): Self = this.set("testRegex", js.Array(value :_*))
    @scala.inline
    def setTestRegex(value: js.Array[String]): Self = this.set("testRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestRunner(value: String): Self = this.set("testRunner", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestURL(value: String): Self = this.set("testURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimers(value: real | fake): Self = this.set("timers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformVarargs(value: (js.Tuple3[String, Path, Record[String, js.Any]])*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[js.Tuple3[String, Path, Record[String, _]]]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformIgnorePatternsVarargs(value: Glob*): Self = this.set("transformIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setTransformIgnorePatterns(value: js.Array[Glob]): Self = this.set("transformIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchPathIgnorePatternsVarargs(value: String*): Self = this.set("watchPathIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setWatchPathIgnorePatterns(value: js.Array[String]): Self = this.set("watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyExtractor(value: String): Self = this.set("dependencyExtractor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencyExtractor: Self = this.set("dependencyExtractor", js.undefined)
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setFilter(value: Path): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterNull: Self = this.set("filter", null)
    @scala.inline
    def setGlobalSetup(value: String): Self = this.set("globalSetup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSetup: Self = this.set("globalSetup", js.undefined)
    @scala.inline
    def setGlobalSetupNull: Self = this.set("globalSetup", null)
    @scala.inline
    def setGlobalTeardown(value: String): Self = this.set("globalTeardown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTeardown: Self = this.set("globalTeardown", js.undefined)
    @scala.inline
    def setGlobalTeardownNull: Self = this.set("globalTeardown", null)
    @scala.inline
    def setResolver(value: Path): Self = this.set("resolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    @scala.inline
    def setResolverNull: Self = this.set("resolver", null)
    @scala.inline
    def setSnapshotResolver(value: Path): Self = this.set("snapshotResolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotResolver: Self = this.set("snapshotResolver", js.undefined)
    @scala.inline
    def setSnapshotResolverNull: Self = this.set("snapshotResolver", null)
    @scala.inline
    def setUnmockedModulePathPatternsVarargs(value: String*): Self = this.set("unmockedModulePathPatterns", js.Array(value :_*))
    @scala.inline
    def setUnmockedModulePathPatterns(value: js.Array[String]): Self = this.set("unmockedModulePathPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmockedModulePathPatterns: Self = this.set("unmockedModulePathPatterns", js.undefined)
    @scala.inline
    def setUnmockedModulePathPatternsNull: Self = this.set("unmockedModulePathPatterns", null)
  }
  
}

