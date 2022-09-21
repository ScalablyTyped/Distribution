package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse extends StObject {
  
  /**
    * All contacts for the resource that are subscribed to the specified notification categories, including contacts inherited from any parent resources.
    */
  var contacts: js.UndefOr[js.Array[SchemaGoogleCloudEssentialcontactsV1Contact]] = js.undefined
  
  /**
    * If there are more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token` and the rest of the parameters the same as the original request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse {
  
  inline def apply(): SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudEssentialcontactsV1ComputeContactsResponse](x: Self) {
    
    inline def setContacts(value: js.Array[SchemaGoogleCloudEssentialcontactsV1Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: SchemaGoogleCloudEssentialcontactsV1Contact*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
