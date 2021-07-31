package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Datasources$Datapointchanges")
@js.native
class ResourceUsersDatasourcesDatapointchanges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * fitness.users.dataSources.dataPointChanges.list
    * @desc Queries for user's data point changes for a particular data source.
    * @alias fitness.users.dataSources.dataPointChanges.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dataSourceId The data stream ID of the data source that created the dataset.
    * @param {integer=} params.limit If specified, no more than this many data point changes will be included in the response.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of nextPageToken from the previous response.
    * @param {string} params.userId List data points for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDataPointChangesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDataPointChangesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDataPointChangesResponse] = js.native
  def list(params: ParamsResourceUsersDatasourcesDatapointchangesList): GaxiosPromise[SchemaListDataPointChangesResponse] = js.native
  def list(
    params: ParamsResourceUsersDatasourcesDatapointchangesList,
    callback: BodyResponseCallback[SchemaListDataPointChangesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersDatasourcesDatapointchangesList,
    options: BodyResponseCallback[SchemaListDataPointChangesResponse],
    callback: BodyResponseCallback[SchemaListDataPointChangesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersDatasourcesDatapointchangesList, options: MethodOptions): GaxiosPromise[SchemaListDataPointChangesResponse] = js.native
  def list(
    params: ParamsResourceUsersDatasourcesDatapointchangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDataPointChangesResponse]
  ): Unit = js.native
}
