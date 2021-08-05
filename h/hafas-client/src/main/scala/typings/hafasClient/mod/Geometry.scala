package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  var coordinates: js.Array[Double]
  
  var `type`: Point
}
object Geometry {
  
  inline def apply(coordinates: js.Array[Double]): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Point")
    __obj.asInstanceOf[Geometry]
  }
  
  extension [Self <: Geometry](x: Self) {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setType(value: Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
