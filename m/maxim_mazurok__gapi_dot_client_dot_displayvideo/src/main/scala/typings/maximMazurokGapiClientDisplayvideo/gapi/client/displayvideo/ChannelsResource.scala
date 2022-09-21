package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackChannelId
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFields
import typings.maximMazurokGapiClientDisplayvideo.anon.FilterKey
import typings.maximMazurokGapiClientDisplayvideo.anon.OauthtokenOrderBy
import typings.maximMazurokGapiClientDisplayvideo.anon.PartnerIdPrettyPrint
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserUpdateMask
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.ResourceUpdateMask
import typings.maximMazurokGapiClientDisplayvideo.anon.ResourceUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.UpdateMaskUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientDisplayvideo.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  /** Creates a new channel. Returns the newly created channel if successful. */
  def create(request: CallbackFields): Request[Channel] = js.native
  def create(request: QuotaUserUploadType, body: Channel): Request[Channel] = js.native
  /** Creates a new channel. Returns the newly created channel if successful. */
  def create(request: ResourceUploadType): Request[Channel] = js.native
  def create(request: UploadTypeUploadprotocol, body: Channel): Request[Channel] = js.native
  
  /** Gets a channel for a partner or advertiser. */
  def get(): Request[Channel] = js.native
  def get(request: CallbackChannelId): Request[Channel] = js.native
  def get(request: PartnerIdPrettyPrint): Request[Channel] = js.native
  
  /** Lists channels for a partner or advertiser. */
  def list(): Request[ListChannelsResponse] = js.native
  def list(request: FilterKey): Request[ListChannelsResponse] = js.native
  def list(request: OauthtokenOrderBy): Request[ListChannelsResponse] = js.native
  
  def patch(request: QuotaUserUpdateMask, body: Channel): Request[Channel] = js.native
  /** Updates a channel. Returns the updated channel if successful. */
  def patch(request: ResourceUpdateMask): Request[Channel] = js.native
  /** Updates a channel. Returns the updated channel if successful. */
  def patch(request: UpdateMaskUploadType): Request[Channel] = js.native
  def patch(request: UploadprotocolXgafv, body: Channel): Request[Channel] = js.native
  
  var sites: SitesResource = js.native
}
