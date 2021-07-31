package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `Pull` method.
  */
trait SchemaPullRequest extends StObject {
  
  /**
    * The maximum number of messages returned for this request. The Pub/Sub
    * system may return fewer than the number specified.
    */
  var maxMessages: js.UndefOr[Double] = js.undefined
  
  /**
    * If this field set to true, the system will respond immediately even if it
    * there are no messages available to return in the `Pull` response.
    * Otherwise, the system may wait (for a bounded amount of time) until at
    * least one message is available, rather than returning no messages.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.undefined
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
