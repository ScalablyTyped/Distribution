package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Accesstoken
import typings.maximMazurokGapiClientAdsense.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlchannelsResource extends StObject {
  
  /** Gets information about the selected url channel. */
  def get(): Request[UrlChannel] = js.native
  def get(request: Accesstoken): Request[UrlChannel] = js.native
  
  /** Lists active url channels. */
  def list(): Request[ListUrlChannelsResponse] = js.native
  def list(request: Alt): Request[ListUrlChannelsResponse] = js.native
}
