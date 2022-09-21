package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCampaignsResponse extends StObject {
  
  /**
    * The list of campaigns. This list will be absent if empty.
    */
  var campaigns: js.UndefOr[js.Array[SchemaCampaign]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCampaigns` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCampaignsResponse {
  
  inline def apply(): SchemaListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCampaignsResponse]
  }
  
  extension [Self <: SchemaListCampaignsResponse](x: Self) {
    
    inline def setCampaigns(value: js.Array[SchemaCampaign]): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    inline def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    inline def setCampaignsVarargs(value: SchemaCampaign*): Self = StObject.set(x, "campaigns", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
