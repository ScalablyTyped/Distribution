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
  def apply(): ThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeOptions]
  }
  @scala.inline
  implicit class ThemeOptionsOps[Self <: ThemeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreakpoints(value: BreakpointsOptions): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setMixins(value: MixinsOptions): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    @scala.inline
    def setOverrides(value: Overrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setPalette(value: PaletteOptions): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    @scala.inline
    def setProps(value: ComponentsProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setShadowsVarargs(value: js.Any*): Self = this.set("shadows", js.Array(value :_*))
    @scala.inline
    def setShadows(value: Shadows): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setShape(value: ShapeOptions): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSpacing(value: SpacingOptions): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setTransitions(value: TransitionsOptions): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
    @scala.inline
    def setTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = this.set("typography", js.Any.fromFunction1(value))
    @scala.inline
    def setTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = this.set("typography", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypography: Self = this.set("typography", js.undefined)
    @scala.inline
    def setZIndex(value: ZIndexOptions): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

