package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var event: String = js.native
  
  var seq: Double = js.native
  
  var `type`: event = js.native
}
object Event {
  
  @scala.inline
  def apply(event: String, seq: Double, `type`: event): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
