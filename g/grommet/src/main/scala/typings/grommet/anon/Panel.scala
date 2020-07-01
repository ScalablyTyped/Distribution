package typings.grommet.anon

import typings.grommet.utilsMod.BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel extends js.Object {
  var border: js.UndefOr[BorderType] = js.undefined
  var heading: js.UndefOr[LevelMargin] = js.undefined
  var hover: js.UndefOr[ColorHeading] = js.undefined
  var icons: js.UndefOr[Collapse] = js.undefined
  var panel: js.UndefOr[BorderBorderType] = js.undefined
}

object Panel {
  @scala.inline
  def apply(
    border: BorderType = null,
    heading: LevelMargin = null,
    hover: ColorHeading = null,
    icons: Collapse = null,
    panel: BorderBorderType = null
  ): Panel = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panel]
  }
}

