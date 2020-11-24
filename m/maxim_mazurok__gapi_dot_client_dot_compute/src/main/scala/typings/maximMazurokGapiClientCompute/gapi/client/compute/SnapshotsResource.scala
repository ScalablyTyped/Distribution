package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.OauthtokenOptionsRequestedPolicyVersion
import typings.maximMazurokGapiClientCompute.anon.QuotaUserSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends js.Object {
  
  /**
    * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If any data on the snapshot that is
    * marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
    *
    * For more information, see Deleting snapshots.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.Snapshot): Request[Operation] = js.native
  
  /** Returns the specified Snapshot resource. Gets a list of available snapshots by making a list() request. */
  def get(): Request[Snapshot] = js.native
  def get(request: QuotaUserSnapshot): Request[Snapshot] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OauthtokenOptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  /** Retrieves the list of Snapshot resources contained within the specified project. */
  def list(): Request[SnapshotList] = js.native
  def list(request: MaxResults): Request[SnapshotList] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: KeyOauthtokenPrettyPrint, body: GlobalSetPolicyRequest): Request[Policy] = js.native
  
  /** Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: KeyOauthtokenPrettyPrint, body: GlobalSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: KeyOauthtokenPrettyPrint, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
