package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentLabel extends StObject {
  
  /**
    * Label is generated AutoML model. This field stores the full resource name of the AutoML model. Format: `projects/{project-id\}/locations/{location-id\}/models/{model-id\}`
    */
  var automlModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Confidence score between 0 and 1 for label assignment.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of the label. When the label is generated from AutoML Text Classification model, this field represents the name of the category.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentLabel {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentLabel]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentLabel](x: Self) {
    
    inline def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
    
    inline def setAutomlModelNull: Self = StObject.set(x, "automlModel", null)
    
    inline def setAutomlModelUndefined: Self = StObject.set(x, "automlModel", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
