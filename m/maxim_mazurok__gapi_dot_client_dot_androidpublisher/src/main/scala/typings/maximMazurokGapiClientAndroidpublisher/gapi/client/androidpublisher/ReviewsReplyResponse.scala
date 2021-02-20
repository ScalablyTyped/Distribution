package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewsReplyResponse extends StObject {
  
  /** The result of replying/updating a reply to review. */
  var result: js.UndefOr[ReviewReplyResult] = js.native
}
object ReviewsReplyResponse {
  
  @scala.inline
  def apply(): ReviewsReplyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewsReplyResponse]
  }
  
  @scala.inline
  implicit class ReviewsReplyResponseMutableBuilder[Self <: ReviewsReplyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: ReviewReplyResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
