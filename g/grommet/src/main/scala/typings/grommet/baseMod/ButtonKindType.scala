package typings.grommet.baseMod

import typings.grommet.anon.ColorWidth
import typings.grommet.anon.HorizontalVertical
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonKindType extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[ColorWidth | Boolean] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var padding: js.UndefOr[HorizontalVertical] = js.undefined
}

object ButtonKindType {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: ColorWidth | Boolean = null,
    color: ColorType = null,
    extend: ExtendType = null,
    padding: HorizontalVertical = null
  ): ButtonKindType = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonKindType]
  }
}

