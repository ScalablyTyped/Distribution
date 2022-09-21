package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudasset.anon.Callback
import typings.maximMazurokGapiClientCloudasset.anon.Fields
import typings.maximMazurokGapiClientCloudasset.anon.Key
import typings.maximMazurokGapiClientCloudasset.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedsResource extends StObject {
  
  /** Creates a feed in a parent project/folder/organization to listen to its asset updates. */
  def create(request: Callback): Request[Feed] = js.native
  def create(request: Fields, body: CreateFeedRequest): Request[Feed] = js.native
  
  /** Deletes an asset feed. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets details about an asset feed. */
  def get(): Request[Feed] = js.native
  def get(request: Key): Request[Feed] = js.native
  
  /** Lists all asset feeds in a parent project/folder/organization. */
  def list(): Request[ListFeedsResponse] = js.native
  def list(request: Fields): Request[ListFeedsResponse] = js.native
  
  def patch(request: Key, body: UpdateFeedRequest): Request[Feed] = js.native
  /** Updates an asset feed configuration. */
  def patch(request: Name): Request[Feed] = js.native
}
