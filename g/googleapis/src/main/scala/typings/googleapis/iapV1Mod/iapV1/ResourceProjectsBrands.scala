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

@JSImport("googleapis/build/src/apis/iap/v1", "iap_v1.Resource$Projects$Brands")
@js.native
open class ResourceProjectsBrands protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaBrand] = js.native
  def create(callback: BodyResponseCallback[SchemaBrand]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBrand] = js.native
  def create(params: ParamsResourceProjectsBrandsCreate): GaxiosPromise[SchemaBrand] = js.native
  def create(params: ParamsResourceProjectsBrandsCreate, callback: BodyResponseCallback[SchemaBrand]): Unit = js.native
  def create(
    params: ParamsResourceProjectsBrandsCreate,
    options: BodyResponseCallback[Readable | SchemaBrand],
    callback: BodyResponseCallback[Readable | SchemaBrand]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsBrandsCreate, options: MethodOptions): GaxiosPromise[SchemaBrand] = js.native
  def create(
    params: ParamsResourceProjectsBrandsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBrand]
  ): Unit = js.native
  /**
    * Constructs a new OAuth brand for the project if one does not exist. The created brand is "internal only", meaning that OAuth clients created under it only accept requests from users who belong to the same Google Workspace organization as the project. The brand is created in an un-reviewed status. NOTE: The "internal only" status can be manually changed in the Google Cloud Console. Requires that a brand does not already exist for the project, and that the specified support email is owned by the caller.
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
    *   const res = await iap.projects.brands.create({
    *     // Required. GCP Project number/id under which the brand is to be created. In the following format: projects/{project_number/id\}.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "applicationTitle": "my_applicationTitle",
    *       //   "name": "my_name",
    *       //   "orgInternalOnly": false,
    *       //   "supportEmail": "my_supportEmail"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applicationTitle": "my_applicationTitle",
    *   //   "name": "my_name",
    *   //   "orgInternalOnly": false,
    *   //   "supportEmail": "my_supportEmail"
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
  def create(params: ParamsResourceProjectsBrandsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsBrandsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBrand] = js.native
  def get(callback: BodyResponseCallback[SchemaBrand]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBrand] = js.native
  def get(params: ParamsResourceProjectsBrandsGet): GaxiosPromise[SchemaBrand] = js.native
  def get(params: ParamsResourceProjectsBrandsGet, callback: BodyResponseCallback[SchemaBrand]): Unit = js.native
  def get(
    params: ParamsResourceProjectsBrandsGet,
    options: BodyResponseCallback[Readable | SchemaBrand],
    callback: BodyResponseCallback[Readable | SchemaBrand]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBrandsGet, options: MethodOptions): GaxiosPromise[SchemaBrand] = js.native
  def get(
    params: ParamsResourceProjectsBrandsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBrand]
  ): Unit = js.native
  /**
    * Retrieves the OAuth brand of the project.
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
    *   const res = await iap.projects.brands.get({
    *     // Required. Name of the brand to be fetched. In the following format: projects/{project_number/id\}/brands/{brand\}.
    *     name: 'projects/my-project/brands/my-brand',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applicationTitle": "my_applicationTitle",
    *   //   "name": "my_name",
    *   //   "orgInternalOnly": false,
    *   //   "supportEmail": "my_supportEmail"
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
  def get(params: ParamsResourceProjectsBrandsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsBrandsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var identityAwareProxyClients: ResourceProjectsBrandsIdentityawareproxyclients = js.native
  
  def list(): GaxiosPromise[SchemaListBrandsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBrandsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBrandsResponse] = js.native
  def list(params: ParamsResourceProjectsBrandsList): GaxiosPromise[SchemaListBrandsResponse] = js.native
  def list(params: ParamsResourceProjectsBrandsList, callback: BodyResponseCallback[SchemaListBrandsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrandsList,
    options: BodyResponseCallback[Readable | SchemaListBrandsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBrandsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrandsList, options: MethodOptions): GaxiosPromise[SchemaListBrandsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrandsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBrandsResponse]
  ): Unit = js.native
  /**
    * Lists the existing brands for the project.
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
    *   const res = await iap.projects.brands.list({
    *     // Required. GCP Project number/id. In the following format: projects/{project_number/id\}.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "brands": []
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
  def list(params: ParamsResourceProjectsBrandsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsBrandsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
