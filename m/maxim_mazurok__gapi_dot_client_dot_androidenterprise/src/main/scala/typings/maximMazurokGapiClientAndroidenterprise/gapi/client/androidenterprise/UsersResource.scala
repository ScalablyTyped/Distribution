package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.Alt
import typings.maximMazurokGapiClientAndroidenterprise.anon.Email
import typings.maximMazurokGapiClientAndroidenterprise.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidenterprise.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientAndroidenterprise.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientAndroidenterprise.anon.QuotaUserResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends js.Object {
  
  /** Deleted an EMM-managed user. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /**
    * Generates an authentication token which the device policy client can use to provision the given EMM-managed user account on a device. The generated token is single-use and expires
    * after a few minutes. You can provision a maximum of 10 devices per user. This call only works with EMM-managed accounts.
    */
  def generateAuthenticationToken(): Request[AuthenticationToken] = js.native
  def generateAuthenticationToken(request: Alt): Request[AuthenticationToken] = js.native
  
  /** Retrieves a user's details. */
  def get(): Request[User] = js.native
  def get(request: Alt): Request[User] = js.native
  
  /** Retrieves the set of products a user is entitled to access. */
  def getAvailableProductSet(): Request[ProductSet] = js.native
  def getAvailableProductSet(request: Alt): Request[ProductSet] = js.native
  
  /**
    * Creates a new EMM-managed user. The Users resource passed in the body of the request should include an accountIdentifier and an accountType. If a corresponding user already exists
    * with the same account identifier, the user will be updated with the resource. In this case only the displayName field can be changed.
    */
  def insert(request: OauthtokenPrettyPrint): Request[User] = js.native
  def insert(request: Oauthtoken, body: User): Request[User] = js.native
  
  /**
    * Looks up a user by primary email address. This is only supported for Google-managed users. Lookup of the id is not needed for EMM-managed users because the id is already returned in
    * the result of the Users.insert call.
    */
  def list(): Request[UsersListResponse] = js.native
  def list(request: Email): Request[UsersListResponse] = js.native
  
  /**
    * Revokes access to all devices currently provisioned to the user. The user will no longer be able to use the managed Play store on any of their managed devices. This call only works
    * with EMM-managed accounts.
    */
  def revokeDeviceAccess(): Request[Unit] = js.native
  def revokeDeviceAccess(request: Alt): Request[Unit] = js.native
  
  def setAvailableProductSet(request: Alt, body: ProductSet): Request[ProductSet] = js.native
  /**
    * Modifies the set of products that a user is entitled to access (referred to as *whitelisted* products). Only products that are approved or products that were previously approved
    * (products with revoked approval) can be whitelisted.
    */
  def setAvailableProductSet(request: PrettyPrintQuotaUser): Request[ProductSet] = js.native
  
  def update(request: Alt, body: User): Request[User] = js.native
  /**
    * Updates the details of an EMM-managed user. Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only
    * the displayName field can be changed. Other fields must either be unset or have the currently active value.
    */
  def update(request: QuotaUserResource): Request[User] = js.native
}
