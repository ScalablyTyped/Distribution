package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Unsampledreports")
@js.native
open class ResourceManagementUnsampledreports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementUnsampledreportsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementUnsampledreportsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementUnsampledreportsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementUnsampledreportsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementUnsampledreportsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an unsampled report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.unsampledReports.delete({
    *     // Account ID to delete the unsampled report for.
    *     accountId: 'placeholder-value',
    *     // View (Profile) ID to delete the unsampled report for.
    *     profileId: 'placeholder-value',
    *     // ID of the unsampled report to be deleted.
    *     unsampledReportId: 'placeholder-value',
    *     // Web property ID to delete the unsampled reports for.
    *     webPropertyId: 'placeholder-value',
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
  def delete(params: ParamsResourceManagementUnsampledreportsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementUnsampledreportsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(callback: BodyResponseCallback[SchemaUnsampledReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(params: ParamsResourceManagementUnsampledreportsGet): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(
    params: ParamsResourceManagementUnsampledreportsGet,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementUnsampledreportsGet,
    options: BodyResponseCallback[Readable | SchemaUnsampledReport],
    callback: BodyResponseCallback[Readable | SchemaUnsampledReport]
  ): Unit = js.native
  def get(params: ParamsResourceManagementUnsampledreportsGet, options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(
    params: ParamsResourceManagementUnsampledreportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  /**
    * Returns a single unsampled report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.unsampledReports.get({
    *     // Account ID to retrieve unsampled report for.
    *     accountId: 'placeholder-value',
    *     // View (Profile) ID to retrieve unsampled report for.
    *     profileId: 'placeholder-value',
    *     // ID of the unsampled report to retrieve.
    *     unsampledReportId: 'placeholder-value',
    *     // Web property ID to retrieve unsampled reports for.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "cloudStorageDownloadDetails": {},
    *   //   "created": "my_created",
    *   //   "dimensions": "my_dimensions",
    *   //   "downloadType": "my_downloadType",
    *   //   "driveDownloadDetails": {},
    *   //   "end-date": "my_end-date",
    *   //   "filters": "my_filters",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "metrics": "my_metrics",
    *   //   "profileId": "my_profileId",
    *   //   "segment": "my_segment",
    *   //   "selfLink": "my_selfLink",
    *   //   "start-date": "my_start-date",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def get(params: ParamsResourceManagementUnsampledreportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementUnsampledreportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(callback: BodyResponseCallback[SchemaUnsampledReport]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(params: ParamsResourceManagementUnsampledreportsInsert): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(
    params: ParamsResourceManagementUnsampledreportsInsert,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementUnsampledreportsInsert,
    options: BodyResponseCallback[Readable | SchemaUnsampledReport],
    callback: BodyResponseCallback[Readable | SchemaUnsampledReport]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementUnsampledreportsInsert, options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(
    params: ParamsResourceManagementUnsampledreportsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  /**
    * Create a new unsampled report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.unsampledReports.insert({
    *     // Account ID to create the unsampled report for.
    *     accountId: 'placeholder-value',
    *     // View (Profile) ID to create the unsampled report for.
    *     profileId: 'placeholder-value',
    *     // Web property ID to create the unsampled report for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "cloudStorageDownloadDetails": {},
    *       //   "created": "my_created",
    *       //   "dimensions": "my_dimensions",
    *       //   "downloadType": "my_downloadType",
    *       //   "driveDownloadDetails": {},
    *       //   "end-date": "my_end-date",
    *       //   "filters": "my_filters",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "metrics": "my_metrics",
    *       //   "profileId": "my_profileId",
    *       //   "segment": "my_segment",
    *       //   "selfLink": "my_selfLink",
    *       //   "start-date": "my_start-date",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "updated": "my_updated",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "cloudStorageDownloadDetails": {},
    *   //   "created": "my_created",
    *   //   "dimensions": "my_dimensions",
    *   //   "downloadType": "my_downloadType",
    *   //   "driveDownloadDetails": {},
    *   //   "end-date": "my_end-date",
    *   //   "filters": "my_filters",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "metrics": "my_metrics",
    *   //   "profileId": "my_profileId",
    *   //   "segment": "my_segment",
    *   //   "selfLink": "my_selfLink",
    *   //   "start-date": "my_start-date",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def insert(params: ParamsResourceManagementUnsampledreportsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementUnsampledreportsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(callback: BodyResponseCallback[SchemaUnsampledReports]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(params: ParamsResourceManagementUnsampledreportsList): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(
    params: ParamsResourceManagementUnsampledreportsList,
    callback: BodyResponseCallback[SchemaUnsampledReports]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementUnsampledreportsList,
    options: BodyResponseCallback[Readable | SchemaUnsampledReports],
    callback: BodyResponseCallback[Readable | SchemaUnsampledReports]
  ): Unit = js.native
  def list(params: ParamsResourceManagementUnsampledreportsList, options: MethodOptions): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(
    params: ParamsResourceManagementUnsampledreportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnsampledReports]
  ): Unit = js.native
  /**
    * Lists unsampled reports to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.unsampledReports.list({
    *     // Account ID to retrieve unsampled reports for. Must be a specific account ID, ~all is not supported.
    *     accountId: 'placeholder-value',
    *     // The maximum number of unsampled reports to include in this response.
    *     'max-results': 'placeholder-value',
    *     // View (Profile) ID to retrieve unsampled reports for. Must be a specific view (profile) ID, ~all is not supported.
    *     profileId: 'placeholder-value',
    *     // An index of the first unsampled report to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property ID to retrieve unsampled reports for. Must be a specific web property ID, ~all is not supported.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "itemsPerPage": 0,
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "previousLink": "my_previousLink",
    *   //   "startIndex": 0,
    *   //   "totalResults": 0,
    *   //   "username": "my_username"
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
  def list(params: ParamsResourceManagementUnsampledreportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementUnsampledreportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
