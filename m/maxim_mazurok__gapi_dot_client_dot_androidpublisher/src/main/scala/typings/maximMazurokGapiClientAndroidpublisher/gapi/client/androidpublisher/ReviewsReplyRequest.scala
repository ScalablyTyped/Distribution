package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewsReplyRequest extends StObject {
  
  /** The text to set as the reply. Replies of more than approximately 350 characters will be rejected. HTML tags will be stripped. */
  var replyText: js.UndefOr[String] = js.undefined
}
object ReviewsReplyRequest {
  
  inline def apply(): ReviewsReplyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewsReplyRequest]
  }
  
  extension [Self <: ReviewsReplyRequest](x: Self) {
    
    inline def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    inline def setReplyTextUndefined: Self = StObject.set(x, "replyText", js.undefined)
  }
}
