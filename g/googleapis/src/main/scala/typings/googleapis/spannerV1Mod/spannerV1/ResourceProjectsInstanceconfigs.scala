package typings.googleapis.spannerV1Mod.spannerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instanceconfigs")
@js.native
open class ResourceProjectsInstanceconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaInstanceConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(params: ParamsResourceProjectsInstanceconfigsGet): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(
    params: ParamsResourceProjectsInstanceconfigsGet,
    callback: BodyResponseCallback[SchemaInstanceConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstanceconfigsGet,
    options: BodyResponseCallback[Readable | SchemaInstanceConfig],
    callback: BodyResponseCallback[Readable | SchemaInstanceConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstanceconfigsGet, options: MethodOptions): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(
    params: ParamsResourceProjectsInstanceconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceConfig]
  ): Unit = js.native
  /**
    * Gets information about a particular instance configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instanceConfigs.get({
    *     // Required. The name of the requested instance configuration. Values are of the form `projects//instanceConfigs/`.
    *     name: 'projects/my-project/instanceConfigs/my-instanceConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "freeInstanceAvailability": "my_freeInstanceAvailability",
    *   //   "leaderOptions": [],
    *   //   "name": "my_name",
    *   //   "replicas": []
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
  def get(params: ParamsResourceProjectsInstanceconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsInstanceconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstanceConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsInstanceconfigsList): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstanceconfigsList,
    callback: BodyResponseCallback[SchemaListInstanceConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstanceconfigsList,
    options: BodyResponseCallback[Readable | SchemaListInstanceConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListInstanceConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstanceconfigsList, options: MethodOptions): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstanceconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstanceConfigsResponse]
  ): Unit = js.native
  /**
    * Lists the supported instance configurations for a given project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instanceConfigs.list({
    *     // Number of instance configurations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    *     pageSize: 'placeholder-value',
    *     // If non-empty, `page_token` should contain a next_page_token from a previous ListInstanceConfigsResponse.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the project for which a list of supported instance configurations is requested. Values are of the form `projects/`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "instanceConfigs": [],
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
  def list(params: ParamsResourceProjectsInstanceconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsInstanceconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsInstanceconfigsOperations = js.native
}
