package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Negativekeywordlists$Negativekeywords")
@js.native
open class ResourceAdvertisersNegativekeywordlistsNegativekeywords protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkEdit(): GaxiosPromise[SchemaBulkEditNegativeKeywordsResponse] = js.native
  def bulkEdit(callback: BodyResponseCallback[SchemaBulkEditNegativeKeywordsResponse]): Unit = js.native
  def bulkEdit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditNegativeKeywordsResponse] = js.native
  def bulkEdit(params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsBulkedit): GaxiosPromise[SchemaBulkEditNegativeKeywordsResponse] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsBulkedit,
    callback: BodyResponseCallback[SchemaBulkEditNegativeKeywordsResponse]
  ): Unit = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsBulkedit,
    options: BodyResponseCallback[Readable | SchemaBulkEditNegativeKeywordsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditNegativeKeywordsResponse]
  ): Unit = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsBulkedit,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkEditNegativeKeywordsResponse] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsBulkedit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkEditNegativeKeywordsResponse]
  ): Unit = js.native
  /**
    * Bulk edits negative keywords in a single negative keyword list. The operation will delete the negative keywords provided in BulkEditNegativeKeywordsRequest.deleted_negative_keywords and then create the negative keywords provided in BulkEditNegativeKeywordsRequest.created_negative_keywords. This operation is guaranteed to be atomic and will never result in a partial success or partial failure.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await displayvideo.advertisers.negativeKeywordLists.negativeKeywords.bulkEdit(
    *       {
    *         // Required. The ID of the DV360 advertiser to which the parent negative keyword list belongs.
    *         advertiserId: 'placeholder-value',
    *         // Required. The ID of the parent negative keyword list to which the negative keywords belong.
    *         negativeKeywordListId: '[^/]+',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "createdNegativeKeywords": [],
    *           //   "deletedNegativeKeywords": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "negativeKeywords": []
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
  def bulkEdit(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsBulkedit,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsBulkedit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaNegativeKeyword] = js.native
  def create(callback: BodyResponseCallback[SchemaNegativeKeyword]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNegativeKeyword] = js.native
  def create(params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsCreate): GaxiosPromise[SchemaNegativeKeyword] = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsCreate,
    callback: BodyResponseCallback[SchemaNegativeKeyword]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsCreate,
    options: BodyResponseCallback[Readable | SchemaNegativeKeyword],
    callback: BodyResponseCallback[Readable | SchemaNegativeKeyword]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaNegativeKeyword] = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNegativeKeyword]
  ): Unit = js.native
  /**
    * Creates a negative keyword in a negative keyword list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await displayvideo.advertisers.negativeKeywordLists.negativeKeywords.create(
    *       {
    *         // Required. The ID of the DV360 advertiser to which the parent negative keyword list belongs.
    *         advertiserId: 'placeholder-value',
    *         // Required. The ID of the parent negative keyword list in which the negative keyword will be created.
    *         negativeKeywordListId: '[^/]+',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "keywordValue": "my_keywordValue",
    *           //   "name": "my_name"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keywordValue": "my_keywordValue",
    *   //   "name": "my_name"
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
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a negative keyword from a negative keyword list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await displayvideo.advertisers.negativeKeywordLists.negativeKeywords.delete(
    *       {
    *         // Required. The ID of the DV360 advertiser to which the parent negative keyword list belongs.
    *         advertiserId: 'placeholder-value',
    *         // Required. The keyword value of the negative keyword to delete.
    *         keywordValue: '[^/]+',
    *         // Required. The ID of the parent negative keyword list to which the negative keyword belongs.
    *         negativeKeywordListId: '[^/]+',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNegativeKeywordsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNegativeKeywordsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNegativeKeywordsResponse] = js.native
  def list(params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsList): GaxiosPromise[SchemaListNegativeKeywordsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsList,
    callback: BodyResponseCallback[SchemaListNegativeKeywordsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsList,
    options: BodyResponseCallback[Readable | SchemaListNegativeKeywordsResponse],
    callback: BodyResponseCallback[Readable | SchemaListNegativeKeywordsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsList, options: MethodOptions): GaxiosPromise[SchemaListNegativeKeywordsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNegativeKeywordsResponse]
  ): Unit = js.native
  /**
    * Lists negative keywords in a negative keyword list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await displayvideo.advertisers.negativeKeywordLists.negativeKeywords.list({
    *       // Required. The ID of the DV360 advertiser to which the parent negative keyword list belongs.
    *       advertiserId: '[^/]+',
    *       // Allows filtering by negative keyword fields. Supported syntax: * Filter expressions for negative keyword currently can only contain at most one * restriction. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)`. * Supported fields: - `keywordValue` Examples: * All negative keywords for which the keyword value contains "google": `keywordValue : "google"`
    *       filter: 'placeholder-value',
    *       // Required. The ID of the parent negative keyword list to which the requested negative keywords belong.
    *       negativeKeywordListId: '[^/]+',
    *       // Field by which to sort the list. Acceptable values are: * `keywordValue` (default) The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be added to the field name. Example: `keywordValue desc`.
    *       orderBy: 'placeholder-value',
    *       // Requested page size. Must be between `1` and `1000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *       pageSize: 'placeholder-value',
    *       // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListNegativeKeywords` method. If not specified, the first page of results will be returned.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "negativeKeywords": [],
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
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def replace(): GaxiosPromise[SchemaReplaceNegativeKeywordsResponse] = js.native
  def replace(callback: BodyResponseCallback[SchemaReplaceNegativeKeywordsResponse]): Unit = js.native
  def replace(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReplaceNegativeKeywordsResponse] = js.native
  def replace(params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace): GaxiosPromise[SchemaReplaceNegativeKeywordsResponse] = js.native
  def replace(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace,
    callback: BodyResponseCallback[SchemaReplaceNegativeKeywordsResponse]
  ): Unit = js.native
  def replace(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace,
    options: BodyResponseCallback[Readable | SchemaReplaceNegativeKeywordsResponse],
    callback: BodyResponseCallback[Readable | SchemaReplaceNegativeKeywordsResponse]
  ): Unit = js.native
  def replace(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace,
    options: MethodOptions
  ): GaxiosPromise[SchemaReplaceNegativeKeywordsResponse] = js.native
  def replace(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplaceNegativeKeywordsResponse]
  ): Unit = js.native
  /**
    * Replaces all negative keywords in a single negative keyword list. The operation will replace the keywords in a negative keyword list with keywords provided in ReplaceNegativeKeywordsRequest.new_negative_keywords.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await displayvideo.advertisers.negativeKeywordLists.negativeKeywords.replace(
    *       {
    *         // Required. The ID of the DV360 advertiser to which the parent negative keyword list belongs.
    *         advertiserId: 'placeholder-value',
    *         // Required. The ID of the parent negative keyword list to which the negative keywords belong.
    *         negativeKeywordListId: '[^/]+',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "newNegativeKeywords": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "negativeKeywords": []
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
  def replace(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def replace(
    params: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
