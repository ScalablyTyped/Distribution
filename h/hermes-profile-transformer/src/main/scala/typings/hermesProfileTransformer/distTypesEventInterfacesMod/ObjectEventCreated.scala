package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectEventCreated
  extends StObject
     with SharedEventProperties
     with ObjectEvent {
  
  @JSName("ph")
  var ph_ObjectEventCreated: OBJECT_EVENTS_CREATED
  
  var scope: js.UndefOr[String] = js.undefined
}
object ObjectEventCreated {
  
  inline def apply(ph: OBJECT_EVENTS_CREATED): ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEventCreated]
  }
  
  extension [Self <: ObjectEventCreated](x: Self) {
    
    inline def setPh(value: OBJECT_EVENTS_CREATED): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
