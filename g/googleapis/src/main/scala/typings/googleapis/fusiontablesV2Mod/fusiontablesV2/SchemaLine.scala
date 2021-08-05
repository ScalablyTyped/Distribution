package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a line geometry.
  */
trait SchemaLine extends StObject {
  
  /**
    * The coordinates that define the line.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * Type: A line geometry.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaLine {
  
  inline def apply(): SchemaLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLine]
  }
  
  extension [Self <: SchemaLine](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
