package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Scanconfigs")
@js.native
open class ResourceProjectsScanconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaScanConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet): GaxiosPromise[SchemaScanConfig] = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: BodyResponseCallback[Readable | SchemaScanConfig],
    callback: BodyResponseCallback[Readable | SchemaScanConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  /**
    * Gets a specific scan configuration for a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
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
    *   const res = await containeranalysis.projects.scanConfigs.get({
    *     // The name of the ScanConfig in the form projects/{project_id\}/scanConfigs/{scan_config_id\}
    *     name: 'projects/my-project/scanConfigs/my-scanConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "enabled": false,
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsScanconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScanConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsList): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    callback: BodyResponseCallback[SchemaListScanConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: BodyResponseCallback[Readable | SchemaListScanConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListScanConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsList, options: MethodOptions): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScanConfigsResponse]
  ): Unit = js.native
  /**
    * Lists scan configurations for a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
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
    *   const res = await containeranalysis.projects.scanConfigs.list({
    *     // The filter expression.
    *     filter: 'placeholder-value',
    *     // The number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The page token to use for the next request.
    *     pageToken: 'placeholder-value',
    *     // This containers the project Id i.e.: projects/{project_id\}
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "scanConfigs": []
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
  def list(params: ParamsResourceProjectsScanconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaScanConfig],
    callback: BodyResponseCallback[Readable | SchemaScanConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  /**
    * Updates the scan configuration to a new value.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
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
    *   const res = await containeranalysis.projects.scanConfigs.patch({
    *     // The scan config to update of the form projects/{project_id\}/scanConfigs/{scan_config_id\}.
    *     name: 'projects/my-project/scanConfigs/my-scanConfig',
    *     // The fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "enabled": false,
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "enabled": false,
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsScanconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
