package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmOptions extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  
  var messages: js.UndefOr[ConfirmMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  
  var title: js.UndefOr[String | Boolean] = js.undefined
}
object ConfirmOptions {
  
  inline def apply(): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmOptions]
  }
  
  extension [Self <: ConfirmOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setInitOpen(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "initOpen", js.Any.fromFunction1(value))
    
    inline def setInitOpenUndefined: Self = StObject.set(x, "initOpen", js.undefined)
    
    inline def setMessages(value: ConfirmMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
