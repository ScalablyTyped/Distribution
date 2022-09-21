package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyVerifyassertion
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest] = js.undefined
}
object ParamsResourceRelyingpartyVerifyassertion {
  
  inline def apply(): ParamsResourceRelyingpartyVerifyassertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyVerifyassertion]
  }
  
  extension [Self <: ParamsResourceRelyingpartyVerifyassertion](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
