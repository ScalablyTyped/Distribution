package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2Participant extends StObject {
  
  /**
    * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ``` documents_metadata_filters { key: "market" value: "US,CA" \} documents_metadata_filters { key: "user" value: "agent" \} ```
    */
  var documentsMetadataFilters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Label applied to streams representing this participant in SIPREC XML metadata and SDP. This is used to assign transcriptions from that media stream to this participant. This field can be updated.
    */
  var sipRecordingMediaLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2Participant {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2Participant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Participant]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2Participant](x: Self) {
    
    inline def setDocumentsMetadataFilters(value: StringDictionary[String]): Self = StObject.set(x, "documentsMetadataFilters", value.asInstanceOf[js.Any])
    
    inline def setDocumentsMetadataFiltersNull: Self = StObject.set(x, "documentsMetadataFilters", null)
    
    inline def setDocumentsMetadataFiltersUndefined: Self = StObject.set(x, "documentsMetadataFilters", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSipRecordingMediaLabel(value: String): Self = StObject.set(x, "sipRecordingMediaLabel", value.asInstanceOf[js.Any])
    
    inline def setSipRecordingMediaLabelNull: Self = StObject.set(x, "sipRecordingMediaLabel", null)
    
    inline def setSipRecordingMediaLabelUndefined: Self = StObject.set(x, "sipRecordingMediaLabel", js.undefined)
  }
}
