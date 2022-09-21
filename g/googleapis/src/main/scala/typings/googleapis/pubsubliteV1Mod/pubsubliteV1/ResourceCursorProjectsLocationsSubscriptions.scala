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

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Cursor$Projects$Locations$Subscriptions")
@js.native
open class ResourceCursorProjectsLocationsSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def commitCursor(): GaxiosPromise[SchemaCommitCursorResponse] = js.native
  def commitCursor(callback: BodyResponseCallback[SchemaCommitCursorResponse]): Unit = js.native
  def commitCursor(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommitCursorResponse] = js.native
  def commitCursor(params: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor): GaxiosPromise[SchemaCommitCursorResponse] = js.native
  def commitCursor(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor,
    callback: BodyResponseCallback[SchemaCommitCursorResponse]
  ): Unit = js.native
  def commitCursor(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor,
    options: BodyResponseCallback[Readable | SchemaCommitCursorResponse],
    callback: BodyResponseCallback[Readable | SchemaCommitCursorResponse]
  ): Unit = js.native
  def commitCursor(params: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor, options: MethodOptions): GaxiosPromise[SchemaCommitCursorResponse] = js.native
  def commitCursor(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitCursorResponse]
  ): Unit = js.native
  /**
    * Updates the committed cursor.
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
    *     await pubsublite.cursor.projects.locations.subscriptions.commitCursor({
    *       // The subscription for which to update the cursor.
    *       subscription:
    *         'projects/my-project/locations/my-location/subscriptions/my-subscription',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "cursor": {},
    *         //   "partition": "my_partition"
    *         // }
    *       },
    *     });
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
  def commitCursor(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def commitCursor(
    params: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var cursors: ResourceCursorProjectsLocationsSubscriptionsCursors = js.native
}
