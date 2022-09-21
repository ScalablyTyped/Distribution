package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessbusinessinformation/v1", "mybusinessbusinessinformation_v1.Resource$Categories")
@js.native
open class ResourceCategories protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaBatchGetCategoriesResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetCategoriesResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetCategoriesResponse] = js.native
  def batchGet(params: ParamsResourceCategoriesBatchget): GaxiosPromise[SchemaBatchGetCategoriesResponse] = js.native
  def batchGet(
    params: ParamsResourceCategoriesBatchget,
    callback: BodyResponseCallback[SchemaBatchGetCategoriesResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceCategoriesBatchget,
    options: BodyResponseCallback[Readable | SchemaBatchGetCategoriesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetCategoriesResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceCategoriesBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetCategoriesResponse] = js.native
  def batchGet(
    params: ParamsResourceCategoriesBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetCategoriesResponse]
  ): Unit = js.native
  /**
    * Returns a list of business categories for the provided language and GConcept ids.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.categories.batchGet({
    *     // Required. The BCP 47 code of language that the category names should be returned in.
    *     languageCode: 'placeholder-value',
    *     // Required. At least one name must be set. The GConcept ids the localized category names should be returned for. To return details for more than one category, repeat this parameter in the request.
    *     names: 'placeholder-value',
    *     // Optional. The ISO 3166-1 alpha-2 country code used to infer non-standard language.
    *     regionCode: 'placeholder-value',
    *     // Required. Specifies which parts to the Category resource should be returned in the response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "categories": []
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
  def batchGet(params: ParamsResourceCategoriesBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceCategoriesBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListCategoriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCategoriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCategoriesResponse] = js.native
  def list(params: ParamsResourceCategoriesList): GaxiosPromise[SchemaListCategoriesResponse] = js.native
  def list(params: ParamsResourceCategoriesList, callback: BodyResponseCallback[SchemaListCategoriesResponse]): Unit = js.native
  def list(
    params: ParamsResourceCategoriesList,
    options: BodyResponseCallback[Readable | SchemaListCategoriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCategoriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCategoriesList, options: MethodOptions): GaxiosPromise[SchemaListCategoriesResponse] = js.native
  def list(
    params: ParamsResourceCategoriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCategoriesResponse]
  ): Unit = js.native
  /**
    * Returns a list of business categories. Search will match the category name but not the category ID. Search only matches the front of a category name (that is, 'food' may return 'Food Court' but not 'Fast Food Restaurant').
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.categories.list({
    *     // Optional. Filter string from user. The only field that supported is `displayName`. Eg: `filter=displayName=foo`.
    *     filter: 'placeholder-value',
    *     // Required. The BCP 47 code of language.
    *     languageCode: 'placeholder-value',
    *     // Optional. How many categories to fetch per page. Default is 100, minimum is 1, and maximum page size is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. If specified, the next page of categories will be fetched.
    *     pageToken: 'placeholder-value',
    *     // Required. The ISO 3166-1 alpha-2 country code.
    *     regionCode: 'placeholder-value',
    *     // Required. Specifies which parts to the Category resource should be returned in the response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "categories": [],
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
  def list(params: ParamsResourceCategoriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCategoriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
