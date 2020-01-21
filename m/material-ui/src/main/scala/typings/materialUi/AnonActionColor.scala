package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionColor extends js.Object {
  var actionColor: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object AnonActionColor {
  @scala.inline
  def apply(actionColor: String = null, backgroundColor: String = null, textColor: String = null): AnonActionColor = {
    val __obj = js.Dynamic.literal()
    if (actionColor != null) __obj.updateDynamic("actionColor")(actionColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionColor]
  }
}

