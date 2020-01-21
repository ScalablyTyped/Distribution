package typings.grommet

import typings.grommet.baseMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: js.UndefOr[AnonBackgroundColor] = js.undefined
  var animation: js.UndefOr[AnonDurationJiggle] = js.undefined
  var borderSize: js.UndefOr[AnonLargeMedium] = js.undefined
  var breakpoints: js.UndefOr[AnonLargeMediumSmall] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var control: js.UndefOr[AnonBorder] = js.undefined
  var debounceDelay: js.UndefOr[Double] = js.undefined
  var deviceBreakpoints: js.UndefOr[AnonComputer] = js.undefined
  var drop: js.UndefOr[AnonBackgroundBorderShadowSize] = js.undefined
  var edgeSize: js.UndefOr[AnonHairLarge] = js.undefined
  var elevation: js.UndefOr[AnonDarkLightAnonLargeMediumNone] = js.undefined
  var focus: js.UndefOr[AnonBorderAnonColorColorType] = js.undefined
  var font: js.UndefOr[AnonFace] = js.undefined
  var graph: js.UndefOr[AnonColors] = js.undefined
  var hover: js.UndefOr[AnonBackgroundColorBackgroundType] = js.undefined
  var input: js.UndefOr[AnonPadding] = js.undefined
  var opacity: js.UndefOr[AnonMedium] = js.undefined
  var selected: js.UndefOr[AnonBackgroundColorBackgroundType] = js.undefined
  var size: js.UndefOr[AnonFullLargeMedium] = js.undefined
  var spacing: js.UndefOr[String] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(
    active: AnonBackgroundColor = null,
    animation: AnonDurationJiggle = null,
    borderSize: AnonLargeMedium = null,
    breakpoints: AnonLargeMediumSmall = null,
    colors: Colors = null,
    control: AnonBorder = null,
    debounceDelay: Int | Double = null,
    deviceBreakpoints: AnonComputer = null,
    drop: AnonBackgroundBorderShadowSize = null,
    edgeSize: AnonHairLarge = null,
    elevation: AnonDarkLightAnonLargeMediumNone = null,
    focus: AnonBorderAnonColorColorType = null,
    font: AnonFace = null,
    graph: AnonColors = null,
    hover: AnonBackgroundColorBackgroundType = null,
    input: AnonPadding = null,
    opacity: AnonMedium = null,
    selected: AnonBackgroundColorBackgroundType = null,
    size: AnonFullLargeMedium = null,
    spacing: String = null
  ): AnonActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (debounceDelay != null) __obj.updateDynamic("debounceDelay")(debounceDelay.asInstanceOf[js.Any])
    if (deviceBreakpoints != null) __obj.updateDynamic("deviceBreakpoints")(deviceBreakpoints.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (edgeSize != null) __obj.updateDynamic("edgeSize")(edgeSize.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

