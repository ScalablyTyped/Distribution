package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1beta", "osconfig_v1beta.Resource$Projects$Zones$Instances")
@js.native
open class ResourceProjectsZonesInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def lookupEffectiveGuestPolicy(): GaxiosPromise[SchemaEffectiveGuestPolicy] = js.native
  def lookupEffectiveGuestPolicy(callback: BodyResponseCallback[SchemaEffectiveGuestPolicy]): Unit = js.native
  def lookupEffectiveGuestPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEffectiveGuestPolicy] = js.native
  def lookupEffectiveGuestPolicy(params: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy): GaxiosPromise[SchemaEffectiveGuestPolicy] = js.native
  def lookupEffectiveGuestPolicy(
    params: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy,
    callback: BodyResponseCallback[SchemaEffectiveGuestPolicy]
  ): Unit = js.native
  def lookupEffectiveGuestPolicy(
    params: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy,
    options: BodyResponseCallback[Readable | SchemaEffectiveGuestPolicy],
    callback: BodyResponseCallback[Readable | SchemaEffectiveGuestPolicy]
  ): Unit = js.native
  def lookupEffectiveGuestPolicy(params: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy, options: MethodOptions): GaxiosPromise[SchemaEffectiveGuestPolicy] = js.native
  def lookupEffectiveGuestPolicy(
    params: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEffectiveGuestPolicy]
  ): Unit = js.native
  /**
    * Lookup the effective guest policy that applies to a VM instance. This lookup merges all policies that are assigned to the instance ancestry.
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
    * const osconfig = google.osconfig('v1beta');
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
    *     await osconfig.projects.zones.instances.lookupEffectiveGuestPolicy({
    *       // Required. The VM instance whose policies are being looked up.
    *       instance: 'projects/my-project/zones/my-zone/instances/my-instance',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "osArchitecture": "my_osArchitecture",
    *         //   "osShortName": "my_osShortName",
    *         //   "osVersion": "my_osVersion"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "packageRepositories": [],
    *   //   "packages": [],
    *   //   "softwareRecipes": []
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
  def lookupEffectiveGuestPolicy(
    params: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def lookupEffectiveGuestPolicy(
    params: ParamsResourceProjectsZonesInstancesLookupeffectiveguestpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
