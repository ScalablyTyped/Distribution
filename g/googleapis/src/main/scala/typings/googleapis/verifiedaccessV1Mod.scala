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

object verifiedaccessV1Mod {
  
  object verifiedaccessV1 {
    
    @JSImport("googleapis/build/src/apis/verifiedaccess/v1", "verifiedaccess_v1.Resource$Challenge")
    @js.native
    open class ResourceChallenge protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def create(): GaxiosPromise[SchemaChallenge] = js.native
      def create(callback: BodyResponseCallback[SchemaChallenge]): Unit = js.native
      def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChallenge] = js.native
      def create(params: ParamsResourceChallengeCreate): GaxiosPromise[SchemaChallenge] = js.native
      def create(params: ParamsResourceChallengeCreate, callback: BodyResponseCallback[SchemaChallenge]): Unit = js.native
      def create(
        params: ParamsResourceChallengeCreate,
        options: BodyResponseCallback[Readable | SchemaChallenge],
        callback: BodyResponseCallback[Readable | SchemaChallenge]
      ): Unit = js.native
      def create(params: ParamsResourceChallengeCreate, options: MethodOptions): GaxiosPromise[SchemaChallenge] = js.native
      def create(
        params: ParamsResourceChallengeCreate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaChallenge]
      ): Unit = js.native
      /**
        * CreateChallenge API
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
        * const verifiedaccess = google.verifiedaccess('v1');
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
        *   const res = await verifiedaccess.challenge.create({
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
        *   //   "alternativeChallenge": {},
        *   //   "challenge": {}
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
      def create(params: ParamsResourceChallengeCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def create(
        params: ParamsResourceChallengeCreate,
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
        * VerifyChallengeResponse API
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
        * const verifiedaccess = google.verifiedaccess('v1');
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
        *       //   "challengeResponse": {},
        *       //   "expectedIdentity": "my_expectedIdentity"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "deviceEnrollmentId": "my_deviceEnrollmentId",
        *   //   "devicePermanentId": "my_devicePermanentId",
        *   //   "signedPublicKeyAndChallenge": "my_signedPublicKeyAndChallenge",
        *   //   "verificationOutput": "my_verificationOutput"
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
    
    @JSImport("googleapis/build/src/apis/verifiedaccess/v1", "verifiedaccess_v1.Verifiedaccess")
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
    
    trait ParamsResourceChallengeCreate
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaEmpty] = js.undefined
    }
    object ParamsResourceChallengeCreate {
      
      inline def apply(): ParamsResourceChallengeCreate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceChallengeCreate]
      }
      
      extension [Self <: ParamsResourceChallengeCreate](x: Self) {
        
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
        * Challenge generated with the old signing key (this will only be present during key rotation)
        */
      var alternativeChallenge: js.UndefOr[SchemaSignedData] = js.undefined
      
      /**
        * Generated challenge
        */
      var challenge: js.UndefOr[SchemaSignedData] = js.undefined
    }
    object SchemaChallenge {
      
      inline def apply(): SchemaChallenge = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaChallenge]
      }
      
      extension [Self <: SchemaChallenge](x: Self) {
        
        inline def setAlternativeChallenge(value: SchemaSignedData): Self = StObject.set(x, "alternativeChallenge", value.asInstanceOf[js.Any])
        
        inline def setAlternativeChallengeUndefined: Self = StObject.set(x, "alternativeChallenge", js.undefined)
        
        inline def setChallenge(value: SchemaSignedData): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      }
    }
    
    trait SchemaEmpty extends StObject
    
    trait SchemaSignedData extends StObject {
      
      /**
        * The data to be signed.
        */
      var data: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The signature of the data field.
        */
      var signature: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaSignedData {
      
      inline def apply(): SchemaSignedData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSignedData]
      }
      
      extension [Self <: SchemaSignedData](x: Self) {
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataNull: Self = StObject.set(x, "data", null)
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        inline def setSignatureNull: Self = StObject.set(x, "signature", null)
        
        inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      }
    }
    
    trait SchemaVerifyChallengeResponseRequest extends StObject {
      
      /**
        * The generated response to the challenge
        */
      var challengeResponse: js.UndefOr[SchemaSignedData] = js.undefined
      
      /**
        * Service can optionally provide identity information about the device or user associated with the key. For an EMK, this value is the enrolled domain. For an EUK, this value is the user's email address. If present, this value will be checked against contents of the response, and verification will fail if there is no match.
        */
      var expectedIdentity: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaVerifyChallengeResponseRequest {
      
      inline def apply(): SchemaVerifyChallengeResponseRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVerifyChallengeResponseRequest]
      }
      
      extension [Self <: SchemaVerifyChallengeResponseRequest](x: Self) {
        
        inline def setChallengeResponse(value: SchemaSignedData): Self = StObject.set(x, "challengeResponse", value.asInstanceOf[js.Any])
        
        inline def setChallengeResponseUndefined: Self = StObject.set(x, "challengeResponse", js.undefined)
        
        inline def setExpectedIdentity(value: String): Self = StObject.set(x, "expectedIdentity", value.asInstanceOf[js.Any])
        
        inline def setExpectedIdentityNull: Self = StObject.set(x, "expectedIdentity", null)
        
        inline def setExpectedIdentityUndefined: Self = StObject.set(x, "expectedIdentity", js.undefined)
      }
    }
    
    trait SchemaVerifyChallengeResponseResult extends StObject {
      
      /**
        * Device enrollment id is returned in this field (for the machine response only).
        */
      var deviceEnrollmentId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Device permanent id is returned in this field (for the machine response only).
        */
      var devicePermanentId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Certificate Signing Request (in the SPKAC format, base64 encoded) is returned in this field. This field will be set only if device has included CSR in its challenge response. (the option to include CSR is now available for both user and machine responses)
        */
      var signedPublicKeyAndChallenge: js.UndefOr[String | Null] = js.undefined
      
      /**
        * For EMCert check, device permanent id is returned here. For EUCert check, signed_public_key_and_challenge [base64 encoded] is returned if present, otherwise empty string is returned. This field is deprecated, please use device_permanent_id or signed_public_key_and_challenge fields.
        */
      var verificationOutput: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaVerifyChallengeResponseResult {
      
      inline def apply(): SchemaVerifyChallengeResponseResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVerifyChallengeResponseResult]
      }
      
      extension [Self <: SchemaVerifyChallengeResponseResult](x: Self) {
        
        inline def setDeviceEnrollmentId(value: String): Self = StObject.set(x, "deviceEnrollmentId", value.asInstanceOf[js.Any])
        
        inline def setDeviceEnrollmentIdNull: Self = StObject.set(x, "deviceEnrollmentId", null)
        
        inline def setDeviceEnrollmentIdUndefined: Self = StObject.set(x, "deviceEnrollmentId", js.undefined)
        
        inline def setDevicePermanentId(value: String): Self = StObject.set(x, "devicePermanentId", value.asInstanceOf[js.Any])
        
        inline def setDevicePermanentIdNull: Self = StObject.set(x, "devicePermanentId", null)
        
        inline def setDevicePermanentIdUndefined: Self = StObject.set(x, "devicePermanentId", js.undefined)
        
        inline def setSignedPublicKeyAndChallenge(value: String): Self = StObject.set(x, "signedPublicKeyAndChallenge", value.asInstanceOf[js.Any])
        
        inline def setSignedPublicKeyAndChallengeNull: Self = StObject.set(x, "signedPublicKeyAndChallenge", null)
        
        inline def setSignedPublicKeyAndChallengeUndefined: Self = StObject.set(x, "signedPublicKeyAndChallenge", js.undefined)
        
        inline def setVerificationOutput(value: String): Self = StObject.set(x, "verificationOutput", value.asInstanceOf[js.Any])
        
        inline def setVerificationOutputNull: Self = StObject.set(x, "verificationOutput", null)
        
        inline def setVerificationOutputUndefined: Self = StObject.set(x, "verificationOutput", js.undefined)
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
