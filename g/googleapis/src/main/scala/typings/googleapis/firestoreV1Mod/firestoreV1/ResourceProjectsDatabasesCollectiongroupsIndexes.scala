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

@JSImport("googleapis/build/src/apis/firestore/v1", "firestore_v1.Resource$Projects$Databases$Collectiongroups$Indexes")
@js.native
open class ResourceProjectsDatabasesCollectiongroupsIndexes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates a composite index. This returns a google.longrunning.Operation which may be used to track the status of the creation. The metadata for the operation will be the type IndexOperationMetadata.
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
    *   const res =
    *     await firestore.projects.databases.collectionGroups.indexes.create({
    *       // Required. A parent name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}`
    *       parent:
    *         'projects/my-project/databases/my-database/collectionGroups/my-collectionGroup',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "fields": [],
    *         //   "name": "my_name",
    *         //   "queryScope": "my_queryScope",
    *         //   "state": "my_state"
    *         // }
    *       },
    *     });
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
  def create(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a composite index.
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
    *   const res =
    *     await firestore.projects.databases.collectionGroups.indexes.delete({
    *       // Required. A name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}/indexes/{index_id\}`
    *       name: 'projects/my-project/databases/my-database/collectionGroups/my-collectionGroup/indexes/my-indexe',
    *     });
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
  def delete(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirestoreAdminV1Index] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Index]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1Index] = js.native
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet): GaxiosPromise[SchemaGoogleFirestoreAdminV1Index] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Index]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1Index],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1Index]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1Index] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Index]
  ): Unit = js.native
  /**
    * Gets a composite index.
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
    *   const res = await firestore.projects.databases.collectionGroups.indexes.get({
    *     // Required. A name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}/indexes/{index_id\}`
    *     name: 'projects/my-project/databases/my-database/collectionGroups/my-collectionGroup/indexes/my-indexe',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fields": [],
    *   //   "name": "my_name",
    *   //   "queryScope": "my_queryScope",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListIndexesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1ListIndexesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  /**
    * Lists composite indexes.
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
    *   const res = await firestore.projects.databases.collectionGroups.indexes.list({
    *     // The filter to apply to list results.
    *     filter: 'placeholder-value',
    *     // The number of results to return.
    *     pageSize: 'placeholder-value',
    *     // A page token, returned from a previous call to FirestoreAdmin.ListIndexes, that may be used to get the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. A parent name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}`
    *     parent:
    *       'projects/my-project/databases/my-database/collectionGroups/my-collectionGroup',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "indexes": [],
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
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
