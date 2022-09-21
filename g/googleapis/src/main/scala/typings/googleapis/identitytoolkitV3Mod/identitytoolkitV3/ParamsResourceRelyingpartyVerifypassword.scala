package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyVerifypassword
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest] = js.undefined
}
object ParamsResourceRelyingpartyVerifypassword {
  
  inline def apply(): ParamsResourceRelyingpartyVerifypassword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyVerifypassword]
  }
  
  extension [Self <: ParamsResourceRelyingpartyVerifypassword](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
