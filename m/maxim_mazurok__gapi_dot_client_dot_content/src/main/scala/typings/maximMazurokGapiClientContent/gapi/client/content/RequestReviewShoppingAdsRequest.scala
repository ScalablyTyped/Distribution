package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestReviewShoppingAdsRequest extends StObject {
  
  /** The code [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the country for which review is to be requested. */
  var regionCode: js.UndefOr[String] = js.undefined
}
object RequestReviewShoppingAdsRequest {
  
  inline def apply(): RequestReviewShoppingAdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestReviewShoppingAdsRequest]
  }
  
  extension [Self <: RequestReviewShoppingAdsRequest](x: Self) {
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
