package typings.googleapis.gkebackupV1Mod.gkebackupV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gkebackup/v1", "gkebackup_v1.Resource$Projects$Locations$Backupplans$Backups$Volumebackups")
@js.native
open class ResourceProjectsLocationsBackupplansBackupsVolumebackups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaVolumeBackup] = js.native
  def get(callback: BodyResponseCallback[SchemaVolumeBackup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumeBackup] = js.native
  def get(params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet): GaxiosPromise[SchemaVolumeBackup] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet,
    callback: BodyResponseCallback[SchemaVolumeBackup]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet,
    options: BodyResponseCallback[Readable | SchemaVolumeBackup],
    callback: BodyResponseCallback[Readable | SchemaVolumeBackup]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet, options: MethodOptions): GaxiosPromise[SchemaVolumeBackup] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumeBackup]
  ): Unit = js.native
  /**
    * Retrieve the details of a single VolumeBackup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gkebackup.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gkebackup = google.gkebackup('v1');
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
    *     await gkebackup.projects.locations.backupPlans.backups.volumeBackups.get({
    *       // Required. Full name of the VolumeBackup resource. Format: `projects/x/locations/x/backupPlans/x/backups/x/volumeBackups/x`
    *       name: 'projects/my-project/locations/my-location/backupPlans/my-backupPlan/backups/my-backup/volumeBackups/my-volumeBackup',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completeTime": "my_completeTime",
    *   //   "createTime": "my_createTime",
    *   //   "diskSizeBytes": "my_diskSizeBytes",
    *   //   "etag": "my_etag",
    *   //   "format": "my_format",
    *   //   "name": "my_name",
    *   //   "sourcePvc": {},
    *   //   "state": "my_state",
    *   //   "stateMessage": "my_stateMessage",
    *   //   "storageBytes": "my_storageBytes",
    *   //   "uid": "my_uid",
    *   //   "updateTime": "my_updateTime",
    *   //   "volumeBackupHandle": "my_volumeBackupHandle"
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
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gkebackup.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gkebackup = google.gkebackup('v1');
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
    *     await gkebackup.projects.locations.backupPlans.backups.volumeBackups.getIamPolicy(
    *       {
    *         // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *         'options.requestedPolicyVersion': 'placeholder-value',
    *         // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/backupPlans/my-backupPlan/backups/my-backup/volumeBackups/my-volumeBackup',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListVolumeBackupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVolumeBackupsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVolumeBackupsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsList): GaxiosPromise[SchemaListVolumeBackupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsList,
    callback: BodyResponseCallback[SchemaListVolumeBackupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsList,
    options: BodyResponseCallback[Readable | SchemaListVolumeBackupsResponse],
    callback: BodyResponseCallback[Readable | SchemaListVolumeBackupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsList, options: MethodOptions): GaxiosPromise[SchemaListVolumeBackupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVolumeBackupsResponse]
  ): Unit = js.native
  /**
    * Lists the VolumeBackups for a given Backup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gkebackup.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gkebackup = google.gkebackup('v1');
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
    *     await gkebackup.projects.locations.backupPlans.backups.volumeBackups.list({
    *       // Field match expression used to filter the results.
    *       filter: 'placeholder-value',
    *       // Field by which to sort the results.
    *       orderBy: 'placeholder-value',
    *       // The target number of results to return in a single response. If not specified, a default value will be chosen by the service. Note that the response may inclue a partial list and a caller should only rely on the response's next_page_token to determine if there are more instances left to be queried.
    *       pageSize: 'placeholder-value',
    *       // The value of next_page_token received from a previous `ListVolumeBackups` call. Provide this to retrieve the subsequent page in a multi-page list of results. When paginating, all other parameters provided to `ListVolumeBackups` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The Backup that contains the VolumeBackups to list. Format: `projects/x/locations/x/backupPlans/x/backups/x`
    *       parent:
    *         'projects/my-project/locations/my-location/backupPlans/my-backupPlan/backups/my-backup',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "volumeBackups": []
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
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gkebackup.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gkebackup = google.gkebackup('v1');
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
    *     await gkebackup.projects.locations.backupPlans.backups.volumeBackups.setIamPolicy(
    *       {
    *         // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/backupPlans/my-backupPlan/backups/my-backup/volumeBackups/my-volumeBackup',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "policy": {},
    *           //   "updateMask": "my_updateMask"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gkebackup.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gkebackup = google.gkebackup('v1');
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
    *     await gkebackup.projects.locations.backupPlans.backups.volumeBackups.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/backupPlans/my-backupPlan/backups/my-backup/volumeBackups/my-volumeBackup',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
