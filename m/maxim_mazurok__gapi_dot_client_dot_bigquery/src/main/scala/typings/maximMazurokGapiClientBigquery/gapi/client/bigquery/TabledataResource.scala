package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquery.anon.AltDatasetId
import typings.maximMazurokGapiClientBigquery.anon.SelectedFields
import typings.maximMazurokGapiClientBigquery.anon.TableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabledataResource extends js.Object {
  
  def insertAll(request: AltDatasetId, body: TableDataInsertAllRequest): Request[TableDataInsertAllResponse] = js.native
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: TableId): Request[TableDataInsertAllResponse] = js.native
  
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(): Request[TableDataList] = js.native
  def list(request: SelectedFields): Request[TableDataList] = js.native
}
