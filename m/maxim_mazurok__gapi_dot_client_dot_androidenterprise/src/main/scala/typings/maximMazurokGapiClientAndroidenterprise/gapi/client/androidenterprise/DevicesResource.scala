package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.Accesstoken
import typings.maximMazurokGapiClientAndroidenterprise.anon.Alt
import typings.maximMazurokGapiClientAndroidenterprise.anon.Callback
import typings.maximMazurokGapiClientAndroidenterprise.anon.DeviceId
import typings.maximMazurokGapiClientAndroidenterprise.anon.EnterpriseId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  /**
    * Uploads a report containing any changes in app states on the device since the last report was generated. You can call this method up to 3 times every 24 hours for a given device. If
    * you exceed the quota, then the Google Play EMM API returns HTTP 429 Too Many Requests.
    */
  def forceReportUpload(): Request[Unit] = js.native
  def forceReportUpload(request: Accesstoken): Request[Unit] = js.native
  
  /** Retrieves the details of a device. */
  def get(): Request[Device] = js.native
  def get(request: Accesstoken): Request[Device] = js.native
  
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android devices is enabled in the
    * Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is only supported for Google-managed users.
    */
  def getState(): Request[DeviceState] = js.native
  def getState(request: Accesstoken): Request[DeviceState] = js.native
  
  /** Retrieves the IDs of all of a user's devices. */
  def list(): Request[DevicesListResponse] = js.native
  def list(request: Alt): Request[DevicesListResponse] = js.native
  
  def setState(request: Accesstoken, body: DeviceState): Request[DeviceState] = js.native
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android devices is enabled in the Google
    * Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is only supported for Google-managed users.
    */
  def setState(request: Callback): Request[DeviceState] = js.native
  
  /** Updates the device policy */
  def update(request: DeviceId): Request[Device] = js.native
  def update(request: EnterpriseId, body: Device): Request[Device] = js.native
}
