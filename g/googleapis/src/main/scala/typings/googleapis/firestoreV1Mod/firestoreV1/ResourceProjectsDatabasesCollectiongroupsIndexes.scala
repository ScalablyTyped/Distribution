package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore/v1", "firestore_v1.Resource$Projects$Databases$Collectiongroups$Indexes")
@js.native
class ResourceProjectsDatabasesCollectiongroupsIndexes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * firestore.projects.databases.collectionGroups.indexes.create
    * @desc Creates a composite index. This returns a
    * google.longrunning.Operation which may be used to track the status of the
    * creation. The metadata for the operation will be the type
    * IndexOperationMetadata.
    * @alias firestore.projects.databases.collectionGroups.indexes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    * @param {().GoogleFirestoreAdminV1Index} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.collectionGroups.indexes.delete
    * @desc Deletes a composite index.
    * @alias firestore.projects.databases.collectionGroups.indexes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.collectionGroups.indexes.get
    * @desc Gets a composite index.
    * @alias firestore.projects.databases.collectionGroups.indexes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Index],
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Index]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1Index] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1Index]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.collectionGroups.indexes.list
    * @desc Lists composite indexes.
    * @alias firestore.projects.databases.collectionGroups.indexes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter to apply to list results.
    * @param {integer=} params.pageSize The number of results to return.
    * @param {string=} params.pageToken A page token, returned from a previous call to FirestoreAdmin.ListIndexes, that may be used to get the next page of results.
    * @param {string} params.parent A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListIndexesResponse],
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
}
