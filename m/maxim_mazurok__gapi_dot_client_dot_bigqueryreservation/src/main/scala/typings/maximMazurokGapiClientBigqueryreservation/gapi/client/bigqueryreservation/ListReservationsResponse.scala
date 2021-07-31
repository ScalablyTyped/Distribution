package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReservationsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of reservations visible to the user. */
  var reservations: js.UndefOr[js.Array[Reservation]] = js.undefined
}
object ListReservationsResponse {
  
  @scala.inline
  def apply(): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsResponse]
  }
  
  @scala.inline
  implicit class ListReservationsResponseMutableBuilder[Self <: ListReservationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReservations(value: js.Array[Reservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
  }
}
