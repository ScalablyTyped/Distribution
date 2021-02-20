package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbilling.anon.Alt
import typings.maximMazurokGapiClientCloudbilling.anon.Fields
import typings.maximMazurokGapiClientCloudbilling.anon.Filter
import typings.maximMazurokGapiClientCloudbilling.anon.Key
import typings.maximMazurokGapiClientCloudbilling.anon.Name
import typings.maximMazurokGapiClientCloudbilling.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudbilling.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudbilling.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingAccountsResource extends StObject {
  
  /**
    * Creates a billing account. This method can only be used to create [billing subaccounts](https://cloud.google.com/billing/docs/concepts) by Google Cloud resellers. When creating a
    * subaccount, the current authenticated user must have the `billing.accounts.update` IAM permission on the master account, which is typically given to billing account
    * [administrators](https://cloud.google.com/billing/docs/how-to/billing-access). This method will return an error if the master account has not been provisioned as a reseller account.
    */
  def create(request: Fields): Request[BillingAccount] = js.native
  def create(request: Key, body: BillingAccount): Request[BillingAccount] = js.native
  
  /** Gets information about a billing account. The current authenticated user must be a [viewer of the billing account](https://cloud.google.com/billing/docs/how-to/billing-access). */
  def get(): Request[BillingAccount] = js.native
  def get(request: Alt): Request[BillingAccount] = js.native
  
  /**
    * Gets the access control policy for a billing account. The caller must have the `billing.accounts.getIamPolicy` permission on the account, which is often given to billing account
    * [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
    */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  
  /** Lists the billing accounts that the current authenticated user has permission to [view](https://cloud.google.com/billing/docs/how-to/billing-access). */
  def list(): Request[ListBillingAccountsResponse] = js.native
  def list(request: Filter): Request[ListBillingAccountsResponse] = js.native
  
  /**
    * Updates a billing account's fields. Currently the only field that can be edited is `display_name`. The current authenticated user must have the `billing.accounts.update` IAM
    * permission, which is typically given to the [administrator](https://cloud.google.com/billing/docs/how-to/billing-access) of the billing account.
    */
  def patch(request: Name): Request[BillingAccount] = js.native
  def patch(request: PrettyPrint, body: BillingAccount): Request[BillingAccount] = js.native
  
  var projects: ProjectsResource = js.native
  
  /**
    * Sets the access control policy for a billing account. Replaces any existing policy. The caller must have the `billing.accounts.setIamPolicy` permission on the account, which is
    * often given to billing account [administrators](https://cloud.google.com/billing/docs/how-to/billing-access).
    */
  def setIamPolicy(request: QuotaUser, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Tests the access control policy for a billing account. This method takes the resource and a set of permissions as input and returns the subset of the input permissions that the
    * caller is allowed for that resource.
    */
  def testIamPermissions(request: QuotaUser, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
