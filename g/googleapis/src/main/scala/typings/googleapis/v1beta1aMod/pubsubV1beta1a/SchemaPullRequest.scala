package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the Pull method.
  */
trait SchemaPullRequest extends StObject {
  
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the Pull response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning FAILED_PRECONDITION. The client may cancel the request if
    * it does not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The subscription from which a message should be pulled.
    */
  var subscription: js.UndefOr[String] = js.undefined
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
    def setReturnImmediately(value: Boolean): Self = StObject.set(x, "returnImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnImmediatelyUndefined: Self = StObject.set(x, "returnImmediately", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
