package typings.inboxsdk.mod.Lists

import typings.inboxsdk.inboxsdkStrings.LINK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowActionButtonDescriptor extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  
  var title: String
  
  var `type`: LINK
  
  var url: String
}
object ThreadRowActionButtonDescriptor {
  
  inline def apply(title: String, url: String): ThreadRowActionButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LINK")
    __obj.asInstanceOf[ThreadRowActionButtonDescriptor]
  }
  
  extension [Self <: ThreadRowActionButtonDescriptor](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnClick(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: LINK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
