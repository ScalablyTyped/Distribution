package typings.googleapis.stsV1Mod.stsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Token
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleIdentityStsV1ExchangeTokenRequest] = js.undefined
}
object ParamsResourceV1Token {
  
  inline def apply(): ParamsResourceV1Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Token]
  }
  
  extension [Self <: ParamsResourceV1Token](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleIdentityStsV1ExchangeTokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
