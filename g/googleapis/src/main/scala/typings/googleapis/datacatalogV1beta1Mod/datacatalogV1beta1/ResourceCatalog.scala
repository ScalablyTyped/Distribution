package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1beta1", "datacatalog_v1beta1.Resource$Catalog")
@js.native
open class ResourceCatalog protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse] = js.native
  def search(params: ParamsResourceCatalogSearch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse] = js.native
  def search(
    params: ParamsResourceCatalogSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceCatalogSearch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse]
  ): Unit = js.native
  def search(params: ParamsResourceCatalogSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse] = js.native
  def search(
    params: ParamsResourceCatalogSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1SearchCatalogResponse]
  ): Unit = js.native
  /**
    * Searches Data Catalog for multiple resources like entries, tags that match a query. This is a custom method (https://cloud.google.com/apis/design/custom_methods) and does not return the complete resource, only the resource identifier and high level fields. Clients can subsequently call `Get` methods. Note that Data Catalog search queries do not guarantee full recall. Query results that match your query may not be returned, even in subsequent result pages. Also note that results returned (and not returned) can vary across repeated search queries. See [Data Catalog Search Syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference) for more information.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.catalog.search({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "orderBy": "my_orderBy",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "query": "my_query",
    *       //   "scope": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "results": [],
    *   //   "unreachable": []
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
  def search(params: ParamsResourceCatalogSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceCatalogSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
