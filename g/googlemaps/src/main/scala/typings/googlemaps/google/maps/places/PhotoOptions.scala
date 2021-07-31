package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoOptions extends StObject {
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
}
object PhotoOptions {
  
  @scala.inline
  def apply(): PhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoOptions]
  }
  
  @scala.inline
  implicit class PhotoOptionsMutableBuilder[Self <: PhotoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
  }
}
