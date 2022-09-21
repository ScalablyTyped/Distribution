package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/ondemandscanning/v1beta1", "ondemandscanning_v1beta1.Resource$Projects$Locations$Scans$Vulnerabilities")
@js.native
open class ResourceProjectsLocationsScansVulnerabilities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListVulnerabilitiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVulnerabilitiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVulnerabilitiesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsScansVulnerabilitiesList): GaxiosPromise[SchemaListVulnerabilitiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsScansVulnerabilitiesList,
    callback: BodyResponseCallback[SchemaListVulnerabilitiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsScansVulnerabilitiesList,
    options: BodyResponseCallback[Readable | SchemaListVulnerabilitiesResponse],
    callback: BodyResponseCallback[Readable | SchemaListVulnerabilitiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsScansVulnerabilitiesList, options: MethodOptions): GaxiosPromise[SchemaListVulnerabilitiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsScansVulnerabilitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVulnerabilitiesResponse]
  ): Unit = js.native
  /**
    * Lists vulnerabilities resulting from a successfully completed scan.
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
    * const ondemandscanning = google.ondemandscanning('v1beta1');
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
    *     await ondemandscanning.projects.locations.scans.vulnerabilities.list({
    *       // The number of vulnerabilities to retrieve.
    *       pageSize: 'placeholder-value',
    *       // The page token, resulting from a previous call to ListVulnerabilities.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent of the collection of Vulnerabilities being requested. Format: projects/[project_name]/locations/[location]/scans/[scan_id]
    *       parent: 'projects/my-project/locations/my-location/scans/my-scan',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "occurrences": []
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
  def list(params: ParamsResourceProjectsLocationsScansVulnerabilitiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsScansVulnerabilitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
