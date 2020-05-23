package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderHeading extends js.Object {
  var border: js.UndefOr[ColorSide] = js.undefined
  var heading: js.UndefOr[Level] = js.undefined
  var icons: js.UndefOr[Collapse] = js.undefined
}

object BorderHeading {
  @scala.inline
  def apply(border: ColorSide = null, heading: Level = null, icons: Collapse = null): BorderHeading = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderHeading]
  }
}

