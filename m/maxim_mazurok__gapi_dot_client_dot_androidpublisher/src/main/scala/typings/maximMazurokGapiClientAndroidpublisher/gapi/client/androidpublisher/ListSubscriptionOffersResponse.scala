package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionOffersResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The subscription offers from the specified subscription. */
  var subscriptionOffers: js.UndefOr[js.Array[SubscriptionOffer]] = js.undefined
}
object ListSubscriptionOffersResponse {
  
  inline def apply(): ListSubscriptionOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionOffersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSubscriptionOffersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubscriptionOffers(value: js.Array[SubscriptionOffer]): Self = StObject.set(x, "subscriptionOffers", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionOffersUndefined: Self = StObject.set(x, "subscriptionOffers", js.undefined)
    
    inline def setSubscriptionOffersVarargs(value: SubscriptionOffer*): Self = StObject.set(x, "subscriptionOffers", js.Array(value*))
  }
}
