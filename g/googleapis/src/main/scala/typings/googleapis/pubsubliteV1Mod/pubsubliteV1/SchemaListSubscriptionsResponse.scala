package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSubscriptionsResponse extends StObject {
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page of results. If this field is omitted, there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of subscriptions in the requested parent. The order of the subscriptions is unspecified.
    */
  var subscriptions: js.UndefOr[js.Array[SchemaSubscription]] = js.undefined
}
object SchemaListSubscriptionsResponse {
  
  inline def apply(): SchemaListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSubscriptionsResponse]
  }
  
  extension [Self <: SchemaListSubscriptionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubscriptions(value: js.Array[SchemaSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: SchemaSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
