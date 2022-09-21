package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsApprovalrequestsDismiss
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the ApprovalRequest to dismiss.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDismissApprovalRequestMessage] = js.undefined
}
object ParamsResourceProjectsApprovalrequestsDismiss {
  
  inline def apply(): ParamsResourceProjectsApprovalrequestsDismiss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsApprovalrequestsDismiss]
  }
  
  extension [Self <: ParamsResourceProjectsApprovalrequestsDismiss](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDismissApprovalRequestMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
