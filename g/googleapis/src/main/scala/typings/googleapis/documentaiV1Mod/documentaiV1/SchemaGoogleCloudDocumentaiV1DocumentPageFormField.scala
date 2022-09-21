package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentPageFormField extends StObject {
  
  /**
    * Created for Labeling UI to export key text. If corrections were made to the text identified by the `field_name.text_anchor`, this field will contain the correction.
    */
  var correctedKeyText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Created for Labeling UI to export value text. If corrections were made to the text identified by the `field_value.text_anchor`, this field will contain the correction.
    */
  var correctedValueText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Layout for the FormField name. e.g. `Address`, `Email`, `Grand total`, `Phone number`, etc.
    */
  var fieldName: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageLayout] = js.undefined
  
  /**
    * Layout for the FormField value.
    */
  var fieldValue: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageLayout] = js.undefined
  
  /**
    * A list of detected languages for name together with confidence.
    */
  var nameDetectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * The history of this annotation.
    */
  var provenance: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentProvenance] = js.undefined
  
  /**
    * A list of detected languages for value together with confidence.
    */
  var valueDetectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * If the value is non-textual, this field represents the type. Current valid values are: - blank (this indicates the field_value is normal text) - "unfilled_checkbox" - "filled_checkbox"
    */
  var valueType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentPageFormField {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentPageFormField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentPageFormField]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentPageFormField](x: Self) {
    
    inline def setCorrectedKeyText(value: String): Self = StObject.set(x, "correctedKeyText", value.asInstanceOf[js.Any])
    
    inline def setCorrectedKeyTextNull: Self = StObject.set(x, "correctedKeyText", null)
    
    inline def setCorrectedKeyTextUndefined: Self = StObject.set(x, "correctedKeyText", js.undefined)
    
    inline def setCorrectedValueText(value: String): Self = StObject.set(x, "correctedValueText", value.asInstanceOf[js.Any])
    
    inline def setCorrectedValueTextNull: Self = StObject.set(x, "correctedValueText", null)
    
    inline def setCorrectedValueTextUndefined: Self = StObject.set(x, "correctedValueText", js.undefined)
    
    inline def setFieldName(value: SchemaGoogleCloudDocumentaiV1DocumentPageLayout): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setFieldValue(value: SchemaGoogleCloudDocumentaiV1DocumentPageLayout): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
    
    inline def setFieldValueUndefined: Self = StObject.set(x, "fieldValue", js.undefined)
    
    inline def setNameDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]): Self = StObject.set(x, "nameDetectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setNameDetectedLanguagesUndefined: Self = StObject.set(x, "nameDetectedLanguages", js.undefined)
    
    inline def setNameDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage*): Self = StObject.set(x, "nameDetectedLanguages", js.Array(value*))
    
    inline def setProvenance(value: SchemaGoogleCloudDocumentaiV1DocumentProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setValueDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]): Self = StObject.set(x, "valueDetectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setValueDetectedLanguagesUndefined: Self = StObject.set(x, "valueDetectedLanguages", js.undefined)
    
    inline def setValueDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage*): Self = StObject.set(x, "valueDetectedLanguages", js.Array(value*))
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
