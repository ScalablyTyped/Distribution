package typings.googleapis.driveactivityV2Mod.driveactivityV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/driveactivity/v2", "driveactivity_v2.Resource$Activity")
@js.native
open class ResourceActivity protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def query(): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaQueryDriveActivityResponse]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(params: ParamsResourceActivityQuery): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(
    params: ParamsResourceActivityQuery,
    callback: BodyResponseCallback[SchemaQueryDriveActivityResponse]
  ): Unit = js.native
  def query(
    params: ParamsResourceActivityQuery,
    options: BodyResponseCallback[Readable | SchemaQueryDriveActivityResponse],
    callback: BodyResponseCallback[Readable | SchemaQueryDriveActivityResponse]
  ): Unit = js.native
  def query(params: ParamsResourceActivityQuery, options: MethodOptions): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(
    params: ParamsResourceActivityQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryDriveActivityResponse]
  ): Unit = js.native
  /**
    * Query past activity in Google Drive.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/driveactivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const driveactivity = google.driveactivity('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive.activity',
    *       'https://www.googleapis.com/auth/drive.activity.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await driveactivity.activity.query({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ancestorName": "my_ancestorName",
    *       //   "consolidationStrategy": {},
    *       //   "filter": "my_filter",
    *       //   "itemName": "my_itemName",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activities": [],
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
  def query(params: ParamsResourceActivityQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceActivityQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
