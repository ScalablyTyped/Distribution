package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Projects$Sources")
@js.native
open class ResourceProjectsSources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var findings: ResourceProjectsSourcesFindings = js.native
  
  def list(): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSourcesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(params: ParamsResourceProjectsSourcesList): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsSourcesList,
    callback: BodyResponseCallback[SchemaListSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsSourcesList,
    options: BodyResponseCallback[Readable | SchemaListSourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsSourcesList, options: MethodOptions): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsSourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSourcesResponse]
  ): Unit = js.native
  /**
    * Lists all sources belonging to an organization.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.projects.sources.list({
    *     // The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListSourcesResponse`; indicates that this is a continuation of a prior `ListSources` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the parent of sources to list. Its format should be "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sources": []
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
  def list(params: ParamsResourceProjectsSourcesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsSourcesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
