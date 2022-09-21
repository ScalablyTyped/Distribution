package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAccountIdAlt
import typings.maximMazurokGapiClientContent.anon.AccountIdAlt
import typings.maximMazurokGapiClientContent.anon.CallbackCountry
import typings.maximMazurokGapiClientContent.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientContent.anon.ContactEmail
import typings.maximMazurokGapiClientContent.anon.GmbEmail
import typings.maximMazurokGapiClientContent.anon.PageToken
import typings.maximMazurokGapiClientContent.anon.PosDataProviderId
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsResource extends StObject {
  
  /** Retrieves and/or updates the LIA settings of multiple accounts in a single request. */
  def custombatch(request: CallbackFieldsKey): Request[LiasettingsCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: LiasettingsCustomBatchRequest): Request[LiasettingsCustomBatchResponse] = js.native
  
  /** Retrieves the LIA settings of the account. */
  def get(): Request[LiaSettings] = js.native
  def get(request: AccountIdAlt): Request[LiaSettings] = js.native
  
  /** Retrieves the list of accessible Business Profiles. */
  def getaccessiblegmbaccounts(): Request[LiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(request: AccountIdAlt): Request[LiasettingsGetAccessibleGmbAccountsResponse] = js.native
  
  /** Lists the LIA settings of the sub-accounts in your Merchant Center account. */
  def list(): Request[LiasettingsListResponse] = js.native
  def list(request: PageToken): Request[LiasettingsListResponse] = js.native
  
  /** Retrieves the list of POS data providers that have active settings for the all eiligible countries. */
  def listposdataproviders(): Request[LiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(request: UploadType): Request[LiasettingsListPosDataProvidersResponse] = js.native
  
  /** Requests access to a specified Business Profile. */
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
  def update(request: AccesstokenAccountIdAlt): Request[LiaSettings] = js.native
  def update(request: AccountIdAlt, body: LiaSettings): Request[LiaSettings] = js.native
}
