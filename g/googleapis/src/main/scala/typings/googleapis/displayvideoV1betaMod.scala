package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayvideoV1betaMod {
  
  object displayvideoV1beta {
    
    @JSImport("googleapis/build/src/apis/displayvideo/v1beta", "displayvideo_v1beta.Displayvideo")
    @js.native
    open class Displayvideo protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var media: ResourceMedia = js.native
      
      var sdfdownloadtask: ResourceSdfdownloadtask = js.native
      
      var sdfdownloadtasks: ResourceSdfdownloadtasks = js.native
    }
    
    @JSImport("googleapis/build/src/apis/displayvideo/v1beta", "displayvideo_v1beta.Resource$Media")
    @js.native
    open class ResourceMedia protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def download(): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
      def download(callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
      def download(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
      def download(params: ParamsResourceMediaDownload): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
      def download(params: ParamsResourceMediaDownload, callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
      def download(
        params: ParamsResourceMediaDownload,
        options: BodyResponseCallback[Readable | SchemaGoogleBytestreamMedia],
        callback: BodyResponseCallback[Readable | SchemaGoogleBytestreamMedia]
      ): Unit = js.native
      def download(params: ParamsResourceMediaDownload, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
      def download(
        params: ParamsResourceMediaDownload,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]
      ): Unit = js.native
      /**
        * Downloads media. Download is supported on the URI `/download/{resource_name=**\}?alt=media.` **Note**: Download requests will not be successful without including `alt=media` query string.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const displayvideo = google.displayvideo('v1beta');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/display-video',
        *       'https://www.googleapis.com/auth/doubleclickbidmanager',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await displayvideo.media.download({
        *     // Name of the media that is being downloaded. See ReadRequest.resource_name.
        *     resourceName: '.*',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "resourceName": "my_resourceName"
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
      def download(params: ParamsResourceMediaDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def download(
        params: ParamsResourceMediaDownload,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/displayvideo/v1beta", "displayvideo_v1beta.Resource$Sdfdownloadtask")
    @js.native
    open class ResourceSdfdownloadtask protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var operations: ResourceSdfdownloadtaskOperations = js.native
    }
    
    @JSImport("googleapis/build/src/apis/displayvideo/v1beta", "displayvideo_v1beta.Resource$Sdfdownloadtask$Operations")
    @js.native
    open class ResourceSdfdownloadtaskOperations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaOperation] = js.native
      def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
      def get(params: ParamsResourceSdfdownloadtaskOperationsGet): GaxiosPromise[SchemaOperation] = js.native
      def get(
        params: ParamsResourceSdfdownloadtaskOperationsGet,
        callback: BodyResponseCallback[SchemaOperation]
      ): Unit = js.native
      def get(
        params: ParamsResourceSdfdownloadtaskOperationsGet,
        options: BodyResponseCallback[Readable | SchemaOperation],
        callback: BodyResponseCallback[Readable | SchemaOperation]
      ): Unit = js.native
      def get(params: ParamsResourceSdfdownloadtaskOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
      def get(
        params: ParamsResourceSdfdownloadtaskOperationsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaOperation]
      ): Unit = js.native
      /**
        * Gets the latest state of an asynchronous SDF download task operation. Clients should poll this method at intervals of 30 seconds.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const displayvideo = google.displayvideo('v1beta');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/display-video',
        *       'https://www.googleapis.com/auth/doubleclickbidmanager',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await displayvideo.sdfdownloadtask.operations.get({
        *     // The name of the operation resource.
        *     name: 'sdfdownloadtask/operations/my-operation',
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
      def get(params: ParamsResourceSdfdownloadtaskOperationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceSdfdownloadtaskOperationsGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/displayvideo/v1beta", "displayvideo_v1beta.Resource$Sdfdownloadtasks")
    @js.native
    open class ResourceSdfdownloadtasks protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var operations: ResourceSdfdownloadtasksOperations = js.native
    }
    
    @JSImport("googleapis/build/src/apis/displayvideo/v1beta", "displayvideo_v1beta.Resource$Sdfdownloadtasks$Operations")
    @js.native
    open class ResourceSdfdownloadtasksOperations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaOperation] = js.native
      def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
      def get(params: ParamsResourceSdfdownloadtasksOperationsGet): GaxiosPromise[SchemaOperation] = js.native
      def get(
        params: ParamsResourceSdfdownloadtasksOperationsGet,
        callback: BodyResponseCallback[SchemaOperation]
      ): Unit = js.native
      def get(
        params: ParamsResourceSdfdownloadtasksOperationsGet,
        options: BodyResponseCallback[Readable | SchemaOperation],
        callback: BodyResponseCallback[Readable | SchemaOperation]
      ): Unit = js.native
      def get(params: ParamsResourceSdfdownloadtasksOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
      def get(
        params: ParamsResourceSdfdownloadtasksOperationsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaOperation]
      ): Unit = js.native
      /**
        * Gets the latest state of an asynchronous SDF download task operation. Clients should poll this method at intervals of 30 seconds.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const displayvideo = google.displayvideo('v1beta');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/display-video',
        *       'https://www.googleapis.com/auth/doubleclickbidmanager',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await displayvideo.sdfdownloadtasks.operations.get({
        *     // The name of the operation resource.
        *     name: 'sdfdownloadtasks/operations/my-operation',
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
      def get(params: ParamsResourceSdfdownloadtasksOperationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceSdfdownloadtasksOperationsGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1beta
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1beta")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1beta): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceMediaDownload
      extends StObject
         with StandardParameters {
      
      /**
        * Name of the media that is being downloaded. See ReadRequest.resource_name.
        */
      var resourceName: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceMediaDownload {
      
      inline def apply(): ParamsResourceMediaDownload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceMediaDownload]
      }
      
      extension [Self <: ParamsResourceMediaDownload](x: Self) {
        
        inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
      }
    }
    
    trait ParamsResourceSdfdownloadtaskOperationsGet
      extends StObject
         with StandardParameters {
      
      /**
        * The name of the operation resource.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceSdfdownloadtaskOperationsGet {
      
      inline def apply(): ParamsResourceSdfdownloadtaskOperationsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceSdfdownloadtaskOperationsGet]
      }
      
      extension [Self <: ParamsResourceSdfdownloadtaskOperationsGet](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceSdfdownloadtasksOperationsGet
      extends StObject
         with StandardParameters {
      
      /**
        * The name of the operation resource.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceSdfdownloadtasksOperationsGet {
      
      inline def apply(): ParamsResourceSdfdownloadtasksOperationsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceSdfdownloadtasksOperationsGet]
      }
      
      extension [Self <: ParamsResourceSdfdownloadtasksOperationsGet](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait SchemaGoogleBytestreamMedia extends StObject {
      
      /**
        * Name of the media resource.
        */
      var resourceName: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleBytestreamMedia {
      
      inline def apply(): SchemaGoogleBytestreamMedia = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleBytestreamMedia]
      }
      
      extension [Self <: SchemaGoogleBytestreamMedia](x: Self) {
        
        inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
        
        inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
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
            String | OAuth2Client | JWT | Compute | UserRefreshClient | GoogleAuth[JSONClient]
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
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient | GoogleAuth[JSONClient]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
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
