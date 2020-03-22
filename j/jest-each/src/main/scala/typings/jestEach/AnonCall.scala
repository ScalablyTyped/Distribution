package typings.jestEach

import typings.jestTypes.globalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  def apply(title: String, test: EachTestFn): Unit = js.native
  def apply(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def only(title: String, test: EachTestFn): Unit = js.native
  def only(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def skip(title: String, test: EachTestFn): Unit = js.native
  def skip(title: String, test: EachTestFn, timeout: Double): Unit = js.native
}

