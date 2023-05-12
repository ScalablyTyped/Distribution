package typings.jestTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.anon.FakeTimersConfignowExclud
import typings.std.Generator
import typings.std.Partial
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Argv = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Arguments<Partial<{  all :boolean,   automock :boolean,   bail :boolean | number,   cache :boolean,   cacheDirectory :string,   changedFilesWithAncestor :boolean,   changedSince :string,   ci :boolean,   clearCache :boolean,   clearMocks :boolean,   collectCoverage :boolean,   collectCoverageFrom :string,   color :boolean,   colors :boolean,   config :string,   coverage :boolean,   coverageDirectory :string,   coveragePathIgnorePatterns :Array<string>,   coverageReporters :Array<string>,   coverageThreshold :string,   debug :boolean,   env :string,   expand :boolean,   findRelatedTests :boolean,   forceExit :boolean,   globals :string,   globalSetup :string | null | undefined,   globalTeardown :string | null | undefined,   haste :string,   ignoreProjects :Array<string>,   init :boolean,   injectGlobals :boolean,   json :boolean,   lastCommit :boolean,   logHeapUsage :boolean,   maxWorkers :number | string,   moduleDirectories :Array<string>,   moduleFileExtensions :Array<string>,   moduleNameMapper :string,   modulePathIgnorePatterns :Array<string>,   modulePaths :Array<string>,   noStackTrace :boolean,   notify :boolean,   notifyMode :string,   onlyChanged :boolean,   onlyFailures :boolean,   outputFile :string,   preset :string | null | undefined,   prettierPath :string | null | undefined,   projects :Array<string>,   randomize :boolean,   reporters :Array<string>,   resetMocks :boolean,   resetModules :boolean,   resolver :string | null | undefined,   restoreMocks :boolean,   rootDir :string,   roots :Array<string>,   runInBand :boolean,   seed :number,   showSeed :boolean,   selectProjects :Array<string>,   setupFiles :Array<string>,   setupFilesAfterEnv :Array<string>,   shard :string,   showConfig :boolean,   silent :boolean,   snapshotSerializers :Array<string>,   testEnvironment :string,   testEnvironmentOptions :string,   testFailureExitCode :string | null | undefined,   testMatch :Array<string>,   testNamePattern :string,   testPathIgnorePatterns :Array<string>,   testPathPattern :Array<string>,   testRegex :string | Array<string>,   testResultsProcessor :string,   testRunner :string,   testSequencer :string,   testTimeout :number | null | undefined,   transform :string,   transformIgnorePatterns :Array<string>,   unmockedModulePathPatterns :Array<string> | null | undefined,   updateSnapshot :boolean,   useStderr :boolean,   verbose :boolean,   version :boolean,   watch :boolean,   watchAll :boolean,   watchman :boolean,   watchPathIgnorePatterns :Array<string>,   workerIdleMemoryLimit :number | string,   workerThreads :boolean}>> */ Any

type ArrayTable = Table | Row

type AsyncFn = TestFn2 | HookFn2

type BlockFn = js.Function0[Unit]

type BlockFn2 = BlockFn

/* Rewritten from type alias, can be one of: 
  - scala.Unit
  - typings.jestTypes.jestTypesStrings.skip
  - typings.jestTypes.jestTypesStrings.only
  - typings.jestTypes.jestTypesStrings.todo
*/
type BlockMode = _BlockMode | Unit

type BlockName = String

type BlockName2 = BlockName

type BlockNameLike = BlockName | NameLike

type BlockNameLike2 = BlockNameLike

type Col = Any

type ConcurrentTestFn = js.Function0[js.Promise[Any]]

type ConcurrentTestFn2 = ConcurrentTestFn

type ConfigGlobals = StringDictionary[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends @jest/types.@jest/types.CoverageReporterName ? istanbul-reports.istanbul-reports.ReportOptions[K] extends never ? never : [K, std.Partial<istanbul-reports.istanbul-reports.ReportOptions[K]>] : never
  }}}
  */
type CoverageReporterWithOptions[K] = js.Tuple2[
K, 
Partial[
  /* import warning: importer.ImportType#apply Failed type conversion: istanbul-reports.istanbul-reports.ReportOptions[K] */ js.Any
]]

type CoverageReporters = js.Array[CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName]]

type DoneFn = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.DoneFn */ Any

type DoneFn2 = js.Function1[/* reason */ js.UndefOr[String | js.Error], Unit]

type DoneTakingTestFn = js.ThisFunction1[/* this */ TestContext, /* done */ DoneFn2, ValidTestReturnValues]

type EachTable = ArrayTable | TemplateTable

type Exception = Any

type FakeTimers = FakeTimersConfignowExclud | (LegacyFakeTimersConfig & GlobalFakeTimersConfig)

type FormattedError = String

type GeneratorReturningTestFn = js.ThisFunction0[/* this */ TestContext, TestReturnValueGenerator]

type HookBase = js.Function2[/* fn */ HookFn, /* timeout */ js.UndefOr[Double], Unit]

type HookFn = TestFn

type HookFn2 = HookFn

type NameLike = Double | js.Function

type Process = typings.node.processMod.global.NodeJS.Process

type PromiseReturningTestFn = js.ThisFunction0[/* this */ TestContext, TestReturnValue]

type ReporterConfig = js.Tuple2[String, Record[String, Any]]

type Row = js.Array[Col]

type Table = js.Array[Row]

type TemplateData = js.Array[Any]

type TemplateTable = TemplateStringsArray

type TestCallback = BlockFn | TestFn | ConcurrentTestFn

type TestContext = Record[String, Any]

type TestContext2 = TestContext

type TestError = Exception | (js.Tuple2[js.UndefOr[Exception], Exception])

type TestFn = PromiseReturningTestFn | GeneratorReturningTestFn | DoneTakingTestFn

type TestFn2 = TestFn

type TestMode = BlockMode

type TestName = String

type TestName2 = TestName

type TestNameLike = TestName | NameLike

type TestNameLike2 = TestNameLike

type TestResults = js.Array[TestResult2]

type TestReturnValue = ValidTestReturnValues | js.Promise[Any]

type TestReturnValueGenerator = Generator[Unit, Any, Unit]

type TestReturnValuePromise = js.Promise[Any]

type TransformerConfig = js.Tuple2[String, Record[String, Any]]

type ValidTestReturnValues = js.UndefOr[Unit]
