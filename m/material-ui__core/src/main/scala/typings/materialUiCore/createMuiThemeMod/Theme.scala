package typings.materialUiCore.createMuiThemeMod

import typings.materialUiCore.createBreakpointsMod.Breakpoints
import typings.materialUiCore.createMixinsMod.Mixins
import typings.materialUiCore.createPaletteMod.Palette
import typings.materialUiCore.createTypographyMod.Typography
import typings.materialUiCore.overridesMod.Overrides
import typings.materialUiCore.propsMod.ComponentsProps
import typings.materialUiCore.shadowsMod.Shadows
import typings.materialUiCore.shapeMod.Shape
import typings.materialUiCore.spacingMod.Spacing
import typings.materialUiCore.transitionsMod.Transitions
import typings.materialUiCore.zIndexMod.ZIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var breakpoints: Breakpoints = js.native
  var direction: Direction = js.native
  var mixins: Mixins = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var palette: Palette = js.native
  var props: js.UndefOr[ComponentsProps] = js.native
  var shadows: Shadows = js.native
  var shape: Shape = js.native
  var spacing: Spacing = js.native
  var transitions: Transitions = js.native
  var typography: Typography = js.native
  var zIndex: ZIndex = js.native
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
    zIndex: ZIndex
  ): Theme = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setBreakpoints(value: Breakpoints): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setMixins(value: Mixins): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def setPalette(value: Palette): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowsVarargs(value: js.Any*): Self = this.set("shadows", js.Array(value :_*))
    @scala.inline
    def setShadows(value: Shadows): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacing(value: Spacing): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitions(value: Transitions): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypography(value: Typography): Self = this.set("typography", value.asInstanceOf[js.Any])
    @scala.inline
    def setZIndex(value: ZIndex): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrides(value: Overrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setProps(value: ComponentsProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
  
}

