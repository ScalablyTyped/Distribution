package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.QuotaUser
import typings.maximMazurokGapiClientDataflow.anon.QuotaUserSnapshotId
import typings.maximMazurokGapiClientDataflow.anon.SnapshotId
import typings.maximMazurokGapiClientDataflow.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientDataflow.anon.UploadprotocolXgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends js.Object {
  
  /** Deletes a snapshot. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SnapshotId): Request[js.Object] = js.native
  
  /** Gets information about a snapshot. */
  def get(): Request[Snapshot] = js.native
  def get(request: QuotaUserSnapshotId): Request[Snapshot] = js.native
  def get(request: SnapshotId): Request[Snapshot] = js.native
  
  /** Lists snapshots. */
  def list(): Request[ListSnapshotsResponse] = js.native
  def list(request: QuotaUser): Request[ListSnapshotsResponse] = js.native
  def list(request: UploadTypeUploadprotocol): Request[ListSnapshotsResponse] = js.native
  def list(request: UploadprotocolXgafv): Request[ListSnapshotsResponse] = js.native
}
