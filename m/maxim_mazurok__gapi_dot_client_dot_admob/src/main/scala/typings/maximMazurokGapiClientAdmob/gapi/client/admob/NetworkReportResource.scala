package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmob.anon.Alt
import typings.maximMazurokGapiClientAdmob.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkReportResource extends StObject {
  
  def generate(request: Alt, body: GenerateNetworkReportRequest): Request[GenerateNetworkReportResponse] = js.native
  /** Generates an AdMob Network report based on the provided report specification. Returns result of a server-side streaming RPC. The result is returned in a sequence of responses. */
  def generate(request: Callback): Request[GenerateNetworkReportResponse] = js.native
}
