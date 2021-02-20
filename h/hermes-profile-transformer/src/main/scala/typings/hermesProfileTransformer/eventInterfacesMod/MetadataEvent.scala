package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.METADATA_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_MetadataEvent: METADATA_EVENTS = js.native
}
object MetadataEvent {
  
  @scala.inline
  def apply(ph: METADATA_EVENTS): MetadataEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataEvent]
  }
  
  @scala.inline
  implicit class MetadataEventMutableBuilder[Self <: MetadataEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: METADATA_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
