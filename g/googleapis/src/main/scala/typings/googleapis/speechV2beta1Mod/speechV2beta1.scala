package typings.googleapis.speechV2beta1Mod

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v2beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speechV2beta1 {
  
  @JSImport("googleapis/build/src/apis/speech/v2beta1", "speech_v2beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    var locations: ResourceProjectsLocations = js.native
  }
  
  @JSImport("googleapis/build/src/apis/speech/v2beta1", "speech_v2beta1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    var operations: ResourceProjectsLocationsOperations = js.native
  }
  
  @JSImport("googleapis/build/src/apis/speech/v2beta1", "speech_v2beta1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected () extends StObject {
    def this(context: APIRequestContext) = this()
    
    var context: APIRequestContext = js.native
    
    def get(): GaxiosPromise[SchemaOperation] = js.native
    def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
    def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
    def get(params: ParamsResourceProjectsLocationsOperationsGet): GaxiosPromise[SchemaOperation] = js.native
    def get(
      params: ParamsResourceProjectsLocationsOperationsGet,
      callback: BodyResponseCallback[SchemaOperation]
    ): Unit = js.native
    def get(
      params: ParamsResourceProjectsLocationsOperationsGet,
      options: BodyResponseCallback[Readable | SchemaOperation],
      callback: BodyResponseCallback[Readable | SchemaOperation]
    ): Unit = js.native
    def get(params: ParamsResourceProjectsLocationsOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
    def get(
      params: ParamsResourceProjectsLocationsOperationsGet,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaOperation]
    ): Unit = js.native
    /**
      * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/speech.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const speech = google.speech('v2beta1');
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
      *   const res = await speech.projects.locations.operations.get({
      *     // The name of the operation resource.
      *     name: 'projects/my-project/locations/my-location/operations/my-operation',
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
    def get(params: ParamsResourceProjectsLocationsOperationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def get(
      params: ParamsResourceProjectsLocationsOperationsGet,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
    
    def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
    def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
    def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
    def list(params: ParamsResourceProjectsLocationsOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
    def list(
      params: ParamsResourceProjectsLocationsOperationsList,
      callback: BodyResponseCallback[SchemaListOperationsResponse]
    ): Unit = js.native
    def list(
      params: ParamsResourceProjectsLocationsOperationsList,
      options: BodyResponseCallback[Readable | SchemaListOperationsResponse],
      callback: BodyResponseCallback[Readable | SchemaListOperationsResponse]
    ): Unit = js.native
    def list(params: ParamsResourceProjectsLocationsOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
    def list(
      params: ParamsResourceProjectsLocationsOperationsList,
      options: MethodOptions,
      callback: BodyResponseCallback[SchemaListOperationsResponse]
    ): Unit = js.native
    /**
      * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services to override the binding to use different resource name schemes, such as `users/x/operations`. To override the binding, API services can add a binding such as `"/v1/{name=users/x\}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection id.
      * @example
      * ```js
      * // Before running the sample:
      * // - Enable the API at:
      * //   https://console.developers.google.com/apis/api/speech.googleapis.com
      * // - Login into gcloud by running:
      * //   `$ gcloud auth application-default login`
      * // - Install the npm module by running:
      * //   `$ npm install googleapis`
      *
      * const {google} = require('googleapis');
      * const speech = google.speech('v2beta1');
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
      *   const res = await speech.projects.locations.operations.list({
      *     // The standard list filter.
      *     filter: 'placeholder-value',
      *     // The name of the operation's parent resource.
      *     name: 'projects/my-project/locations/my-location',
      *     // The standard list page size.
      *     pageSize: 'placeholder-value',
      *     // The standard list page token.
      *     pageToken: 'placeholder-value',
      *   });
      *   console.log(res.data);
      *
      *   // Example response
      *   // {
      *   //   "nextPageToken": "my_nextPageToken",
      *   //   "operations": []
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
    def list(params: ParamsResourceProjectsLocationsOperationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
    def list(
      params: ParamsResourceProjectsLocationsOperationsList,
      options: StreamMethodOptions,
      callback: BodyResponseCallback[Readable]
    ): Unit = js.native
  }
  
  @JSImport("googleapis/build/src/apis/speech/v2beta1", "speech_v2beta1.Speech")
  @js.native
  open class Speech protected () extends StObject {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    
    var context: APIRequestContext = js.native
    
    var projects: ResourceProjects = js.native
  }
  
  trait Options
    extends StObject
       with GlobalOptions {
    
    var version: v2beta1
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(version = "v2beta1")
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setVersion(value: v2beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParamsResourceProjectsLocationsOperationsGet
    extends StObject
       with StandardParameters {
    
    /**
      * The name of the operation resource.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceProjectsLocationsOperationsGet {
    
    inline def apply(): ParamsResourceProjectsLocationsOperationsGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsOperationsGet]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsOperationsGet](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ParamsResourceProjectsLocationsOperationsList
    extends StObject
       with StandardParameters {
    
    /**
      * The standard list filter.
      */
    var filter: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the operation's parent resource.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The standard list page size.
      */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The standard list page token.
      */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ParamsResourceProjectsLocationsOperationsList {
    
    inline def apply(): ParamsResourceProjectsLocationsOperationsList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsResourceProjectsLocationsOperationsList]
    }
    
    extension [Self <: ParamsResourceProjectsLocationsOperationsList](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SchemaListOperationsResponse extends StObject {
    
    /**
      * The standard List next-page token.
      */
    var nextPageToken: js.UndefOr[String | Null] = js.undefined
    
    /**
      * A list of operations that matches the specified filter in the request.
      */
    var operations: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
  }
  object SchemaListOperationsResponse {
    
    inline def apply(): SchemaListOperationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaListOperationsResponse]
    }
    
    extension [Self <: SchemaListOperationsResponse](x: Self) {
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
      
      inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      
      inline def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    }
  }
  
  trait SchemaLongRunningRecognizeMetadata extends StObject {
    
    /**
      * Output only. Time of the most recent processing update.
      */
    var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Output only. Approximate percentage of audio processed thus far. Guaranteed to be 100 when the audio is fully processed and the results are available.
      */
    var progressPercent: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Output only. Time when the request was received.
      */
    var startTime: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The URI of the audio file being transcribed. Empty if the audio was sent as byte content.
      */
    var uri: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaLongRunningRecognizeMetadata {
    
    inline def apply(): SchemaLongRunningRecognizeMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaLongRunningRecognizeMetadata]
    }
    
    extension [Self <: SchemaLongRunningRecognizeMetadata](x: Self) {
      
      inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
      
      inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
      
      inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
      
      inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
      
      inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
      
      inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriNull: Self = StObject.set(x, "uri", null)
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  trait SchemaLongRunningRecognizeResponse extends StObject {
    
    /**
      * Output only. Sequential list of transcription results corresponding to sequential portions of audio.
      */
    var results: js.UndefOr[js.Array[SchemaSpeechRecognitionResult]] = js.undefined
  }
  object SchemaLongRunningRecognizeResponse {
    
    inline def apply(): SchemaLongRunningRecognizeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaLongRunningRecognizeResponse]
    }
    
    extension [Self <: SchemaLongRunningRecognizeResponse](x: Self) {
      
      inline def setResults(value: js.Array[SchemaSpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: SchemaSpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait SchemaOperation extends StObject {
    
    /**
      * If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available.
      */
    var done: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The error result of the operation in case of failure or cancellation.
      */
    var error: js.UndefOr[SchemaStatus] = js.undefined
    
    /**
      * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such metadata. Any method that returns a long-running operation should document the metadata type, if any.
      */
    var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
    
    /**
      * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending with `operations/{unique_id\}`.
      */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
      */
    var response: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  }
  object SchemaOperation {
    
    inline def apply(): SchemaOperation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaOperation]
    }
    
    extension [Self <: SchemaOperation](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneNull: Self = StObject.set(x, "done", null)
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResponse(value: StringDictionary[Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseNull: Self = StObject.set(x, "response", null)
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  trait SchemaSpeechRecognitionAlternative extends StObject {
    
    /**
      * Output only. The confidence estimate between 0.0 and 1.0. A higher number indicates an estimated greater likelihood that the recognized words are correct. This field is set only for the top alternative of a non-streaming result or, of a streaming result where `is_final=true`. This field is not guaranteed to be accurate and users should not rely on it to be always provided. The default of 0.0 is a sentinel value indicating `confidence` was not set.
      */
    var confidence: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Output only. Transcript text representing the words that the user spoke.
      */
    var transcript: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Output only. A list of word-specific information for each recognized word. Note: When `enable_speaker_diarization` is true, you will see all the words from the beginning of the audio.
      */
    var words: js.UndefOr[js.Array[SchemaWordInfo]] = js.undefined
  }
  object SchemaSpeechRecognitionAlternative {
    
    inline def apply(): SchemaSpeechRecognitionAlternative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaSpeechRecognitionAlternative]
    }
    
    extension [Self <: SchemaSpeechRecognitionAlternative](x: Self) {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
      
      inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
      
      inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
      
      inline def setTranscriptNull: Self = StObject.set(x, "transcript", null)
      
      inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
      
      inline def setWords(value: js.Array[SchemaWordInfo]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
      
      inline def setWordsVarargs(value: SchemaWordInfo*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
  
  trait SchemaSpeechRecognitionResult extends StObject {
    
    /**
      * Output only. May contain one or more recognition hypotheses (up to the maximum specified in `max_alternatives`). These alternatives are ordered in terms of accuracy, with the top (first) alternative being the most probable, as ranked by the recognizer.
      */
    var alternatives: js.UndefOr[js.Array[SchemaSpeechRecognitionAlternative]] = js.undefined
    
    /**
      * Output only. For multi-channel audio, this is the channel number corresponding to the recognized result for the audio from that channel. For `audio_channel_count` = N, its output values can range from `1` to `N`.
      */
    var channelTag: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the language in this result. This language code was detected to have the most likelihood of being spoken in the audio.
      */
    var languageCode: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaSpeechRecognitionResult {
    
    inline def apply(): SchemaSpeechRecognitionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaSpeechRecognitionResult]
    }
    
    extension [Self <: SchemaSpeechRecognitionResult](x: Self) {
      
      inline def setAlternatives(value: js.Array[SchemaSpeechRecognitionAlternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
      
      inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
      
      inline def setAlternativesVarargs(value: SchemaSpeechRecognitionAlternative*): Self = StObject.set(x, "alternatives", js.Array(value*))
      
      inline def setChannelTag(value: Double): Self = StObject.set(x, "channelTag", value.asInstanceOf[js.Any])
      
      inline def setChannelTagNull: Self = StObject.set(x, "channelTag", null)
      
      inline def setChannelTagUndefined: Self = StObject.set(x, "channelTag", js.undefined)
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
      
      inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    }
  }
  
  trait SchemaStatus extends StObject {
    
    /**
      * The status code, which should be an enum value of google.rpc.Code.
      */
    var code: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * A list of messages that carry the error details. There is a common set of message types for APIs to use.
      */
    var details: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
    
    /**
      * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
      */
    var message: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaStatus {
    
    inline def apply(): SchemaStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaStatus]
    }
    
    extension [Self <: SchemaStatus](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsNull: Self = StObject.set(x, "details", null)
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDetailsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait SchemaWordInfo extends StObject {
    
    /**
      * Output only. The confidence estimate between 0.0 and 1.0. A higher number indicates an estimated greater likelihood that the recognized words are correct. This field is set only for the top alternative of a non-streaming result or, of a streaming result where `is_final=true`. This field is not guaranteed to be accurate and users should not rely on it to be always provided. The default of 0.0 is a sentinel value indicating `confidence` was not set.
      */
    var confidence: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Output only. Time offset relative to the beginning of the audio, and corresponding to the end of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
      */
    var endOffset: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Output only. A distinct integer value is assigned for every speaker within the audio. This field specifies which one of those speakers was detected to have spoken this word. Value ranges from `1` to `diarization_config.max_speaker_count` . `speaker_tag` is set if `diarization_config.enable_speaker_diarization` = `true` and only in the top alternative.
      */
    var speakerTag: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Output only. Time offset relative to the beginning of the audio, and corresponding to the start of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
      */
    var startOffset: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Output only. The word corresponding to this set of information.
      */
    var word: js.UndefOr[String | Null] = js.undefined
  }
  object SchemaWordInfo {
    
    inline def apply(): SchemaWordInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaWordInfo]
    }
    
    extension [Self <: SchemaWordInfo](x: Self) {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
      
      inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
      
      inline def setEndOffset(value: String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetNull: Self = StObject.set(x, "endOffset", null)
      
      inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
      
      inline def setSpeakerTag(value: Double): Self = StObject.set(x, "speakerTag", value.asInstanceOf[js.Any])
      
      inline def setSpeakerTagNull: Self = StObject.set(x, "speakerTag", null)
      
      inline def setSpeakerTagUndefined: Self = StObject.set(x, "speakerTag", js.undefined)
      
      inline def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetNull: Self = StObject.set(x, "startOffset", null)
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordNull: Self = StObject.set(x, "word", null)
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  trait StandardParameters extends StObject {
    
    /**
      * V1 error format.
      */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /**
      * OAuth access token.
      */
    var access_token: js.UndefOr[String] = js.undefined
    
    /**
      * Data format for response.
      */
    var alt: js.UndefOr[String] = js.undefined
    
    /**
      * Auth client or API Key for the request
      */
    var auth: js.UndefOr[
        String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
      ] = js.undefined
    
    /**
      * JSONP
      */
    var callback: js.UndefOr[String] = js.undefined
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * OAuth 2.0 token for the current user.
      */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /**
      * Returns response with indentations and line breaks.
      */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
      */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /**
      * Legacy upload protocol for media (e.g. "media", "multipart").
      */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /**
      * Upload protocol for media (e.g. "raw", "multipart").
      */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object StandardParameters {
    
    inline def apply(): StandardParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardParameters]
    }
    
    extension [Self <: StandardParameters](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAuth(
        value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
      ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
}
