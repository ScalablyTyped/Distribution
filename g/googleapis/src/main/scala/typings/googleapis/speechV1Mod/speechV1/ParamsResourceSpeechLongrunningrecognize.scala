package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpeechLongrunningrecognize
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLongRunningRecognizeRequest] = js.undefined
}
object ParamsResourceSpeechLongrunningrecognize {
  
  inline def apply(): ParamsResourceSpeechLongrunningrecognize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpeechLongrunningrecognize]
  }
  
  extension [Self <: ParamsResourceSpeechLongrunningrecognize](x: Self) {
    
    inline def setRequestBody(value: SchemaLongRunningRecognizeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
