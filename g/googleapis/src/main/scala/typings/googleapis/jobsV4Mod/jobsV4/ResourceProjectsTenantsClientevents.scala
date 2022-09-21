package typings.googleapis.jobsV4Mod.jobsV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v4", "jobs_v4.Resource$Projects$Tenants$Clientevents")
@js.native
open class ResourceProjectsTenantsClientevents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaClientEvent] = js.native
  def create(callback: BodyResponseCallback[SchemaClientEvent]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientEvent] = js.native
  def create(params: ParamsResourceProjectsTenantsClienteventsCreate): GaxiosPromise[SchemaClientEvent] = js.native
  def create(
    params: ParamsResourceProjectsTenantsClienteventsCreate,
    callback: BodyResponseCallback[SchemaClientEvent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsTenantsClienteventsCreate,
    options: BodyResponseCallback[Readable | SchemaClientEvent],
    callback: BodyResponseCallback[Readable | SchemaClientEvent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTenantsClienteventsCreate, options: MethodOptions): GaxiosPromise[SchemaClientEvent] = js.native
  def create(
    params: ParamsResourceProjectsTenantsClienteventsCreate,
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
    * const jobs = google.jobs('v4');
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
    *   const res = await jobs.projects.tenants.clientEvents.create({
    *     // Required. Resource name of the tenant under which the event is created. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "eventId": "my_eventId",
    *       //   "eventNotes": "my_eventNotes",
    *       //   "jobEvent": {},
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "eventId": "my_eventId",
    *   //   "eventNotes": "my_eventNotes",
    *   //   "jobEvent": {},
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
  def create(params: ParamsResourceProjectsTenantsClienteventsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTenantsClienteventsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
