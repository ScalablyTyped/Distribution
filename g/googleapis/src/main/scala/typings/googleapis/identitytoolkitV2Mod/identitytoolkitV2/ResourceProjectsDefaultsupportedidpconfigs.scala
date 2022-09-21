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

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Projects$Defaultsupportedidpconfigs")
@js.native
open class ResourceProjectsDefaultsupportedidpconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def create(params: ParamsResourceProjectsDefaultsupportedidpconfigsCreate): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def create(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDefaultsupportedidpconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def create(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  /**
    * Create a default supported Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.defaultSupportedIdpConfigs.create({
    *     // The id of the Idp to create a config for. Call ListDefaultSupportedIdps for list of all default supported Idps.
    *     idpId: 'placeholder-value',
    *     // The parent resource name where the config to be created, for example: "projects/my-awesome-project"
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appleSignInConfig": {},
    *       //   "clientId": "my_clientId",
    *       //   "clientSecret": "my_clientSecret",
    *       //   "enabled": false,
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appleSignInConfig": {},
    *   //   "clientId": "my_clientId",
    *   //   "clientSecret": "my_clientSecret",
    *   //   "enabled": false,
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
  def create(params: ParamsResourceProjectsDefaultsupportedidpconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsDefaultsupportedidpconfigsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDefaultsupportedidpconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete a default supported Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.defaultSupportedIdpConfigs.delete({
    *     // The resource name of the config, for example: "projects/my-awesome-project/defaultSupportedIdpConfigs/google.com"
    *     name: 'projects/my-project/defaultSupportedIdpConfigs/my-defaultSupportedIdpConfig',
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
  def delete(params: ParamsResourceProjectsDefaultsupportedidpconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def get(params: ParamsResourceProjectsDefaultsupportedidpconfigsGet): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def get(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDefaultsupportedidpconfigsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def get(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  /**
    * Retrieve a default supported Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.defaultSupportedIdpConfigs.get({
    *     // The resource name of the config, for example: "projects/my-awesome-project/defaultSupportedIdpConfigs/google.com"
    *     name: 'projects/my-project/defaultSupportedIdpConfigs/my-defaultSupportedIdpConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appleSignInConfig": {},
    *   //   "clientId": "my_clientId",
    *   //   "clientSecret": "my_clientSecret",
    *   //   "enabled": false,
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
  def get(params: ParamsResourceProjectsDefaultsupportedidpconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsDefaultsupportedidpconfigsList): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsList,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDefaultsupportedidpconfigsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse]
  ): Unit = js.native
  /**
    * List all default supported Idp configurations for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.defaultSupportedIdpConfigs.list({
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // The parent resource name, for example, "projects/my-awesome-project".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultSupportedIdpConfigs": [],
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
  def list(params: ParamsResourceProjectsDefaultsupportedidpconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def patch(params: ParamsResourceProjectsDefaultsupportedidpconfigsPatch): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def patch(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsDefaultsupportedidpconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.native
  def patch(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]
  ): Unit = js.native
  /**
    * Update a default supported Idp configuration for an Identity Toolkit project.
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
    *   const res = await identitytoolkit.projects.defaultSupportedIdpConfigs.patch({
    *     // The name of the DefaultSupportedIdpConfig resource, for example: "projects/my-awesome-project/defaultSupportedIdpConfigs/google.com"
    *     name: 'projects/my-project/defaultSupportedIdpConfigs/my-defaultSupportedIdpConfig',
    *     // The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appleSignInConfig": {},
    *       //   "clientId": "my_clientId",
    *       //   "clientSecret": "my_clientSecret",
    *       //   "enabled": false,
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appleSignInConfig": {},
    *   //   "clientId": "my_clientId",
    *   //   "clientSecret": "my_clientSecret",
    *   //   "enabled": false,
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
  def patch(params: ParamsResourceProjectsDefaultsupportedidpconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsDefaultsupportedidpconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
