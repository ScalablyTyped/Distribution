package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Callback
import typings.maximMazurokGapiClientDatalabeling.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataItemsResource extends StObject {
  
  /** Gets a data item in a dataset by resource name. This API can be called after data are imported into dataset. */
  def get(): Request[GoogleCloudDatalabelingV1beta1DataItem] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1DataItem] = js.native
  
  /** Lists data items in a dataset. This API can be called after data are imported into dataset. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListDataItemsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListDataItemsResponse] = js.native
}
