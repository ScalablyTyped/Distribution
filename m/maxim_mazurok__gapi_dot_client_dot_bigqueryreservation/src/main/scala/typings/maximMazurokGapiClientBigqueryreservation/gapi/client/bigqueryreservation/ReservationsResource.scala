package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigqueryreservation.anon.Fields
import typings.maximMazurokGapiClientBigqueryreservation.anon.Key
import typings.maximMazurokGapiClientBigqueryreservation.anon.PrettyPrint
import typings.maximMazurokGapiClientBigqueryreservation.anon.ReservationId
import typings.maximMazurokGapiClientBigqueryreservation.anon.Uploadprotocol
import typings.maximMazurokGapiClientBigqueryreservation.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationsResource extends StObject {
  
  var assignments: AssignmentsResource = js.native
  
  /** Creates a new reservation resource. */
  def create(request: ReservationId): Request[Reservation] = js.native
  def create(request: Uploadprotocol, body: Reservation): Request[Reservation] = js.native
  
  /** Deletes a reservation. Returns `google.rpc.Code.FAILED_PRECONDITION` when reservation has assignments. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Returns information about the reservation. */
  def get(): Request[Reservation] = js.native
  def get(request: Fields): Request[Reservation] = js.native
  
  /** Lists all the reservations for the project in the specified location. */
  def list(): Request[ListReservationsResponse] = js.native
  def list(request: Key): Request[ListReservationsResponse] = js.native
  
  def patch(request: PrettyPrint, body: Reservation): Request[Reservation] = js.native
  /** Updates an existing reservation resource. */
  def patch(request: Xgafv): Request[Reservation] = js.native
}
