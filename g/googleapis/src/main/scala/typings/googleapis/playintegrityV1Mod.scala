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

object playintegrityV1Mod {
  
  object playintegrityV1 {
    
    @JSImport("googleapis/build/src/apis/playintegrity/v1", "playintegrity_v1.Playintegrity")
    @js.native
    open class Playintegrity protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var v1: ResourceV1 = js.native
    }
    
    @JSImport("googleapis/build/src/apis/playintegrity/v1", "playintegrity_v1.Resource$V1")
    @js.native
    open class ResourceV1 protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def decodeIntegrityToken(): GaxiosPromise[SchemaDecodeIntegrityTokenResponse] = js.native
      def decodeIntegrityToken(callback: BodyResponseCallback[SchemaDecodeIntegrityTokenResponse]): Unit = js.native
      def decodeIntegrityToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDecodeIntegrityTokenResponse] = js.native
      def decodeIntegrityToken(params: ParamsResourceV1Decodeintegritytoken): GaxiosPromise[SchemaDecodeIntegrityTokenResponse] = js.native
      def decodeIntegrityToken(
        params: ParamsResourceV1Decodeintegritytoken,
        callback: BodyResponseCallback[SchemaDecodeIntegrityTokenResponse]
      ): Unit = js.native
      def decodeIntegrityToken(
        params: ParamsResourceV1Decodeintegritytoken,
        options: BodyResponseCallback[Readable | SchemaDecodeIntegrityTokenResponse],
        callback: BodyResponseCallback[Readable | SchemaDecodeIntegrityTokenResponse]
      ): Unit = js.native
      def decodeIntegrityToken(params: ParamsResourceV1Decodeintegritytoken, options: MethodOptions): GaxiosPromise[SchemaDecodeIntegrityTokenResponse] = js.native
      def decodeIntegrityToken(
        params: ParamsResourceV1Decodeintegritytoken,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaDecodeIntegrityTokenResponse]
      ): Unit = js.native
      /**
        * Decodes the integrity token and returns the token payload.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/playintegrity.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const playintegrity = google.playintegrity('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/playintegrity'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await playintegrity.decodeIntegrityToken({
        *     //  Package name of the app the attached integrity token belongs to.
        *     packageName: '[^/]+',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "integrityToken": "my_integrityToken"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "tokenPayloadExternal": {}
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
      def decodeIntegrityToken(params: ParamsResourceV1Decodeintegritytoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def decodeIntegrityToken(
        params: ParamsResourceV1Decodeintegritytoken,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
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
    
    trait ParamsResourceV1Decodeintegritytoken
      extends StObject
         with StandardParameters {
      
      /**
        *  Package name of the app the attached integrity token belongs to.
        */
      var packageName: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaDecodeIntegrityTokenRequest] = js.undefined
    }
    object ParamsResourceV1Decodeintegritytoken {
      
      inline def apply(): ParamsResourceV1Decodeintegritytoken = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1Decodeintegritytoken]
      }
      
      extension [Self <: ParamsResourceV1Decodeintegritytoken](x: Self) {
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setRequestBody(value: SchemaDecodeIntegrityTokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaAccountDetails extends StObject {
      
      /**
        * Details about the account risk for the user in the scope. This feature is available only to selected developers.
        */
      var accountRiskVerdict: js.UndefOr[SchemaAccountRiskVerdict] = js.undefined
      
      /**
        * Required. Details about the licensing status of the user for the app in the scope.
        */
      var appLicensingVerdict: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaAccountDetails {
      
      inline def apply(): SchemaAccountDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAccountDetails]
      }
      
      extension [Self <: SchemaAccountDetails](x: Self) {
        
        inline def setAccountRiskVerdict(value: SchemaAccountRiskVerdict): Self = StObject.set(x, "accountRiskVerdict", value.asInstanceOf[js.Any])
        
        inline def setAccountRiskVerdictUndefined: Self = StObject.set(x, "accountRiskVerdict", js.undefined)
        
        inline def setAppLicensingVerdict(value: String): Self = StObject.set(x, "appLicensingVerdict", value.asInstanceOf[js.Any])
        
        inline def setAppLicensingVerdictNull: Self = StObject.set(x, "appLicensingVerdict", null)
        
        inline def setAppLicensingVerdictUndefined: Self = StObject.set(x, "appLicensingVerdict", js.undefined)
      }
    }
    
    trait SchemaAccountRiskVerdict extends StObject {
      
      /**
        * Required. Indicates the account risk level of the current user session.
        */
      var riskLevel: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaAccountRiskVerdict {
      
      inline def apply(): SchemaAccountRiskVerdict = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAccountRiskVerdict]
      }
      
      extension [Self <: SchemaAccountRiskVerdict](x: Self) {
        
        inline def setRiskLevel(value: String): Self = StObject.set(x, "riskLevel", value.asInstanceOf[js.Any])
        
        inline def setRiskLevelNull: Self = StObject.set(x, "riskLevel", null)
        
        inline def setRiskLevelUndefined: Self = StObject.set(x, "riskLevel", js.undefined)
      }
    }
    
    trait SchemaAppIntegrity extends StObject {
      
      /**
        * Required. Details about the app recognition verdict
        */
      var appRecognitionVerdict: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Hex fingerprint of the application signing certificate. e.g. “ABCE1F....” Set iff app_recognition_verdict != UNEVALUATED.
        */
      var certificateSha256Digest: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * Package name of the application under attestation. Set iff app_recognition_verdict != UNEVALUATED.
        */
      var packageName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Version code of the application. Set iff app_recognition_verdict != UNEVALUATED.
        */
      var versionCode: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaAppIntegrity {
      
      inline def apply(): SchemaAppIntegrity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAppIntegrity]
      }
      
      extension [Self <: SchemaAppIntegrity](x: Self) {
        
        inline def setAppRecognitionVerdict(value: String): Self = StObject.set(x, "appRecognitionVerdict", value.asInstanceOf[js.Any])
        
        inline def setAppRecognitionVerdictNull: Self = StObject.set(x, "appRecognitionVerdict", null)
        
        inline def setAppRecognitionVerdictUndefined: Self = StObject.set(x, "appRecognitionVerdict", js.undefined)
        
        inline def setCertificateSha256Digest(value: js.Array[String]): Self = StObject.set(x, "certificateSha256Digest", value.asInstanceOf[js.Any])
        
        inline def setCertificateSha256DigestNull: Self = StObject.set(x, "certificateSha256Digest", null)
        
        inline def setCertificateSha256DigestUndefined: Self = StObject.set(x, "certificateSha256Digest", js.undefined)
        
        inline def setCertificateSha256DigestVarargs(value: String*): Self = StObject.set(x, "certificateSha256Digest", js.Array(value*))
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
        
        inline def setVersionCodeNull: Self = StObject.set(x, "versionCode", null)
        
        inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
      }
    }
    
    trait SchemaDecodeIntegrityTokenRequest extends StObject {
      
      /**
        * Encoded integrity token.
        */
      var integrityToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaDecodeIntegrityTokenRequest {
      
      inline def apply(): SchemaDecodeIntegrityTokenRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDecodeIntegrityTokenRequest]
      }
      
      extension [Self <: SchemaDecodeIntegrityTokenRequest](x: Self) {
        
        inline def setIntegrityToken(value: String): Self = StObject.set(x, "integrityToken", value.asInstanceOf[js.Any])
        
        inline def setIntegrityTokenNull: Self = StObject.set(x, "integrityToken", null)
        
        inline def setIntegrityTokenUndefined: Self = StObject.set(x, "integrityToken", js.undefined)
      }
    }
    
    trait SchemaDecodeIntegrityTokenResponse extends StObject {
      
      /**
        * Plain token payload generated from the decoded integrity token.
        */
      var tokenPayloadExternal: js.UndefOr[SchemaTokenPayloadExternal] = js.undefined
    }
    object SchemaDecodeIntegrityTokenResponse {
      
      inline def apply(): SchemaDecodeIntegrityTokenResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDecodeIntegrityTokenResponse]
      }
      
      extension [Self <: SchemaDecodeIntegrityTokenResponse](x: Self) {
        
        inline def setTokenPayloadExternal(value: SchemaTokenPayloadExternal): Self = StObject.set(x, "tokenPayloadExternal", value.asInstanceOf[js.Any])
        
        inline def setTokenPayloadExternalUndefined: Self = StObject.set(x, "tokenPayloadExternal", js.undefined)
      }
    }
    
    trait SchemaDeviceIntegrity extends StObject {
      
      /**
        * Details about the integrity of the device the app is running on
        */
      var deviceRecognitionVerdict: js.UndefOr[js.Array[String] | Null] = js.undefined
    }
    object SchemaDeviceIntegrity {
      
      inline def apply(): SchemaDeviceIntegrity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDeviceIntegrity]
      }
      
      extension [Self <: SchemaDeviceIntegrity](x: Self) {
        
        inline def setDeviceRecognitionVerdict(value: js.Array[String]): Self = StObject.set(x, "deviceRecognitionVerdict", value.asInstanceOf[js.Any])
        
        inline def setDeviceRecognitionVerdictNull: Self = StObject.set(x, "deviceRecognitionVerdict", null)
        
        inline def setDeviceRecognitionVerdictUndefined: Self = StObject.set(x, "deviceRecognitionVerdict", js.undefined)
        
        inline def setDeviceRecognitionVerdictVarargs(value: String*): Self = StObject.set(x, "deviceRecognitionVerdict", js.Array(value*))
      }
    }
    
    trait SchemaRequestDetails extends StObject {
      
      /**
        * Required. Nonce that was provided in the request (which is base64 web-safe no-wrap).
        */
      var nonce: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Required. Application package name this attestation was requested for. Note: This field makes no guarantees or promises on the caller integrity. For details on application integrity, check application_integrity.
        */
      var requestPackageName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Required. Timestamp, in milliseconds, of the integrity application request.
        */
      var timestampMillis: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaRequestDetails {
      
      inline def apply(): SchemaRequestDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRequestDetails]
      }
      
      extension [Self <: SchemaRequestDetails](x: Self) {
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceNull: Self = StObject.set(x, "nonce", null)
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        inline def setRequestPackageName(value: String): Self = StObject.set(x, "requestPackageName", value.asInstanceOf[js.Any])
        
        inline def setRequestPackageNameNull: Self = StObject.set(x, "requestPackageName", null)
        
        inline def setRequestPackageNameUndefined: Self = StObject.set(x, "requestPackageName", js.undefined)
        
        inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
        
        inline def setTimestampMillisNull: Self = StObject.set(x, "timestampMillis", null)
        
        inline def setTimestampMillisUndefined: Self = StObject.set(x, "timestampMillis", js.undefined)
      }
    }
    
    trait SchemaTestingDetails extends StObject {
      
      /**
        * Required. Indicates that the information contained in this payload is a testing response that is statically overridden for a tester.
        */
      var isTestingResponse: js.UndefOr[Boolean | Null] = js.undefined
    }
    object SchemaTestingDetails {
      
      inline def apply(): SchemaTestingDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTestingDetails]
      }
      
      extension [Self <: SchemaTestingDetails](x: Self) {
        
        inline def setIsTestingResponse(value: Boolean): Self = StObject.set(x, "isTestingResponse", value.asInstanceOf[js.Any])
        
        inline def setIsTestingResponseNull: Self = StObject.set(x, "isTestingResponse", null)
        
        inline def setIsTestingResponseUndefined: Self = StObject.set(x, "isTestingResponse", js.undefined)
      }
    }
    
    trait SchemaTokenPayloadExternal extends StObject {
      
      /**
        * Required. Details about the Play Store account.
        */
      var accountDetails: js.UndefOr[SchemaAccountDetails] = js.undefined
      
      /**
        * Required. Details about the application integrity.
        */
      var appIntegrity: js.UndefOr[SchemaAppIntegrity] = js.undefined
      
      /**
        * Required. Details about the device integrity.
        */
      var deviceIntegrity: js.UndefOr[SchemaDeviceIntegrity] = js.undefined
      
      /**
        * Required. Details about the integrity request.
        */
      var requestDetails: js.UndefOr[SchemaRequestDetails] = js.undefined
      
      /**
        * Indicates that this payload is generated for testing purposes and contains any additional data that is linked with testing status.
        */
      var testingDetails: js.UndefOr[SchemaTestingDetails] = js.undefined
    }
    object SchemaTokenPayloadExternal {
      
      inline def apply(): SchemaTokenPayloadExternal = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTokenPayloadExternal]
      }
      
      extension [Self <: SchemaTokenPayloadExternal](x: Self) {
        
        inline def setAccountDetails(value: SchemaAccountDetails): Self = StObject.set(x, "accountDetails", value.asInstanceOf[js.Any])
        
        inline def setAccountDetailsUndefined: Self = StObject.set(x, "accountDetails", js.undefined)
        
        inline def setAppIntegrity(value: SchemaAppIntegrity): Self = StObject.set(x, "appIntegrity", value.asInstanceOf[js.Any])
        
        inline def setAppIntegrityUndefined: Self = StObject.set(x, "appIntegrity", js.undefined)
        
        inline def setDeviceIntegrity(value: SchemaDeviceIntegrity): Self = StObject.set(x, "deviceIntegrity", value.asInstanceOf[js.Any])
        
        inline def setDeviceIntegrityUndefined: Self = StObject.set(x, "deviceIntegrity", js.undefined)
        
        inline def setRequestDetails(value: SchemaRequestDetails): Self = StObject.set(x, "requestDetails", value.asInstanceOf[js.Any])
        
        inline def setRequestDetailsUndefined: Self = StObject.set(x, "requestDetails", js.undefined)
        
        inline def setTestingDetails(value: SchemaTestingDetails): Self = StObject.set(x, "testingDetails", value.asInstanceOf[js.Any])
        
        inline def setTestingDetailsUndefined: Self = StObject.set(x, "testingDetails", js.undefined)
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
