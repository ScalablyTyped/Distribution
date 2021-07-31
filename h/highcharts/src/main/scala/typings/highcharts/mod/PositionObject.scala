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
  
  @scala.inline
  def apply(x: Double, y: Double): PositionObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionObject]
  }
  
  @scala.inline
  implicit class PositionObjectMutableBuilder[Self <: PositionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
