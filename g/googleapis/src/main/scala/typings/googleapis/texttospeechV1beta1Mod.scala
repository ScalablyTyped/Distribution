package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texttospeechV1beta1Mod {
  
  object texttospeechV1beta1 {
    
    @JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Resource$Text")
    @js.native
    class ResourceText protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * texttospeech.text.synthesize
        * @desc Synthesizes speech synchronously: receive results after all text
        * input has been processed.
        * @alias texttospeech.text.synthesize
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {().SynthesizeSpeechRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
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
        options: BodyResponseCallback[SchemaSynthesizeSpeechResponse],
        callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
      ): Unit = js.native
      def synthesize(params: ParamsResourceTextSynthesize, options: MethodOptions): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
      def synthesize(
        params: ParamsResourceTextSynthesize,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Resource$Voices")
    @js.native
    class ResourceVoices protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * texttospeech.voices.list
        * @desc Returns a list of Voice supported for synthesis.
        * @alias texttospeech.voices.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.languageCode Optional (but recommended) [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. E.g. when specifying "en-NZ", you will get supported "en-*" voices; when specifying "no", you will get supported "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh" will also get supported "cmn-*" voices; specifying "zh-hk" will also get supported "yue-*" voices.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(params: ParamsResourceVoicesList): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(params: ParamsResourceVoicesList, callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
      def list(
        params: ParamsResourceVoicesList,
        options: BodyResponseCallback[SchemaListVoicesResponse],
        callback: BodyResponseCallback[SchemaListVoicesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceVoicesList, options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
      def list(
        params: ParamsResourceVoicesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListVoicesResponse]
      ): Unit = js.native
    }
    
    /**
      * Cloud Text-to-Speech API
      *
      * Synthesizes natural-sounding speech by applying powerful neural network
      * models.
      *
      * @example
      * const {google} = require('googleapis');
      * const texttospeech = google.texttospeech('v1beta1');
      *
      * @namespace texttospeech
      * @type {Function}
      * @version v1beta1
      * @variation v1beta1
      * @param {object=} options Options for Texttospeech
      */
    @JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Texttospeech")
    @js.native
    class Texttospeech protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var text: ResourceText = js.native
      
      var voices: ResourceVoices = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1beta1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1beta1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceTextSynthesize
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
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
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setRequestBody(value: SchemaSynthesizeSpeechRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceVoicesList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Optional (but recommended)
        * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
        * specified, the ListVoices call will only return voices that can be used
        * to synthesize this language_code. E.g. when specifying "en-NZ", you will
        * get supported "en-*" voices; when specifying "no", you will get supported
        * "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh"
        * will also get supported "cmn-*" voices; specifying "zh-hk" will also get
        * supported "yue-*" voices.
        */
      var languageCode: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceVoicesList {
      
      inline def apply(): ParamsResourceVoicesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceVoicesList]
      }
      
      extension [Self <: ParamsResourceVoicesList](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
      }
    }
    
    /**
      * Description of audio data to be synthesized.
      */
    trait SchemaAudioConfig extends StObject {
      
      /**
        * Required. The format of the requested audio byte stream.
        */
      var audioEncoding: js.UndefOr[String] = js.undefined
      
      /**
        * An identifier which selects &#39;audio effects&#39; profiles that are
        * applied on (post synthesized) text to speech. Effects are applied on top
        * of each other in the order they are given. See  [audio-profiles](https:
        * //cloud.google.com/text-to-speech/docs/audio-profiles) for current
        * supported profile ids.
        */
      var effectsProfileId: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Optional speaking pitch, in the range [-20.0, 20.0]. 20 means increase 20
        * semitones from the original pitch. -20 means decrease 20 semitones from
        * the original pitch.
        */
      var pitch: js.UndefOr[Double] = js.undefined
      
      /**
        * The synthesis sample rate (in hertz) for this audio. Optional.  If this
        * is different from the voice&#39;s natural sample rate, then the
        * synthesizer will honor this request by converting to the desired sample
        * rate (which might result in worse audio quality), unless the specified
        * sample rate is not supported for the encoding chosen, in which case it
        * will fail the request and return google.rpc.Code.INVALID_ARGUMENT.
        */
      var sampleRateHertz: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the normal
        * native speed supported by the specific voice. 2.0 is twice as fast, and
        * 0.5 is half as fast. If unset(0.0), defaults to the native 1.0 speed. Any
        * other values &lt; 0.25 or &gt; 4.0 will return an error.
        */
      var speakingRate: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional volume gain (in dB) of the normal native volume supported by the
        * specific voice, in the range [-96.0, 16.0]. If unset, or set to a value
        * of 0.0 (dB), will play at normal native signal amplitude. A value of -6.0
        * (dB) will play at approximately half the amplitude of the normal native
        * signal amplitude. A value of +6.0 (dB) will play at approximately twice
        * the amplitude of the normal native signal amplitude. Strongly recommend
        * not to exceed +10 (dB) as there&#39;s usually no effective increase in
        * loudness for any value greater than that.
        */
      var volumeGainDb: js.UndefOr[Double] = js.undefined
    }
    object SchemaAudioConfig {
      
      inline def apply(): SchemaAudioConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAudioConfig]
      }
      
      extension [Self <: SchemaAudioConfig](x: Self) {
        
        inline def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
        
        inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
        
        inline def setEffectsProfileId(value: js.Array[String]): Self = StObject.set(x, "effectsProfileId", value.asInstanceOf[js.Any])
        
        inline def setEffectsProfileIdUndefined: Self = StObject.set(x, "effectsProfileId", js.undefined)
        
        inline def setEffectsProfileIdVarargs(value: String*): Self = StObject.set(x, "effectsProfileId", js.Array(value :_*))
        
        inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
        
        inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
        
        inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
        
        inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
        
        inline def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
        
        inline def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
        
        inline def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
        
        inline def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
      }
    }
    
    /**
      * The message returned to the client by the `ListVoices` method.
      */
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
        
        inline def setVoicesVarargs(value: SchemaVoice*): Self = StObject.set(x, "voices", js.Array(value :_*))
      }
    }
    
    /**
      * Contains text input to be synthesized. Either `text` or `ssml` must be
      * supplied. Supplying both or neither returns
      * google.rpc.Code.INVALID_ARGUMENT. The input size is limited to 5000
      * characters.
      */
    trait SchemaSynthesisInput extends StObject {
      
      /**
        * The SSML document to be synthesized. The SSML document must be valid and
        * well-formed. Otherwise the RPC will fail and return
        * google.rpc.Code.INVALID_ARGUMENT. For more information, see
        * [SSML](/speech/text-to-speech/docs/ssml).
        */
      var ssml: js.UndefOr[String] = js.undefined
      
      /**
        * The raw text to be synthesized.
        */
      var text: js.UndefOr[String] = js.undefined
    }
    object SchemaSynthesisInput {
      
      inline def apply(): SchemaSynthesisInput = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSynthesisInput]
      }
      
      extension [Self <: SchemaSynthesisInput](x: Self) {
        
        inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
        
        inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /**
      * The top-level message sent by the client for the `SynthesizeSpeech` method.
      */
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
    
    /**
      * The message returned to the client by the `SynthesizeSpeech` method.
      */
    trait SchemaSynthesizeSpeechResponse extends StObject {
      
      /**
        * The audio data bytes encoded as specified in the request, including the
        * header (For LINEAR16 audio, we include the WAV header). Note: as with all
        * bytes fields, protobuffers use a pure binary representation, whereas JSON
        * representations use base64.
        */
      var audioContent: js.UndefOr[String] = js.undefined
    }
    object SchemaSynthesizeSpeechResponse {
      
      inline def apply(): SchemaSynthesizeSpeechResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSynthesizeSpeechResponse]
      }
      
      extension [Self <: SchemaSynthesizeSpeechResponse](x: Self) {
        
        inline def setAudioContent(value: String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
        
        inline def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
      }
    }
    
    /**
      * Description of a voice supported by the TTS service.
      */
    trait SchemaVoice extends StObject {
      
      /**
        * The languages that this voice supports, expressed as
        * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags
        * (e.g. &quot;en-US&quot;, &quot;es-419&quot;, &quot;cmn-tw&quot;).
        */
      var languageCodes: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The name of this voice.  Each distinct voice has a unique name.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The natural sample rate (in hertz) for this voice.
        */
      var naturalSampleRateHertz: js.UndefOr[Double] = js.undefined
      
      /**
        * The gender of this voice.
        */
      var ssmlGender: js.UndefOr[String] = js.undefined
    }
    object SchemaVoice {
      
      inline def apply(): SchemaVoice = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVoice]
      }
      
      extension [Self <: SchemaVoice](x: Self) {
        
        inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
        
        inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value :_*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNaturalSampleRateHertz(value: Double): Self = StObject.set(x, "naturalSampleRateHertz", value.asInstanceOf[js.Any])
        
        inline def setNaturalSampleRateHertzUndefined: Self = StObject.set(x, "naturalSampleRateHertz", js.undefined)
        
        inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
        
        inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
      }
    }
    
    /**
      * Description of which voice to use for a synthesis request.
      */
    trait SchemaVoiceSelectionParams extends StObject {
      
      /**
        * The language (and optionally also the region) of the voice expressed as a
        * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
        * &quot;en-US&quot;. Required. This should not include a script tag (e.g.
        * use &quot;cmn-cn&quot; rather than &quot;cmn-Hant-cn&quot;), because the
        * script will be inferred from the input provided in the SynthesisInput.
        * The TTS service will use this parameter to help choose an appropriate
        * voice.  Note that the TTS service may choose a voice with a slightly
        * different language code than the one selected; it may substitute a
        * different region (e.g. using en-US rather than en-CA if there isn&#39;t a
        * Canadian voice available), or even a different language, e.g. using
        * &quot;nb&quot; (Norwegian Bokmal) instead of &quot;no&quot;
        * (Norwegian)&quot;.
        */
      var languageCode: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the voice. Optional; if not set, the service will choose a
        * voice based on the other parameters such as language_code and gender.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The preferred gender of the voice. Optional; if not set, the service will
        * choose a voice based on the other parameters such as language_code and
        * name. Note that this is only a preference, not requirement; if a voice of
        * the appropriate gender is not available, the synthesizer should
        * substitute a voice with a different gender rather than failing the
        * request.
        */
      var ssmlGender: js.UndefOr[String] = js.undefined
    }
    object SchemaVoiceSelectionParams {
      
      inline def apply(): SchemaVoiceSelectionParams = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVoiceSelectionParams]
      }
      
      extension [Self <: SchemaVoiceSelectionParams](x: Self) {
        
        inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
        
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
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
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
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
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
