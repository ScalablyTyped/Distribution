package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeStyle extends StObject {
  
  var elementType: js.UndefOr[MapTypeStyleElementType] = js.undefined
  
  var featureType: js.UndefOr[MapTypeStyleFeatureType] = js.undefined
  
  var stylers: js.UndefOr[js.Array[MapTypeStyler]] = js.undefined
}
object MapTypeStyle {
  
  @scala.inline
  def apply(): MapTypeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeStyle]
  }
  
  @scala.inline
  implicit class MapTypeStyleMutableBuilder[Self <: MapTypeStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: MapTypeStyleElementType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    @scala.inline
    def setFeatureType(value: MapTypeStyleFeatureType): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    @scala.inline
    def setStylers(value: js.Array[MapTypeStyler]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylersUndefined: Self = StObject.set(x, "stylers", js.undefined)
    
    @scala.inline
    def setStylersVarargs(value: MapTypeStyler*): Self = StObject.set(x, "stylers", js.Array(value :_*))
  }
}
