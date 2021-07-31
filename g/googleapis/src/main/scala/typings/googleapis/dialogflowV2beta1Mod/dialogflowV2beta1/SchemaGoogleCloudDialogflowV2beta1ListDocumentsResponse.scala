package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for Documents.ListDocuments.
  */
trait SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse extends StObject {
  
  /**
    * The list of documents.
    */
  var documents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Document]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Document]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Document*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
