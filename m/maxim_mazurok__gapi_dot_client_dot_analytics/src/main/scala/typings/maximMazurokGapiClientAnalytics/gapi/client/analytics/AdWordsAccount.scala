package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsAccount extends StObject {
  
  /** True if auto-tagging is enabled on the Google Ads account. Read-only after the insert operation. */
  var autoTaggingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Customer ID. This field is required when creating a Google Ads link. */
  var customerId: js.UndefOr[String] = js.undefined
  
  /** Resource type for Google Ads account. */
  var kind: js.UndefOr[String] = js.undefined
}
object AdWordsAccount {
  
  inline def apply(): AdWordsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsAccount]
  }
  
  extension [Self <: AdWordsAccount](x: Self) {
    
    inline def setAutoTaggingEnabled(value: Boolean): Self = StObject.set(x, "autoTaggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoTaggingEnabledUndefined: Self = StObject.set(x, "autoTaggingEnabled", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
