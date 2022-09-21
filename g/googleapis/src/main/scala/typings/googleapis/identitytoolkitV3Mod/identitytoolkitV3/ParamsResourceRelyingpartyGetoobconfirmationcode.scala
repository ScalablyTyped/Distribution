package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyGetoobconfirmationcode
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRelyingparty] = js.undefined
}
object ParamsResourceRelyingpartyGetoobconfirmationcode {
  
  inline def apply(): ParamsResourceRelyingpartyGetoobconfirmationcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyGetoobconfirmationcode]
  }
  
  extension [Self <: ParamsResourceRelyingpartyGetoobconfirmationcode](x: Self) {
    
    inline def setRequestBody(value: SchemaRelyingparty): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
