package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsMfasigninStart
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInRequest] = js.undefined
}
object ParamsResourceAccountsMfasigninStart {
  
  inline def apply(): ParamsResourceAccountsMfasigninStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsMfasigninStart]
  }
  
  extension [Self <: ParamsResourceAccountsMfasigninStart](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
