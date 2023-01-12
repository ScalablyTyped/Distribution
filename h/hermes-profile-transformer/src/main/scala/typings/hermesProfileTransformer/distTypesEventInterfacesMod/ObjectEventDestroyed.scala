package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
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
  
  inline def apply(ph: OBJECT_EVENTS_DESTROYED): ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEventDestroyed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectEventDestroyed] (val x: Self) extends AnyVal {
    
    inline def setPh(value: OBJECT_EVENTS_DESTROYED): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
