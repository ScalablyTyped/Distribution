package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore/v1beta1", "firestore_v1beta1.Resource$Projects$Databases$Indexes")
@js.native
open class ResourceProjectsDatabasesIndexes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsDatabasesIndexesCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesIndexesCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDatabasesIndexesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDatabasesIndexesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesIndexesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates the specified index. A newly created index's initial state is `CREATING`. On completion of the returned google.longrunning.Operation, the state will be `READY`. If the index already exists, the call will return an `ALREADY_EXISTS` status. During creation, the process could result in an error, in which case the index will move to the `ERROR` state. The process can be recovered by fixing the data that caused the error, removing the index with delete, then re-creating the index with create. Indexes with a single field cannot be created.
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
    * const firestore = google.firestore('v1beta1');
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
    *   const res = await firestore.projects.databases.indexes.create({
    *     // The name of the database this index will apply to. For example: `projects/{project_id\}/databases/{database_id\}`
    *     parent: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "collectionId": "my_collectionId",
    *       //   "fields": [],
    *       //   "name": "my_name",
    *       //   "state": "my_state"
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
  def create(params: ParamsResourceProjectsDatabasesIndexesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesIndexesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatabasesIndexesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatabasesIndexesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesIndexesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDatabasesIndexesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesIndexesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an index.
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
    * const firestore = google.firestore('v1beta1');
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
    *   const res = await firestore.projects.databases.indexes.delete({
    *     // The index name. For example: `projects/{project_id\}/databases/{database_id\}/indexes/{index_id\}`
    *     name: 'projects/my-project/databases/my-database/indexes/my-indexe',
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
  def delete(params: ParamsResourceProjectsDatabasesIndexesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesIndexesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1Index] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta1Index]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1Index] = js.native
  def get(params: ParamsResourceProjectsDatabasesIndexesGet): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1Index] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesIndexesGet,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta1Index]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatabasesIndexesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1beta1Index],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1beta1Index]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesIndexesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1Index] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesIndexesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta1Index]
  ): Unit = js.native
  /**
    * Gets an index.
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
    * const firestore = google.firestore('v1beta1');
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
    *   const res = await firestore.projects.databases.indexes.get({
    *     // The name of the index. For example: `projects/{project_id\}/databases/{database_id\}/indexes/{index_id\}`
    *     name: 'projects/my-project/databases/my-database/indexes/my-indexe',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "collectionId": "my_collectionId",
    *   //   "fields": [],
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsDatabasesIndexesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesIndexesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse] = js.native
  def list(params: ParamsResourceProjectsDatabasesIndexesList): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesIndexesList,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatabasesIndexesList,
    options: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesIndexesList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesIndexesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse]
  ): Unit = js.native
  /**
    * Lists the indexes that match the specified filters.
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
    * const firestore = google.firestore('v1beta1');
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
    *   const res = await firestore.projects.databases.indexes.list({
    *     filter: 'placeholder-value',
    *     // The standard List page size.
    *     pageSize: 'placeholder-value',
    *     // The standard List page token.
    *     pageToken: 'placeholder-value',
    *     // The database name. For example: `projects/{project_id\}/databases/{database_id\}`
    *     parent: 'projects/my-project/databases/my-database',
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
  def list(params: ParamsResourceProjectsDatabasesIndexesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesIndexesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
