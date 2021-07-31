package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsensehost.anon.AdClientId
import typings.maximMazurokGapiClientAdsensehost.anon.CustomChannelId
import typings.maximMazurokGapiClientAdsensehost.anon.MaxResults
import typings.maximMazurokGapiClientAdsensehost.anon.Resource
import typings.maximMazurokGapiClientAdsensehost.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomchannelsResource extends StObject {
  
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(): Request[CustomChannel] = js.native
  def delete(request: CustomChannelId): Request[CustomChannel] = js.native
  
  /** Get a specific custom channel from the host AdSense account. */
  def get(): Request[CustomChannel] = js.native
  def get(request: CustomChannelId): Request[CustomChannel] = js.native
  
  def insert(request: AdClientId, body: CustomChannel): Request[CustomChannel] = js.native
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: Resource): Request[CustomChannel] = js.native
  
  /** List all host custom channels in this AdSense account. */
  def list(): Request[CustomChannels] = js.native
  def list(request: MaxResults): Request[CustomChannels] = js.native
  
  def patch(request: CustomChannelId, body: CustomChannel): Request[CustomChannel] = js.native
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: UserIp): Request[CustomChannel] = js.native
  
  def update(request: AdClientId, body: CustomChannel): Request[CustomChannel] = js.native
  /** Update a custom channel in the host AdSense account. */
  def update(request: Resource): Request[CustomChannel] = js.native
}
