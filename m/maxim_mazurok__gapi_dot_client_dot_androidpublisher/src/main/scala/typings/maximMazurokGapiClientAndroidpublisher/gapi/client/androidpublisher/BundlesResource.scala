package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.AckBundleInstallationWarning
import typings.maximMazurokGapiClientAndroidpublisher.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundlesResource extends StObject {
  
  /** Lists all current Android App Bundles of the app and edit. */
  def list(): Request[BundlesListResponse] = js.native
  def list(request: Alt): Request[BundlesListResponse] = js.native
  
  /**
    * Uploads a new Android App Bundle to this edit. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a
    * timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
    */
  def upload(): Request[Bundle] = js.native
  def upload(request: AckBundleInstallationWarning): Request[Bundle] = js.native
}
