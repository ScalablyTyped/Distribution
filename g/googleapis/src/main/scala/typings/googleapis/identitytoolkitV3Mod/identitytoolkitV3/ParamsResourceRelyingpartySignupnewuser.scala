package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartySignupnewuser
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartySignupNewUserRequest] = js.undefined
}
object ParamsResourceRelyingpartySignupnewuser {
  
  inline def apply(): ParamsResourceRelyingpartySignupnewuser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartySignupnewuser]
  }
  
  extension [Self <: ParamsResourceRelyingpartySignupnewuser](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartySignupNewUserRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
