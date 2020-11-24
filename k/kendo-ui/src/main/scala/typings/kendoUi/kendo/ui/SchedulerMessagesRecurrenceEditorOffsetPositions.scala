package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditorOffsetPositions extends js.Object {
  
  var first: js.UndefOr[String] = js.native
  
  var fourth: js.UndefOr[String] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var second: js.UndefOr[String] = js.native
  
  var third: js.UndefOr[String] = js.native
}
object SchedulerMessagesRecurrenceEditorOffsetPositions {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorOffsetPositions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorOffsetPositions]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorOffsetPositionsOps[Self <: SchedulerMessagesRecurrenceEditorOffsetPositions] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: String): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setFourth(value: String): Self = this.set("fourth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFourth: Self = this.set("fourth", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setSecond(value: String): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setThird(value: String): Self = this.set("third", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThird: Self = this.set("third", js.undefined)
  }
}
