package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type of transformation that is applied over structured data such as a
  * table.
  */
trait SchemaGooglePrivacyDlpV2RecordTransformations extends StObject {
  
  /**
    * Transform the record by applying various field transformations.
    */
  var fieldTransformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]] = js.undefined
  
  /**
    * Configuration defining which records get suppressed entirely. Records
    * that match any suppression rule are omitted from the output [optional].
    */
  var recordSuppressions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordTransformations {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordTransformations]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordTransformationsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RecordTransformations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldTransformations(value: js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]): Self = StObject.set(x, "fieldTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformationsUndefined: Self = StObject.set(x, "fieldTransformations", js.undefined)
    
    @scala.inline
    def setFieldTransformationsVarargs(value: SchemaGooglePrivacyDlpV2FieldTransformation*): Self = StObject.set(x, "fieldTransformations", js.Array(value :_*))
    
    @scala.inline
    def setRecordSuppressions(value: js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]): Self = StObject.set(x, "recordSuppressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordSuppressionsUndefined: Self = StObject.set(x, "recordSuppressions", js.undefined)
    
    @scala.inline
    def setRecordSuppressionsVarargs(value: SchemaGooglePrivacyDlpV2RecordSuppression*): Self = StObject.set(x, "recordSuppressions", js.Array(value :_*))
  }
}
