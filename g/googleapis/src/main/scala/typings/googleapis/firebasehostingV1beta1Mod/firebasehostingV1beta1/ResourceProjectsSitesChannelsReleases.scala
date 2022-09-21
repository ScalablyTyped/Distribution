package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Projects$Sites$Channels$Releases")
@js.native
open class ResourceProjectsSitesChannelsReleases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaRelease] = js.native
  def create(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def create(params: ParamsResourceProjectsSitesChannelsReleasesCreate): GaxiosPromise[SchemaRelease] = js.native
  def create(
    params: ParamsResourceProjectsSitesChannelsReleasesCreate,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsSitesChannelsReleasesCreate,
    options: BodyResponseCallback[Readable | SchemaRelease],
    callback: BodyResponseCallback[Readable | SchemaRelease]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsSitesChannelsReleasesCreate, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def create(
    params: ParamsResourceProjectsSitesChannelsReleasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  /**
    * Creates a new release, which makes the content of the specified version actively display on the appropriate URL(s).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.projects.sites.channels.releases.create({
    *     // Required. The site or channel to which the release belongs, in either of the following formats: - sites/SITE_ID - sites/SITE_ID/channels/CHANNEL_ID
    *     parent: 'projects/my-project/sites/my-site/channels/my-channel',
    *     //  The unique identifier for a version, in the format: sites/SITE_ID/versions/ VERSION_ID The SITE_ID in this version identifier must match the SITE_ID in the `parent` parameter. This query parameter must be empty if the `type` field in the request body is `SITE_DISABLE`.
    *     versionName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "message": "my_message",
    *       //   "name": "my_name",
    *       //   "releaseTime": "my_releaseTime",
    *       //   "releaseUser": {},
    *       //   "type": "my_type",
    *       //   "version": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "message": "my_message",
    *   //   "name": "my_name",
    *   //   "releaseTime": "my_releaseTime",
    *   //   "releaseUser": {},
    *   //   "type": "my_type",
    *   //   "version": {}
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
  def create(params: ParamsResourceProjectsSitesChannelsReleasesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsSitesChannelsReleasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReleasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(params: ParamsResourceProjectsSitesChannelsReleasesList): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsSitesChannelsReleasesList,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsSitesChannelsReleasesList,
    options: BodyResponseCallback[Readable | SchemaListReleasesResponse],
    callback: BodyResponseCallback[Readable | SchemaListReleasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsSitesChannelsReleasesList, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsSitesChannelsReleasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  /**
    * Lists the releases that have been created for the specified site or channel. When used to list releases for a site, this list includes releases for both the default `live` channel and any active preview channels for the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.projects.sites.channels.releases.list({
    *     // The maximum number of releases to return. The service may return a lower number if fewer releases exist than this maximum number. If unspecified, defaults to 100.
    *     pageSize: 'placeholder-value',
    *     // A token from a previous call to `releases.list` or `channels.releases.list` that tells the server where to resume listing.
    *     pageToken: 'placeholder-value',
    *     // Required. The site or channel for which to list releases, in either of the following formats: - sites/SITE_ID - sites/SITE_ID/channels/CHANNEL_ID
    *     parent: 'projects/my-project/sites/my-site/channels/my-channel',
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
  def list(params: ParamsResourceProjectsSitesChannelsReleasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsSitesChannelsReleasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
