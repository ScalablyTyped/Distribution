package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectangleObject extends StObject {
  
  /**
    * Height of the rectangle.
    */
  var height: Double = js.native
  
  /**
    * Width of the rectangle.
    */
  var width: Double = js.native
  
  /**
    * Horizontal position of the rectangle.
    */
  var x: Double = js.native
  
  /**
    * Vertical position of the rectangle.
    */
  var y: Double = js.native
}
object RectangleObject {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): RectangleObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleObject]
  }
  
  @scala.inline
  implicit class RectangleObjectMutableBuilder[Self <: RectangleObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
