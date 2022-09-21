package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListReservationsResponse extends StObject {
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page of results. If this field is omitted, there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of reservation in the requested parent. The order of the reservations is unspecified.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.undefined
}
object SchemaListReservationsResponse {
  
  inline def apply(): SchemaListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReservationsResponse]
  }
  
  extension [Self <: SchemaListReservationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReservations(value: js.Array[SchemaReservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    inline def setReservationsVarargs(value: SchemaReservation*): Self = StObject.set(x, "reservations", js.Array(value*))
  }
}
