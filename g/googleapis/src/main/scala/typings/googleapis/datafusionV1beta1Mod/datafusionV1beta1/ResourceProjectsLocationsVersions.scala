package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datafusion/v1beta1", "datafusion_v1beta1.Resource$Projects$Locations$Versions")
@js.native
open class ResourceProjectsLocationsVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListAvailableVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAvailableVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAvailableVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsVersionsList): GaxiosPromise[SchemaListAvailableVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVersionsList,
    callback: BodyResponseCallback[SchemaListAvailableVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsVersionsList,
    options: BodyResponseCallback[Readable | SchemaListAvailableVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAvailableVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsVersionsList, options: MethodOptions): GaxiosPromise[SchemaListAvailableVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAvailableVersionsResponse]
  ): Unit = js.native
  /**
    * Lists possible versions for Data Fusion instances in the specified project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datafusion.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datafusion = google.datafusion('v1beta1');
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
    *   const res = await datafusion.projects.locations.versions.list({
    *     // Whether or not to return the latest patch of every available minor version. If true, only the latest patch will be returned. Ex. if allowed versions is [6.1.1, 6.1.2, 6.2.0] then response will be [6.1.2, 6.2.0]
    *     latestPatchOnly: 'placeholder-value',
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value to use if there are additional results to retrieve for this list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project and location for which to retrieve instance information in the format projects/{project\}/locations/{location\}.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availableVersions": [],
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
  def list(params: ParamsResourceProjectsLocationsVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
