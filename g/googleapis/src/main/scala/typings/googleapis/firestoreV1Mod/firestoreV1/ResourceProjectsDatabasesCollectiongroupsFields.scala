package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore/v1", "firestore_v1.Resource$Projects$Databases$Collectiongroups$Fields")
@js.native
open class ResourceProjectsDatabasesCollectiongroupsFields protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirestoreAdminV1Field] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Field]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1Field] = js.native
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet): GaxiosPromise[SchemaGoogleFirestoreAdminV1Field] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Field]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1Field],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1Field]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1Field] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Field]
  ): Unit = js.native
  /**
    * Gets the metadata and configuration for a Field.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.collectionGroups.fields.get({
    *     // Required. A name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}/fields/{field_id\}`
    *     name: 'projects/my-project/databases/my-database/collectionGroups/my-collectionGroup/fields/my-field',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "indexConfig": {},
    *   //   "name": "my_name",
    *   //   "ttlConfig": {}
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
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListFieldsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListFieldsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListFieldsResponse] = js.native
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListFieldsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListFieldsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1ListFieldsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1ListFieldsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListFieldsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListFieldsResponse]
  ): Unit = js.native
  /**
    * Lists the field configuration and metadata for this database. Currently, FirestoreAdmin.ListFields only supports listing fields that have been explicitly overridden. To issue this query, call FirestoreAdmin.ListFields with the filter set to `indexConfig.usesAncestorConfig:false` .
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.collectionGroups.fields.list({
    *     // The filter to apply to list results. Currently, FirestoreAdmin.ListFields only supports listing fields that have been explicitly overridden. To issue this query, call FirestoreAdmin.ListFields with a filter that includes `indexConfig.usesAncestorConfig:false` .
    *     filter: 'placeholder-value',
    *     // The number of results to return.
    *     pageSize: 'placeholder-value',
    *     // A page token, returned from a previous call to FirestoreAdmin.ListFields, that may be used to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. A parent name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}`
    *     parent:
    *       'projects/my-project/databases/my-database/collectionGroups/my-collectionGroup',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fields": [],
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
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates a field configuration. Currently, field updates apply only to single field index configuration. However, calls to FirestoreAdmin.UpdateField should provide a field mask to avoid changing any configuration that the caller isn't aware of. The field mask should be specified as: `{ paths: "index_config" \}`. This call returns a google.longrunning.Operation which may be used to track the status of the field update. The metadata for the operation will be the type FieldOperationMetadata. To configure the default field settings for the database, use the special `Field` with resource name: `projects/{project_id\}/databases/{database_id\}/collectionGroups/__default__/fields/x`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.collectionGroups.fields.patch({
    *     // Required. A field name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}/fields/{field_path\}` A field path may be a simple field name, e.g. `address` or a path to fields within map_value , e.g. `address.city`, or a special field path. The only valid special field is `*`, which represents any field. Field paths may be quoted using ` (backtick). The only character that needs to be escaped within a quoted field path is the backtick character itself, escaped using a backslash. Special characters in field paths that must be quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii symbolic characters. Examples: (Note: Comments here are written in markdown syntax, so there is an additional layer of backticks to represent a code block) `\`address.city\`` represents a field named `address.city`, not the map key `city` in the field `address`. `\`*\`` represents a field named `*`, not any field. A special `Field` contains the default indexing settings for all fields. This field's resource name is: `projects/{project_id\}/databases/{database_id\}/collectionGroups/__default__/fields/x` Indexes defined on this `Field` will be applied to all fields which do not have their own `Field` index configuration.
    *     name: 'projects/my-project/databases/my-database/collectionGroups/my-collectionGroup/fields/my-field',
    *     // A mask, relative to the field. If specified, only configuration specified by this field_mask will be updated in the field.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "indexConfig": {},
    *       //   "name": "my_name",
    *       //   "ttlConfig": {}
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
  def patch(params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
