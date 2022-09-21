package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Folders$Bigqueryexports")
@js.native
open class ResourceFoldersBigqueryexports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def create(params: ParamsResourceFoldersBigqueryexportsCreate): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def create(
    params: ParamsResourceFoldersBigqueryexportsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  def create(
    params: ParamsResourceFoldersBigqueryexportsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1BigQueryExport],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  def create(params: ParamsResourceFoldersBigqueryexportsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def create(
    params: ParamsResourceFoldersBigqueryexportsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  /**
    * Creates a big query export.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.folders.bigQueryExports.create({
    *     // Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
    *     bigQueryExportId: 'placeholder-value',
    *     // Required. Resource name of the new big query export's parent. Its format is "organizations/[organization_id]", "folders/[folder_id]", or "projects/[project_id]".
    *     parent: 'folders/my-folder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "dataset": "my_dataset",
    *       //   "description": "my_description",
    *       //   "filter": "my_filter",
    *       //   "mostRecentEditor": "my_mostRecentEditor",
    *       //   "name": "my_name",
    *       //   "principal": "my_principal",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "dataset": "my_dataset",
    *   //   "description": "my_description",
    *   //   "filter": "my_filter",
    *   //   "mostRecentEditor": "my_mostRecentEditor",
    *   //   "name": "my_name",
    *   //   "principal": "my_principal",
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
  def create(params: ParamsResourceFoldersBigqueryexportsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFoldersBigqueryexportsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFoldersBigqueryexportsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFoldersBigqueryexportsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceFoldersBigqueryexportsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceFoldersBigqueryexportsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceFoldersBigqueryexportsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing big query export.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.folders.bigQueryExports.delete({
    *     // Required. Name of the big query export to delete. Its format is organizations/{organization\}/bigQueryExports/{export_id\}, folders/{folder\}/bigQueryExports/{export_id\}, or projects/{project\}/bigQueryExports/{export_id\}
    *     name: 'folders/my-folder/bigQueryExports/my-bigQueryExport',
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
  def delete(params: ParamsResourceFoldersBigqueryexportsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceFoldersBigqueryexportsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def get(params: ParamsResourceFoldersBigqueryexportsGet): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def get(
    params: ParamsResourceFoldersBigqueryexportsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  def get(
    params: ParamsResourceFoldersBigqueryexportsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1BigQueryExport],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  def get(params: ParamsResourceFoldersBigqueryexportsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def get(
    params: ParamsResourceFoldersBigqueryexportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  /**
    * Gets a big query export.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.folders.bigQueryExports.get({
    *     // Required. Name of the big query export to retrieve. Its format is organizations/{organization\}/bigQueryExports/{export_id\}, folders/{folder\}/bigQueryExports/{export_id\}, or projects/{project\}/bigQueryExports/{export_id\}
    *     name: 'folders/my-folder/bigQueryExports/my-bigQueryExport',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "dataset": "my_dataset",
    *   //   "description": "my_description",
    *   //   "filter": "my_filter",
    *   //   "mostRecentEditor": "my_mostRecentEditor",
    *   //   "name": "my_name",
    *   //   "principal": "my_principal",
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
  def get(params: ParamsResourceFoldersBigqueryexportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFoldersBigqueryexportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBigQueryExportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBigQueryExportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBigQueryExportsResponse] = js.native
  def list(params: ParamsResourceFoldersBigqueryexportsList): GaxiosPromise[SchemaListBigQueryExportsResponse] = js.native
  def list(
    params: ParamsResourceFoldersBigqueryexportsList,
    callback: BodyResponseCallback[SchemaListBigQueryExportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFoldersBigqueryexportsList,
    options: BodyResponseCallback[Readable | SchemaListBigQueryExportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBigQueryExportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFoldersBigqueryexportsList, options: MethodOptions): GaxiosPromise[SchemaListBigQueryExportsResponse] = js.native
  def list(
    params: ParamsResourceFoldersBigqueryexportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBigQueryExportsResponse]
  ): Unit = js.native
  /**
    * Lists BigQuery exports. Note that when requesting BigQuery exports at a given level all exports under that level are also returned e.g. if requesting BigQuery exports under a folder, then all BigQuery exports immediately under the folder plus the ones created under the projects within the folder are returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.folders.bigQueryExports.list({
    *     // The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 10 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListBigQueryExports` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBigQueryExports` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns the collection of BigQuery exports. Its format is "organizations/[organization_id]", "folders/[folder_id]", "projects/[project_id]".
    *     parent: 'folders/my-folder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigQueryExports": [],
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
  def list(params: ParamsResourceFoldersBigqueryexportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFoldersBigqueryexportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def patch(params: ParamsResourceFoldersBigqueryexportsPatch): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def patch(
    params: ParamsResourceFoldersBigqueryexportsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFoldersBigqueryexportsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1BigQueryExport],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  def patch(params: ParamsResourceFoldersBigqueryexportsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1BigQueryExport] = js.native
  def patch(
    params: ParamsResourceFoldersBigqueryexportsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1BigQueryExport]
  ): Unit = js.native
  /**
    * Updates a BigQuery export.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.folders.bigQueryExports.patch({
    *     // The relative resource name of this export. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name. Example format: "organizations/{organization_id\}/bigQueryExports/{export_id\}" Example format: "folders/{folder_id\}/bigQueryExports/{export_id\}" Example format: "projects/{project_id\}/bigQueryExports/{export_id\}" This field is provided in responses, and is ignored when provided in create requests.
    *     name: 'folders/my-folder/bigQueryExports/my-bigQueryExport',
    *     // The list of fields to be updated. If empty all mutable fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "dataset": "my_dataset",
    *       //   "description": "my_description",
    *       //   "filter": "my_filter",
    *       //   "mostRecentEditor": "my_mostRecentEditor",
    *       //   "name": "my_name",
    *       //   "principal": "my_principal",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "dataset": "my_dataset",
    *   //   "description": "my_description",
    *   //   "filter": "my_filter",
    *   //   "mostRecentEditor": "my_mostRecentEditor",
    *   //   "name": "my_name",
    *   //   "principal": "my_principal",
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
  def patch(params: ParamsResourceFoldersBigqueryexportsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFoldersBigqueryexportsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
