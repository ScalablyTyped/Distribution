package typings.googleapis.slidesV1Mod.slidesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/slides/v1", "slides_v1.Resource$Presentations")
@js.native
open class ResourcePresentations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdatePresentationResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(params: ParamsResourcePresentationsBatchupdate): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(
    params: ParamsResourcePresentationsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdatePresentationResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourcePresentationsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdatePresentationResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdatePresentationResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourcePresentationsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(
    params: ParamsResourcePresentationsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdatePresentationResponse]
  ): Unit = js.native
  /**
    * Applies one or more updates to the presentation. Each request is validated before being applied. If any request is not valid, then the entire request will fail and nothing will be applied. Some requests have replies to give you some information about how they are applied. Other requests do not need to return information; these each return an empty reply. The order of replies matches that of the requests. For example, suppose you call batchUpdate with four updates, and only the third one returns information. The response would have two empty replies: the reply to the third request, and another empty reply, in that order. Because other users may be editing the presentation, the presentation might not exactly reflect your changes: your changes may be altered with respect to collaborator changes. If there are no collaborators, the presentation should reflect your changes. In any case, the updates in your request are guaranteed to be applied together atomically.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/slides.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const slides = google.slides('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/presentations',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/spreadsheets.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await slides.presentations.batchUpdate({
    *     // The presentation to apply the updates to.
    *     presentationId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": [],
    *       //   "writeControl": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "presentationId": "my_presentationId",
    *   //   "replies": [],
    *   //   "writeControl": {}
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
  def batchUpdate(params: ParamsResourcePresentationsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourcePresentationsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPresentation] = js.native
  def create(callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def create(params: ParamsResourcePresentationsCreate): GaxiosPromise[SchemaPresentation] = js.native
  def create(params: ParamsResourcePresentationsCreate, callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def create(
    params: ParamsResourcePresentationsCreate,
    options: BodyResponseCallback[Readable | SchemaPresentation],
    callback: BodyResponseCallback[Readable | SchemaPresentation]
  ): Unit = js.native
  def create(params: ParamsResourcePresentationsCreate, options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def create(
    params: ParamsResourcePresentationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPresentation]
  ): Unit = js.native
  /**
    * Creates a blank presentation using the title given in the request. If a `presentationId` is provided, it is used as the ID of the new presentation. Otherwise, a new ID is generated. Other fields in the request, including any provided content, are ignored. Returns the created presentation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/slides.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const slides = google.slides('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/presentations',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await slides.presentations.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "layouts": [],
    *       //   "locale": "my_locale",
    *       //   "masters": [],
    *       //   "notesMaster": {},
    *       //   "pageSize": {},
    *       //   "presentationId": "my_presentationId",
    *       //   "revisionId": "my_revisionId",
    *       //   "slides": [],
    *       //   "title": "my_title"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "layouts": [],
    *   //   "locale": "my_locale",
    *   //   "masters": [],
    *   //   "notesMaster": {},
    *   //   "pageSize": {},
    *   //   "presentationId": "my_presentationId",
    *   //   "revisionId": "my_revisionId",
    *   //   "slides": [],
    *   //   "title": "my_title"
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
  def create(params: ParamsResourcePresentationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePresentationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPresentation] = js.native
  def get(callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def get(params: ParamsResourcePresentationsGet): GaxiosPromise[SchemaPresentation] = js.native
  def get(params: ParamsResourcePresentationsGet, callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def get(
    params: ParamsResourcePresentationsGet,
    options: BodyResponseCallback[Readable | SchemaPresentation],
    callback: BodyResponseCallback[Readable | SchemaPresentation]
  ): Unit = js.native
  def get(params: ParamsResourcePresentationsGet, options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def get(
    params: ParamsResourcePresentationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPresentation]
  ): Unit = js.native
  /**
    * Gets the latest version of the specified presentation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/slides.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const slides = google.slides('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/presentations',
    *       'https://www.googleapis.com/auth/presentations.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await slides.presentations.get({
    *     // The ID of the presentation to retrieve.
    *     presentationId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "layouts": [],
    *   //   "locale": "my_locale",
    *   //   "masters": [],
    *   //   "notesMaster": {},
    *   //   "pageSize": {},
    *   //   "presentationId": "my_presentationId",
    *   //   "revisionId": "my_revisionId",
    *   //   "slides": [],
    *   //   "title": "my_title"
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
  def get(params: ParamsResourcePresentationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePresentationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var pages: ResourcePresentationsPages = js.native
}
