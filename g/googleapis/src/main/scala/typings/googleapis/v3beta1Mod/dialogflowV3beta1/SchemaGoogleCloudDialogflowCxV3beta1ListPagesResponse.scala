package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ListPagesResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of pages. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var pages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1Page]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ListPagesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ListPagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ListPagesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ListPagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPages(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1Page*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
