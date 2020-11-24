package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Field
import typings.iitc.iitctypesMod.IITC.FieldData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFieldRemoved extends js.Object {
  
  var data: FieldData = js.native
  
  var field: Field = js.native
}
object EventFieldRemoved {
  
  @scala.inline
  def apply(data: FieldData, field: Field): EventFieldRemoved = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFieldRemoved]
  }
  
  @scala.inline
  implicit class EventFieldRemovedOps[Self <: EventFieldRemoved] (val x: Self) extends AnyVal {
    
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
    def setData(value: FieldData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Field): Self = this.set("field", value.asInstanceOf[js.Any])
  }
}
