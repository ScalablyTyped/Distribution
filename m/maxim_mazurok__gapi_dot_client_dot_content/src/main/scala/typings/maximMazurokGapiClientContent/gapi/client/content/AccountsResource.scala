package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAccountId
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.AccountIdAlt
import typings.maximMazurokGapiClientContent.anon.AltCallback
import typings.maximMazurokGapiClientContent.anon.CallbackFields
import typings.maximMazurokGapiClientContent.anon.FieldsKey
import typings.maximMazurokGapiClientContent.anon.Force
import typings.maximMazurokGapiClientContent.anon.KeyMerchantId
import typings.maximMazurokGapiClientContent.anon.Label
import typings.maximMazurokGapiClientContent.anon.MaxResults
import typings.maximMazurokGapiClientContent.anon.Overwrite
import typings.maximMazurokGapiClientContent.anon.Resource
import typings.maximMazurokGapiClientContent.anon.UploadType
import typings.maximMazurokGapiClientContent.anon.Uploadprotocol
import typings.maximMazurokGapiClientContent.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  /** Returns information about the authenticated user. */
  def authinfo(): Request[AccountsAuthInfoResponse] = js.native
  def authinfo(request: UploadType): Request[AccountsAuthInfoResponse] = js.native
  
  /** Claims the website of a Merchant Center sub-account. */
  def claimwebsite(): Request[AccountsClaimWebsiteResponse] = js.native
  def claimwebsite(request: Overwrite): Request[AccountsClaimWebsiteResponse] = js.native
  
  var credentials: CredentialsResource = js.native
  
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: Resource): Request[AccountsCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: AccountsCustomBatchRequest): Request[AccountsCustomBatchResponse] = js.native
  
  /** Deletes a Merchant Center sub-account. */
  def delete(): Request[Unit] = js.native
  def delete(request: Force): Request[Unit] = js.native
  
  /** Retrieves a Merchant Center account. */
  def get(): Request[Account] = js.native
  def get(request: Uploadprotocol): Request[Account] = js.native
  
  def insert(request: AccesstokenAlt, body: Account): Request[Account] = js.native
  /** Creates a Merchant Center sub-account. */
  def insert(request: Xgafv): Request[Account] = js.native
  
  var labels: LabelsResource = js.native
  
  /** Performs an action on a link between two Merchant Center accounts, namely accountId and linkedAccountId. */
  def link(request: AccesstokenAccountId): Request[AccountsLinkResponse] = js.native
  def link(request: AccountIdAlt, body: AccountsLinkRequest): Request[AccountsLinkResponse] = js.native
  
  /** Lists the sub-accounts in your Merchant Center account. */
  def list(): Request[AccountsListResponse] = js.native
  def list(request: Label): Request[AccountsListResponse] = js.native
  
  /** Returns the list of accounts linked to your Merchant Center account. */
  def listlinks(): Request[AccountsListLinksResponse] = js.native
  def listlinks(request: MaxResults): Request[AccountsListLinksResponse] = js.native
  
  def requestphoneverification(request: AccountIdAlt, body: RequestPhoneVerificationRequest): Request[RequestPhoneVerificationResponse] = js.native
  /** Request verification code to start phone verification. */
  def requestphoneverification(request: AltCallback): Request[RequestPhoneVerificationResponse] = js.native
  
  var returncarrier: ReturncarrierResource = js.native
  
  def update(request: AccountIdAlt, body: Account): Request[Account] = js.native
  /** Updates a Merchant Center account. Any fields that are not provided are deleted from the resource. */
  def update(request: CallbackFields): Request[Account] = js.native
  
  def updatelabels(request: AccountIdAlt, body: AccountsUpdateLabelsRequest): Request[AccountsUpdateLabelsResponse] = js.native
  /** Updates labels that are assigned to the Merchant Center account by CSS user. */
  def updatelabels(request: FieldsKey): Request[AccountsUpdateLabelsResponse] = js.native
  
  def verifyphonenumber(request: AccountIdAlt, body: VerifyPhoneNumberRequest): Request[VerifyPhoneNumberResponse] = js.native
  /**
    * Validates verification code to verify phone number for the account. If successful this will overwrite the value of `accounts.businessinformation.phoneNumber`. Only verified phone
    * number will replace an existing verified phone number.
    */
  def verifyphonenumber(request: KeyMerchantId): Request[VerifyPhoneNumberResponse] = js.native
}
