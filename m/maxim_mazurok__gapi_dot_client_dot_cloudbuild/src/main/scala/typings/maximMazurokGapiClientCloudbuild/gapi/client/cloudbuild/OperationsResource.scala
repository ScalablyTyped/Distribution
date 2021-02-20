package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbuild.anon.Accesstoken
import typings.maximMazurokGapiClientCloudbuild.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support
    * this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  def cancel(request: Accesstoken): Request[js.Object] = js.native
  def cancel(request: Alt, body: CancelOperationRequest): Request[js.Object] = js.native
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[Operation] = js.native
  def get(request: Alt): Request[Operation] = js.native
}
