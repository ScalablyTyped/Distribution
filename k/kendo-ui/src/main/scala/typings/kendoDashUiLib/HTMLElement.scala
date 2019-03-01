package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var kendoBindingTarget: kendoDashUiLib.kendoNs.dataNs.BindingTarget
}

object HTMLElement {
  @scala.inline
  def apply(kendoBindingTarget: kendoDashUiLib.kendoNs.dataNs.BindingTarget): HTMLElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kendoBindingTarget")(kendoBindingTarget)
    __obj.asInstanceOf[HTMLElement]
  }
}

