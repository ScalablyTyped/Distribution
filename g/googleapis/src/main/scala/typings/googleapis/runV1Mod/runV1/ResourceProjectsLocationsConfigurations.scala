package typings.googleapis.runV1Mod.runV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Projects$Locations$Configurations")
@js.native
open class ResourceProjectsLocationsConfigurations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def get(params: ParamsResourceProjectsLocationsConfigurationsGet): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConfigurationsGet,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConfigurationsGet,
    options: BodyResponseCallback[Readable | SchemaConfiguration],
    callback: BodyResponseCallback[Readable | SchemaConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  /**
    * Get information about a configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.projects.locations.configurations.get({
    *     // The name of the configuration to retrieve. For Cloud Run (fully managed), replace {namespace_id\} with the project ID or number.
    *     name: 'projects/my-project/locations/my-location/configurations/my-configuration',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "spec": {},
    *   //   "status": {}
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
  def get(params: ParamsResourceProjectsLocationsConfigurationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConfigurationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConfigurationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConfigurationsList): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConfigurationsList,
    callback: BodyResponseCallback[SchemaListConfigurationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConfigurationsList,
    options: BodyResponseCallback[Readable | SchemaListConfigurationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConfigurationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConfigurationsList, options: MethodOptions): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConfigurationsResponse]
  ): Unit = js.native
  /**
    * List configurations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.projects.locations.configurations.list({
    *     // Optional. Encoded string to continue paging.
    *     continue: 'placeholder-value',
    *     // Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    *     fieldSelector: 'placeholder-value',
    *     // Not currently used by Cloud Run.
    *     includeUninitialized: 'placeholder-value',
    *     // Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    *     labelSelector: 'placeholder-value',
    *     // Optional. The maximum number of records that should be returned.
    *     limit: 'placeholder-value',
    *     // The namespace from which the configurations should be listed. For Cloud Run (fully managed), replace {namespace_id\} with the project ID or number.
    *     parent: 'projects/my-project/locations/my-location',
    *     // The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    *     resourceVersion: 'placeholder-value',
    *     // Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    *     watch: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsConfigurationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConfigurationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
