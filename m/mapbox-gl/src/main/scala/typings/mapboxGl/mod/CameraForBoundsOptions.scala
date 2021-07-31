package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraForBoundsOptions
  extends StObject
     with CameraOptions {
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[PointLike] = js.undefined
  
  var padding: js.UndefOr[Double | PaddingOptions] = js.undefined
}
object CameraForBoundsOptions {
  
  @scala.inline
  def apply(): CameraForBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraForBoundsOptions]
  }
  
  @scala.inline
  implicit class CameraForBoundsOptionsMutableBuilder[Self <: CameraForBoundsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setOffset(value: PointLike): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | PaddingOptions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
