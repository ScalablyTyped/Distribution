package typings.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined yargs.yargs.Arguments<std.Partial<{  all  :boolean,   automock  :boolean,   bail  :boolean | number,   browser  :boolean,   cache  :boolean,   cacheDirectory  :string,   changedFilesWithAncestor  :boolean,   changedSince  :string,   ci  :boolean,   clearCache  :boolean,   clearMocks  :boolean,   collectCoverage  :boolean,   collectCoverageFrom  :string,   collectCoverageOnlyFrom  :std.Array<string>,   color  :boolean,   colors  :boolean,   config  :string,   coverage  :boolean,   coverageDirectory  :string,   coveragePathIgnorePatterns  :std.Array<string>,   coverageReporters  :std.Array<string>,   coverageThreshold  :string,   debug  :boolean,   env  :string,   expand  :boolean,   findRelatedTests  :boolean,   forceExit  :boolean,   globals  :string,   globalSetup  :string | null | undefined,   globalTeardown  :string | null | undefined,   haste  :string,   init  :boolean,   json  :boolean,   lastCommit  :boolean,   logHeapUsage  :boolean,   maxWorkers  :number | string,   moduleDirectories  :std.Array<string>,   moduleFileExtensions  :std.Array<string>,   moduleNameMapper  :string,   modulePathIgnorePatterns  :std.Array<string>,   modulePaths  :std.Array<string>,   noStackTrace  :boolean,   notify  :boolean,   notifyMode  :string,   onlyChanged  :boolean,   outputFile  :string,   preset  :string | null | undefined,   projects  :std.Array<string>,   prettierPath  :string | null | undefined,   resetMocks  :boolean,   resetModules  :boolean,   resolver  :string | null | undefined,   restoreMocks  :boolean,   rootDir  :string,   roots  :std.Array<string>,   runInBand  :boolean,   setupFiles  :std.Array<string>,   setupFilesAfterEnv  :std.Array<string>,   showConfig  :boolean,   silent  :boolean,   snapshotSerializers  :std.Array<string>,   testEnvironment  :string,   testFailureExitCode  :string | null | undefined,   testMatch  :std.Array<string>,   testNamePattern  :string,   testPathIgnorePatterns  :std.Array<string>,   testPathPattern  :std.Array<string>,   testRegex  :string | std.Array<string>,   testResultsProcessor  :string | null | undefined,   testRunner  :string,   testSequencer  :string,   testURL  :string,   testTimeout  :number | null | undefined,   timers  :string,   transform  :string,   transformIgnorePatterns  :std.Array<string>,   unmockedModulePathPatterns  :std.Array<string> | null | undefined,   updateSnapshot  :boolean,   useStderr  :boolean,   verbose  :boolean | null | undefined,   version  :boolean,   watch  :boolean,   watchAll  :boolean,   watchman  :boolean,   watchPathIgnorePatterns  :std.Array<string>}>> */
@js.native
trait Argv
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: String = js.native
  /** Non-option arguments */
  @JSName("_")
  var _underscore: js.Array[String] = js.native
  var all: js.UndefOr[Boolean] = js.native
  var automock: js.UndefOr[Boolean] = js.native
  var bail: js.UndefOr[Boolean | Double] = js.native
  var browser: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var cacheDirectory: js.UndefOr[String] = js.native
  var changedFilesWithAncestor: js.UndefOr[Boolean] = js.native
  var changedSince: js.UndefOr[String] = js.native
  var ci: js.UndefOr[Boolean] = js.native
  var clearCache: js.UndefOr[Boolean] = js.native
  var clearMocks: js.UndefOr[Boolean] = js.native
  var collectCoverage: js.UndefOr[Boolean] = js.native
  var collectCoverageFrom: js.UndefOr[String] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[js.Array[String]] = js.native
  var color: js.UndefOr[Boolean] = js.native
  var colors: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[String] = js.native
  var coverage: js.UndefOr[Boolean] = js.native
  var coverageDirectory: js.UndefOr[String] = js.native
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  var coverageReporters: js.UndefOr[js.Array[String]] = js.native
  var coverageThreshold: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[String] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var findRelatedTests: js.UndefOr[Boolean] = js.native
  var forceExit: js.UndefOr[Boolean] = js.native
  var globalSetup: js.UndefOr[String] = js.native
  var globalTeardown: js.UndefOr[String] = js.native
  var globals: js.UndefOr[String] = js.native
  var haste: js.UndefOr[String] = js.native
  var init: js.UndefOr[Boolean] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var lastCommit: js.UndefOr[Boolean] = js.native
  var logHeapUsage: js.UndefOr[Boolean] = js.native
  var maxWorkers: js.UndefOr[Double | String] = js.native
  var moduleDirectories: js.UndefOr[js.Array[String]] = js.native
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.native
  var moduleNameMapper: js.UndefOr[String] = js.native
  var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  var modulePaths: js.UndefOr[js.Array[String]] = js.native
  var noStackTrace: js.UndefOr[Boolean] = js.native
  var notifyMode: js.UndefOr[String] = js.native
  @JSName("notify")
  var notify_FArgv: js.UndefOr[Boolean] = js.native
  var onlyChanged: js.UndefOr[Boolean] = js.native
  var outputFile: js.UndefOr[String] = js.native
  var preset: js.UndefOr[String] = js.native
  var prettierPath: js.UndefOr[String] = js.native
  var projects: js.UndefOr[js.Array[String]] = js.native
  var resetMocks: js.UndefOr[Boolean] = js.native
  var resetModules: js.UndefOr[Boolean] = js.native
  var resolver: js.UndefOr[String] = js.native
  var restoreMocks: js.UndefOr[Boolean] = js.native
  var rootDir: js.UndefOr[String] = js.native
  var roots: js.UndefOr[js.Array[String]] = js.native
  var runInBand: js.UndefOr[Boolean] = js.native
  var setupFiles: js.UndefOr[js.Array[String]] = js.native
  var setupFilesAfterEnv: js.UndefOr[js.Array[String]] = js.native
  var showConfig: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var snapshotSerializers: js.UndefOr[js.Array[String]] = js.native
  var testEnvironment: js.UndefOr[String] = js.native
  var testFailureExitCode: js.UndefOr[String] = js.native
  var testMatch: js.UndefOr[js.Array[String]] = js.native
  var testNamePattern: js.UndefOr[String] = js.native
  var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  var testPathPattern: js.UndefOr[js.Array[String]] = js.native
  var testRegex: js.UndefOr[String | js.Array[String]] = js.native
  var testResultsProcessor: js.UndefOr[String] = js.native
  var testRunner: js.UndefOr[String] = js.native
  var testSequencer: js.UndefOr[String] = js.native
  var testTimeout: js.UndefOr[Double] = js.native
  var testURL: js.UndefOr[String] = js.native
  var timers: js.UndefOr[String] = js.native
  var transform: js.UndefOr[String] = js.native
  var transformIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.native
  var updateSnapshot: js.UndefOr[Boolean] = js.native
  var useStderr: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[Boolean] = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var watchAll: js.UndefOr[Boolean] = js.native
  var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  var watchman: js.UndefOr[Boolean] = js.native
}

