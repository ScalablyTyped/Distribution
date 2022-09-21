package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Alt
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Callback
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Name
import typings.maximMazurokGapiClientAccesscontextmanager.anon.PageSize
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Parent
import typings.maximMazurokGapiClientAccesscontextmanager.anon.PrettyPrint
import typings.maximMazurokGapiClientAccesscontextmanager.anon.QuotaUser
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Resource
import typings.maximMazurokGapiClientAccesscontextmanager.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePerimetersResource extends StObject {
  
  def commit(request: Alt, body: CommitServicePerimetersRequest): Request[Operation] = js.native
  /**
    * Commits the dry-run specification for all the service perimeters in an access policy. A commit operation on a service perimeter involves copying its `spec` field to the `status`
    * field of the service perimeter. Only service perimeters with `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The long-running operation from this
    * RPC has a successful status after the dry-run specifications for all the service perimeters have been committed. If a commit fails, it causes the long-running operation to return an
    * error response and the entire commit operation is cancelled. When successful, the Operation.response field contains CommitServicePerimetersResponse. The `dry_run` and the `spec`
    * fields are cleared after a successful commit operation.
    */
  def commit(request: Parent): Request[Operation] = js.native
  
  def create(request: Alt, body: ServicePerimeter): Request[Operation] = js.native
  /**
    * Creates a service perimeter. The long-running operation from this RPC has a successful status after the service perimeter propagates to long-lasting storage. If a service perimeter
    * contains errors, an error response is returned for the first error encountered.
    */
  def create(request: QuotaUser): Request[Operation] = js.native
  
  /**
    * Deletes a service perimeter based on the resource name. The long-running operation from this RPC has a successful status after the service perimeter is removed from long-lasting
    * storage.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets a service perimeter based on the resource name. */
  def get(): Request[ServicePerimeter] = js.native
  def get(request: Callback): Request[ServicePerimeter] = js.native
  
  /** Lists all service perimeters for an access policy. */
  def list(): Request[ListServicePerimetersResponse] = js.native
  def list(request: PageSize): Request[ListServicePerimetersResponse] = js.native
  
  def patch(request: Name, body: ServicePerimeter): Request[Operation] = js.native
  /**
    * Updates a service perimeter. The long-running operation from this RPC has a successful status after the service perimeter propagates to long-lasting storage. If a service perimeter
    * contains errors, an error response is returned for the first error encountered.
    */
  def patch(request: Resource): Request[Operation] = js.native
  
  def replaceAll(request: Alt, body: ReplaceServicePerimetersRequest): Request[Operation] = js.native
  /**
    * Replace all existing service perimeters in an access policy with the service perimeters provided. This is done atomically. The long-running operation from this RPC has a successful
    * status after all replacements propagate to long-lasting storage. Replacements containing errors result in an error response for the first error encountered. Upon an error,
    * replacement are cancelled and existing service perimeters are not affected. The Operation.response field contains ReplaceServicePerimetersResponse.
    */
  def replaceAll(request: UploadType): Request[Operation] = js.native
  
  /**
    * Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an AccessPolicy, AccessLevel, or ServicePerimeter. This method
    * does not support other resources.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
