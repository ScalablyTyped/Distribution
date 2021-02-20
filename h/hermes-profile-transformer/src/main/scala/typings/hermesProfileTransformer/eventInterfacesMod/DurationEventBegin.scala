package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationEventBegin
  extends DurationEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_DurationEventBegin: DURATION_EVENTS_BEGIN = js.native
}
object DurationEventBegin {
  
  @scala.inline
  def apply(ph: DURATION_EVENTS_BEGIN): DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEventBegin]
  }
  
  @scala.inline
  implicit class DurationEventBeginMutableBuilder[Self <: DurationEventBegin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: DURATION_EVENTS_BEGIN): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
