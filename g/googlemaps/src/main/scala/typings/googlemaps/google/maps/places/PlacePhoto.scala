package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacePhoto extends StObject {
  
  def getUrl(opts: PhotoOptions): String
  
  var height: Double
  
  var html_attributions: js.Array[String]
  
  var width: Double
}
object PlacePhoto {
  
  inline def apply(getUrl: PhotoOptions => String, height: Double, html_attributions: js.Array[String], width: Double): PlacePhoto = {
    val __obj = js.Dynamic.literal(getUrl = js.Any.fromFunction1(getUrl), height = height.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePhoto]
  }
  
  extension [Self <: PlacePhoto](x: Self) {
    
    inline def setGetUrl(value: PhotoOptions => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHtml_attributions(value: js.Array[String]): Self = StObject.set(x, "html_attributions", value.asInstanceOf[js.Any])
    
    inline def setHtml_attributionsVarargs(value: String*): Self = StObject.set(x, "html_attributions", js.Array(value :_*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
