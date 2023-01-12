package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWheelEvent extends StObject {
  
  /* standard dom */
  val DOM_DELTA_LINE: Double
  
  /* standard dom */
  val DOM_DELTA_PAGE: Double
  
  /* standard dom */
  val DOM_DELTA_PIXEL: Double
}
object TypeofWheelEvent {
  
  inline def apply(DOM_DELTA_LINE: Double, DOM_DELTA_PAGE: Double, DOM_DELTA_PIXEL: Double): TypeofWheelEvent = {
    val __obj = js.Dynamic.literal(DOM_DELTA_LINE = DOM_DELTA_LINE.asInstanceOf[js.Any], DOM_DELTA_PAGE = DOM_DELTA_PAGE.asInstanceOf[js.Any], DOM_DELTA_PIXEL = DOM_DELTA_PIXEL.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWheelEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofWheelEvent] (val x: Self) extends AnyVal {
    
    inline def setDOM_DELTA_LINE(value: Double): Self = StObject.set(x, "DOM_DELTA_LINE", value.asInstanceOf[js.Any])
    
    inline def setDOM_DELTA_PAGE(value: Double): Self = StObject.set(x, "DOM_DELTA_PAGE", value.asInstanceOf[js.Any])
    
    inline def setDOM_DELTA_PIXEL(value: Double): Self = StObject.set(x, "DOM_DELTA_PIXEL", value.asInstanceOf[js.Any])
  }
}
