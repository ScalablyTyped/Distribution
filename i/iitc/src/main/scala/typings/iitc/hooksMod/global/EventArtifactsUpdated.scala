package typings.iitc.hooksMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventArtifactsUpdated extends js.Object {
  
  var `new`: js.Any = js.native
  
  var old: js.Any = js.native
}
object EventArtifactsUpdated {
  
  @scala.inline
  def apply(`new`: js.Any, old: js.Any): EventArtifactsUpdated = {
    val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArtifactsUpdated]
  }
  
  @scala.inline
  implicit class EventArtifactsUpdatedOps[Self <: EventArtifactsUpdated] (val x: Self) extends AnyVal {
    
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
    def setNew(value: js.Any): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld(value: js.Any): Self = this.set("old", value.asInstanceOf[js.Any])
  }
}
