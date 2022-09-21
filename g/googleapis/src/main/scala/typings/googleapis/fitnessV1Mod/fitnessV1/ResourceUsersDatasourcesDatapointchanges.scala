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

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Datasources$Datapointchanges")
@js.native
open class ResourceUsersDatasourcesDatapointchanges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
    options: BodyResponseCallback[Readable | SchemaListDataPointChangesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDataPointChangesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersDatasourcesDatapointchangesList, options: MethodOptions): GaxiosPromise[SchemaListDataPointChangesResponse] = js.native
  def list(
    params: ParamsResourceUsersDatasourcesDatapointchangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDataPointChangesResponse]
  ): Unit = js.native
  /**
    * Queries for user's data point changes for a particular data source.
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
    *   const res = await fitness.users.dataSources.dataPointChanges.list({
    *     // The data stream ID of the data source that created the dataset.
    *     dataSourceId: 'placeholder-value',
    *     // If specified, no more than this many data point changes will be included in the response.
    *     limit: 'placeholder-value',
    *     // The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of nextPageToken from the previous response.
    *     pageToken: 'placeholder-value',
    *     // List data points for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "deletedDataPoint": [],
    *   //   "insertedDataPoint": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceUsersDatasourcesDatapointchangesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersDatasourcesDatapointchangesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
