package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatRenderSuggestedActionsSuggestedActions extends js.Object {
  
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object ChatRenderSuggestedActionsSuggestedActions {
  
  @scala.inline
  def apply(): ChatRenderSuggestedActionsSuggestedActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderSuggestedActionsSuggestedActions]
  }
  
  @scala.inline
  implicit class ChatRenderSuggestedActionsSuggestedActionsOps[Self <: ChatRenderSuggestedActionsSuggestedActions] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
