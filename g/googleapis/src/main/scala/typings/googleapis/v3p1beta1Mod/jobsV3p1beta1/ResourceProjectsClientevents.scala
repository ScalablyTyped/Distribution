package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v3p1beta1", "jobs_v3p1beta1.Resource$Projects$Clientevents")
@js.native
open class ResourceProjectsClientevents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaClientEvent] = js.native
  def create(callback: BodyResponseCallback[SchemaClientEvent]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientEvent] = js.native
  def create(params: ParamsResourceProjectsClienteventsCreate): GaxiosPromise[SchemaClientEvent] = js.native
  def create(
    params: ParamsResourceProjectsClienteventsCreate,
    callback: BodyResponseCallback[SchemaClientEvent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsClienteventsCreate,
    options: BodyResponseCallback[Readable | SchemaClientEvent],
    callback: BodyResponseCallback[Readable | SchemaClientEvent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsClienteventsCreate, options: MethodOptions): GaxiosPromise[SchemaClientEvent] = js.native
  def create(
    params: ParamsResourceProjectsClienteventsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientEvent]
  ): Unit = js.native
  /**
    * Report events issued when end user interacts with customer's application that uses Cloud Talent Solution. You may inspect the created events in [self service tools](https://console.cloud.google.com/talent-solution/overview). [Learn more](https://cloud.google.com/talent-solution/docs/management-tools) about self service tools.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3p1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.clientEvents.create({
    *     // Parent project name.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientEvent": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "eventId": "my_eventId",
    *   //   "extraInfo": {},
    *   //   "jobEvent": {},
    *   //   "parentEventId": "my_parentEventId",
    *   //   "requestId": "my_requestId"
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
  def create(params: ParamsResourceProjectsClienteventsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsClienteventsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
