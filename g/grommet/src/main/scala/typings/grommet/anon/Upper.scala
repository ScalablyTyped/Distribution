package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upper extends js.Object {
  var color: js.UndefOr[js.Any] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var lower: js.UndefOr[ColorColorType] = js.undefined
  var opacity: js.UndefOr[OpacityType] = js.undefined
  var upper: js.UndefOr[ColorColorType] = js.undefined
}

object Upper {
  @scala.inline
  def apply(
    color: js.Any = null,
    extend: ExtendType = null,
    height: String = null,
    lower: ColorColorType = null,
    opacity: OpacityType = null,
    upper: ColorColorType = null
  ): Upper = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lower != null) __obj.updateDynamic("lower")(lower.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upper]
  }
}

