package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListSubscriptions` method.
  */
trait SchemaListSubscriptionsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more subscriptions that match
    * the request; this value should be passed in a new
    * `ListSubscriptionsRequest` to get more subscriptions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The subscriptions that match the request.
    */
  var subscriptions: js.UndefOr[js.Array[SchemaSubscription]] = js.undefined
}
object SchemaListSubscriptionsResponse {
  
  @scala.inline
  def apply(): SchemaListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListSubscriptionsResponseMutableBuilder[Self <: SchemaListSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: js.Array[SchemaSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: SchemaSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
