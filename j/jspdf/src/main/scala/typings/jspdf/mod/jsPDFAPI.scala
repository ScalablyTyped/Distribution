package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait jsPDFAPI extends StObject {
  
  var events: js.Array[Any]
}
object jsPDFAPI {
  
  inline def apply(events: js.Array[Any]): jsPDFAPI = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[jsPDFAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: jsPDFAPI] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
