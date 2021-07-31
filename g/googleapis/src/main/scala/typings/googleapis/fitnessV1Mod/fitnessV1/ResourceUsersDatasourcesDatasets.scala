package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Datasources$Datasets")
@js.native
class ResourceUsersDatasourcesDatasets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * fitness.users.dataSources.datasets.delete
    * @desc Performs an inclusive delete of all data points whose start and end
    * times have any overlap with the time range specified by the dataset ID.
    * For most data types, the entire data point will be deleted. For data
    * types where the time span represents a consistent value (such as
    * com.google.activity.segment), and a data point straddles either end point
    * of the dataset, only the overlapping portion of the data point will be
    * deleted.
    * @alias fitness.users.dataSources.datasets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentTimeMillis The client's current time in milliseconds since epoch.
    * @param {string} params.datasetId Dataset identifier that is a composite of the minimum data point start time and maximum data point end time represented as nanoseconds from the epoch. The ID is formatted like: "startTime-endTime" where startTime and endTime are 64 bit integers.
    * @param {string} params.dataSourceId The data stream ID of the data source that created the dataset.
    * @param {string=} params.modifiedTimeMillis When the operation was performed on the client.
    * @param {string} params.userId Delete a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDatasourcesDatasetsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDatasourcesDatasetsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDatasourcesDatasetsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDatasourcesDatasetsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersDatasourcesDatasetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * fitness.users.dataSources.datasets.get
    * @desc Returns a dataset containing all data points whose start and end
    * times overlap with the specified range of the dataset minimum start time
    * and maximum end time. Specifically, any data point whose start time is
    * less than or equal to the dataset end time and whose end time is greater
    * than or equal to the dataset start time.
    * @alias fitness.users.dataSources.datasets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset identifier that is a composite of the minimum data point start time and maximum data point end time represented as nanoseconds from the epoch. The ID is formatted like: "startTime-endTime" where startTime and endTime are 64 bit integers.
    * @param {string} params.dataSourceId The data stream ID of the data source that created the dataset.
    * @param {integer=} params.limit If specified, no more than this many data points will be included in the dataset. If there are more data points in the dataset, nextPageToken will be set in the dataset response.
    * @param {string=} params.pageToken The continuation token, which is used to page through large datasets. To get the next page of a dataset, set this parameter to the value of nextPageToken from the previous response. Each subsequent call will yield a partial dataset with data point end timestamps that are strictly smaller than those in the previous partial response.
    * @param {string} params.userId Retrieve a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDataset] = js.native
  def get(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceUsersDatasourcesDatasetsGet): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceUsersDatasourcesDatasetsGet, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(
    params: ParamsResourceUsersDatasourcesDatasetsGet,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def get(params: ParamsResourceUsersDatasourcesDatasetsGet, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(
    params: ParamsResourceUsersDatasourcesDatasetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  
  /**
    * fitness.users.dataSources.datasets.patch
    * @desc Adds data points to a dataset. The dataset need not be previously
    * created. All points within the given dataset will be returned with
    * subsquent calls to retrieve this dataset. Data points can belong to more
    * than one dataset. This method does not use patch semantics.
    * @alias fitness.users.dataSources.datasets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentTimeMillis The client's current time in milliseconds since epoch. Note that the minStartTimeNs and maxEndTimeNs properties in the request body are in nanoseconds instead of milliseconds.
    * @param {string} params.datasetId Dataset identifier that is a composite of the minimum data point start time and maximum data point end time represented as nanoseconds from the epoch. The ID is formatted like: "startTime-endTime" where startTime and endTime are 64 bit integers.
    * @param {string} params.dataSourceId The data stream ID of the data source that created the dataset.
    * @param {string} params.userId Patch a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaDataset] = js.native
  def patch(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceUsersDatasourcesDatasetsPatch): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceUsersDatasourcesDatasetsPatch, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(
    params: ParamsResourceUsersDatasourcesDatasetsPatch,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersDatasourcesDatasetsPatch, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(
    params: ParamsResourceUsersDatasourcesDatasetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
}
