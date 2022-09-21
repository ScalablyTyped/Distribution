package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/ondemandscanning/v1", "ondemandscanning_v1.Resource$Projects$Locations$Scans")
@js.native
open class ResourceProjectsLocationsScans protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def analyzePackages(): GaxiosPromise[SchemaOperation] = js.native
  def analyzePackages(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def analyzePackages(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def analyzePackages(params: ParamsResourceProjectsLocationsScansAnalyzepackages): GaxiosPromise[SchemaOperation] = js.native
  def analyzePackages(
    params: ParamsResourceProjectsLocationsScansAnalyzepackages,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def analyzePackages(
    params: ParamsResourceProjectsLocationsScansAnalyzepackages,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def analyzePackages(params: ParamsResourceProjectsLocationsScansAnalyzepackages, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def analyzePackages(
    params: ParamsResourceProjectsLocationsScansAnalyzepackages,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Initiates an analysis of the provided packages.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ondemandscanning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ondemandscanning = google.ondemandscanning('v1');
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
    *   const res = await ondemandscanning.projects.locations.scans.analyzePackages({
    *     // Required. The parent of the resource for which analysis is requested. Format: projects/[project_name]/locations/[location]
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "includeOsvData": false,
    *       //   "packages": [],
    *       //   "resourceUri": "my_resourceUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def analyzePackages(params: ParamsResourceProjectsLocationsScansAnalyzepackages, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzePackages(
    params: ParamsResourceProjectsLocationsScansAnalyzepackages,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var vulnerabilities: ResourceProjectsLocationsScansVulnerabilities = js.native
}
