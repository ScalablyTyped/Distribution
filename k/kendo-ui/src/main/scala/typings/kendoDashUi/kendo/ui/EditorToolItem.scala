package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorToolItem extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object EditorToolItem {
  @scala.inline
  def apply(context: String = null, text: String = null, value: String = null): EditorToolItem = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditorToolItem]
  }
}

