package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartySendverificationcode
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest] = js.undefined
}
object ParamsResourceRelyingpartySendverificationcode {
  
  inline def apply(): ParamsResourceRelyingpartySendverificationcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartySendverificationcode]
  }
  
  extension [Self <: ParamsResourceRelyingpartySendverificationcode](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
