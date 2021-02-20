package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGooglePrivacyDlpV2TaggedField extends StObject {
  
  /**
    * A column can be tagged with a custom tag. In this case, the user must
    * indicate an auxiliary table that contains statistical information on the
    * possible values of this column (below).
    */
  var customTag: js.UndefOr[String] = js.native
  
  /**
    * Identifies the column. [required]
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  
  /**
    * If no semantic tag is indicated, we infer the statistical model from the
    * distribution of values in the input data
    */
  var inferred: js.UndefOr[SchemaGoogleProtobufEmpty] = js.native
  
  /**
    * A column can be tagged with a InfoType to use the relevant public dataset
    * as a statistical model of population, if available. We currently support
    * US ZIP codes, region codes, ages and genders. To programmatically obtain
    * the list of supported InfoTypes, use ListInfoTypes with the
    * supported_by=RISK_ANALYSIS filter.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}
object SchemaGooglePrivacyDlpV2TaggedField {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TaggedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TaggedField]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TaggedFieldMutableBuilder[Self <: SchemaGooglePrivacyDlpV2TaggedField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomTag(value: String): Self = StObject.set(x, "customTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTagUndefined: Self = StObject.set(x, "customTag", js.undefined)
    
    @scala.inline
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setInferred(value: SchemaGoogleProtobufEmpty): Self = StObject.set(x, "inferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferredUndefined: Self = StObject.set(x, "inferred", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
  }
}
