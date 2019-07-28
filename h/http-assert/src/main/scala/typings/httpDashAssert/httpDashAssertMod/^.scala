package typings.httpDashAssert.httpDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-assert", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val deepEqual: AssertEqual = js.native
  val equal: Assert = js.native
  val notDeepEqual: AssertEqual = js.native
  val notEqual: Assert = js.native
  val notStrictEqual: AssertEqual = js.native
  val ok: AssertOK = js.native
  val strictEqual: AssertEqual = js.native
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, status: Double): Unit = js.native
  def apply(value: js.Any, status: Double, msg: String): Unit = js.native
  def apply(value: js.Any, status: Double, msg: String, opts: js.Object): Unit = js.native
  def apply(value: js.Any, status: Double, opts: js.Object): Unit = js.native
}

