package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.Accesstoken
import typings.maximMazurokGapiClientCloudidentity.anon.Alt
import typings.maximMazurokGapiClientCloudidentity.anon.Callback
import typings.maximMazurokGapiClientCloudidentity.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserinvitationsResource extends StObject {
  
  /** Cancels a UserInvitation that was already sent. */
  def cancel(request: Accesstoken): Request[Operation] = js.native
  def cancel(request: Alt, body: CancelUserInvitationRequest): Request[Operation] = js.native
  
  /**
    * Retrieves a UserInvitation resource. **Note:** New consumer accounts with the customer's verified domain created within the previous 48 hours will not appear in the result. This
    * delay also applies to newly-verified domains.
    */
  def get(): Request[UserInvitation] = js.native
  def get(request: Alt): Request[UserInvitation] = js.native
  
  /**
    * Verifies whether a user account is eligible to receive a UserInvitation (is an unmanaged account). Eligibility is based on the following criteria: * the email address is a consumer
    * account and it's the primary email address of the account, and * the domain of the email address matches an existing verified Google Workspace or Cloud Identity domain If both
    * conditions are met, the user is eligible. **Note:** This method is not supported for Workspace Essentials customers.
    */
  def isInvitableUser(): Request[IsInvitableUserResponse] = js.native
  def isInvitableUser(request: Alt): Request[IsInvitableUserResponse] = js.native
  
  /**
    * Retrieves a list of UserInvitation resources. **Note:** New consumer accounts with the customer's verified domain created within the previous 48 hours will not appear in the result.
    * This delay also applies to newly-verified domains.
    */
  def list(): Request[ListUserInvitationsResponse] = js.native
  def list(request: Callback): Request[ListUserInvitationsResponse] = js.native
  
  def send(request: Alt, body: SendUserInvitationRequest): Request[Operation] = js.native
  /**
    * Sends a UserInvitation to email. If the `UserInvitation` does not exist for this request and it is a valid request, the request creates a `UserInvitation`. **Note:** The `get` and
    * `list` methods have a 48-hour delay where newly-created consumer accounts will not appear in the results. You can still send a `UserInvitation` to those accounts if you know the
    * unmanaged email address and IsInvitableUser==True.
    */
  def send(request: Fields): Request[Operation] = js.native
}
