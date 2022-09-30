package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchEvent extends StObject {
  
  /**
    * Touch coordinate X
    */
  var page_x: Double
  
  /**
    * Touch coordinate Y
    */
  var page_y: Double
}
object TouchEvent {
  
  inline def apply(page_x: Double, page_y: Double): TouchEvent = {
    val __obj = js.Dynamic.literal(page_x = page_x.asInstanceOf[js.Any], page_y = page_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent]
  }
  
  extension [Self <: TouchEvent](x: Self) {
    
    inline def setPage_x(value: Double): Self = StObject.set(x, "page_x", value.asInstanceOf[js.Any])
    
    inline def setPage_y(value: Double): Self = StObject.set(x, "page_y", value.asInstanceOf[js.Any])
  }
}
