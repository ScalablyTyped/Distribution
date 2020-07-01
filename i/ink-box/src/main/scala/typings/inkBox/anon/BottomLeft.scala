package typings.inkBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomLeft extends js.Object {
  var bottomLeft: js.UndefOr[String] = js.undefined
  var bottomRight: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var topLeft: js.UndefOr[String] = js.undefined
  var topRight: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object BottomLeft {
  @scala.inline
  def apply(
    bottomLeft: String = null,
    bottomRight: String = null,
    horizontal: String = null,
    topLeft: String = null,
    topRight: String = null,
    vertical: String = null
  ): BottomLeft = {
    val __obj = js.Dynamic.literal()
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomLeft]
  }
}

