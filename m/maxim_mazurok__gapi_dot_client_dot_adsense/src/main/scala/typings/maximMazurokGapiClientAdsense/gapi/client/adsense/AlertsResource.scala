package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.AlertId
import typings.maximMazurokGapiClientAdsense.anon.AlertIdAlt
import typings.maximMazurokGapiClientAdsense.anon.AltFields
import typings.maximMazurokGapiClientAdsense.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertsResource extends js.Object {
  
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(): Request[Unit] = js.native
  def delete(request: AlertId): Request[Unit] = js.native
  def delete(request: AlertIdAlt): Request[Unit] = js.native
  
  /** List the alerts for the specified AdSense account. */
  def list(): Request[Alerts] = js.native
  def list(request: AltFields): Request[Alerts] = js.native
  def list(request: Locale): Request[Alerts] = js.native
}
