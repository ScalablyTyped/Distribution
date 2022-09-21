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

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Versions$Files")
@js.native
open class ResourceSitesVersionsFiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListVersionFilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionFilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVersionFilesResponse] = js.native
  def list(params: ParamsResourceSitesVersionsFilesList): GaxiosPromise[SchemaListVersionFilesResponse] = js.native
  def list(
    params: ParamsResourceSitesVersionsFilesList,
    callback: BodyResponseCallback[SchemaListVersionFilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSitesVersionsFilesList,
    options: BodyResponseCallback[Readable | SchemaListVersionFilesResponse],
    callback: BodyResponseCallback[Readable | SchemaListVersionFilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesVersionsFilesList, options: MethodOptions): GaxiosPromise[SchemaListVersionFilesResponse] = js.native
  def list(
    params: ParamsResourceSitesVersionsFilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionFilesResponse]
  ): Unit = js.native
  /**
    * Lists the remaining files to be uploaded for the specified version.
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
    *   const res = await firebasehosting.sites.versions.files.list({
    *     // The maximum number of version files to return. The service may return a lower number if fewer version files exist than this maximum number. If unspecified, defaults to 1000.
    *     pageSize: 'placeholder-value',
    *     // A token from a previous call to `ListVersionFiles` that tells the server where to resume listing.
    *     pageToken: 'placeholder-value',
    *     // Required. The version for which to list files, in the format: sites/SITE_ID /versions/VERSION_ID
    *     parent: 'sites/my-site/versions/my-version',
    *     //  The type of files that should be listed for the specified version.
    *     status: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
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
  def list(params: ParamsResourceSitesVersionsFilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSitesVersionsFilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
