package typings.jestCli

import typings.jestCli.jestCliStrings.`DocumentationColon httpsColonSlashSlashjestjsDotioSlash`
import typings.jestCli.jestCliStrings.`UsageColon $0 [--configEqualssignLessthansignpathToConfigFileGreaterthansign] [TestPathPattern]`
import typings.std.Partial
import typings.yargs.mod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli/args", JSImport.Namespace)
@js.native
object argsMod extends js.Object {
  val docs: `DocumentationColon httpsColonSlashSlashjestjsDotioSlash` = js.native
  val usage: `UsageColon $0 [--configEqualssignLessthansignpathToConfigFileGreaterthansign] [TestPathPattern]` = js.native
  def check(argv: Arguments[Partial[AnonAll]]): Boolean = js.native
  @js.native
  object options extends js.Object {
    var all: AnonBoolean = js.native
    var automock: AnonBoolean = js.native
    var bail: AnonAlias = js.native
    var browser: AnonBoolean = js.native
    var cache: AnonBoolean = js.native
    var cacheDirectory: AnonDescription = js.native
    var changedFilesWithAncestor: AnonBoolean = js.native
    var changedSince: AnonDescriptionNargs = js.native
    var ci: AnonBooleanDefault = js.native
    var clearCache: AnonBoolean = js.native
    var clearMocks: AnonBoolean = js.native
    var collectCoverage: AnonBoolean = js.native
    var collectCoverageFrom: AnonDescription = js.native
    var collectCoverageOnlyFrom: AnonArray = js.native
    var color: AnonBoolean = js.native
    var colors: AnonBoolean = js.native
    var config: AnonAliasDescription = js.native
    var coverage: AnonBoolean = js.native
    var coverageDirectory: AnonDescription = js.native
    var coveragePathIgnorePatterns: AnonArray = js.native
    var coverageReporters: AnonArray = js.native
    var coverageThreshold: AnonDescription = js.native
    var debug: AnonBoolean = js.native
    var detectLeaks: AnonBooleanDefault = js.native
    var detectOpenHandles: AnonBooleanDefault = js.native
    var env: AnonDescription = js.native
    var errorOnDeprecated: AnonBooleanDefault = js.native
    var expand: AnonAlias = js.native
    var filter: AnonDefault = js.native
    var findRelatedTests: AnonBoolean = js.native
    var forceExit: AnonBoolean = js.native
    var globalSetup: AnonDescription = js.native
    var globalTeardown: AnonDescription = js.native
    var globals: AnonDescription = js.native
    var haste: AnonDescription = js.native
    var init: AnonBooleanDescription = js.native
    var json: AnonBoolean = js.native
    var lastCommit: AnonBoolean = js.native
    var listTests: AnonBooleanDefault = js.native
    var logHeapUsage: AnonBoolean = js.native
    var mapCoverage: AnonBoolean = js.native
    var maxConcurrency: AnonDefaultDescription = js.native
    var maxWorkers: AnonAliasDescription = js.native
    var moduleDirectories: AnonArray = js.native
    var moduleFileExtensions: AnonArray = js.native
    var moduleNameMapper: AnonDescription = js.native
    var modulePathIgnorePatterns: AnonArray = js.native
    var modulePaths: AnonArray = js.native
    var noStackTrace: AnonBoolean = js.native
    var notifyMode: AnonDefaultDescriptionString = js.native
    @JSName("notify")
    var notify_Foptions: AnonBoolean = js.native
    var onlyChanged: AnonAlias = js.native
    var onlyFailures: AnonAlias = js.native
    var outputFile: AnonDescription = js.native
    var passWithNoTests: AnonBooleanDefault = js.native
    var preset: AnonDescription = js.native
    var prettierPath: AnonDefault = js.native
    var projects: AnonArray = js.native
    var reporters: AnonArray = js.native
    var resetMocks: AnonBoolean = js.native
    var resetModules: AnonBoolean = js.native
    var resolver: AnonDescription = js.native
    var restoreMocks: AnonBoolean = js.native
    var rootDir: AnonDescription = js.native
    var roots: AnonArray = js.native
    var runInBand: AnonAlias = js.native
    var runTestsByPath: AnonBooleanDefault = js.native
    var runner: AnonDescription = js.native
    var setupFiles: AnonArray = js.native
    var setupFilesAfterEnv: AnonArray = js.native
    var showConfig: AnonBoolean = js.native
    var silent: AnonBoolean = js.native
    var skipFilter: AnonBoolean = js.native
    var snapshotSerializers: AnonArray = js.native
    var testEnvironment: AnonDescription = js.native
    var testEnvironmentOptions: AnonDescription = js.native
    var testFailureExitCode: AnonDescription = js.native
    var testLocationInResults: AnonBooleanDefault = js.native
    var testMatch: AnonArray = js.native
    var testNamePattern: AnonAliasDescription = js.native
    var testPathIgnorePatterns: AnonArray = js.native
    var testPathPattern: AnonArray = js.native
    var testRegex: AnonArray = js.native
    var testResultsProcessor: AnonDescription = js.native
    var testRunner: AnonDescription = js.native
    var testSequencer: AnonDescription = js.native
    var testTimeout: AnonDescriptionNumber = js.native
    var testURL: AnonDescription = js.native
    var timers: AnonDescription = js.native
    var transform: AnonDescription = js.native
    var transformIgnorePatterns: AnonArray = js.native
    var unmockedModulePathPatterns: AnonArray = js.native
    var updateSnapshot: AnonAlias = js.native
    var useStderr: AnonBoolean = js.native
    var verbose: AnonBoolean = js.native
    var version: AnonAlias = js.native
    var watch: AnonBoolean = js.native
    var watchAll: AnonBoolean = js.native
    var watchPathIgnorePatterns: AnonArray = js.native
    var watchman: AnonBoolean = js.native
  }
  
}

