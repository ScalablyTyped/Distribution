package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `Pull` method.
  */
@js.native
trait SchemaPullRequest extends StObject {
  
  /**
    * The maximum number of messages returned for this request. The Pub/Sub
    * system may return fewer than the number specified.
    */
  var maxMessages: js.UndefOr[Double] = js.native
  
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the `Pull` response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning no messages. The client may cancel the request if it does
    * not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
}
object SchemaPullRequest {
  
  @scala.inline
  def apply(): SchemaPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullRequest]
  }
  
  @scala.inline
  implicit class SchemaPullRequestMutableBuilder[Self <: SchemaPullRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    @scala.inline
    def setReturnImmediately(value: Boolean): Self = StObject.set(x, "returnImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnImmediatelyUndefined: Self = StObject.set(x, "returnImmediately", js.undefined)
  }
}
