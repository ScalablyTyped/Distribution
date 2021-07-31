package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ListEntityTypesResponse extends StObject {
  
  /** The list of agent entity types. There will be a maximum number of items returned based on the page_size field in the request. */
  var entityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2EntityType]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ListEntityTypesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ListEntityTypesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ListEntityTypesResponseMutableBuilder[Self <: GoogleCloudDialogflowV2ListEntityTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[GoogleCloudDialogflowV2EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: GoogleCloudDialogflowV2EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
