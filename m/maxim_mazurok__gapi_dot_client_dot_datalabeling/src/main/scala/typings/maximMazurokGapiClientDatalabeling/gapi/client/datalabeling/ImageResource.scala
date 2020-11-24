package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResource extends js.Object {
  
  def label(request: Alt, body: GoogleCloudDatalabelingV1beta1LabelImageRequest): Request[GoogleLongrunningOperation] = js.native
  /** Starts a labeling task for image. The type of image labeling task is configured by feature in the request. */
  def label(request: PrettyPrint): Request[GoogleLongrunningOperation] = js.native
}
