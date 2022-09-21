package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Changelogs")
@js.native
open class ResourceChangelogs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaChangeLog] = js.native
  def get(callback: BodyResponseCallback[SchemaChangeLog]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChangeLog] = js.native
  def get(params: ParamsResourceChangelogsGet): GaxiosPromise[SchemaChangeLog] = js.native
  def get(params: ParamsResourceChangelogsGet, callback: BodyResponseCallback[SchemaChangeLog]): Unit = js.native
  def get(
    params: ParamsResourceChangelogsGet,
    options: BodyResponseCallback[Readable | SchemaChangeLog],
    callback: BodyResponseCallback[Readable | SchemaChangeLog]
  ): Unit = js.native
  def get(params: ParamsResourceChangelogsGet, options: MethodOptions): GaxiosPromise[SchemaChangeLog] = js.native
  def get(
    params: ParamsResourceChangelogsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangeLog]
  ): Unit = js.native
  /**
    * Gets one change log by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.changeLogs.get({
    *     // Change log ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "action": "my_action",
    *   //   "changeTime": "my_changeTime",
    *   //   "fieldName": "my_fieldName",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "newValue": "my_newValue",
    *   //   "objectId": "my_objectId",
    *   //   "objectType": "my_objectType",
    *   //   "oldValue": "my_oldValue",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "transactionId": "my_transactionId",
    *   //   "userProfileId": "my_userProfileId",
    *   //   "userProfileName": "my_userProfileName"
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
  def get(params: ParamsResourceChangelogsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceChangelogsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaChangeLogsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaChangeLogsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChangeLogsListResponse] = js.native
  def list(params: ParamsResourceChangelogsList): GaxiosPromise[SchemaChangeLogsListResponse] = js.native
  def list(params: ParamsResourceChangelogsList, callback: BodyResponseCallback[SchemaChangeLogsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceChangelogsList,
    options: BodyResponseCallback[Readable | SchemaChangeLogsListResponse],
    callback: BodyResponseCallback[Readable | SchemaChangeLogsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceChangelogsList, options: MethodOptions): GaxiosPromise[SchemaChangeLogsListResponse] = js.native
  def list(
    params: ParamsResourceChangelogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangeLogsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of change logs. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.changeLogs.list({
    *     // Select only change logs with the specified action.
    *     action: 'placeholder-value',
    *     // Select only change logs with these IDs.
    *     ids: 'placeholder-value',
    *     // Select only change logs whose change time is before the specified maxChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    *     maxChangeTime: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Select only change logs whose change time is after the specified minChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    *     minChangeTime: 'placeholder-value',
    *     // Select only change logs with these object IDs.
    *     objectIds: 'placeholder-value',
    *     // Select only change logs with the specified object type.
    *     objectType: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Select only change logs whose object ID, user name, old or new values match the search string.
    *     searchString: 'placeholder-value',
    *     // Select only change logs with these user profile IDs.
    *     userProfileIds: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "changeLogs": [],
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
  def list(params: ParamsResourceChangelogsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceChangelogsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
