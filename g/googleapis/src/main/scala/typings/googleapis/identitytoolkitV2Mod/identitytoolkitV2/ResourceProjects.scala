package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var defaultSupportedIdpConfigs: ResourceProjectsDefaultsupportedidpconfigs = js.native
  
  def getConfig(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2Config]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2Config]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2Config],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2Config]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2Config]
  ): Unit = js.native
  /**
    * Retrieve an Identity Toolkit project configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v2');
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
    *   const res = await identitytoolkit.projects.getConfig({
    *     // The resource name of the config, for example: "projects/my-awesome-project/config"
    *     name: 'projects/my-project/config',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authorizedDomains": [],
    *   //   "autodeleteAnonymousUsers": false,
    *   //   "blockingFunctions": {},
    *   //   "client": {},
    *   //   "mfa": {},
    *   //   "monitoring": {},
    *   //   "multiTenant": {},
    *   //   "name": "my_name",
    *   //   "notification": {},
    *   //   "quota": {},
    *   //   "signIn": {},
    *   //   "subtype": "my_subtype"
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
  def getConfig(params: ParamsResourceProjectsGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var inboundSamlConfigs: ResourceProjectsInboundsamlconfigs = js.native
  
  var oauthIdpConfigs: ResourceProjectsOauthidpconfigs = js.native
  
  var tenants: ResourceProjectsTenants = js.native
  
  def updateConfig(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2Config]): Unit = js.native
  def updateConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2Config]
  ): Unit = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2Config],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2Config]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2Config] = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2Config]
  ): Unit = js.native
  /**
    * Update an Identity Toolkit project configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.projects.updateConfig({
    *     // Output only. The name of the Config resource. Example: "projects/my-awesome-project/config"
    *     name: 'projects/my-project/config',
    *     // The update mask applies to the resource. Fields set in the config but not included in this update mask will be ignored. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authorizedDomains": [],
    *       //   "autodeleteAnonymousUsers": false,
    *       //   "blockingFunctions": {},
    *       //   "client": {},
    *       //   "mfa": {},
    *       //   "monitoring": {},
    *       //   "multiTenant": {},
    *       //   "name": "my_name",
    *       //   "notification": {},
    *       //   "quota": {},
    *       //   "signIn": {},
    *       //   "subtype": "my_subtype"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authorizedDomains": [],
    *   //   "autodeleteAnonymousUsers": false,
    *   //   "blockingFunctions": {},
    *   //   "client": {},
    *   //   "mfa": {},
    *   //   "monitoring": {},
    *   //   "multiTenant": {},
    *   //   "name": "my_name",
    *   //   "notification": {},
    *   //   "quota": {},
    *   //   "signIn": {},
    *   //   "subtype": "my_subtype"
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
  def updateConfig(params: ParamsResourceProjectsUpdateconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
