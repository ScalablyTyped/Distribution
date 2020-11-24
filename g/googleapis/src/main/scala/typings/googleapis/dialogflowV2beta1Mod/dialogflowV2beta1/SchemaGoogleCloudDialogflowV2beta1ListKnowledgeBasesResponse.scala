package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KnowledgeBases.ListKnowledgeBases.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse extends js.Object {
  
  /**
    * The list of knowledge bases.
    */
  var knowledgeBases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] (val x: Self) extends AnyVal {
    
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
    def setKnowledgeBasesVarargs(value: SchemaGoogleCloudDialogflowV2beta1KnowledgeBase*): Self = this.set("knowledgeBases", js.Array(value :_*))
    
    @scala.inline
    def setKnowledgeBases(value: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]): Self = this.set("knowledgeBases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnowledgeBases: Self = this.set("knowledgeBases", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
