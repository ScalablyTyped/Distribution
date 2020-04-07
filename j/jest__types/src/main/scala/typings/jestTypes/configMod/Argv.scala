package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined yargs.yargs.Arguments<std.Partial<{  all  :boolean,   automock  :boolean,   bail  :boolean | number,   browser  :boolean,   cache  :boolean,   cacheDirectory  :string,   changedFilesWithAncestor  :boolean,   changedSince  :string,   ci  :boolean,   clearCache  :boolean,   clearMocks  :boolean,   collectCoverage  :boolean,   collectCoverageFrom  :string,   collectCoverageOnlyFrom  :std.Array<string>,   color  :boolean,   colors  :boolean,   config  :string,   coverage  :boolean,   coverageDirectory  :string,   coveragePathIgnorePatterns  :std.Array<string>,   coverageReporters  :std.Array<string>,   coverageThreshold  :string,   debug  :boolean,   env  :string,   expand  :boolean,   findRelatedTests  :boolean,   forceExit  :boolean,   globals  :string,   globalSetup  :string | null | undefined,   globalTeardown  :string | null | undefined,   haste  :string,   init  :boolean,   json  :boolean,   lastCommit  :boolean,   logHeapUsage  :boolean,   maxWorkers  :number | string,   moduleDirectories  :std.Array<string>,   moduleFileExtensions  :std.Array<string>,   moduleNameMapper  :string,   modulePathIgnorePatterns  :std.Array<string>,   modulePaths  :std.Array<string>,   noStackTrace  :boolean,   notify  :boolean,   notifyMode  :string,   onlyChanged  :boolean,   outputFile  :string,   preset  :string | null | undefined,   projects  :std.Array<string>,   prettierPath  :string | null | undefined,   resetMocks  :boolean,   resetModules  :boolean,   resolver  :string | null | undefined,   restoreMocks  :boolean,   rootDir  :string,   roots  :std.Array<string>,   runInBand  :boolean,   setupFiles  :std.Array<string>,   setupFilesAfterEnv  :std.Array<string>,   showConfig  :boolean,   silent  :boolean,   snapshotSerializers  :std.Array<string>,   testEnvironment  :string,   testFailureExitCode  :string | null | undefined,   testMatch  :std.Array<string>,   testNamePattern  :string,   testPathIgnorePatterns  :std.Array<string>,   testPathPattern  :std.Array<string>,   testRegex  :string | std.Array<string>,   testResultsProcessor  :string | null | undefined,   testRunner  :string,   testSequencer  :string,   testURL  :string,   testTimeout  :number | null | undefined,   timers  :string,   transform  :string,   transformIgnorePatterns  :std.Array<string>,   unmockedModulePathPatterns  :std.Array<string> | null | undefined,   updateSnapshot  :boolean,   useStderr  :boolean,   verbose  :boolean | null | undefined,   version  :boolean,   watch  :boolean,   watchAll  :boolean,   watchman  :boolean,   watchPathIgnorePatterns  :std.Array<string>}>> */
trait Argv
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: String
  /** Non-option arguments */
  @JSName("_")
  var _underscore: js.Array[String]
  var all: js.UndefOr[Boolean] = js.undefined
  var automock: js.UndefOr[Boolean] = js.undefined
  var bail: js.UndefOr[Boolean | Double] = js.undefined
  var browser: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined
  var changedSince: js.UndefOr[String] = js.undefined
  var ci: js.UndefOr[Boolean] = js.undefined
  var clearCache: js.UndefOr[Boolean] = js.undefined
  var clearMocks: js.UndefOr[Boolean] = js.undefined
  var collectCoverage: js.UndefOr[Boolean] = js.undefined
  var collectCoverageFrom: js.UndefOr[String] = js.undefined
  var collectCoverageOnlyFrom: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[Boolean] = js.undefined
  var colors: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[String] = js.undefined
  var coverage: js.UndefOr[Boolean] = js.undefined
  var coverageDirectory: js.UndefOr[String] = js.undefined
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var coverageReporters: js.UndefOr[js.Array[String]] = js.undefined
  var coverageThreshold: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var findRelatedTests: js.UndefOr[Boolean] = js.undefined
  var forceExit: js.UndefOr[Boolean] = js.undefined
  var globalSetup: js.UndefOr[String] = js.undefined
  var globalTeardown: js.UndefOr[String] = js.undefined
  var globals: js.UndefOr[String] = js.undefined
  var haste: js.UndefOr[String] = js.undefined
  var init: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var lastCommit: js.UndefOr[Boolean] = js.undefined
  var logHeapUsage: js.UndefOr[Boolean] = js.undefined
  var maxWorkers: js.UndefOr[Double | String] = js.undefined
  var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var moduleNameMapper: js.UndefOr[String] = js.undefined
  var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
  var noStackTrace: js.UndefOr[Boolean] = js.undefined
  var notifyMode: js.UndefOr[String] = js.undefined
  @JSName("notify")
  var notify_FArgv: js.UndefOr[Boolean] = js.undefined
  var onlyChanged: js.UndefOr[Boolean] = js.undefined
  var outputFile: js.UndefOr[String] = js.undefined
  var preset: js.UndefOr[String] = js.undefined
  var prettierPath: js.UndefOr[String] = js.undefined
  var projects: js.UndefOr[js.Array[String]] = js.undefined
  var resetMocks: js.UndefOr[Boolean] = js.undefined
  var resetModules: js.UndefOr[Boolean] = js.undefined
  var resolver: js.UndefOr[String] = js.undefined
  var restoreMocks: js.UndefOr[Boolean] = js.undefined
  var rootDir: js.UndefOr[String] = js.undefined
  var roots: js.UndefOr[js.Array[String]] = js.undefined
  var runInBand: js.UndefOr[Boolean] = js.undefined
  var setupFiles: js.UndefOr[js.Array[String]] = js.undefined
  var setupFilesAfterEnv: js.UndefOr[js.Array[String]] = js.undefined
  var showConfig: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var snapshotSerializers: js.UndefOr[js.Array[String]] = js.undefined
  var testEnvironment: js.UndefOr[String] = js.undefined
  var testFailureExitCode: js.UndefOr[String] = js.undefined
  var testMatch: js.UndefOr[js.Array[String]] = js.undefined
  var testNamePattern: js.UndefOr[String] = js.undefined
  var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var testPathPattern: js.UndefOr[js.Array[String]] = js.undefined
  var testRegex: js.UndefOr[String | js.Array[String]] = js.undefined
  var testResultsProcessor: js.UndefOr[String] = js.undefined
  var testRunner: js.UndefOr[String] = js.undefined
  var testSequencer: js.UndefOr[String] = js.undefined
  var testTimeout: js.UndefOr[Double] = js.undefined
  var testURL: js.UndefOr[String] = js.undefined
  var timers: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[String] = js.undefined
  var transformIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var updateSnapshot: js.UndefOr[Boolean] = js.undefined
  var useStderr: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchAll: js.UndefOr[Boolean] = js.undefined
  var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var watchman: js.UndefOr[Boolean] = js.undefined
}

