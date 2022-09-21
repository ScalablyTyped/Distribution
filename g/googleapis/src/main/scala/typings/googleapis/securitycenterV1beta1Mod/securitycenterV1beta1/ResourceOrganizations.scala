package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1beta1", "securitycenter_v1beta1.Resource$Organizations")
@js.native
open class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assets: ResourceOrganizationsAssets = js.native
  
  var context: APIRequestContext = js.native
  
  def getOrganizationSettings(): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(callback: BodyResponseCallback[SchemaOrganizationSettings]): Unit = js.native
  def getOrganizationSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(params: ParamsResourceOrganizationsGetorganizationsettings): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(
    params: ParamsResourceOrganizationsGetorganizationsettings,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  def getOrganizationSettings(
    params: ParamsResourceOrganizationsGetorganizationsettings,
    options: BodyResponseCallback[Readable | SchemaOrganizationSettings],
    callback: BodyResponseCallback[Readable | SchemaOrganizationSettings]
  ): Unit = js.native
  def getOrganizationSettings(params: ParamsResourceOrganizationsGetorganizationsettings, options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(
    params: ParamsResourceOrganizationsGetorganizationsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  /**
    * Gets the settings for an organization.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
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
    *   const res = await securitycenter.organizations.getOrganizationSettings({
    *     // Required. Name of the organization to get organization settings for. Its format is "organizations/[organization_id]/organizationSettings".
    *     name: 'organizations/my-organization/organizationSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assetDiscoveryConfig": {},
    *   //   "enableAssetDiscovery": false,
    *   //   "name": "my_name"
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
  def getOrganizationSettings(params: ParamsResourceOrganizationsGetorganizationsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getOrganizationSettings(
    params: ParamsResourceOrganizationsGetorganizationsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceOrganizationsOperations = js.native
  
  var sources: ResourceOrganizationsSources = js.native
  
  def updateOrganizationSettings(): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(callback: BodyResponseCallback[SchemaOrganizationSettings]): Unit = js.native
  def updateOrganizationSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(params: ParamsResourceOrganizationsUpdateorganizationsettings): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(
    params: ParamsResourceOrganizationsUpdateorganizationsettings,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  def updateOrganizationSettings(
    params: ParamsResourceOrganizationsUpdateorganizationsettings,
    options: BodyResponseCallback[Readable | SchemaOrganizationSettings],
    callback: BodyResponseCallback[Readable | SchemaOrganizationSettings]
  ): Unit = js.native
  def updateOrganizationSettings(params: ParamsResourceOrganizationsUpdateorganizationsettings, options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(
    params: ParamsResourceOrganizationsUpdateorganizationsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  /**
    * Updates an organization's settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
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
    *   const res = await securitycenter.organizations.updateOrganizationSettings({
    *     // The relative resource name of the settings. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id\}/organizationSettings".
    *     name: 'organizations/my-organization/organizationSettings',
    *     // The FieldMask to use when updating the settings resource.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assetDiscoveryConfig": {},
    *       //   "enableAssetDiscovery": false,
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assetDiscoveryConfig": {},
    *   //   "enableAssetDiscovery": false,
    *   //   "name": "my_name"
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
  def updateOrganizationSettings(params: ParamsResourceOrganizationsUpdateorganizationsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateOrganizationSettings(
    params: ParamsResourceOrganizationsUpdateorganizationsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
