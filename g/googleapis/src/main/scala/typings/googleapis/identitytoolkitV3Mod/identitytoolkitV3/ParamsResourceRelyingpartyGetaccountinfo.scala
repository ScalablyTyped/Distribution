package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyGetaccountinfo
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest] = js.undefined
}
object ParamsResourceRelyingpartyGetaccountinfo {
  
  inline def apply(): ParamsResourceRelyingpartyGetaccountinfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyGetaccountinfo]
  }
  
  extension [Self <: ParamsResourceRelyingpartyGetaccountinfo](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
