package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsreporting.anon.Accesstoken
import typings.maximMazurokGapiClientAnalyticsreporting.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  /** Returns the Analytics data. */
  def batchGet(request: Accesstoken): Request[GetReportsResponse] = js.native
  def batchGet(request: Alt, body: GetReportsRequest): Request[GetReportsResponse] = js.native
}
