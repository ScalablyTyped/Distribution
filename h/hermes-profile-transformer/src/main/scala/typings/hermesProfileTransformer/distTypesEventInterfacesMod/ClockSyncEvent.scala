package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.anon.Issuets
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CLOCK_SYNC_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClockSyncEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  @JSName("args")
  var args_ClockSyncEvent: Issuets
  
  @JSName("ph")
  var ph_ClockSyncEvent: CLOCK_SYNC_EVENTS
}
object ClockSyncEvent {
  
  inline def apply(args: Issuets, ph: CLOCK_SYNC_EVENTS): ClockSyncEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockSyncEvent]
  }
  
  extension [Self <: ClockSyncEvent](x: Self) {
    
    inline def setArgs(value: Issuets): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setPh(value: CLOCK_SYNC_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
