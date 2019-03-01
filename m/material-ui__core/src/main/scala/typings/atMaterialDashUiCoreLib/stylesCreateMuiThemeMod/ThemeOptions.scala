package typings
package atMaterialDashUiCoreLib.stylesCreateMuiThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeOptions extends js.Object {
  var breakpoints: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.BreakpointsOptions] = js.undefined
  var direction: js.UndefOr[Direction] = js.undefined
  var mixins: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMixinsMod.MixinsOptions] = js.undefined
  var overrides: js.UndefOr[atMaterialDashUiCoreLib.stylesOverridesMod.Overrides] = js.undefined
  var palette: js.UndefOr[atMaterialDashUiCoreLib.stylesCreatePaletteMod.PaletteOptions] = js.undefined
  var props: js.UndefOr[atMaterialDashUiCoreLib.stylesPropsMod.ComponentsProps] = js.undefined
  var shadows: js.UndefOr[atMaterialDashUiCoreLib.stylesShadowsMod.Shadows] = js.undefined
  var shape: js.UndefOr[atMaterialDashUiCoreLib.stylesShapeMod.ShapeOptions] = js.undefined
  var spacing: js.UndefOr[atMaterialDashUiCoreLib.stylesSpacingMod.SpacingOptions] = js.undefined
  var transitions: js.UndefOr[atMaterialDashUiCoreLib.stylesTransitionsMod.TransitionsOptions] = js.undefined
  var typography: js.UndefOr[
    atMaterialDashUiCoreLib.stylesCreateTypographyMod.TypographyOptions | (js.Function1[
      /* palette */ atMaterialDashUiCoreLib.stylesCreatePaletteMod.Palette, 
      atMaterialDashUiCoreLib.stylesCreateTypographyMod.TypographyOptions
    ])
  ] = js.undefined
  var zIndex: js.UndefOr[atMaterialDashUiCoreLib.stylesZIndexMod.ZIndexOptions] = js.undefined
}

object ThemeOptions {
  @scala.inline
  def apply(
    breakpoints: atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.BreakpointsOptions = null,
    direction: Direction = null,
    mixins: atMaterialDashUiCoreLib.stylesCreateMixinsMod.MixinsOptions = null,
    overrides: atMaterialDashUiCoreLib.stylesOverridesMod.Overrides = null,
    palette: atMaterialDashUiCoreLib.stylesCreatePaletteMod.PaletteOptions = null,
    props: atMaterialDashUiCoreLib.stylesPropsMod.ComponentsProps = null,
    shadows: atMaterialDashUiCoreLib.stylesShadowsMod.Shadows = null,
    shape: atMaterialDashUiCoreLib.stylesShapeMod.ShapeOptions = null,
    spacing: atMaterialDashUiCoreLib.stylesSpacingMod.SpacingOptions = null,
    transitions: atMaterialDashUiCoreLib.stylesTransitionsMod.TransitionsOptions = null,
    typography: atMaterialDashUiCoreLib.stylesCreateTypographyMod.TypographyOptions | (js.Function1[
      /* palette */ atMaterialDashUiCoreLib.stylesCreatePaletteMod.Palette, 
      atMaterialDashUiCoreLib.stylesCreateTypographyMod.TypographyOptions
    ]) = null,
    zIndex: atMaterialDashUiCoreLib.stylesZIndexMod.ZIndexOptions = null
  ): ThemeOptions = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (props != null) __obj.updateDynamic("props")(props)
    if (shadows != null) __obj.updateDynamic("shadows")(shadows)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (transitions != null) __obj.updateDynamic("transitions")(transitions)
    if (typography != null) __obj.updateDynamic("typography")(typography.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex)
    __obj.asInstanceOf[ThemeOptions]
  }
}

