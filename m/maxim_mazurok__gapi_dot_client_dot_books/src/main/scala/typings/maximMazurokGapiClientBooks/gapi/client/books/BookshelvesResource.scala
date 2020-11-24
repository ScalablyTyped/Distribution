package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.Fields
import typings.maximMazurokGapiClientBooks.anon.Key
import typings.maximMazurokGapiClientBooks.anon.Oauthtoken
import typings.maximMazurokGapiClientBooks.anon.PrettyPrint
import typings.maximMazurokGapiClientBooks.anon.QuotaUser
import typings.maximMazurokGapiClientBooks.anon.Shelf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BookshelvesResource extends js.Object {
  
  /** Adds a volume to a bookshelf. */
  def addVolume(): Request[js.Object] = js.native
  def addVolume(request: Oauthtoken): Request[js.Object] = js.native
  
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(): Request[js.Object] = js.native
  def clearVolumes(request: PrettyPrint): Request[js.Object] = js.native
  
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(): Request[Bookshelf] = js.native
  def get(request: Fields): Request[Bookshelf] = js.native
  def get(request: PrettyPrint): Request[Bookshelf] = js.native
  
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(): Request[Bookshelves] = js.native
  def list(request: Key): Request[Bookshelves] = js.native
  def list(request: QuotaUser): Request[Bookshelves] = js.native
  
  /** Moves a volume within a bookshelf. */
  def moveVolume(): Request[js.Object] = js.native
  def moveVolume(request: Shelf): Request[js.Object] = js.native
  
  /** Removes a volume from a bookshelf. */
  def removeVolume(): Request[js.Object] = js.native
  def removeVolume(request: Oauthtoken): Request[js.Object] = js.native
  
  var volumes: VolumesResource = js.native
}
