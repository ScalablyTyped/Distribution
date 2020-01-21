package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChecked extends js.Object {
  var checked: Boolean = js.native
}

object AnonChecked {
  @scala.inline
  def apply(checked: Boolean): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecked]
  }
}

