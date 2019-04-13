package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowDateDescriptor extends js.Object {
  var text: java.lang.String
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object ThreadRowDateDescriptor {
  @scala.inline
  def apply(text: java.lang.String, textColor: java.lang.String = null, tooltip: java.lang.String = null): ThreadRowDateDescriptor = {
    val __obj = js.Dynamic.literal(text = text)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThreadRowDateDescriptor]
  }
}

