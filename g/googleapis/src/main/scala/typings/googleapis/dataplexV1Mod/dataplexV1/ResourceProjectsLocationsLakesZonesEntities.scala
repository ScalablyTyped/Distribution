package typings.googleapis.dataplexV1Mod.dataplexV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataplex/v1", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Entities")
@js.native
open class ResourceProjectsLocationsLakesZonesEntities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def create(params: ParamsResourceProjectsLocationsLakesZonesEntitiesCreate): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Entity],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsLakesZonesEntitiesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  /**
    * Create a metadata entity.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.zones.entities.create({
    *     // Required. The resource name of the parent zone: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}.
    *     parent:
    *       'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone',
    *     // Optional. Only validate the request, but do not perform mutations. The default is false.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "asset": "my_asset",
    *       //   "catalogEntry": "my_catalogEntry",
    *       //   "compatibility": {},
    *       //   "createTime": "my_createTime",
    *       //   "dataPath": "my_dataPath",
    *       //   "dataPathPattern": "my_dataPathPattern",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "format": {},
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "schema": {},
    *       //   "system": "my_system",
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "asset": "my_asset",
    *   //   "catalogEntry": "my_catalogEntry",
    *   //   "compatibility": {},
    *   //   "createTime": "my_createTime",
    *   //   "dataPath": "my_dataPath",
    *   //   "dataPathPattern": "my_dataPathPattern",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "format": {},
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "schema": {},
    *   //   "system": "my_system",
    *   //   "type": "my_type",
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
  def create(params: ParamsResourceProjectsLocationsLakesZonesEntitiesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a metadata entity.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.zones.entities.delete({
    *     // Required. The etag associated with the entity, which can be retrieved with a GetEntity request.
    *     etag: 'placeholder-value',
    *     // Required. The resource name of the entity: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}.
    *     name: 'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/entities/my-entitie',
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
  def delete(params: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def get(params: ParamsResourceProjectsLocationsLakesZonesEntitiesGet): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Entity],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsLakesZonesEntitiesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  /**
    * Get a metadata entity.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.zones.entities.get({
    *     // Required. The resource name of the entity: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}.
    *     name: 'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/entities/my-entitie',
    *     // Optional. Used to select the subset of entity information to return. Defaults to BASIC.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "asset": "my_asset",
    *   //   "catalogEntry": "my_catalogEntry",
    *   //   "compatibility": {},
    *   //   "createTime": "my_createTime",
    *   //   "dataPath": "my_dataPath",
    *   //   "dataPathPattern": "my_dataPathPattern",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "format": {},
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "schema": {},
    *   //   "system": "my_system",
    *   //   "type": "my_type",
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
  def get(params: ParamsResourceProjectsLocationsLakesZonesEntitiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDataplexV1ListEntitiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListEntitiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListEntitiesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsLakesZonesEntitiesList): GaxiosPromise[SchemaGoogleCloudDataplexV1ListEntitiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListEntitiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListEntitiesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListEntitiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsLakesZonesEntitiesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListEntitiesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListEntitiesResponse]
  ): Unit = js.native
  /**
    * List metadata entities in a zone.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.zones.entities.list({
    *     // Optional. The following filter parameters can be added to the URL to limit the entities returned by the API: Entity ID: ?filter="id=entityID" Asset ID: ?filter="asset=assetID" Data path ?filter="data_path=gs://my-bucket" Is HIVE compatible: ?filter="hive_compatible=true" Is BigQuery compatible: ?filter="bigquery_compatible=true"
    *     filter: 'placeholder-value',
    *     // Optional. Maximum number of entities to return. The service may return fewer than this value. If unspecified, 100 entities will be returned by default. The maximum value is 500; larger values will will be truncated to 500.
    *     pageSize: 'placeholder-value',
    *     // Optional. Page token received from a previous ListEntities call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListEntities must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the parent zone: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}.
    *     parent:
    *       'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone',
    *     // Required. Specify the entity view to make a partial list request.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
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
  def list(params: ParamsResourceProjectsLocationsLakesZonesEntitiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var partitions: ResourceProjectsLocationsLakesZonesEntitiesPartitions = js.native
  
  def update(): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def update(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def update(params: ParamsResourceProjectsLocationsLakesZonesEntitiesUpdate): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def update(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesUpdate,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesUpdate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Entity],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsLakesZonesEntitiesUpdate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Entity] = js.native
  def update(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Entity]
  ): Unit = js.native
  /**
    * Update a metadata entity. Only supports full resource update.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *   const res = await dataplex.projects.locations.lakes.zones.entities.update({
    *     // Output only. The resource name of the entity, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{id\}.
    *     name: 'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/entities/my-entitie',
    *     // Optional. Only validate the request, but do not perform mutations. The default is false.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "asset": "my_asset",
    *       //   "catalogEntry": "my_catalogEntry",
    *       //   "compatibility": {},
    *       //   "createTime": "my_createTime",
    *       //   "dataPath": "my_dataPath",
    *       //   "dataPathPattern": "my_dataPathPattern",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "format": {},
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "schema": {},
    *       //   "system": "my_system",
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "asset": "my_asset",
    *   //   "catalogEntry": "my_catalogEntry",
    *   //   "compatibility": {},
    *   //   "createTime": "my_createTime",
    *   //   "dataPath": "my_dataPath",
    *   //   "dataPathPattern": "my_dataPathPattern",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "format": {},
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "schema": {},
    *   //   "system": "my_system",
    *   //   "type": "my_type",
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
  def update(params: ParamsResourceProjectsLocationsLakesZonesEntitiesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
