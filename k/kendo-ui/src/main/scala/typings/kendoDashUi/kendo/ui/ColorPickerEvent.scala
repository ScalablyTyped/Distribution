package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ColorPicker
  def isDefaultPrevented(): Boolean
}

object ColorPickerEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ColorPicker): ColorPickerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ColorPickerEvent]
  }
}

