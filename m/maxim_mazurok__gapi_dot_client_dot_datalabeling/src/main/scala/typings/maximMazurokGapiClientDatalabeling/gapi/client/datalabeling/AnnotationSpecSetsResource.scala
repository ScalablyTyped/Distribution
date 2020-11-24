package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Accesstoken
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.Callback
import typings.maximMazurokGapiClientDatalabeling.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationSpecSetsResource extends js.Object {
  
  /** Creates an annotation spec set by providing a set of labels. */
  def create(request: Accesstoken): Request[GoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def create(request: Alt, body: GoogleCloudDatalabelingV1beta1CreateAnnotationSpecSetRequest): Request[GoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  
  /** Deletes an annotation spec set by resource name. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an annotation spec set by resource name. */
  def get(): Request[GoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  
  /** Lists annotation spec sets for a project. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse] = js.native
}
