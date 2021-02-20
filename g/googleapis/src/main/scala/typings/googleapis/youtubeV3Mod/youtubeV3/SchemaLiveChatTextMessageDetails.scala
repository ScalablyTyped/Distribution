package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatTextMessageDetails extends StObject {
  
  /**
    * The user&#39;s message.
    */
  var messageText: js.UndefOr[String] = js.native
}
object SchemaLiveChatTextMessageDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatTextMessageDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatTextMessageDetailsMutableBuilder[Self <: SchemaLiveChatTextMessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
  }
}
