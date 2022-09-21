package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Resource$Projects$Workers")
@js.native
open class ResourceProjectsWorkers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def checkIn(): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(callback: BodyResponseCallback[SchemaCheckInResponse]): Unit = js.native
  def checkIn(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(params: ParamsResourceProjectsWorkersCheckin): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(
    params: ParamsResourceProjectsWorkersCheckin,
    callback: BodyResponseCallback[SchemaCheckInResponse]
  ): Unit = js.native
  def checkIn(
    params: ParamsResourceProjectsWorkersCheckin,
    options: BodyResponseCallback[Readable | SchemaCheckInResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckInResponse]
  ): Unit = js.native
  def checkIn(params: ParamsResourceProjectsWorkersCheckin, options: MethodOptions): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(
    params: ParamsResourceProjectsWorkersCheckin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckInResponse]
  ): Unit = js.native
  /**
    * The worker uses this method to retrieve the assigned operation and provide periodic status updates.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/genomics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v2alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/genomics',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await genomics.projects.workers.checkIn({
    *     // The VM identity token for authenticating the VM instance. https://cloud.google.com/compute/docs/instances/verifying-instance-identity
    *     id: 'projects/my-project/workers/my-worker',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deadlineExpired": {},
    *       //   "event": {},
    *       //   "events": [],
    *       //   "result": {},
    *       //   "sosReport": "my_sosReport",
    *       //   "workerStatus": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deadline": "my_deadline",
    *   //   "features": {},
    *   //   "metadata": {}
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
  def checkIn(params: ParamsResourceProjectsWorkersCheckin, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def checkIn(
    params: ParamsResourceProjectsWorkersCheckin,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
