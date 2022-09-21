package typings.googleapis.osconfigV1Mod.osconfigV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1", "osconfig_v1.Resource$Projects$Patchjobs$Instancedetails")
@js.native
open class ResourceProjectsPatchjobsInstancedetails protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPatchJobInstanceDetailsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPatchJobInstanceDetailsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPatchJobInstanceDetailsResponse] = js.native
  def list(params: ParamsResourceProjectsPatchjobsInstancedetailsList): GaxiosPromise[SchemaListPatchJobInstanceDetailsResponse] = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsInstancedetailsList,
    callback: BodyResponseCallback[SchemaListPatchJobInstanceDetailsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsInstancedetailsList,
    options: BodyResponseCallback[Readable | SchemaListPatchJobInstanceDetailsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPatchJobInstanceDetailsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsPatchjobsInstancedetailsList, options: MethodOptions): GaxiosPromise[SchemaListPatchJobInstanceDetailsResponse] = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsInstancedetailsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPatchJobInstanceDetailsResponse]
  ): Unit = js.native
  /**
    * Get a list of instance details for a given patch job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await osconfig.projects.patchJobs.instanceDetails.list({
    *     // A filter expression that filters results listed in the response. This field supports filtering results by instance zone, name, state, or `failure_reason`.
    *     filter: 'placeholder-value',
    *     // The maximum number of instance details records to return. Default is 100.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent for the instances are in the form of `projects/x/patchJobs/x`.
    *     parent: 'projects/my-project/patchJobs/my-patchJob',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "patchJobInstanceDetails": []
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
  def list(params: ParamsResourceProjectsPatchjobsInstancedetailsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsInstancedetailsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
