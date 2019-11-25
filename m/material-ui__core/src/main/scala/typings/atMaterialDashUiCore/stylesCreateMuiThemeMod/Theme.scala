package typings.atMaterialDashUiCore.stylesCreateMuiThemeMod

import typings.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoints
import typings.atMaterialDashUiCore.stylesCreateMixinsMod.Mixins
import typings.atMaterialDashUiCore.stylesCreatePaletteMod.Palette
import typings.atMaterialDashUiCore.stylesCreateTypographyMod.Typography
import typings.atMaterialDashUiCore.stylesOverridesMod.Overrides
import typings.atMaterialDashUiCore.stylesPropsMod.ComponentsProps
import typings.atMaterialDashUiCore.stylesShadowsMod.Shadows
import typings.atMaterialDashUiCore.stylesShapeMod.Shape
import typings.atMaterialDashUiCore.stylesSpacingMod.Spacing
import typings.atMaterialDashUiCore.stylesTransitionsMod.Transitions
import typings.atMaterialDashUiCore.stylesZIndexMod.ZIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var breakpoints: Breakpoints
  var direction: Direction
  var mixins: Mixins
  var overrides: js.UndefOr[Overrides] = js.undefined
  var palette: Palette
  var props: js.UndefOr[ComponentsProps] = js.undefined
  var shadows: Shadows
  var shape: Shape
  var spacing: Spacing
  var transitions: Transitions
  var typography: Typography
  var zIndex: ZIndex
}

object Theme {
  @scala.inline
  def apply(
    breakpoints: Breakpoints,
    direction: Direction,
    mixins: Mixins,
    palette: Palette,
    shadows: Shadows,
    shape: Shape,
    spacing: Spacing,
    transitions: Transitions,
    typography: Typography,
    zIndex: ZIndex,
    overrides: Overrides = null,
    props: ComponentsProps = null
  ): Theme = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

