package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ListSessionEntityTypesResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of session entity types. There will be a maximum number of items returned based on the page_size field in the request. */
  var sessionEntityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2SessionEntityType]] = js.native
}
object GoogleCloudDialogflowV2ListSessionEntityTypesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ListSessionEntityTypesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ListSessionEntityTypesResponseMutableBuilder[Self <: GoogleCloudDialogflowV2ListSessionEntityTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSessionEntityTypes(value: js.Array[GoogleCloudDialogflowV2SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    @scala.inline
    def setSessionEntityTypesVarargs(value: GoogleCloudDialogflowV2SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
  }
}
