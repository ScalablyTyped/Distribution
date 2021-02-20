package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AccountUserRoleOnly
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.AltCallbackFieldsIdKey
import typings.maximMazurokGapiClientDfareporting.anon.AltCallbackFieldsKeyOauthtoken
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRolesResource extends StObject {
  
  /** Deletes an existing user role. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Gets one user role by ID. */
  def get(): Request[UserRole] = js.native
  def get(request: Alt): Request[UserRole] = js.native
  
  /** Inserts a new user role. */
  def insert(request: AltCallbackFieldsKeyOauthtoken): Request[UserRole] = js.native
  def insert(request: Callback, body: UserRole): Request[UserRole] = js.native
  
  /** Retrieves a list of user roles, possibly filtered. This method supports paging. */
  def list(): Request[UserRolesListResponse] = js.native
  def list(request: AccountUserRoleOnly): Request[UserRolesListResponse] = js.native
  
  /** Updates an existing user role. This method supports patch semantics. */
  def patch(request: AltCallbackFieldsIdKey): Request[UserRole] = js.native
  def patch(request: Alt, body: UserRole): Request[UserRole] = js.native
  
  /** Updates an existing user role. */
  def update(request: AltCallbackFieldsKeyOauthtoken): Request[UserRole] = js.native
  def update(request: Callback, body: UserRole): Request[UserRole] = js.native
}
