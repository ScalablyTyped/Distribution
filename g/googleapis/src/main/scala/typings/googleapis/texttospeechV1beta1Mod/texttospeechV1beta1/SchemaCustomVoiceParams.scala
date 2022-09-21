package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomVoiceParams extends StObject {
  
  /**
    * Required. The name of the AutoML model that synthesizes the custom voice.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The usage of the synthesized audio to be reported.
    */
  var reportedUsage: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomVoiceParams {
  
  inline def apply(): SchemaCustomVoiceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomVoiceParams]
  }
  
  extension [Self <: SchemaCustomVoiceParams](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReportedUsage(value: String): Self = StObject.set(x, "reportedUsage", value.asInstanceOf[js.Any])
    
    inline def setReportedUsageNull: Self = StObject.set(x, "reportedUsage", null)
    
    inline def setReportedUsageUndefined: Self = StObject.set(x, "reportedUsage", js.undefined)
  }
}
