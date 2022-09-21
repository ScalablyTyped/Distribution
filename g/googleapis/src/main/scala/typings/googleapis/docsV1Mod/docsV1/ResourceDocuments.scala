package typings.googleapis.docsV1Mod.docsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/docs/v1", "docs_v1.Resource$Documents")
@js.native
open class ResourceDocuments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateDocumentResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(params: ParamsResourceDocumentsBatchupdate): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(
    params: ParamsResourceDocumentsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateDocumentResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceDocumentsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateDocumentResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateDocumentResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceDocumentsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(
    params: ParamsResourceDocumentsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateDocumentResponse]
  ): Unit = js.native
  /**
    * Applies one or more updates to the document. Each request is validated before being applied. If any request is not valid, then the entire request will fail and nothing will be applied. Some requests have replies to give you some information about how they are applied. Other requests do not need to return information; these each return an empty reply. The order of replies matches that of the requests. For example, suppose you call batchUpdate with four updates, and only the third one returns information. The response would have two empty replies, the reply to the third request, and another empty reply, in that order. Because other users may be editing the document, the document might not exactly reflect your changes: your changes may be altered with respect to collaborator changes. If there are no collaborators, the document should reflect your changes. In any case, the updates in your request are guaranteed to be applied together atomically.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/docs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const docs = google.docs('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/documents',
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await docs.documents.batchUpdate({
    *     // The ID of the document to update.
    *     documentId: 'placeholder-value',
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
    *   //   "documentId": "my_documentId",
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
  def batchUpdate(params: ParamsResourceDocumentsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceDocumentsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDocument] = js.native
  def create(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def create(params: ParamsResourceDocumentsCreate): GaxiosPromise[SchemaDocument] = js.native
  def create(params: ParamsResourceDocumentsCreate, callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def create(
    params: ParamsResourceDocumentsCreate,
    options: BodyResponseCallback[Readable | SchemaDocument],
    callback: BodyResponseCallback[Readable | SchemaDocument]
  ): Unit = js.native
  def create(params: ParamsResourceDocumentsCreate, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def create(
    params: ParamsResourceDocumentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  /**
    * Creates a blank document using the title given in the request. Other fields in the request, including any provided content, are ignored. Returns the created document.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/docs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const docs = google.docs('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/documents',
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await docs.documents.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "body": {},
    *       //   "documentId": "my_documentId",
    *       //   "documentStyle": {},
    *       //   "footers": {},
    *       //   "footnotes": {},
    *       //   "headers": {},
    *       //   "inlineObjects": {},
    *       //   "lists": {},
    *       //   "namedRanges": {},
    *       //   "namedStyles": {},
    *       //   "positionedObjects": {},
    *       //   "revisionId": "my_revisionId",
    *       //   "suggestedDocumentStyleChanges": {},
    *       //   "suggestedNamedStylesChanges": {},
    *       //   "suggestionsViewMode": "my_suggestionsViewMode",
    *       //   "title": "my_title"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "body": {},
    *   //   "documentId": "my_documentId",
    *   //   "documentStyle": {},
    *   //   "footers": {},
    *   //   "footnotes": {},
    *   //   "headers": {},
    *   //   "inlineObjects": {},
    *   //   "lists": {},
    *   //   "namedRanges": {},
    *   //   "namedStyles": {},
    *   //   "positionedObjects": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "suggestedDocumentStyleChanges": {},
    *   //   "suggestedNamedStylesChanges": {},
    *   //   "suggestionsViewMode": "my_suggestionsViewMode",
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
  def create(params: ParamsResourceDocumentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceDocumentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDocument] = js.native
  def get(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(params: ParamsResourceDocumentsGet): GaxiosPromise[SchemaDocument] = js.native
  def get(params: ParamsResourceDocumentsGet, callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def get(
    params: ParamsResourceDocumentsGet,
    options: BodyResponseCallback[Readable | SchemaDocument],
    callback: BodyResponseCallback[Readable | SchemaDocument]
  ): Unit = js.native
  def get(params: ParamsResourceDocumentsGet, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(
    params: ParamsResourceDocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  /**
    * Gets the latest version of the specified document.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/docs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const docs = google.docs('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/documents',
    *       'https://www.googleapis.com/auth/documents.readonly',
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await docs.documents.get({
    *     // The ID of the document to retrieve.
    *     documentId: 'placeholder-value',
    *     // The suggestions view mode to apply to the document. This allows viewing the document with all suggestions inline, accepted or rejected. If one is not specified, DEFAULT_FOR_CURRENT_ACCESS is used.
    *     suggestionsViewMode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "body": {},
    *   //   "documentId": "my_documentId",
    *   //   "documentStyle": {},
    *   //   "footers": {},
    *   //   "footnotes": {},
    *   //   "headers": {},
    *   //   "inlineObjects": {},
    *   //   "lists": {},
    *   //   "namedRanges": {},
    *   //   "namedStyles": {},
    *   //   "positionedObjects": {},
    *   //   "revisionId": "my_revisionId",
    *   //   "suggestedDocumentStyleChanges": {},
    *   //   "suggestedNamedStylesChanges": {},
    *   //   "suggestionsViewMode": "my_suggestionsViewMode",
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
  def get(params: ParamsResourceDocumentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDocumentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
