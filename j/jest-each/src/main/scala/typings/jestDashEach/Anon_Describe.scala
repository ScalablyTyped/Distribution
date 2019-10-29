package typings.jestDashEach

import typings.atJestTypes.buildGlobalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Describe extends js.Object {
  var describe: Anon_Only = js.native
  var it: Anon_Only = js.native
  var test: Anon_Only = js.native
  def fdescribe(title: String, test: EachTestFn): Unit = js.native
  def fdescribe(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def fit(title: String, test: EachTestFn): Unit = js.native
  def fit(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def xdescribe(title: String, test: EachTestFn): Unit = js.native
  def xdescribe(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def xit(title: String, test: EachTestFn): Unit = js.native
  def xit(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def xtest(title: String, test: EachTestFn): Unit = js.native
  def xtest(title: String, test: EachTestFn, timeout: Double): Unit = js.native
}

