package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document resource.  Note: resource
  * `projects.agent.knowledgeBases.documents` is deprecated, please use
  * `projects.knowledgeBases.documents` instead.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1Document extends js.Object {
  
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process
    * of being deprecated, please use raw_content instead.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The URI where the file content is located.  For documents stored in
    * Google Cloud Storage, these URIs must have the form
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.  NOTE: External URLs must
    * correspond to public webpages, i.e., they must be indexed by Google
    * Search. In particular, URLs for showing documents in Google Cloud Storage
    * (i.e. the URL in your browser) are not supported. Instead use the `gs://`
    * format URI described above.
    */
  var contentUri: js.UndefOr[String] = js.native
  
  /**
    * Required. The display name of the document. The name must be 1024 bytes
    * or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Required. The knowledge type of document content.
    */
  var knowledgeTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The MIME type of this document.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * The document resource name. The name must be empty when creating a
    * document. Format: `projects/&lt;Project
    * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document
    * ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types.
    */
  var rawContent: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1Document {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Document]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1DocumentOps[Self <: SchemaGoogleCloudDialogflowV2beta1Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentUri(value: String): Self = this.set("contentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUri: Self = this.set("contentUri", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setKnowledgeTypesVarargs(value: String*): Self = this.set("knowledgeTypes", js.Array(value :_*))
    
    @scala.inline
    def setKnowledgeTypes(value: js.Array[String]): Self = this.set("knowledgeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnowledgeTypes: Self = this.set("knowledgeTypes", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRawContent(value: String): Self = this.set("rawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawContent: Self = this.set("rawContent", js.undefined)
  }
}
