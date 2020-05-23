package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: js.UndefOr[BackgroundColor] = js.undefined
  var animation: js.UndefOr[Jiggle] = js.undefined
  var borderSize: js.UndefOr[Large] = js.undefined
  var breakpoints: js.UndefOr[Dictx] = js.undefined
  var colors: js.UndefOr[typings.grommet.baseMod.Colors] = js.undefined
  var control: js.UndefOr[BorderDisabled] = js.undefined
  var debounceDelay: js.UndefOr[Double] = js.undefined
  var deviceBreakpoints: js.UndefOr[Computer] = js.undefined
  var drop: js.UndefOr[ShadowSize] = js.undefined
  var edgeSize: js.UndefOr[Hair] = js.undefined
  var elevation: js.UndefOr[DarkMedium] = js.undefined
  var focus: js.UndefOr[Border0] = js.undefined
  var font: js.UndefOr[Face] = js.undefined
  var graph: js.UndefOr[Colors] = js.undefined
  var hover: js.UndefOr[BackgroundBackgroundType] = js.undefined
  var input: js.UndefOr[Padding] = js.undefined
  var opacity: js.UndefOr[Strong] = js.undefined
  var selected: js.UndefOr[BackgroundBackgroundType] = js.undefined
  var size: js.UndefOr[Full] = js.undefined
  var spacing: js.UndefOr[String] = js.undefined
}

object Active {
  @scala.inline
  def apply(
    active: BackgroundColor = null,
    animation: Jiggle = null,
    borderSize: Large = null,
    breakpoints: Dictx = null,
    colors: typings.grommet.baseMod.Colors = null,
    control: BorderDisabled = null,
    debounceDelay: js.UndefOr[Double] = js.undefined,
    deviceBreakpoints: Computer = null,
    drop: ShadowSize = null,
    edgeSize: Hair = null,
    elevation: DarkMedium = null,
    focus: Border0 = null,
    font: Face = null,
    graph: Colors = null,
    hover: BackgroundBackgroundType = null,
    input: Padding = null,
    opacity: Strong = null,
    selected: BackgroundBackgroundType = null,
    size: Full = null,
    spacing: String = null
  ): Active = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (!js.isUndefined(debounceDelay)) __obj.updateDynamic("debounceDelay")(debounceDelay.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Active]
  }
}

