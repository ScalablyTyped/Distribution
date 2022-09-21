package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsApprovalrequestsApprove
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the approval request to approve.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApproveApprovalRequestMessage] = js.undefined
}
object ParamsResourceProjectsApprovalrequestsApprove {
  
  inline def apply(): ParamsResourceProjectsApprovalrequestsApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsApprovalrequestsApprove]
  }
  
  extension [Self <: ParamsResourceProjectsApprovalrequestsApprove](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaApproveApprovalRequestMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
