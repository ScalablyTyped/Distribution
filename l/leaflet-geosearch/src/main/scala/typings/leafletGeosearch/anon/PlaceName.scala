package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceName extends StObject {
  
  var placeName: Double
}
object PlaceName {
  
  inline def apply(placeName: Double): PlaceName = {
    val __obj = js.Dynamic.literal(placeName = placeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceName]
  }
  
  extension [Self <: PlaceName](x: Self) {
    
    inline def setPlaceName(value: Double): Self = StObject.set(x, "placeName", value.asInstanceOf[js.Any])
  }
}
