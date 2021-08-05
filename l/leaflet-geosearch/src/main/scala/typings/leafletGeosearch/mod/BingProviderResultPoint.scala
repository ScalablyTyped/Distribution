package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingProviderResultPoint extends StObject {
  
  var coordinates: PointTuple
  
  var `type`: String
}
object BingProviderResultPoint {
  
  inline def apply(coordinates: PointTuple, `type`: String): BingProviderResultPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderResultPoint]
  }
  
  extension [Self <: BingProviderResultPoint](x: Self) {
    
    inline def setCoordinates(value: PointTuple): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
