package typings.googleapis.datamigrationV1Mod.datamigrationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datamigration/v1", "datamigration_v1.Resource$Projects$Locations$Migrationjobs")
@js.native
open class ResourceProjectsLocationsMigrationjobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsMigrationjobsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsMigrationjobsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsMigrationjobsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsMigrationjobsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsMigrationjobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new migration job in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.create({
    *     // Required. The ID of the instance to create.
    *     migrationJobId: 'placeholder-value',
    *     // Required. The parent, which owns this collection of migration jobs.
    *     parent: 'projects/my-project/locations/my-location',
    *     // A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "destination": "my_destination",
    *       //   "destinationDatabase": {},
    *       //   "displayName": "my_displayName",
    *       //   "dumpFlags": {},
    *       //   "dumpPath": "my_dumpPath",
    *       //   "duration": "my_duration",
    *       //   "endTime": "my_endTime",
    *       //   "error": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "phase": "my_phase",
    *       //   "reverseSshConnectivity": {},
    *       //   "source": "my_source",
    *       //   "sourceDatabase": {},
    *       //   "state": "my_state",
    *       //   "staticIpConnectivity": {},
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime",
    *       //   "vpcPeeringConnectivity": {}
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
  def create(params: ParamsResourceProjectsLocationsMigrationjobsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsMigrationjobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsMigrationjobsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsMigrationjobsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsMigrationjobsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsMigrationjobsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsMigrationjobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single migration job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.delete({
    *     // The destination CloudSQL connection profile is always deleted with the migration job. In case of force delete, the destination CloudSQL replica database is also deleted.
    *     force: 'placeholder-value',
    *     // Required. Name of the migration job resource to delete.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *     // A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    *     requestId: 'placeholder-value',
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
  def delete(params: ParamsResourceProjectsLocationsMigrationjobsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsMigrationjobsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateSshScript(): GaxiosPromise[SchemaSshScript] = js.native
  def generateSshScript(callback: BodyResponseCallback[SchemaSshScript]): Unit = js.native
  def generateSshScript(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSshScript] = js.native
  def generateSshScript(params: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript): GaxiosPromise[SchemaSshScript] = js.native
  def generateSshScript(
    params: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript,
    callback: BodyResponseCallback[SchemaSshScript]
  ): Unit = js.native
  def generateSshScript(
    params: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript,
    options: BodyResponseCallback[Readable | SchemaSshScript],
    callback: BodyResponseCallback[Readable | SchemaSshScript]
  ): Unit = js.native
  def generateSshScript(params: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript, options: MethodOptions): GaxiosPromise[SchemaSshScript] = js.native
  def generateSshScript(
    params: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSshScript]
  ): Unit = js.native
  /**
    * Generate a SSH configuration script to configure the reverse SSH connectivity.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *     await datamigration.projects.locations.migrationJobs.generateSshScript({
    *       // Name of the migration job resource to generate the SSH script.
    *       migrationJob:
    *         'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "vm": "my_vm",
    *         //   "vmCreationConfig": {},
    *         //   "vmPort": 0,
    *         //   "vmSelectionConfig": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "script": "my_script"
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
  def generateSshScript(
    params: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def generateSshScript(
    params: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMigrationJob] = js.native
  def get(callback: BodyResponseCallback[SchemaMigrationJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMigrationJob] = js.native
  def get(params: ParamsResourceProjectsLocationsMigrationjobsGet): GaxiosPromise[SchemaMigrationJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsMigrationjobsGet,
    callback: BodyResponseCallback[SchemaMigrationJob]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsMigrationjobsGet,
    options: BodyResponseCallback[Readable | SchemaMigrationJob],
    callback: BodyResponseCallback[Readable | SchemaMigrationJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsMigrationjobsGet, options: MethodOptions): GaxiosPromise[SchemaMigrationJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsMigrationjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMigrationJob]
  ): Unit = js.native
  /**
    * Gets details of a single migration job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.get({
    *     // Required. Name of the migration job resource to get.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "destination": "my_destination",
    *   //   "destinationDatabase": {},
    *   //   "displayName": "my_displayName",
    *   //   "dumpFlags": {},
    *   //   "dumpPath": "my_dumpPath",
    *   //   "duration": "my_duration",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "phase": "my_phase",
    *   //   "reverseSshConnectivity": {},
    *   //   "source": "my_source",
    *   //   "sourceDatabase": {},
    *   //   "state": "my_state",
    *   //   "staticIpConnectivity": {},
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime",
    *   //   "vpcPeeringConnectivity": {}
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
  def get(params: ParamsResourceProjectsLocationsMigrationjobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsMigrationjobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsMigrationjobsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsMigrationjobsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.getIamPolicy(
    *     {
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *     }
    *   );
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsMigrationjobsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMigrationJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMigrationJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMigrationJobsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsMigrationjobsList): GaxiosPromise[SchemaListMigrationJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsMigrationjobsList,
    callback: BodyResponseCallback[SchemaListMigrationJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsMigrationjobsList,
    options: BodyResponseCallback[Readable | SchemaListMigrationJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMigrationJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsMigrationjobsList, options: MethodOptions): GaxiosPromise[SchemaListMigrationJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsMigrationjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMigrationJobsResponse]
  ): Unit = js.native
  /**
    * Lists migration jobs in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.list({
    *     // A filter expression that filters migration jobs listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, \>, or <. For example, list migration jobs created this year by specifying **createTime %gt; 2020-01-01T00:00:00.000000000Z.** You can also filter nested fields. For example, you could specify **reverseSshConnectivity.vmIp = "1.2.3.4"** to select all migration jobs connecting through the specific SSH tunnel bastion.
    *     filter: 'placeholder-value',
    *     // Sort the results based on the migration job name. Valid values are: "name", "name asc", and "name desc".
    *     orderBy: 'placeholder-value',
    *     // The maximum number of migration jobs to return. The service may return fewer than this value. If unspecified, at most 50 migration jobs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // The nextPageToken value received in the previous call to migrationJobs.list, used in the subsequent request to retrieve the next page of results. On first call this should be left blank. When paginating, all other parameters provided to migrationJobs.list must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns this collection of migrationJobs.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "migrationJobs": [],
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
  def list(params: ParamsResourceProjectsLocationsMigrationjobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsMigrationjobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsMigrationjobsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsMigrationjobsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsMigrationjobsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsMigrationjobsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsMigrationjobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the parameters of a single migration job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.patch({
    *     // The name (URI) of this migration job resource, in the form of: projects/{project\}/locations/{location\}/migrationJobs/{migrationJob\}.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *     // A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    *     requestId: 'placeholder-value',
    *     // Required. Field mask is used to specify the fields to be overwritten in the migration job resource by the update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "destination": "my_destination",
    *       //   "destinationDatabase": {},
    *       //   "displayName": "my_displayName",
    *       //   "dumpFlags": {},
    *       //   "dumpPath": "my_dumpPath",
    *       //   "duration": "my_duration",
    *       //   "endTime": "my_endTime",
    *       //   "error": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "phase": "my_phase",
    *       //   "reverseSshConnectivity": {},
    *       //   "source": "my_source",
    *       //   "sourceDatabase": {},
    *       //   "state": "my_state",
    *       //   "staticIpConnectivity": {},
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime",
    *       //   "vpcPeeringConnectivity": {}
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
  def patch(params: ParamsResourceProjectsLocationsMigrationjobsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsMigrationjobsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def promote(): GaxiosPromise[SchemaOperation] = js.native
  def promote(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def promote(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def promote(params: ParamsResourceProjectsLocationsMigrationjobsPromote): GaxiosPromise[SchemaOperation] = js.native
  def promote(
    params: ParamsResourceProjectsLocationsMigrationjobsPromote,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def promote(
    params: ParamsResourceProjectsLocationsMigrationjobsPromote,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def promote(params: ParamsResourceProjectsLocationsMigrationjobsPromote, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def promote(
    params: ParamsResourceProjectsLocationsMigrationjobsPromote,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Promote a migration job, stopping replication to the destination and promoting the destination to be a standalone database.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.promote({
    *     // Name of the migration job resource to promote.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def promote(params: ParamsResourceProjectsLocationsMigrationjobsPromote, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def promote(
    params: ParamsResourceProjectsLocationsMigrationjobsPromote,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restart(): GaxiosPromise[SchemaOperation] = js.native
  def restart(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restart(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restart(params: ParamsResourceProjectsLocationsMigrationjobsRestart): GaxiosPromise[SchemaOperation] = js.native
  def restart(
    params: ParamsResourceProjectsLocationsMigrationjobsRestart,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def restart(
    params: ParamsResourceProjectsLocationsMigrationjobsRestart,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def restart(params: ParamsResourceProjectsLocationsMigrationjobsRestart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restart(
    params: ParamsResourceProjectsLocationsMigrationjobsRestart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Restart a stopped or failed migration job, resetting the destination instance to its original state and starting the migration process from scratch.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.restart({
    *     // Name of the migration job resource to restart.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def restart(params: ParamsResourceProjectsLocationsMigrationjobsRestart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restart(
    params: ParamsResourceProjectsLocationsMigrationjobsRestart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resume(): GaxiosPromise[SchemaOperation] = js.native
  def resume(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resume(params: ParamsResourceProjectsLocationsMigrationjobsResume): GaxiosPromise[SchemaOperation] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsMigrationjobsResume,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resume(
    params: ParamsResourceProjectsLocationsMigrationjobsResume,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def resume(params: ParamsResourceProjectsLocationsMigrationjobsResume, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsMigrationjobsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Resume a migration job that is currently stopped and is resumable (was stopped during CDC phase).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.resume({
    *     // Name of the migration job resource to resume.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def resume(params: ParamsResourceProjectsLocationsMigrationjobsResume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsMigrationjobsResume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsMigrationjobsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsMigrationjobsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.setIamPolicy(
    *     {
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {},
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     }
    *   );
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsMigrationjobsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsMigrationjobsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceProjectsLocationsMigrationjobsStart): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsMigrationjobsStart,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def start(
    params: ParamsResourceProjectsLocationsMigrationjobsStart,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsLocationsMigrationjobsStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsMigrationjobsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Start an already created migration job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.start({
    *     // Name of the migration job resource to start.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def start(params: ParamsResourceProjectsLocationsMigrationjobsStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceProjectsLocationsMigrationjobsStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaOperation] = js.native
  def stop(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceProjectsLocationsMigrationjobsStop): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsMigrationjobsStop,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsMigrationjobsStop,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsMigrationjobsStop, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsMigrationjobsStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Stops a running migration job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.stop({
    *     // Name of the migration job resource to stop.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def stop(params: ParamsResourceProjectsLocationsMigrationjobsStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsMigrationjobsStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsMigrationjobsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsMigrationjobsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsMigrationjobsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsMigrationjobsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsMigrationjobsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *     await datamigration.projects.locations.migrationJobs.testIamPermissions({
    *       // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     });
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
    params: ParamsResourceProjectsLocationsMigrationjobsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsMigrationjobsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verify(): GaxiosPromise[SchemaOperation] = js.native
  def verify(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def verify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def verify(params: ParamsResourceProjectsLocationsMigrationjobsVerify): GaxiosPromise[SchemaOperation] = js.native
  def verify(
    params: ParamsResourceProjectsLocationsMigrationjobsVerify,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def verify(
    params: ParamsResourceProjectsLocationsMigrationjobsVerify,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def verify(params: ParamsResourceProjectsLocationsMigrationjobsVerify, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def verify(
    params: ParamsResourceProjectsLocationsMigrationjobsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Verify a migration job, making sure the destination can reach the source and that all configuration and prerequisites are met.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datamigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datamigration = google.datamigration('v1');
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
    *   const res = await datamigration.projects.locations.migrationJobs.verify({
    *     // Name of the migration job resource to verify.
    *     name: 'projects/my-project/locations/my-location/migrationJobs/my-migrationJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def verify(params: ParamsResourceProjectsLocationsMigrationjobsVerify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verify(
    params: ParamsResourceProjectsLocationsMigrationjobsVerify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
