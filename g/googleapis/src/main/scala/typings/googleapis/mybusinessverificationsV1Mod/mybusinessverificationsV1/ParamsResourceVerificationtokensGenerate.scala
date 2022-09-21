package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVerificationtokensGenerate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateVerificationTokenRequest] = js.undefined
}
object ParamsResourceVerificationtokensGenerate {
  
  inline def apply(): ParamsResourceVerificationtokensGenerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVerificationtokensGenerate]
  }
  
  extension [Self <: ParamsResourceVerificationtokensGenerate](x: Self) {
    
    inline def setRequestBody(value: SchemaGenerateVerificationTokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
