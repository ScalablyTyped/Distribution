package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionResponse extends StObject {
  
  /**
    * The resource name of the created evaluation.
    */
  var evaluation: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionResponse](x: Self) {
    
    inline def setEvaluation(value: String): Self = StObject.set(x, "evaluation", value.asInstanceOf[js.Any])
    
    inline def setEvaluationNull: Self = StObject.set(x, "evaluation", null)
    
    inline def setEvaluationUndefined: Self = StObject.set(x, "evaluation", js.undefined)
  }
}
