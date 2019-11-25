package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveColor extends js.Object {
  var active: js.UndefOr[Anon_ColorColorType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var hover: js.UndefOr[Anon_ColorExtendColorType] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_ActiveColor {
  @scala.inline
  def apply(
    active: Anon_ColorColorType = null,
    color: ColorType = null,
    hover: Anon_ColorExtendColorType = null,
    side: String = null,
    size: String = null
  ): Anon_ActiveColor = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveColor]
  }
}

