package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAdvertiserId
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserIdAlt
import typings.maximMazurokGapiClientDisplayvideo.anon.AltCallback
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackChannelId
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFields
import typings.maximMazurokGapiClientDisplayvideo.anon.ChannelIdFields
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsKey
import typings.maximMazurokGapiClientDisplayvideo.anon.PageSize
import typings.maximMazurokGapiClientDisplayvideo.anon.PageToken
import typings.maximMazurokGapiClientDisplayvideo.anon.PrettyPrint
import typings.maximMazurokGapiClientDisplayvideo.anon.UpdateMask
import typings.maximMazurokGapiClientDisplayvideo.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  /** Creates a new channel. Returns the newly created channel if successful. */
  def create(request: AccesstokenAdvertiserId): Request[Channel] = js.native
  def create(request: AdvertiserIdAlt, body: Channel): Request[Channel] = js.native
  /** Creates a new channel. Returns the newly created channel if successful. */
  def create(request: CallbackFields): Request[Channel] = js.native
  def create(request: FieldsKey, body: Channel): Request[Channel] = js.native
  
  /** Gets a channel for a partner or advertiser. */
  def get(): Request[Channel] = js.native
  def get(request: PrettyPrint): Request[Channel] = js.native
  def get(request: Xgafv): Request[Channel] = js.native
  
  /** Lists channels for a partner or advertiser. */
  def list(): Request[ListChannelsResponse] = js.native
  def list(request: PageSize): Request[ListChannelsResponse] = js.native
  def list(request: PageToken): Request[ListChannelsResponse] = js.native
  
  def patch(request: AltCallback, body: Channel): Request[Channel] = js.native
  /** Updates a channel. Returns the updated channel if successful. */
  def patch(request: CallbackChannelId): Request[Channel] = js.native
  def patch(request: ChannelIdFields, body: Channel): Request[Channel] = js.native
  /** Updates a channel. Returns the updated channel if successful. */
  def patch(request: UpdateMask): Request[Channel] = js.native
  
  var sites: SitesResource = js.native
}
