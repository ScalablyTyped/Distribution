package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eventid extends StObject {
  
  var event_id: String
}
object Eventid {
  
  inline def apply(event_id: String): Eventid = {
    val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventid]
  }
  
  extension [Self <: Eventid](x: Self) {
    
    inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
  }
}
