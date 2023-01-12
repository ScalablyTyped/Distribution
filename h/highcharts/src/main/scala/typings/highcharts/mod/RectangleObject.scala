package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectangleObject extends StObject {
  
  /**
    * Height of the rectangle.
    */
  var height: Double
  
  /**
    * Width of the rectangle.
    */
  var width: Double
  
  /**
    * Horizontal position of the rectangle.
    */
  var x: Double
  
  /**
    * Vertical position of the rectangle.
    */
  var y: Double
}
object RectangleObject {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): RectangleObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectangleObject] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
