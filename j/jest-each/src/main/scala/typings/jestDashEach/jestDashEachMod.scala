package typings.jestDashEach

import typings.atJestTypes.buildGlobalMod.EachTable
import typings.atJestTypes.buildGlobalMod.EachTestFn
import typings.jestDashEach.buildBindMod.GlobalCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each", JSImport.Namespace)
@js.native
object jestDashEachMod extends js.Object {
  def bind(cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  def bind(cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  @js.native
  object default extends js.Object {
    def apply(table: EachTable, data: js.Any*): Anon_Describe = js.native
    def withGlobal(g: typings.atJestTypes.buildGlobalMod.Global): js.Function2[/* table */ EachTable, /* repeated */ js.Any, Anon_Describe] = js.native
  }
  
  type Global = typings.atJestTypes.buildGlobalMod.Global
}

