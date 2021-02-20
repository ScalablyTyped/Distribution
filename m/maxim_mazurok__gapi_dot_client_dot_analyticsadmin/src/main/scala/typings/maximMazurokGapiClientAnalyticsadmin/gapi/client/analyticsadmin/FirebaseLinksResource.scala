package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.AltCallback
import typings.maximMazurokGapiClientAnalyticsadmin.anon.CallbackFields
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseLinksResource extends StObject {
  
  /** Creates a FirebaseLink. Properties can have at most one FirebaseLink. */
  def create(request: AltCallback): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaFirebaseLink): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  
  /** Deletes a FirebaseLink on a property */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lists FirebaseLinks on a property. Properties can have at most one FirebaseLink. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  def list(request: Alt): Request[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  
  /** Updates a FirebaseLink on a property */
  def patch(request: CallbackFields): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaFirebaseLink): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
}
