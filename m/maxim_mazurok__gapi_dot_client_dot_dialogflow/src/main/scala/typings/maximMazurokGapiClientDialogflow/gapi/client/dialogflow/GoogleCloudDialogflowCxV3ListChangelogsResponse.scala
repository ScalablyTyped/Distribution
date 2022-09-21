package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListChangelogsResponse extends StObject {
  
  /** The list of changelogs. There will be a maximum number of items returned based on the page_size field in the request. The changelogs will be ordered by timestamp. */
  var changelogs: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Changelog]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ListChangelogsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListChangelogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListChangelogsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListChangelogsResponse](x: Self) {
    
    inline def setChangelogs(value: js.Array[GoogleCloudDialogflowCxV3Changelog]): Self = StObject.set(x, "changelogs", value.asInstanceOf[js.Any])
    
    inline def setChangelogsUndefined: Self = StObject.set(x, "changelogs", js.undefined)
    
    inline def setChangelogsVarargs(value: GoogleCloudDialogflowCxV3Changelog*): Self = StObject.set(x, "changelogs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
