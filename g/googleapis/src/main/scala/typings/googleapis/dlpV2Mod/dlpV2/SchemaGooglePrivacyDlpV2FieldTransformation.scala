package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The transformation to apply to the field.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FieldTransformation extends js.Object {
  
  /**
    * Only apply the transformation if the condition evaluates to true for the
    * given `RecordCondition`. The conditions are allowed to reference fields
    * that are not used in the actual transformation. [optional]  Example Use
    * Cases:  - Apply a different bucket transformation to an age column if the
    * zip code column for the same record is within a specific range. - Redact
    * a field if the date of birth field is greater than 85.
    */
  var condition: js.UndefOr[SchemaGooglePrivacyDlpV2RecordCondition] = js.native
  
  /**
    * Input field(s) to apply the transformation to. [required]
    */
  var fields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  
  /**
    * Treat the contents of the field as free text, and selectively transform
    * content that matches an `InfoType`.
    */
  var infoTypeTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2InfoTypeTransformations] = js.native
  
  /**
    * Apply the transformation to the entire field.
    */
  var primitiveTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
}
object SchemaGooglePrivacyDlpV2FieldTransformation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FieldTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FieldTransformation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FieldTransformationOps[Self <: SchemaGooglePrivacyDlpV2FieldTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCondition(value: SchemaGooglePrivacyDlpV2RecordCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setInfoTypeTransformations(value: SchemaGooglePrivacyDlpV2InfoTypeTransformations): Self = this.set("infoTypeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypeTransformations: Self = this.set("infoTypeTransformations", js.undefined)
    
    @scala.inline
    def setPrimitiveTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = this.set("primitiveTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveTransformation: Self = this.set("primitiveTransformation", js.undefined)
  }
}
