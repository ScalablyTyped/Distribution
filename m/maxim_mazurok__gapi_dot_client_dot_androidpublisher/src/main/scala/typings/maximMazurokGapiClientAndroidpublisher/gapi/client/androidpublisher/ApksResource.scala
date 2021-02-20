package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Accesstoken
import typings.maximMazurokGapiClientAndroidpublisher.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApksResource extends StObject {
  
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to organizations using Managed Play
    * whose application is configured to restrict distribution to the organizations.
    */
  def addexternallyhosted(request: Accesstoken): Request[ApksAddExternallyHostedResponse] = js.native
  def addexternallyhosted(request: Alt, body: ApksAddExternallyHostedRequest): Request[ApksAddExternallyHostedResponse] = js.native
  
  /** Lists all current APKs of the app and edit. */
  def list(): Request[ApksListResponse] = js.native
  def list(request: Alt): Request[ApksListResponse] = js.native
  
  /** Uploads an APK and adds to the current edit. */
  def upload(): Request[Apk] = js.native
  def upload(request: Alt): Request[Apk] = js.native
}
