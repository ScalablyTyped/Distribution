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

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Dataset")
@js.native
open class ResourceUsersDataset protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def aggregate(): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(callback: BodyResponseCallback[SchemaAggregateResponse]): Unit = js.native
  def aggregate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(params: ParamsResourceUsersDatasetAggregate): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(
    params: ParamsResourceUsersDatasetAggregate,
    callback: BodyResponseCallback[SchemaAggregateResponse]
  ): Unit = js.native
  def aggregate(
    params: ParamsResourceUsersDatasetAggregate,
    options: BodyResponseCallback[Readable | SchemaAggregateResponse],
    callback: BodyResponseCallback[Readable | SchemaAggregateResponse]
  ): Unit = js.native
  def aggregate(params: ParamsResourceUsersDatasetAggregate, options: MethodOptions): GaxiosPromise[SchemaAggregateResponse] = js.native
  def aggregate(
    params: ParamsResourceUsersDatasetAggregate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAggregateResponse]
  ): Unit = js.native
  /**
    * Aggregates data of a certain type or stream into buckets divided by a given type of boundary. Multiple data sets of multiple types and from multiple sources can be aggregated into exactly one bucket type per request.
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
    *   const res = await fitness.users.dataset.aggregate({
    *     // Aggregate data for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "aggregateBy": [],
    *       //   "bucketByActivitySegment": {},
    *       //   "bucketByActivityType": {},
    *       //   "bucketBySession": {},
    *       //   "bucketByTime": {},
    *       //   "endTimeMillis": "my_endTimeMillis",
    *       //   "filteredDataQualityStandard": [],
    *       //   "startTimeMillis": "my_startTimeMillis"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucket": []
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
  def aggregate(params: ParamsResourceUsersDatasetAggregate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def aggregate(
    params: ParamsResourceUsersDatasetAggregate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
