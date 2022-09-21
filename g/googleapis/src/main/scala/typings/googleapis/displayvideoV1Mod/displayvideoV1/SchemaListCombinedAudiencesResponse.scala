package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCombinedAudiencesResponse extends StObject {
  
  /**
    * The list of combined audiences. This list will be absent if empty.
    */
  var combinedAudiences: js.UndefOr[js.Array[SchemaCombinedAudience]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCombinedAudiences` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCombinedAudiencesResponse {
  
  inline def apply(): SchemaListCombinedAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCombinedAudiencesResponse]
  }
  
  extension [Self <: SchemaListCombinedAudiencesResponse](x: Self) {
    
    inline def setCombinedAudiences(value: js.Array[SchemaCombinedAudience]): Self = StObject.set(x, "combinedAudiences", value.asInstanceOf[js.Any])
    
    inline def setCombinedAudiencesUndefined: Self = StObject.set(x, "combinedAudiences", js.undefined)
    
    inline def setCombinedAudiencesVarargs(value: SchemaCombinedAudience*): Self = StObject.set(x, "combinedAudiences", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
