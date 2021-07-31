package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Alt
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.anon.CallbackFields
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.anon.FieldsKey
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.anon.KeyOauthtoken
import typings.maximMazurokGapiClientAndroiddeviceprovisioning.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomersResource extends StObject {
  
  var configurations: ConfigurationsResource = js.native
  
  def create(request: Alt, body: CreateCustomerRequest): Request[Company] = js.native
  /**
    * Creates a customer for zero-touch enrollment. After the method returns successfully, admin and owner roles can manage devices and EMM configs by calling API methods or using their
    * zero-touch enrollment portal. The customer receives an email that welcomes them to zero-touch enrollment and explains how to sign into the portal.
    */
  def create(request: CallbackFields): Request[Company] = js.native
  
  var devices: DevicesResource = js.native
  
  var dpcs: DpcsResource = js.native
  
  /** Lists the user's customer accounts. */
  /**
    * Lists the customers that are enrolled to the reseller identified by the `partnerId` argument. This list includes customers that the reseller created and customers that enrolled
    * themselves using the portal.
    */
  /** Lists the customers of the vendor. */
  def list(): Request[CustomerListCustomersResponse] = js.native
  def list(request: FieldsKey): Request[ListCustomersResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListVendorCustomersResponse] = js.native
  def list(request: PageToken): Request[CustomerListCustomersResponse] = js.native
}
