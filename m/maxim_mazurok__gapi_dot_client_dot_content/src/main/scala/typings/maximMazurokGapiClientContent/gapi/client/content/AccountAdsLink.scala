package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAdsLink extends StObject {
  
  /** Customer ID of the Ads account. */
  var adsId: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the link between this Merchant Center account and the Ads account. Upon retrieval, it represents the actual status of the link and can be either `active` if it was
    * approved in Google Ads or `pending` if it's pending approval. Upon insertion, it represents the *intended* status of the link. Re-uploading a link with status `active` when it's
    * still pending or with status `pending` when it's already active will have no effect: the status will remain unchanged. Re-uploading a link with deprecated status `inactive` is
    * equivalent to not submitting the link at all and will delete the link if it was active or cancel the link request if it was pending. Acceptable values are: - "`active`" -
    * "`pending`"
    */
  var status: js.UndefOr[String] = js.undefined
}
object AccountAdsLink {
  
  inline def apply(): AccountAdsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAdsLink]
  }
  
  extension [Self <: AccountAdsLink](x: Self) {
    
    inline def setAdsId(value: String): Self = StObject.set(x, "adsId", value.asInstanceOf[js.Any])
    
    inline def setAdsIdUndefined: Self = StObject.set(x, "adsId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
