package typings.googleapis.datacatalogV1Mod.datacatalogV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1", "datacatalog_v1.Resource$Projects$Locations$Entrygroups$Entries")
@js.native
open class ResourceProjectsLocationsEntrygroupsEntries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  /**
    * Creates an entry. You can create entries only with 'FILESET', 'CLUSTER', 'DATA_STREAM', or custom types. Data Catalog automatically creates entries with other types during metadata ingestion from integrated systems. You must enable the Data Catalog API in the project identified by the `parent` parameter. For more information, see [Data Catalog resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project). An entry group can have a maximum of 100,000 entries.
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
    * const datacatalog = google.datacatalog('v1');
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
    *     // Required. The ID of the entry to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores (_). The maximum size is 64 bytes when encoded in UTF-8.
    *     entryId: 'placeholder-value',
    *     // Required. The name of the entry group this entry belongs to. Note: The entry itself and its child resources might not be stored in the location specified in its name.
    *     parent:
    *       'projects/my-project/locations/my-location/entryGroups/my-entryGroup',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bigqueryDateShardedSpec": {},
    *       //   "bigqueryTableSpec": {},
    *       //   "businessContext": {},
    *       //   "dataSource": {},
    *       //   "dataSourceConnectionSpec": {},
    *       //   "databaseTableSpec": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "filesetSpec": {},
    *       //   "fullyQualifiedName": "my_fullyQualifiedName",
    *       //   "gcsFilesetSpec": {},
    *       //   "integratedSystem": "my_integratedSystem",
    *       //   "labels": {},
    *       //   "linkedResource": "my_linkedResource",
    *       //   "name": "my_name",
    *       //   "personalDetails": {},
    *       //   "routineSpec": {},
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
    *   //   "businessContext": {},
    *   //   "dataSource": {},
    *   //   "dataSourceConnectionSpec": {},
    *   //   "databaseTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "filesetSpec": {},
    *   //   "fullyQualifiedName": "my_fullyQualifiedName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "labels": {},
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "personalDetails": {},
    *   //   "routineSpec": {},
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
    * Deletes an existing entry. You can delete only the entries created by the CreateEntry method. You must enable the Data Catalog API in the project identified by the `name` parameter. For more information, see [Data Catalog resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
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
    * const datacatalog = google.datacatalog('v1');
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
    *     // Required. The name of the entry to delete.
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
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def get(params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
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
    * const datacatalog = google.datacatalog('v1');
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
    *     // Required. The name of the entry to get.
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDateShardedSpec": {},
    *   //   "bigqueryTableSpec": {},
    *   //   "businessContext": {},
    *   //   "dataSource": {},
    *   //   "dataSourceConnectionSpec": {},
    *   //   "databaseTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "filesetSpec": {},
    *   //   "fullyQualifiedName": "my_fullyQualifiedName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "labels": {},
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "personalDetails": {},
    *   //   "routineSpec": {},
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
    * Gets the access control policy for a resource. May return: * A`NOT_FOUND` error if the resource doesn't exist or you don't have the permission to view it. * An empty policy if the resource exists but doesn't have a set policy. Supported resources are: - Tag templates - Entry groups Note: This method doesn't get policies from Google Cloud Platform resources ingested into Data Catalog. To call this method, you must have the following Google IAM permissions: - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates. - `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
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
    * const datacatalog = google.datacatalog('v1');
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
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListEntriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListEntriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesList): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListEntriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ListEntriesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1ListEntriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsEntrygroupsEntriesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1ListEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1ListEntriesResponse]
  ): Unit = js.native
  /**
    * Lists entries. Note: Currently, this method can list only custom entries. To get a list of both custom and automatically created entries, use SearchCatalog.
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
    * const datacatalog = google.datacatalog('v1');
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
    *     // The maximum number of items to return. Default is 10. Maximum limit is 1000. Throws an invalid argument if `page_size` is more than 1000.
    *     pageSize: 'placeholder-value',
    *     // Pagination token that specifies the next page to return. If empty, the first page is returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the entry group that contains the entries to list. Can be provided in URL format.
    *     parent:
    *       'projects/my-project/locations/my-location/entryGroups/my-entryGroup',
    *     // The fields to return for each entry. If empty or omitted, all fields are returned. For example, to return a list of entries with only the `name` field, set `read_mask` to only one path with the `name` value.
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
  
  def modifyEntryContacts(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Contacts] = js.native
  def modifyEntryContacts(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Contacts]): Unit = js.native
  def modifyEntryContacts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Contacts] = js.native
  def modifyEntryContacts(params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Contacts] = js.native
  def modifyEntryContacts(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Contacts]
  ): Unit = js.native
  def modifyEntryContacts(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Contacts],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Contacts]
  ): Unit = js.native
  def modifyEntryContacts(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Contacts] = js.native
  def modifyEntryContacts(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Contacts]
  ): Unit = js.native
  /**
    * Modifies contacts, part of the business context of an Entry. To call this method, you must have the `datacatalog.entries.updateContacts` IAM permission on the corresponding project.
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
    * const datacatalog = google.datacatalog('v1');
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
    *     await datacatalog.projects.locations.entryGroups.entries.modifyEntryContacts(
    *       {
    *         // Required. The full resource name of the entry.
    *         name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "contacts": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "people": []
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
  def modifyEntryContacts(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def modifyEntryContacts(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyEntryOverview(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1EntryOverview] = js.native
  def modifyEntryOverview(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1EntryOverview]): Unit = js.native
  def modifyEntryOverview(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1EntryOverview] = js.native
  def modifyEntryOverview(params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentryoverview): GaxiosPromise[SchemaGoogleCloudDatacatalogV1EntryOverview] = js.native
  def modifyEntryOverview(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentryoverview,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1EntryOverview]
  ): Unit = js.native
  def modifyEntryOverview(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentryoverview,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1EntryOverview],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1EntryOverview]
  ): Unit = js.native
  def modifyEntryOverview(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentryoverview,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDatacatalogV1EntryOverview] = js.native
  def modifyEntryOverview(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentryoverview,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1EntryOverview]
  ): Unit = js.native
  /**
    * Modifies entry overview, part of the business context of an Entry. To call this method, you must have the `datacatalog.entries.updateOverview` IAM permission on the corresponding project.
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
    * const datacatalog = google.datacatalog('v1');
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
    *     await datacatalog.projects.locations.entryGroups.entries.modifyEntryOverview(
    *       {
    *         // Required. The full resource name of the entry.
    *         name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "entryOverview": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "overview": "my_overview"
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
  def modifyEntryOverview(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentryoverview,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def modifyEntryOverview(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentryoverview,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  /**
    * Updates an existing entry. You must enable the Data Catalog API in the project identified by the `entry.name` parameter. For more information, see [Data Catalog resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
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
    * const datacatalog = google.datacatalog('v1');
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
    *     // Output only. The resource name of an entry in URL format. Note: The entry itself and its child resources might not be stored in the location specified in its name.
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
    *     // Names of fields whose values to overwrite on an entry. If this parameter is absent or empty, all modifiable fields are overwritten. If such fields are non-required and omitted in the request body, their values are emptied. You can modify only the fields listed below. For entries with type `DATA_STREAM`: * `schema` For entries with type `FILESET`: * `schema` * `display_name` * `description` * `gcs_fileset_spec` * `gcs_fileset_spec.file_patterns` For entries with `user_specified_type`: * `schema` * `display_name` * `description` * `user_specified_type` * `user_specified_system` * `linked_resource` * `source_system_timestamps`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bigqueryDateShardedSpec": {},
    *       //   "bigqueryTableSpec": {},
    *       //   "businessContext": {},
    *       //   "dataSource": {},
    *       //   "dataSourceConnectionSpec": {},
    *       //   "databaseTableSpec": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "filesetSpec": {},
    *       //   "fullyQualifiedName": "my_fullyQualifiedName",
    *       //   "gcsFilesetSpec": {},
    *       //   "integratedSystem": "my_integratedSystem",
    *       //   "labels": {},
    *       //   "linkedResource": "my_linkedResource",
    *       //   "name": "my_name",
    *       //   "personalDetails": {},
    *       //   "routineSpec": {},
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
    *   //   "businessContext": {},
    *   //   "dataSource": {},
    *   //   "dataSourceConnectionSpec": {},
    *   //   "databaseTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "filesetSpec": {},
    *   //   "fullyQualifiedName": "my_fullyQualifiedName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "labels": {},
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "personalDetails": {},
    *   //   "routineSpec": {},
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
  
  def star(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1StarEntryResponse] = js.native
  def star(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1StarEntryResponse]): Unit = js.native
  def star(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1StarEntryResponse] = js.native
  def star(params: ParamsResourceProjectsLocationsEntrygroupsEntriesStar): GaxiosPromise[SchemaGoogleCloudDatacatalogV1StarEntryResponse] = js.native
  def star(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesStar,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1StarEntryResponse]
  ): Unit = js.native
  def star(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesStar,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1StarEntryResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1StarEntryResponse]
  ): Unit = js.native
  def star(params: ParamsResourceProjectsLocationsEntrygroupsEntriesStar, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1StarEntryResponse] = js.native
  def star(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesStar,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1StarEntryResponse]
  ): Unit = js.native
  /**
    * Marks an Entry as starred by the current user. Starring information is private to each user.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.entryGroups.entries.star({
    *     // Required. The name of the entry to mark as starred.
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
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
  def star(params: ParamsResourceProjectsLocationsEntrygroupsEntriesStar, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def star(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesStar,
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
    * Gets your permissions on a resource. Returns an empty set of permissions if the resource doesn't exist. Supported resources are: - Tag templates - Entry groups Note: This method gets policies only within Data Catalog and can't be used to get policies from BigQuery, Pub/Sub, Dataproc Metastore, and any external Google Cloud Platform resources ingested into Data Catalog. No Google IAM permissions are required to call this method.
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
    * const datacatalog = google.datacatalog('v1');
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
  
  def unstar(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1UnstarEntryResponse] = js.native
  def unstar(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1UnstarEntryResponse]): Unit = js.native
  def unstar(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1UnstarEntryResponse] = js.native
  def unstar(params: ParamsResourceProjectsLocationsEntrygroupsEntriesUnstar): GaxiosPromise[SchemaGoogleCloudDatacatalogV1UnstarEntryResponse] = js.native
  def unstar(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesUnstar,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1UnstarEntryResponse]
  ): Unit = js.native
  def unstar(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesUnstar,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1UnstarEntryResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1UnstarEntryResponse]
  ): Unit = js.native
  def unstar(params: ParamsResourceProjectsLocationsEntrygroupsEntriesUnstar, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1UnstarEntryResponse] = js.native
  def unstar(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesUnstar,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1UnstarEntryResponse]
  ): Unit = js.native
  /**
    * Marks an Entry as NOT starred by the current user. Starring information is private to each user.
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
    * const datacatalog = google.datacatalog('v1');
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
    *   const res = await datacatalog.projects.locations.entryGroups.entries.unstar({
    *     // Required. The name of the entry to mark as **not** starred.
    *     name: 'projects/my-project/locations/my-location/entryGroups/my-entryGroup/entries/my-entrie',
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
  def unstar(params: ParamsResourceProjectsLocationsEntrygroupsEntriesUnstar, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unstar(
    params: ParamsResourceProjectsLocationsEntrygroupsEntriesUnstar,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
