package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListReservationGrantsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of reservation grants visible to the user.
    */
  var reservationGrants: js.UndefOr[js.Array[SchemaReservationGrant]] = js.undefined
}
object SchemaListReservationGrantsResponse {
  
  inline def apply(): SchemaListReservationGrantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReservationGrantsResponse]
  }
  
  extension [Self <: SchemaListReservationGrantsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReservationGrants(value: js.Array[SchemaReservationGrant]): Self = StObject.set(x, "reservationGrants", value.asInstanceOf[js.Any])
    
    inline def setReservationGrantsUndefined: Self = StObject.set(x, "reservationGrants", js.undefined)
    
    inline def setReservationGrantsVarargs(value: SchemaReservationGrant*): Self = StObject.set(x, "reservationGrants", js.Array(value*))
  }
}
