package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ListEnvironmentsResponse extends StObject {
  
  /** The list of agent environments. There will be a maximum number of items returned based on the page_size field in the request. */
  var environments: js.UndefOr[js.Array[GoogleCloudDialogflowV2Environment]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2ListEnvironmentsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ListEnvironmentsResponseMutableBuilder[Self <: GoogleCloudDialogflowV2ListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: js.Array[GoogleCloudDialogflowV2Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    @scala.inline
    def setEnvironmentsVarargs(value: GoogleCloudDialogflowV2Environment*): Self = StObject.set(x, "environments", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
