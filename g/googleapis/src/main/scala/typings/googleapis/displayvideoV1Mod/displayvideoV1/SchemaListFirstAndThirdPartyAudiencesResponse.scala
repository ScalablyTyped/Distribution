package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFirstAndThirdPartyAudiencesResponse extends StObject {
  
  /**
    * The list of first and third party audiences. Audience size properties will not be included. This list will be absent if empty.
    */
  var firstAndThirdPartyAudiences: js.UndefOr[js.Array[SchemaFirstAndThirdPartyAudience]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListFirstAndThirdPartyAudiences` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListFirstAndThirdPartyAudiencesResponse {
  
  inline def apply(): SchemaListFirstAndThirdPartyAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFirstAndThirdPartyAudiencesResponse]
  }
  
  extension [Self <: SchemaListFirstAndThirdPartyAudiencesResponse](x: Self) {
    
    inline def setFirstAndThirdPartyAudiences(value: js.Array[SchemaFirstAndThirdPartyAudience]): Self = StObject.set(x, "firstAndThirdPartyAudiences", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudiencesUndefined: Self = StObject.set(x, "firstAndThirdPartyAudiences", js.undefined)
    
    inline def setFirstAndThirdPartyAudiencesVarargs(value: SchemaFirstAndThirdPartyAudience*): Self = StObject.set(x, "firstAndThirdPartyAudiences", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
