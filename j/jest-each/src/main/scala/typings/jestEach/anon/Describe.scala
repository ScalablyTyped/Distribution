package typings.jestEach.anon

import typings.jestTypes.globalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Describe extends js.Object {
  var describe: Call = js.native
  var it: Call = js.native
  var test: Call = js.native
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

