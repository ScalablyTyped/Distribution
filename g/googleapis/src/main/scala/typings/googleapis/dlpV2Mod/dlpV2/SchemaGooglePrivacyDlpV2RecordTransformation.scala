package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2RecordTransformation extends StObject {
  
  /**
    * Findings container modification timestamp, if applicable.
    */
  var containerTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container version, if available ("generation" for Cloud Storage).
    */
  var containerVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For record transformations, provide a field.
    */
  var fieldId: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordTransformation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RecordTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordTransformation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RecordTransformation](x: Self) {
    
    inline def setContainerTimestamp(value: String): Self = StObject.set(x, "containerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setContainerTimestampNull: Self = StObject.set(x, "containerTimestamp", null)
    
    inline def setContainerTimestampUndefined: Self = StObject.set(x, "containerTimestamp", js.undefined)
    
    inline def setContainerVersion(value: String): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionNull: Self = StObject.set(x, "containerVersion", null)
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    inline def setFieldId(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
  }
}
