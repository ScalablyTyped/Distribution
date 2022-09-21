package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpeechRecognize
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRecognizeRequest] = js.undefined
}
object ParamsResourceSpeechRecognize {
  
  inline def apply(): ParamsResourceSpeechRecognize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpeechRecognize]
  }
  
  extension [Self <: ParamsResourceSpeechRecognize](x: Self) {
    
    inline def setRequestBody(value: SchemaRecognizeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
