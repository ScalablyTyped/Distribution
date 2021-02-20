package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExampleComparisonsResource extends StObject {
  
  def search(request: Alt, body: GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest): Request[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
  /**
    * Searches example comparisons from an evaluation. The return format is a list of example comparisons that show ground truth and prediction(s) for a single input. Search by providing
    * an evaluation ID.
    */
  def search(request: Parent): Request[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
}
