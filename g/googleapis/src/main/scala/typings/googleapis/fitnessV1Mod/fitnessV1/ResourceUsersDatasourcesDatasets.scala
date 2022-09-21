package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Datasources$Datasets")
@js.native
open class ResourceUsersDatasourcesDatasets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDatasourcesDatasetsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDatasourcesDatasetsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDatasourcesDatasetsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDatasourcesDatasetsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersDatasourcesDatasetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Performs an inclusive delete of all data points whose start and end times have any overlap with the time range specified by the dataset ID. For most data types, the entire data point will be deleted. For data types where the time span represents a consistent value (such as com.google.activity.segment), and a data point straddles either end point of the dataset, only the overlapping portion of the data point will be deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/fitness.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const fitness = google.fitness('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/fitness.activity.write',
    *       'https://www.googleapis.com/auth/fitness.blood_glucose.write',
    *       'https://www.googleapis.com/auth/fitness.blood_pressure.write',
    *       'https://www.googleapis.com/auth/fitness.body.write',
    *       'https://www.googleapis.com/auth/fitness.body_temperature.write',
    *       'https://www.googleapis.com/auth/fitness.heart_rate.write',
    *       'https://www.googleapis.com/auth/fitness.location.write',
    *       'https://www.googleapis.com/auth/fitness.nutrition.write',
    *       'https://www.googleapis.com/auth/fitness.oxygen_saturation.write',
    *       'https://www.googleapis.com/auth/fitness.reproductive_health.write',
    *       'https://www.googleapis.com/auth/fitness.sleep.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await fitness.users.dataSources.datasets.delete({
    *     // Dataset identifier that is a composite of the minimum data point start time and maximum data point end time represented as nanoseconds from the epoch. The ID is formatted like: "startTime-endTime" where startTime and endTime are 64 bit integers.
    *     datasetId: 'placeholder-value',
    *     // The data stream ID of the data source that created the dataset.
    *     dataSourceId: 'placeholder-value',
    *     // Delete a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceUsersDatasourcesDatasetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersDatasourcesDatasetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDataset] = js.native
  def get(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceUsersDatasourcesDatasetsGet): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceUsersDatasourcesDatasetsGet, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(
    params: ParamsResourceUsersDatasourcesDatasetsGet,
    options: BodyResponseCallback[Readable | SchemaDataset],
    callback: BodyResponseCallback[Readable | SchemaDataset]
  ): Unit = js.native
  def get(params: ParamsResourceUsersDatasourcesDatasetsGet, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(
    params: ParamsResourceUsersDatasourcesDatasetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  /**
    * Returns a dataset containing all data points whose start and end times overlap with the specified range of the dataset minimum start time and maximum end time. Specifically, any data point whose start time is less than or equal to the dataset end time and whose end time is greater than or equal to the dataset start time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/fitness.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const fitness = google.fitness('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/fitness.activity.read',
    *       'https://www.googleapis.com/auth/fitness.activity.write',
    *       'https://www.googleapis.com/auth/fitness.blood_glucose.read',
    *       'https://www.googleapis.com/auth/fitness.blood_glucose.write',
    *       'https://www.googleapis.com/auth/fitness.blood_pressure.read',
    *       'https://www.googleapis.com/auth/fitness.blood_pressure.write',
    *       'https://www.googleapis.com/auth/fitness.body.read',
    *       'https://www.googleapis.com/auth/fitness.body.write',
    *       'https://www.googleapis.com/auth/fitness.body_temperature.read',
    *       'https://www.googleapis.com/auth/fitness.body_temperature.write',
    *       'https://www.googleapis.com/auth/fitness.heart_rate.read',
    *       'https://www.googleapis.com/auth/fitness.heart_rate.write',
    *       'https://www.googleapis.com/auth/fitness.location.read',
    *       'https://www.googleapis.com/auth/fitness.location.write',
    *       'https://www.googleapis.com/auth/fitness.nutrition.read',
    *       'https://www.googleapis.com/auth/fitness.nutrition.write',
    *       'https://www.googleapis.com/auth/fitness.oxygen_saturation.read',
    *       'https://www.googleapis.com/auth/fitness.oxygen_saturation.write',
    *       'https://www.googleapis.com/auth/fitness.reproductive_health.read',
    *       'https://www.googleapis.com/auth/fitness.reproductive_health.write',
    *       'https://www.googleapis.com/auth/fitness.sleep.read',
    *       'https://www.googleapis.com/auth/fitness.sleep.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await fitness.users.dataSources.datasets.get({
    *     // Dataset identifier that is a composite of the minimum data point start time and maximum data point end time represented as nanoseconds from the epoch. The ID is formatted like: "startTime-endTime" where startTime and endTime are 64 bit integers.
    *     datasetId: 'placeholder-value',
    *     // The data stream ID of the data source that created the dataset.
    *     dataSourceId: 'placeholder-value',
    *     // If specified, no more than this many data points will be included in the dataset. If there are more data points in the dataset, nextPageToken will be set in the dataset response. The limit is applied from the end of the time range. That is, if pageToken is absent, the limit most recent data points will be returned.
    *     limit: 'placeholder-value',
    *     // The continuation token, which is used to page through large datasets. To get the next page of a dataset, set this parameter to the value of nextPageToken from the previous response. Each subsequent call will yield a partial dataset with data point end timestamps that are strictly smaller than those in the previous partial response.
    *     pageToken: 'placeholder-value',
    *     // Retrieve a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "maxEndTimeNs": "my_maxEndTimeNs",
    *   //   "minStartTimeNs": "my_minStartTimeNs",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "point": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceUsersDatasourcesDatasetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersDatasourcesDatasetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDataset] = js.native
  def patch(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceUsersDatasourcesDatasetsPatch): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceUsersDatasourcesDatasetsPatch, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(
    params: ParamsResourceUsersDatasourcesDatasetsPatch,
    options: BodyResponseCallback[Readable | SchemaDataset],
    callback: BodyResponseCallback[Readable | SchemaDataset]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersDatasourcesDatasetsPatch, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(
    params: ParamsResourceUsersDatasourcesDatasetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  /**
    * Adds data points to a dataset. The dataset need not be previously created. All points within the given dataset will be returned with subsquent calls to retrieve this dataset. Data points can belong to more than one dataset. This method does not use patch semantics: the data points provided are merely inserted, with no existing data replaced.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/fitness.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const fitness = google.fitness('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/fitness.activity.write',
    *       'https://www.googleapis.com/auth/fitness.blood_glucose.write',
    *       'https://www.googleapis.com/auth/fitness.blood_pressure.write',
    *       'https://www.googleapis.com/auth/fitness.body.write',
    *       'https://www.googleapis.com/auth/fitness.body_temperature.write',
    *       'https://www.googleapis.com/auth/fitness.heart_rate.write',
    *       'https://www.googleapis.com/auth/fitness.location.write',
    *       'https://www.googleapis.com/auth/fitness.nutrition.write',
    *       'https://www.googleapis.com/auth/fitness.oxygen_saturation.write',
    *       'https://www.googleapis.com/auth/fitness.reproductive_health.write',
    *       'https://www.googleapis.com/auth/fitness.sleep.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await fitness.users.dataSources.datasets.patch({
    *     // This field is not used, and can be safely omitted.
    *     datasetId: 'placeholder-value',
    *     // The data stream ID of the data source that created the dataset.
    *     dataSourceId: 'placeholder-value',
    *     // Patch a dataset for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataSourceId": "my_dataSourceId",
    *       //   "maxEndTimeNs": "my_maxEndTimeNs",
    *       //   "minStartTimeNs": "my_minStartTimeNs",
    *       //   "nextPageToken": "my_nextPageToken",
    *       //   "point": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "maxEndTimeNs": "my_maxEndTimeNs",
    *   //   "minStartTimeNs": "my_minStartTimeNs",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "point": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceUsersDatasourcesDatasetsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersDatasourcesDatasetsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
