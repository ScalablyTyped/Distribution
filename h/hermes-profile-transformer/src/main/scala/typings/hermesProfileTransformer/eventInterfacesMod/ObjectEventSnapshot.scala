package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectEventSnapshot
  extends ObjectEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_ObjectEventSnapshot: OBJECT_EVENTS_SNAPSHOT = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object ObjectEventSnapshot {
  
  @scala.inline
  def apply(ph: OBJECT_EVENTS_SNAPSHOT): ObjectEventSnapshot = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEventSnapshot]
  }
  
  @scala.inline
  implicit class ObjectEventSnapshotMutableBuilder[Self <: ObjectEventSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: OBJECT_EVENTS_SNAPSHOT): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
