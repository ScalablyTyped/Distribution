package typings.googleapis.monitoringV1Mod.monitoringV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v1", "monitoring_v1.Resource$Projects$Location$Prometheus$Api$V1$Metadata")
@js.native
open class ResourceProjectsLocationPrometheusApiV1Metadata protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaHttpBody] = js.native
  def list(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def list(params: ParamsResourceProjectsLocationPrometheusApiV1MetadataList): GaxiosPromise[SchemaHttpBody] = js.native
  def list(
    params: ParamsResourceProjectsLocationPrometheusApiV1MetadataList,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationPrometheusApiV1MetadataList,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationPrometheusApiV1MetadataList, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def list(
    params: ParamsResourceProjectsLocationPrometheusApiV1MetadataList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * Lists metadata for metrics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await monitoring.projects.location.prometheus.api.v1.metadata.list({
    *       // Maximum number of metrics to return.
    *       limit: 'placeholder-value',
    *       // Location of the resource information. Has to be "global" for now.
    *       location: 'placeholder-value',
    *       // The metric name for which to query metadata. If unset, all metric metadata is returned.
    *       metric: 'placeholder-value',
    *       // Required. The workspace on which to execute the request. It is not part of the open source API but used as a request path prefix to distinguish different virtual Prometheus instances of Google Prometheus Engine. The format is: projects/PROJECT_ID_OR_NUMBER.
    *       name: 'projects/my-project',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def list(params: ParamsResourceProjectsLocationPrometheusApiV1MetadataList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationPrometheusApiV1MetadataList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
