package typings.googleapis.composerV1Mod.composerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/composer/v1", "composer_v1.Resource$Projects$Locations$Imageversions")
@js.native
open class ResourceProjectsLocationsImageversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListImageVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsImageversionsList): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsImageversionsList,
    callback: BodyResponseCallback[SchemaListImageVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsImageversionsList,
    options: BodyResponseCallback[Readable | SchemaListImageVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListImageVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsImageversionsList, options: MethodOptions): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsImageversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListImageVersionsResponse]
  ): Unit = js.native
  /**
    * List ImageVersions for provided location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/composer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const composer = google.composer('v1');
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
    *   const res = await composer.projects.locations.imageVersions.list({
    *     // Whether or not image versions from old releases should be included.
    *     includePastReleases: 'placeholder-value',
    *     // The maximum number of image_versions to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // List ImageVersions in the given project and location, in the form: "projects/{projectId\}/locations/{locationId\}"
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "imageVersions": [],
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
  def list(params: ParamsResourceProjectsLocationsImageversionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsImageversionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
