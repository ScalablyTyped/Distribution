package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Summary of a single transformation. Only one of &#39;transformation&#39;,
  * &#39;field_transformation&#39;, or &#39;record_suppress&#39; will be set.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransformationSummary extends StObject {
  
  /**
    * Set if the transformation was limited to a specific FieldId.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  
  /**
    * The field transformation that was applied. If multiple field
    * transformations are requested for a single field, this list will contain
    * all of them; otherwise, only one is supplied.
    */
  var fieldTransformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]] = js.native
  
  /**
    * Set if the transformation was limited to a specific InfoType.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  
  /**
    * The specific suppression option these stats apply to.
    */
  var recordSuppress: js.UndefOr[SchemaGooglePrivacyDlpV2RecordSuppression] = js.native
  
  var results: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2SummaryResult]] = js.native
  
  /**
    * The specific transformation these stats apply to.
    */
  var transformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
  
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2TransformationSummary {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TransformationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationSummary]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TransformationSummaryMutableBuilder[Self <: SchemaGooglePrivacyDlpV2TransformationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformations(value: js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]): Self = StObject.set(x, "fieldTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformationsUndefined: Self = StObject.set(x, "fieldTransformations", js.undefined)
    
    @scala.inline
    def setFieldTransformationsVarargs(value: SchemaGooglePrivacyDlpV2FieldTransformation*): Self = StObject.set(x, "fieldTransformations", js.Array(value :_*))
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setRecordSuppress(value: SchemaGooglePrivacyDlpV2RecordSuppression): Self = StObject.set(x, "recordSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordSuppressUndefined: Self = StObject.set(x, "recordSuppress", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaGooglePrivacyDlpV2SummaryResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaGooglePrivacyDlpV2SummaryResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
    
    @scala.inline
    def setTransformedBytes(value: String): Self = StObject.set(x, "transformedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformedBytesUndefined: Self = StObject.set(x, "transformedBytes", js.undefined)
  }
}
