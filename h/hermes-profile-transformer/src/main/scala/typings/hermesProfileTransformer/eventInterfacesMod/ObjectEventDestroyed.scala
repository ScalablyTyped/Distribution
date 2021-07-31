package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectEventDestroyed
  extends StObject
     with SharedEventProperties
     with ObjectEvent {
  
  @JSName("ph")
  var ph_ObjectEventDestroyed: OBJECT_EVENTS_DESTROYED
  
  var scope: js.UndefOr[String] = js.undefined
}
object ObjectEventDestroyed {
  
  @scala.inline
  def apply(ph: OBJECT_EVENTS_DESTROYED): ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEventDestroyed]
  }
  
  @scala.inline
  implicit class ObjectEventDestroyedMutableBuilder[Self <: ObjectEventDestroyed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: OBJECT_EVENTS_DESTROYED): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
