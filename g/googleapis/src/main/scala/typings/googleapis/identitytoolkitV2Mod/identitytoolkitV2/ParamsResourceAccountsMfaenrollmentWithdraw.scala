package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsMfaenrollmentWithdraw
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaRequest] = js.undefined
}
object ParamsResourceAccountsMfaenrollmentWithdraw {
  
  inline def apply(): ParamsResourceAccountsMfaenrollmentWithdraw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsMfaenrollmentWithdraw]
  }
  
  extension [Self <: ParamsResourceAccountsMfaenrollmentWithdraw](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
