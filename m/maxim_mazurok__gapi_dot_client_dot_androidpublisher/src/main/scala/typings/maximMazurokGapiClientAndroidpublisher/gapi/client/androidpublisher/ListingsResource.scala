package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Fields
import typings.maximMazurokGapiClientAndroidpublisher.anon.Language
import typings.maximMazurokGapiClientAndroidpublisher.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListingsResource extends StObject {
  
  /** Deletes a localized store listing. */
  def delete(): Request[Unit] = js.native
  def delete(request: Language): Request[Unit] = js.native
  
  /** Deletes all store listings. */
  def deleteall(): Request[Unit] = js.native
  def deleteall(request: Fields): Request[Unit] = js.native
  
  /** Gets a localized store listing. */
  def get(): Request[Listing] = js.native
  def get(request: Language): Request[Listing] = js.native
  
  /** Lists all localized store listings. */
  def list(): Request[ListingsListResponse] = js.native
  def list(request: Fields): Request[ListingsListResponse] = js.native
  
  def patch(request: Language, body: Listing): Request[Listing] = js.native
  /** Patches a localized store listing. */
  def patch(request: PrettyPrint): Request[Listing] = js.native
  
  def update(request: Language, body: Listing): Request[Listing] = js.native
  /** Creates or updates a localized store listing. */
  def update(request: PrettyPrint): Request[Listing] = js.native
}
