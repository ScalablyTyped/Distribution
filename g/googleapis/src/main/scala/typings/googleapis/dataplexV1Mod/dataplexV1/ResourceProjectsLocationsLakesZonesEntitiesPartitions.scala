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

@JSImport("googleapis/build/src/apis/dataplex/v1", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Entities$Partitions")
@js.native
open class ResourceProjectsLocationsLakesZonesEntitiesPartitions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Partition]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def create(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsCreate): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Partition]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Partition],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Partition]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Partition]
  ): Unit = js.native
  /**
    * Create a metadata partition.
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
    *   const res =
    *     await dataplex.projects.locations.lakes.zones.entities.partitions.create({
    *       // Required. The resource name of the parent zone: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}.
    *       parent:
    *         'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/entities/my-entitie',
    *       // Optional. Only validate the request, but do not perform mutations. The default is false.
    *       validateOnly: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "etag": "my_etag",
    *         //   "location": "my_location",
    *         //   "name": "my_name",
    *         //   "values": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "values": []
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
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a metadata partition.
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
    *   const res =
    *     await dataplex.projects.locations.lakes.zones.entities.partitions.delete({
    *       // Optional. The etag associated with the partition.
    *       etag: 'placeholder-value',
    *       // Required. The resource name of the partition. format: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}/partitions/{partition_value_path\}. The {partition_value_path\} segment consists of an ordered sequence of partition values separated by "/". All values must be provided.
    *       name: 'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/entities/my-entitie/partitions/.*',
    *     });
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
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Partition]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def get(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsGet): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Partition]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Partition],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1Partition]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1Partition] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1Partition]
  ): Unit = js.native
  /**
    * Get a metadata partition of an entity.
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
    *   const res =
    *     await dataplex.projects.locations.lakes.zones.entities.partitions.get({
    *       // Required. The resource name of the partition: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}/partitions/{partition_value_path\}. The {partition_value_path\} segment consists of an ordered sequence of partition values separated by "/". All values must be provided.
    *       name: 'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/entities/my-entitie/partitions/.*',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "values": []
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
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDataplexV1ListPartitionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListPartitionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListPartitionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsList): GaxiosPromise[SchemaGoogleCloudDataplexV1ListPartitionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListPartitionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListPartitionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListPartitionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListPartitionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListPartitionsResponse]
  ): Unit = js.native
  /**
    * List metadata partitions of an entity.
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
    *   const res =
    *     await dataplex.projects.locations.lakes.zones.entities.partitions.list({
    *       // Optional. Filter the partitions returned to the caller using a key value pair expression. Supported operators and syntax: logic operators: AND, OR comparison operators: <, \>, \>=, <= ,=, != LIKE operators: The right hand of a LIKE operator supports "." and "*" for wildcard searches, for example "value1 LIKE ".*oo.*" parenthetical grouping: ( )Sample filter expression: `?filter="key1 < value1 OR key2 \> value2"Notes: Keys to the left of operators are case insensitive. Partition results are sorted first by creation time, then by lexicographic order. Up to 20 key value filter pairs are allowed, but due to performance considerations, only the first 10 will be used as a filter.
    *       filter: 'placeholder-value',
    *       // Optional. Maximum number of partitions to return. The service may return fewer than this value. If unspecified, 100 partitions will be returned by default. The maximum page size is 500; larger values will will be truncated to 500.
    *       pageSize: 'placeholder-value',
    *       // Optional. Page token received from a previous ListPartitions call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListPartitions must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The resource name of the parent entity: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/entities/{entity_id\}.
    *       parent:
    *         'projects/my-project/locations/my-location/lakes/my-lake/zones/my-zone/entities/my-entitie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "partitions": []
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
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesZonesEntitiesPartitionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
