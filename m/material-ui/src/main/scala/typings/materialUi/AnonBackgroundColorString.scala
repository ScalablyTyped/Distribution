package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColorString extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
}

object AnonBackgroundColorString {
  @scala.inline
  def apply(backgroundColor: String = null): AnonBackgroundColorString = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColorString]
  }
}

