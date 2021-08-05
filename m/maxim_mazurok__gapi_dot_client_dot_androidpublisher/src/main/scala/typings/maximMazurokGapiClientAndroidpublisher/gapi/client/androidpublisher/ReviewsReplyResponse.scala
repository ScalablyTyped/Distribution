package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewsReplyResponse extends StObject {
  
  /** The result of replying/updating a reply to review. */
  var result: js.UndefOr[ReviewReplyResult] = js.undefined
}
object ReviewsReplyResponse {
  
  inline def apply(): ReviewsReplyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewsReplyResponse]
  }
  
  extension [Self <: ReviewsReplyResponse](x: Self) {
    
    inline def setResult(value: ReviewReplyResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
