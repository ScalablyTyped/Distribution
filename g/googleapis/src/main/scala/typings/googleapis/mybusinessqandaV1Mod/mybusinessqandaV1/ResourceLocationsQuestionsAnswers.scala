package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessqanda/v1", "mybusinessqanda_v1.Resource$Locations$Questions$Answers")
@js.native
open class ResourceLocationsQuestionsAnswers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsQuestionsAnswersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsQuestionsAnswersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceLocationsQuestionsAnswersDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLocationsQuestionsAnswersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceLocationsQuestionsAnswersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the answer written by the current user to a question.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessqanda.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessqanda = google.mybusinessqanda('v1');
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
    *   const res = await mybusinessqanda.locations.questions.answers.delete({
    *     // Required. The name of the question to delete an answer for.
    *     name: 'locations/my-location/questions/my-question',
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
  def delete(params: ParamsResourceLocationsQuestionsAnswersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLocationsQuestionsAnswersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAnswersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAnswersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAnswersResponse] = js.native
  def list(params: ParamsResourceLocationsQuestionsAnswersList): GaxiosPromise[SchemaListAnswersResponse] = js.native
  def list(
    params: ParamsResourceLocationsQuestionsAnswersList,
    callback: BodyResponseCallback[SchemaListAnswersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLocationsQuestionsAnswersList,
    options: BodyResponseCallback[Readable | SchemaListAnswersResponse],
    callback: BodyResponseCallback[Readable | SchemaListAnswersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLocationsQuestionsAnswersList, options: MethodOptions): GaxiosPromise[SchemaListAnswersResponse] = js.native
  def list(
    params: ParamsResourceLocationsQuestionsAnswersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAnswersResponse]
  ): Unit = js.native
  /**
    * Returns the paginated list of answers for a specified question.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessqanda.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessqanda = google.mybusinessqanda('v1');
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
    *   const res = await mybusinessqanda.locations.questions.answers.list({
    *     // Optional. The order to return the answers. Valid options include 'update_time desc' and 'upvote_count desc', which will return the answers sorted descendingly by the requested field. The default sort order is 'update_time desc'.
    *     orderBy: 'placeholder-value',
    *     // Optional. How many answers to fetch per page. The default and maximum `page_size` values are 10.
    *     pageSize: 'placeholder-value',
    *     // Optional. If specified, the next page of answers is retrieved.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the question to fetch answers for.
    *     parent: 'locations/my-location/questions/my-question',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "answers": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
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
  def list(params: ParamsResourceLocationsQuestionsAnswersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLocationsQuestionsAnswersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upsert(): GaxiosPromise[SchemaAnswer] = js.native
  def upsert(callback: BodyResponseCallback[SchemaAnswer]): Unit = js.native
  def upsert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnswer] = js.native
  def upsert(params: ParamsResourceLocationsQuestionsAnswersUpsert): GaxiosPromise[SchemaAnswer] = js.native
  def upsert(
    params: ParamsResourceLocationsQuestionsAnswersUpsert,
    callback: BodyResponseCallback[SchemaAnswer]
  ): Unit = js.native
  def upsert(
    params: ParamsResourceLocationsQuestionsAnswersUpsert,
    options: BodyResponseCallback[Readable | SchemaAnswer],
    callback: BodyResponseCallback[Readable | SchemaAnswer]
  ): Unit = js.native
  def upsert(params: ParamsResourceLocationsQuestionsAnswersUpsert, options: MethodOptions): GaxiosPromise[SchemaAnswer] = js.native
  def upsert(
    params: ParamsResourceLocationsQuestionsAnswersUpsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnswer]
  ): Unit = js.native
  /**
    * Creates an answer or updates the existing answer written by the user for the specified question. A user can only create one answer per question.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessqanda.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessqanda = google.mybusinessqanda('v1');
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
    *   const res = await mybusinessqanda.locations.questions.answers.upsert({
    *     // Required. The name of the question to write an answer for.
    *     parent: 'locations/my-location/questions/my-question',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "answer": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "text": "my_text",
    *   //   "updateTime": "my_updateTime",
    *   //   "upvoteCount": 0
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
  def upsert(params: ParamsResourceLocationsQuestionsAnswersUpsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upsert(
    params: ParamsResourceLocationsQuestionsAnswersUpsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
