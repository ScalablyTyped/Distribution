package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextResource extends js.Object {
  
  def label(request: Alt, body: GoogleCloudDatalabelingV1beta1LabelTextRequest): Request[GoogleLongrunningOperation] = js.native
  /** Starts a labeling task for text. The type of text labeling task is configured by feature in the request. */
  def label(request: QuotaUser): Request[GoogleLongrunningOperation] = js.native
}
