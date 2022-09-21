package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Admin$Projects$Locations$Topics")
@js.native
open class ResourceAdminProjectsLocationsTopics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTopic] = js.native
  def create(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(params: ParamsResourceAdminProjectsLocationsTopicsCreate): GaxiosPromise[SchemaTopic] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsTopicsCreate,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsTopicsCreate,
    options: BodyResponseCallback[Readable | SchemaTopic],
    callback: BodyResponseCallback[Readable | SchemaTopic]
  ): Unit = js.native
  def create(params: ParamsResourceAdminProjectsLocationsTopicsCreate, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsTopicsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  /**
    * Creates a new topic.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *   const res = await pubsublite.admin.projects.locations.topics.create({
    *     // Required. The parent location in which to create the topic. Structured like `projects/{project_number\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Required. The ID to use for the topic, which will become the final component of the topic's name. This value is structured like: `my-topic-name`.
    *     topicId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "partitionConfig": {},
    *       //   "reservationConfig": {},
    *       //   "retentionConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "partitionConfig": {},
    *   //   "reservationConfig": {},
    *   //   "retentionConfig": {}
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
  def create(params: ParamsResourceAdminProjectsLocationsTopicsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsTopicsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdminProjectsLocationsTopicsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsTopicsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsTopicsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdminProjectsLocationsTopicsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsTopicsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified topic.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *   const res = await pubsublite.admin.projects.locations.topics.delete({
    *     // Required. The name of the topic to delete.
    *     name: 'projects/my-project/locations/my-location/topics/my-topic',
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
  def delete(params: ParamsResourceAdminProjectsLocationsTopicsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsTopicsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTopic] = js.native
  def get(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceAdminProjectsLocationsTopicsGet): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceAdminProjectsLocationsTopicsGet, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsTopicsGet,
    options: BodyResponseCallback[Readable | SchemaTopic],
    callback: BodyResponseCallback[Readable | SchemaTopic]
  ): Unit = js.native
  def get(params: ParamsResourceAdminProjectsLocationsTopicsGet, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsTopicsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  /**
    * Returns the topic configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *   const res = await pubsublite.admin.projects.locations.topics.get({
    *     // Required. The name of the topic whose configuration to return.
    *     name: 'projects/my-project/locations/my-location/topics/my-topic',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "partitionConfig": {},
    *   //   "reservationConfig": {},
    *   //   "retentionConfig": {}
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
  def get(params: ParamsResourceAdminProjectsLocationsTopicsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsTopicsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getPartitions(): GaxiosPromise[SchemaTopicPartitions] = js.native
  def getPartitions(callback: BodyResponseCallback[SchemaTopicPartitions]): Unit = js.native
  def getPartitions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopicPartitions] = js.native
  def getPartitions(params: ParamsResourceAdminProjectsLocationsTopicsGetpartitions): GaxiosPromise[SchemaTopicPartitions] = js.native
  def getPartitions(
    params: ParamsResourceAdminProjectsLocationsTopicsGetpartitions,
    callback: BodyResponseCallback[SchemaTopicPartitions]
  ): Unit = js.native
  def getPartitions(
    params: ParamsResourceAdminProjectsLocationsTopicsGetpartitions,
    options: BodyResponseCallback[Readable | SchemaTopicPartitions],
    callback: BodyResponseCallback[Readable | SchemaTopicPartitions]
  ): Unit = js.native
  def getPartitions(params: ParamsResourceAdminProjectsLocationsTopicsGetpartitions, options: MethodOptions): GaxiosPromise[SchemaTopicPartitions] = js.native
  def getPartitions(
    params: ParamsResourceAdminProjectsLocationsTopicsGetpartitions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopicPartitions]
  ): Unit = js.native
  /**
    * Returns the partition information for the requested topic.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *   const res = await pubsublite.admin.projects.locations.topics.getPartitions({
    *     // Required. The topic whose partition information to return.
    *     name: 'projects/my-project/locations/my-location/topics/my-topic',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "partitionCount": "my_partitionCount"
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
  def getPartitions(params: ParamsResourceAdminProjectsLocationsTopicsGetpartitions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getPartitions(
    params: ParamsResourceAdminProjectsLocationsTopicsGetpartitions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(params: ParamsResourceAdminProjectsLocationsTopicsList): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsTopicsList,
    callback: BodyResponseCallback[SchemaListTopicsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsTopicsList,
    options: BodyResponseCallback[Readable | SchemaListTopicsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTopicsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdminProjectsLocationsTopicsList, options: MethodOptions): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsTopicsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicsResponse]
  ): Unit = js.native
  /**
    * Returns the list of topics for the given project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *   const res = await pubsublite.admin.projects.locations.topics.list({
    *     // The maximum number of topics to return. The service may return fewer than this value. If unset or zero, all topics for the parent will be returned.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListTopics` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListTopics` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent whose topics are to be listed. Structured like `projects/{project_number\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "topics": []
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
  def list(params: ParamsResourceAdminProjectsLocationsTopicsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsTopicsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTopic] = js.native
  def patch(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def patch(params: ParamsResourceAdminProjectsLocationsTopicsPatch): GaxiosPromise[SchemaTopic] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsTopicsPatch,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsTopicsPatch,
    options: BodyResponseCallback[Readable | SchemaTopic],
    callback: BodyResponseCallback[Readable | SchemaTopic]
  ): Unit = js.native
  def patch(params: ParamsResourceAdminProjectsLocationsTopicsPatch, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsTopicsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  /**
    * Updates properties of the specified topic.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *   const res = await pubsublite.admin.projects.locations.topics.patch({
    *     // The name of the topic. Structured like: projects/{project_number\}/locations/{location\}/topics/{topic_id\}
    *     name: 'projects/my-project/locations/my-location/topics/my-topic',
    *     // Required. A mask specifying the topic fields to change.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "partitionConfig": {},
    *       //   "reservationConfig": {},
    *       //   "retentionConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "partitionConfig": {},
    *   //   "reservationConfig": {},
    *   //   "retentionConfig": {}
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
  def patch(params: ParamsResourceAdminProjectsLocationsTopicsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsTopicsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var subscriptions: ResourceAdminProjectsLocationsTopicsSubscriptions = js.native
}
