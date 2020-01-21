package typings.jestEach

import typings.jestEach.bindMod.GlobalCallback
import typings.jestTypes.globalMod.EachTable
import typings.jestTypes.globalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    def apply(table: EachTable, data: js.Any*): AnonDescribe = js.native
    def withGlobal(g: typings.jestTypes.globalMod.Global): js.Function2[/* table */ EachTable, /* repeated */ js.Any, AnonDescribe] = js.native
  }
  
  type Global = typings.jestTypes.globalMod.Global
}

