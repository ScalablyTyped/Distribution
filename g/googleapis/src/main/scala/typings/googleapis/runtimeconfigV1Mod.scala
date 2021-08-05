package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeconfigV1Mod {
  
  object runtimeconfigV1 {
    
    @JSImport("googleapis/build/src/apis/runtimeconfig/v1", "runtimeconfig_v1.Resource$Operations")
    @js.native
    class ResourceOperations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * runtimeconfig.operations.cancel
        * @desc Starts asynchronous cancellation on a long-running operation.  The
        * server makes a best effort to cancel the operation, but success is not
        * guaranteed.  If the server doesn't support this method, it returns
        * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use Operations.GetOperation
        * or other methods to check whether the cancellation succeeded or whether
        * the operation completed despite cancellation. On successful cancellation,
        * the operation is not deleted; instead, it becomes an operation with an
        * Operation.error value with a google.rpc.Status.code of 1, corresponding
        * to `Code.CANCELLED`.
        * @alias runtimeconfig.operations.cancel
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the operation resource to be cancelled.
        * @param {().CancelOperationRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def cancel(): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(params: ParamsResourceOperationsCancel): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(params: ParamsResourceOperationsCancel, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def cancel(
        params: ParamsResourceOperationsCancel,
        options: BodyResponseCallback[SchemaEmpty],
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      def cancel(params: ParamsResourceOperationsCancel, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(
        params: ParamsResourceOperationsCancel,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      /**
        * runtimeconfig.operations.delete
        * @desc Deletes a long-running operation. This method indicates that the
        * client is no longer interested in the operation result. It does not
        * cancel the operation. If the server doesn't support this method, it
        * returns `google.rpc.Code.UNIMPLEMENTED`.
        * @alias runtimeconfig.operations.delete
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the operation resource to be deleted.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def delete(): GaxiosPromise[SchemaEmpty] = js.native
      def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceOperationsDelete): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceOperationsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(
        params: ParamsResourceOperationsDelete,
        options: BodyResponseCallback[SchemaEmpty],
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      def delete(params: ParamsResourceOperationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(
        params: ParamsResourceOperationsDelete,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      
      /**
        * runtimeconfig.operations.list
        * @desc Lists operations that match the specified filter in the request. If
        * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
        * the `name` binding allows API services to override the binding to use
        * different resource name schemes, such as `users/x/operations`. To
        * override the binding, API services can add a binding such as
        * `"/v1/{name=users/x}/operations"` to their service configuration. For
        * backwards compatibility, the default name includes the operations
        * collection id, however overriding users must ensure the name binding is
        * the parent resource, without the operations collection id.
        * @alias runtimeconfig.operations.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.filter The standard list filter.
        * @param {string} params.name The name of the operation's parent resource.
        * @param {integer=} params.pageSize The standard list page size.
        * @param {string=} params.pageToken The standard list page token.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(params: ParamsResourceOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(params: ParamsResourceOperationsList, callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
      def list(
        params: ParamsResourceOperationsList,
        options: BodyResponseCallback[SchemaListOperationsResponse],
        callback: BodyResponseCallback[SchemaListOperationsResponse]
      ): Unit = js.native
      def list(params: ParamsResourceOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(
        params: ParamsResourceOperationsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListOperationsResponse]
      ): Unit = js.native
    }
    
    /**
      * Cloud Runtime Configuration API
      *
      * The Runtime Configurator allows you to dynamically configure and expose
      * variables through Google Cloud Platform. In addition, you can also set
      * Watchers and Waiters that will watch for changes to your data and return
      * based on certain conditions.
      *
      * @example
      * const {google} = require('googleapis');
      * const runtimeconfig = google.runtimeconfig('v1');
      *
      * @namespace runtimeconfig
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Runtimeconfig
      */
    @JSImport("googleapis/build/src/apis/runtimeconfig/v1", "runtimeconfig_v1.Runtimeconfig")
    @js.native
    class Runtimeconfig protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var operations: ResourceOperations = js.native
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
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
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
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
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceOperationsList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
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
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
    
    /**
      * The request message for Operations.CancelOperation.
      */
    trait SchemaCancelOperationRequest extends StObject
    
    /**
      * A generic empty message that you can re-use to avoid defining duplicated
      * empty messages in your APIs. A typical example is to use it as the request
      * or the response type of an API method. For instance:      service Foo { rpc
      * Bar(google.protobuf.Empty) returns (google.protobuf.Empty);     }  The JSON
      * representation for `Empty` is empty JSON object `{}`.
      */
    trait SchemaEmpty extends StObject
    
    /**
      * The response message for Operations.ListOperations.
      */
    trait SchemaListOperationsResponse extends StObject {
      
      /**
        * The standard List next-page token.
        */
      var nextPageToken: js.UndefOr[String] = js.undefined
      
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
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
        
        inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
        
        inline def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
      }
    }
    
    /**
      * This resource represents a long-running operation that is the result of a
      * network API call.
      */
    trait SchemaOperation extends StObject {
      
      /**
        * If the value is `false`, it means the operation is still in progress. If
        * `true`, the operation is completed, and either `error` or `response` is
        * available.
        */
      var done: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The error result of the operation in case of failure or cancellation.
        */
      var error: js.UndefOr[SchemaStatus] = js.undefined
      
      /**
        * Service-specific metadata associated with the operation.  It typically
        * contains progress information and common metadata such as create time.
        * Some services might not provide such metadata.  Any method that returns a
        * long-running operation should document the metadata type, if any.
        */
      var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
      
      /**
        * The server-assigned name, which is only unique within the same service
        * that originally returns it. If you use the default HTTP mapping, the
        * `name` should have the format of `operations/some/unique/name`.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The normal response of the operation in case of success.  If the original
        * method returns no data on success, such as `Delete`, the response is
        * `google.protobuf.Empty`.  If the original method is standard
        * `Get`/`Create`/`Update`, the response should be the resource.  For other
        * methods, the response should have the type `XxxResponse`, where `Xxx` is
        * the original method name.  For example, if the original method name is
        * `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
        */
      var response: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    }
    object SchemaOperation {
      
      inline def apply(): SchemaOperation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaOperation]
      }
      
      extension [Self <: SchemaOperation](x: Self) {
        
        inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
        
        inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
        
        inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setResponse(value: StringDictionary[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      }
    }
    
    /**
      * The `Status` type defines a logical error model that is suitable for
      * different programming environments, including REST APIs and RPC APIs. It is
      * used by [gRPC](https://github.com/grpc). The error model is designed to be:
      * - Simple to use and understand for most users - Flexible enough to meet
      * unexpected needs  # Overview  The `Status` message contains three pieces of
      * data: error code, error message, and error details. The error code should
      * be an enum value of google.rpc.Code, but it may accept additional error
      * codes if needed.  The error message should be a developer-facing English
      * message that helps developers *understand* and *resolve* the error. If a
      * localized user-facing error message is needed, put the localized message in
      * the error details or localize it in the client. The optional error details
      * may contain arbitrary information about the error. There is a predefined
      * set of error detail types in the package `google.rpc` that can be used for
      * common error conditions.  # Language mapping  The `Status` message is the
      * logical representation of the error model, but it is not necessarily the
      * actual wire format. When the `Status` message is exposed in different
      * client libraries and different wire protocols, it can be mapped
      * differently. For example, it will likely be mapped to some exceptions in
      * Java, but more likely mapped to some error codes in C.  # Other uses  The
      * error model and the `Status` message can be used in a variety of
      * environments, either with or without APIs, to provide a consistent
      * developer experience across different environments.  Example uses of this
      * error model include:  - Partial errors. If a service needs to return
      * partial errors to the client,     it may embed the `Status` in the normal
      * response to indicate the partial     errors.  - Workflow errors. A typical
      * workflow has multiple steps. Each step may     have a `Status` message for
      * error reporting.  - Batch operations. If a client uses batch request and
      * batch response, the     `Status` message should be used directly inside
      * batch response, one for     each error sub-response.  - Asynchronous
      * operations. If an API call embeds asynchronous operation     results in its
      * response, the status of those operations should be     represented directly
      * using the `Status` message.  - Logging. If some API errors are stored in
      * logs, the message `Status` could     be used directly after any stripping
      * needed for security/privacy reasons.
      */
    trait SchemaStatus extends StObject {
      
      /**
        * The status code, which should be an enum value of google.rpc.Code.
        */
      var code: js.UndefOr[Double] = js.undefined
      
      /**
        * A list of messages that carry the error details.  There is a common set
        * of message types for APIs to use.
        */
      var details: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
      
      /**
        * A developer-facing error message, which should be in English. Any
        * user-facing error message should be localized and sent in the
        * google.rpc.Status.details field, or localized by the client.
        */
      var message: js.UndefOr[String] = js.undefined
    }
    object SchemaStatus {
      
      inline def apply(): SchemaStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaStatus]
      }
      
      extension [Self <: SchemaStatus](x: Self) {
        
        inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setDetails(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        inline def setDetailsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "details", js.Array(value :_*))
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
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
