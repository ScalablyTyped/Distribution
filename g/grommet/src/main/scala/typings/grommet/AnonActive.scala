package typings.grommet

import typings.grommet.baseMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: js.UndefOr[AnonBackgroundColor] = js.undefined
  var animation: js.UndefOr[AnonJiggle] = js.undefined
  var borderSize: js.UndefOr[AnonLarge] = js.undefined
  var breakpoints: js.UndefOr[AnonDictx] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var control: js.UndefOr[AnonBorderDisabled] = js.undefined
  var debounceDelay: js.UndefOr[Double] = js.undefined
  var deviceBreakpoints: js.UndefOr[AnonComputer] = js.undefined
  var drop: js.UndefOr[AnonShadowSize] = js.undefined
  var edgeSize: js.UndefOr[AnonHair] = js.undefined
  var elevation: js.UndefOr[AnonDarkAnonMedium] = js.undefined
  var focus: js.UndefOr[AnonBorderAnon0] = js.undefined
  var font: js.UndefOr[AnonFace] = js.undefined
  var graph: js.UndefOr[AnonColors] = js.undefined
  var hover: js.UndefOr[AnonBackgroundBackgroundType] = js.undefined
  var input: js.UndefOr[AnonPadding] = js.undefined
  var opacity: js.UndefOr[AnonStrong] = js.undefined
  var selected: js.UndefOr[AnonBackgroundBackgroundType] = js.undefined
  var size: js.UndefOr[AnonFull] = js.undefined
  var spacing: js.UndefOr[String] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(
    active: AnonBackgroundColor = null,
    animation: AnonJiggle = null,
    borderSize: AnonLarge = null,
    breakpoints: AnonDictx = null,
    colors: Colors = null,
    control: AnonBorderDisabled = null,
    debounceDelay: Int | Double = null,
    deviceBreakpoints: AnonComputer = null,
    drop: AnonShadowSize = null,
    edgeSize: AnonHair = null,
    elevation: AnonDarkAnonMedium = null,
    focus: AnonBorderAnon0 = null,
    font: AnonFace = null,
    graph: AnonColors = null,
    hover: AnonBackgroundBackgroundType = null,
    input: AnonPadding = null,
    opacity: AnonStrong = null,
    selected: AnonBackgroundBackgroundType = null,
    size: AnonFull = null,
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

