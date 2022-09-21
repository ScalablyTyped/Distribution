package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/versionhistory/v1", "versionhistory_v1.Resource$Platforms$Channels$Versions")
@js.native
open class ResourcePlatformsChannelsVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(params: ParamsResourcePlatformsChannelsVersionsList): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsList,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsList,
    options: BodyResponseCallback[Readable | SchemaListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlatformsChannelsVersionsList, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  /**
    * Returns list of version for the given platform/channel.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/versionhistory.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const versionhistory = google.versionhistory('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await versionhistory.platforms.channels.versions.list({
    *     // Optional. Filter string. Format is a comma separated list of All comma separated filter clauses are conjoined with a logical "and". Valid field_names are "version", "name", "platform", and "channel". Valid operators are "<", "<=", "=", "\>=", and "\>". Channel comparison is done by distance from stable. Ex) stable < beta, beta < dev, canary < canary_asan. Version comparison is done numerically. If version is not entirely written, the version will be appended with 0 in missing fields. Ex) version \> 80 becoms version \> 80.0.0.0 Name and platform are filtered by string comparison. Ex) "...?filter=channel<=beta, version \>= 80 Ex) "...?filter=version \> 80, version < 81
    *     filter: 'placeholder-value',
    *     // Optional. Ordering string. Valid order_by strings are "version", "name", "platform", and "channel". Optionally, you can append " desc" or " asc" to specify the sorting order. Multiple order_by strings can be used in a comma separated list. Ordering by channel will sort by distance from the stable channel (not alphabetically). A list of channels sorted in this order is: stable, beta, dev, canary, and canary_asan. Sorting by name may cause unexpected behaviour as it is a naive string sort. For example, 1.0.0.8 will be before 1.0.0.10 in descending order. If order_by is not specified the response will be sorted by version in descending order. Ex) "...?order_by=version asc" Ex) "...?order_by=platform desc, channel, version"
    *     orderBy: 'placeholder-value',
    *     // Optional. Optional limit on the number of versions to include in the response. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListVersions` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The channel, which owns this collection of versions. Format: {product\}/platforms/{platform\}/channels/{channel\}
    *     parent: '[^/]+/platforms/my-platform/channels/my-channel',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "versions": []
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
  def list(params: ParamsResourcePlatformsChannelsVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var releases: ResourcePlatformsChannelsVersionsReleases = js.native
}
