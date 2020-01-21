package typings.jestEach

import typings.jestTypes.globalMod.DoneFn
import typings.jestTypes.globalMod.EachTable
import typings.jestTypes.globalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each/build/bind", JSImport.Namespace)
@js.native
object bindMod extends js.Object {
  def default(cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  def default(cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  type EachTests = js.Array[AnonArguments]
  type GlobalCallback = js.Function3[/* testName */ String, /* fn */ TestFn, /* timeout */ js.UndefOr[Double], Unit]
  type TestFn = js.Function1[/* done */ js.UndefOr[DoneFn], js.UndefOr[js.Promise[js.Any] | Unit]]
}

