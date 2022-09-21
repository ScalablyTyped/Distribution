package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Fields
import typings.maximMazurokGapiClientAndroidpublisher.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsResource extends StObject {
  
  /** Gets details of an app. */
  def get(): Request[AppDetails] = js.native
  def get(request: Fields): Request[AppDetails] = js.native
  
  def patch(request: Fields, body: AppDetails): Request[AppDetails] = js.native
  /** Patches details of an app. */
  def patch(request: Oauthtoken): Request[AppDetails] = js.native
  
  def update(request: Fields, body: AppDetails): Request[AppDetails] = js.native
  /** Updates details of an app. */
  def update(request: Oauthtoken): Request[AppDetails] = js.native
}
