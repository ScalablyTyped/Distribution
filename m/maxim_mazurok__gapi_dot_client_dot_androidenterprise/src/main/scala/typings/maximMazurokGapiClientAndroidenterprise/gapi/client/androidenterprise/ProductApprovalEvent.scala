package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductApprovalEvent extends StObject {
  
  /** Whether the product was approved or unapproved. This field will always be present. */
  var approved: js.UndefOr[String] = js.undefined
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which the approval status has changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
}
object ProductApprovalEvent {
  
  inline def apply(): ProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductApprovalEvent]
  }
  
  extension [Self <: ProductApprovalEvent](x: Self) {
    
    inline def setApproved(value: String): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
