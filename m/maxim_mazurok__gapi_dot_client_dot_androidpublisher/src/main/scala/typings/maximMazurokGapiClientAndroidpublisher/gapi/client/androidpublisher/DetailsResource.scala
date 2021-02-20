package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Alt
import typings.maximMazurokGapiClientAndroidpublisher.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsResource extends StObject {
  
  /** Gets details of an app. */
  def get(): Request[AppDetails] = js.native
  def get(request: Alt): Request[AppDetails] = js.native
  
  def patch(request: Alt, body: AppDetails): Request[AppDetails] = js.native
  /** Patches details of an app. */
  def patch(request: Callback): Request[AppDetails] = js.native
  
  def update(request: Alt, body: AppDetails): Request[AppDetails] = js.native
  /** Updates details of an app. */
  def update(request: Callback): Request[AppDetails] = js.native
}
