package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColorContainerBackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
}

object AnonBackgroundColorContainerBackgroundColor {
  @scala.inline
  def apply(backgroundColor: String = null, containerBackgroundColor: String = null): AnonBackgroundColorContainerBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColorContainerBackgroundColor]
  }
}

