package typings.googleapis.cloudtraceV1Mod.cloudtraceV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var traces: ResourceProjectsTraces = js.native
  /**
    * cloudtrace.projects.patchTraces
    * @desc Sends new traces to Stackdriver Trace or updates existing traces.
    * If the ID of a trace that you send matches that of an existing trace, any
    * fields in the existing trace and its spans are overwritten by the
    * provided values, and any new fields provided are merged with the existing
    * trace data. If the ID does not match, a new trace is created.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Trace API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtrace
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudTrace = google.cloudtrace('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // ID of the Cloud project where the trace data is stored.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTrace.projects.patchTraces(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudtrace.projects.patchTraces
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the Cloud project where the trace data is stored.
    * @param {().Traces} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patchTraces(): GaxiosPromise[SchemaEmpty] = js.native
  def patchTraces(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def patchTraces(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def patchTraces(params: ParamsResourceProjectsPatchtraces): GaxiosPromise[SchemaEmpty] = js.native
  def patchTraces(params: ParamsResourceProjectsPatchtraces, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def patchTraces(
    params: ParamsResourceProjectsPatchtraces,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def patchTraces(params: ParamsResourceProjectsPatchtraces, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def patchTraces(
    params: ParamsResourceProjectsPatchtraces,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

