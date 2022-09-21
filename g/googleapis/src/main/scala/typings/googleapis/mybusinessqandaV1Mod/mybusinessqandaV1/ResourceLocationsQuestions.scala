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

@JSImport("googleapis/build/src/apis/mybusinessqanda/v1", "mybusinessqanda_v1.Resource$Locations$Questions")
@js.native
open class ResourceLocationsQuestions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var answers: ResourceLocationsQuestionsAnswers = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaQuestion] = js.native
  def create(callback: BodyResponseCallback[SchemaQuestion]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQuestion] = js.native
  def create(params: ParamsResourceLocationsQuestionsCreate): GaxiosPromise[SchemaQuestion] = js.native
  def create(params: ParamsResourceLocationsQuestionsCreate, callback: BodyResponseCallback[SchemaQuestion]): Unit = js.native
  def create(
    params: ParamsResourceLocationsQuestionsCreate,
    options: BodyResponseCallback[Readable | SchemaQuestion],
    callback: BodyResponseCallback[Readable | SchemaQuestion]
  ): Unit = js.native
  def create(params: ParamsResourceLocationsQuestionsCreate, options: MethodOptions): GaxiosPromise[SchemaQuestion] = js.native
  def create(
    params: ParamsResourceLocationsQuestionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuestion]
  ): Unit = js.native
  /**
    * Adds a question for the specified location.
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
    *   const res = await mybusinessqanda.locations.questions.create({
    *     // Required. The name of the location to write a question for.
    *     parent: 'locations/my-location/questions',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "author": {},
    *       //   "createTime": "my_createTime",
    *       //   "name": "my_name",
    *       //   "text": "my_text",
    *       //   "topAnswers": [],
    *       //   "totalAnswerCount": 0,
    *       //   "updateTime": "my_updateTime",
    *       //   "upvoteCount": 0
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
    *   //   "topAnswers": [],
    *   //   "totalAnswerCount": 0,
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
  def create(params: ParamsResourceLocationsQuestionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceLocationsQuestionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsQuestionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsQuestionsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceLocationsQuestionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLocationsQuestionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceLocationsQuestionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a specific question written by the current user.
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
    *   const res = await mybusinessqanda.locations.questions.delete({
    *     // Required. The name of the question to delete.
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
  def delete(params: ParamsResourceLocationsQuestionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLocationsQuestionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListQuestionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListQuestionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListQuestionsResponse] = js.native
  def list(params: ParamsResourceLocationsQuestionsList): GaxiosPromise[SchemaListQuestionsResponse] = js.native
  def list(
    params: ParamsResourceLocationsQuestionsList,
    callback: BodyResponseCallback[SchemaListQuestionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLocationsQuestionsList,
    options: BodyResponseCallback[Readable | SchemaListQuestionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListQuestionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLocationsQuestionsList, options: MethodOptions): GaxiosPromise[SchemaListQuestionsResponse] = js.native
  def list(
    params: ParamsResourceLocationsQuestionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListQuestionsResponse]
  ): Unit = js.native
  /**
    * Returns the paginated list of questions and some of its answers for a specified location. This operation is only valid if the specified location is verified.
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
    *   const res = await mybusinessqanda.locations.questions.list({
    *     // Optional. How many answers to fetch per question. The default and maximum `answers_per_question` values are 10.
    *     answersPerQuestion: 'placeholder-value',
    *     // Optional. A filter constraining the questions to return. The only filter currently supported is "ignore_answered=true"
    *     filter: 'placeholder-value',
    *     // Optional. The order to return the questions. Valid options include 'update_time desc' and 'upvote_count desc', which will return the questions sorted descendingly by the requested field. The default sort order is 'update_time desc'.
    *     orderBy: 'placeholder-value',
    *     // Optional. How many questions to fetch per page. The default and maximum `page_size` values are 10.
    *     pageSize: 'placeholder-value',
    *     // Optional. If specified, the next page of questions is retrieved.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the location to fetch questions for.
    *     parent: 'locations/my-location/questions',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "questions": [],
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
  def list(params: ParamsResourceLocationsQuestionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLocationsQuestionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaQuestion] = js.native
  def patch(callback: BodyResponseCallback[SchemaQuestion]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQuestion] = js.native
  def patch(params: ParamsResourceLocationsQuestionsPatch): GaxiosPromise[SchemaQuestion] = js.native
  def patch(params: ParamsResourceLocationsQuestionsPatch, callback: BodyResponseCallback[SchemaQuestion]): Unit = js.native
  def patch(
    params: ParamsResourceLocationsQuestionsPatch,
    options: BodyResponseCallback[Readable | SchemaQuestion],
    callback: BodyResponseCallback[Readable | SchemaQuestion]
  ): Unit = js.native
  def patch(params: ParamsResourceLocationsQuestionsPatch, options: MethodOptions): GaxiosPromise[SchemaQuestion] = js.native
  def patch(
    params: ParamsResourceLocationsQuestionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuestion]
  ): Unit = js.native
  /**
    * Updates a specific question written by the current user.
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
    *   const res = await mybusinessqanda.locations.questions.patch({
    *     // Immutable. The unique name for the question. locations/x/questions/x This field will be ignored if set during question creation.
    *     name: 'locations/my-location/questions/my-question',
    *     // Required. The specific fields to update. Only question text can be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "author": {},
    *       //   "createTime": "my_createTime",
    *       //   "name": "my_name",
    *       //   "text": "my_text",
    *       //   "topAnswers": [],
    *       //   "totalAnswerCount": 0,
    *       //   "updateTime": "my_updateTime",
    *       //   "upvoteCount": 0
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
    *   //   "topAnswers": [],
    *   //   "totalAnswerCount": 0,
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
  def patch(params: ParamsResourceLocationsQuestionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceLocationsQuestionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
