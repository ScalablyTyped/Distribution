package typings.kendoUi

import typings.kendoUi.kendo.data.BindingTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var kendoBindingTarget: BindingTarget
}

object HTMLElement {
  @scala.inline
  def apply(kendoBindingTarget: BindingTarget): HTMLElement = {
    val __obj = js.Dynamic.literal(kendoBindingTarget = kendoBindingTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
}

