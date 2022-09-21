package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1
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

object texttospeechV1Mod {
  
  object texttospeechV1 {
    
    @JSImport("googleapis/build/src/apis/texttospeech/v1", "texttospeech_v1.Resource$Text")
    @js.native
    open class ResourceText protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def synthesize(): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
      def synthesize(callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]): Unit = js.native
      def synthesize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
      def synthesize(params: ParamsResourceTextSynthesize): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
      def synthesize(
        params: ParamsResourceTextSynthesize,
        callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
      ): Unit = js.native
      def synthesize(
        params: ParamsResourceTextSynthesize,
        options: BodyResponseCallback[Readable | SchemaSynthesizeSpeechResponse],
        callback: BodyResponseCallback[Readable | SchemaSynthesizeSpeechResponse]
      ): Unit = js.native
      def synthesize(params: ParamsResourceTextSynthesize, options: MethodOptions): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
      def synthesize(
        params: ParamsResourceTextSynthesize,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
      ): Unit = js.native
      /**
        * Synthesizes speech synchronously: receive results after all text input has been processed.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/texttospeech.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const texttospeech = google.texttospeech('v1');
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
        *   const res = await texttospeech.text.synthesize({
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "audioConfig": {},
        *       //   "input": {},
        *       //   "voice": {}
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "audioContent": "my_audioContent"
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
      def synthesize(params: ParamsResourceTextSynthesize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def synthesize(
        params: ParamsResourceTextSynthesize,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/texttospeech/v1", "texttospeech_v1.Resource$Voices")
    @js.native
    open class ResourceVoices protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(params: ParamsResourceVoicesList): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(params: ParamsResourceVoicesList, callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
      def list(
        params: ParamsResourceVoicesList,
        options: BodyResponseCallback[Readable | SchemaListVoicesResponse],
        callback: BodyResponseCallback[Readable | SchemaListVoicesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceVoicesList, options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(
        params: ParamsResourceVoicesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListVoicesResponse]
      ): Unit = js.native
      /**
        * Returns a list of Voice supported for synthesis.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/texttospeech.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const texttospeech = google.texttospeech('v1');
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
        *   const res = await texttospeech.voices.list({
        *     // Optional. Recommended. [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If not specified, the API will return all supported voices. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. For example, if you specify `"en-NZ"`, all `"en-NZ"` voices will be returned. If you specify `"no"`, both `"no-\*"` (Norwegian) and `"nb-\*"` (Norwegian Bokmal) voices will be returned.
        *     languageCode: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "voices": []
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
      def list(params: ParamsResourceVoicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceVoicesList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/texttospeech/v1", "texttospeech_v1.Texttospeech")
    @js.native
    open class Texttospeech protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var text: ResourceText = js.native
      
      var voices: ResourceVoices = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceTextSynthesize
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaSynthesizeSpeechRequest] = js.undefined
    }
    object ParamsResourceTextSynthesize {
      
      inline def apply(): ParamsResourceTextSynthesize = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceTextSynthesize]
      }
      
      extension [Self <: ParamsResourceTextSynthesize](x: Self) {
        
        inline def setRequestBody(value: SchemaSynthesizeSpeechRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceVoicesList
      extends StObject
         with StandardParameters {
      
      /**
        * Optional. Recommended. [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If not specified, the API will return all supported voices. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. For example, if you specify `"en-NZ"`, all `"en-NZ"` voices will be returned. If you specify `"no"`, both `"no-\*"` (Norwegian) and `"nb-\*"` (Norwegian Bokmal) voices will be returned.
        */
      var languageCode: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceVoicesList {
      
      inline def apply(): ParamsResourceVoicesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceVoicesList]
      }
      
      extension [Self <: ParamsResourceVoicesList](x: Self) {
        
        inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
      }
    }
    
    trait SchemaAudioConfig extends StObject {
      
      /**
        * Required. The format of the audio byte stream.
        */
      var audioEncoding: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Optional. Input only. An identifier which selects 'audio effects' profiles that are applied on (post synthesized) text to speech. Effects are applied on top of each other in the order they are given. See [audio profiles](https://cloud.google.com/text-to-speech/docs/audio-profiles) for current supported profile ids.
        */
      var effectsProfileId: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * Optional. Input only. Speaking pitch, in the range [-20.0, 20.0]. 20 means increase 20 semitones from the original pitch. -20 means decrease 20 semitones from the original pitch.
        */
      var pitch: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Optional. The synthesis sample rate (in hertz) for this audio. When this is specified in SynthesizeSpeechRequest, if this is different from the voice's natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality), unless the specified sample rate is not supported for the encoding chosen, in which case it will fail the request and return google.rpc.Code.INVALID_ARGUMENT.
        */
      var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Optional. Input only. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the normal native speed supported by the specific voice. 2.0 is twice as fast, and 0.5 is half as fast. If unset(0.0), defaults to the native 1.0 speed. Any other values < 0.25 or \> 4.0 will return an error.
        */
      var speakingRate: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Optional. Input only. Volume gain (in dB) of the normal native volume supported by the specific voice, in the range [-96.0, 16.0]. If unset, or set to a value of 0.0 (dB), will play at normal native signal amplitude. A value of -6.0 (dB) will play at approximately half the amplitude of the normal native signal amplitude. A value of +6.0 (dB) will play at approximately twice the amplitude of the normal native signal amplitude. Strongly recommend not to exceed +10 (dB) as there's usually no effective increase in loudness for any value greater than that.
        */
      var volumeGainDb: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaAudioConfig {
      
      inline def apply(): SchemaAudioConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAudioConfig]
      }
      
      extension [Self <: SchemaAudioConfig](x: Self) {
        
        inline def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
        
        inline def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
        
        inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
        
        inline def setEffectsProfileId(value: js.Array[String]): Self = StObject.set(x, "effectsProfileId", value.asInstanceOf[js.Any])
        
        inline def setEffectsProfileIdNull: Self = StObject.set(x, "effectsProfileId", null)
        
        inline def setEffectsProfileIdUndefined: Self = StObject.set(x, "effectsProfileId", js.undefined)
        
        inline def setEffectsProfileIdVarargs(value: String*): Self = StObject.set(x, "effectsProfileId", js.Array(value*))
        
        inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
        
        inline def setPitchNull: Self = StObject.set(x, "pitch", null)
        
        inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
        
        inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
        
        inline def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
        
        inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
        
        inline def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
        
        inline def setSpeakingRateNull: Self = StObject.set(x, "speakingRate", null)
        
        inline def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
        
        inline def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
        
        inline def setVolumeGainDbNull: Self = StObject.set(x, "volumeGainDb", null)
        
        inline def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
      }
    }
    
    trait SchemaCustomVoiceParams extends StObject {
      
      /**
        * Required. The name of the AutoML model that synthesizes the custom voice.
        */
      var model: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Optional. The usage of the synthesized audio to be reported.
        */
      var reportedUsage: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaCustomVoiceParams {
      
      inline def apply(): SchemaCustomVoiceParams = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCustomVoiceParams]
      }
      
      extension [Self <: SchemaCustomVoiceParams](x: Self) {
        
        inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setModelNull: Self = StObject.set(x, "model", null)
        
        inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
        
        inline def setReportedUsage(value: String): Self = StObject.set(x, "reportedUsage", value.asInstanceOf[js.Any])
        
        inline def setReportedUsageNull: Self = StObject.set(x, "reportedUsage", null)
        
        inline def setReportedUsageUndefined: Self = StObject.set(x, "reportedUsage", js.undefined)
      }
    }
    
    trait SchemaListVoicesResponse extends StObject {
      
      /**
        * The list of voices.
        */
      var voices: js.UndefOr[js.Array[SchemaVoice]] = js.undefined
    }
    object SchemaListVoicesResponse {
      
      inline def apply(): SchemaListVoicesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListVoicesResponse]
      }
      
      extension [Self <: SchemaListVoicesResponse](x: Self) {
        
        inline def setVoices(value: js.Array[SchemaVoice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
        
        inline def setVoicesUndefined: Self = StObject.set(x, "voices", js.undefined)
        
        inline def setVoicesVarargs(value: SchemaVoice*): Self = StObject.set(x, "voices", js.Array(value*))
      }
    }
    
    trait SchemaSynthesisInput extends StObject {
      
      /**
        * The SSML document to be synthesized. The SSML document must be valid and well-formed. Otherwise the RPC will fail and return google.rpc.Code.INVALID_ARGUMENT. For more information, see [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
        */
      var ssml: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The raw text to be synthesized.
        */
      var text: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaSynthesisInput {
      
      inline def apply(): SchemaSynthesisInput = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSynthesisInput]
      }
      
      extension [Self <: SchemaSynthesisInput](x: Self) {
        
        inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
        
        inline def setSsmlNull: Self = StObject.set(x, "ssml", null)
        
        inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextNull: Self = StObject.set(x, "text", null)
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait SchemaSynthesizeSpeechRequest extends StObject {
      
      /**
        * Required. The configuration of the synthesized audio.
        */
      var audioConfig: js.UndefOr[SchemaAudioConfig] = js.undefined
      
      /**
        * Required. The Synthesizer requires either plain text or SSML as input.
        */
      var input: js.UndefOr[SchemaSynthesisInput] = js.undefined
      
      /**
        * Required. The desired voice of the synthesized audio.
        */
      var voice: js.UndefOr[SchemaVoiceSelectionParams] = js.undefined
    }
    object SchemaSynthesizeSpeechRequest {
      
      inline def apply(): SchemaSynthesizeSpeechRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSynthesizeSpeechRequest]
      }
      
      extension [Self <: SchemaSynthesizeSpeechRequest](x: Self) {
        
        inline def setAudioConfig(value: SchemaAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
        
        inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
        
        inline def setInput(value: SchemaSynthesisInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
        
        inline def setVoice(value: SchemaVoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
        
        inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
      }
    }
    
    trait SchemaSynthesizeSpeechResponse extends StObject {
      
      /**
        * The audio data bytes encoded as specified in the request, including the header for encodings that are wrapped in containers (e.g. MP3, OGG_OPUS). For LINEAR16 audio, we include the WAV header. Note: as with all bytes fields, protobuffers use a pure binary representation, whereas JSON representations use base64.
        */
      var audioContent: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaSynthesizeSpeechResponse {
      
      inline def apply(): SchemaSynthesizeSpeechResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSynthesizeSpeechResponse]
      }
      
      extension [Self <: SchemaSynthesizeSpeechResponse](x: Self) {
        
        inline def setAudioContent(value: String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
        
        inline def setAudioContentNull: Self = StObject.set(x, "audioContent", null)
        
        inline def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
      }
    }
    
    trait SchemaVoice extends StObject {
      
      /**
        * The languages that this voice supports, expressed as [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g. "en-US", "es-419", "cmn-tw").
        */
      var languageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * The name of this voice. Each distinct voice has a unique name.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The natural sample rate (in hertz) for this voice.
        */
      var naturalSampleRateHertz: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The gender of this voice.
        */
      var ssmlGender: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaVoice {
      
      inline def apply(): SchemaVoice = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVoice]
      }
      
      extension [Self <: SchemaVoice](x: Self) {
        
        inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodesNull: Self = StObject.set(x, "languageCodes", null)
        
        inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
        
        inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNaturalSampleRateHertz(value: Double): Self = StObject.set(x, "naturalSampleRateHertz", value.asInstanceOf[js.Any])
        
        inline def setNaturalSampleRateHertzNull: Self = StObject.set(x, "naturalSampleRateHertz", null)
        
        inline def setNaturalSampleRateHertzUndefined: Self = StObject.set(x, "naturalSampleRateHertz", js.undefined)
        
        inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
        
        inline def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
        
        inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
      }
    }
    
    trait SchemaVoiceSelectionParams extends StObject {
      
      /**
        * The configuration for a custom voice. If [CustomVoiceParams.model] is set, the service will choose the custom voice matching the specified configuration.
        */
      var customVoice: js.UndefOr[SchemaCustomVoiceParams] = js.undefined
      
      /**
        * Required. The language (and potentially also the region) of the voice expressed as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g. "en-US". This should not include a script tag (e.g. use "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred from the input provided in the SynthesisInput. The TTS service will use this parameter to help choose an appropriate voice. Note that the TTS service may choose a voice with a slightly different language code than the one selected; it may substitute a different region (e.g. using en-US rather than en-CA if there isn't a Canadian voice available), or even a different language, e.g. using "nb" (Norwegian Bokmal) instead of "no" (Norwegian)".
        */
      var languageCode: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The name of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and gender.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The preferred gender of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and name. Note that this is only a preference, not requirement; if a voice of the appropriate gender is not available, the synthesizer should substitute a voice with a different gender rather than failing the request.
        */
      var ssmlGender: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaVoiceSelectionParams {
      
      inline def apply(): SchemaVoiceSelectionParams = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVoiceSelectionParams]
      }
      
      extension [Self <: SchemaVoiceSelectionParams](x: Self) {
        
        inline def setCustomVoice(value: SchemaCustomVoiceParams): Self = StObject.set(x, "customVoice", value.asInstanceOf[js.Any])
        
        inline def setCustomVoiceUndefined: Self = StObject.set(x, "customVoice", js.undefined)
        
        inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
        
        inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
        
        inline def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
        
        inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
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
}
