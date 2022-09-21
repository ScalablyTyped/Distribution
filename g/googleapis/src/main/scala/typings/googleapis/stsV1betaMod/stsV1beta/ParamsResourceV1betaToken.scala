package typings.googleapis.stsV1betaMod.stsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1betaToken
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleIdentityStsV1betaExchangeTokenRequest] = js.undefined
}
object ParamsResourceV1betaToken {
  
  inline def apply(): ParamsResourceV1betaToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1betaToken]
  }
  
  extension [Self <: ParamsResourceV1betaToken](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleIdentityStsV1betaExchangeTokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
