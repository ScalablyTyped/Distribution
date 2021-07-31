package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typings.maximMazurokGapiClientAndroidmanagement.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidmanagement.anon.PrettyPrint
import typings.maximMazurokGapiClientAndroidmanagement.anon.QuotaUser
import typings.maximMazurokGapiClientAndroidmanagement.anon.UpdateMask
import typings.maximMazurokGapiClientAndroidmanagement.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAppsResource extends StObject {
  
  def create(request: QuotaUser, body: WebApp): Request[WebApp] = js.native
  /** Creates a web app. */
  def create(request: UploadType): Request[WebApp] = js.native
  
  /** Deletes a web app. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a web app. */
  def get(): Request[WebApp] = js.native
  def get(request: Alt): Request[WebApp] = js.native
  
  /** Lists web apps for a given enterprise. */
  def list(): Request[ListWebAppsResponse] = js.native
  def list(request: Oauthtoken): Request[ListWebAppsResponse] = js.native
  
  def patch(request: PrettyPrint, body: WebApp): Request[WebApp] = js.native
  /** Updates a web app. */
  def patch(request: UpdateMask): Request[WebApp] = js.native
}
