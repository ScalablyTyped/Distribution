package typings.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object globalMod {
  
  type ArrayTable = typings.jestTypes.globalMod.Table | typings.jestTypes.globalMod.Row
  
  type BlockFn = js.Function0[scala.Unit]
  
  type BlockName = java.lang.String
  
  type Col = js.Any
  
  type ConcurrentTestFn = js.Function1[
    /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn], 
    js.Promise[js.UndefOr[scala.Unit | js.Any]]
  ]
  
  type DoneFn = js.Function1[/* reason */ js.UndefOr[java.lang.String | typings.std.Error], scala.Unit]
  
  type Each[EachCallback /* <: typings.jestTypes.globalMod.TestCallback */] = (js.Function2[
    /* table */ typings.jestTypes.globalMod.EachTable, 
    /* repeated */ js.Any, 
    js.Function3[
      /* title */ java.lang.String, 
      /* test */ typings.jestTypes.globalMod.EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ]) | js.Function0[js.Function0[scala.Unit]]
  
  type EachTable = typings.jestTypes.globalMod.ArrayTable | typings.jestTypes.globalMod.TemplateTable
  
  type EachTestFn[EachCallback /* <: typings.jestTypes.globalMod.TestCallback */] = js.Function1[/* repeated */ js.Any, typings.std.ReturnType[EachCallback]]
  
  type HookBase = js.Function2[
    /* fn */ typings.jestTypes.globalMod.HookFn, 
    /* timeout */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  type HookFn = typings.jestTypes.globalMod.TestFn
  
  type Row = js.Array[typings.jestTypes.globalMod.Col]
  
  type Table = js.Array[typings.jestTypes.globalMod.Row]
  
  type TemplateData = js.Array[js.Any]
  
  type TemplateTable = typings.std.TemplateStringsArray
  
  type TestCallback = typings.jestTypes.globalMod.BlockFn | typings.jestTypes.globalMod.TestFn | typings.jestTypes.globalMod.ConcurrentTestFn
  
  type TestFn = js.Function1[
    /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn], 
    js.UndefOr[(js.Promise[js.UndefOr[scala.Unit | js.Any]]) | scala.Unit]
  ]
  
  type TestName = java.lang.String
}
