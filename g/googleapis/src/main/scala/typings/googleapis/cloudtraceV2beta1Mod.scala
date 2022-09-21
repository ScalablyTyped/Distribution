package typings.googleapis

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

object cloudtraceV2beta1Mod {
  
  object cloudtraceV2beta1 {
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v2beta1", "cloudtrace_v2beta1.Cloudtrace")
    @js.native
    open class Cloudtrace protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v2beta1", "cloudtrace_v2beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var traceSinks: ResourceProjectsTracesinks = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v2beta1", "cloudtrace_v2beta1.Resource$Projects$Tracesinks")
    @js.native
    open class ResourceProjectsTracesinks protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def create(): GaxiosPromise[SchemaTraceSink] = js.native
      def create(callback: BodyResponseCallback[SchemaTraceSink]): Unit = js.native
      def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTraceSink] = js.native
      def create(params: ParamsResourceProjectsTracesinksCreate): GaxiosPromise[SchemaTraceSink] = js.native
      def create(params: ParamsResourceProjectsTracesinksCreate, callback: BodyResponseCallback[SchemaTraceSink]): Unit = js.native
      def create(
        params: ParamsResourceProjectsTracesinksCreate,
        options: BodyResponseCallback[Readable | SchemaTraceSink],
        callback: BodyResponseCallback[Readable | SchemaTraceSink]
      ): Unit = js.native
      def create(params: ParamsResourceProjectsTracesinksCreate, options: MethodOptions): GaxiosPromise[SchemaTraceSink] = js.native
      def create(
        params: ParamsResourceProjectsTracesinksCreate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaTraceSink]
      ): Unit = js.native
      /**
        * Creates a sink that exports trace spans to a destination. The export of newly-ingested traces begins immediately, unless the sink's `writer_identity` is not permitted to write to the destination. A sink can export traces only from the resource owning the sink (the 'parent').
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudtrace.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudtrace = google.cloudtrace('v2beta1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/trace.append',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudtrace.projects.traceSinks.create({
        *     // Required. The resource in which to create the sink (currently only project sinks are supported): "projects/[PROJECT_ID]" Examples: `"projects/my-trace-project"`, `"projects/123456789"`.
        *     parent: 'projects/my-project',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "name": "my_name",
        *       //   "outputConfig": {},
        *       //   "writerIdentity": "my_writerIdentity"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "name": "my_name",
        *   //   "outputConfig": {},
        *   //   "writerIdentity": "my_writerIdentity"
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
      def create(params: ParamsResourceProjectsTracesinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def create(
        params: ParamsResourceProjectsTracesinksCreate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def delete(): GaxiosPromise[SchemaEmpty] = js.native
      def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceProjectsTracesinksDelete): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceProjectsTracesinksDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(
        params: ParamsResourceProjectsTracesinksDelete,
        options: BodyResponseCallback[Readable | SchemaEmpty],
        callback: BodyResponseCallback[Readable | SchemaEmpty]
      ): Unit = js.native
      def delete(params: ParamsResourceProjectsTracesinksDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(
        params: ParamsResourceProjectsTracesinksDelete,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      /**
        * Deletes a sink.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudtrace.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudtrace = google.cloudtrace('v2beta1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/trace.append',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudtrace.projects.traceSinks.delete({
        *     // Required. The full resource name of the sink to delete, including the parent resource and the sink identifier: "projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]" Example: `"projects/12345/traceSinks/my-sink-id"`.
        *     name: 'projects/my-project/traceSinks/my-traceSink',
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
      def delete(params: ParamsResourceProjectsTracesinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def delete(
        params: ParamsResourceProjectsTracesinksDelete,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def get(): GaxiosPromise[SchemaTraceSink] = js.native
      def get(callback: BodyResponseCallback[SchemaTraceSink]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTraceSink] = js.native
      def get(params: ParamsResourceProjectsTracesinksGet): GaxiosPromise[SchemaTraceSink] = js.native
      def get(params: ParamsResourceProjectsTracesinksGet, callback: BodyResponseCallback[SchemaTraceSink]): Unit = js.native
      def get(
        params: ParamsResourceProjectsTracesinksGet,
        options: BodyResponseCallback[Readable | SchemaTraceSink],
        callback: BodyResponseCallback[Readable | SchemaTraceSink]
      ): Unit = js.native
      def get(params: ParamsResourceProjectsTracesinksGet, options: MethodOptions): GaxiosPromise[SchemaTraceSink] = js.native
      def get(
        params: ParamsResourceProjectsTracesinksGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaTraceSink]
      ): Unit = js.native
      /**
        * Get a trace sink by name under the parent resource (GCP project).
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudtrace.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudtrace = google.cloudtrace('v2beta1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/trace.readonly',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudtrace.projects.traceSinks.get({
        *     // Required. The resource name of the sink: "projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]" Example: `"projects/12345/traceSinks/my-sink-id"`.
        *     name: 'projects/my-project/traceSinks/my-traceSink',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "name": "my_name",
        *   //   "outputConfig": {},
        *   //   "writerIdentity": "my_writerIdentity"
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
      def get(params: ParamsResourceProjectsTracesinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceProjectsTracesinksGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaListTraceSinksResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListTraceSinksResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTraceSinksResponse] = js.native
      def list(params: ParamsResourceProjectsTracesinksList): GaxiosPromise[SchemaListTraceSinksResponse] = js.native
      def list(
        params: ParamsResourceProjectsTracesinksList,
        callback: BodyResponseCallback[SchemaListTraceSinksResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceProjectsTracesinksList,
        options: BodyResponseCallback[Readable | SchemaListTraceSinksResponse],
        callback: BodyResponseCallback[Readable | SchemaListTraceSinksResponse]
      ): Unit = js.native
      def list(params: ParamsResourceProjectsTracesinksList, options: MethodOptions): GaxiosPromise[SchemaListTraceSinksResponse] = js.native
      def list(
        params: ParamsResourceProjectsTracesinksList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListTraceSinksResponse]
      ): Unit = js.native
      /**
        * List all sinks for the parent resource (GCP project).
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudtrace.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudtrace = google.cloudtrace('v2beta1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/trace.readonly',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudtrace.projects.traceSinks.list({
        *     // Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available.
        *     pageSize: 'placeholder-value',
        *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of other method parameters should be identical to those in the previous call.
        *     pageToken: 'placeholder-value',
        *     // Required. The parent resource whose sinks are to be listed (currently only project parent resources are supported): "projects/[PROJECT_ID]"
        *     parent: 'projects/my-project',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "nextPageToken": "my_nextPageToken",
        *   //   "sinks": []
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
      def list(params: ParamsResourceProjectsTracesinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceProjectsTracesinksList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def patch(): GaxiosPromise[SchemaTraceSink] = js.native
      def patch(callback: BodyResponseCallback[SchemaTraceSink]): Unit = js.native
      def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTraceSink] = js.native
      def patch(params: ParamsResourceProjectsTracesinksPatch): GaxiosPromise[SchemaTraceSink] = js.native
      def patch(params: ParamsResourceProjectsTracesinksPatch, callback: BodyResponseCallback[SchemaTraceSink]): Unit = js.native
      def patch(
        params: ParamsResourceProjectsTracesinksPatch,
        options: BodyResponseCallback[Readable | SchemaTraceSink],
        callback: BodyResponseCallback[Readable | SchemaTraceSink]
      ): Unit = js.native
      def patch(params: ParamsResourceProjectsTracesinksPatch, options: MethodOptions): GaxiosPromise[SchemaTraceSink] = js.native
      def patch(
        params: ParamsResourceProjectsTracesinksPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaTraceSink]
      ): Unit = js.native
      /**
        * Updates a sink. This method updates fields in the existing sink according to the provided update mask. The sink's name cannot be changed nor any output-only fields (e.g. the writer_identity).
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudtrace.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudtrace = google.cloudtrace('v2beta1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/trace.append',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudtrace.projects.traceSinks.patch({
        *     // Required. The full resource name of the sink to update, including the parent resource and the sink identifier: "projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]" Example: `"projects/12345/traceSinks/my-sink-id"`.
        *     name: 'projects/my-project/traceSinks/my-traceSink',
        *     // Required. Field mask that specifies the fields in `trace_sink` that are to be updated. A sink field is overwritten if, and only if, it is in the update mask. `name` and `writer_identity` fields cannot be updated. An empty `update_mask` is considered an error. For a detailed `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask Example: `updateMask=output_config`.
        *     updateMask: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "name": "my_name",
        *       //   "outputConfig": {},
        *       //   "writerIdentity": "my_writerIdentity"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "name": "my_name",
        *   //   "outputConfig": {},
        *   //   "writerIdentity": "my_writerIdentity"
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
      def patch(params: ParamsResourceProjectsTracesinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def patch(
        params: ParamsResourceProjectsTracesinksPatch,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
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
    
    trait ParamsResourceProjectsTracesinksCreate
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The resource in which to create the sink (currently only project sinks are supported): "projects/[PROJECT_ID]" Examples: `"projects/my-trace-project"`, `"projects/123456789"`.
        */
      var parent: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaTraceSink] = js.undefined
    }
    object ParamsResourceProjectsTracesinksCreate {
      
      inline def apply(): ParamsResourceProjectsTracesinksCreate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesinksCreate]
      }
      
      extension [Self <: ParamsResourceProjectsTracesinksCreate](x: Self) {
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        inline def setRequestBody(value: SchemaTraceSink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsTracesinksDelete
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The full resource name of the sink to delete, including the parent resource and the sink identifier: "projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]" Example: `"projects/12345/traceSinks/my-sink-id"`.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsTracesinksDelete {
      
      inline def apply(): ParamsResourceProjectsTracesinksDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesinksDelete]
      }
      
      extension [Self <: ParamsResourceProjectsTracesinksDelete](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsTracesinksGet
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The resource name of the sink: "projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]" Example: `"projects/12345/traceSinks/my-sink-id"`.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsTracesinksGet {
      
      inline def apply(): ParamsResourceProjectsTracesinksGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesinksGet]
      }
      
      extension [Self <: ParamsResourceProjectsTracesinksGet](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsTracesinksList
      extends StObject
         with StandardParameters {
      
      /**
        * Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional. If present, then retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of other method parameters should be identical to those in the previous call.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. The parent resource whose sinks are to be listed (currently only project parent resources are supported): "projects/[PROJECT_ID]"
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsTracesinksList {
      
      inline def apply(): ParamsResourceProjectsTracesinksList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesinksList]
      }
      
      extension [Self <: ParamsResourceProjectsTracesinksList](x: Self) {
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsTracesinksPatch
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The full resource name of the sink to update, including the parent resource and the sink identifier: "projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]" Example: `"projects/12345/traceSinks/my-sink-id"`.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaTraceSink] = js.undefined
      
      /**
        * Required. Field mask that specifies the fields in `trace_sink` that are to be updated. A sink field is overwritten if, and only if, it is in the update mask. `name` and `writer_identity` fields cannot be updated. An empty `update_mask` is considered an error. For a detailed `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask Example: `updateMask=output_config`.
        */
      var updateMask: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsTracesinksPatch {
      
      inline def apply(): ParamsResourceProjectsTracesinksPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesinksPatch]
      }
      
      extension [Self <: ParamsResourceProjectsTracesinksPatch](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRequestBody(value: SchemaTraceSink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
        
        inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
      }
    }
    
    trait SchemaEmpty extends StObject
    
    trait SchemaListTraceSinksResponse extends StObject {
      
      /**
        * A paginated response where more pages might be available has `next_page_token` set. To get the next set of results, call the same method again using the value of `next_page_token` as `page_token`.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
      
      /**
        * A list of sinks.
        */
      var sinks: js.UndefOr[js.Array[SchemaTraceSink]] = js.undefined
    }
    object SchemaListTraceSinksResponse {
      
      inline def apply(): SchemaListTraceSinksResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListTraceSinksResponse]
      }
      
      extension [Self <: SchemaListTraceSinksResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSinks(value: js.Array[SchemaTraceSink]): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
        
        inline def setSinksUndefined: Self = StObject.set(x, "sinks", js.undefined)
        
        inline def setSinksVarargs(value: SchemaTraceSink*): Self = StObject.set(x, "sinks", js.Array(value*))
      }
    }
    
    trait SchemaOutputConfig extends StObject {
      
      /**
        * The destination for writing trace data. Supported formats include: "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
        */
      var destination: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaOutputConfig {
      
      inline def apply(): SchemaOutputConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaOutputConfig]
      }
      
      extension [Self <: SchemaOutputConfig](x: Self) {
        
        inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        inline def setDestinationNull: Self = StObject.set(x, "destination", null)
        
        inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      }
    }
    
    trait SchemaTraceSink extends StObject {
      
      /**
        * Required. The canonical sink resource name, unique within the project. Must be of the form: projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Required. The export destination.
        */
      var outputConfig: js.UndefOr[SchemaOutputConfig] = js.undefined
      
      /**
        * Output only. A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and to write data, this account needs the `dataEditor` role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: "service-00000001@00000002.iam.gserviceaccount.com"
        */
      var writerIdentity: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaTraceSink {
      
      inline def apply(): SchemaTraceSink = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTraceSink]
      }
      
      extension [Self <: SchemaTraceSink](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setOutputConfig(value: SchemaOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
        
        inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
        
        inline def setWriterIdentity(value: String): Self = StObject.set(x, "writerIdentity", value.asInstanceOf[js.Any])
        
        inline def setWriterIdentityNull: Self = StObject.set(x, "writerIdentity", null)
        
        inline def setWriterIdentityUndefined: Self = StObject.set(x, "writerIdentity", js.undefined)
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
