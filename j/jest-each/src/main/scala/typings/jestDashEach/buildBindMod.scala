package typings.jestDashEach

import typings.atJestTypes.buildGlobalMod.DoneFn
import typings.atJestTypes.buildGlobalMod.EachTable
import typings.atJestTypes.buildGlobalMod.EachTestFn
import typings.jestDashEach.buildBindMod.GlobalCallback
import typings.jestDashEach.buildBindMod.TestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each/build/bind", JSImport.Namespace)
@js.native
object buildBindMod extends js.Object {
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
  type EachTests = js.Array[Anon_Arguments]
  type GlobalCallback = js.Function3[/* testName */ String, /* fn */ TestFn, /* timeout */ js.UndefOr[Double], Unit]
  type TestFn = js.Function1[/* done */ js.UndefOr[DoneFn], js.UndefOr[js.Promise[js.Any] | Unit]]
}

