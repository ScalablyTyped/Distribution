package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.Accesstoken
import typings.maximMazurokGapiClientCloudidentity.anon.AndroidId
import typings.maximMazurokGapiClientCloudidentity.anon.Fields
import typings.maximMazurokGapiClientCloudidentity.anon.Filter
import typings.maximMazurokGapiClientCloudidentity.anon.Key
import typings.maximMazurokGapiClientCloudidentity.anon.Name
import typings.maximMazurokGapiClientCloudidentity.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudidentity.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceUsersResource extends StObject {
  
  /** Approves device to access user data. */
  def approve(request: Fields): Request[Operation] = js.native
  def approve(request: Key, body: GoogleAppsCloudidentityDevicesV1ApproveDeviceUserRequest): Request[Operation] = js.native
  
  def block(request: Key, body: GoogleAppsCloudidentityDevicesV1BlockDeviceUserRequest): Request[Operation] = js.native
  /** Blocks device from accessing user data */
  def block(request: Name): Request[Operation] = js.native
  
  def cancelWipe(request: Key, body: GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserRequest): Request[Operation] = js.native
  /** Cancels an unfinished user account wipe. This operation can be used to cancel device wipe in the gap between the wipe operation returning success and the device being wiped. */
  def cancelWipe(request: Oauthtoken): Request[Operation] = js.native
  
  var clientStates: ClientStatesResource = js.native
  
  /** Deletes the specified DeviceUser. This also revokes the user's access to device data. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  /** Retrieves the specified DeviceUser */
  def get(): Request[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
  def get(request: Accesstoken): Request[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
  
  /** Lists/Searches DeviceUsers. */
  def list(): Request[GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] = js.native
  def list(request: Filter): Request[GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] = js.native
  
  /**
    * Looks up resource names of the DeviceUsers associated with the caller's credentials, as well as the properties provided in the request. This method must be called with end-user
    * credentials with the scope: https://www.googleapis.com/auth/cloud-identity.devices.lookup If multiple properties are provided, only DeviceUsers having all of these properties are
    * considered as matches - i.e. the query behaves like an AND. Different platforms require different amounts of information from the caller to ensure that the DeviceUser is uniquely
    * identified. - iOS: No properties need to be passed, the caller's credentials are sufficient to identify the corresponding DeviceUser. - Android: Specifying the 'android_id' field is
    * required. - Desktop: Specifying the 'raw_resource_id' field is required.
    */
  def lookup(): Request[GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse] = js.native
  def lookup(request: AndroidId): Request[GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse] = js.native
  
  def wipe(request: Key, body: GoogleAppsCloudidentityDevicesV1WipeDeviceUserRequest): Request[Operation] = js.native
  /**
    * Wipes the user's account on a device. Other data on the device that is not associated with the user's work account is not affected. For example, if a Gmail app is installed on a
    * device that is used for personal and work purposes, and the user is logged in to the Gmail app with their personal account as well as their work account, wiping the "deviceUser" by
    * their work administrator will not affect their personal account within Gmail or other apps such as Photos.
    */
  def wipe(request: PrettyPrint): Request[Operation] = js.native
}
