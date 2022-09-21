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

object cloudtraceV1Mod {
  
  object cloudtraceV1 {
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Cloudtrace")
    @js.native
    open class Cloudtrace protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def patchTraces(): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def patchTraces(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(params: ParamsResourceProjectsPatchtraces): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(params: ParamsResourceProjectsPatchtraces, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def patchTraces(
        params: ParamsResourceProjectsPatchtraces,
        options: BodyResponseCallback[Readable | SchemaEmpty],
        callback: BodyResponseCallback[Readable | SchemaEmpty]
      ): Unit = js.native
      def patchTraces(params: ParamsResourceProjectsPatchtraces, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(
        params: ParamsResourceProjectsPatchtraces,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      /**
        * Sends new traces to Cloud Trace or updates existing traces. If the ID of a trace that you send matches that of an existing trace, any fields in the existing trace and its spans are overwritten by the provided values, and any new fields provided are merged with the existing trace data. If the ID does not match, a new trace is created.
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
        * const cloudtrace = google.cloudtrace('v1');
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
        *   const res = await cloudtrace.projects.patchTraces({
        *     // Required. ID of the Cloud project where the trace data is stored.
        *     projectId: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "traces": []
        *       // }
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
      def patchTraces(params: ParamsResourceProjectsPatchtraces, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def patchTraces(
        params: ParamsResourceProjectsPatchtraces,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var traces: ResourceProjectsTraces = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Resource$Projects$Traces")
    @js.native
    open class ResourceProjectsTraces protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaTrace] = js.native
      def get(callback: BodyResponseCallback[SchemaTrace]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrace] = js.native
      def get(params: ParamsResourceProjectsTracesGet): GaxiosPromise[SchemaTrace] = js.native
      def get(params: ParamsResourceProjectsTracesGet, callback: BodyResponseCallback[SchemaTrace]): Unit = js.native
      def get(
        params: ParamsResourceProjectsTracesGet,
        options: BodyResponseCallback[Readable | SchemaTrace],
        callback: BodyResponseCallback[Readable | SchemaTrace]
      ): Unit = js.native
      def get(params: ParamsResourceProjectsTracesGet, options: MethodOptions): GaxiosPromise[SchemaTrace] = js.native
      def get(
        params: ParamsResourceProjectsTracesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaTrace]
      ): Unit = js.native
      /**
        * Gets a single trace by its ID.
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
        * const cloudtrace = google.cloudtrace('v1');
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
        *   const res = await cloudtrace.projects.traces.get({
        *     // Required. ID of the Cloud project where the trace data is stored.
        *     projectId: 'placeholder-value',
        *     // Required. ID of the trace to return.
        *     traceId: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "projectId": "my_projectId",
        *   //   "spans": [],
        *   //   "traceId": "my_traceId"
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
      def get(params: ParamsResourceProjectsTracesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceProjectsTracesGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListTracesResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(params: ParamsResourceProjectsTracesList): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(params: ParamsResourceProjectsTracesList, callback: BodyResponseCallback[SchemaListTracesResponse]): Unit = js.native
      def list(
        params: ParamsResourceProjectsTracesList,
        options: BodyResponseCallback[Readable | SchemaListTracesResponse],
        callback: BodyResponseCallback[Readable | SchemaListTracesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceProjectsTracesList, options: MethodOptions): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(
        params: ParamsResourceProjectsTracesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListTracesResponse]
      ): Unit = js.native
      /**
        * Returns a list of traces that match the specified filter conditions.
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
        * const cloudtrace = google.cloudtrace('v1');
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
        *   const res = await cloudtrace.projects.traces.list({
        *     // End of the time interval (inclusive) during which the trace data was collected from the application.
        *     endTime: 'placeholder-value',
        *     // Optional. A filter against labels for the request. By default, searches use prefix matching. To specify exact match, prepend a plus symbol (`+`) to the search term. Multiple terms are ANDed. Syntax: * `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root span starts with `NAME_PREFIX`. * `+root:NAME` or `+NAME`: Return traces where any root span's name is exactly `NAME`. * `span:NAME_PREFIX`: Return traces where any span starts with `NAME_PREFIX`. * `+span:NAME`: Return traces where any span's name is exactly `NAME`. * `latency:DURATION`: Return traces whose overall latency is greater or equal to than `DURATION`. Accepted units are nanoseconds (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For example, `latency:24ms` returns traces whose overall latency is greater than or equal to 24 milliseconds. * `label:LABEL_KEY`: Return all traces containing the specified label key (exact match, case-sensitive) regardless of the key:value pair's value (including empty values). * `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified label key (exact match, case-sensitive) whose value starts with `VALUE_PREFIX`. Both a key and a value must be specified. * `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair exactly matching the specified text. Both a key and a value must be specified. * `method:VALUE`: Equivalent to `/http/method:VALUE`. * `url:VALUE`: Equivalent to `/http/url:VALUE`.
        *     filter: 'placeholder-value',
        *     // Optional. Field used to sort the returned traces. Can be one of the following: * `trace_id` * `name` (`name` field of root span in the trace) * `duration` (difference between `end_time` and `start_time` fields of the root span) * `start` (`start_time` field of the root span) Descending order can be specified by appending `desc` to the sort field (for example, `name desc`). Only one sort field is permitted.
        *     orderBy: 'placeholder-value',
        *     // Optional. Maximum number of traces to return. If not specified or <= 0, the implementation selects a reasonable value. The implementation may return fewer traces than the requested page size.
        *     pageSize: 'placeholder-value',
        *     // Token identifying the page of results to return. If provided, use the value of the `next_page_token` field from a previous request.
        *     pageToken: 'placeholder-value',
        *     // Required. ID of the Cloud project where the trace data is stored.
        *     projectId: 'placeholder-value',
        *     // Start of the time interval (inclusive) during which the trace data was collected from the application.
        *     startTime: 'placeholder-value',
        *     // Optional. Type of data returned for traces in the list. Default is `MINIMAL`.
        *     view: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "nextPageToken": "my_nextPageToken",
        *   //   "traces": []
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
      def list(params: ParamsResourceProjectsTracesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceProjectsTracesList,
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
    
    trait ParamsResourceProjectsPatchtraces
      extends StObject
         with StandardParameters {
      
      /**
        * Required. ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaTraces] = js.undefined
    }
    object ParamsResourceProjectsPatchtraces {
      
      inline def apply(): ParamsResourceProjectsPatchtraces = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsPatchtraces]
      }
      
      extension [Self <: ParamsResourceProjectsPatchtraces](x: Self) {
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        inline def setRequestBody(value: SchemaTraces): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsTracesGet
      extends StObject
         with StandardParameters {
      
      /**
        * Required. ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String] = js.undefined
      
      /**
        * Required. ID of the trace to return.
        */
      var traceId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsTracesGet {
      
      inline def apply(): ParamsResourceProjectsTracesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesGet]
      }
      
      extension [Self <: ParamsResourceProjectsTracesGet](x: Self) {
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
        
        inline def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsTracesList
      extends StObject
         with StandardParameters {
      
      /**
        * End of the time interval (inclusive) during which the trace data was collected from the application.
        */
      var endTime: js.UndefOr[String] = js.undefined
      
      /**
        * Optional. A filter against labels for the request. By default, searches use prefix matching. To specify exact match, prepend a plus symbol (`+`) to the search term. Multiple terms are ANDed. Syntax: * `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root span starts with `NAME_PREFIX`. * `+root:NAME` or `+NAME`: Return traces where any root span's name is exactly `NAME`. * `span:NAME_PREFIX`: Return traces where any span starts with `NAME_PREFIX`. * `+span:NAME`: Return traces where any span's name is exactly `NAME`. * `latency:DURATION`: Return traces whose overall latency is greater or equal to than `DURATION`. Accepted units are nanoseconds (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For example, `latency:24ms` returns traces whose overall latency is greater than or equal to 24 milliseconds. * `label:LABEL_KEY`: Return all traces containing the specified label key (exact match, case-sensitive) regardless of the key:value pair's value (including empty values). * `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified label key (exact match, case-sensitive) whose value starts with `VALUE_PREFIX`. Both a key and a value must be specified. * `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair exactly matching the specified text. Both a key and a value must be specified. * `method:VALUE`: Equivalent to `/http/method:VALUE`. * `url:VALUE`: Equivalent to `/http/url:VALUE`.
        */
      var filter: js.UndefOr[String] = js.undefined
      
      /**
        * Optional. Field used to sort the returned traces. Can be one of the following: * `trace_id` * `name` (`name` field of root span in the trace) * `duration` (difference between `end_time` and `start_time` fields of the root span) * `start` (`start_time` field of the root span) Descending order can be specified by appending `desc` to the sort field (for example, `name desc`). Only one sort field is permitted.
        */
      var orderBy: js.UndefOr[String] = js.undefined
      
      /**
        * Optional. Maximum number of traces to return. If not specified or <= 0, the implementation selects a reasonable value. The implementation may return fewer traces than the requested page size.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * Token identifying the page of results to return. If provided, use the value of the `next_page_token` field from a previous request.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String] = js.undefined
      
      /**
        * Start of the time interval (inclusive) during which the trace data was collected from the application.
        */
      var startTime: js.UndefOr[String] = js.undefined
      
      /**
        * Optional. Type of data returned for traces in the list. Default is `MINIMAL`.
        */
      var view: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsTracesList {
      
      inline def apply(): ParamsResourceProjectsTracesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesList]
      }
      
      extension [Self <: ParamsResourceProjectsTracesList](x: Self) {
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      }
    }
    
    trait SchemaEmpty extends StObject
    
    trait SchemaListTracesResponse extends StObject {
      
      /**
        * If defined, indicates that there are more traces that match the request and that this value should be passed to the next request to continue retrieving additional traces.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
      
      /**
        * List of trace records as specified by the view parameter.
        */
      var traces: js.UndefOr[js.Array[SchemaTrace]] = js.undefined
    }
    object SchemaListTracesResponse {
      
      inline def apply(): SchemaListTracesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListTracesResponse]
      }
      
      extension [Self <: SchemaListTracesResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTraces(value: js.Array[SchemaTrace]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
        
        inline def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
        
        inline def setTracesVarargs(value: SchemaTrace*): Self = StObject.set(x, "traces", js.Array(value*))
      }
    }
    
    trait SchemaTrace extends StObject {
      
      /**
        * Project ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Collection of spans in the trace.
        */
      var spans: js.UndefOr[js.Array[SchemaTraceSpan]] = js.undefined
      
      /**
        * Globally unique identifier for the trace. This identifier is a 128-bit numeric value formatted as a 32-byte hex string. For example, `382d4f4c6b7bb2f4a972559d9085001d`. The numeric value should not be zero.
        */
      var traceId: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaTrace {
      
      inline def apply(): SchemaTrace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTrace]
      }
      
      extension [Self <: SchemaTrace](x: Self) {
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        inline def setSpans(value: js.Array[SchemaTraceSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
        
        inline def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
        
        inline def setSpansVarargs(value: SchemaTraceSpan*): Self = StObject.set(x, "spans", js.Array(value*))
        
        inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
        
        inline def setTraceIdNull: Self = StObject.set(x, "traceId", null)
        
        inline def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
      }
    }
    
    trait SchemaTraceSpan extends StObject {
      
      /**
        * End time of the span in nanoseconds from the UNIX epoch.
        */
      var endTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Distinguishes between spans generated in a particular context. For example, two spans with the same name may be distinguished using `RPC_CLIENT` and `RPC_SERVER` to identify queueing latency associated with the span.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Collection of labels associated with the span. Label keys must be less than 128 bytes. Label values must be less than 16 kilobytes (10MB for `/stacktrace` values). Some predefined label keys exist, or you may create your own. When creating your own, we recommend the following formats: * `/category/product/key` for agents of well-known products (e.g. `/db/mongodb/read_size`). * `short_host/path/key` for domain-specific keys (e.g. `foo.com/myproduct/bar`) Predefined labels include: * `/agent` * `/component` * `/error/message` * `/error/name` * `/http/client_city` * `/http/client_country` * `/http/client_protocol` * `/http/client_region` * `/http/host` * `/http/method` * `/http/path` * `/http/redirected_url` * `/http/request/size` * `/http/response/size` * `/http/route` * `/http/status_code` * `/http/url` * `/http/user_agent` * `/pid` * `/stacktrace` * `/tid`
        */
      var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
      
      /**
        * Name of the span. Must be less than 128 bytes. The span name is sanitized and displayed in the Trace tool in the Google Cloud Platform Console. The name may be a method name or some other per-call site name. For the same executable and the same call point, a best practice is to use a consistent name, which makes it easier to correlate cross-trace spans.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Optional. ID of the parent span, if any.
        */
      var parentSpanId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Identifier for the span. Must be a 64-bit integer other than 0 and unique within a trace. For example, `2205310701640571284`.
        */
      var spanId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Start time of the span in nanoseconds from the UNIX epoch.
        */
      var startTime: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaTraceSpan {
      
      inline def apply(): SchemaTraceSpan = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTraceSpan]
      }
      
      extension [Self <: SchemaTraceSpan](x: Self) {
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsNull: Self = StObject.set(x, "labels", null)
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
        
        inline def setParentSpanIdNull: Self = StObject.set(x, "parentSpanId", null)
        
        inline def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
        
        inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
        
        inline def setSpanIdNull: Self = StObject.set(x, "spanId", null)
        
        inline def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    trait SchemaTraces extends StObject {
      
      /**
        * List of traces.
        */
      var traces: js.UndefOr[js.Array[SchemaTrace]] = js.undefined
    }
    object SchemaTraces {
      
      inline def apply(): SchemaTraces = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTraces]
      }
      
      extension [Self <: SchemaTraces](x: Self) {
        
        inline def setTraces(value: js.Array[SchemaTrace]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
        
        inline def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
        
        inline def setTracesVarargs(value: SchemaTrace*): Self = StObject.set(x, "traces", js.Array(value*))
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
