package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Services$Servicelevelobjectives")
@js.native
open class ResourceServicesServicelevelobjectives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def create(callback: BodyResponseCallback[SchemaServiceLevelObjective]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def create(params: ParamsResourceServicesServicelevelobjectivesCreate): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def create(
    params: ParamsResourceServicesServicelevelobjectivesCreate,
    callback: BodyResponseCallback[SchemaServiceLevelObjective]
  ): Unit = js.native
  def create(
    params: ParamsResourceServicesServicelevelobjectivesCreate,
    options: BodyResponseCallback[Readable | SchemaServiceLevelObjective],
    callback: BodyResponseCallback[Readable | SchemaServiceLevelObjective]
  ): Unit = js.native
  def create(params: ParamsResourceServicesServicelevelobjectivesCreate, options: MethodOptions): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def create(
    params: ParamsResourceServicesServicelevelobjectivesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceLevelObjective]
  ): Unit = js.native
  /**
    * Create a ServiceLevelObjective for the given Service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.services.serviceLevelObjectives.create({
    *     // Required. Resource name of the parent Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
    *     parent: '[^/]+/[^/]+/services/my-service',
    *     // Optional. The ServiceLevelObjective id to use for this ServiceLevelObjective. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\-]+
    *     serviceLevelObjectiveId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "calendarPeriod": "my_calendarPeriod",
    *       //   "displayName": "my_displayName",
    *       //   "goal": {},
    *       //   "name": "my_name",
    *       //   "rollingPeriod": "my_rollingPeriod",
    *       //   "serviceLevelIndicator": {},
    *       //   "userLabels": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "calendarPeriod": "my_calendarPeriod",
    *   //   "displayName": "my_displayName",
    *   //   "goal": {},
    *   //   "name": "my_name",
    *   //   "rollingPeriod": "my_rollingPeriod",
    *   //   "serviceLevelIndicator": {},
    *   //   "userLabels": {}
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
  def create(params: ParamsResourceServicesServicelevelobjectivesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesServicelevelobjectivesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceServicesServicelevelobjectivesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceServicesServicelevelobjectivesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceServicesServicelevelobjectivesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceServicesServicelevelobjectivesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceServicesServicelevelobjectivesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete the given ServiceLevelObjective.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.services.serviceLevelObjectives.delete({
    *     // Required. Resource name of the ServiceLevelObjective to delete. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
    *     name: '[^/]+/[^/]+/services/my-service/serviceLevelObjectives/my-serviceLevelObjective',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceServicesServicelevelobjectivesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceServicesServicelevelobjectivesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def get(callback: BodyResponseCallback[SchemaServiceLevelObjective]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def get(params: ParamsResourceServicesServicelevelobjectivesGet): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def get(
    params: ParamsResourceServicesServicelevelobjectivesGet,
    callback: BodyResponseCallback[SchemaServiceLevelObjective]
  ): Unit = js.native
  def get(
    params: ParamsResourceServicesServicelevelobjectivesGet,
    options: BodyResponseCallback[Readable | SchemaServiceLevelObjective],
    callback: BodyResponseCallback[Readable | SchemaServiceLevelObjective]
  ): Unit = js.native
  def get(params: ParamsResourceServicesServicelevelobjectivesGet, options: MethodOptions): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def get(
    params: ParamsResourceServicesServicelevelobjectivesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceLevelObjective]
  ): Unit = js.native
  /**
    * Get a ServiceLevelObjective by name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.services.serviceLevelObjectives.get({
    *     // Required. Resource name of the ServiceLevelObjective to get. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
    *     name: '[^/]+/[^/]+/services/my-service/serviceLevelObjectives/my-serviceLevelObjective',
    *     // View of the ServiceLevelObjective to return. If DEFAULT, return the ServiceLevelObjective as originally defined. If EXPLICIT and the ServiceLevelObjective is defined in terms of a BasicSli, replace the BasicSli with a RequestBasedSli spelling out how the SLI is computed.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "calendarPeriod": "my_calendarPeriod",
    *   //   "displayName": "my_displayName",
    *   //   "goal": {},
    *   //   "name": "my_name",
    *   //   "rollingPeriod": "my_rollingPeriod",
    *   //   "serviceLevelIndicator": {},
    *   //   "userLabels": {}
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
  def get(params: ParamsResourceServicesServicelevelobjectivesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceServicesServicelevelobjectivesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListServiceLevelObjectivesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServiceLevelObjectivesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServiceLevelObjectivesResponse] = js.native
  def list(params: ParamsResourceServicesServicelevelobjectivesList): GaxiosPromise[SchemaListServiceLevelObjectivesResponse] = js.native
  def list(
    params: ParamsResourceServicesServicelevelobjectivesList,
    callback: BodyResponseCallback[SchemaListServiceLevelObjectivesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesServicelevelobjectivesList,
    options: BodyResponseCallback[Readable | SchemaListServiceLevelObjectivesResponse],
    callback: BodyResponseCallback[Readable | SchemaListServiceLevelObjectivesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesServicelevelobjectivesList, options: MethodOptions): GaxiosPromise[SchemaListServiceLevelObjectivesResponse] = js.native
  def list(
    params: ParamsResourceServicesServicelevelobjectivesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServiceLevelObjectivesResponse]
  ): Unit = js.native
  /**
    * List the ServiceLevelObjectives for the given Service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.services.serviceLevelObjectives.list({
    *     // A filter specifying what ServiceLevelObjectives to return.
    *     filter: 'placeholder-value',
    *     // A non-negative number that is the maximum number of results to return. When 0, use default page size.
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the parent containing the listed SLOs, either a project or a Monitoring Metrics Scope. The formats are: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID] workspaces/[HOST_PROJECT_ID_OR_NUMBER]/services/-
    *     parent: '[^/]+/[^/]+/services/my-service',
    *     // View of the ServiceLevelObjectives to return. If DEFAULT, return each ServiceLevelObjective as originally defined. If EXPLICIT and the ServiceLevelObjective is defined in terms of a BasicSli, replace the BasicSli with a RequestBasedSli spelling out how the SLI is computed.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "serviceLevelObjectives": []
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
  def list(params: ParamsResourceServicesServicelevelobjectivesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesServicelevelobjectivesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def patch(callback: BodyResponseCallback[SchemaServiceLevelObjective]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def patch(params: ParamsResourceServicesServicelevelobjectivesPatch): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def patch(
    params: ParamsResourceServicesServicelevelobjectivesPatch,
    callback: BodyResponseCallback[SchemaServiceLevelObjective]
  ): Unit = js.native
  def patch(
    params: ParamsResourceServicesServicelevelobjectivesPatch,
    options: BodyResponseCallback[Readable | SchemaServiceLevelObjective],
    callback: BodyResponseCallback[Readable | SchemaServiceLevelObjective]
  ): Unit = js.native
  def patch(params: ParamsResourceServicesServicelevelobjectivesPatch, options: MethodOptions): GaxiosPromise[SchemaServiceLevelObjective] = js.native
  def patch(
    params: ParamsResourceServicesServicelevelobjectivesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceLevelObjective]
  ): Unit = js.native
  /**
    * Update the given ServiceLevelObjective.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.services.serviceLevelObjectives.patch({
    *     // Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
    *     name: '[^/]+/[^/]+/services/my-service/serviceLevelObjectives/my-serviceLevelObjective',
    *     // A set of field paths defining which fields to use for the update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "calendarPeriod": "my_calendarPeriod",
    *       //   "displayName": "my_displayName",
    *       //   "goal": {},
    *       //   "name": "my_name",
    *       //   "rollingPeriod": "my_rollingPeriod",
    *       //   "serviceLevelIndicator": {},
    *       //   "userLabels": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "calendarPeriod": "my_calendarPeriod",
    *   //   "displayName": "my_displayName",
    *   //   "goal": {},
    *   //   "name": "my_name",
    *   //   "rollingPeriod": "my_rollingPeriod",
    *   //   "serviceLevelIndicator": {},
    *   //   "userLabels": {}
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
  def patch(params: ParamsResourceServicesServicelevelobjectivesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceServicesServicelevelobjectivesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
