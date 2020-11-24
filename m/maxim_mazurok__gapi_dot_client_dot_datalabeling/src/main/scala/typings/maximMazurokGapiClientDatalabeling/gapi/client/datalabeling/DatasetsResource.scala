package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.Callback
import typings.maximMazurokGapiClientDatalabeling.anon.Fields
import typings.maximMazurokGapiClientDatalabeling.anon.Name
import typings.maximMazurokGapiClientDatalabeling.anon.UploadType
import typings.maximMazurokGapiClientDatalabeling.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetsResource extends js.Object {
  
  var annotatedDatasets: AnnotatedDatasetsResource = js.native
  
  def create(request: Alt, body: GoogleCloudDatalabelingV1beta1CreateDatasetRequest): Request[GoogleCloudDatalabelingV1beta1Dataset] = js.native
  /** Creates dataset. If success return a Dataset resource. */
  def create(request: UploadType): Request[GoogleCloudDatalabelingV1beta1Dataset] = js.native
  
  var dataItems: DataItemsResource = js.native
  
  /** Deletes a dataset by resource name. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  var evaluations: EvaluationsResource = js.native
  
  def exportData(request: Callback, body: GoogleCloudDatalabelingV1beta1ExportDataRequest): Request[GoogleLongrunningOperation] = js.native
  /** Exports data and annotations from dataset. */
  def exportData(request: Name): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets dataset by resource name. */
  def get(): Request[GoogleCloudDatalabelingV1beta1Dataset] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1Dataset] = js.native
  
  var image: ImageResource = js.native
  
  def importData(request: Callback, body: GoogleCloudDatalabelingV1beta1ImportDataRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Imports data into dataset based on source locations defined in request. It can be called multiple times for the same dataset. Each dataset can only have one long running operation
    * running on it. For example, no labeling task (also long running operation) can be started while importing is still ongoing. Vice versa.
    */
  def importData(request: Uploadprotocol): Request[GoogleLongrunningOperation] = js.native
  
  /** Lists datasets under a project. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListDatasetsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListDatasetsResponse] = js.native
  
  var text: TextResource = js.native
  
  var video: VideoResource = js.native
}
