package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcallControl extends js.Object {
  def call_control(): Double
}

object TypeofcallControl {
  @scala.inline
  def apply(call_control: () => Double): TypeofcallControl = {
    val __obj = js.Dynamic.literal(call_control = js.Any.fromFunction0(call_control))
    __obj.asInstanceOf[TypeofcallControl]
  }
}

