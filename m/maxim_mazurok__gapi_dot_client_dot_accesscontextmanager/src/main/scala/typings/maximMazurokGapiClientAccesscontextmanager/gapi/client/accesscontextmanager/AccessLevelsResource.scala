package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAccesscontextmanager.anon.AccessLevelFormat
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Accesstoken
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Alt
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Callback
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Fields
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Key
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Name
import typings.maximMazurokGapiClientAccesscontextmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientAccesscontextmanager.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLevelsResource extends StObject {
  
  /**
    * Creates an access level. The long-running operation from this RPC has a successful status after the access level propagates to long-lasting storage. If access levels contain errors,
    * an error response is returned for the first error encountered.
    */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: AccessLevel): Request[Operation] = js.native
  
  /**
    * Deletes an access level based on the resource name. The long-running operation from this RPC has a successful status after the access level has been removed from long-lasting
    * storage.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets an access level based on the resource name. */
  def get(): Request[AccessLevel] = js.native
  def get(request: AccessLevelFormat): Request[AccessLevel] = js.native
  
  /** Lists all access levels for an access policy. */
  def list(): Request[ListAccessLevelsResponse] = js.native
  def list(request: Fields): Request[ListAccessLevelsResponse] = js.native
  
  /**
    * Updates an access level. The long-running operation from this RPC has a successful status after the changes to the access level propagate to long-lasting storage. If access levels
    * contain errors, an error response is returned for the first error encountered.
    */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: AccessLevel): Request[Operation] = js.native
  
  def replaceAll(request: Alt, body: ReplaceAccessLevelsRequest): Request[Operation] = js.native
  /**
    * Replaces all existing access levels in an access policy with the access levels provided. This is done atomically. The long-running operation from this RPC has a successful status
    * after all replacements propagate to long-lasting storage. If the replacement contains errors, an error response is returned for the first error encountered. Upon error, the
    * replacement is cancelled, and existing access levels are not affected. The Operation.response field contains ReplaceAccessLevelsResponse. Removing access levels contained in
    * existing service perimeters result in an error.
    */
  def replaceAll(request: Oauthtoken): Request[Operation] = js.native
  
  /**
    * Returns the IAM permissions that the caller has on the specified Access Context Manager resource. The resource can be an AccessPolicy, AccessLevel, or ServicePerimeter. This method
    * does not support other resources.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
