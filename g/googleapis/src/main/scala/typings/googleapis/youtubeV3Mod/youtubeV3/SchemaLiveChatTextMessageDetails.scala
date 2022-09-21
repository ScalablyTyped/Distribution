package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatTextMessageDetails extends StObject {
  
  /**
    * The user's message.
    */
  var messageText: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatTextMessageDetails {
  
  inline def apply(): SchemaLiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatTextMessageDetails]
  }
  
  extension [Self <: SchemaLiveChatTextMessageDetails](x: Self) {
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextNull: Self = StObject.set(x, "messageText", null)
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
  }
}
