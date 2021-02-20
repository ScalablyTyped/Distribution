package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatRenderMessageSender extends StObject {
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ChatRenderMessageSender {
  
  @scala.inline
  def apply(): ChatRenderMessageSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderMessageSender]
  }
  
  @scala.inline
  implicit class ChatRenderMessageSenderMutableBuilder[Self <: ChatRenderMessageSender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
