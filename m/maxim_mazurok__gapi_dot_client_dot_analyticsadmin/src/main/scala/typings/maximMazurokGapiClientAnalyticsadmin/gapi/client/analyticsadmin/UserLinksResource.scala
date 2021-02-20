package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Accesstoken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Callback
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Fields
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Key
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.NotifyNewUser
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Oauthtoken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Parent
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserLinksResource extends StObject {
  
  /**
    * Lists all user links on an account or property, including implicit ones that come from effective permissions granted by groups or organization admin roles. If a returned user link
    * does not have direct permissions, they cannot be removed from the account or property directly with the DeleteUserLink command. They have to be removed from the group/etc that gives
    * them permissions, which is currently only usable/discoverable in the GA or GMP UIs.
    */
  def audit(request: Accesstoken): Request[GoogleAnalyticsAdminV1alphaAuditUserLinksResponse] = js.native
  def audit(request: Alt, body: GoogleAnalyticsAdminV1alphaAuditUserLinksRequest): Request[GoogleAnalyticsAdminV1alphaAuditUserLinksResponse] = js.native
  
  def batchCreate(request: Alt, body: GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest): Request[GoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse] = js.native
  /** Creates information about multiple users' links to an account or property. This method is transactional. If any UserLink cannot be created, none of the UserLinks will be created. */
  def batchCreate(request: Callback): Request[GoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse] = js.native
  
  def batchDelete(request: Alt, body: GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest): Request[js.Object] = js.native
  /** Deletes information about multiple users' links to an account or property. */
  def batchDelete(request: Fields): Request[js.Object] = js.native
  
  /** Gets information about multiple users' links to an account or property. */
  def batchGet(): Request[GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse] = js.native
  def batchGet(request: Key): Request[GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse] = js.native
  
  def batchUpdate(request: Alt, body: GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksRequest): Request[GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse] = js.native
  /** Updates information about multiple users' links to an account or property. */
  def batchUpdate(request: Oauthtoken): Request[GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse] = js.native
  
  /**
    * Creates a user link on an account or property. If the user with the specified email already has permissions on the account or property, then the user's existing permissions will be
    * unioned with the permissions specified in the new UserLink.
    */
  def create(request: NotifyNewUser): Request[GoogleAnalyticsAdminV1alphaUserLink] = js.native
  def create(request: Parent, body: GoogleAnalyticsAdminV1alphaUserLink): Request[GoogleAnalyticsAdminV1alphaUserLink] = js.native
  
  /** Deletes a user link on an account or property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets information about a user's link to an account or property. */
  def get(): Request[GoogleAnalyticsAdminV1alphaUserLink] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaUserLink] = js.native
  
  /** Lists all user links on an account or property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListUserLinksResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListUserLinksResponse] = js.native
  
  def patch(request: Name, body: GoogleAnalyticsAdminV1alphaUserLink): Request[GoogleAnalyticsAdminV1alphaUserLink] = js.native
  /** Updates a user link on an account or property. */
  def patch(request: PrettyPrint): Request[GoogleAnalyticsAdminV1alphaUserLink] = js.native
}
