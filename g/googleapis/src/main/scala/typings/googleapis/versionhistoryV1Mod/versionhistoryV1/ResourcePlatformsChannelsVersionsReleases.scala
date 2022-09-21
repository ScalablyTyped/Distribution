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

@JSImport("googleapis/build/src/apis/versionhistory/v1", "versionhistory_v1.Resource$Platforms$Channels$Versions$Releases")
@js.native
open class ResourcePlatformsChannelsVersionsReleases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReleasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(params: ParamsResourcePlatformsChannelsVersionsReleasesList): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsReleasesList,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsReleasesList,
    options: BodyResponseCallback[Readable | SchemaListReleasesResponse],
    callback: BodyResponseCallback[Readable | SchemaListReleasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlatformsChannelsVersionsReleasesList, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsReleasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  /**
    * Returns list of releases of the given version.
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
    *   const res = await versionhistory.platforms.channels.versions.releases.list({
    *     // Optional. Filter string. Format is a comma separated list of All comma separated filter clauses are conjoined with a logical "and". Valid field_names are "version", "name", "platform", "channel", "fraction" "starttime", and "endtime". Valid operators are "<", "<=", "=", "\>=", and "\>". Channel comparison is done by distance from stable. must be a valid channel when filtering by channel. Ex) stable < beta, beta < dev, canary < canary_asan. Version comparison is done numerically. Ex) 1.0.0.8 < 1.0.0.10. If version is not entirely written, the version will be appended with 0 for the missing fields. Ex) version \> 80 becoms version \> 80.0.0.0 When filtering by starttime or endtime, string must be in RFC 3339 date string format. Name and platform are filtered by string comparison. Ex) "...?filter=channel<=beta, version \>= 80 Ex) "...?filter=version \> 80, version < 81 Ex) "...?filter=starttime\>2020-01-01T00:00:00Z
    *     filter: 'placeholder-value',
    *     // Optional. Ordering string. Valid order_by strings are "version", "name", "starttime", "endtime", "platform", "channel", and "fraction". Optionally, you can append "desc" or "asc" to specify the sorting order. Multiple order_by strings can be used in a comma separated list. Ordering by channel will sort by distance from the stable channel (not alphabetically). A list of channels sorted in this order is: stable, beta, dev, canary, and canary_asan. Sorting by name may cause unexpected behaviour as it is a naive string sort. For example, 1.0.0.8 will be before 1.0.0.10 in descending order. If order_by is not specified the response will be sorted by starttime in descending order. Ex) "...?order_by=starttime asc" Ex) "...?order_by=platform desc, channel, startime desc"
    *     orderBy: 'placeholder-value',
    *     // Optional. Optional limit on the number of releases to include in the response. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListReleases` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The version, which owns this collection of releases. Format: {product\}/platforms/{platform\}/channels/{channel\}/versions/{version\}
    *     parent:
    *       '[^/]+/platforms/my-platform/channels/my-channel/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "releases": []
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
  def list(params: ParamsResourcePlatformsChannelsVersionsReleasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlatformsChannelsVersionsReleasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
