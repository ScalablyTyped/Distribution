package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document resource.  Note: resource
  * `projects.agent.knowledgeBases.documents` is deprecated, please use
  * `projects.knowledgeBases.documents` instead.
  */
trait SchemaGoogleCloudDialogflowV2beta1Document extends StObject {
  
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process
    * of being deprecated, please use raw_content instead.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The URI where the file content is located.  For documents stored in
    * Google Cloud Storage, these URIs must have the form
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.  NOTE: External URLs must
    * correspond to public webpages, i.e., they must be indexed by Google
    * Search. In particular, URLs for showing documents in Google Cloud Storage
    * (i.e. the URL in your browser) are not supported. Instead use the `gs://`
    * format URI described above.
    */
  var contentUri: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The display name of the document. The name must be 1024 bytes
    * or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The knowledge type of document content.
    */
  var knowledgeTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The MIME type of this document.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The document resource name. The name must be empty when creating a
    * document. Format: `projects/&lt;Project
    * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document
    * ID&gt;`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types.
    */
  var rawContent: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1Document {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Document]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1Document](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setKnowledgeTypes(value: js.Array[String]): Self = StObject.set(x, "knowledgeTypes", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeTypesUndefined: Self = StObject.set(x, "knowledgeTypes", js.undefined)
    
    inline def setKnowledgeTypesVarargs(value: String*): Self = StObject.set(x, "knowledgeTypes", js.Array(value :_*))
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRawContent(value: String): Self = StObject.set(x, "rawContent", value.asInstanceOf[js.Any])
    
    inline def setRawContentUndefined: Self = StObject.set(x, "rawContent", js.undefined)
  }
}
