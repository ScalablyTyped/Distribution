package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerAxisCoordinateObject extends StObject {
  
  /**
    * Related axis.
    */
  var axis: Axis
  
  /**
    * Axis value.
    */
  var value: Double
}
object PointerAxisCoordinateObject {
  
  inline def apply(axis: Axis, value: Double): PointerAxisCoordinateObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerAxisCoordinateObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerAxisCoordinateObject] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
