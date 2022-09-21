package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsMfaenrollmentFinalize
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentRequest] = js.undefined
}
object ParamsResourceAccountsMfaenrollmentFinalize {
  
  inline def apply(): ParamsResourceAccountsMfaenrollmentFinalize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsMfaenrollmentFinalize]
  }
  
  extension [Self <: ParamsResourceAccountsMfaenrollmentFinalize](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
