package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.SAMPLE_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SampleEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_SampleEvent: SAMPLE_EVENTS = js.native
}
object SampleEvent {
  
  @scala.inline
  def apply(ph: SAMPLE_EVENTS): SampleEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleEvent]
  }
  
  @scala.inline
  implicit class SampleEventMutableBuilder[Self <: SampleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: SAMPLE_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
