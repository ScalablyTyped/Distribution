package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientApigateway.anon.Callback
import typings.maximMazurokGapiClientApigateway.anon.PageSize
import typings.maximMazurokGapiClientApigateway.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  def cancel(request: Callback, body: ApigatewayCancelOperationRequest): Request[js.Object] = js.native
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support
    * this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  def cancel(request: Uploadprotocol): Request[js.Object] = js.native
  
  /**
    * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't
    * support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[ApigatewayOperation] = js.native
  def get(request: Callback): Request[ApigatewayOperation] = js.native
  
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services
    * to override the binding to use different resource name schemes, such as `users/∗/operations`. To override the binding, API services can add a binding such as
    * `"/v1/{name=users/ *}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
    * ensure the name binding is the parent resource, without the operations collection id.
    */
  def list(): Request[ApigatewayListOperationsResponse] = js.native
  def list(request: PageSize): Request[ApigatewayListOperationsResponse] = js.native
}
