package typings.atJestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildGlobalMod {
  import typings.std.Error
  import typings.std.TemplateStringsArray

  type ArrayTable = Table | Row
  type BlockFn = js.Function0[Unit]
  type BlockName = String
  type Col = js.Any
  type DoneFn = js.Function1[/* reason */ js.UndefOr[String | Error], Unit]
  type Each = js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ]
  type EachTable = ArrayTable | TemplateTable
  type EachTestFn = js.Function1[/* repeated */ js.Any, js.UndefOr[js.Promise[js.Any] | Unit]]
  type ItConcurrentBase = js.Function3[
    /* testName */ String, 
    /* testFn */ js.Function0[js.Promise[js.Any]], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ]
  type Row = js.Array[Col]
  type Table = js.Array[Row]
  type TemplateData = js.Array[js.Any]
  type TemplateTable = TemplateStringsArray
  type TestFn = js.Function1[/* done */ js.UndefOr[DoneFn], js.UndefOr[js.Promise[js.Any] | Unit]]
  type TestName = String
}
