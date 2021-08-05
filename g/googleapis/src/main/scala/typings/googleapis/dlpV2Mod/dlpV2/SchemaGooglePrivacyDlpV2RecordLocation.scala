package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of a finding within a row or record.
  */
trait SchemaGooglePrivacyDlpV2RecordLocation extends StObject {
  
  /**
    * Field id of the field containing the finding.
    */
  var fieldId: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
  
  /**
    * Key of the finding.
    */
  var recordKey: js.UndefOr[SchemaGooglePrivacyDlpV2RecordKey] = js.undefined
  
  /**
    * Location within a `ContentItem.Table`.
    */
  var tableLocation: js.UndefOr[SchemaGooglePrivacyDlpV2TableLocation] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RecordLocation](x: Self) {
    
    inline def setFieldId(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    inline def setRecordKey(value: SchemaGooglePrivacyDlpV2RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyUndefined: Self = StObject.set(x, "recordKey", js.undefined)
    
    inline def setTableLocation(value: SchemaGooglePrivacyDlpV2TableLocation): Self = StObject.set(x, "tableLocation", value.asInstanceOf[js.Any])
    
    inline def setTableLocationUndefined: Self = StObject.set(x, "tableLocation", js.undefined)
  }
}
