package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyEmaillinksignin
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest] = js.undefined
}
object ParamsResourceRelyingpartyEmaillinksignin {
  
  inline def apply(): ParamsResourceRelyingpartyEmaillinksignin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyEmaillinksignin]
  }
  
  extension [Self <: ParamsResourceRelyingpartyEmaillinksignin](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
