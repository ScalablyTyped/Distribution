package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDetectionsDetect
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDetectLanguageRequest] = js.undefined
}
object ParamsResourceDetectionsDetect {
  
  inline def apply(): ParamsResourceDetectionsDetect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDetectionsDetect]
  }
  
  extension [Self <: ParamsResourceDetectionsDetect](x: Self) {
    
    inline def setRequestBody(value: SchemaDetectLanguageRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
