package typings.googleapis.stsV1Mod.stsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Introspect
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleIdentityStsV1IntrospectTokenRequest] = js.undefined
}
object ParamsResourceV1Introspect {
  
  inline def apply(): ParamsResourceV1Introspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Introspect]
  }
  
  extension [Self <: ParamsResourceV1Introspect](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleIdentityStsV1IntrospectTokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
