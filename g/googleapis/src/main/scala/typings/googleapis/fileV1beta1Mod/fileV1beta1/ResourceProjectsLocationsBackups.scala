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

@JSImport("googleapis/build/src/apis/file/v1beta1", "file_v1beta1.Resource$Projects$Locations$Backups")
@js.native
open class ResourceProjectsLocationsBackups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsBackupsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBackupsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsBackupsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsBackupsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBackupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a backup.
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
    *   const res = await file.projects.locations.backups.create({
    *     // Required. The ID to use for the backup. The ID must be unique within the specified project and location. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
    *     backupId: 'placeholder-value',
    *     // Required. The backup's project and location, in the format `projects/{project_id\}/locations/{location\}`. In Filestore, backup locations map to GCP regions, for example **us-west1**.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "capacityGb": "my_capacityGb",
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "downloadBytes": "my_downloadBytes",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "satisfiesPzs": false,
    *       //   "sourceFileShare": "my_sourceFileShare",
    *       //   "sourceInstance": "my_sourceInstance",
    *       //   "sourceInstanceTier": "my_sourceInstanceTier",
    *       //   "state": "my_state",
    *       //   "storageBytes": "my_storageBytes"
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
  def create(params: ParamsResourceProjectsLocationsBackupsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBackupsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsBackupsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBackupsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBackupsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsBackupsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBackupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a backup.
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
    *   const res = await file.projects.locations.backups.delete({
    *     // Required. The backup resource name, in the format `projects/{project_id\}/locations/{location\}/backups/{backup_id\}`
    *     name: 'projects/my-project/locations/my-location/backups/my-backup',
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
  def delete(params: ParamsResourceProjectsLocationsBackupsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBackupsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBackup] = js.native
  def get(callback: BodyResponseCallback[SchemaBackup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBackup] = js.native
  def get(params: ParamsResourceProjectsLocationsBackupsGet): GaxiosPromise[SchemaBackup] = js.native
  def get(params: ParamsResourceProjectsLocationsBackupsGet, callback: BodyResponseCallback[SchemaBackup]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsBackupsGet,
    options: BodyResponseCallback[Readable | SchemaBackup],
    callback: BodyResponseCallback[Readable | SchemaBackup]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsBackupsGet, options: MethodOptions): GaxiosPromise[SchemaBackup] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBackupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackup]
  ): Unit = js.native
  /**
    * Gets the details of a specific backup.
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
    *   const res = await file.projects.locations.backups.get({
    *     // Required. The backup resource name, in the format `projects/{project_id\}/locations/{location\}/backups/{backup_id\}`.
    *     name: 'projects/my-project/locations/my-location/backups/my-backup',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "capacityGb": "my_capacityGb",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "downloadBytes": "my_downloadBytes",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "satisfiesPzs": false,
    *   //   "sourceFileShare": "my_sourceFileShare",
    *   //   "sourceInstance": "my_sourceInstance",
    *   //   "sourceInstanceTier": "my_sourceInstanceTier",
    *   //   "state": "my_state",
    *   //   "storageBytes": "my_storageBytes"
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
  def get(params: ParamsResourceProjectsLocationsBackupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBackupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBackupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBackupsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBackupsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsBackupsList): GaxiosPromise[SchemaListBackupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupsList,
    callback: BodyResponseCallback[SchemaListBackupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupsList,
    options: BodyResponseCallback[Readable | SchemaListBackupsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBackupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsBackupsList, options: MethodOptions): GaxiosPromise[SchemaListBackupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBackupsResponse]
  ): Unit = js.native
  /**
    * Lists all backups in a project for either a specified location or for all locations.
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
    *   const res = await file.projects.locations.backups.list({
    *     // List filter.
    *     filter: 'placeholder-value',
    *     // Sort results. Supported values are "name", "name desc" or "" (unsorted).
    *     orderBy: 'placeholder-value',
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value to use if there are additional results to retrieve for this list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project and location for which to retrieve backup information, in the format `projects/{project_id\}/locations/{location\}`. In Filestore, backup locations map to GCP regions, for example **us-west1**. To retrieve backup information for all locations, use "-" for the `{location\}` value.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backups": [],
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
  def list(params: ParamsResourceProjectsLocationsBackupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsBackupsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBackupsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBackupsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsBackupsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBackupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the settings of a specific backup.
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
    *   const res = await file.projects.locations.backups.patch({
    *     // Output only. The resource name of the backup, in the format `projects/{project_id\}/locations/{location_id\}/backups/{backup_id\}`.
    *     name: 'projects/my-project/locations/my-location/backups/my-backup',
    *     // Required. Mask of fields to update. At least one path must be supplied in this field.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "capacityGb": "my_capacityGb",
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "downloadBytes": "my_downloadBytes",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "satisfiesPzs": false,
    *       //   "sourceFileShare": "my_sourceFileShare",
    *       //   "sourceInstance": "my_sourceInstance",
    *       //   "sourceInstanceTier": "my_sourceInstanceTier",
    *       //   "state": "my_state",
    *       //   "storageBytes": "my_storageBytes"
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
  def patch(params: ParamsResourceProjectsLocationsBackupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBackupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
