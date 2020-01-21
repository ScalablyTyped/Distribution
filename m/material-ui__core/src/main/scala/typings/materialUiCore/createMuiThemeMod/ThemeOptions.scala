package typings.materialUiCore.createMuiThemeMod

import typings.materialUiCore.createBreakpointsMod.BreakpointsOptions
import typings.materialUiCore.createMixinsMod.MixinsOptions
import typings.materialUiCore.createPaletteMod.Palette
import typings.materialUiCore.createPaletteMod.PaletteOptions
import typings.materialUiCore.createTypographyMod.TypographyOptions
import typings.materialUiCore.overridesMod.Overrides
import typings.materialUiCore.propsMod.ComponentsProps
import typings.materialUiCore.shadowsMod.Shadows
import typings.materialUiCore.shapeMod.ShapeOptions
import typings.materialUiCore.spacingMod.SpacingOptions
import typings.materialUiCore.transitionsMod.TransitionsOptions
import typings.materialUiCore.zIndexMod.ZIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeOptions extends js.Object {
  var breakpoints: js.UndefOr[BreakpointsOptions] = js.native
  var direction: js.UndefOr[Direction] = js.native
  var mixins: js.UndefOr[MixinsOptions] = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var palette: js.UndefOr[PaletteOptions] = js.native
  var props: js.UndefOr[ComponentsProps] = js.native
  var shadows: js.UndefOr[Shadows] = js.native
  var shape: js.UndefOr[ShapeOptions] = js.native
  var spacing: js.UndefOr[SpacingOptions] = js.native
  var transitions: js.UndefOr[TransitionsOptions] = js.native
  var typography: js.UndefOr[TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])] = js.native
  var zIndex: js.UndefOr[ZIndexOptions] = js.native
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

