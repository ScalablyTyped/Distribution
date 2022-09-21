package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.QuotaUserSnapshotId
import typings.maximMazurokGapiClientDataflow.anon.QuotaUserUploadType
import typings.maximMazurokGapiClientDataflow.anon.UploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Deletes a snapshot. */
  def deleteSnapshots(): Request[js.Object] = js.native
  def deleteSnapshots(request: QuotaUserSnapshotId): Request[js.Object] = js.native
  
  var jobs: JobsResource = js.native
  
  var locations: LocationsResource = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var templates: TemplatesResource = js.native
  
  def workerMessages(request: QuotaUserUploadType, body: SendWorkerMessagesRequest): Request[SendWorkerMessagesResponse] = js.native
  /** Send a worker_message to the service. */
  def workerMessages(request: UploadTypeUploadprotocol): Request[SendWorkerMessagesResponse] = js.native
}
