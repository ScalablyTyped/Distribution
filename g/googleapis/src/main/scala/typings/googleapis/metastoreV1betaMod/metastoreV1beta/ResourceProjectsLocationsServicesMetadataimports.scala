package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/metastore/v1beta", "metastore_v1beta.Resource$Projects$Locations$Services$Metadataimports")
@js.native
open class ResourceProjectsLocationsServicesMetadataimports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsServicesMetadataimportsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsServicesMetadataimportsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new MetadataImport in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/metastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const metastore = google.metastore('v1beta');
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
    *     await metastore.projects.locations.services.metadataImports.create({
    *       // Required. The ID of the metadata import, which is used as the final component of the metadata import's name.This value must be between 1 and 64 characters long, begin with a letter, end with a letter or number, and consist of alpha-numeric ASCII characters or hyphens.
    *       metadataImportId: 'placeholder-value',
    *       // Required. The relative resource name of the service in which to create a metastore import, in the following form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}.
    *       parent: 'projects/my-project/locations/my-location/services/my-service',
    *       // Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
    *       requestId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "databaseDump": {},
    *         //   "description": "my_description",
    *         //   "endTime": "my_endTime",
    *         //   "name": "my_name",
    *         //   "state": "my_state",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceProjectsLocationsServicesMetadataimportsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMetadataImport] = js.native
  def get(callback: BodyResponseCallback[SchemaMetadataImport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMetadataImport] = js.native
  def get(params: ParamsResourceProjectsLocationsServicesMetadataimportsGet): GaxiosPromise[SchemaMetadataImport] = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsGet,
    callback: BodyResponseCallback[SchemaMetadataImport]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsGet,
    options: BodyResponseCallback[Readable | SchemaMetadataImport],
    callback: BodyResponseCallback[Readable | SchemaMetadataImport]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsServicesMetadataimportsGet, options: MethodOptions): GaxiosPromise[SchemaMetadataImport] = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetadataImport]
  ): Unit = js.native
  /**
    * Gets details of a single import.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/metastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const metastore = google.metastore('v1beta');
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
    *   const res = await metastore.projects.locations.services.metadataImports.get({
    *     // Required. The relative resource name of the metadata import to retrieve, in the following form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}/metadataImports/{import_id\}.
    *     name: 'projects/my-project/locations/my-location/services/my-service/metadataImports/my-metadataImport',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "databaseDump": {},
    *   //   "description": "my_description",
    *   //   "endTime": "my_endTime",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsServicesMetadataimportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMetadataImportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMetadataImportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMetadataImportsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsServicesMetadataimportsList): GaxiosPromise[SchemaListMetadataImportsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsList,
    callback: BodyResponseCallback[SchemaListMetadataImportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsList,
    options: BodyResponseCallback[Readable | SchemaListMetadataImportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMetadataImportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsServicesMetadataimportsList, options: MethodOptions): GaxiosPromise[SchemaListMetadataImportsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMetadataImportsResponse]
  ): Unit = js.native
  /**
    * Lists imports in a service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/metastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const metastore = google.metastore('v1beta');
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
    *   const res = await metastore.projects.locations.services.metadataImports.list({
    *     // Optional. The filter to apply to list results.
    *     filter: 'placeholder-value',
    *     // Optional. Specify the ordering of results as described in Sorting Order (https://cloud.google.com/apis/design/design_patterns#sorting_order). If not specified, the results will be sorted in the default order.
    *     orderBy: 'placeholder-value',
    *     // Optional. The maximum number of imports to return. The response may contain less than the maximum number. If unspecified, no more than 500 imports are returned. The maximum value is 1000; values above 1000 are changed to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous DataprocMetastore.ListServices call. Provide this token to retrieve the subsequent page.To retrieve the first page, supply an empty page token.When paginating, other parameters provided to DataprocMetastore.ListServices must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The relative resource name of the service whose metadata imports to list, in the following form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}/metadataImports.
    *     parent: 'projects/my-project/locations/my-location/services/my-service',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadataImports": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsServicesMetadataimportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsServicesMetadataimportsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsServicesMetadataimportsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a single import. Only the description field of MetadataImport is supported to be updated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/metastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const metastore = google.metastore('v1beta');
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
    *   const res = await metastore.projects.locations.services.metadataImports.patch(
    *     {
    *       // Immutable. The relative resource name of the metadata import, of the form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}/metadataImports/{metadata_import_id\}.
    *       name: 'projects/my-project/locations/my-location/services/my-service/metadataImports/my-metadataImport',
    *       // Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
    *       requestId: 'placeholder-value',
    *       // Required. A field mask used to specify the fields to be overwritten in the metadata import resource by the update. Fields specified in the update_mask are relative to the resource (not to the full request). A field is overwritten if it is in the mask.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "databaseDump": {},
    *         //   "description": "my_description",
    *         //   "endTime": "my_endTime",
    *         //   "name": "my_name",
    *         //   "state": "my_state",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceProjectsLocationsServicesMetadataimportsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsServicesMetadataimportsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
