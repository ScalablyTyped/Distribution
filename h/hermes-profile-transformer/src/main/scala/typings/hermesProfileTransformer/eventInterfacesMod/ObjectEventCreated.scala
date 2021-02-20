package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectEventCreated
  extends ObjectEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_ObjectEventCreated: OBJECT_EVENTS_CREATED = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object ObjectEventCreated {
  
  @scala.inline
  def apply(ph: OBJECT_EVENTS_CREATED): ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEventCreated]
  }
  
  @scala.inline
  implicit class ObjectEventCreatedMutableBuilder[Self <: ObjectEventCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: OBJECT_EVENTS_CREATED): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
