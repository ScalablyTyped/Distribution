package typings.googleapis.dataplexV1Mod.dataplexV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataplex/v1", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Assets$Actions")
@js.native
open class ResourceProjectsLocationsLakesZonesAssetsActions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDataplexV1ListActionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListActionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListActionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsLakesZonesAssetsActionsList): GaxiosPromise[SchemaGoogleCloudDataplexV1ListActionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesAssetsActionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListActionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesAssetsActionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListActionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListActionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsLakesZonesAssetsActionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListActionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesAssetsActionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListActionsResponse]
  ): Unit = js.native
  /**
    * Lists action resources in an asset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.zones.assets.actions.list(
    *     {
    *       // Optional. Maximum number of actions to return. The service may return fewer than this value. If unspecified, at most 10 actions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. Page token received from a previous ListAssetActions call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListAssetActions must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The resource name of the parent asset: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/assets/{asset_id\}.
    *       parent:
    *         'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/assets/my-asset',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "actions": [],
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
  def list(params: ParamsResourceProjectsLocationsLakesZonesAssetsActionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesAssetsActionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
