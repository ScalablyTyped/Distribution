package typings.grommet

import typings.grommet.themesBaseMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[Anon_BackgroundColor] = js.undefined
  var animation: js.UndefOr[Anon_DurationJiggle] = js.undefined
  var borderSize: js.UndefOr[Anon_LargeMedium] = js.undefined
  var breakpoints: js.UndefOr[Anon_LargeMediumSmall] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var control: js.UndefOr[Anon_Border] = js.undefined
  var debounceDelay: js.UndefOr[Double] = js.undefined
  var deviceBreakpoints: js.UndefOr[Anon_Computer] = js.undefined
  var drop: js.UndefOr[Anon_BackgroundBorderShadowSize] = js.undefined
  var edgeSize: js.UndefOr[Anon_HairLarge] = js.undefined
  var elevation: js.UndefOr[Anon_DarkLightAnonLargeMediumNone] = js.undefined
  var focus: js.UndefOr[Anon_BorderAnonColorColorType] = js.undefined
  var font: js.UndefOr[Anon_Face] = js.undefined
  var graph: js.UndefOr[Anon_Colors] = js.undefined
  var hover: js.UndefOr[Anon_BackgroundColorBackgroundType] = js.undefined
  var input: js.UndefOr[Anon_Padding] = js.undefined
  var opacity: js.UndefOr[Anon_Medium] = js.undefined
  var selected: js.UndefOr[Anon_BackgroundColorBackgroundType] = js.undefined
  var size: js.UndefOr[Anon_FullLargeMedium] = js.undefined
  var spacing: js.UndefOr[String] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(
    active: Anon_BackgroundColor = null,
    animation: Anon_DurationJiggle = null,
    borderSize: Anon_LargeMedium = null,
    breakpoints: Anon_LargeMediumSmall = null,
    colors: Colors = null,
    control: Anon_Border = null,
    debounceDelay: Int | Double = null,
    deviceBreakpoints: Anon_Computer = null,
    drop: Anon_BackgroundBorderShadowSize = null,
    edgeSize: Anon_HairLarge = null,
    elevation: Anon_DarkLightAnonLargeMediumNone = null,
    focus: Anon_BorderAnonColorColorType = null,
    font: Anon_Face = null,
    graph: Anon_Colors = null,
    hover: Anon_BackgroundColorBackgroundType = null,
    input: Anon_Padding = null,
    opacity: Anon_Medium = null,
    selected: Anon_BackgroundColorBackgroundType = null,
    size: Anon_FullLargeMedium = null,
    spacing: String = null
  ): Anon_Active = {
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
    __obj.asInstanceOf[Anon_Active]
  }
}

