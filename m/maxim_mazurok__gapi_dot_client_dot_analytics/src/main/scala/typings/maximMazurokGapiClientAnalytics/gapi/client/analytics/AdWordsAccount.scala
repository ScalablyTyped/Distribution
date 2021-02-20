package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsAccount extends StObject {
  
  /** True if auto-tagging is enabled on the Google Ads account. Read-only after the insert operation. */
  var autoTaggingEnabled: js.UndefOr[Boolean] = js.native
  
  /** Customer ID. This field is required when creating a Google Ads link. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Resource type for Google Ads account. */
  var kind: js.UndefOr[String] = js.native
}
object AdWordsAccount {
  
  @scala.inline
  def apply(): AdWordsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsAccount]
  }
  
  @scala.inline
  implicit class AdWordsAccountMutableBuilder[Self <: AdWordsAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoTaggingEnabled(value: Boolean): Self = StObject.set(x, "autoTaggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTaggingEnabledUndefined: Self = StObject.set(x, "autoTaggingEnabled", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
