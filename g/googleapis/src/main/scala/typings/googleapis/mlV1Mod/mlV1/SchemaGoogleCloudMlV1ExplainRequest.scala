package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ExplainRequest extends StObject {
  
  /**
    * Required. The explanation request body.
    */
  var httpBody: js.UndefOr[SchemaGoogleApiHttpBody] = js.undefined
}
object SchemaGoogleCloudMlV1ExplainRequest {
  
  inline def apply(): SchemaGoogleCloudMlV1ExplainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ExplainRequest]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ExplainRequest](x: Self) {
    
    inline def setHttpBody(value: SchemaGoogleApiHttpBody): Self = StObject.set(x, "httpBody", value.asInstanceOf[js.Any])
    
    inline def setHttpBodyUndefined: Self = StObject.set(x, "httpBody", js.undefined)
  }
}
