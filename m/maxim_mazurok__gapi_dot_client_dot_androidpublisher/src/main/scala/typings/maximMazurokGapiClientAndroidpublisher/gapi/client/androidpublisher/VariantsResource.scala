package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.KeyOauthtoken
import typings.maximMazurokGapiClientAndroidpublisher.anon.VariantId
import typings.maximMazurokGapiClientAndroidpublisher.anon.VersionCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariantsResource extends StObject {
  
  def create(request: KeyOauthtoken, body: Variant): Request[Variant] = js.native
  /** Creates an APK which is suitable for inclusion in a system image from an already uploaded Android App Bundle. */
  def create(request: VersionCode): Request[Variant] = js.native
  
  /** Downloads a previously created system APK which is suitable for inclusion in a system image. */
  def download(): Request[Unit] = js.native
  def download(request: VariantId): Request[Unit] = js.native
  
  /** Returns a previously created system APK variant. */
  def get(): Request[Variant] = js.native
  def get(request: VariantId): Request[Variant] = js.native
  
  /** Returns the list of previously created system APK variants. */
  def list(): Request[SystemApksListResponse] = js.native
  def list(request: KeyOauthtoken): Request[SystemApksListResponse] = js.native
}
