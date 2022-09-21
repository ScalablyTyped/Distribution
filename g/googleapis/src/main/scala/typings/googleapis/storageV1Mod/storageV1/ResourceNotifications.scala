package typings.googleapis.storageV1Mod.storageV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Notifications")
@js.native
open class ResourceNotifications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceNotificationsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceNotificationsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceNotificationsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceNotificationsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceNotificationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Permanently deletes a notification subscription.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.notifications.delete({
    *     // The parent bucket of the notification.
    *     bucket: 'placeholder-value',
    *     // ID of the notification to delete.
    *     notification: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceNotificationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceNotificationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNotification] = js.native
  def get(callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def get(params: ParamsResourceNotificationsGet): GaxiosPromise[SchemaNotification] = js.native
  def get(params: ParamsResourceNotificationsGet, callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(
    params: ParamsResourceNotificationsGet,
    options: BodyResponseCallback[Readable | SchemaNotification],
    callback: BodyResponseCallback[Readable | SchemaNotification]
  ): Unit = js.native
  def get(params: ParamsResourceNotificationsGet, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def get(
    params: ParamsResourceNotificationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  /**
    * View a notification configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.notifications.get({
    *     // The parent bucket of the notification.
    *     bucket: 'placeholder-value',
    *     // Notification ID
    *     notification: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "custom_attributes": {},
    *   //   "etag": "my_etag",
    *   //   "event_types": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "object_name_prefix": "my_object_name_prefix",
    *   //   "payload_format": "my_payload_format",
    *   //   "selfLink": "my_selfLink",
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
  def get(params: ParamsResourceNotificationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNotificationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaNotification] = js.native
  def insert(callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def insert(params: ParamsResourceNotificationsInsert): GaxiosPromise[SchemaNotification] = js.native
  def insert(params: ParamsResourceNotificationsInsert, callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def insert(
    params: ParamsResourceNotificationsInsert,
    options: BodyResponseCallback[Readable | SchemaNotification],
    callback: BodyResponseCallback[Readable | SchemaNotification]
  ): Unit = js.native
  def insert(params: ParamsResourceNotificationsInsert, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def insert(
    params: ParamsResourceNotificationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  /**
    * Creates a notification subscription for a given bucket.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.notifications.insert({
    *     // The parent bucket of the notification.
    *     bucket: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "custom_attributes": {},
    *       //   "etag": "my_etag",
    *       //   "event_types": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "object_name_prefix": "my_object_name_prefix",
    *       //   "payload_format": "my_payload_format",
    *       //   "selfLink": "my_selfLink",
    *       //   "topic": "my_topic"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "custom_attributes": {},
    *   //   "etag": "my_etag",
    *   //   "event_types": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "object_name_prefix": "my_object_name_prefix",
    *   //   "payload_format": "my_payload_format",
    *   //   "selfLink": "my_selfLink",
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
  def insert(params: ParamsResourceNotificationsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceNotificationsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaNotifications] = js.native
  def list(callback: BodyResponseCallback[SchemaNotifications]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotifications] = js.native
  def list(params: ParamsResourceNotificationsList): GaxiosPromise[SchemaNotifications] = js.native
  def list(params: ParamsResourceNotificationsList, callback: BodyResponseCallback[SchemaNotifications]): Unit = js.native
  def list(
    params: ParamsResourceNotificationsList,
    options: BodyResponseCallback[Readable | SchemaNotifications],
    callback: BodyResponseCallback[Readable | SchemaNotifications]
  ): Unit = js.native
  def list(params: ParamsResourceNotificationsList, options: MethodOptions): GaxiosPromise[SchemaNotifications] = js.native
  def list(
    params: ParamsResourceNotificationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotifications]
  ): Unit = js.native
  /**
    * Retrieves a list of notification subscriptions for a given bucket.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.notifications.list({
    *     // Name of a Google Cloud Storage bucket.
    *     bucket: 'placeholder-value',
    *     // The project to be billed for this request. Required for Requester Pays buckets.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind"
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
  def list(params: ParamsResourceNotificationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNotificationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
