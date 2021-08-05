package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result object of a map transformation.
  */
trait MapCoordinateObject extends StObject {
  
  /**
    * X coordinate on the map.
    */
  var x: Double
  
  /**
    * Y coordinate on the map.
    */
  var y: Double | Null
}
object MapCoordinateObject {
  
  inline def apply(x: Double): MapCoordinateObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = null)
    __obj.asInstanceOf[MapCoordinateObject]
  }
  
  extension [Self <: MapCoordinateObject](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
  }
}
