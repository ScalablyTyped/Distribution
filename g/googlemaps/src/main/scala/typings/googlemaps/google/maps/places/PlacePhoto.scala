package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacePhoto extends StObject {
  
  def getUrl(opts: PhotoOptions): String = js.native
  
  var height: Double = js.native
  
  var html_attributions: js.Array[String] = js.native
  
  var width: Double = js.native
}
object PlacePhoto {
  
  @scala.inline
  def apply(getUrl: PhotoOptions => String, height: Double, html_attributions: js.Array[String], width: Double): PlacePhoto = {
    val __obj = js.Dynamic.literal(getUrl = js.Any.fromFunction1(getUrl), height = height.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePhoto]
  }
  
  @scala.inline
  implicit class PlacePhotoMutableBuilder[Self <: PlacePhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUrl(value: PhotoOptions => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_attributions(value: js.Array[String]): Self = StObject.set(x, "html_attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_attributionsVarargs(value: String*): Self = StObject.set(x, "html_attributions", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
