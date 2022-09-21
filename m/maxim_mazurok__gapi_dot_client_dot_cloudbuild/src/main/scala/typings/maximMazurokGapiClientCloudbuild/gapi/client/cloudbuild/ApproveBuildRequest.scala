package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproveBuildRequest extends StObject {
  
  /** Approval decision and metadata. */
  var approvalResult: js.UndefOr[ApprovalResult] = js.undefined
}
object ApproveBuildRequest {
  
  inline def apply(): ApproveBuildRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproveBuildRequest]
  }
  
  extension [Self <: ApproveBuildRequest](x: Self) {
    
    inline def setApprovalResult(value: ApprovalResult): Self = StObject.set(x, "approvalResult", value.asInstanceOf[js.Any])
    
    inline def setApprovalResultUndefined: Self = StObject.set(x, "approvalResult", js.undefined)
  }
}
