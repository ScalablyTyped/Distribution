package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsupport/v2beta", "cloudsupport_v2beta.Resource$Cases$Comments")
@js.native
open class ResourceCasesComments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaComment] = js.native
  def create(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def create(params: ParamsResourceCasesCommentsCreate): GaxiosPromise[SchemaComment] = js.native
  def create(params: ParamsResourceCasesCommentsCreate, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def create(
    params: ParamsResourceCasesCommentsCreate,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def create(params: ParamsResourceCasesCommentsCreate, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def create(
    params: ParamsResourceCasesCommentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Add a new comment to the specified Case.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsupport.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsupport = google.cloudsupport('v2beta');
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
    *   const res = await cloudsupport.cases.comments.create({
    *     // Required. The resource name of Case to which this comment should be added.
    *     parent: '[^/]+/[^/]+/cases/my-case',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "body": "my_body",
    *       //   "createTime": "my_createTime",
    *       //   "creator": {},
    *       //   "name": "my_name",
    *       //   "plainTextBody": "my_plainTextBody"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "body": "my_body",
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "name": "my_name",
    *   //   "plainTextBody": "my_plainTextBody"
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
  def create(params: ParamsResourceCasesCommentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCasesCommentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCommentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCommentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCommentsResponse] = js.native
  def list(params: ParamsResourceCasesCommentsList): GaxiosPromise[SchemaListCommentsResponse] = js.native
  def list(
    params: ParamsResourceCasesCommentsList,
    callback: BodyResponseCallback[SchemaListCommentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCasesCommentsList,
    options: BodyResponseCallback[Readable | SchemaListCommentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCommentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCasesCommentsList, options: MethodOptions): GaxiosPromise[SchemaListCommentsResponse] = js.native
  def list(
    params: ParamsResourceCasesCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCommentsResponse]
  ): Unit = js.native
  /**
    * Retrieve all Comments associated with the Case object.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsupport.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsupport = google.cloudsupport('v2beta');
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
    *   const res = await cloudsupport.cases.comments.list({
    *     // The maximum number of comments fetched with each request. Defaults to 10.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return. If unspecified, the first page is retrieved.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of Case object for which comments should be listed.
    *     parent: '[^/]+/[^/]+/cases/my-case',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "comments": [],
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
  def list(params: ParamsResourceCasesCommentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCasesCommentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
