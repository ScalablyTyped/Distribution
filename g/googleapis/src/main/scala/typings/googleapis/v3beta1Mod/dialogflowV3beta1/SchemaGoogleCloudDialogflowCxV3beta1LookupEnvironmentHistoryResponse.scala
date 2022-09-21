package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1LookupEnvironmentHistoryResponse extends StObject {
  
  /**
    * Represents a list of snapshots for an environment. Time of the snapshots is stored in `update_time`.
    */
  var environments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1Environment]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1LookupEnvironmentHistoryResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1LookupEnvironmentHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1LookupEnvironmentHistoryResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1LookupEnvironmentHistoryResponse](x: Self) {
    
    inline def setEnvironments(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1Environment*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
