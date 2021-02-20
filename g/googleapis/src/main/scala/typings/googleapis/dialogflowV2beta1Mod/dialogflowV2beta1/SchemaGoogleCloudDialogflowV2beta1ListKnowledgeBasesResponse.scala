package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KnowledgeBases.ListKnowledgeBases.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse extends StObject {
  
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
  implicit class SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnowledgeBases(value: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]): Self = StObject.set(x, "knowledgeBases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeBasesUndefined: Self = StObject.set(x, "knowledgeBases", js.undefined)
    
    @scala.inline
    def setKnowledgeBasesVarargs(value: SchemaGoogleCloudDialogflowV2beta1KnowledgeBase*): Self = StObject.set(x, "knowledgeBases", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
