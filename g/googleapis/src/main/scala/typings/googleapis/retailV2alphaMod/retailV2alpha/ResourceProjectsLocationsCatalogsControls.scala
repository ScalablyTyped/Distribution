package typings.googleapis.retailV2alphaMod.retailV2alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2alpha", "retail_v2alpha.Resource$Projects$Locations$Catalogs$Controls")
@js.native
open class ResourceProjectsLocationsCatalogsControls protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsControlsCreate): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsControlsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsControlsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaControl],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsControlsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsControlsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  /**
    * Creates a Control. If the Control to create already exists, an ALREADY_EXISTS error is returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.controls.create({
    *     // Required. The ID to use for the Control, which will become the final component of the Control's resource name. This value should be 4-63 characters, and valid characters are /a-z-_/.
    *     controlId: 'placeholder-value',
    *     // Required. Full resource name of parent catalog. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}`
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "associatedServingConfigIds": [],
    *       //   "displayName": "my_displayName",
    *       //   "facetSpec": {},
    *       //   "name": "my_name",
    *       //   "rule": {},
    *       //   "solutionTypes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "associatedServingConfigIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "facetSpec": {},
    *   //   "name": "my_name",
    *   //   "rule": {},
    *   //   "solutionTypes": []
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
  def create(params: ParamsResourceProjectsLocationsCatalogsControlsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsControlsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsControlsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsControlsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsControlsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsControlsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsControlsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a Control. If the Control to delete does not exist, a NOT_FOUND error is returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.controls.delete({
    *     // Required. The resource name of the Control to delete. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/controls/{control_id\}`
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/controls/my-control',
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
  def delete(params: ParamsResourceProjectsLocationsCatalogsControlsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsControlsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsControlsGet): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsControlsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsControlsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaControl],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsControlsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsControlsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  /**
    * Gets a Control.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.controls.get({
    *     // Required. The resource name of the Control to delete. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/controls/{control_id\}`
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/controls/my-control',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "associatedServingConfigIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "facetSpec": {},
    *   //   "name": "my_name",
    *   //   "rule": {},
    *   //   "solutionTypes": []
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
  def get(params: ParamsResourceProjectsLocationsCatalogsControlsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsControlsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListControlsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListControlsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListControlsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsControlsList): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListControlsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsControlsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListControlsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsControlsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaListControlsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaListControlsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsControlsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListControlsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsControlsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListControlsResponse]
  ): Unit = js.native
  /**
    * Lists all Controls linked to this catalog.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.controls.list({
    *     // Optional. A filter to apply on the list results. Supported features: * List all the products under the parent branch if filter is unset. * List controls that are used in a single ServingConfig: 'serving_config = "boosted_home_page_cvr"'
    *     filter: 'placeholder-value',
    *     // Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListControls` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The catalog resource name. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}`
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "controls": [],
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
  def list(params: ParamsResourceProjectsLocationsCatalogsControlsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsControlsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsControlsPatch): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsControlsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsControlsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaControl],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsControlsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaControl] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsControlsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaControl]
  ): Unit = js.native
  /**
    * Updates a Control. Control cannot be set to a different oneof field, if so an INVALID_ARGUMENT is returned. If the Control to delete does not exist, a NOT_FOUND error is returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.controls.patch({
    *     // Immutable. Fully qualified name `projects/x/locations/global/catalogs/x/controls/x`
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/controls/my-control',
    *     // Indicates which fields in the provided Control to update. The following are NOT supported: * Control.name If not set or empty, all supported fields are updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "associatedServingConfigIds": [],
    *       //   "displayName": "my_displayName",
    *       //   "facetSpec": {},
    *       //   "name": "my_name",
    *       //   "rule": {},
    *       //   "solutionTypes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "associatedServingConfigIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "facetSpec": {},
    *   //   "name": "my_name",
    *   //   "rule": {},
    *   //   "solutionTypes": []
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
  def patch(params: ParamsResourceProjectsLocationsCatalogsControlsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsControlsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
