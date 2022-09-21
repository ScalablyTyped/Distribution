package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1p1beta1", "cloudasset_v1p1beta1.Resource$Resources")
@js.native
open class ResourceResources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def searchAll(): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAll(callback: BodyResponseCallback[SchemaSearchAllResourcesResponse]): Unit = js.native
  def searchAll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAll(params: ParamsResourceResourcesSearchall): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAll(
    params: ParamsResourceResourcesSearchall,
    callback: BodyResponseCallback[SchemaSearchAllResourcesResponse]
  ): Unit = js.native
  def searchAll(
    params: ParamsResourceResourcesSearchall,
    options: BodyResponseCallback[Readable | SchemaSearchAllResourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchAllResourcesResponse]
  ): Unit = js.native
  def searchAll(params: ParamsResourceResourcesSearchall, options: MethodOptions): GaxiosPromise[SchemaSearchAllResourcesResponse] = js.native
  def searchAll(
    params: ParamsResourceResourcesSearchall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchAllResourcesResponse]
  ): Unit = js.native
  /**
    * Searches all the resources within a given accessible CRM scope (project/folder/organization). This RPC gives callers especially administrators the ability to search all the resources within a scope, even if they don't have `.get` permission of all the resources. Callers should have `cloud.assets.SearchAllResources` permission on the requested scope, otherwise the request will be rejected.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1p1beta1');
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
    *   const res = await cloudasset.resources.searchAll({
    *     // Optional. A list of asset types that this request searches for. If empty, it will search all the supported asset types.
    *     assetTypes: 'placeholder-value',
    *     // Optional. A comma separated list of fields specifying the sorting order of the results. The default order is ascending. Add ` DESC` after the field name to indicate descending order. Redundant space characters are ignored. For example, ` location DESC , name `.
    *     orderBy: 'placeholder-value',
    *     // Optional. The page size for search result pagination. Page size is capped at 500 even if a larger value is given. If set to zero, server will pick an appropriate default. Returned results may be fewer than requested. When this happens, there could be more results as long as `next_page_token` is returned.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of all other method parameters, must be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Optional. The query statement.
    *     query: 'placeholder-value',
    *     // Required. The relative name of an asset. The search is limited to the resources within the `scope`. The allowed value must be: * Organization number (such as "organizations/123") * Folder number(such as "folders/1234") * Project number (such as "projects/12345") * Project id (such as "projects/abc")
    *     scope: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "results": []
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
  def searchAll(params: ParamsResourceResourcesSearchall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchAll(
    params: ParamsResourceResourcesSearchall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
