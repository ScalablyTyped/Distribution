package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.ChangesNotSentForReview
import typings.maximMazurokGapiClientAndroidpublisher.anon.Fields
import typings.maximMazurokGapiClientAndroidpublisher.anon.UploadType
import typings.maximMazurokGapiClientAndroidpublisher.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditsResource extends StObject {
  
  var apks: ApksResource = js.native
  
  var bundles: BundlesResource = js.native
  
  /** Commits an app edit. */
  def commit(): Request[AppEdit] = js.native
  def commit(request: ChangesNotSentForReview): Request[AppEdit] = js.native
  
  var countryavailability: CountryavailabilityResource = js.native
  
  /** Deletes an app edit. */
  def delete(): Request[Unit] = js.native
  def delete(request: Fields): Request[Unit] = js.native
  
  var deobfuscationfiles: DeobfuscationfilesResource = js.native
  
  var details: DetailsResource = js.native
  
  var expansionfiles: ExpansionfilesResource = js.native
  
  /** Gets an app edit. */
  def get(): Request[AppEdit] = js.native
  def get(request: Fields): Request[AppEdit] = js.native
  
  var images: ImagesResource = js.native
  
  /** Creates a new edit for an app. */
  def insert(request: UploadType): Request[AppEdit] = js.native
  def insert(request: Uploadprotocol, body: AppEdit): Request[AppEdit] = js.native
  
  var listings: ListingsResource = js.native
  
  var testers: TestersResource = js.native
  
  var tracks: TracksResource = js.native
  
  /** Validates an app edit. */
  def validate(): Request[AppEdit] = js.native
  def validate(request: Fields): Request[AppEdit] = js.native
}
