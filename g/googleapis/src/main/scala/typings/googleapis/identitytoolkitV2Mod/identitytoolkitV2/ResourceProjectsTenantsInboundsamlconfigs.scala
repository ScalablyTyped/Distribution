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

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Projects$Tenants$Inboundsamlconfigs")
@js.native
open class ResourceProjectsTenantsInboundsamlconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def create(params: ParamsResourceProjectsTenantsInboundsamlconfigsCreate): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def create(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTenantsInboundsamlconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def create(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  /**
    * Create an inbound SAML configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.inboundSamlConfigs.create({
    *     // The id to use for this config.
    *     inboundSamlConfigId: 'placeholder-value',
    *     // The parent resource name where the config to be created, for example: "projects/my-awesome-project"
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "enabled": false,
    *       //   "idpConfig": {},
    *       //   "name": "my_name",
    *       //   "spConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "idpConfig": {},
    *   //   "name": "my_name",
    *   //   "spConfig": {}
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
  def create(params: ParamsResourceProjectsTenantsInboundsamlconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsInboundsamlconfigsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTenantsInboundsamlconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete an inbound SAML configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.inboundSamlConfigs.delete({
    *     // The resource name of the config to be deleted, for example: 'projects/my-awesome-project/inboundSamlConfigs/my-config-id'.
    *     name: 'projects/my-project/tenants/my-tenant/inboundSamlConfigs/my-inboundSamlConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsTenantsInboundsamlconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def get(params: ParamsResourceProjectsTenantsInboundsamlconfigsGet): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def get(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTenantsInboundsamlconfigsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def get(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  /**
    * Retrieve an inbound SAML configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.inboundSamlConfigs.get({
    *     // The resource name of the config, for example: 'projects/my-awesome-project/inboundSamlConfigs/my-config-id'.
    *     name: 'projects/my-project/tenants/my-tenant/inboundSamlConfigs/my-inboundSamlConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "idpConfig": {},
    *   //   "name": "my_name",
    *   //   "spConfig": {}
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
  def get(params: ParamsResourceProjectsTenantsInboundsamlconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsTenantsInboundsamlconfigsList): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsList,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTenantsInboundsamlconfigsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse]
  ): Unit = js.native
  /**
    * List all inbound SAML configurations for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.inboundSamlConfigs.list({
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // The parent resource name, for example, "projects/my-awesome-project".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inboundSamlConfigs": [],
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
  def list(params: ParamsResourceProjectsTenantsInboundsamlconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def patch(params: ParamsResourceProjectsTenantsInboundsamlconfigsPatch): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsTenantsInboundsamlconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]
  ): Unit = js.native
  /**
    * Update an inbound SAML configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.inboundSamlConfigs.patch({
    *     // The name of the InboundSamlConfig resource, for example: 'projects/my-awesome-project/inboundSamlConfigs/my-config-id'. Ignored during create requests.
    *     name: 'projects/my-project/tenants/my-tenant/inboundSamlConfigs/my-inboundSamlConfig',
    *     // The update mask applies to the resource. Empty update mask will result in updating nothing. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "enabled": false,
    *       //   "idpConfig": {},
    *       //   "name": "my_name",
    *       //   "spConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "idpConfig": {},
    *   //   "name": "my_name",
    *   //   "spConfig": {}
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
  def patch(params: ParamsResourceProjectsTenantsInboundsamlconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsInboundsamlconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
