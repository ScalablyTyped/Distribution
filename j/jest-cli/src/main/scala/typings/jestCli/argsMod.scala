package typings.jestCli

import typings.jestCli.anon.Alias
import typings.jestCli.anon.AliasDefault
import typings.jestCli.anon.AliasDefaultDescription
import typings.jestCli.anon.AliasDefaultDescriptionType
import typings.jestCli.anon.AliasDefaultUndefined
import typings.jestCli.anon.AliasDefaultUndefinedDescription
import typings.jestCli.anon.AliasDefaultUndefinedDescriptionString
import typings.jestCli.anon.AliasDescription
import typings.jestCli.anon.AliasDescriptionType
import typings.jestCli.anon.Choices
import typings.jestCli.anon.Default
import typings.jestCli.anon.DefaultDescription
import typings.jestCli.anon.DefaultDescriptionString
import typings.jestCli.anon.DefaultDescriptionType
import typings.jestCli.anon.DefaultUndefined
import typings.jestCli.anon.DefaultUndefinedDescription
import typings.jestCli.anon.DefaultUndefinedDescriptionString
import typings.jestCli.anon.DefaultUndefinedDescriptionType
import typings.jestCli.anon.Description
import typings.jestCli.anon.DescriptionString
import typings.jestCli.anon.DescriptionStringType
import typings.jestCli.anon.DescriptionType
import typings.jestCli.anon.Nargs
import typings.jestCli.anon.StringType
import typings.jestCli.anon.Type
import typings.jestCli.anon.`0`
import typings.jestCli.anon.`10`
import typings.jestCli.anon.`11`
import typings.jestCli.anon.`12`
import typings.jestCli.anon.`13`
import typings.jestCli.anon.`14`
import typings.jestCli.anon.`15`
import typings.jestCli.anon.`16`
import typings.jestCli.anon.`17`
import typings.jestCli.anon.`18`
import typings.jestCli.anon.`19`
import typings.jestCli.anon.`1`
import typings.jestCli.anon.`20`
import typings.jestCli.anon.`21`
import typings.jestCli.anon.`22`
import typings.jestCli.anon.`23`
import typings.jestCli.anon.`2`
import typings.jestCli.anon.`3`
import typings.jestCli.anon.`4`
import typings.jestCli.anon.`5`
import typings.jestCli.anon.`6`
import typings.jestCli.anon.`7`
import typings.jestCli.anon.`8`
import typings.jestCli.anon.`9`
import typings.jestCli.jestCliBooleans.`true`
import typings.jestTypes.configMod.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli/args", JSImport.Namespace)
@js.native
object argsMod extends js.Object {
  val docs: /* "Documentation: https://jestjs.io/" */ String = js.native
  val usage: /* "Usage: $0 [--config=<pathToConfigFile>] [TestPathPattern]" */ String = js.native
  def check(argv: Argv): `true` = js.native
  @js.native
  object options extends js.Object {
    val all: Default = js.native
    val automock: Description = js.native
    val bail: Alias = js.native
    val browser: Default = js.native
    val cache: Default = js.native
    val cacheDirectory: Type = js.native
    val changedFilesWithAncestor: Default = js.native
    val changedSince: Nargs = js.native
    val ci: DefaultDescription = js.native
    val clearCache: Default = js.native
    val clearMocks: Default = js.native
    val collectCoverage: DescriptionType = js.native
    val collectCoverageFrom: Type = js.native
    val collectCoverageOnlyFrom: typings.jestCli.anon.String = js.native
    val color: Default = js.native
    val colors: DefaultDescriptionType = js.native
    val config: AliasDescription = js.native
    val coverage: Default = js.native
    val coverageDirectory: `0` = js.native
    val coveragePathIgnorePatterns: DescriptionString = js.native
    val coverageProvider: Choices = js.native
    val coverageReporters: DescriptionString = js.native
    val coverageThreshold: Type = js.native
    val debug: DefaultUndefined = js.native
    val detectLeaks: DefaultDescriptionString = js.native
    val detectOpenHandles: DefaultDescriptionString = js.native
    val env: Type = js.native
    val errorOnDeprecated: `1` = js.native
    val expand: AliasDefault = js.native
    val filter: DefaultUndefinedDescriptionString = js.native
    val findRelatedTests: Default = js.native
    val forceExit: Default = js.native
    val globalSetup: `2` = js.native
    val globalTeardown: `3` = js.native
    val globals: Type = js.native
    val haste: `4` = js.native
    val init: `5` = js.native
    val json: Default = js.native
    val lastCommit: Default = js.native
    val listTests: DefaultDescriptionString = js.native
    val logHeapUsage: Default = js.native
    val mapCoverage: Default = js.native
    val maxConcurrency: DescriptionStringType = js.native
    val maxWorkers: AliasDescriptionType = js.native
    val moduleDirectories: DescriptionString = js.native
    val moduleFileExtensions: DescriptionString = js.native
    val moduleNameMapper: Type = js.native
    val modulePathIgnorePatterns: DescriptionString = js.native
    val modulePaths: DescriptionString = js.native
    val noStackTrace: DefaultUndefinedDescription = js.native
    val notifyMode: `6` = js.native
    @JSName("notify")
    val notify_Foptions: DefaultUndefinedDescriptionType = js.native
    val onlyChanged: AliasDefaultDescription = js.native
    val onlyFailures: AliasDefaultDescriptionType = js.native
    val outputFile: Type = js.native
    val passWithNoTests: `7` = js.native
    val preset: `8` = js.native
    val prettierPath: `9` = js.native
    val projects: DescriptionString = js.native
    val reporters: StringType = js.native
    val resetMocks: Default = js.native
    val resetModules: Default = js.native
    val resolver: `10` = js.native
    val restoreMocks: Default = js.native
    val rootDir: Type = js.native
    val roots: DescriptionString = js.native
    val runInBand: AliasDefaultUndefined = js.native
    val runTestsByPath: DefaultDescriptionString = js.native
    val runner: `11` = js.native
    val selectProjects: DescriptionString = js.native
    val setupFiles: DescriptionString = js.native
    val setupFilesAfterEnv: DescriptionString = js.native
    val showConfig: `12` = js.native
    val silent: `13` = js.native
    val skipFilter: Default = js.native
    val snapshotSerializers: DescriptionString = js.native
    val testEnvironment: `14` = js.native
    val testEnvironmentOptions: Type = js.native
    val testFailureExitCode: `15` = js.native
    val testLocationInResults: `16` = js.native
    val testMatch: `17` = js.native
    val testNamePattern: `18` = js.native
    val testPathIgnorePatterns: DescriptionString = js.native
    val testPathPattern: DescriptionString = js.native
    val testRegex: `19` = js.native
    val testResultsProcessor: Type = js.native
    val testRunner: Type = js.native
    val testSequencer: Type = js.native
    val testTimeout: `20` = js.native
    val testURL: `21` = js.native
    val timers: Type = js.native
    val transform: Type = js.native
    val transformIgnorePatterns: DescriptionString = js.native
    val unmockedModulePathPatterns: DescriptionString = js.native
    val updateSnapshot: AliasDefaultUndefinedDescriptionString = js.native
    val useStderr: `22` = js.native
    val verbose: `23` = js.native
    val version: AliasDefaultUndefinedDescription = js.native
    val watch: Default = js.native
    val watchAll: Default = js.native
    val watchPathIgnorePatterns: DescriptionString = js.native
    val watchman: Default = js.native
  }
  
}

