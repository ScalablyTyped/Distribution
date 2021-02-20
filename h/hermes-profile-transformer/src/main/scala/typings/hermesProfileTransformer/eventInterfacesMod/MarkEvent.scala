package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.MARK_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_MarkEvent: MARK_EVENTS = js.native
}
object MarkEvent {
  
  @scala.inline
  def apply(ph: MARK_EVENTS): MarkEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkEvent]
  }
  
  @scala.inline
  implicit class MarkEventMutableBuilder[Self <: MarkEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: MARK_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
