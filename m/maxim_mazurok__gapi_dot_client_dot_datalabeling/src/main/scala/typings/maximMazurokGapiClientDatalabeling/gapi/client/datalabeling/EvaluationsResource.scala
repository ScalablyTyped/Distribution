package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Callback
import typings.maximMazurokGapiClientDatalabeling.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationsResource extends js.Object {
  
  var exampleComparisons: ExampleComparisonsResource = js.native
  
  /** Gets an evaluation by resource name (to search, use projects.evaluations.search). */
  def get(): Request[GoogleCloudDatalabelingV1beta1Evaluation] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1Evaluation] = js.native
  
  /** Searches evaluations within a project. */
  def search(): Request[GoogleCloudDatalabelingV1beta1SearchEvaluationsResponse] = js.native
  def search(request: Fields): Request[GoogleCloudDatalabelingV1beta1SearchEvaluationsResponse] = js.native
}
