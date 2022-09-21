package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsReset
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the event.
    */
  var eventId: js.UndefOr[String] = js.undefined
}
object ParamsResourceEventsReset {
  
  inline def apply(): ParamsResourceEventsReset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsReset]
  }
  
  extension [Self <: ParamsResourceEventsReset](x: Self) {
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
  }
}
