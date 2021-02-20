package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Databases")
@js.native
class ResourceDatabases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * sql.databases.delete
    * @desc Deletes a database from a Cloud SQL instance.
    * @alias sql.databases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database to be deleted in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceDatabasesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceDatabasesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceDatabasesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceDatabasesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceDatabasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.databases.get
    * @desc Retrieves a resource containing information about a database inside
    * a Cloud SQL instance.
    * @alias sql.databases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDatabase] = js.native
  def get(callback: BodyResponseCallback[SchemaDatabase]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDatabase] = js.native
  def get(params: ParamsResourceDatabasesGet): GaxiosPromise[SchemaDatabase] = js.native
  def get(params: ParamsResourceDatabasesGet, callback: BodyResponseCallback[SchemaDatabase]): Unit = js.native
  def get(
    params: ParamsResourceDatabasesGet,
    options: BodyResponseCallback[SchemaDatabase],
    callback: BodyResponseCallback[SchemaDatabase]
  ): Unit = js.native
  def get(params: ParamsResourceDatabasesGet, options: MethodOptions): GaxiosPromise[SchemaDatabase] = js.native
  def get(
    params: ParamsResourceDatabasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatabase]
  ): Unit = js.native
  
  /**
    * sql.databases.insert
    * @desc Inserts a resource containing information about a database inside a
    * Cloud SQL instance.
    * @alias sql.databases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().Database} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceDatabasesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceDatabasesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceDatabasesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceDatabasesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceDatabasesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.databases.list
    * @desc Lists databases in the specified Cloud SQL instance.
    * @alias sql.databases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDatabasesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDatabasesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDatabasesListResponse] = js.native
  def list(params: ParamsResourceDatabasesList): GaxiosPromise[SchemaDatabasesListResponse] = js.native
  def list(params: ParamsResourceDatabasesList, callback: BodyResponseCallback[SchemaDatabasesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDatabasesList,
    options: BodyResponseCallback[SchemaDatabasesListResponse],
    callback: BodyResponseCallback[SchemaDatabasesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDatabasesList, options: MethodOptions): GaxiosPromise[SchemaDatabasesListResponse] = js.native
  def list(
    params: ParamsResourceDatabasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatabasesListResponse]
  ): Unit = js.native
  
  /**
    * sql.databases.patch
    * @desc Updates a resource containing information about a database inside a
    * Cloud SQL instance. This method supports patch semantics.
    * @alias sql.databases.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database to be updated in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().Database} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceDatabasesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceDatabasesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceDatabasesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceDatabasesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceDatabasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.databases.update
    * @desc Updates a resource containing information about a database inside a
    * Cloud SQL instance.
    * @alias sql.databases.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database to be updated in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().Database} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceDatabasesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceDatabasesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceDatabasesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceDatabasesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceDatabasesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
