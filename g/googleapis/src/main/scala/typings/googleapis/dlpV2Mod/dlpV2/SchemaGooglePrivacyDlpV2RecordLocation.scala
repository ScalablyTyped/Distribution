package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of a finding within a row or record.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordLocation extends StObject {
  
  /**
    * Field id of the field containing the finding.
    */
  var fieldId: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  
  /**
    * Key of the finding.
    */
  var recordKey: js.UndefOr[SchemaGooglePrivacyDlpV2RecordKey] = js.native
  
  /**
    * Location within a `ContentItem.Table`.
    */
  var tableLocation: js.UndefOr[SchemaGooglePrivacyDlpV2TableLocation] = js.native
}
object SchemaGooglePrivacyDlpV2RecordLocation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordLocation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordLocationMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RecordLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldId(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    @scala.inline
    def setRecordKey(value: SchemaGooglePrivacyDlpV2RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKeyUndefined: Self = StObject.set(x, "recordKey", js.undefined)
    
    @scala.inline
    def setTableLocation(value: SchemaGooglePrivacyDlpV2TableLocation): Self = StObject.set(x, "tableLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableLocationUndefined: Self = StObject.set(x, "tableLocation", js.undefined)
  }
}
