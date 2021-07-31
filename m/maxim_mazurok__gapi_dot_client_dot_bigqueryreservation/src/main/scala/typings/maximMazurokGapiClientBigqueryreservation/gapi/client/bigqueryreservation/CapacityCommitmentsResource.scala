package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigqueryreservation.anon.Accesstoken
import typings.maximMazurokGapiClientBigqueryreservation.anon.Callback
import typings.maximMazurokGapiClientBigqueryreservation.anon.EnforceSingleAdminProjectPerOrg
import typings.maximMazurokGapiClientBigqueryreservation.anon.Fields
import typings.maximMazurokGapiClientBigqueryreservation.anon.Key
import typings.maximMazurokGapiClientBigqueryreservation.anon.Name
import typings.maximMazurokGapiClientBigqueryreservation.anon.Oauthtoken
import typings.maximMazurokGapiClientBigqueryreservation.anon.PrettyPrint
import typings.maximMazurokGapiClientBigqueryreservation.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityCommitmentsResource extends StObject {
  
  /** Creates a new capacity commitment resource. */
  def create(request: Callback): Request[CapacityCommitment] = js.native
  def create(request: EnforceSingleAdminProjectPerOrg, body: CapacityCommitment): Request[CapacityCommitment] = js.native
  
  /** Deletes a capacity commitment. Attempting to delete capacity commitment before its commitment_end_time will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Returns information about the capacity commitment. */
  def get(): Request[CapacityCommitment] = js.native
  def get(request: Accesstoken): Request[CapacityCommitment] = js.native
  
  /** Lists all the capacity commitments for the admin project. */
  def list(): Request[ListCapacityCommitmentsResponse] = js.native
  def list(request: Fields): Request[ListCapacityCommitmentsResponse] = js.native
  
  /**
    * Merges capacity commitments of the same plan into a single commitment. The resulting capacity commitment has the greater commitment_end_time out of the to-be-merged capacity
    * commitments. Attempting to merge capacity commitments of different plan will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
    */
  def merge(request: Key): Request[CapacityCommitment] = js.native
  def merge(request: Oauthtoken, body: MergeCapacityCommitmentsRequest): Request[CapacityCommitment] = js.native
  
  /**
    * Updates an existing capacity commitment. Only `plan` and `renewal_plan` fields can be updated. Plan can only be changed to a plan of a longer commitment period. Attempting to change
    * to a plan with shorter commitment period will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
    */
  def patch(request: Name): Request[CapacityCommitment] = js.native
  def patch(request: PrettyPrint, body: CapacityCommitment): Request[CapacityCommitment] = js.native
  
  def split(request: Accesstoken, body: SplitCapacityCommitmentRequest): Request[SplitCapacityCommitmentResponse] = js.native
  /**
    * Splits capacity commitment to two commitments of the same plan and `commitment_end_time`. A common use case is to enable downgrading commitments. For example, in order to downgrade
    * from 10000 slots to 8000, you might split a 10000 capacity commitment into commitments of 2000 and 8000. Then, you would change the plan of the first one to `FLEX` and then delete
    * it.
    */
  def split(request: QuotaUser): Request[SplitCapacityCommitmentResponse] = js.native
}
