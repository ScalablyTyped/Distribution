package typings.atMaterialDashUiCore.stylesCreateMuiThemeMod

import typings.atMaterialDashUiCore.stylesCreateBreakpointsMod.BreakpointsOptions
import typings.atMaterialDashUiCore.stylesCreateMixinsMod.MixinsOptions
import typings.atMaterialDashUiCore.stylesCreatePaletteMod.Palette
import typings.atMaterialDashUiCore.stylesCreatePaletteMod.PaletteOptions
import typings.atMaterialDashUiCore.stylesCreateTypographyMod.TypographyOptions
import typings.atMaterialDashUiCore.stylesOverridesMod.Overrides
import typings.atMaterialDashUiCore.stylesPropsMod.ComponentsProps
import typings.atMaterialDashUiCore.stylesShadowsMod.Shadows
import typings.atMaterialDashUiCore.stylesShapeMod.ShapeOptions
import typings.atMaterialDashUiCore.stylesSpacingMod.SpacingOptions
import typings.atMaterialDashUiCore.stylesTransitionsMod.TransitionsOptions
import typings.atMaterialDashUiCore.stylesZIndexMod.ZIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeOptions extends js.Object {
  var breakpoints: js.UndefOr[BreakpointsOptions] = js.undefined
  var direction: js.UndefOr[Direction] = js.undefined
  var mixins: js.UndefOr[MixinsOptions] = js.undefined
  var overrides: js.UndefOr[Overrides] = js.undefined
  var palette: js.UndefOr[PaletteOptions] = js.undefined
  var props: js.UndefOr[ComponentsProps] = js.undefined
  var shadows: js.UndefOr[Shadows] = js.undefined
  var shape: js.UndefOr[ShapeOptions] = js.undefined
  var spacing: js.UndefOr[SpacingOptions] = js.undefined
  var transitions: js.UndefOr[TransitionsOptions] = js.undefined
  var typography: js.UndefOr[TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])] = js.undefined
  var zIndex: js.UndefOr[ZIndexOptions] = js.undefined
}

object ThemeOptions {
  @scala.inline
  def apply(
    breakpoints: BreakpointsOptions = null,
    direction: Direction = null,
    mixins: MixinsOptions = null,
    overrides: Overrides = null,
    palette: PaletteOptions = null,
    props: ComponentsProps = null,
    shadows: Shadows = null,
    shape: ShapeOptions = null,
    spacing: SpacingOptions = null,
    transitions: TransitionsOptions = null,
    typography: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions]) = null,
    zIndex: ZIndexOptions = null
  ): ThemeOptions = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (typography != null) __obj.updateDynamic("typography")(typography.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeOptions]
  }
}

