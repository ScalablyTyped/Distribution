package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ListVersionsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of agent versions. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Version]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ListVersionsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListVersionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ListVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaGoogleCloudDialogflowV2Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaGoogleCloudDialogflowV2Version*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
