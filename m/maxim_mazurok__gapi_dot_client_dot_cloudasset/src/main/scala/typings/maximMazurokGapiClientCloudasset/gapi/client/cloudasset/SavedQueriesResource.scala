package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudasset.anon.Filter
import typings.maximMazurokGapiClientCloudasset.anon.Key
import typings.maximMazurokGapiClientCloudasset.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudasset.anon.Parent
import typings.maximMazurokGapiClientCloudasset.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudasset.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedQueriesResource extends StObject {
  
  /** Creates a saved query in a parent project/folder/organization. */
  def create(request: Oauthtoken): Request[SavedQuery] = js.native
  def create(request: Parent, body: SavedQuery): Request[SavedQuery] = js.native
  
  /** Deletes a saved query. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets details about a saved query. */
  def get(): Request[SavedQuery] = js.native
  def get(request: Key): Request[SavedQuery] = js.native
  
  /** Lists all saved queries in a parent project/folder/organization. */
  def list(): Request[ListSavedQueriesResponse] = js.native
  def list(request: Filter): Request[ListSavedQueriesResponse] = js.native
  
  /** Updates a saved query. */
  def patch(request: PrettyPrint): Request[SavedQuery] = js.native
  def patch(request: QuotaUser, body: SavedQuery): Request[SavedQuery] = js.native
}
