package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2RecordTransformations extends StObject {
  
  /**
    * Transform the record by applying various field transformations.
    */
  var fieldTransformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]] = js.undefined
  
  /**
    * Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
    */
  var recordSuppressions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordTransformations {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RecordTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordTransformations]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RecordTransformations](x: Self) {
    
    inline def setFieldTransformations(value: js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]): Self = StObject.set(x, "fieldTransformations", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformationsUndefined: Self = StObject.set(x, "fieldTransformations", js.undefined)
    
    inline def setFieldTransformationsVarargs(value: SchemaGooglePrivacyDlpV2FieldTransformation*): Self = StObject.set(x, "fieldTransformations", js.Array(value*))
    
    inline def setRecordSuppressions(value: js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]): Self = StObject.set(x, "recordSuppressions", value.asInstanceOf[js.Any])
    
    inline def setRecordSuppressionsUndefined: Self = StObject.set(x, "recordSuppressions", js.undefined)
    
    inline def setRecordSuppressionsVarargs(value: SchemaGooglePrivacyDlpV2RecordSuppression*): Self = StObject.set(x, "recordSuppressions", js.Array(value*))
  }
}
