package typings.googleapis.translateV3beta1Mod.translateV3beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/translate/v3beta1", "translate_v3beta1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchTranslateDocument(): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateDocument(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchTranslateDocument(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateDocument(params: ParamsResourceProjectsLocationsBatchtranslatedocument): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateDocument(
    params: ParamsResourceProjectsLocationsBatchtranslatedocument,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def batchTranslateDocument(
    params: ParamsResourceProjectsLocationsBatchtranslatedocument,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def batchTranslateDocument(params: ParamsResourceProjectsLocationsBatchtranslatedocument, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateDocument(
    params: ParamsResourceProjectsLocationsBatchtranslatedocument,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Translates a large volume of document in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial results (for an input file, it's all or nothing) may still be available on the specified output location. This call returns immediately and you can use google.longrunning.Operation.name to poll the status of the call.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
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
    *   const res = await translate.projects.locations.batchTranslateDocument({
    *     // Required. Location to make a regional call. Format: `projects/{project-number-or-id\}/locations/{location-id\}`. The `global` location is not supported for batch translation. Only AutoML Translation models or glossaries within the same region (have the same location-id) can be used, otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "formatConversions": {},
    *       //   "glossaries": {},
    *       //   "inputConfigs": [],
    *       //   "models": {},
    *       //   "outputConfig": {},
    *       //   "sourceLanguageCode": "my_sourceLanguageCode",
    *       //   "targetLanguageCodes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def batchTranslateDocument(params: ParamsResourceProjectsLocationsBatchtranslatedocument, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchTranslateDocument(
    params: ParamsResourceProjectsLocationsBatchtranslatedocument,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchTranslateText(): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateText(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchTranslateText(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateText(params: ParamsResourceProjectsLocationsBatchtranslatetext): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateText(
    params: ParamsResourceProjectsLocationsBatchtranslatetext,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def batchTranslateText(
    params: ParamsResourceProjectsLocationsBatchtranslatetext,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def batchTranslateText(params: ParamsResourceProjectsLocationsBatchtranslatetext, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchTranslateText(
    params: ParamsResourceProjectsLocationsBatchtranslatetext,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Translates a large volume of text in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial results (for an input file, it's all or nothing) may still be available on the specified output location. This call returns immediately and you can use google.longrunning.Operation.name to poll the status of the call.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
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
    *   const res = await translate.projects.locations.batchTranslateText({
    *     // Required. Location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}/locations/{location-id\}`. The `global` location is not supported for batch translation. Only AutoML Translation models or glossaries within the same region (have the same location-id) can be used, otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "glossaries": {},
    *       //   "inputConfigs": [],
    *       //   "labels": {},
    *       //   "models": {},
    *       //   "outputConfig": {},
    *       //   "sourceLanguageCode": "my_sourceLanguageCode",
    *       //   "targetLanguageCodes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def batchTranslateText(params: ParamsResourceProjectsLocationsBatchtranslatetext, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchTranslateText(
    params: ParamsResourceProjectsLocationsBatchtranslatetext,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def detectLanguage(): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(callback: BodyResponseCallback[SchemaDetectLanguageResponse]): Unit = js.native
  def detectLanguage(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(params: ParamsResourceProjectsLocationsDetectlanguage): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(
    params: ParamsResourceProjectsLocationsDetectlanguage,
    callback: BodyResponseCallback[SchemaDetectLanguageResponse]
  ): Unit = js.native
  def detectLanguage(
    params: ParamsResourceProjectsLocationsDetectlanguage,
    options: BodyResponseCallback[Readable | SchemaDetectLanguageResponse],
    callback: BodyResponseCallback[Readable | SchemaDetectLanguageResponse]
  ): Unit = js.native
  def detectLanguage(params: ParamsResourceProjectsLocationsDetectlanguage, options: MethodOptions): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(
    params: ParamsResourceProjectsLocationsDetectlanguage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDetectLanguageResponse]
  ): Unit = js.native
  /**
    * Detects the language of text within a request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.locations.detectLanguage({
    *     // Required. Project or location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}/locations/{location-id\}` or `projects/{project-number-or-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Only models within the same region (has same location-id) can be used. Otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "content": "my_content",
    *       //   "labels": {},
    *       //   "mimeType": "my_mimeType",
    *       //   "model": "my_model"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "languages": []
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
  def detectLanguage(params: ParamsResourceProjectsLocationsDetectlanguage, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def detectLanguage(
    params: ParamsResourceProjectsLocationsDetectlanguage,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: BodyResponseCallback[Readable | SchemaLocation],
    callback: BodyResponseCallback[Readable | SchemaLocation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  /**
    * Gets information about a location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.locations.get({
    *     // Resource name for the location.
    *     name: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "labels": {},
    *   //   "locationId": "my_locationId",
    *   //   "metadata": {},
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
  def get(params: ParamsResourceProjectsLocationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSupportedLanguages(): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(callback: BodyResponseCallback[SchemaSupportedLanguages]): Unit = js.native
  def getSupportedLanguages(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(params: ParamsResourceProjectsLocationsGetsupportedlanguages): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsLocationsGetsupportedlanguages,
    callback: BodyResponseCallback[SchemaSupportedLanguages]
  ): Unit = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsLocationsGetsupportedlanguages,
    options: BodyResponseCallback[Readable | SchemaSupportedLanguages],
    callback: BodyResponseCallback[Readable | SchemaSupportedLanguages]
  ): Unit = js.native
  def getSupportedLanguages(params: ParamsResourceProjectsLocationsGetsupportedlanguages, options: MethodOptions): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsLocationsGetsupportedlanguages,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSupportedLanguages]
  ): Unit = js.native
  /**
    * Returns a list of supported languages for translation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.locations.getSupportedLanguages({
    *     // Optional. The language to use to return localized, human readable names of supported languages. If missing, then display names are not returned in a response.
    *     displayLanguageCode: 'placeholder-value',
    *     // Optional. Get supported languages of this model. The format depends on model type: - AutoML Translation models: `projects/{project-number-or-id\}/locations/{location-id\}/models/{model-id\}` - General (built-in) models: `projects/{project-number-or-id\}/locations/{location-id\}/models/general/nmt`, Returns languages supported by the specified model. If missing, we get supported languages of Google general NMT model.
    *     model: 'placeholder-value',
    *     // Required. Project or location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}` or `projects/{project-number-or-id\}/locations/{location-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Non-global location is required for AutoML models. Only models within the same region (have same location-id) can be used, otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "languages": []
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
  def getSupportedLanguages(params: ParamsResourceProjectsLocationsGetsupportedlanguages, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsLocationsGetsupportedlanguages,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var glossaries: ResourceProjectsLocationsGlossaries = js.native
  
  def list(): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsList): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: BodyResponseCallback[Readable | SchemaListLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsList, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  /**
    * Lists information about the supported locations for this service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.locations.list({
    *     // A filter to narrow down results to a preferred subset. The filtering language accepts strings like `"displayName=tokyo"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
    *     filter: 'placeholder-value',
    *     // The resource that owns the locations collection, if applicable.
    *     name: 'projects/my-project',
    *     // The maximum number of results to return. If not set, the service selects a default.
    *     pageSize: 'placeholder-value',
    *     // A page token received from the `next_page_token` field in the response. Send that page token to receive the subsequent page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "locations": [],
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
  def list(params: ParamsResourceProjectsLocationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
  
  def translateDocument(): GaxiosPromise[SchemaTranslateDocumentResponse] = js.native
  def translateDocument(callback: BodyResponseCallback[SchemaTranslateDocumentResponse]): Unit = js.native
  def translateDocument(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTranslateDocumentResponse] = js.native
  def translateDocument(params: ParamsResourceProjectsLocationsTranslatedocument): GaxiosPromise[SchemaTranslateDocumentResponse] = js.native
  def translateDocument(
    params: ParamsResourceProjectsLocationsTranslatedocument,
    callback: BodyResponseCallback[SchemaTranslateDocumentResponse]
  ): Unit = js.native
  def translateDocument(
    params: ParamsResourceProjectsLocationsTranslatedocument,
    options: BodyResponseCallback[Readable | SchemaTranslateDocumentResponse],
    callback: BodyResponseCallback[Readable | SchemaTranslateDocumentResponse]
  ): Unit = js.native
  def translateDocument(params: ParamsResourceProjectsLocationsTranslatedocument, options: MethodOptions): GaxiosPromise[SchemaTranslateDocumentResponse] = js.native
  def translateDocument(
    params: ParamsResourceProjectsLocationsTranslatedocument,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTranslateDocumentResponse]
  ): Unit = js.native
  /**
    * Translates documents in synchronous mode.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.locations.translateDocument({
    *     // Required. Location to make a regional call. Format: `projects/{project-number-or-id\}/locations/{location-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global`. Non-global location is required for requests using AutoML models or custom glossaries. Models and glossaries must be within the same region (have the same location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "documentInputConfig": {},
    *       //   "documentOutputConfig": {},
    *       //   "glossaryConfig": {},
    *       //   "labels": {},
    *       //   "model": "my_model",
    *       //   "sourceLanguageCode": "my_sourceLanguageCode",
    *       //   "targetLanguageCode": "my_targetLanguageCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documentTranslation": {},
    *   //   "glossaryConfig": {},
    *   //   "glossaryDocumentTranslation": {},
    *   //   "model": "my_model"
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
  def translateDocument(params: ParamsResourceProjectsLocationsTranslatedocument, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def translateDocument(
    params: ParamsResourceProjectsLocationsTranslatedocument,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def translateText(): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(callback: BodyResponseCallback[SchemaTranslateTextResponse]): Unit = js.native
  def translateText(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(params: ParamsResourceProjectsLocationsTranslatetext): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(
    params: ParamsResourceProjectsLocationsTranslatetext,
    callback: BodyResponseCallback[SchemaTranslateTextResponse]
  ): Unit = js.native
  def translateText(
    params: ParamsResourceProjectsLocationsTranslatetext,
    options: BodyResponseCallback[Readable | SchemaTranslateTextResponse],
    callback: BodyResponseCallback[Readable | SchemaTranslateTextResponse]
  ): Unit = js.native
  def translateText(params: ParamsResourceProjectsLocationsTranslatetext, options: MethodOptions): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(
    params: ParamsResourceProjectsLocationsTranslatetext,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTranslateTextResponse]
  ): Unit = js.native
  /**
    * Translates input text and returns translated text.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.locations.translateText({
    *     // Required. Project or location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}` or `projects/{project-number-or-id\}/locations/{location-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Non-global location is required for requests using AutoML models or custom glossaries. Models and glossaries must be within the same region (have same location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contents": [],
    *       //   "glossaryConfig": {},
    *       //   "labels": {},
    *       //   "mimeType": "my_mimeType",
    *       //   "model": "my_model",
    *       //   "sourceLanguageCode": "my_sourceLanguageCode",
    *       //   "targetLanguageCode": "my_targetLanguageCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "glossaryTranslations": [],
    *   //   "translations": []
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
  def translateText(params: ParamsResourceProjectsLocationsTranslatetext, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def translateText(
    params: ParamsResourceProjectsLocationsTranslatetext,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
