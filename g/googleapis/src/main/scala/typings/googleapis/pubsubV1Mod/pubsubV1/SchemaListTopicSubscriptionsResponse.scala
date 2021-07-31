package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListTopicSubscriptions` method.
  */
trait SchemaListTopicSubscriptionsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more subscriptions that match
    * the request; this value should be passed in a new
    * `ListTopicSubscriptionsRequest` to get more subscriptions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The names of the subscriptions that match the request.
    */
  var subscriptions: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaListTopicSubscriptionsResponse {
  
  @scala.inline
  def apply(): SchemaListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTopicSubscriptionsResponseMutableBuilder[Self <: SchemaListTopicSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: js.Array[String]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: String*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
