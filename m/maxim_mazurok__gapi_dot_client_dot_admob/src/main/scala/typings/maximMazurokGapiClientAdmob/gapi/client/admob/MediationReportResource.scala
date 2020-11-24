package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmob.anon.Accesstoken
import typings.maximMazurokGapiClientAdmob.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediationReportResource extends js.Object {
  
  /** Generates an AdMob Mediation report based on the provided report specification. Returns result of a server-side streaming RPC. The result is returned in a sequence of responses. */
  def generate(request: Accesstoken): Request[GenerateMediationReportResponse] = js.native
  def generate(request: Alt, body: GenerateMediationReportRequest): Request[GenerateMediationReportResponse] = js.native
}
