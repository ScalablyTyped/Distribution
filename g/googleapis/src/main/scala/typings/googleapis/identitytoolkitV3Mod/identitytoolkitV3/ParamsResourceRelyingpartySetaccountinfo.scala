package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartySetaccountinfo
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest] = js.undefined
}
object ParamsResourceRelyingpartySetaccountinfo {
  
  inline def apply(): ParamsResourceRelyingpartySetaccountinfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartySetaccountinfo]
  }
  
  extension [Self <: ParamsResourceRelyingpartySetaccountinfo](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
