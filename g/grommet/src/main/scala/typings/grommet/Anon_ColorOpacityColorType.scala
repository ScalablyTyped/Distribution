package typings.grommet

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOpacityColorType extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var opacity: js.UndefOr[OpacityType] = js.undefined
}

object Anon_ColorOpacityColorType {
  @scala.inline
  def apply(color: ColorType = null, opacity: OpacityType = null): Anon_ColorOpacityColorType = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorOpacityColorType]
  }
}

