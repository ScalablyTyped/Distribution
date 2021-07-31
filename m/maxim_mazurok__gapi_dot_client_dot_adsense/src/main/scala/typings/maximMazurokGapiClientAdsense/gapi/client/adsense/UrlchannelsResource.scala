package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Key
import typings.maximMazurokGapiClientAdsense.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlchannelsResource extends StObject {
  
  /** List all URL channels in the specified ad client for the specified account. */
  def list(): Request[UrlChannels] = js.native
  def list(request: Key): Request[UrlChannels] = js.native
  def list(request: MaxResults): Request[UrlChannels] = js.native
}
