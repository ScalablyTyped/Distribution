package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.AccesstokenAlt
import typings.maximMazurokGapiClientCloudsearch.anon.AltCallback
import typings.maximMazurokGapiClientCloudsearch.anon.CallbackFields
import typings.maximMazurokGapiClientCloudsearch.anon.DebugOptionsenableDebugging
import typings.maximMazurokGapiClientCloudsearch.anon.FromDateday
import typings.maximMazurokGapiClientCloudsearch.anon.Key
import typings.maximMazurokGapiClientCloudsearch.anon.PageSize
import typings.maximMazurokGapiClientCloudsearch.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasourcesResource extends StObject {
  
  /** Creates a datasource. **Note:** This API requires an admin account to execute. */
  def create(request: AccesstokenAlt): Request[Operation] = js.native
  def create(request: AltCallback, body: DataSource): Request[Operation] = js.native
  
  /** Deletes a datasource. **Note:** This API requires an admin account to execute. */
  def delete(): Request[Operation] = js.native
  def delete(request: DebugOptionsenableDebugging): Request[Operation] = js.native
  
  /** Deletes the schema of a data source. **Note:** This API requires an admin or service account to execute. */
  def deleteSchema(): Request[Operation] = js.native
  def deleteSchema(request: DebugOptionsenableDebugging): Request[Operation] = js.native
  
  /** Gets a datasource. **Note:** This API requires an admin account to execute. */
  /** Gets indexed item statistics for a single data source. **Note:** This API requires a standard end user account to execute. */
  def get(): Request[DataSource] = js.native
  def get(request: DebugOptionsenableDebugging): Request[DataSource] = js.native
  def get(request: FromDateday): Request[GetDataSourceIndexStatsResponse] = js.native
  
  /** Gets the schema of a data source. **Note:** This API requires an admin or service account to execute. */
  def getSchema(): Request[Schema] = js.native
  def getSchema(request: DebugOptionsenableDebugging): Request[Schema] = js.native
  
  var items: ItemsResource = js.native
  
  /** Lists datasources. **Note:** This API requires an admin account to execute. */
  def list(): Request[ListDataSourceResponse] = js.native
  def list(request: PageSize): Request[ListDataSourceResponse] = js.native
  
  /** Updates a datasource. **Note:** This API requires an admin account to execute. */
  def update(request: CallbackFields): Request[Operation] = js.native
  def update(request: Key, body: UpdateDataSourceRequest): Request[Operation] = js.native
  
  def updateSchema(request: Key, body: UpdateSchemaRequest): Request[Operation] = js.native
  /**
    * Updates the schema of a data source. This method does not perform incremental updates to the schema. Instead, this method updates the schema by overwriting the entire schema.
    * **Note:** This API requires an admin or service account to execute.
    */
  def updateSchema(request: Xgafv): Request[Operation] = js.native
}
