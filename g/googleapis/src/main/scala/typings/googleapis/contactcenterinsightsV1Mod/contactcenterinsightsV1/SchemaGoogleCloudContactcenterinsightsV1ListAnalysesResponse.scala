package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ListAnalysesResponse extends StObject {
  
  /**
    * The analyses that match the request.
    */
  var analyses: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1Analysis]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ListAnalysesResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ListAnalysesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ListAnalysesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ListAnalysesResponse](x: Self) {
    
    inline def setAnalyses(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1Analysis]): Self = StObject.set(x, "analyses", value.asInstanceOf[js.Any])
    
    inline def setAnalysesUndefined: Self = StObject.set(x, "analyses", js.undefined)
    
    inline def setAnalysesVarargs(value: SchemaGoogleCloudContactcenterinsightsV1Analysis*): Self = StObject.set(x, "analyses", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
