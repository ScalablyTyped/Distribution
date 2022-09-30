package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Hippy Event
// ----------------------------------------------------------------------
trait LayoutContent extends StObject {
  
  /**
    * The height of component
    */
  var height: Double
  
  /**
    * The width of component
    */
  var width: Double
  
  /**
    * The position X of component
    */
  var x: Double
  
  /**
    * The position Y of component
    */
  var y: Double
}
object LayoutContent {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): LayoutContent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutContent]
  }
  
  extension [Self <: LayoutContent](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
