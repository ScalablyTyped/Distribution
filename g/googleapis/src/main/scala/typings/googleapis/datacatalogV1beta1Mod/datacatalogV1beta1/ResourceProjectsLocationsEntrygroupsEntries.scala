package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1beta1", "datacatalog_v1beta1.Resource$Projects$Locations$Entrygroups$Entries")
@js.native
open class ResourceProjectsLocationsEntrygroupsEntries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  /**
    * Creates an entry. Only entries of 'FILESET' type or user-specified type can be created. Users should enable the Data Catalog API in the project identified by the `parent` parameter (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information). A maximum of 100,000 entries may be created per entry group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.entryGroups.entries.create({
    *     // Required. The id of the entry to create.
    *     entryId: 'placeholder-value',
    *     // Required. The name of the entry group this entry is in. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\} Note that this Entry and its child resources may not actually be stored in the location in this name.
    *     parent:
    *       'projects/my-project/locations/my-location/entryGroups/my-entryGroup',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bigqueryDateShardedSpec": {},
    *       //   "bigqueryTableSpec": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "gcsFilesetSpec": {},
    *       //   "integratedSystem": "my_integratedSystem",
    *       //   "linkedResource": "my_linkedResource",
    *       //   "name": "my_name",
    *       //   "schema": {},
    *       //   "sourceSystemTimestamps": {},
    *       //   "type": "my_type",
    *       //   "usageSignal": {},
    *       //   "userSpecifiedSystem": "my_userSpecifiedSystem",
    *       //   "userSpecifiedType": "my_userSpecifiedType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDateShardedSpec": {},
    *   //   "bigqueryTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "schema": {},
    *   //   "sourceSystemTimestamps": {},
    *   //   "type": "my_type",
    *   //   "usageSignal": {},
    *   //   "userSpecifiedSystem": "my_userSpecifiedSystem",
    *   //   "userSpecifiedType": "my_userSpecifiedType"
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
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing entry. Only entries created through CreateEntry method can be deleted. Users should enable the Data Catalog API in the project identified by the `name` parameter (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.entryGroups.entries.delete({
    *     // Required. The name of the entry. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\}
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
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
  def delete(params: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def get(params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  /**
    * Gets an entry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.entryGroups.entries.get({
    *     // Required. The name of the entry. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\}
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDateShardedSpec": {},
    *   //   "bigqueryTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "schema": {},
    *   //   "sourceSystemTimestamps": {},
    *   //   "type": "my_type",
    *   //   "usageSignal": {},
    *   //   "userSpecifiedSystem": "my_userSpecifiedSystem",
    *   //   "userSpecifiedType": "my_userSpecifiedType"
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
  def get(params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsEntrygroupsEntriesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsEntrygroupsEntriesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. A `NOT_FOUND` error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it. Supported resources are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external Google Cloud Platform resources synced to Data Catalog. Callers must have following Google IAM permission - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates. - `datacatalog.entries.getIamPolicy` to get policies on entries. - `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *     await datacatalog.projects.locations.entryGroups.entries.getIamPolicy({
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "options": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesList): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1ListEntriesResponse]
  ): Unit = js.native
  /**
    * Lists entries.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.entryGroups.entries.list({
    *     // The maximum number of items to return. Default is 10. Max limit is 1000. Throws an invalid argument for `page_size \> 1000`.
    *     pageSize: 'placeholder-value',
    *     // Token that specifies which page is requested. If empty, the first page is returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the entry group that contains the entries, which can be provided in URL format. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}
    *     parent:
    *       'projects/my-project/locations/my-location/entryGroups/my-entryGroup',
    *     // The fields to return for each Entry. If not set or empty, all fields are returned. For example, setting read_mask to contain only one path "name" will cause ListEntries to return a list of Entries with only "name" field.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
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
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  /**
    * Updates an existing entry. Users should enable the Data Catalog API in the project identified by the `entry.name` parameter (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.entryGroups.entries.patch({
    *     // Output only. The Data Catalog resource name of the entry in URL format. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\} Note that this Entry and its child resources may not actually be stored in the location in this name.
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *     // Names of fields whose values to overwrite on an entry. If this parameter is absent or empty, all modifiable fields are overwritten. If such fields are non-required and omitted in the request body, their values are emptied. The following fields are modifiable: * For entries with type `DATA_STREAM`: * `schema` * For entries with type `FILESET`: * `schema` * `display_name` * `description` * `gcs_fileset_spec` * `gcs_fileset_spec.file_patterns` * For entries with `user_specified_type`: * `schema` * `display_name` * `description` * `user_specified_type` * `user_specified_system` * `linked_resource` * `source_system_timestamps`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bigqueryDateShardedSpec": {},
    *       //   "bigqueryTableSpec": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "gcsFilesetSpec": {},
    *       //   "integratedSystem": "my_integratedSystem",
    *       //   "linkedResource": "my_linkedResource",
    *       //   "name": "my_name",
    *       //   "schema": {},
    *       //   "sourceSystemTimestamps": {},
    *       //   "type": "my_type",
    *       //   "usageSignal": {},
    *       //   "userSpecifiedSystem": "my_userSpecifiedSystem",
    *       //   "userSpecifiedType": "my_userSpecifiedType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDateShardedSpec": {},
    *   //   "bigqueryTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "schema": {},
    *   //   "sourceSystemTimestamps": {},
    *   //   "type": "my_type",
    *   //   "usageSignal": {},
    *   //   "userSpecifiedSystem": "my_userSpecifiedSystem",
    *   //   "userSpecifiedType": "my_userSpecifiedType"
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
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var tags: ResourceProjectsLocationsEntrygroupsEntriesTags = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsEntrygroupsEntriesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns the caller's permissions on a resource. If the resource does not exist, an empty set of permissions is returned (We don't return a `NOT_FOUND` error). Supported resources are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external Google Cloud Platform resources synced to Data Catalog. A caller is not required to have Google IAM permission to make this request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *     await datacatalog.projects.locations.entryGroups.entries.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
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
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
