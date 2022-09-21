package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2AssistQueryParameters extends StObject {
  
  /**
    * Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ``` documents_metadata_filters { key: "market" value: "US,CA" \} documents_metadata_filters { key: "user" value: "agent" \} ```
    */
  var documentsMetadataFilters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2AssistQueryParameters {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2AssistQueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2AssistQueryParameters]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2AssistQueryParameters](x: Self) {
    
    inline def setDocumentsMetadataFilters(value: StringDictionary[String]): Self = StObject.set(x, "documentsMetadataFilters", value.asInstanceOf[js.Any])
    
    inline def setDocumentsMetadataFiltersNull: Self = StObject.set(x, "documentsMetadataFilters", null)
    
    inline def setDocumentsMetadataFiltersUndefined: Self = StObject.set(x, "documentsMetadataFilters", js.undefined)
  }
}
