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

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Projects$Tenants$Oauthidpconfigs")
@js.native
open class ResourceProjectsTenantsOauthidpconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def create(params: ParamsResourceProjectsTenantsOauthidpconfigsCreate): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def create(
    params: ParamsResourceProjectsTenantsOauthidpconfigsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsTenantsOauthidpconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTenantsOauthidpconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def create(
    params: ParamsResourceProjectsTenantsOauthidpconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  /**
    * Create an Oidc Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.oauthIdpConfigs.create({
    *     // The id to use for this config.
    *     oauthIdpConfigId: 'placeholder-value',
    *     // The parent resource name where the config to be created, for example: "projects/my-awesome-project"
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientId": "my_clientId",
    *       //   "clientSecret": "my_clientSecret",
    *       //   "displayName": "my_displayName",
    *       //   "enabled": false,
    *       //   "issuer": "my_issuer",
    *       //   "name": "my_name",
    *       //   "responseType": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "clientSecret": "my_clientSecret",
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "issuer": "my_issuer",
    *   //   "name": "my_name",
    *   //   "responseType": {}
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
  def create(params: ParamsResourceProjectsTenantsOauthidpconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTenantsOauthidpconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsOauthidpconfigsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsOauthidpconfigsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTenantsOauthidpconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTenantsOauthidpconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsOauthidpconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete an Oidc Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.oauthIdpConfigs.delete({
    *     // The resource name of the config to be deleted, for example: 'projects/my-awesome-project/oauthIdpConfigs/oauth-config-id'.
    *     name: 'projects/my-project/tenants/my-tenant/oauthIdpConfigs/my-oauthIdpConfig',
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
  def delete(params: ParamsResourceProjectsTenantsOauthidpconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsOauthidpconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def get(params: ParamsResourceProjectsTenantsOauthidpconfigsGet): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def get(
    params: ParamsResourceProjectsTenantsOauthidpconfigsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsTenantsOauthidpconfigsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTenantsOauthidpconfigsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def get(
    params: ParamsResourceProjectsTenantsOauthidpconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  /**
    * Retrieve an Oidc Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.oauthIdpConfigs.get({
    *     // The resource name of the config, for example: 'projects/my-awesome-project/oauthIdpConfigs/oauth-config-id'.
    *     name: 'projects/my-project/tenants/my-tenant/oauthIdpConfigs/my-oauthIdpConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "clientSecret": "my_clientSecret",
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "issuer": "my_issuer",
    *   //   "name": "my_name",
    *   //   "responseType": {}
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
  def get(params: ParamsResourceProjectsTenantsOauthidpconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsTenantsOauthidpconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsTenantsOauthidpconfigsList): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsOauthidpconfigsList,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTenantsOauthidpconfigsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTenantsOauthidpconfigsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsOauthidpconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse]
  ): Unit = js.native
  /**
    * List all Oidc Idp configurations for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.oauthIdpConfigs.list({
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
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "oauthIdpConfigs": []
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
  def list(params: ParamsResourceProjectsTenantsOauthidpconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTenantsOauthidpconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def patch(params: ParamsResourceProjectsTenantsOauthidpconfigsPatch): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsOauthidpconfigsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsTenantsOauthidpconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsTenantsOauthidpconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsOauthidpconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]
  ): Unit = js.native
  /**
    * Update an Oidc Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.tenants.oauthIdpConfigs.patch({
    *     // The name of the OAuthIdpConfig resource, for example: 'projects/my-awesome-project/oauthIdpConfigs/oauth-config-id'. Ignored during create requests.
    *     name: 'projects/my-project/tenants/my-tenant/oauthIdpConfigs/my-oauthIdpConfig',
    *     // The update mask applies to the resource. Empty update mask will result in updating nothing. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientId": "my_clientId",
    *       //   "clientSecret": "my_clientSecret",
    *       //   "displayName": "my_displayName",
    *       //   "enabled": false,
    *       //   "issuer": "my_issuer",
    *       //   "name": "my_name",
    *       //   "responseType": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "clientSecret": "my_clientSecret",
    *   //   "displayName": "my_displayName",
    *   //   "enabled": false,
    *   //   "issuer": "my_issuer",
    *   //   "name": "my_name",
    *   //   "responseType": {}
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
  def patch(params: ParamsResourceProjectsTenantsOauthidpconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsOauthidpconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
