package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFieldAdded extends js.Object {
  
  var field: Field = js.native
}
object EventFieldAdded {
  
  @scala.inline
  def apply(field: Field): EventFieldAdded = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFieldAdded]
  }
  
  @scala.inline
  implicit class EventFieldAddedOps[Self <: EventFieldAdded] (val x: Self) extends AnyVal {
    
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
    def setField(value: Field): Self = this.set("field", value.asInstanceOf[js.Any])
  }
}
