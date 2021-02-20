package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudiot.anon.Callback
import typings.maximMazurokGapiClientCloudiot.anon.DeviceIds
import typings.maximMazurokGapiClientCloudiot.anon.FieldMask
import typings.maximMazurokGapiClientCloudiot.anon.Fields
import typings.maximMazurokGapiClientCloudiot.anon.Key
import typings.maximMazurokGapiClientCloudiot.anon.Name
import typings.maximMazurokGapiClientCloudiot.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudiot.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudiot.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  var configVersions: ConfigVersionsResource = js.native
  
  /** Creates a device in a device registry. */
  def create(request: Callback): Request[Device] = js.native
  def create(request: Fields, body: Device): Request[Device] = js.native
  
  /** Deletes a device. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets details about a device. */
  def get(): Request[Device] = js.native
  def get(request: FieldMask): Request[Device] = js.native
  
  /** List devices in a device registry. */
  def list(): Request[ListDevicesResponse] = js.native
  def list(request: DeviceIds): Request[ListDevicesResponse] = js.native
  
  def modifyCloudToDeviceConfig(request: Key, body: ModifyCloudToDeviceConfigRequest): Request[DeviceConfig] = js.native
  /** Modifies the configuration for the device, which is eventually sent from the Cloud IoT Core servers. Returns the modified configuration version and its metadata. */
  def modifyCloudToDeviceConfig(request: Name): Request[DeviceConfig] = js.native
  
  /** Updates a device. */
  def patch(request: Oauthtoken): Request[Device] = js.native
  def patch(request: PrettyPrint, body: Device): Request[Device] = js.native
  
  def sendCommandToDevice(request: Key, body: SendCommandToDeviceRequest): Request[js.Object] = js.native
  /**
    * Sends a command to the specified device. In order for a device to be able to receive commands, it must: 1) be connected to Cloud IoT Core using the MQTT protocol, and 2) be
    * subscribed to the group of MQTT topics specified by /devices/{device-id}/commands/#. This subscription will receive commands at the top-level topic /devices/{device-id}/commands as
    * well as commands for subfolders, like /devices/{device-id}/commands/subfolder. Note that subscribing to specific subfolders is not supported. If the command could not be delivered
    * to the device, this method will return an error; in particular, if the device is not subscribed, this method will return FAILED_PRECONDITION. Otherwise, this method will return OK.
    * If the subscription is QoS 1, at least once delivery will be guaranteed; for QoS 0, no acknowledgment will be expected from the device.
    */
  def sendCommandToDevice(request: QuotaUser): Request[js.Object] = js.native
  
  var states: StatesResource = js.native
}
