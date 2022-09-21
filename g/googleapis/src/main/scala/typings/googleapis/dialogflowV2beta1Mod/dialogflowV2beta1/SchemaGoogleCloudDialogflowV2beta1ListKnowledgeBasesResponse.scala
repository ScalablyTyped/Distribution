package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse extends StObject {
  
  /**
    * The list of knowledge bases.
    */
  var knowledgeBases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse](x: Self) {
    
    inline def setKnowledgeBases(value: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]): Self = StObject.set(x, "knowledgeBases", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBasesUndefined: Self = StObject.set(x, "knowledgeBases", js.undefined)
    
    inline def setKnowledgeBasesVarargs(value: SchemaGoogleCloudDialogflowV2beta1KnowledgeBase*): Self = StObject.set(x, "knowledgeBases", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
