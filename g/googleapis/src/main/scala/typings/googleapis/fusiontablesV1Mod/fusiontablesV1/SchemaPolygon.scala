package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a polygon object.
  */
trait SchemaPolygon extends StObject {
  
  /**
    * The coordinates that define the polygon.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  
  /**
    * Type: A polygon geometry.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaPolygon {
  
  inline def apply(): SchemaPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolygon]
  }
  
  extension [Self <: SchemaPolygon](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
