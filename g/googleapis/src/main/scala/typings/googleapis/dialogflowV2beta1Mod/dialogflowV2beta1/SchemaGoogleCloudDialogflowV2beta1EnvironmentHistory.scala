package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1EnvironmentHistory extends StObject {
  
  /**
    * Output only. The list of agent environments. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var entries: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry]] = js.undefined
  
  /**
    * Output only. Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the environment this history is for. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/`
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1EnvironmentHistory {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1EnvironmentHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EnvironmentHistory]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1EnvironmentHistory](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
