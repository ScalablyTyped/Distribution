package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewLink extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var heading: js.UndefOr[Double] = js.undefined
  
  var pano: js.UndefOr[String] = js.undefined
}
object StreetViewLink {
  
  inline def apply(): StreetViewLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLink]
  }
  
  extension [Self <: StreetViewLink](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
  }
}
