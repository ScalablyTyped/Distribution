package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsMfaenrollmentStart
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest] = js.undefined
}
object ParamsResourceAccountsMfaenrollmentStart {
  
  inline def apply(): ParamsResourceAccountsMfaenrollmentStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsMfaenrollmentStart]
  }
  
  extension [Self <: ParamsResourceAccountsMfaenrollmentStart](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
