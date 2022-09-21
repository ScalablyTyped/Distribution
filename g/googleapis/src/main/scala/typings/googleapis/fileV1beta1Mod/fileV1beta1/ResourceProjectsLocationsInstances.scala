package typings.googleapis.fileV1beta1Mod.fileV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/file/v1beta1", "file_v1beta1.Resource$Projects$Locations$Instances")
@js.native
open class ResourceProjectsLocationsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates an instance. When creating from a backup, the capacity of the new instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than the minimum capacity of the tier).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/file.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const file = google.file('v1beta1');
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
    *   const res = await file.projects.locations.instances.create({
    *     // Required. The ID of the instance to create. The ID must be unique within the specified project and location. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
    *     instanceId: 'placeholder-value',
    *     // Required. The instance's project and location, in the format `projects/{project_id\}/locations/{location\}`. In Filestore, locations map to GCP zones, for example **us-west1-b**.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "capacityGb": "my_capacityGb",
    *       //   "capacityStepSizeGb": "my_capacityStepSizeGb",
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "fileShares": [],
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "labels": {},
    *       //   "maxCapacityGb": "my_maxCapacityGb",
    *       //   "maxShareCount": "my_maxShareCount",
    *       //   "multiShareEnabled": false,
    *       //   "name": "my_name",
    *       //   "networks": [],
    *       //   "satisfiesPzs": false,
    *       //   "state": "my_state",
    *       //   "statusMessage": "my_statusMessage",
    *       //   "suspensionReasons": [],
    *       //   "tier": "my_tier"
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
  def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes an instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/file.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const file = google.file('v1beta1');
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
    *   const res = await file.projects.locations.instances.delete({
    *     // If set to true, any snapshots of the instance will also be deleted. (Otherwise, the request will only work if the instance has no snapshots.)
    *     force: 'placeholder-value',
    *     // Required. The instance resource name, in the format `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
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
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: BodyResponseCallback[Readable | SchemaInstance],
    callback: BodyResponseCallback[Readable | SchemaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  /**
    * Gets the details of a specific instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/file.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const file = google.file('v1beta1');
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
    *   const res = await file.projects.locations.instances.get({
    *     // Required. The instance resource name, in the format `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`.
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "capacityGb": "my_capacityGb",
    *   //   "capacityStepSizeGb": "my_capacityStepSizeGb",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "fileShares": [],
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "labels": {},
    *   //   "maxCapacityGb": "my_maxCapacityGb",
    *   //   "maxShareCount": "my_maxShareCount",
    *   //   "multiShareEnabled": false,
    *   //   "name": "my_name",
    *   //   "networks": [],
    *   //   "satisfiesPzs": false,
    *   //   "state": "my_state",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "suspensionReasons": [],
    *   //   "tier": "my_tier"
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
  def get(params: ParamsResourceProjectsLocationsInstancesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstancesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: BodyResponseCallback[Readable | SchemaListInstancesResponse],
    callback: BodyResponseCallback[Readable | SchemaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  /**
    * Lists all instances in a project for either a specified location or for all locations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/file.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const file = google.file('v1beta1');
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
    *   const res = await file.projects.locations.instances.list({
    *     // List filter.
    *     filter: 'placeholder-value',
    *     // Sort results. Supported values are "name", "name desc" or "" (unsorted).
    *     orderBy: 'placeholder-value',
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value to use if there are additional results to retrieve for this list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project and location for which to retrieve instance information, in the format `projects/{project_id\}/locations/{location\}`. In Cloud Filestore, locations map to GCP zones, for example **us-west1-b**. To retrieve instance information for all locations, use "-" for the `{location\}` value.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "instances": [],
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
  def list(params: ParamsResourceProjectsLocationsInstancesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the settings of a specific instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/file.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const file = google.file('v1beta1');
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
    *   const res = await file.projects.locations.instances.patch({
    *     // Output only. The resource name of the instance, in the format `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}`.
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *     // Required. Mask of fields to update. At least one path must be supplied in this field. The elements of the repeated paths field may only include these fields: * "description" * "file_shares" * "labels"
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "capacityGb": "my_capacityGb",
    *       //   "capacityStepSizeGb": "my_capacityStepSizeGb",
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "fileShares": [],
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "labels": {},
    *       //   "maxCapacityGb": "my_maxCapacityGb",
    *       //   "maxShareCount": "my_maxShareCount",
    *       //   "multiShareEnabled": false,
    *       //   "name": "my_name",
    *       //   "networks": [],
    *       //   "satisfiesPzs": false,
    *       //   "state": "my_state",
    *       //   "statusMessage": "my_statusMessage",
    *       //   "suspensionReasons": [],
    *       //   "tier": "my_tier"
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
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restore(): GaxiosPromise[SchemaOperation] = js.native
  def restore(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(params: ParamsResourceProjectsLocationsInstancesRestore): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsInstancesRestore,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsLocationsInstancesRestore,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def restore(params: ParamsResourceProjectsLocationsInstancesRestore, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsInstancesRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Restores an existing instance's file share from a backup. The capacity of the instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than the minimum capacity of the tier).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/file.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const file = google.file('v1beta1');
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
    *   const res = await file.projects.locations.instances.restore({
    *     // Required. The resource name of the instance, in the format `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}`.
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fileShare": "my_fileShare",
    *       //   "sourceBackup": "my_sourceBackup",
    *       //   "sourceSnapshot": "my_sourceSnapshot"
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
  def restore(params: ParamsResourceProjectsLocationsInstancesRestore, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsInstancesRestore,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaOperation] = js.native
  def revert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def revert(params: ParamsResourceProjectsLocationsInstancesRevert): GaxiosPromise[SchemaOperation] = js.native
  def revert(
    params: ParamsResourceProjectsLocationsInstancesRevert,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def revert(
    params: ParamsResourceProjectsLocationsInstancesRevert,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def revert(params: ParamsResourceProjectsLocationsInstancesRevert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def revert(
    params: ParamsResourceProjectsLocationsInstancesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Revert an existing instance's file system to a specified snapshot.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/file.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const file = google.file('v1beta1');
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
    *   const res = await file.projects.locations.instances.revert({
    *     // Required. projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}. The resource name of the instance, in the format
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "targetSnapshotId": "my_targetSnapshotId"
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
  def revert(params: ParamsResourceProjectsLocationsInstancesRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourceProjectsLocationsInstancesRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var shares: ResourceProjectsLocationsInstancesShares = js.native
  
  var snapshots: ResourceProjectsLocationsInstancesSnapshots = js.native
}
