package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountAdsLink extends StObject {
  
  /**
    * Customer ID of the Ads account.
    */
  var adsId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the link between this Merchant Center account and the Ads account. Upon retrieval, it represents the actual status of the link and can be either `active` if it was approved in Google Ads or `pending` if it's pending approval. Upon insertion, it represents the *intended* status of the link. Re-uploading a link with status `active` when it's still pending or with status `pending` when it's already active will have no effect: the status will remain unchanged. Re-uploading a link with deprecated status `inactive` is equivalent to not submitting the link at all and will delete the link if it was active or cancel the link request if it was pending. Acceptable values are: - "`active`" - "`pending`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountAdsLink {
  
  inline def apply(): SchemaAccountAdsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountAdsLink]
  }
  
  extension [Self <: SchemaAccountAdsLink](x: Self) {
    
    inline def setAdsId(value: String): Self = StObject.set(x, "adsId", value.asInstanceOf[js.Any])
    
    inline def setAdsIdNull: Self = StObject.set(x, "adsId", null)
    
    inline def setAdsIdUndefined: Self = StObject.set(x, "adsId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
