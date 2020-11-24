package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncEventInstant
  extends AsyncEvent
     with SharedEventProperties {
  
  var id: Double = js.native
  
  @JSName("ph")
  var ph_AsyncEventInstant: ASYNC_EVENTS_NESTABLE_INSTANT = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object AsyncEventInstant {
  
  @scala.inline
  def apply(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEventInstant]
  }
  
  @scala.inline
  implicit class AsyncEventInstantOps[Self <: AsyncEventInstant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: ASYNC_EVENTS_NESTABLE_INSTANT): Self = this.set("ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
