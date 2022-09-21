package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinates extends StObject {
  
  var coordinates: js.UndefOr[typings.maplibreGl.mod.Coordinates] = js.undefined
  
  var url: String
}
object Coordinates {
  
  inline def apply(url: String): Coordinates = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  extension [Self <: Coordinates](x: Self) {
    
    inline def setCoordinates(value: typings.maplibreGl.mod.Coordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
