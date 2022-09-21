package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The views that match the request.
    */
  var views: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1View]] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setViews(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1View]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1View*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
