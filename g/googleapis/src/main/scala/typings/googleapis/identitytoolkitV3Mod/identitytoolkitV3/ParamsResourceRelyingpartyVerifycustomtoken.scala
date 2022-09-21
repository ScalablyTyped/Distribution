package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyVerifycustomtoken
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest] = js.undefined
}
object ParamsResourceRelyingpartyVerifycustomtoken {
  
  inline def apply(): ParamsResourceRelyingpartyVerifycustomtoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyVerifycustomtoken]
  }
  
  extension [Self <: ParamsResourceRelyingpartyVerifycustomtoken](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
