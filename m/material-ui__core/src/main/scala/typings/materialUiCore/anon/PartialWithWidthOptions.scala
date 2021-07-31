package typings.materialUiCore.anon

import typings.materialUiCore.createBreakpointsMod.Breakpoint
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
  
  @scala.inline
  def apply(): PartialWithWidthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithWidthOptions]
  }
  
  @scala.inline
  implicit class PartialWithWidthOptionsMutableBuilder[Self <: PartialWithWidthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
    
    @scala.inline
    def setNoSSR(value: Boolean): Self = StObject.set(x, "noSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSSRUndefined: Self = StObject.set(x, "noSSR", js.undefined)
    
    @scala.inline
    def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
    
    @scala.inline
    def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
  }
}
