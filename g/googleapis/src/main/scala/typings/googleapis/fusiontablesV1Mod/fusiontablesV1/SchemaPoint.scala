package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a point object.
  */
trait SchemaPoint extends StObject {
  
  /**
    * The coordinates that define the point.
    */
  var coordinates: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Point: A point geometry.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaPoint {
  
  inline def apply(): SchemaPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoint]
  }
  
  extension [Self <: SchemaPoint](x: Self) {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
