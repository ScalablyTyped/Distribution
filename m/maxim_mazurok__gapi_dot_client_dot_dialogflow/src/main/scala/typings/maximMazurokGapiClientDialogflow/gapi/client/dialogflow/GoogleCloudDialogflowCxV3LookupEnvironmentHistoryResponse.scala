package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3LookupEnvironmentHistoryResponse extends StObject {
  
  /** Represents a list of snapshots for an environment. Time of the snapshots is stored in `update_time`. */
  var environments: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Environment]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3LookupEnvironmentHistoryResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3LookupEnvironmentHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3LookupEnvironmentHistoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3LookupEnvironmentHistoryResponse] (val x: Self) extends AnyVal {
    
    inline def setEnvironments(value: js.Array[GoogleCloudDialogflowCxV3Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: GoogleCloudDialogflowCxV3Environment*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
