package typings.googleapis.containerV1Mod.containerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Aggregated$Usablesubnetworks")
@js.native
open class ResourceProjectsAggregatedUsablesubnetworks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUsableSubnetworksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(params: ParamsResourceProjectsAggregatedUsablesubnetworksList): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(
    params: ParamsResourceProjectsAggregatedUsablesubnetworksList,
    callback: BodyResponseCallback[SchemaListUsableSubnetworksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAggregatedUsablesubnetworksList,
    options: BodyResponseCallback[Readable | SchemaListUsableSubnetworksResponse],
    callback: BodyResponseCallback[Readable | SchemaListUsableSubnetworksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAggregatedUsablesubnetworksList, options: MethodOptions): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(
    params: ParamsResourceProjectsAggregatedUsablesubnetworksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUsableSubnetworksResponse]
  ): Unit = js.native
  /**
    * Lists subnetworks that are usable for creating clusters in a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
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
    *   const res = await container.projects.aggregated.usableSubnetworks.list({
    *     // Filtering currently only supports equality on the networkProjectId and must be in the form: "networkProjectId=[PROJECTID]", where `networkProjectId` is the project which owns the listed subnetworks. This defaults to the parent project ID.
    *     filter: 'placeholder-value',
    *     // The max number of results per page that should be returned. If the number of available results is larger than `page_size`, a `next_page_token` is returned which can be used to get the next page of results in subsequent requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    *     pageSize: 'placeholder-value',
    *     // Specifies a page token to use. Set this to the nextPageToken returned by previous list requests to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // The parent project where subnetworks are usable. Specified in the format `projects/x`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "subnetworks": []
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
  def list(params: ParamsResourceProjectsAggregatedUsablesubnetworksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAggregatedUsablesubnetworksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
