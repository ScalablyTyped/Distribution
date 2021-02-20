package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.AccesstokenAltCallback
import typings.maximMazurokGapiClientDataflow.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientDataflow.anon.SnapshotIdUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var catalogTemplates: CatalogTemplatesResource = js.native
  
  /** Deletes a snapshot. */
  def deleteSnapshots(): Request[js.Object] = js.native
  def deleteSnapshots(request: SnapshotIdUploadType): Request[js.Object] = js.native
  
  var jobs: JobsResource = js.native
  
  var locations: LocationsResource = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var templateVersions: TemplateVersionsResource = js.native
  
  var templates: TemplatesResource = js.native
  
  def workerMessages(request: AccesstokenAltCallback, body: SendWorkerMessagesRequest): Request[SendWorkerMessagesResponse] = js.native
  /** Send a worker_message to the service. */
  def workerMessages(request: CallbackFieldsKey): Request[SendWorkerMessagesResponse] = js.native
}
