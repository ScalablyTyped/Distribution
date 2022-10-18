package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed
*/
trait ObjectEvent
  extends StObject
     with Event
object ObjectEvent {
  
  inline def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated]
  }
  
  inline def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed]
  }
  
  inline def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot]
  }
}
