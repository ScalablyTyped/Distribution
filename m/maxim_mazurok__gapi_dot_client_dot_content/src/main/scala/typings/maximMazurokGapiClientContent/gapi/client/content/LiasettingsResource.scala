package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CallbackCountry
import typings.maximMazurokGapiClientContent.anon.CallbackFields
import typings.maximMazurokGapiClientContent.anon.ContactEmail
import typings.maximMazurokGapiClientContent.anon.GmbEmail
import typings.maximMazurokGapiClientContent.anon.Key
import typings.maximMazurokGapiClientContent.anon.MerchantIdOauthtoken
import typings.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientContent.anon.PosDataProviderId
import typings.maximMazurokGapiClientContent.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsResource extends StObject {
  
  def custombatch(request: Key, body: LiasettingsCustomBatchRequest): Request[LiasettingsCustomBatchResponse] = js.native
  /** Retrieves and/or updates the LIA settings of multiple accounts in a single request. */
  def custombatch(request: OauthtokenPrettyPrint): Request[LiasettingsCustomBatchResponse] = js.native
  
  /** Retrieves the LIA settings of the account. */
  def get(): Request[LiaSettings] = js.native
  def get(request: Uploadprotocol): Request[LiaSettings] = js.native
  
  /** Retrieves the list of accessible Google My Business accounts. */
  def getaccessiblegmbaccounts(): Request[LiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(request: Uploadprotocol): Request[LiasettingsGetAccessibleGmbAccountsResponse] = js.native
  
  /** Lists the LIA settings of the sub-accounts in your Merchant Center account. */
  def list(): Request[LiasettingsListResponse] = js.native
  def list(request: CallbackFields): Request[LiasettingsListResponse] = js.native
  
  /** Retrieves the list of POS data providers that have active settings for the all eiligible countries. */
  def listposdataproviders(): Request[LiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(request: Key): Request[LiasettingsListPosDataProvidersResponse] = js.native
  
  /** Requests access to a specified Google My Business account. */
  def requestgmbaccess(): Request[LiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(request: GmbEmail): Request[LiasettingsRequestGmbAccessResponse] = js.native
  
  /** Requests inventory validation for the specified country. */
  def requestinventoryverification(): Request[LiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(request: CallbackCountry): Request[LiasettingsRequestInventoryVerificationResponse] = js.native
  
  /** Sets the inventory verification contract for the specified country. */
  def setinventoryverificationcontact(): Request[LiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(request: ContactEmail): Request[LiasettingsSetInventoryVerificationContactResponse] = js.native
  
  /** Sets the POS data provider for the specified country. */
  def setposdataprovider(): Request[LiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(request: PosDataProviderId): Request[LiasettingsSetPosDataProviderResponse] = js.native
  
  /** Updates the LIA settings of the account. Any fields that are not provided are deleted from the resource. */
  def update(request: MerchantIdOauthtoken): Request[LiaSettings] = js.native
  def update(request: Uploadprotocol, body: LiaSettings): Request[LiaSettings] = js.native
}
