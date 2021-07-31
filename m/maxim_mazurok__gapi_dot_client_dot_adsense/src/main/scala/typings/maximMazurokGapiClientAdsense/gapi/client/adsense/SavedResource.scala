package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Alt
import typings.maximMazurokGapiClientAdsense.anon.Fields
import typings.maximMazurokGapiClientAdsense.anon.SavedReportId
import typings.maximMazurokGapiClientAdsense.anon.StartIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedResource extends StObject {
  
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(): Request[AdsenseReportsGenerateResponse] = js.native
  def generate(request: SavedReportId): Request[AdsenseReportsGenerateResponse] = js.native
  def generate(request: StartIndex): Request[AdsenseReportsGenerateResponse] = js.native
  
  /** List all saved reports in the specified AdSense account. */
  def list(): Request[SavedReports] = js.native
  def list(request: Alt): Request[SavedReports] = js.native
  def list(request: Fields): Request[SavedReports] = js.native
}
