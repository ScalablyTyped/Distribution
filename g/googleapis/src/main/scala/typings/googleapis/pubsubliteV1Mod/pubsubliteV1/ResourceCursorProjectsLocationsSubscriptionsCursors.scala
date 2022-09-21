package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Cursor$Projects$Locations$Subscriptions$Cursors")
@js.native
open class ResourceCursorProjectsLocationsSubscriptionsCursors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPartitionCursorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPartitionCursorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPartitionCursorsResponse] = js.native
  def list(params: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList): GaxiosPromise[SchemaListPartitionCursorsResponse] = js.native
  def list(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList,
    callback: BodyResponseCallback[SchemaListPartitionCursorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList,
    options: BodyResponseCallback[Readable | SchemaListPartitionCursorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPartitionCursorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList, options: MethodOptions): GaxiosPromise[SchemaListPartitionCursorsResponse] = js.native
  def list(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPartitionCursorsResponse]
  ): Unit = js.native
  /**
    * Returns all committed cursor information for a subscription.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *   const res =
    *     await pubsublite.cursor.projects.locations.subscriptions.cursors.list({
    *       // The maximum number of cursors to return. The service may return fewer than this value. If unset or zero, all cursors for the parent will be returned.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListPartitionCursors` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListPartitionCursors` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The subscription for which to retrieve cursors. Structured like `projects/{project_number\}/locations/{location\}/subscriptions/{subscription_id\}`.
    *       parent:
    *         'projects/my-project/locations/my-location/subscriptions/my-subscription',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "partitionCursors": []
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
  def list(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
