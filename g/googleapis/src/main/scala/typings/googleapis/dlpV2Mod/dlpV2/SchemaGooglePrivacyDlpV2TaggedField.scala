package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TaggedField extends StObject {
  
  /**
    * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
    */
  var customTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Identifies the column.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
  
  /**
    * If no semantic tag is indicated, we infer the statistical model from the distribution of values in the input data
    */
  var inferred: js.UndefOr[SchemaGoogleProtobufEmpty] = js.undefined
  
  /**
    * A column can be tagged with a InfoType to use the relevant public dataset as a statistical model of population, if available. We currently support US ZIP codes, region codes, ages and genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.undefined
}
object SchemaGooglePrivacyDlpV2TaggedField {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TaggedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TaggedField]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TaggedField](x: Self) {
    
    inline def setCustomTag(value: String): Self = StObject.set(x, "customTag", value.asInstanceOf[js.Any])
    
    inline def setCustomTagNull: Self = StObject.set(x, "customTag", null)
    
    inline def setCustomTagUndefined: Self = StObject.set(x, "customTag", js.undefined)
    
    inline def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setInferred(value: SchemaGoogleProtobufEmpty): Self = StObject.set(x, "inferred", value.asInstanceOf[js.Any])
    
    inline def setInferredUndefined: Self = StObject.set(x, "inferred", js.undefined)
    
    inline def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
  }
}
