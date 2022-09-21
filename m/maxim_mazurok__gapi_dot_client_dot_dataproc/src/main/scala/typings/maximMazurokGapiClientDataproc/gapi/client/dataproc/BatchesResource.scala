package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataproc.anon.BatchId
import typings.maximMazurokGapiClientDataproc.anon.Callback
import typings.maximMazurokGapiClientDataproc.anon.Key
import typings.maximMazurokGapiClientDataproc.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchesResource extends StObject {
  
  /** Creates a batch workload that executes asynchronously. */
  def create(request: BatchId): Request[Operation] = js.native
  def create(request: Oauthtoken, body: Batch): Request[Operation] = js.native
  
  /** Deletes the batch workload resource. If the batch is not in terminal state, the delete fails and the response returns FAILED_PRECONDITION. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the batch workload resource representation. */
  def get(): Request[Batch] = js.native
  def get(request: Callback): Request[Batch] = js.native
  
  /** Lists batch workloads. */
  def list(): Request[ListBatchesResponse] = js.native
  def list(request: Key): Request[ListBatchesResponse] = js.native
}
