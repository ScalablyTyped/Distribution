package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyDeleteaccount
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyDeleteAccountRequest] = js.undefined
}
object ParamsResourceRelyingpartyDeleteaccount {
  
  inline def apply(): ParamsResourceRelyingpartyDeleteaccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyDeleteaccount]
  }
  
  extension [Self <: ParamsResourceRelyingpartyDeleteaccount](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyDeleteAccountRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
