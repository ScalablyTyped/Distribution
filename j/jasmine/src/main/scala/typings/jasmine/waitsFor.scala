package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("waitsFor")
@js.native
object waitsFor extends js.Object {
  def apply(latchMethod: js.Function0[Boolean]): Unit = js.native
  def apply(latchMethod: js.Function0[Boolean], failureMessage: String): Unit = js.native
  def apply(latchMethod: js.Function0[Boolean], failureMessage: String, timeout: Double): Unit = js.native
}

