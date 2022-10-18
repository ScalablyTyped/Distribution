package typings.materialUiCore.anon

import typings.materialUiCore.stylesCreateBreakpointsMod.Breakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidthOptions> */
trait PartialWithWidthOptions extends StObject {
  
  var initialWidth: js.UndefOr[Breakpoint] = js.undefined
  
  var noSSR: js.UndefOr[Boolean] = js.undefined
  
  var resizeInterval: js.UndefOr[Double] = js.undefined
  
  var withTheme: js.UndefOr[Boolean] = js.undefined
}
object PartialWithWidthOptions {
  
  inline def apply(): PartialWithWidthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithWidthOptions]
  }
  
  extension [Self <: PartialWithWidthOptions](x: Self) {
    
    inline def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
    
    inline def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
    
    inline def setNoSSR(value: Boolean): Self = StObject.set(x, "noSSR", value.asInstanceOf[js.Any])
    
    inline def setNoSSRUndefined: Self = StObject.set(x, "noSSR", js.undefined)
    
    inline def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
    
    inline def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
    
    inline def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
    
    inline def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
  }
}
