package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptions extends StObject {
  
  /**
    * Identifies the resource as a collection of subscriptions. Value: reseller#subscriptions
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subscriptions in this page of results.
    */
  var subscriptions: js.UndefOr[js.Array[SchemaSubscription]] = js.undefined
}
object SchemaSubscriptions {
  
  inline def apply(): SchemaSubscriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptions]
  }
  
  extension [Self <: SchemaSubscriptions](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubscriptions(value: js.Array[SchemaSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: SchemaSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
