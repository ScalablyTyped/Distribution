package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Fields
import typings.maximMazurokGapiClientDatalabeling.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExamplesResource extends StObject {
  
  /** Gets an example by resource name, including both data and annotation. */
  def get(): Request[GoogleCloudDatalabelingV1beta1Example] = js.native
  def get(request: Filter): Request[GoogleCloudDatalabelingV1beta1Example] = js.native
  
  /** Lists examples in an annotated dataset. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
}
