package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartySignoutuser
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartySignOutUserRequest] = js.undefined
}
object ParamsResourceRelyingpartySignoutuser {
  
  inline def apply(): ParamsResourceRelyingpartySignoutuser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartySignoutuser]
  }
  
  extension [Self <: ParamsResourceRelyingpartySignoutuser](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartySignOutUserRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
