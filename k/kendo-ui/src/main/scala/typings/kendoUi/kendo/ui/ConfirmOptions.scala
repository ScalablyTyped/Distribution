package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmOptions extends StObject {
  
  var content: js.UndefOr[String] = js.native
  
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.native
  
  var messages: js.UndefOr[ConfirmMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.native
  
  var title: js.UndefOr[String | Boolean] = js.native
}
object ConfirmOptions {
  
  @scala.inline
  def apply(): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmOptions]
  }
  
  @scala.inline
  implicit class ConfirmOptionsMutableBuilder[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setInitOpen(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "initOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitOpenUndefined: Self = StObject.set(x, "initOpen", js.undefined)
    
    @scala.inline
    def setMessages(value: ConfirmMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
