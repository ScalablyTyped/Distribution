package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGuestPoliciesResponse extends StObject {
  
  /**
    * The list of GuestPolicies.
    */
  var guestPolicies: js.UndefOr[js.Array[SchemaGuestPolicy]] = js.undefined
  
  /**
    * A pagination token that can be used to get the next page of guest policies.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGuestPoliciesResponse {
  
  inline def apply(): SchemaListGuestPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuestPoliciesResponse]
  }
  
  extension [Self <: SchemaListGuestPoliciesResponse](x: Self) {
    
    inline def setGuestPolicies(value: js.Array[SchemaGuestPolicy]): Self = StObject.set(x, "guestPolicies", value.asInstanceOf[js.Any])
    
    inline def setGuestPoliciesUndefined: Self = StObject.set(x, "guestPolicies", js.undefined)
    
    inline def setGuestPoliciesVarargs(value: SchemaGuestPolicy*): Self = StObject.set(x, "guestPolicies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
