package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.AccesstokenAlt
import typings.maximMazurokGapiClientCloudidentity.anon.Alt
import typings.maximMazurokGapiClientCloudidentity.anon.Customer
import typings.maximMazurokGapiClientCloudidentity.anon.PageSize
import typings.maximMazurokGapiClientCloudidentity.anon.UploadType
import typings.maximMazurokGapiClientCloudidentity.anon.Uploadprotocol
import typings.maximMazurokGapiClientCloudidentity.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  def cancelWipe(request: Alt, body: GoogleAppsCloudidentityDevicesV1CancelWipeDeviceRequest): Request[Operation] = js.native
  /**
    * Cancels an unfinished device wipe. This operation can be used to cancel device wipe in the gap between the wipe operation returning success and the device being wiped. This
    * operation is possible when the device is in a "pending wipe" state. The device enters the "pending wipe" state when a wipe device command is issued, but has not yet been sent to the
    * device. The cancel wipe will fail if the wipe command has already been issued to the device.
    */
  def cancelWipe(request: UploadType): Request[Operation] = js.native
  
  /**
    * Creates a device. Only company-owned device may be created. **Note**: This method is available only to customers who have one of the following SKUs: Enterprise Standard, Enterprise
    * Plus, Enterprise for Education, and Cloud Identity Premium
    */
  def create(request: Uploadprotocol): Request[Operation] = js.native
  def create(request: Xgafv, body: GoogleAppsCloudidentityDevicesV1Device): Request[Operation] = js.native
  
  /** Deletes the specified device. */
  def delete(): Request[Operation] = js.native
  def delete(request: Customer): Request[Operation] = js.native
  
  var deviceUsers: DeviceUsersResource = js.native
  
  /** Retrieves the specified device. */
  def get(): Request[GoogleAppsCloudidentityDevicesV1Device] = js.native
  def get(request: Customer): Request[GoogleAppsCloudidentityDevicesV1Device] = js.native
  
  /** Lists/Searches devices. */
  def list(): Request[GoogleAppsCloudidentityDevicesV1ListDevicesResponse] = js.native
  def list(request: PageSize): Request[GoogleAppsCloudidentityDevicesV1ListDevicesResponse] = js.native
  
  /** Wipes all data on the specified device. */
  def wipe(request: AccesstokenAlt): Request[Operation] = js.native
  def wipe(request: Alt, body: GoogleAppsCloudidentityDevicesV1WipeDeviceRequest): Request[Operation] = js.native
}
