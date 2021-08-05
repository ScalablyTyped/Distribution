package typings.jpushReactNative.anon

import typings.jpushReactNative.mod.Extra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var extras: Extra
  
  var messageID: String
  
  var title: String
}
object Content {
  
  inline def apply(content: String, extras: Extra, messageID: String, title: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExtras(value: Extra): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
