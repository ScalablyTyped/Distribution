package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1alpha", "osconfig_v1alpha.Resource$Projects$Locations$Instanceospoliciescompliances")
@js.native
open class ResourceProjectsLocationsInstanceospoliciescompliances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaInstanceOSPoliciesCompliance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstanceOSPoliciesCompliance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstanceOSPoliciesCompliance] = js.native
  def get(params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet): GaxiosPromise[SchemaInstanceOSPoliciesCompliance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet,
    callback: BodyResponseCallback[SchemaInstanceOSPoliciesCompliance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet,
    options: BodyResponseCallback[Readable | SchemaInstanceOSPoliciesCompliance],
    callback: BodyResponseCallback[Readable | SchemaInstanceOSPoliciesCompliance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet, options: MethodOptions): GaxiosPromise[SchemaInstanceOSPoliciesCompliance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceOSPoliciesCompliance]
  ): Unit = js.native
  /**
    * Get OS policies compliance data for the specified Compute Engine VM instance.
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
    * const osconfig = google.osconfig('v1alpha');
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
    *   const res =
    *     await osconfig.projects.locations.instanceOSPoliciesCompliances.get({
    *       // Required. API resource name for instance OS policies compliance resource. Format: `projects/{project\}/locations/{location\}/instanceOSPoliciesCompliances/{instance\}` For `{project\}`, either Compute Engine project-number or project-id can be provided. For `{instance\}`, either Compute Engine VM instance-id or instance-name can be provided.
    *       name: 'projects/my-project/locations/my-location/instanceOSPoliciesCompliances/my-instanceOSPoliciesCompliance',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "detailedState": "my_detailedState",
    *   //   "detailedStateReason": "my_detailedStateReason",
    *   //   "instance": "my_instance",
    *   //   "lastComplianceCheckTime": "my_lastComplianceCheckTime",
    *   //   "lastComplianceRunId": "my_lastComplianceRunId",
    *   //   "name": "my_name",
    *   //   "osPolicyCompliances": [],
    *   //   "state": "my_state"
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
  def get(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInstanceOSPoliciesCompliancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstanceOSPoliciesCompliancesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInstanceOSPoliciesCompliancesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesList): GaxiosPromise[SchemaListInstanceOSPoliciesCompliancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesList,
    callback: BodyResponseCallback[SchemaListInstanceOSPoliciesCompliancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesList,
    options: BodyResponseCallback[Readable | SchemaListInstanceOSPoliciesCompliancesResponse],
    callback: BodyResponseCallback[Readable | SchemaListInstanceOSPoliciesCompliancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesList, options: MethodOptions): GaxiosPromise[SchemaListInstanceOSPoliciesCompliancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstanceOSPoliciesCompliancesResponse]
  ): Unit = js.native
  /**
    * List OS policies compliance data for all Compute Engine VM instances in the specified zone.
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
    * const osconfig = google.osconfig('v1alpha');
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
    *   const res =
    *     await osconfig.projects.locations.instanceOSPoliciesCompliances.list({
    *       // If provided, this field specifies the criteria that must be met by a `InstanceOSPoliciesCompliance` API resource to be included in the response.
    *       filter: 'placeholder-value',
    *       // The maximum number of results to return.
    *       pageSize: 'placeholder-value',
    *       // A pagination token returned from a previous call to `ListInstanceOSPoliciesCompliances` that indicates where this listing should continue from.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent resource name. Format: `projects/{project\}/locations/{location\}` For `{project\}`, either Compute Engine project-number or project-id can be provided.
    *       parent: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "instanceOsPoliciesCompliances": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstanceospoliciescompliancesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
