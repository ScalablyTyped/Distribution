package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmob.anon.Callback
import typings.maximMazurokGapiClientAdmob.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkReportResource extends StObject {
  
  def generate(request: Callback, body: GenerateNetworkReportRequest): Request[GenerateNetworkReportResponse] = js.native
  /** Generates an AdMob Network report based on the provided report specification. Returns result of a server-side streaming RPC. The result is returned in a sequence of responses. */
  def generate(request: Fields): Request[GenerateNetworkReportResponse] = js.native
}
