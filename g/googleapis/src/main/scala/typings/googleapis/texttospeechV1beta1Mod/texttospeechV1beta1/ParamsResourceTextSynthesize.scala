package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTextSynthesize
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSynthesizeSpeechRequest] = js.undefined
}
object ParamsResourceTextSynthesize {
  
  inline def apply(): ParamsResourceTextSynthesize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTextSynthesize]
  }
  
  extension [Self <: ParamsResourceTextSynthesize](x: Self) {
    
    inline def setRequestBody(value: SchemaSynthesizeSpeechRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
