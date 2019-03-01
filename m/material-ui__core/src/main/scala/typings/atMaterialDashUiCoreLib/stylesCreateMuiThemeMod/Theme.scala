package typings
package atMaterialDashUiCoreLib.stylesCreateMuiThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var breakpoints: atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoints
  var direction: Direction
  var mixins: atMaterialDashUiCoreLib.stylesCreateMixinsMod.Mixins
  var overrides: js.UndefOr[atMaterialDashUiCoreLib.stylesOverridesMod.Overrides] = js.undefined
  var palette: atMaterialDashUiCoreLib.stylesCreatePaletteMod.Palette
  var props: js.UndefOr[atMaterialDashUiCoreLib.stylesPropsMod.ComponentsProps] = js.undefined
  var shadows: atMaterialDashUiCoreLib.stylesShadowsMod.Shadows
  var shape: atMaterialDashUiCoreLib.stylesShapeMod.Shape
  var spacing: atMaterialDashUiCoreLib.stylesSpacingMod.Spacing
  var transitions: atMaterialDashUiCoreLib.stylesTransitionsMod.Transitions
  var typography: atMaterialDashUiCoreLib.stylesCreateTypographyMod.Typography
  var zIndex: atMaterialDashUiCoreLib.stylesZIndexMod.ZIndex
}

object Theme {
  @scala.inline
  def apply(
    breakpoints: atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoints,
    direction: Direction,
    mixins: atMaterialDashUiCoreLib.stylesCreateMixinsMod.Mixins,
    palette: atMaterialDashUiCoreLib.stylesCreatePaletteMod.Palette,
    shadows: atMaterialDashUiCoreLib.stylesShadowsMod.Shadows,
    shape: atMaterialDashUiCoreLib.stylesShapeMod.Shape,
    spacing: atMaterialDashUiCoreLib.stylesSpacingMod.Spacing,
    transitions: atMaterialDashUiCoreLib.stylesTransitionsMod.Transitions,
    typography: atMaterialDashUiCoreLib.stylesCreateTypographyMod.Typography,
    zIndex: atMaterialDashUiCoreLib.stylesZIndexMod.ZIndex,
    overrides: atMaterialDashUiCoreLib.stylesOverridesMod.Overrides = null,
    props: atMaterialDashUiCoreLib.stylesPropsMod.ComponentsProps = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakpoints")(breakpoints)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("mixins")(mixins)
    __obj.updateDynamic("palette")(palette)
    __obj.updateDynamic("shadows")(shadows)
    __obj.updateDynamic("shape")(shape)
    __obj.updateDynamic("spacing")(spacing)
    __obj.updateDynamic("transitions")(transitions)
    __obj.updateDynamic("typography")(typography)
    __obj.updateDynamic("zIndex")(zIndex)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[Theme]
  }
}

