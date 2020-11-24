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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePerimetersResource extends js.Object {
  
  def commit(request: Alt, body: CommitServicePerimetersRequest): Request[Operation] = js.native
  /**
    * Commit the dry-run spec for all the Service Perimeters in an Access Policy. A commit operation on a Service Perimeter involves copying its `spec` field to that Service Perimeter's
    * `status` field. Only Service Perimeters with `use_explicit_dry_run_spec` field set to true are affected by a commit operation. The longrunning operation from this RPC will have a
    * successful status once the dry-run specs for all the Service Perimeters have been committed. If a commit fails, it will cause the longrunning operation to return an error response
    * and the entire commit operation will be cancelled. When successful, Operation.response field will contain CommitServicePerimetersResponse. The `dry_run` and the `spec` fields will
    * be cleared after a successful commit operation.
    */
  def commit(request: Parent): Request[Operation] = js.native
  
  def create(request: Alt, body: ServicePerimeter): Request[Operation] = js.native
  /**
    * Create a Service Perimeter. The longrunning operation from this RPC will have a successful status once the Service Perimeter has propagated to long-lasting storage. Service
    * Perimeters containing errors will result in an error response for the first error encountered.
    */
  def create(request: PrettyPrint): Request[Operation] = js.native
  
  /**
    * Delete a Service Perimeter by resource name. The longrunning operation from this RPC will have a successful status once the Service Perimeter has been removed from long-lasting
    * storage.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Get a Service Perimeter by resource name. */
  def get(): Request[ServicePerimeter] = js.native
  def get(request: Callback): Request[ServicePerimeter] = js.native
  
  /** List all Service Perimeters for an access policy. */
  def list(): Request[ListServicePerimetersResponse] = js.native
  def list(request: PageSize): Request[ListServicePerimetersResponse] = js.native
  
  def patch(request: Name, body: ServicePerimeter): Request[Operation] = js.native
  /**
    * Update a Service Perimeter. The longrunning operation from this RPC will have a successful status once the changes to the Service Perimeter have propagated to long-lasting storage.
    * Service Perimeter containing errors will result in an error response for the first error encountered.
    */
  def patch(request: QuotaUser): Request[Operation] = js.native
  
  def replaceAll(request: Alt, body: ReplaceServicePerimetersRequest): Request[Operation] = js.native
  /**
    * Replace all existing Service Perimeters in an Access Policy with the Service Perimeters provided. This is done atomically. The longrunning operation from this RPC will have a
    * successful status once all replacements have propagated to long-lasting storage. Replacements containing errors will result in an error response for the first error encountered.
    * Replacement will be cancelled on error, existing Service Perimeters will not be affected. Operation.response field will contain ReplaceServicePerimetersResponse.
    */
  def replaceAll(request: Resource): Request[Operation] = js.native
}
