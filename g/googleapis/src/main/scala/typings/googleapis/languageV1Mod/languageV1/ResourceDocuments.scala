package typings.googleapis.languageV1Mod.languageV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/language/v1", "language_v1.Resource$Documents")
@js.native
open class ResourceDocuments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def analyzeEntities(): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]): Unit = js.native
  def analyzeEntities(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(params: ParamsResourceDocumentsAnalyzeentities): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsResourceDocumentsAnalyzeentities,
    callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(
    params: ParamsResourceDocumentsAnalyzeentities,
    options: BodyResponseCallback[Readable | SchemaAnalyzeEntitiesResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(params: ParamsResourceDocumentsAnalyzeentities, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsResourceDocumentsAnalyzeentities,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  /**
    * Finds named entities (currently proper names and common nouns) in the text along with entity types, salience, mentions for each entity, and other properties.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/language.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const language = google.language('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-language',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.documents.analyzeEntities({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "document": {},
    *       //   "encodingType": "my_encodingType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
    *   //   "language": "my_language"
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
  def analyzeEntities(params: ParamsResourceDocumentsAnalyzeentities, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeEntities(
    params: ParamsResourceDocumentsAnalyzeentities,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def analyzeEntitySentiment(): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(callback: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse]): Unit = js.native
  def analyzeEntitySentiment(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(params: ParamsResourceDocumentsAnalyzeentitysentiment): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(
    params: ParamsResourceDocumentsAnalyzeentitysentiment,
    callback: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse]
  ): Unit = js.native
  def analyzeEntitySentiment(
    params: ParamsResourceDocumentsAnalyzeentitysentiment,
    options: BodyResponseCallback[Readable | SchemaAnalyzeEntitySentimentResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeEntitySentimentResponse]
  ): Unit = js.native
  def analyzeEntitySentiment(params: ParamsResourceDocumentsAnalyzeentitysentiment, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(
    params: ParamsResourceDocumentsAnalyzeentitysentiment,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse]
  ): Unit = js.native
  /**
    * Finds entities, similar to AnalyzeEntities in the text and analyzes sentiment associated with each entity and its mentions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/language.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const language = google.language('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-language',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.documents.analyzeEntitySentiment({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "document": {},
    *       //   "encodingType": "my_encodingType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
    *   //   "language": "my_language"
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
  def analyzeEntitySentiment(params: ParamsResourceDocumentsAnalyzeentitysentiment, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeEntitySentiment(
    params: ParamsResourceDocumentsAnalyzeentitysentiment,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def analyzeSentiment(): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(callback: BodyResponseCallback[SchemaAnalyzeSentimentResponse]): Unit = js.native
  def analyzeSentiment(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(params: ParamsResourceDocumentsAnalyzesentiment): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(
    params: ParamsResourceDocumentsAnalyzesentiment,
    callback: BodyResponseCallback[SchemaAnalyzeSentimentResponse]
  ): Unit = js.native
  def analyzeSentiment(
    params: ParamsResourceDocumentsAnalyzesentiment,
    options: BodyResponseCallback[Readable | SchemaAnalyzeSentimentResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeSentimentResponse]
  ): Unit = js.native
  def analyzeSentiment(params: ParamsResourceDocumentsAnalyzesentiment, options: MethodOptions): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(
    params: ParamsResourceDocumentsAnalyzesentiment,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeSentimentResponse]
  ): Unit = js.native
  /**
    * Analyzes the sentiment of the provided text.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/language.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const language = google.language('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-language',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.documents.analyzeSentiment({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "document": {},
    *       //   "encodingType": "my_encodingType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documentSentiment": {},
    *   //   "language": "my_language",
    *   //   "sentences": []
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
  def analyzeSentiment(params: ParamsResourceDocumentsAnalyzesentiment, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeSentiment(
    params: ParamsResourceDocumentsAnalyzesentiment,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def analyzeSyntax(): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(callback: BodyResponseCallback[SchemaAnalyzeSyntaxResponse]): Unit = js.native
  def analyzeSyntax(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(params: ParamsResourceDocumentsAnalyzesyntax): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(
    params: ParamsResourceDocumentsAnalyzesyntax,
    callback: BodyResponseCallback[SchemaAnalyzeSyntaxResponse]
  ): Unit = js.native
  def analyzeSyntax(
    params: ParamsResourceDocumentsAnalyzesyntax,
    options: BodyResponseCallback[Readable | SchemaAnalyzeSyntaxResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeSyntaxResponse]
  ): Unit = js.native
  def analyzeSyntax(params: ParamsResourceDocumentsAnalyzesyntax, options: MethodOptions): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(
    params: ParamsResourceDocumentsAnalyzesyntax,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeSyntaxResponse]
  ): Unit = js.native
  /**
    * Analyzes the syntax of the text and provides sentence boundaries and tokenization along with part of speech tags, dependency trees, and other properties.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/language.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const language = google.language('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-language',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.documents.analyzeSyntax({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "document": {},
    *       //   "encodingType": "my_encodingType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "language": "my_language",
    *   //   "sentences": [],
    *   //   "tokens": []
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
  def analyzeSyntax(params: ParamsResourceDocumentsAnalyzesyntax, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeSyntax(
    params: ParamsResourceDocumentsAnalyzesyntax,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def annotateText(): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(callback: BodyResponseCallback[SchemaAnnotateTextResponse]): Unit = js.native
  def annotateText(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(params: ParamsResourceDocumentsAnnotatetext): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(
    params: ParamsResourceDocumentsAnnotatetext,
    callback: BodyResponseCallback[SchemaAnnotateTextResponse]
  ): Unit = js.native
  def annotateText(
    params: ParamsResourceDocumentsAnnotatetext,
    options: BodyResponseCallback[Readable | SchemaAnnotateTextResponse],
    callback: BodyResponseCallback[Readable | SchemaAnnotateTextResponse]
  ): Unit = js.native
  def annotateText(params: ParamsResourceDocumentsAnnotatetext, options: MethodOptions): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(
    params: ParamsResourceDocumentsAnnotatetext,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotateTextResponse]
  ): Unit = js.native
  /**
    * A convenience method that provides all the features that analyzeSentiment, analyzeEntities, and analyzeSyntax provide in one call.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/language.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const language = google.language('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-language',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.documents.annotateText({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "document": {},
    *       //   "encodingType": "my_encodingType",
    *       //   "features": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "categories": [],
    *   //   "documentSentiment": {},
    *   //   "entities": [],
    *   //   "language": "my_language",
    *   //   "sentences": [],
    *   //   "tokens": []
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
  def annotateText(params: ParamsResourceDocumentsAnnotatetext, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def annotateText(
    params: ParamsResourceDocumentsAnnotatetext,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def classifyText(): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(callback: BodyResponseCallback[SchemaClassifyTextResponse]): Unit = js.native
  def classifyText(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(params: ParamsResourceDocumentsClassifytext): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(
    params: ParamsResourceDocumentsClassifytext,
    callback: BodyResponseCallback[SchemaClassifyTextResponse]
  ): Unit = js.native
  def classifyText(
    params: ParamsResourceDocumentsClassifytext,
    options: BodyResponseCallback[Readable | SchemaClassifyTextResponse],
    callback: BodyResponseCallback[Readable | SchemaClassifyTextResponse]
  ): Unit = js.native
  def classifyText(params: ParamsResourceDocumentsClassifytext, options: MethodOptions): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(
    params: ParamsResourceDocumentsClassifytext,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClassifyTextResponse]
  ): Unit = js.native
  /**
    * Classifies a document into categories.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/language.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const language = google.language('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-language',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.documents.classifyText({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "document": {}
    *       // }
    *     },
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
  def classifyText(params: ParamsResourceDocumentsClassifytext, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def classifyText(
    params: ParamsResourceDocumentsClassifytext,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
