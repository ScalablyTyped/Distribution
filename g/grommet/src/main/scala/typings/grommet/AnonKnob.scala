package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKnob extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var knob: js.UndefOr[AnonExtend] = js.undefined
  var radius: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonKnob {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    color: ColorType = null,
    extend: ExtendType = null,
    knob: AnonExtend = null,
    radius: String = null,
    size: String = null
  ): AnonKnob = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKnob]
  }
}

