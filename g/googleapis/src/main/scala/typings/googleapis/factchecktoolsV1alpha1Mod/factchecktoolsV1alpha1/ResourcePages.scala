package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/factchecktools/v1alpha1", "factchecktools_v1alpha1.Resource$Pages")
@js.native
open class ResourcePages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(params: ParamsResourcePagesCreate): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(
    params: ParamsResourcePagesCreate,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def create(
    params: ParamsResourcePagesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage],
    callback: BodyResponseCallback[Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def create(params: ParamsResourcePagesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(
    params: ParamsResourcePagesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  /**
    * Create `ClaimReview` markup on a page.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/factchecktools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const factchecktools = google.factchecktools('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/userinfo.email'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await factchecktools.pages.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "claimReviewAuthor": {},
    *       //   "claimReviewMarkups": [],
    *       //   "name": "my_name",
    *       //   "pageUrl": "my_pageUrl",
    *       //   "publishDate": "my_publishDate",
    *       //   "versionId": "my_versionId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "claimReviewAuthor": {},
    *   //   "claimReviewMarkups": [],
    *   //   "name": "my_name",
    *   //   "pageUrl": "my_pageUrl",
    *   //   "publishDate": "my_publishDate",
    *   //   "versionId": "my_versionId"
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
  def create(params: ParamsResourcePagesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePagesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePagesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePagesDelete, callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(
    params: ParamsResourcePagesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePagesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete all `ClaimReview` markup on a page.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/factchecktools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const factchecktools = google.factchecktools('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/userinfo.email'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await factchecktools.pages.delete({
    *     // The name of the resource to delete, in the form of `pages/{page_id\}`.
    *     name: 'pages/my-page',
    *   });
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
  def delete(params: ParamsResourcePagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(params: ParamsResourcePagesGet): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(
    params: ParamsResourcePagesGet,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def get(
    params: ParamsResourcePagesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage],
    callback: BodyResponseCallback[Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def get(params: ParamsResourcePagesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(
    params: ParamsResourcePagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  /**
    * Get all `ClaimReview` markup on a page.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/factchecktools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const factchecktools = google.factchecktools('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/userinfo.email'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await factchecktools.pages.get({
    *     // The name of the resource to get, in the form of `pages/{page_id\}`.
    *     name: 'pages/my-page',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "claimReviewAuthor": {},
    *   //   "claimReviewMarkups": [],
    *   //   "name": "my_name",
    *   //   "pageUrl": "my_pageUrl",
    *   //   "publishDate": "my_publishDate",
    *   //   "versionId": "my_versionId"
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
  def get(params: ParamsResourcePagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
  def list(params: ParamsResourcePagesList): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
  def list(
    params: ParamsResourcePagesList,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePagesList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourcePagesList, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
  def list(
    params: ParamsResourcePagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  ): Unit = js.native
  /**
    * List the `ClaimReview` markup pages for a specific URL or for an organization.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/factchecktools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const factchecktools = google.factchecktools('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/userinfo.email'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await factchecktools.pages.list({
    *     // An integer that specifies the current offset (that is, starting result location) in search results. This field is only considered if `page_token` is unset, and if the request is not for a specific URL. For example, 0 means to return results starting from the first matching result, and 10 means to return from the 11th result.
    *     offset: 'placeholder-value',
    *     // The organization for which we want to fetch markups for. For instance, "site.com". Cannot be specified along with an URL.
    *     organization: 'placeholder-value',
    *     // The pagination size. We will return up to that many results. Defaults to 10 if not set. Has no effect if a URL is requested.
    *     pageSize: 'placeholder-value',
    *     // The pagination token. You may provide the `next_page_token` returned from a previous List request, if any, in order to get the next page. All other fields must have the same values as in the previous request.
    *     pageToken: 'placeholder-value',
    *     // The URL from which to get `ClaimReview` markup. There will be at most one result. If markup is associated with a more canonical version of the URL provided, we will return that URL instead. Cannot be specified along with an organization.
    *     url: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "claimReviewMarkupPages": [],
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
  def list(params: ParamsResourcePagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def update(
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def update(params: ParamsResourcePagesUpdate): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: BodyResponseCallback[Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage],
    callback: BodyResponseCallback[Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  def update(params: ParamsResourcePagesUpdate, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  ): Unit = js.native
  /**
    * Update for all `ClaimReview` markup on a page Note that this is a full update. To retain the existing `ClaimReview` markup on a page, first perform a Get operation, then modify the returned markup, and finally call Update with the entire `ClaimReview` markup as the body.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/factchecktools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const factchecktools = google.factchecktools('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/userinfo.email'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await factchecktools.pages.update({
    *     // The name of this `ClaimReview` markup page resource, in the form of `pages/{page_id\}`. Except for update requests, this field is output-only and should not be set by the user.
    *     name: 'pages/my-page',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "claimReviewAuthor": {},
    *       //   "claimReviewMarkups": [],
    *       //   "name": "my_name",
    *       //   "pageUrl": "my_pageUrl",
    *       //   "publishDate": "my_publishDate",
    *       //   "versionId": "my_versionId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "claimReviewAuthor": {},
    *   //   "claimReviewMarkups": [],
    *   //   "name": "my_name",
    *   //   "pageUrl": "my_pageUrl",
    *   //   "publishDate": "my_publishDate",
    *   //   "versionId": "my_versionId"
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
  def update(params: ParamsResourcePagesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
