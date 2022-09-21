package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Csses")
@js.native
open class ResourceCsses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCss] = js.native
  def get(callback: BodyResponseCallback[SchemaCss]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCss] = js.native
  def get(params: ParamsResourceCssesGet): GaxiosPromise[SchemaCss] = js.native
  def get(params: ParamsResourceCssesGet, callback: BodyResponseCallback[SchemaCss]): Unit = js.native
  def get(
    params: ParamsResourceCssesGet,
    options: BodyResponseCallback[Readable | SchemaCss],
    callback: BodyResponseCallback[Readable | SchemaCss]
  ): Unit = js.native
  def get(params: ParamsResourceCssesGet, options: MethodOptions): GaxiosPromise[SchemaCss] = js.native
  def get(params: ParamsResourceCssesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaCss]): Unit = js.native
  /**
    * Retrieves a single CSS domain by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.csses.get({
    *     // Required. The ID of the CSS domain to return.
    *     cssDomainId: 'placeholder-value',
    *     // Required. The ID of the managing account. If this parameter is not the same as [cssDomainId](#cssDomainId), then this ID must be a CSS group ID and `cssDomainId` must be the ID of a CSS domain affiliated with this group.
    *     cssGroupId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cssDomainId": "my_cssDomainId",
    *   //   "cssGroupId": "my_cssGroupId",
    *   //   "displayName": "my_displayName",
    *   //   "fullName": "my_fullName",
    *   //   "homepageUri": "my_homepageUri",
    *   //   "labelIds": []
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
  def get(params: ParamsResourceCssesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCssesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCssesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCssesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCssesResponse] = js.native
  def list(params: ParamsResourceCssesList): GaxiosPromise[SchemaListCssesResponse] = js.native
  def list(params: ParamsResourceCssesList, callback: BodyResponseCallback[SchemaListCssesResponse]): Unit = js.native
  def list(
    params: ParamsResourceCssesList,
    options: BodyResponseCallback[Readable | SchemaListCssesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCssesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCssesList, options: MethodOptions): GaxiosPromise[SchemaListCssesResponse] = js.native
  def list(
    params: ParamsResourceCssesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCssesResponse]
  ): Unit = js.native
  /**
    * Lists CSS domains affiliated with a CSS group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.csses.list({
    *     // Required. The CSS group ID of CSS domains to be listed.
    *     cssGroupId: 'placeholder-value',
    *     // The maximum number of CSS domains to return. The service may return fewer than this value. If unspecified, at most 50 CSS domains will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListCsses` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCsses` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "csses": [],
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
  def list(params: ParamsResourceCssesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCssesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updatelabels(): GaxiosPromise[SchemaCss] = js.native
  def updatelabels(callback: BodyResponseCallback[SchemaCss]): Unit = js.native
  def updatelabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCss] = js.native
  def updatelabels(params: ParamsResourceCssesUpdatelabels): GaxiosPromise[SchemaCss] = js.native
  def updatelabels(params: ParamsResourceCssesUpdatelabels, callback: BodyResponseCallback[SchemaCss]): Unit = js.native
  def updatelabels(
    params: ParamsResourceCssesUpdatelabels,
    options: BodyResponseCallback[Readable | SchemaCss],
    callback: BodyResponseCallback[Readable | SchemaCss]
  ): Unit = js.native
  def updatelabels(params: ParamsResourceCssesUpdatelabels, options: MethodOptions): GaxiosPromise[SchemaCss] = js.native
  def updatelabels(
    params: ParamsResourceCssesUpdatelabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCss]
  ): Unit = js.native
  /**
    * Updates labels that are assigned to a CSS domain by its CSS group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.csses.updatelabels({
    *     // Required. The ID of the updated CSS domain.
    *     cssDomainId: 'placeholder-value',
    *     // Required. The CSS group ID of the updated CSS domain.
    *     cssGroupId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labelIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cssDomainId": "my_cssDomainId",
    *   //   "cssGroupId": "my_cssGroupId",
    *   //   "displayName": "my_displayName",
    *   //   "fullName": "my_fullName",
    *   //   "homepageUri": "my_homepageUri",
    *   //   "labelIds": []
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
  def updatelabels(params: ParamsResourceCssesUpdatelabels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updatelabels(
    params: ParamsResourceCssesUpdatelabels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
