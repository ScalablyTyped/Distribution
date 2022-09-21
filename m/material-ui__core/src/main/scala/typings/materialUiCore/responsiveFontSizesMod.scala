package typings.materialUiCore

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.createThemeMod.Theme
import typings.materialUiCore.createTypographyMod.Variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveFontSizesMod {
  
  @JSImport("@material-ui/core/styles/responsiveFontSizes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def default(theme: Theme, options: ResponsiveFontSizesOptions): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  trait ResponsiveFontSizesOptions extends StObject {
    
    var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
    
    var disableAlign: js.UndefOr[Boolean] = js.undefined
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var variants: js.UndefOr[js.Array[Variant]] = js.undefined
  }
  object ResponsiveFontSizesOptions {
    
    inline def apply(): ResponsiveFontSizesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveFontSizesOptions]
    }
    
    extension [Self <: ResponsiveFontSizesOptions](x: Self) {
      
      inline def setBreakpoints(value: js.Array[Breakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setBreakpointsVarargs(value: Breakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
      
      inline def setDisableAlign(value: Boolean): Self = StObject.set(x, "disableAlign", value.asInstanceOf[js.Any])
      
      inline def setDisableAlignUndefined: Self = StObject.set(x, "disableAlign", js.undefined)
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
}
