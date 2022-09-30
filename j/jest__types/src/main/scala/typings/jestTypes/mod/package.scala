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
