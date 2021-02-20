package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Alt
import typings.maximMazurokGapiClientAndroidpublisher.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidpublisher.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracksResource extends StObject {
  
  /** Gets a track. */
  def get(): Request[Track] = js.native
  def get(request: Oauthtoken): Request[Track] = js.native
  
  /** Lists all tracks. */
  def list(): Request[TracksListResponse] = js.native
  def list(request: Alt): Request[TracksListResponse] = js.native
  
  def patch(request: Oauthtoken, body: Track): Request[Track] = js.native
  /** Patches a track. */
  def patch(request: PrettyPrint): Request[Track] = js.native
  
  def update(request: Oauthtoken, body: Track): Request[Track] = js.native
  /** Updates a track. */
  def update(request: PrettyPrint): Request[Track] = js.native
}
