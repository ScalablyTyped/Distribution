package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rect extends StObject {
  
  /**
    * The height of the element in pixels.
    */
  var height: Double
  
  /**
    * The width of the element in pixels.
    */
  var width: Double
  
  /**
    * The x coordinate of the element in pixels.
    * (0, 0) is the top left corner of the viewport.
    */
  var x: Double
  
  /**
    * The y coordinate of the element in pixels.
    * (0, 0) is the top left corner of the viewport.
    */
  var y: Double
}
object Rect {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
