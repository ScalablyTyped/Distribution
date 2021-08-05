package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionObject extends StObject {
  
  /**
    * X position of the element.
    */
  var x: Double
  
  /**
    * Y position of the element.
    */
  var y: Double
}
object PositionObject {
  
  inline def apply(x: Double, y: Double): PositionObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionObject]
  }
  
  extension [Self <: PositionObject](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
