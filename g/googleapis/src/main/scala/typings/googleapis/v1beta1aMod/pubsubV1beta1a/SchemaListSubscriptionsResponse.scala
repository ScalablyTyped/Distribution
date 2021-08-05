package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListSubscriptions method.
  */
trait SchemaListSubscriptionsResponse extends StObject {
  
  /**
    * If not empty, indicates that there are more subscriptions that match the
    * request and this value should be passed to the next
    * &lt;code&gt;ListSubscriptionsRequest&lt;/code&gt; to continue.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The subscriptions that match the request.
    */
  var subscription: js.UndefOr[js.Array[SchemaSubscription]] = js.undefined
}
object SchemaListSubscriptionsResponse {
  
  inline def apply(): SchemaListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSubscriptionsResponse]
  }
  
  extension [Self <: SchemaListSubscriptionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubscription(value: js.Array[SchemaSubscription]): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setSubscriptionVarargs(value: SchemaSubscription*): Self = StObject.set(x, "subscription", js.Array(value :_*))
  }
}
