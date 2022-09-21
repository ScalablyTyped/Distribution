package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyResetpassword
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyResetPasswordRequest] = js.undefined
}
object ParamsResourceRelyingpartyResetpassword {
  
  inline def apply(): ParamsResourceRelyingpartyResetpassword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyResetpassword]
  }
  
  extension [Self <: ParamsResourceRelyingpartyResetpassword](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyResetPasswordRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