object Argv {
  @scala.inline
  def apply(
    $0: String,
    _underscore: js.Array[String],
    StringDictionary: /** All remaining options */
  /* argName */ StringDictionary[js.Any] = null,
    all: js.UndefOr[Boolean] = js.undefined,
    automock: js.UndefOr[Boolean] = js.undefined,
    bail: Boolean | Double = null,
    browser: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheDirectory: String = null,
    changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined,
    changedSince: String = null,
    ci: js.UndefOr[Boolean] = js.undefined,
    clearCache: js.UndefOr[Boolean] = js.undefined,
    clearMocks: js.UndefOr[Boolean] = js.undefined,
    collectCoverage: js.UndefOr[Boolean] = js.undefined,
    collectCoverageFrom: String = null,
    collectCoverageOnlyFrom: js.Array[String] = null,
    color: js.UndefOr[Boolean] = js.undefined,
    colors: js.UndefOr[Boolean] = js.undefined,
    config: String = null,
    coverage: js.UndefOr[Boolean] = js.undefined,
    coverageDirectory: String = null,
    coveragePathIgnorePatterns: js.Array[String] = null,
    coverageReporters: js.Array[String] = null,
    coverageThreshold: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    findRelatedTests: js.UndefOr[Boolean] = js.undefined,
    forceExit: js.UndefOr[Boolean] = js.undefined,
    globalSetup: String = null,
    globalTeardown: String = null,
    globals: String = null,
    haste: String = null,
    init: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    lastCommit: js.UndefOr[Boolean] = js.undefined,
    logHeapUsage: js.UndefOr[Boolean] = js.undefined,
    maxWorkers: Double | String = null,
    moduleDirectories: js.Array[String] = null,
    moduleFileExtensions: js.Array[String] = null,
    moduleNameMapper: String = null,
    modulePathIgnorePatterns: js.Array[String] = null,
    modulePaths: js.Array[String] = null,
    noStackTrace: js.UndefOr[Boolean] = js.undefined,
    notify: js.UndefOr[Boolean] = js.undefined,
    notifyMode: String = null,
    onlyChanged: js.UndefOr[Boolean] = js.undefined,
    outputFile: String = null,
    preset: String = null,
    prettierPath: String = null,
    projects: js.Array[String] = null,
    resetMocks: js.UndefOr[Boolean] = js.undefined,
    resetModules: js.UndefOr[Boolean] = js.undefined,
    resolver: String = null,
    restoreMocks: js.UndefOr[Boolean] = js.undefined,
    rootDir: String = null,
    roots: js.Array[String] = null,
    runInBand: js.UndefOr[Boolean] = js.undefined,
    setupFiles: js.Array[String] = null,
    setupFilesAfterEnv: js.Array[String] = null,
    showConfig: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    snapshotSerializers: js.Array[String] = null,
    testEnvironment: String = null,
    testFailureExitCode: String = null,
    testMatch: js.Array[String] = null,
    testNamePattern: String = null,
    testPathIgnorePatterns: js.Array[String] = null,
    testPathPattern: js.Array[String] = null,
    testRegex: String | js.Array[String] = null,
    testResultsProcessor: String = null,
    testRunner: String = null,
    testSequencer: String = null,
    testTimeout: Int | Double = null,
    testURL: String = null,
    timers: String = null,
    transform: String = null,
    transformIgnorePatterns: js.Array[String] = null,
    unmockedModulePathPatterns: js.Array[String] = null,
    updateSnapshot: js.UndefOr[Boolean] = js.undefined,
    useStderr: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Boolean] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined,
    watchAll: js.UndefOr[Boolean] = js.undefined,
    watchPathIgnorePatterns: js.Array[String] = null,
    watchman: js.UndefOr[Boolean] = js.undefined
  ): Argv = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (!js.isUndefined(automock)) __obj.updateDynamic("automock")(automock.asInstanceOf[js.Any])
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(changedFilesWithAncestor)) __obj.updateDynamic("changedFilesWithAncestor")(changedFilesWithAncestor.asInstanceOf[js.Any])
    if (changedSince != null) __obj.updateDynamic("changedSince")(changedSince.asInstanceOf[js.Any])
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci.asInstanceOf[js.Any])
    if (!js.isUndefined(clearCache)) __obj.updateDynamic("clearCache")(clearCache.asInstanceOf[js.Any])
    if (!js.isUndefined(clearMocks)) __obj.updateDynamic("clearMocks")(clearMocks.asInstanceOf[js.Any])
    if (!js.isUndefined(collectCoverage)) __obj.updateDynamic("collectCoverage")(collectCoverage.asInstanceOf[js.Any])
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(coverage)) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (coverageDirectory != null) __obj.updateDynamic("coverageDirectory")(coverageDirectory.asInstanceOf[js.Any])
    if (coveragePathIgnorePatterns != null) __obj.updateDynamic("coveragePathIgnorePatterns")(coveragePathIgnorePatterns.asInstanceOf[js.Any])
    if (coverageReporters != null) __obj.updateDynamic("coverageReporters")(coverageReporters.asInstanceOf[js.Any])
    if (coverageThreshold != null) __obj.updateDynamic("coverageThreshold")(coverageThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(findRelatedTests)) __obj.updateDynamic("findRelatedTests")(findRelatedTests.asInstanceOf[js.Any])
    if (!js.isUndefined(forceExit)) __obj.updateDynamic("forceExit")(forceExit.asInstanceOf[js.Any])
    if (globalSetup != null) __obj.updateDynamic("globalSetup")(globalSetup.asInstanceOf[js.Any])
    if (globalTeardown != null) __obj.updateDynamic("globalTeardown")(globalTeardown.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (haste != null) __obj.updateDynamic("haste")(haste.asInstanceOf[js.Any])
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(lastCommit)) __obj.updateDynamic("lastCommit")(lastCommit.asInstanceOf[js.Any])
    if (!js.isUndefined(logHeapUsage)) __obj.updateDynamic("logHeapUsage")(logHeapUsage.asInstanceOf[js.Any])
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (moduleDirectories != null) __obj.updateDynamic("moduleDirectories")(moduleDirectories.asInstanceOf[js.Any])
    if (moduleFileExtensions != null) __obj.updateDynamic("moduleFileExtensions")(moduleFileExtensions.asInstanceOf[js.Any])
    if (moduleNameMapper != null) __obj.updateDynamic("moduleNameMapper")(moduleNameMapper.asInstanceOf[js.Any])
    if (modulePathIgnorePatterns != null) __obj.updateDynamic("modulePathIgnorePatterns")(modulePathIgnorePatterns.asInstanceOf[js.Any])
    if (modulePaths != null) __obj.updateDynamic("modulePaths")(modulePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(noStackTrace)) __obj.updateDynamic("noStackTrace")(noStackTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.asInstanceOf[js.Any])
    if (notifyMode != null) __obj.updateDynamic("notifyMode")(notifyMode.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyChanged)) __obj.updateDynamic("onlyChanged")(onlyChanged.asInstanceOf[js.Any])
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (prettierPath != null) __obj.updateDynamic("prettierPath")(prettierPath.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (!js.isUndefined(resetMocks)) __obj.updateDynamic("resetMocks")(resetMocks.asInstanceOf[js.Any])
    if (!js.isUndefined(resetModules)) __obj.updateDynamic("resetModules")(resetModules.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreMocks)) __obj.updateDynamic("restoreMocks")(restoreMocks.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    if (!js.isUndefined(runInBand)) __obj.updateDynamic("runInBand")(runInBand.asInstanceOf[js.Any])
    if (setupFiles != null) __obj.updateDynamic("setupFiles")(setupFiles.asInstanceOf[js.Any])
    if (setupFilesAfterEnv != null) __obj.updateDynamic("setupFilesAfterEnv")(setupFilesAfterEnv.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfig)) __obj.updateDynamic("showConfig")(showConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (snapshotSerializers != null) __obj.updateDynamic("snapshotSerializers")(snapshotSerializers.asInstanceOf[js.Any])
    if (testEnvironment != null) __obj.updateDynamic("testEnvironment")(testEnvironment.asInstanceOf[js.Any])
    if (testFailureExitCode != null) __obj.updateDynamic("testFailureExitCode")(testFailureExitCode.asInstanceOf[js.Any])
    if (testMatch != null) __obj.updateDynamic("testMatch")(testMatch.asInstanceOf[js.Any])
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern.asInstanceOf[js.Any])
    if (testPathIgnorePatterns != null) __obj.updateDynamic("testPathIgnorePatterns")(testPathIgnorePatterns.asInstanceOf[js.Any])
    if (testPathPattern != null) __obj.updateDynamic("testPathPattern")(testPathPattern.asInstanceOf[js.Any])
    if (testRegex != null) __obj.updateDynamic("testRegex")(testRegex.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (testRunner != null) __obj.updateDynamic("testRunner")(testRunner.asInstanceOf[js.Any])
    if (testSequencer != null) __obj.updateDynamic("testSequencer")(testSequencer.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    if (testURL != null) __obj.updateDynamic("testURL")(testURL.asInstanceOf[js.Any])
    if (timers != null) __obj.updateDynamic("timers")(timers.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformIgnorePatterns != null) __obj.updateDynamic("transformIgnorePatterns")(transformIgnorePatterns.asInstanceOf[js.Any])
    if (unmockedModulePathPatterns != null) __obj.updateDynamic("unmockedModulePathPatterns")(unmockedModulePathPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSnapshot)) __obj.updateDynamic("updateSnapshot")(updateSnapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(useStderr)) __obj.updateDynamic("useStderr")(useStderr.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (!js.isUndefined(watchAll)) __obj.updateDynamic("watchAll")(watchAll.asInstanceOf[js.Any])
    if (watchPathIgnorePatterns != null) __obj.updateDynamic("watchPathIgnorePatterns")(watchPathIgnorePatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(watchman)) __obj.updateDynamic("watchman")(watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv]
  }
}

