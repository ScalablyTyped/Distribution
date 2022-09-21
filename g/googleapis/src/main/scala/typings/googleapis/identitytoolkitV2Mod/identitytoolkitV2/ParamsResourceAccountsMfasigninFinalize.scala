package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsMfasigninFinalize
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInRequest] = js.undefined
}
object ParamsResourceAccountsMfasigninFinalize {
  
  inline def apply(): ParamsResourceAccountsMfasigninFinalize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsMfasigninFinalize]
  }
  
  extension [Self <: ParamsResourceAccountsMfasigninFinalize](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
