package typings.maximMazurokGapiClientAbusiveexperiencereport.gapi.client.abusiveexperiencereport

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAbusiveexperiencereport.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolatingSitesResource extends js.Object {
  
  /** Lists sites that are failing in the Abusive Experience Report. */
  def list(): Request[ViolatingSitesResponse] = js.native
  def list(request: Alt): Request[ViolatingSitesResponse] = js.native
}
