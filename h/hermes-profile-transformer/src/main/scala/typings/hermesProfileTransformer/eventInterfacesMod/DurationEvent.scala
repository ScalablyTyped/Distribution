package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.eventInterfacesMod.DurationEventBegin
  - typings.hermesProfileTransformer.eventInterfacesMod.DurationEventEnd
*/
trait DurationEvent extends Event
object DurationEvent {
  
  @scala.inline
  def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): DurationEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEvent]
  }
  
  @scala.inline
  def DurationEventEnd(ph: DURATION_EVENTS_END): DurationEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEvent]
  }
}
