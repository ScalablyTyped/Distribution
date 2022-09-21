package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTopicSubscriptionsResponse extends StObject {
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page of results. If this field is omitted, there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The names of subscriptions attached to the topic. The order of the subscriptions is unspecified.
    */
  var subscriptions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListTopicSubscriptionsResponse {
  
  inline def apply(): SchemaListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicSubscriptionsResponse]
  }
  
  extension [Self <: SchemaListTopicSubscriptionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubscriptions(value: js.Array[String]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: String*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
