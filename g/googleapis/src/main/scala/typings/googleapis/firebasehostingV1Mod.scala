package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
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

object firebasehostingV1Mod {
  
  object firebasehostingV1 {
    
    @JSImport("googleapis/build/src/apis/firebasehosting/v1", "firebasehosting_v1.Firebasehosting")
    @js.native
    open class Firebasehosting protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var operations: ResourceOperations = js.native
    }
    
    @JSImport("googleapis/build/src/apis/firebasehosting/v1", "firebasehosting_v1.Resource$Operations")
    @js.native
    open class ResourceOperations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      def cancel(): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(params: ParamsResourceOperationsCancel): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(params: ParamsResourceOperationsCancel, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def cancel(
        params: ParamsResourceOperationsCancel,
        options: BodyResponseCallback[Readable | SchemaEmpty],
        callback: BodyResponseCallback[Readable | SchemaEmpty]
      ): Unit = js.native
      def cancel(params: ParamsResourceOperationsCancel, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(
        params: ParamsResourceOperationsCancel,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      /**
        * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const firebasehosting = google.firebasehosting('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await firebasehosting.operations.cancel({
        *     // The name of the operation resource to be cancelled.
        *     name: 'operations/.*',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {}
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {}
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
      def cancel(params: ParamsResourceOperationsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def cancel(
        params: ParamsResourceOperationsCancel,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      def delete(): GaxiosPromise[SchemaEmpty] = js.native
      def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceOperationsDelete): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceOperationsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(
        params: ParamsResourceOperationsDelete,
        options: BodyResponseCallback[Readable | SchemaEmpty],
        callback: BodyResponseCallback[Readable | SchemaEmpty]
      ): Unit = js.native
      def delete(params: ParamsResourceOperationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(
        params: ParamsResourceOperationsDelete,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      /**
        * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const firebasehosting = google.firebasehosting('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await firebasehosting.operations.delete({
        *     // The name of the operation resource to be deleted.
        *     name: 'operations/.*',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {}
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
      def delete(params: ParamsResourceOperationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def delete(
        params: ParamsResourceOperationsDelete,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(params: ParamsResourceOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(params: ParamsResourceOperationsList, callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
      def list(
        params: ParamsResourceOperationsList,
        options: BodyResponseCallback[Readable | SchemaListOperationsResponse],
        callback: BodyResponseCallback[Readable | SchemaListOperationsResponse]
      ): Unit = js.native
      def list(params: ParamsResourceOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(
        params: ParamsResourceOperationsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListOperationsResponse]
      ): Unit = js.native
      /**
        * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services to override the binding to use different resource name schemes, such as `users/x/operations`. To override the binding, API services can add a binding such as `"/v1/{name=users/x\}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection id.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const firebasehosting = google.firebasehosting('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await firebasehosting.operations.list({
        *     // The standard list filter.
        *     filter: 'placeholder-value',
        *     // The name of the operation's parent resource.
        *     name: 'operations',
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
      def list(params: ParamsResourceOperationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceOperationsList,
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
    
    trait ParamsResourceOperationsCancel
      extends StObject
         with StandardParameters {
      
      /**
        * The name of the operation resource to be cancelled.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaCancelOperationRequest] = js.undefined
    }
    object ParamsResourceOperationsCancel {
      
      inline def apply(): ParamsResourceOperationsCancel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceOperationsCancel]
      }
      
      extension [Self <: ParamsResourceOperationsCancel](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRequestBody(value: SchemaCancelOperationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceOperationsDelete
      extends StObject
         with StandardParameters {
      
      /**
        * The name of the operation resource to be deleted.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceOperationsDelete {
      
      inline def apply(): ParamsResourceOperationsDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceOperationsDelete]
      }
      
      extension [Self <: ParamsResourceOperationsDelete](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceOperationsList
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
    object ParamsResourceOperationsList {
      
      inline def apply(): ParamsResourceOperationsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceOperationsList]
      }
      
      extension [Self <: ParamsResourceOperationsList](x: Self) {
        
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
    
    trait SchemaCancelOperationRequest extends StObject
    
    trait SchemaEmpty extends StObject
    
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
