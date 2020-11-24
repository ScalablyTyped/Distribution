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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLevelsResource extends js.Object {
  
  /**
    * Create an Access Level. The longrunning operation from this RPC will have a successful status once the Access Level has propagated to long-lasting storage. Access Levels containing
    * errors will result in an error response for the first error encountered.
    */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: AccessLevel): Request[Operation] = js.native
  
  /** Delete an Access Level by resource name. The longrunning operation from this RPC will have a successful status once the Access Level has been removed from long-lasting storage. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Get an Access Level by resource name. */
  def get(): Request[AccessLevel] = js.native
  def get(request: AccessLevelFormat): Request[AccessLevel] = js.native
  
  /** List all Access Levels for an access policy. */
  def list(): Request[ListAccessLevelsResponse] = js.native
  def list(request: Fields): Request[ListAccessLevelsResponse] = js.native
  
  /**
    * Update an Access Level. The longrunning operation from this RPC will have a successful status once the changes to the Access Level have propagated to long-lasting storage. Access
    * Levels containing errors will result in an error response for the first error encountered.
    */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: AccessLevel): Request[Operation] = js.native
  
  def replaceAll(request: Alt, body: ReplaceAccessLevelsRequest): Request[Operation] = js.native
  /**
    * Replace all existing Access Levels in an Access Policy with the Access Levels provided. This is done atomically. The longrunning operation from this RPC will have a successful
    * status once all replacements have propagated to long-lasting storage. Replacements containing errors will result in an error response for the first error encountered. Replacement
    * will be cancelled on error, existing Access Levels will not be affected. Operation.response field will contain ReplaceAccessLevelsResponse. Removing Access Levels contained in
    * existing Service Perimeters will result in error.
    */
  def replaceAll(request: Oauthtoken): Request[Operation] = js.native
}
