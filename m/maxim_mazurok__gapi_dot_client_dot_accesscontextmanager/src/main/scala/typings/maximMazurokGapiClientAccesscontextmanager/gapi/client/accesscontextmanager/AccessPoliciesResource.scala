package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Callback
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Name
import typings.maximMazurokGapiClientAccesscontextmanager.anon.PageToken
import typings.maximMazurokGapiClientAccesscontextmanager.anon.UpdateMask
import typings.maximMazurokGapiClientAccesscontextmanager.anon.UploadType
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPoliciesResource extends StObject {
  
  var accessLevels: AccessLevelsResource = js.native
  
  /**
    * Create an `AccessPolicy`. Fails if this organization already has a `AccessPolicy`. The longrunning Operation will have a successful status once the `AccessPolicy` has propagated to
    * long-lasting storage. Syntactic and basic semantic errors will be returned in `metadata` as a BadRequest proto.
    */
  def create(request: UploadType): Request[Operation] = js.native
  def create(request: Uploadprotocol, body: AccessPolicy): Request[Operation] = js.native
  
  /** Delete an AccessPolicy by resource name. The longrunning Operation will have a successful status once the AccessPolicy has been removed from long-lasting storage. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Get an AccessPolicy by name. */
  def get(): Request[AccessPolicy] = js.native
  def get(request: Callback): Request[AccessPolicy] = js.native
  
  /** List all AccessPolicies under a container. */
  def list(): Request[ListAccessPoliciesResponse] = js.native
  def list(request: PageToken): Request[ListAccessPoliciesResponse] = js.native
  
  def patch(request: Name, body: AccessPolicy): Request[Operation] = js.native
  /**
    * Update an AccessPolicy. The longrunning Operation from this RPC will have a successful status once the changes to the AccessPolicy have propagated to long-lasting storage. Syntactic
    * and basic semantic errors will be returned in `metadata` as a BadRequest proto.
    */
  def patch(request: UpdateMask): Request[Operation] = js.native
  
  var servicePerimeters: ServicePerimetersResource = js.native
}
