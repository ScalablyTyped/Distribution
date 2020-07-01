package typings.ionicCore.selectPopoverInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectPopoverOption extends js.Object {
  var checked: Boolean
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var disabled: Boolean
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: String
  var value: String
}

object SelectPopoverOption {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    text: String,
    value: String,
    cssClass: String | js.Array[String] = null,
    handler: () => Unit = null
  ): SelectPopoverOption = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    __obj.asInstanceOf[SelectPopoverOption]
  }
}

