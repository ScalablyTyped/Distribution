package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoResource extends StObject {
  
  def label(request: Alt, body: GoogleCloudDatalabelingV1beta1LabelVideoRequest): Request[GoogleLongrunningOperation] = js.native
  /** Starts a labeling task for video. The type of video labeling task is configured by feature in the request. */
  def label(request: Resource): Request[GoogleLongrunningOperation] = js.native
}
