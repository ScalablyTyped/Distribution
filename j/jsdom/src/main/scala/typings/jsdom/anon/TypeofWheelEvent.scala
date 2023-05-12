package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0x00`
import typings.jsdom.jsdomInts.`0x01`
import typings.jsdom.jsdomInts.`0x02`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWheelEvent extends StObject {
  
  /* standard dom */
  val DOM_DELTA_LINE: `0x01`
  
  /* standard dom */
  val DOM_DELTA_PAGE: `0x02`
  
  /* standard dom */
  val DOM_DELTA_PIXEL: `0x00`
}
object TypeofWheelEvent {
  
  inline def apply(): TypeofWheelEvent = {
    val __obj = js.Dynamic.literal(DOM_DELTA_LINE = 0x01, DOM_DELTA_PAGE = 0x02, DOM_DELTA_PIXEL = 0x00)
    __obj.asInstanceOf[TypeofWheelEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofWheelEvent] (val x: Self) extends AnyVal {
    
    inline def setDOM_DELTA_LINE(value: `0x01`): Self = StObject.set(x, "DOM_DELTA_LINE", value.asInstanceOf[js.Any])
    
    inline def setDOM_DELTA_PAGE(value: `0x02`): Self = StObject.set(x, "DOM_DELTA_PAGE", value.asInstanceOf[js.Any])
    
    inline def setDOM_DELTA_PIXEL(value: `0x00`): Self = StObject.set(x, "DOM_DELTA_PIXEL", value.asInstanceOf[js.Any])
  }
}
