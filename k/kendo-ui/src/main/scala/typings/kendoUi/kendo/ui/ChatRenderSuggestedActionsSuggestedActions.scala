package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRenderSuggestedActionsSuggestedActions extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ChatRenderSuggestedActionsSuggestedActions {
  
  @scala.inline
  def apply(): ChatRenderSuggestedActionsSuggestedActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderSuggestedActionsSuggestedActions]
  }
  
  @scala.inline
  implicit class ChatRenderSuggestedActionsSuggestedActionsMutableBuilder[Self <: ChatRenderSuggestedActionsSuggestedActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
