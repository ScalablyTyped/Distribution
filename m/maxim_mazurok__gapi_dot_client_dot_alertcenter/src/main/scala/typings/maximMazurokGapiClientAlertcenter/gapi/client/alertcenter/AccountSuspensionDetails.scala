package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSuspensionDetails extends StObject {
  
  /** The reason why this account is receiving an account suspension warning. */
  var abuseReason: js.UndefOr[String] = js.undefined
  
  /** The name of the product being abused. This is restricted to only the following values: "Gmail" "Google Workspace" "Payments" "Voice" "YouTube" "Other" */
  var productName: js.UndefOr[String] = js.undefined
}
object AccountSuspensionDetails {
  
  inline def apply(): AccountSuspensionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSuspensionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSuspensionDetails] (val x: Self) extends AnyVal {
    
    inline def setAbuseReason(value: String): Self = StObject.set(x, "abuseReason", value.asInstanceOf[js.Any])
    
    inline def setAbuseReasonUndefined: Self = StObject.set(x, "abuseReason", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
  }
}
