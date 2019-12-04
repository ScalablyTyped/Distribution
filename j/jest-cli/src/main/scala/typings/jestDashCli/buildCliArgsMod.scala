package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.`Documentation: https://jestjsDOTio/`
import typings.jestDashCli.jestDashCliStrings.`Usage: DOLLAR0 [--config=<pathToConfigFile>] [TestPathPattern]`
import typings.std.Partial
import typings.yargs.yargsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli/args", JSImport.Namespace)
@js.native
object buildCliArgsMod extends js.Object {
  val docs: `Documentation: https://jestjsDOTio/` = js.native
  val usage: `Usage: DOLLAR0 [--config=<pathToConfigFile>] [TestPathPattern]` = js.native
  def check(argv: Arguments[Partial[Anon_All]]): Boolean = js.native
  @js.native
  object options extends js.Object {
    var all: Anon_Boolean = js.native
    var automock: Anon_Boolean = js.native
    var bail: Anon_Alias = js.native
    var browser: Anon_Boolean = js.native
    var cache: Anon_Boolean = js.native
    var cacheDirectory: Anon_Description = js.native
    var changedFilesWithAncestor: Anon_Boolean = js.native
    var changedSince: Anon_DescriptionNargs = js.native
    var ci: Anon_BooleanDefault = js.native
    var clearCache: Anon_Boolean = js.native
    var clearMocks: Anon_Boolean = js.native
    var collectCoverage: Anon_Boolean = js.native
    var collectCoverageFrom: Anon_Description = js.native
    var collectCoverageOnlyFrom: Anon_Array = js.native
    var color: Anon_Boolean = js.native
    var colors: Anon_Boolean = js.native
    var config: Anon_AliasDescription = js.native
    var coverage: Anon_Boolean = js.native
    var coverageDirectory: Anon_Description = js.native
    var coveragePathIgnorePatterns: Anon_Array = js.native
    var coverageReporters: Anon_Array = js.native
    var coverageThreshold: Anon_Description = js.native
    var debug: Anon_Boolean = js.native
    var detectLeaks: Anon_BooleanDefault = js.native
    var detectOpenHandles: Anon_BooleanDefault = js.native
    var env: Anon_Description = js.native
    var errorOnDeprecated: Anon_BooleanDefault = js.native
    var expand: Anon_Alias = js.native
    var filter: Anon_Default = js.native
    var findRelatedTests: Anon_Boolean = js.native
    var forceExit: Anon_Boolean = js.native
    var globalSetup: Anon_Description = js.native
    var globalTeardown: Anon_Description = js.native
    var globals: Anon_Description = js.native
    var haste: Anon_Description = js.native
    var init: Anon_BooleanDescription = js.native
    var json: Anon_Boolean = js.native
    var lastCommit: Anon_Boolean = js.native
    var listTests: Anon_BooleanDefault = js.native
    var logHeapUsage: Anon_Boolean = js.native
    var mapCoverage: Anon_Boolean = js.native
    var maxConcurrency: Anon_DefaultDescription = js.native
    var maxWorkers: Anon_AliasDescription = js.native
    var moduleDirectories: Anon_Array = js.native
    var moduleFileExtensions: Anon_Array = js.native
    var moduleNameMapper: Anon_Description = js.native
    var modulePathIgnorePatterns: Anon_Array = js.native
    var modulePaths: Anon_Array = js.native
    var noStackTrace: Anon_Boolean = js.native
    var notifyMode: Anon_DefaultDescriptionString = js.native
    @JSName("notify")
    var notify_Foptions: Anon_Boolean = js.native
    var onlyChanged: Anon_Alias = js.native
    var onlyFailures: Anon_Alias = js.native
    var outputFile: Anon_Description = js.native
    var passWithNoTests: Anon_BooleanDefault = js.native
    var preset: Anon_Description = js.native
    var prettierPath: Anon_Default = js.native
    var projects: Anon_Array = js.native
    var reporters: Anon_Array = js.native
    var resetMocks: Anon_Boolean = js.native
    var resetModules: Anon_Boolean = js.native
    var resolver: Anon_Description = js.native
    var restoreMocks: Anon_Boolean = js.native
    var rootDir: Anon_Description = js.native
    var roots: Anon_Array = js.native
    var runInBand: Anon_Alias = js.native
    var runTestsByPath: Anon_BooleanDefault = js.native
    var runner: Anon_Description = js.native
    var setupFiles: Anon_Array = js.native
    var setupFilesAfterEnv: Anon_Array = js.native
    var showConfig: Anon_Boolean = js.native
    var silent: Anon_Boolean = js.native
    var skipFilter: Anon_Boolean = js.native
    var snapshotSerializers: Anon_Array = js.native
    var testEnvironment: Anon_Description = js.native
    var testEnvironmentOptions: Anon_Description = js.native
    var testFailureExitCode: Anon_Description = js.native
    var testLocationInResults: Anon_BooleanDefault = js.native
    var testMatch: Anon_Array = js.native
    var testNamePattern: Anon_AliasDescription = js.native
    var testPathIgnorePatterns: Anon_Array = js.native
    var testPathPattern: Anon_Array = js.native
    var testRegex: Anon_Array = js.native
    var testResultsProcessor: Anon_Description = js.native
    var testRunner: Anon_Description = js.native
    var testSequencer: Anon_Description = js.native
    var testTimeout: Anon_DescriptionNumber = js.native
    var testURL: Anon_Description = js.native
    var timers: Anon_Description = js.native
    var transform: Anon_Description = js.native
    var transformIgnorePatterns: Anon_Array = js.native
    var unmockedModulePathPatterns: Anon_Array = js.native
    var updateSnapshot: Anon_Alias = js.native
    var useStderr: Anon_Boolean = js.native
    var verbose: Anon_Boolean = js.native
    var version: Anon_Alias = js.native
    var watch: Anon_Boolean = js.native
    var watchAll: Anon_Boolean = js.native
    var watchPathIgnorePatterns: Anon_Array = js.native
    var watchman: Anon_Boolean = js.native
  }
  
}

