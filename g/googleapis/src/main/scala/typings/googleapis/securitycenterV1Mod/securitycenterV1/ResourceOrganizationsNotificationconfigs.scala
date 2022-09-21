package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Organizations$Notificationconfigs")
@js.native
open class ResourceOrganizationsNotificationconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaNotificationConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaNotificationConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationConfig] = js.native
  def create(params: ParamsResourceOrganizationsNotificationconfigsCreate): GaxiosPromise[SchemaNotificationConfig] = js.native
  def create(
    params: ParamsResourceOrganizationsNotificationconfigsCreate,
    callback: BodyResponseCallback[SchemaNotificationConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsNotificationconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaNotificationConfig],
    callback: BodyResponseCallback[Readable | SchemaNotificationConfig]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsNotificationconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaNotificationConfig] = js.native
  def create(
    params: ParamsResourceOrganizationsNotificationconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationConfig]
  ): Unit = js.native
  /**
    * Creates a notification config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.organizations.notificationConfigs.create({
    *     // Required. Unique identifier provided by the client within the parent scope. It must be between 1 and 128 characters, and contains alphanumeric characters, underscores or hyphens only.
    *     configId: 'placeholder-value',
    *     // Required. Resource name of the new notification config's parent. Its format is "organizations/[organization_id]" or "projects/[project_id]".
    *     parent: 'organizations/my-organization',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "name": "my_name",
    *       //   "pubsubTopic": "my_pubsubTopic",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "streamingConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "pubsubTopic": "my_pubsubTopic",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "streamingConfig": {}
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
  def create(params: ParamsResourceOrganizationsNotificationconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsNotificationconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsNotificationconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsNotificationconfigsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsNotificationconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsNotificationconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsNotificationconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a notification config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.organizations.notificationConfigs.delete({
    *     // Required. Name of the notification config to delete. Its format is "organizations/[organization_id]/notificationConfigs/[config_id]".
    *     name: 'organizations/my-organization/notificationConfigs/my-notificationConfig',
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
  def delete(params: ParamsResourceOrganizationsNotificationconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsNotificationconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNotificationConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaNotificationConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationConfig] = js.native
  def get(params: ParamsResourceOrganizationsNotificationconfigsGet): GaxiosPromise[SchemaNotificationConfig] = js.native
  def get(
    params: ParamsResourceOrganizationsNotificationconfigsGet,
    callback: BodyResponseCallback[SchemaNotificationConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsNotificationconfigsGet,
    options: BodyResponseCallback[Readable | SchemaNotificationConfig],
    callback: BodyResponseCallback[Readable | SchemaNotificationConfig]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsNotificationconfigsGet, options: MethodOptions): GaxiosPromise[SchemaNotificationConfig] = js.native
  def get(
    params: ParamsResourceOrganizationsNotificationconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationConfig]
  ): Unit = js.native
  /**
    * Gets a notification config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.organizations.notificationConfigs.get({
    *     // Required. Name of the notification config to get. Its format is "organizations/[organization_id]/notificationConfigs/[config_id]".
    *     name: 'organizations/my-organization/notificationConfigs/my-notificationConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "pubsubTopic": "my_pubsubTopic",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "streamingConfig": {}
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
  def get(params: ParamsResourceOrganizationsNotificationconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsNotificationconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNotificationConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNotificationConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNotificationConfigsResponse] = js.native
  def list(params: ParamsResourceOrganizationsNotificationconfigsList): GaxiosPromise[SchemaListNotificationConfigsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsNotificationconfigsList,
    callback: BodyResponseCallback[SchemaListNotificationConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsNotificationconfigsList,
    options: BodyResponseCallback[Readable | SchemaListNotificationConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListNotificationConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsNotificationconfigsList, options: MethodOptions): GaxiosPromise[SchemaListNotificationConfigsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsNotificationconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNotificationConfigsResponse]
  ): Unit = js.native
  /**
    * Lists notification configs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.organizations.notificationConfigs.list({
    *     // The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListNotificationConfigsResponse`; indicates that this is a continuation of a prior `ListNotificationConfigs` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the organization to list notification configs. Its format is "organizations/[organization_id]" or "projects/[project_id]".
    *     parent: 'organizations/my-organization',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "notificationConfigs": []
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
  def list(params: ParamsResourceOrganizationsNotificationconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsNotificationconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaNotificationConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaNotificationConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationConfig] = js.native
  def patch(params: ParamsResourceOrganizationsNotificationconfigsPatch): GaxiosPromise[SchemaNotificationConfig] = js.native
  def patch(
    params: ParamsResourceOrganizationsNotificationconfigsPatch,
    callback: BodyResponseCallback[SchemaNotificationConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsNotificationconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaNotificationConfig],
    callback: BodyResponseCallback[Readable | SchemaNotificationConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsNotificationconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaNotificationConfig] = js.native
  def patch(
    params: ParamsResourceOrganizationsNotificationconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationConfig]
  ): Unit = js.native
  /**
    *  Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.organizations.notificationConfigs.patch({
    *     // The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id\}/notificationConfigs/notify_public_bucket".
    *     name: 'organizations/my-organization/notificationConfigs/my-notificationConfig',
    *     // The FieldMask to use when updating the notification config. If empty all mutable fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "name": "my_name",
    *       //   "pubsubTopic": "my_pubsubTopic",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "streamingConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "pubsubTopic": "my_pubsubTopic",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "streamingConfig": {}
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
  def patch(params: ParamsResourceOrganizationsNotificationconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsNotificationconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
