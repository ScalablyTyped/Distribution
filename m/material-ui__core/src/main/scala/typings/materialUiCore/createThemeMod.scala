package typings.materialUiCore

import typings.materialUiCore.createBreakpointsMod.Breakpoints
import typings.materialUiCore.createBreakpointsMod.BreakpointsOptions
import typings.materialUiCore.createMixinsMod.Mixins
import typings.materialUiCore.createMixinsMod.MixinsOptions
import typings.materialUiCore.createPaletteMod.Palette
import typings.materialUiCore.createPaletteMod.PaletteOptions
import typings.materialUiCore.createSpacingMod.Spacing
import typings.materialUiCore.createSpacingMod.SpacingOptions
import typings.materialUiCore.createTypographyMod.Typography
import typings.materialUiCore.createTypographyMod.TypographyOptions
import typings.materialUiCore.overridesMod.Overrides
import typings.materialUiCore.propsMod.ComponentsProps
import typings.materialUiCore.shadowsMod.Shadows
import typings.materialUiCore.shapeMod.Shape
import typings.materialUiCore.shapeMod.ShapeOptions
import typings.materialUiCore.transitionsMod.Transitions
import typings.materialUiCore.transitionsMod.TransitionsOptions
import typings.materialUiCore.zIndexMod.ZIndex
import typings.materialUiCore.zIndexMod.ZIndexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createThemeMod {
  
  @JSImport("@material-ui/core/styles/createTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def default(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def createMuiTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def createMuiTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.ltr
    - typings.materialUiCore.materialUiCoreStrings.rtl
  */
  trait Direction extends StObject
  object Direction {
    
    inline def ltr: typings.materialUiCore.materialUiCoreStrings.ltr = "ltr".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.ltr]
    
    inline def rtl: typings.materialUiCore.materialUiCoreStrings.rtl = "rtl".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rtl]
  }
  
  trait Theme extends StObject {
    
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
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: ZIndex
  }
  object Theme {
    
    inline def apply(
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
    
    extension [Self <: Theme](x: Self) {
      
      inline def setBreakpoints(value: Breakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setMixins(value: Mixins): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: Overrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setProps(value: ComponentsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setTransitions(value: Transitions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      inline def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
      
      inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeOptions extends StObject {
    
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
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[ZIndexOptions] = js.undefined
  }
  object ThemeOptions {
    
    inline def apply(): ThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeOptions]
    }
    
    extension [Self <: ThemeOptions](x: Self) {
      
      inline def setBreakpoints(value: BreakpointsOptions): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMixins(value: MixinsOptions): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setOverrides(value: Overrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPalette(value: PaletteOptions): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setProps(value: ComponentsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
      
      inline def setShape(value: ShapeOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSpacing(value: SpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingFunction1(value: /* factor */ Double => String | Double): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpacingVarargs(value: Double*): Self = StObject.set(x, "spacing", js.Array(value*))
      
      inline def setTransitions(value: TransitionsOptions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      inline def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      inline def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
      
      inline def setZIndex(value: ZIndexOptions): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
