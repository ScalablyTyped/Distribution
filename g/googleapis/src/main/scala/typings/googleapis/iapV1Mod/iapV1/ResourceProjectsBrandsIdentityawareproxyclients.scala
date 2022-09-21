package typings.googleapis.iapV1Mod.iapV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iap/v1", "iap_v1.Resource$Projects$Brands$Identityawareproxyclients")
@js.native
open class ResourceProjectsBrandsIdentityawareproxyclients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def create(callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def create(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def create(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate,
    callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate,
    options: BodyResponseCallback[Readable | SchemaIdentityAwareProxyClient],
    callback: BodyResponseCallback[Readable | SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate, options: MethodOptions): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def create(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  /**
    * Creates an Identity Aware Proxy (IAP) OAuth client. The client is owned by IAP. Requires that the brand for the project exists and that it is set for internal-only use.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.brands.identityAwareProxyClients.create({
    *     // Required. Path to create the client in. In the following format: projects/{project_number/id\}/brands/{brand\}. The project must belong to a G Suite account.
    *     parent: 'projects/my-project/brands/my-brand',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "secret": "my_secret"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "secret": "my_secret"
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
  def create(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an Identity Aware Proxy (IAP) OAuth client. Useful for removing obsolete clients, managing the number of clients in a given project, and cleaning up after tests. Requires that the client is owned by IAP.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.brands.identityAwareProxyClients.delete({
    *     // Required. Name of the Identity Aware Proxy client to be deleted. In the following format: projects/{project_number/id\}/brands/{brand\}/identityAwareProxyClients/{client_id\}.
    *     name: 'projects/my-project/brands/my-brand/identityAwareProxyClients/my-identityAwareProxyClient',
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
  def delete(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def get(callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def get(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def get(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet,
    callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet,
    options: BodyResponseCallback[Readable | SchemaIdentityAwareProxyClient],
    callback: BodyResponseCallback[Readable | SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet, options: MethodOptions): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def get(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  /**
    * Retrieves an Identity Aware Proxy (IAP) OAuth client. Requires that the client is owned by IAP.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.brands.identityAwareProxyClients.get({
    *     // Required. Name of the Identity Aware Proxy client to be fetched. In the following format: projects/{project_number/id\}/brands/{brand\}/identityAwareProxyClients/{client_id\}.
    *     name: 'projects/my-project/brands/my-brand/identityAwareProxyClients/my-identityAwareProxyClient',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "secret": "my_secret"
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
  def get(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListIdentityAwareProxyClientsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListIdentityAwareProxyClientsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListIdentityAwareProxyClientsResponse] = js.native
  def list(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsList): GaxiosPromise[SchemaListIdentityAwareProxyClientsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsList,
    callback: BodyResponseCallback[SchemaListIdentityAwareProxyClientsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsList,
    options: BodyResponseCallback[Readable | SchemaListIdentityAwareProxyClientsResponse],
    callback: BodyResponseCallback[Readable | SchemaListIdentityAwareProxyClientsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsList, options: MethodOptions): GaxiosPromise[SchemaListIdentityAwareProxyClientsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListIdentityAwareProxyClientsResponse]
  ): Unit = js.native
  /**
    * Lists the existing clients for the brand.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.brands.identityAwareProxyClients.list({
    *     // The maximum number of clients to return. The service may return fewer than this value. If unspecified, at most 100 clients will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListIdentityAwareProxyClients` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListIdentityAwareProxyClients` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Full brand path. In the following format: projects/{project_number/id\}/brands/{brand\}.
    *     parent: 'projects/my-project/brands/my-brand',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "identityAwareProxyClients": [],
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
  def list(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetSecret(): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def resetSecret(callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]): Unit = js.native
  def resetSecret(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def resetSecret(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def resetSecret(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret,
    callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  def resetSecret(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret,
    options: BodyResponseCallback[Readable | SchemaIdentityAwareProxyClient],
    callback: BodyResponseCallback[Readable | SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  def resetSecret(params: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret, options: MethodOptions): GaxiosPromise[SchemaIdentityAwareProxyClient] = js.native
  def resetSecret(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentityAwareProxyClient]
  ): Unit = js.native
  /**
    * Resets an Identity Aware Proxy (IAP) OAuth client secret. Useful if the secret was compromised. Requires that the client is owned by IAP.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iap.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iap = google.iap('v1');
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
    *   const res = await iap.projects.brands.identityAwareProxyClients.resetSecret({
    *     // Required. Name of the Identity Aware Proxy client to that will have its secret reset. In the following format: projects/{project_number/id\}/brands/{brand\}/identityAwareProxyClients/{client_id\}.
    *     name: 'projects/my-project/brands/my-brand/identityAwareProxyClients/my-identityAwareProxyClient',
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
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "secret": "my_secret"
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
  def resetSecret(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def resetSecret(
    params: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
