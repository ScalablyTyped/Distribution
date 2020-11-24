package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Alt
import typings.maximMazurokGapiClientAndroidpublisher.anon.Key
import typings.maximMazurokGapiClientAndroidpublisher.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListingsResource extends js.Object {
  
  /** Deletes a localized store listing. */
  def delete(): Request[Unit] = js.native
  def delete(request: Key): Request[Unit] = js.native
  
  /** Deletes all store listings. */
  def deleteall(): Request[Unit] = js.native
  def deleteall(request: Alt): Request[Unit] = js.native
  
  /** Gets a localized store listing. */
  def get(): Request[Listing] = js.native
  def get(request: Key): Request[Listing] = js.native
  
  /** Lists all localized store listings. */
  def list(): Request[ListingsListResponse] = js.native
  def list(request: Alt): Request[ListingsListResponse] = js.native
  
  def patch(request: Key, body: Listing): Request[Listing] = js.native
  /** Patches a localized store listing. */
  def patch(request: Language): Request[Listing] = js.native
  
  def update(request: Key, body: Listing): Request[Listing] = js.native
  /** Creates or updates a localized store listing. */
  def update(request: Language): Request[Listing] = js.native
}
