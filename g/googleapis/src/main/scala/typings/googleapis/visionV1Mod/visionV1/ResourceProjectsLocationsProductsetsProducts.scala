package typings.googleapis.visionV1Mod.visionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Projects$Locations$Productsets$Products")
@js.native
open class ResourceProjectsLocationsProductsetsProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProductsInProductSetResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProductsetsProductsList): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsProductsList,
    callback: BodyResponseCallback[SchemaListProductsInProductSetResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsProductsList,
    options: BodyResponseCallback[Readable | SchemaListProductsInProductSetResponse],
    callback: BodyResponseCallback[Readable | SchemaListProductsInProductSetResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProductsetsProductsList, options: MethodOptions): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProductsInProductSetResponse]
  ): Unit = js.native
  /**
    * Lists the Products in a ProductSet, in an unspecified order. If the ProductSet does not exist, the products field of the response will be empty. Possible errors: * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vision.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vision = google.vision('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-vision',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vision.projects.locations.productSets.products.list({
    *     // Required. The ProductSet resource for which to retrieve Products. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    *     name: 'projects/my-project/locations/my-location/productSets/my-productSet',
    *     // The maximum number of items to return. Default 10, maximum 100.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "products": []
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
  def list(params: ParamsResourceProjectsLocationsProductsetsProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
