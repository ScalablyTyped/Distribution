package typings.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectInboxFeedResponsePlaceholder extends StObject {
  
  var is_linked: Boolean
  
  var message: String
  
  var title: String
}
object DirectInboxFeedResponsePlaceholder {
  
  inline def apply(is_linked: Boolean, message: String, title: String): DirectInboxFeedResponsePlaceholder = {
    val __obj = js.Dynamic.literal(is_linked = is_linked.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponsePlaceholder]
  }
  
  extension [Self <: DirectInboxFeedResponsePlaceholder](x: Self) {
    
    inline def setIs_linked(value: Boolean): Self = StObject.set(x, "is_linked", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
