package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectDataObject extends StObject {
  
  /**
    * The selected Axis.
    */
  var axis: Axis
  
  /**
    * The maximum axis value, either automatic or set manually.
    */
  var max: Double
  
  /**
    * The minimum axis value, either automatic or set manually.
    */
  var min: Double
}
object SelectDataObject {
  
  inline def apply(axis: Axis, max: Double, min: Double): SelectDataObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectDataObject]
  }
  
  extension [Self <: SelectDataObject](x: Self) {
    
    inline def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
