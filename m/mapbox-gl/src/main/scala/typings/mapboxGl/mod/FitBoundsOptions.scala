package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitBoundsOptions
  extends StObject
     with FlyToOptions {
  
  var linear: js.UndefOr[Boolean] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[Double | PaddingOptions] = js.undefined
}
object FitBoundsOptions {
  
  @scala.inline
  def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  
  @scala.inline
  implicit class FitBoundsOptionsMutableBuilder[Self <: FitBoundsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | PaddingOptions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
