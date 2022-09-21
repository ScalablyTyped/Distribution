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

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Admin$Projects$Locations$Subscriptions")
@js.native
open class ResourceAdminProjectsLocationsSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSubscription] = js.native
  def create(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def create(params: ParamsResourceAdminProjectsLocationsSubscriptionsCreate): GaxiosPromise[SchemaSubscription] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsCreate,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsCreate,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def create(params: ParamsResourceAdminProjectsLocationsSubscriptionsCreate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Creates a new subscription.
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
    *   const res = await pubsublite.admin.projects.locations.subscriptions.create({
    *     // Required. The parent location in which to create the subscription. Structured like `projects/{project_number\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *     // If true, the newly created subscription will only receive messages published after the subscription was created. Otherwise, the entire message backlog will be received on the subscription. Defaults to false.
    *     skipBacklog: 'placeholder-value',
    *     // Required. The ID to use for the subscription, which will become the final component of the subscription's name. This value is structured like: `my-sub-name`.
    *     subscriptionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deliveryConfig": {},
    *       //   "name": "my_name",
    *       //   "topic": "my_topic"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deliveryConfig": {},
    *   //   "name": "my_name",
    *   //   "topic": "my_topic"
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
  def create(params: ParamsResourceAdminProjectsLocationsSubscriptionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdminProjectsLocationsSubscriptionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdminProjectsLocationsSubscriptionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified subscription.
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
    *   const res = await pubsublite.admin.projects.locations.subscriptions.delete({
    *     // Required. The name of the subscription to delete.
    *     name: 'projects/my-project/locations/my-location/subscriptions/my-subscription',
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
  def delete(params: ParamsResourceAdminProjectsLocationsSubscriptionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSubscription] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def get(params: ParamsResourceAdminProjectsLocationsSubscriptionsGet): GaxiosPromise[SchemaSubscription] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsGet,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsGet,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def get(params: ParamsResourceAdminProjectsLocationsSubscriptionsGet, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Returns the subscription configuration.
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
    *   const res = await pubsublite.admin.projects.locations.subscriptions.get({
    *     // Required. The name of the subscription whose configuration to return.
    *     name: 'projects/my-project/locations/my-location/subscriptions/my-subscription',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deliveryConfig": {},
    *   //   "name": "my_name",
    *   //   "topic": "my_topic"
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
  def get(params: ParamsResourceAdminProjectsLocationsSubscriptionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSubscriptionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(params: ParamsResourceAdminProjectsLocationsSubscriptionsList): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsList,
    callback: BodyResponseCallback[SchemaListSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsList,
    options: BodyResponseCallback[Readable | SchemaListSubscriptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdminProjectsLocationsSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSubscriptionsResponse]
  ): Unit = js.native
  /**
    * Returns the list of subscriptions for the given project.
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
    *   const res = await pubsublite.admin.projects.locations.subscriptions.list({
    *     // The maximum number of subscriptions to return. The service may return fewer than this value. If unset or zero, all subscriptions for the parent will be returned.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListSubscriptions` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListSubscriptions` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent whose subscriptions are to be listed. Structured like `projects/{project_number\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "subscriptions": []
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
  def list(params: ParamsResourceAdminProjectsLocationsSubscriptionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSubscription] = js.native
  def patch(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def patch(params: ParamsResourceAdminProjectsLocationsSubscriptionsPatch): GaxiosPromise[SchemaSubscription] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsPatch,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsPatch,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def patch(params: ParamsResourceAdminProjectsLocationsSubscriptionsPatch, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Updates properties of the specified subscription.
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
    *   const res = await pubsublite.admin.projects.locations.subscriptions.patch({
    *     // The name of the subscription. Structured like: projects/{project_number\}/locations/{location\}/subscriptions/{subscription_id\}
    *     name: 'projects/my-project/locations/my-location/subscriptions/my-subscription',
    *     // Required. A mask specifying the subscription fields to change.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deliveryConfig": {},
    *       //   "name": "my_name",
    *       //   "topic": "my_topic"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deliveryConfig": {},
    *   //   "name": "my_name",
    *   //   "topic": "my_topic"
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
  def patch(params: ParamsResourceAdminProjectsLocationsSubscriptionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def seek(): GaxiosPromise[SchemaOperation] = js.native
  def seek(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def seek(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def seek(params: ParamsResourceAdminProjectsLocationsSubscriptionsSeek): GaxiosPromise[SchemaOperation] = js.native
  def seek(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsSeek,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def seek(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsSeek,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def seek(params: ParamsResourceAdminProjectsLocationsSubscriptionsSeek, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def seek(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsSeek,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Performs an out-of-band seek for a subscription to a specified target, which may be timestamps or named positions within the message backlog. Seek translates these targets to cursors for each partition and orchestrates subscribers to start consuming messages from these seek cursors. If an operation is returned, the seek has been registered and subscribers will eventually receive messages from the seek cursors (i.e. eventual consistency), as long as they are using a minimum supported client library version and not a system that tracks cursors independently of Pub/Sub Lite (e.g. Apache Beam, Dataflow, Spark). The seek operation will fail for unsupported clients. If clients would like to know when subscribers react to the seek (or not), they can poll the operation. The seek operation will succeed and complete once subscribers are ready to receive messages from the seek cursors for all partitions of the topic. This means that the seek operation will not complete until all subscribers come online. If the previous seek operation has not yet completed, it will be aborted and the new invocation of seek will supersede it.
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
    *   const res = await pubsublite.admin.projects.locations.subscriptions.seek({
    *     // Required. The name of the subscription to seek.
    *     name: 'projects/my-project/locations/my-location/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "namedTarget": "my_namedTarget",
    *       //   "timeTarget": {}
    *       // }
    *     },
    *   });
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
  def seek(params: ParamsResourceAdminProjectsLocationsSubscriptionsSeek, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def seek(
    params: ParamsResourceAdminProjectsLocationsSubscriptionsSeek,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
