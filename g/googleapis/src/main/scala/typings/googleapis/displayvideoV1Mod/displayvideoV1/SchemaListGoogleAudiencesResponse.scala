package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGoogleAudiencesResponse extends StObject {
  
  /**
    * The list of Google audiences. This list will be absent if empty.
    */
  var googleAudiences: js.UndefOr[js.Array[SchemaGoogleAudience]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListGoogleAudiences` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGoogleAudiencesResponse {
  
  inline def apply(): SchemaListGoogleAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGoogleAudiencesResponse]
  }
  
  extension [Self <: SchemaListGoogleAudiencesResponse](x: Self) {
    
    inline def setGoogleAudiences(value: js.Array[SchemaGoogleAudience]): Self = StObject.set(x, "googleAudiences", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudiencesUndefined: Self = StObject.set(x, "googleAudiences", js.undefined)
    
    inline def setGoogleAudiencesVarargs(value: SchemaGoogleAudience*): Self = StObject.set(x, "googleAudiences", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
