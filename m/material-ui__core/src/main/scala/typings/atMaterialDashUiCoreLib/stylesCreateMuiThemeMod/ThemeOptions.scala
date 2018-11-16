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

