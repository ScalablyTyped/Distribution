package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Resource$Applications")
@js.native
open class ResourceApplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet, callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: BodyResponseCallback[Readable | SchemaApplication],
    callback: BodyResponseCallback[Readable | SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceApplicationsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  /**
    * Retrieves information about an application for the given application ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('datatransfer_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.datatransfer',
    *       'https://www.googleapis.com/auth/admin.datatransfer.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await datatransfer.applications.get({
    *     // ID of the application resource to be retrieved.
    *     applicationId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "transferParams": []
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
  def get(params: ParamsResourceApplicationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaApplicationsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(params: ParamsResourceApplicationsList): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(
    params: ParamsResourceApplicationsList,
    callback: BodyResponseCallback[SchemaApplicationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceApplicationsList,
    options: BodyResponseCallback[Readable | SchemaApplicationsListResponse],
    callback: BodyResponseCallback[Readable | SchemaApplicationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceApplicationsList, options: MethodOptions): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(
    params: ParamsResourceApplicationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplicationsListResponse]
  ): Unit = js.native
  /**
    * Lists the applications available for data transfer for a customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('datatransfer_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.datatransfer',
    *       'https://www.googleapis.com/auth/admin.datatransfer.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await datatransfer.applications.list({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Maximum number of results to return. Default is 100.
    *     maxResults: 'placeholder-value',
    *     // Token to specify next page in the list.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applications": [],
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceApplicationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceApplicationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
