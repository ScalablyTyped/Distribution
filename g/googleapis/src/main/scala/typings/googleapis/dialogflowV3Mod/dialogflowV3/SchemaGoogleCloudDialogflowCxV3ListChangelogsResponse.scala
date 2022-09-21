package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ListChangelogsResponse extends StObject {
  
  /**
    * The list of changelogs. There will be a maximum number of items returned based on the page_size field in the request. The changelogs will be ordered by timestamp.
    */
  var changelogs: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3Changelog]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ListChangelogsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ListChangelogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ListChangelogsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ListChangelogsResponse](x: Self) {
    
    inline def setChangelogs(value: js.Array[SchemaGoogleCloudDialogflowCxV3Changelog]): Self = StObject.set(x, "changelogs", value.asInstanceOf[js.Any])
    
    inline def setChangelogsUndefined: Self = StObject.set(x, "changelogs", js.undefined)
    
    inline def setChangelogsVarargs(value: SchemaGoogleCloudDialogflowCxV3Changelog*): Self = StObject.set(x, "changelogs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
