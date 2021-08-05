package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalUrlInfo extends StObject {
  
  /** A URL that displays a product's permissions and that can also be used to approve the product with the Products.approve call. */
  var approvalUrl: js.UndefOr[String] = js.undefined
}
object ApprovalUrlInfo {
  
  inline def apply(): ApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalUrlInfo]
  }
  
  extension [Self <: ApprovalUrlInfo](x: Self) {
    
    inline def setApprovalUrl(value: String): Self = StObject.set(x, "approvalUrl", value.asInstanceOf[js.Any])
    
    inline def setApprovalUrlUndefined: Self = StObject.set(x, "approvalUrl", js.undefined)
  }
}
