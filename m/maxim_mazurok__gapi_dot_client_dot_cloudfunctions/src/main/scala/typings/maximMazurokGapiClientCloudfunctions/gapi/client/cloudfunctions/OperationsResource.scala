package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudfunctions.anon.Accesstoken
import typings.maximMazurokGapiClientCloudfunctions.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[Operation] = js.native
  def get(request: Accesstoken): Request[Operation] = js.native
  
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services
    * to override the binding to use different resource name schemes, such as `users/∗/operations`. To override the binding, API services can add a binding such as
    * `"/v1/{name=users/ *}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
    * ensure the name binding is the parent resource, without the operations collection id.
    */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: Alt): Request[ListOperationsResponse] = js.native
}
