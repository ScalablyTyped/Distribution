package typings.maximMazurokGapiClientBlogger.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat extends StObject {
  
  /** Location's latitude. */
  var lat: js.UndefOr[Double] = js.undefined
  
  /** Location's longitude. */
  var lng: js.UndefOr[Double] = js.undefined
  
  /** Location name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Location's viewport span. Can be used when rendering a map preview. */
  var span: js.UndefOr[String] = js.undefined
}
object Lat {
  
  inline def apply(): Lat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpan(value: String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
