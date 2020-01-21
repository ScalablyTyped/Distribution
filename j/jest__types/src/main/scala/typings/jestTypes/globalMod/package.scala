package typings.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalMod {
  type ArrayTable = typings.jestTypes.globalMod.Table | typings.jestTypes.globalMod.Row
  type BlockFn = js.Function0[scala.Unit]
  type BlockName = java.lang.String
  type Col = js.Any
  type DoneFn = js.Function1[/* reason */ js.UndefOr[java.lang.String | typings.std.Error], scala.Unit]
  type Each = js.Function2[
    /* table */ typings.jestTypes.globalMod.EachTable, 
    /* repeated */ js.Any, 
    js.Function3[
      /* title */ java.lang.String, 
      /* test */ typings.jestTypes.globalMod.EachTestFn, 
      /* timeout */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ]
  type EachTable = typings.jestTypes.globalMod.ArrayTable | typings.jestTypes.globalMod.TemplateTable
  type EachTestFn = js.Function1[/* repeated */ js.Any, js.UndefOr[js.Promise[js.Any] | scala.Unit]]
  type ItConcurrentBase = js.Function3[
    /* testName */ java.lang.String, 
    /* testFn */ js.Function0[js.Promise[js.Any]], 
    /* timeout */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type Row = js.Array[typings.jestTypes.globalMod.Col]
  type Table = js.Array[typings.jestTypes.globalMod.Row]
  type TemplateData = js.Array[js.Any]
  type TemplateTable = typings.std.TemplateStringsArray
  type TestFn = js.Function1[
    /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn], 
    js.UndefOr[js.Promise[js.Any] | scala.Unit]
  ]
  type TestName = java.lang.String
}
