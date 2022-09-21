package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1InputConfig extends StObject {
  
  /**
    * Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
    */
  var annotationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob.
    */
  var bigquerySource: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1BigQuerySource] = js.undefined
  
  /**
    * Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs classification.
    */
  var classificationMetadata: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ClassificationMetadata] = js.undefined
  
  /**
    * Required. Data type must be specifed when user tries to import data.
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source located in Cloud Storage.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1GcsSource] = js.undefined
  
  /**
    * Required for text import, as language code must be specified.
    */
  var textMetadata: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextMetadata] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1InputConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1InputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1InputConfig](x: Self) {
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeNull: Self = StObject.set(x, "annotationType", null)
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setBigquerySource(value: SchemaGoogleCloudDatalabelingV1beta1BigQuerySource): Self = StObject.set(x, "bigquerySource", value.asInstanceOf[js.Any])
    
    inline def setBigquerySourceUndefined: Self = StObject.set(x, "bigquerySource", js.undefined)
    
    inline def setClassificationMetadata(value: SchemaGoogleCloudDatalabelingV1beta1ClassificationMetadata): Self = StObject.set(x, "classificationMetadata", value.asInstanceOf[js.Any])
    
    inline def setClassificationMetadataUndefined: Self = StObject.set(x, "classificationMetadata", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudDatalabelingV1beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setTextMetadata(value: SchemaGoogleCloudDatalabelingV1beta1TextMetadata): Self = StObject.set(x, "textMetadata", value.asInstanceOf[js.Any])
    
    inline def setTextMetadataUndefined: Self = StObject.set(x, "textMetadata", js.undefined)
  }
}
