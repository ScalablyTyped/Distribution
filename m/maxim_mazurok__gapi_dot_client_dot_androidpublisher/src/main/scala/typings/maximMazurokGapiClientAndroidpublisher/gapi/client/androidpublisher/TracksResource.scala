package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Fields
import typings.maximMazurokGapiClientAndroidpublisher.anon.Key
import typings.maximMazurokGapiClientAndroidpublisher.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracksResource extends StObject {
  
  /** Gets a track. */
  def get(): Request[Track] = js.native
  def get(request: Key): Request[Track] = js.native
  
  /** Lists all tracks. */
  def list(): Request[TracksListResponse] = js.native
  def list(request: Fields): Request[TracksListResponse] = js.native
  
  def patch(request: Key, body: Track): Request[Track] = js.native
  /** Patches a track. */
  def patch(request: Resource): Request[Track] = js.native
  
  def update(request: Key, body: Track): Request[Track] = js.native
  /** Updates a track. */
  def update(request: Resource): Request[Track] = js.native
}
