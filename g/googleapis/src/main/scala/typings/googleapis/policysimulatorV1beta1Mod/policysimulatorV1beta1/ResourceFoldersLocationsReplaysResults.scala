package typings.googleapis.policysimulatorV1beta1Mod.policysimulatorV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/policysimulator/v1beta1", "policysimulator_v1beta1.Resource$Folders$Locations$Replays$Results")
@js.native
open class ResourceFoldersLocationsReplaysResults protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse] = js.native
  def list(params: ParamsResourceFoldersLocationsReplaysResultsList): GaxiosPromise[SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse] = js.native
  def list(
    params: ParamsResourceFoldersLocationsReplaysResultsList,
    callback: BodyResponseCallback[SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFoldersLocationsReplaysResultsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFoldersLocationsReplaysResultsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse] = js.native
  def list(
    params: ParamsResourceFoldersLocationsReplaysResultsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPolicysimulatorV1beta1ListReplayResultsResponse]
  ): Unit = js.native
  /**
    * Lists the results of running a Replay.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/policysimulator.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const policysimulator = google.policysimulator('v1beta1');
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
    *   const res = await policysimulator.folders.locations.replays.results.list({
    *     // The maximum number of ReplayResult objects to return. Defaults to 5000. The maximum value is 5000; values above 5000 are rounded down to 5000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous Simulator.ListReplayResults call. Provide this token to retrieve the next page of results. When paginating, all other parameters provided to [Simulator.ListReplayResults[] must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The Replay whose results are listed, in the following format: `{projects|folders|organizations\}/{resource-id\}/locations/global/replays/{replay-id\}` Example: `projects/my-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
    *     parent: 'folders/my-folder/locations/my-location/replays/my-replay',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "replayResults": []
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
  def list(params: ParamsResourceFoldersLocationsReplaysResultsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFoldersLocationsReplaysResultsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
