package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigqueryreservation.anon.Accesstoken
import typings.maximMazurokGapiClientBigqueryreservation.anon.PageSize
import typings.maximMazurokGapiClientBigqueryreservation.anon.PrettyPrint
import typings.maximMazurokGapiClientBigqueryreservation.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var capacityCommitments: CapacityCommitmentsResource = js.native
  
  /** Retrieves a BI reservation. */
  def getBiReservation(): Request[BiReservation] = js.native
  def getBiReservation(request: Accesstoken): Request[BiReservation] = js.native
  
  var reservations: ReservationsResource = js.native
  
  /**
    * Looks up assignments for a specified resource for a particular region. If the request is about a project: 1. Assignments created on the project will be returned if they exist. 2.
    * Otherwise assignments created on the closest ancestor will be returned. 3. Assignments for different JobTypes will all be returned. The same logic applies if the request is about a
    * folder. If the request is about an organization, then assignments created on the organization will be returned (organization doesn't have ancestors). Comparing to ListAssignments,
    * there are some behavior differences: 1. permission on the assignee will be verified in this API. 2. Hierarchy lookup (project->folder->organization) happens in this API. 3. Parent
    * here is `projects/∗/locations/ *`, instead of `projects/∗/locations/ *reservations/ *`.
    */
  def searchAllAssignments(): Request[SearchAllAssignmentsResponse] = js.native
  def searchAllAssignments(request: PageSize): Request[SearchAllAssignmentsResponse] = js.native
  
  /**
    * Looks up assignments for a specified resource for a particular region. If the request is about a project: 1. Assignments created on the project will be returned if they exist. 2.
    * Otherwise assignments created on the closest ancestor will be returned. 3. Assignments for different JobTypes will all be returned. The same logic applies if the request is about a
    * folder. If the request is about an organization, then assignments created on the organization will be returned (organization doesn't have ancestors). Comparing to ListAssignments,
    * there are some behavior differences: 1. permission on the assignee will be verified in this API. 2. Hierarchy lookup (project->folder->organization) happens in this API. 3. Parent
    * here is `projects/∗/locations/ *`, instead of `projects/∗/locations/ *reservations/ *`. **Note** "-" cannot be used for projects nor locations.
    */
  def searchAssignments(): Request[SearchAssignmentsResponse] = js.native
  def searchAssignments(request: PageSize): Request[SearchAssignmentsResponse] = js.native
  
  def updateBiReservation(request: PrettyPrint, body: BiReservation): Request[BiReservation] = js.native
  /**
    * Updates a BI reservation. Only fields specified in the `field_mask` are updated. A singleton BI reservation always exists with default size 0. In order to reserve BI capacity it
    * needs to be updated to an amount greater than 0. In order to release BI capacity reservation size must be set to 0.
    */
  def updateBiReservation(request: Uploadprotocol): Request[BiReservation] = js.native
}
