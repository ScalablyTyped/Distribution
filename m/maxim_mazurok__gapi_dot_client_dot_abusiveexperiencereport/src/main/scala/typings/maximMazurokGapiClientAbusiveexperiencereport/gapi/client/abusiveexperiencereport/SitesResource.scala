package typings.maximMazurokGapiClientAbusiveexperiencereport.gapi.client.abusiveexperiencereport

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAbusiveexperiencereport.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends js.Object {
  
  /** Gets a site's Abusive Experience Report summary. */
  def get(): Request[SiteSummaryResponse] = js.native
  def get(request: Accesstoken): Request[SiteSummaryResponse] = js.native
}
