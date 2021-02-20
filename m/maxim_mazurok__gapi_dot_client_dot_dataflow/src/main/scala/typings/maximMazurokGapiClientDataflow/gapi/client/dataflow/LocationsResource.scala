package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.AltCallbackFields
import typings.maximMazurokGapiClientDataflow.anon.QuotaUserUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var flexTemplates: FlexTemplatesResource = js.native
  
  var jobs: JobsResource = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var sql: SqlResource = js.native
  
  var templates: TemplatesResource = js.native
  
  /** Send a worker_message to the service. */
  def workerMessages(request: AltCallbackFields): Request[SendWorkerMessagesResponse] = js.native
  def workerMessages(request: QuotaUserUploadType, body: SendWorkerMessagesRequest): Request[SendWorkerMessagesResponse] = js.native
}
