package typings.inboxsdk.inboxsdkMod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowDateDescriptor extends js.Object {
  var text: String
  var textColor: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object ThreadRowDateDescriptor {
  @scala.inline
  def apply(text: String, textColor: String = null, tooltip: String = null): ThreadRowDateDescriptor = {
    val __obj = js.Dynamic.literal(text = text)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThreadRowDateDescriptor]
  }
}

