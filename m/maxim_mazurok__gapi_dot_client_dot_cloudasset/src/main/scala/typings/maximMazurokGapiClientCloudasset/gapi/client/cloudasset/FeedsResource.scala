package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudasset.anon.Accesstoken
import typings.maximMazurokGapiClientCloudasset.anon.Alt
import typings.maximMazurokGapiClientCloudasset.anon.Callback
import typings.maximMazurokGapiClientCloudasset.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedsResource extends StObject {
  
  /** Creates a feed in a parent project/folder/organization to listen to its asset updates. */
  def create(request: Accesstoken): Request[Feed] = js.native
  def create(request: Alt, body: CreateFeedRequest): Request[Feed] = js.native
  
  /** Deletes an asset feed. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets details about an asset feed. */
  def get(): Request[Feed] = js.native
  def get(request: Callback): Request[Feed] = js.native
  
  /** Lists all asset feeds in a parent project/folder/organization. */
  def list(): Request[ListFeedsResponse] = js.native
  def list(request: Alt): Request[ListFeedsResponse] = js.native
  
  def patch(request: Callback, body: UpdateFeedRequest): Request[Feed] = js.native
  /** Updates an asset feed configuration. */
  def patch(request: Fields): Request[Feed] = js.native
}
