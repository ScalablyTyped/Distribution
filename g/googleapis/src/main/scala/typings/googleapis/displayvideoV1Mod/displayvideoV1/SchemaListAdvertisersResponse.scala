package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAdvertisersResponse extends StObject {
  
  /**
    * The list of advertisers. This list will be absent if empty.
    */
  var advertisers: js.UndefOr[js.Array[SchemaAdvertiser]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAdvertisers` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAdvertisersResponse {
  
  inline def apply(): SchemaListAdvertisersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAdvertisersResponse]
  }
  
  extension [Self <: SchemaListAdvertisersResponse](x: Self) {
    
    inline def setAdvertisers(value: js.Array[SchemaAdvertiser]): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    inline def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    inline def setAdvertisersVarargs(value: SchemaAdvertiser*): Self = StObject.set(x, "advertisers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
