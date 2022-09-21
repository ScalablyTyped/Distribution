package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.AccountIdAlt
import typings.maximMazurokGapiClientContent.anon.AccountIdAltCallback
import typings.maximMazurokGapiClientContent.anon.AltCallbackFieldsKeyOauthtoken
import typings.maximMazurokGapiClientContent.anon.PageToken
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingsettingsResource extends StObject {
  
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: AltCallbackFieldsKeyOauthtoken): Request[ShippingsettingsCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: ShippingsettingsCustomBatchRequest): Request[ShippingsettingsCustomBatchResponse] = js.native
  
  /** Retrieves the shipping settings of the account. */
  def get(): Request[ShippingSettings] = js.native
  def get(request: AccountIdAlt): Request[ShippingSettings] = js.native
  
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(): Request[ShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(request: AccesstokenAlt): Request[ShippingsettingsGetSupportedCarriersResponse] = js.native
  
  /** Retrieves supported holidays for an account. */
  def getsupportedholidays(): Request[ShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(request: AccesstokenAlt): Request[ShippingsettingsGetSupportedHolidaysResponse] = js.native
  
  /** Retrieves supported pickup services for an account. */
  def getsupportedpickupservices(): Request[ShippingsettingsGetSupportedPickupServicesResponse] = js.native
  def getsupportedpickupservices(request: AccesstokenAlt): Request[ShippingsettingsGetSupportedPickupServicesResponse] = js.native
  
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. */
  def list(): Request[ShippingsettingsListResponse] = js.native
  def list(request: PageToken): Request[ShippingsettingsListResponse] = js.native
  
  /** Updates the shipping settings of the account. Any fields that are not provided are deleted from the resource. */
  def update(request: AccountIdAltCallback): Request[ShippingSettings] = js.native
  def update(request: AccountIdAlt, body: ShippingSettings): Request[ShippingSettings] = js.native
}
