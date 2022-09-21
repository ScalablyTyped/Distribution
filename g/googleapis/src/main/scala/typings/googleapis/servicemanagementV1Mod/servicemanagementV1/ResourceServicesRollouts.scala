package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Services$Rollouts")
@js.native
open class ResourceServicesRollouts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesRolloutsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesRolloutsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceServicesRolloutsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceServicesRolloutsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesRolloutsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new service configuration rollout. Based on rollout, the Google Service Management will roll out the service configurations to different backend services. For example, the logging configuration will be pushed to Google Cloud Logging. Please note that any previous pending and running Rollouts and associated Operations will be automatically cancelled so that the latest Rollout will not be blocked by previous Rollouts. Only the 100 most recent (in any state) and the last 10 successful (if not already part of the set of 100 most recent) rollouts are kept for each service. The rest will be deleted eventually. Operation
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicemanagement.services.rollouts.create({
    *     // Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    *     serviceName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "createdBy": "my_createdBy",
    *       //   "deleteServiceStrategy": {},
    *       //   "rolloutId": "my_rolloutId",
    *       //   "serviceName": "my_serviceName",
    *       //   "status": "my_status",
    *       //   "trafficPercentStrategy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceServicesRolloutsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesRolloutsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRollout] = js.native
  def get(callback: BodyResponseCallback[SchemaRollout]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRollout] = js.native
  def get(params: ParamsResourceServicesRolloutsGet): GaxiosPromise[SchemaRollout] = js.native
  def get(params: ParamsResourceServicesRolloutsGet, callback: BodyResponseCallback[SchemaRollout]): Unit = js.native
  def get(
    params: ParamsResourceServicesRolloutsGet,
    options: BodyResponseCallback[Readable | SchemaRollout],
    callback: BodyResponseCallback[Readable | SchemaRollout]
  ): Unit = js.native
  def get(params: ParamsResourceServicesRolloutsGet, options: MethodOptions): GaxiosPromise[SchemaRollout] = js.native
  def get(
    params: ParamsResourceServicesRolloutsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRollout]
  ): Unit = js.native
  /**
    * Gets a service configuration rollout.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/service.management',
    *       'https://www.googleapis.com/auth/service.management.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicemanagement.services.rollouts.get({
    *     // Required. The id of the rollout resource.
    *     rolloutId: 'placeholder-value',
    *     // Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    *     serviceName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "createdBy": "my_createdBy",
    *   //   "deleteServiceStrategy": {},
    *   //   "rolloutId": "my_rolloutId",
    *   //   "serviceName": "my_serviceName",
    *   //   "status": "my_status",
    *   //   "trafficPercentStrategy": {}
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
  def get(params: ParamsResourceServicesRolloutsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceServicesRolloutsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListServiceRolloutsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServiceRolloutsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServiceRolloutsResponse] = js.native
  def list(params: ParamsResourceServicesRolloutsList): GaxiosPromise[SchemaListServiceRolloutsResponse] = js.native
  def list(
    params: ParamsResourceServicesRolloutsList,
    callback: BodyResponseCallback[SchemaListServiceRolloutsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesRolloutsList,
    options: BodyResponseCallback[Readable | SchemaListServiceRolloutsResponse],
    callback: BodyResponseCallback[Readable | SchemaListServiceRolloutsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesRolloutsList, options: MethodOptions): GaxiosPromise[SchemaListServiceRolloutsResponse] = js.native
  def list(
    params: ParamsResourceServicesRolloutsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServiceRolloutsResponse]
  ): Unit = js.native
  /**
    * Lists the history of the service configuration rollouts for a managed service, from the newest to the oldest.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/service.management',
    *       'https://www.googleapis.com/auth/service.management.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicemanagement.services.rollouts.list({
    *     // Required. Use `filter` to return subset of rollouts. The following filters are supported: -- By status. For example, `filter='status=SUCCESS'` -- By strategy. For example, `filter='strategy=TrafficPercentStrategy'`
    *     filter: 'placeholder-value',
    *     // The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
    *     pageSize: 'placeholder-value',
    *     // The token of the page to retrieve.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    *     serviceName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rollouts": []
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
  def list(params: ParamsResourceServicesRolloutsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesRolloutsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
