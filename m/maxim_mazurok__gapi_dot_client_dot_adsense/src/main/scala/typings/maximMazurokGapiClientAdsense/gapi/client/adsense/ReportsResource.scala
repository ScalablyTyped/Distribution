package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Dimension
import typings.maximMazurokGapiClientAdsense.anon.EndDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query
    * parameter.
    */
  def generate(): Request[AdsenseReportsGenerateResponse] = js.native
  def generate(request: Dimension): Request[AdsenseReportsGenerateResponse] = js.native
  def generate(request: EndDate): Request[AdsenseReportsGenerateResponse] = js.native
  
  var saved: SavedResource = js.native
}
