package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.Accesstoken
import typings.maximMazurokGapiClientAndroidenterprise.anon.InstallId
import typings.maximMazurokGapiClientAndroidenterprise.anon.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallsResource extends StObject {
  
  /** Requests to remove an app from a device. A call to get or list will still show the app as installed on the device until it is actually removed. */
  def delete(): Request[Unit] = js.native
  def delete(request: InstallId): Request[Unit] = js.native
  
  /** Retrieves details of an installation of an app on a device. */
  def get(): Request[Install] = js.native
  def get(request: InstallId): Request[Install] = js.native
  
  /** Retrieves the details of all apps installed on the specified device. */
  def list(): Request[InstallsListResponse] = js.native
  def list(request: Accesstoken): Request[InstallsListResponse] = js.native
  
  def update(request: InstallId, body: Install): Request[Install] = js.native
  /** Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary. */
  def update(request: UserId): Request[Install] = js.native
}
