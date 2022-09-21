package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v2
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

object verifiedaccessV2Mod {
  
  object verifiedaccessV2 {
    
    @JSImport("googleapis/build/src/apis/verifiedaccess/v2", "verifiedaccess_v2.Resource$Challenge")
    @js.native
    open class ResourceChallenge protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def generate(): GaxiosPromise[SchemaChallenge] = js.native
      def generate(callback: BodyResponseCallback[SchemaChallenge]): Unit = js.native
      def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChallenge] = js.native
      def generate(params: ParamsResourceChallengeGenerate): GaxiosPromise[SchemaChallenge] = js.native
      def generate(params: ParamsResourceChallengeGenerate, callback: BodyResponseCallback[SchemaChallenge]): Unit = js.native
      def generate(
        params: ParamsResourceChallengeGenerate,
        options: BodyResponseCallback[Readable | SchemaChallenge],
        callback: BodyResponseCallback[Readable | SchemaChallenge]
      ): Unit = js.native
      def generate(params: ParamsResourceChallengeGenerate, options: MethodOptions): GaxiosPromise[SchemaChallenge] = js.native
      def generate(
        params: ParamsResourceChallengeGenerate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaChallenge]
      ): Unit = js.native
      /**
        * Generates a new challenge.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/verifiedaccess.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const verifiedaccess = google.verifiedaccess('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/verifiedaccess'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await verifiedaccess.challenge.generate({
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {}
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "alternativeChallenge": "my_alternativeChallenge",
        *   //   "challenge": "my_challenge"
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
      def generate(params: ParamsResourceChallengeGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def generate(
        params: ParamsResourceChallengeGenerate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def verify(): GaxiosPromise[SchemaVerifyChallengeResponseResult] = js.native
      def verify(callback: BodyResponseCallback[SchemaVerifyChallengeResponseResult]): Unit = js.native
      def verify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVerifyChallengeResponseResult] = js.native
      def verify(params: ParamsResourceChallengeVerify): GaxiosPromise[SchemaVerifyChallengeResponseResult] = js.native
      def verify(
        params: ParamsResourceChallengeVerify,
        callback: BodyResponseCallback[SchemaVerifyChallengeResponseResult]
      ): Unit = js.native
      def verify(
        params: ParamsResourceChallengeVerify,
        options: BodyResponseCallback[Readable | SchemaVerifyChallengeResponseResult],
        callback: BodyResponseCallback[Readable | SchemaVerifyChallengeResponseResult]
      ): Unit = js.native
      def verify(params: ParamsResourceChallengeVerify, options: MethodOptions): GaxiosPromise[SchemaVerifyChallengeResponseResult] = js.native
      def verify(
        params: ParamsResourceChallengeVerify,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaVerifyChallengeResponseResult]
      ): Unit = js.native
      /**
        * Verifies the challenge response.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/verifiedaccess.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const verifiedaccess = google.verifiedaccess('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/verifiedaccess'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await verifiedaccess.challenge.verify({
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "challengeResponse": "my_challengeResponse",
        *       //   "expectedIdentity": "my_expectedIdentity"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "devicePermanentId": "my_devicePermanentId",
        *   //   "deviceSignal": "my_deviceSignal",
        *   //   "keyTrustLevel": "my_keyTrustLevel",
        *   //   "signedPublicKeyAndChallenge": "my_signedPublicKeyAndChallenge"
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
      def verify(params: ParamsResourceChallengeVerify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def verify(
        params: ParamsResourceChallengeVerify,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/verifiedaccess/v2", "verifiedaccess_v2.Verifiedaccess")
    @js.native
    open class Verifiedaccess protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var challenge: ResourceChallenge = js.native
      
      var context: APIRequestContext = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v2
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v2")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceChallengeGenerate
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaEmpty] = js.undefined
    }
    object ParamsResourceChallengeGenerate {
      
      inline def apply(): ParamsResourceChallengeGenerate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceChallengeGenerate]
      }
      
      extension [Self <: ParamsResourceChallengeGenerate](x: Self) {
        
        inline def setRequestBody(value: SchemaEmpty): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceChallengeVerify
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaVerifyChallengeResponseRequest] = js.undefined
    }
    object ParamsResourceChallengeVerify {
      
      inline def apply(): ParamsResourceChallengeVerify = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceChallengeVerify]
      }
      
      extension [Self <: ParamsResourceChallengeVerify](x: Self) {
        
        inline def setRequestBody(value: SchemaVerifyChallengeResponseRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaChallenge extends StObject {
      
      /**
        * Challenge generated with the old signing key, the bytes representation of SignedData (this will only be present during key rotation).
        */
      var alternativeChallenge: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Generated challenge, the bytes representation of SignedData.
        */
      var challenge: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaChallenge {
      
      inline def apply(): SchemaChallenge = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaChallenge]
      }
      
      extension [Self <: SchemaChallenge](x: Self) {
        
        inline def setAlternativeChallenge(value: String): Self = StObject.set(x, "alternativeChallenge", value.asInstanceOf[js.Any])
        
        inline def setAlternativeChallengeNull: Self = StObject.set(x, "alternativeChallenge", null)
        
        inline def setAlternativeChallengeUndefined: Self = StObject.set(x, "alternativeChallenge", js.undefined)
        
        inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        inline def setChallengeNull: Self = StObject.set(x, "challenge", null)
        
        inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      }
    }
    
    trait SchemaEmpty extends StObject
    
    trait SchemaVerifyChallengeResponseRequest extends StObject {
      
      /**
        * Required. The generated response to the challenge, the bytes representation of SignedData.
        */
      var challengeResponse: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Optional. Service can optionally provide identity information about the device or user associated with the key. For an EMK, this value is the enrolled domain. For an EUK, this value is the user's email address. If present, this value will be checked against contents of the response, and verification will fail if there is no match.
        */
      var expectedIdentity: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaVerifyChallengeResponseRequest {
      
      inline def apply(): SchemaVerifyChallengeResponseRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVerifyChallengeResponseRequest]
      }
      
      extension [Self <: SchemaVerifyChallengeResponseRequest](x: Self) {
        
        inline def setChallengeResponse(value: String): Self = StObject.set(x, "challengeResponse", value.asInstanceOf[js.Any])
        
        inline def setChallengeResponseNull: Self = StObject.set(x, "challengeResponse", null)
        
        inline def setChallengeResponseUndefined: Self = StObject.set(x, "challengeResponse", js.undefined)
        
        inline def setExpectedIdentity(value: String): Self = StObject.set(x, "expectedIdentity", value.asInstanceOf[js.Any])
        
        inline def setExpectedIdentityNull: Self = StObject.set(x, "expectedIdentity", null)
        
        inline def setExpectedIdentityUndefined: Self = StObject.set(x, "expectedIdentity", js.undefined)
      }
    }
    
    trait SchemaVerifyChallengeResponseResult extends StObject {
      
      /**
        * Device permanent id is returned in this field (for the machine response only).
        */
      var devicePermanentId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Device signal in json string representation.
        */
      var deviceSignal: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Device attested key trust level.
        */
      var keyTrustLevel: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Certificate Signing Request (in the SPKAC format, base64 encoded) is returned in this field. This field will be set only if device has included CSR in its challenge response. (the option to include CSR is now available for both user and machine responses)
        */
      var signedPublicKeyAndChallenge: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaVerifyChallengeResponseResult {
      
      inline def apply(): SchemaVerifyChallengeResponseResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVerifyChallengeResponseResult]
      }
      
      extension [Self <: SchemaVerifyChallengeResponseResult](x: Self) {
        
        inline def setDevicePermanentId(value: String): Self = StObject.set(x, "devicePermanentId", value.asInstanceOf[js.Any])
        
        inline def setDevicePermanentIdNull: Self = StObject.set(x, "devicePermanentId", null)
        
        inline def setDevicePermanentIdUndefined: Self = StObject.set(x, "devicePermanentId", js.undefined)
        
        inline def setDeviceSignal(value: String): Self = StObject.set(x, "deviceSignal", value.asInstanceOf[js.Any])
        
        inline def setDeviceSignalNull: Self = StObject.set(x, "deviceSignal", null)
        
        inline def setDeviceSignalUndefined: Self = StObject.set(x, "deviceSignal", js.undefined)
        
        inline def setKeyTrustLevel(value: String): Self = StObject.set(x, "keyTrustLevel", value.asInstanceOf[js.Any])
        
        inline def setKeyTrustLevelNull: Self = StObject.set(x, "keyTrustLevel", null)
        
        inline def setKeyTrustLevelUndefined: Self = StObject.set(x, "keyTrustLevel", js.undefined)
        
        inline def setSignedPublicKeyAndChallenge(value: String): Self = StObject.set(x, "signedPublicKeyAndChallenge", value.asInstanceOf[js.Any])
        
        inline def setSignedPublicKeyAndChallengeNull: Self = StObject.set(x, "signedPublicKeyAndChallenge", null)
        
        inline def setSignedPublicKeyAndChallengeUndefined: Self = StObject.set(x, "signedPublicKeyAndChallenge", js.undefined)
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
