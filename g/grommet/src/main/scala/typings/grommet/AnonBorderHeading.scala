package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderHeading extends js.Object {
  var border: js.UndefOr[AnonColorSide] = js.undefined
  var heading: js.UndefOr[AnonLevel] = js.undefined
  var icons: js.UndefOr[AnonCollapse] = js.undefined
}

object AnonBorderHeading {
  @scala.inline
  def apply(border: AnonColorSide = null, heading: AnonLevel = null, icons: AnonCollapse = null): AnonBorderHeading = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderHeading]
  }
}

