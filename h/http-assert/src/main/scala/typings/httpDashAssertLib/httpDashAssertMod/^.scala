package typings
package httpDashAssertLib.httpDashAssertMod

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
  def apply(value: js.Any): scala.Unit = js.native
  def apply(value: js.Any, status: scala.Double): scala.Unit = js.native
  def apply(value: js.Any, status: scala.Double, msg: java.lang.String): scala.Unit = js.native
  def apply(value: js.Any, status: scala.Double, msg: java.lang.String, opts: js.Object): scala.Unit = js.native
  def apply(value: js.Any, status: scala.Double, opts: js.Object): scala.Unit = js.native
}

