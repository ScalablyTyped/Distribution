package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gkehub/v1alpha2", "gkehub_v1alpha2.Resource$Projects$Locations$Global$Memberships")
@js.native
open class ResourceProjectsLocationsGlobalMemberships protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def initializeHub(): GaxiosPromise[SchemaInitializeHubResponse] = js.native
  def initializeHub(callback: BodyResponseCallback[SchemaInitializeHubResponse]): Unit = js.native
  def initializeHub(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInitializeHubResponse] = js.native
  def initializeHub(params: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub): GaxiosPromise[SchemaInitializeHubResponse] = js.native
  def initializeHub(
    params: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub,
    callback: BodyResponseCallback[SchemaInitializeHubResponse]
  ): Unit = js.native
  def initializeHub(
    params: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub,
    options: BodyResponseCallback[Readable | SchemaInitializeHubResponse],
    callback: BodyResponseCallback[Readable | SchemaInitializeHubResponse]
  ): Unit = js.native
  def initializeHub(params: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub, options: MethodOptions): GaxiosPromise[SchemaInitializeHubResponse] = js.native
  def initializeHub(
    params: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInitializeHubResponse]
  ): Unit = js.native
  /**
    * Initializes the Hub in this project, which includes creating the default Hub Service Account and the Hub Workload Identity Pool. Initialization is optional, and happens automatically when the first Membership is created. InitializeHub should be called when the first Membership cannot be registered without these resources. A common example is granting the Hub Service Account access to another project, which requires the account to exist first.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gkehub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gkehub = google.gkehub('v1alpha2');
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
    *   const res = await gkehub.projects.locations.global.memberships.initializeHub({
    *     // Required. The Hub to initialize, in the format `projects/x/locations/x/memberships/x`.
    *     project: 'projects/my-project/locations/global/memberships',
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
    *   // {
    *   //   "serviceIdentity": "my_serviceIdentity",
    *   //   "workloadIdentityPool": "my_workloadIdentityPool"
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
  def initializeHub(
    params: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def initializeHub(
    params: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
