package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1Document extends StObject {
  
  /**
    * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process of being deprecated, please use raw_content instead.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
    */
  var contentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don't try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISSION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
    */
  var enableAutoReload: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The knowledge type of document content.
    */
  var knowledgeTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The time and status of the latest reload. This reload may have been triggered automatically or manually and may not have succeeded.
    */
  var latestReloadStatus: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1DocumentReloadStatus] = js.undefined
  
  /**
    * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document's title, an external URL distinct from the document's content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The MIME type of this document.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
    */
  var rawContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the document.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1Document {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Document]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1Document](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContentUriNull: Self = StObject.set(x, "contentUri", null)
    
    inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableAutoReload(value: Boolean): Self = StObject.set(x, "enableAutoReload", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoReloadNull: Self = StObject.set(x, "enableAutoReload", null)
    
    inline def setEnableAutoReloadUndefined: Self = StObject.set(x, "enableAutoReload", js.undefined)
    
    inline def setKnowledgeTypes(value: js.Array[String]): Self = StObject.set(x, "knowledgeTypes", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeTypesNull: Self = StObject.set(x, "knowledgeTypes", null)
    
    inline def setKnowledgeTypesUndefined: Self = StObject.set(x, "knowledgeTypes", js.undefined)
    
    inline def setKnowledgeTypesVarargs(value: String*): Self = StObject.set(x, "knowledgeTypes", js.Array(value*))
    
    inline def setLatestReloadStatus(value: SchemaGoogleCloudDialogflowV2beta1DocumentReloadStatus): Self = StObject.set(x, "latestReloadStatus", value.asInstanceOf[js.Any])
    
    inline def setLatestReloadStatusUndefined: Self = StObject.set(x, "latestReloadStatus", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRawContent(value: String): Self = StObject.set(x, "rawContent", value.asInstanceOf[js.Any])
    
    inline def setRawContentNull: Self = StObject.set(x, "rawContent", null)
    
    inline def setRawContentUndefined: Self = StObject.set(x, "rawContent", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
