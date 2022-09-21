package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result object of a map transformation.
  */
trait ProjectedXY extends StObject {
  
  /**
    * X coordinate in projected units.
    */
  var x: Double
  
  /**
    * Y coordinate in projected units
    */
  var y: Double
}
object ProjectedXY {
  
  inline def apply(x: Double, y: Double): ProjectedXY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedXY]
  }
  
  extension [Self <: ProjectedXY](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
