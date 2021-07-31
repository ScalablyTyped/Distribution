package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthX extends StObject {
  
  var height: Double
  
  var width: Double
  
  var x: js.Any
  
  var y: js.Any
}
object WidthX {
  
  @scala.inline
  def apply(height: Double, width: Double, x: js.Any, y: js.Any): WidthX = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthX]
  }
  
  @scala.inline
  implicit class WidthXMutableBuilder[Self <: WidthX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
