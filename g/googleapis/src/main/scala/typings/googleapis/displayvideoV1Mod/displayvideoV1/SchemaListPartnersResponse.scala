package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPartnersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListPartners` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of partners. This list will be absent if empty.
    */
  var partners: js.UndefOr[js.Array[SchemaPartner]] = js.undefined
}
object SchemaListPartnersResponse {
  
  inline def apply(): SchemaListPartnersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPartnersResponse]
  }
  
  extension [Self <: SchemaListPartnersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartners(value: js.Array[SchemaPartner]): Self = StObject.set(x, "partners", value.asInstanceOf[js.Any])
    
    inline def setPartnersUndefined: Self = StObject.set(x, "partners", js.undefined)
    
    inline def setPartnersVarargs(value: SchemaPartner*): Self = StObject.set(x, "partners", js.Array(value*))
  }
}
