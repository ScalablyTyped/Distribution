package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTranslationsTranslate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTranslateTextRequest] = js.undefined
}
object ParamsResourceTranslationsTranslate {
  
  inline def apply(): ParamsResourceTranslationsTranslate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTranslationsTranslate]
  }
  
  extension [Self <: ParamsResourceTranslationsTranslate](x: Self) {
    
    inline def setRequestBody(value: SchemaTranslateTextRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
