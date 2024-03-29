package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ListEnvironmentsResponse extends StObject {
  
  /**
    * The list of environments. There will be a maximum number of items returned based on the page_size field in the request. The list may in some cases be empty or contain fewer entries than page_size even if this isn't the last page.
    */
  var environments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3Environment]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ListEnvironmentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ListEnvironmentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ListEnvironmentsResponse](x: Self) {
    
    inline def setEnvironments(value: js.Array[SchemaGoogleCloudDialogflowCxV3Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: SchemaGoogleCloudDialogflowCxV3Environment*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
