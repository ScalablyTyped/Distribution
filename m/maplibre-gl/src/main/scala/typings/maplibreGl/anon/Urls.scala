package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Urls extends StObject {
  
  var coordinates: typings.maplibreGl.mod.Coordinates
  
  var `type`: String
  
  var urls: js.Array[String]
}
object Urls {
  
  inline def apply(coordinates: typings.maplibreGl.mod.Coordinates, `type`: String, urls: js.Array[String]): Urls = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urls]
  }
  
  extension [Self <: Urls](x: Self) {
    
    inline def setCoordinates(value: typings.maplibreGl.mod.Coordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
