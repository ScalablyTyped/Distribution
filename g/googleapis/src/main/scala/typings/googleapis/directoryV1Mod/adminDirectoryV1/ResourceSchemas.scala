package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Schemas")
@js.native
class ResourceSchemas protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.schemas.delete
    * @desc Delete schema
    * @alias directory.schemas.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSchemasDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSchemasDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSchemasDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSchemasDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSchemasDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * directory.schemas.get
    * @desc Retrieve schema
    * @alias directory.schemas.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSchema] = js.native
  def get(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def get(params: ParamsResourceSchemasGet): GaxiosPromise[SchemaSchema] = js.native
  def get(params: ParamsResourceSchemasGet, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def get(
    params: ParamsResourceSchemasGet,
    options: BodyResponseCallback[SchemaSchema],
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  def get(params: ParamsResourceSchemasGet, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def get(
    params: ParamsResourceSchemasGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * directory.schemas.insert
    * @desc Create schema.
    * @alias directory.schemas.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {().Schema} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSchema] = js.native
  def insert(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def insert(params: ParamsResourceSchemasInsert): GaxiosPromise[SchemaSchema] = js.native
  def insert(params: ParamsResourceSchemasInsert, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def insert(
    params: ParamsResourceSchemasInsert,
    options: BodyResponseCallback[SchemaSchema],
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  def insert(params: ParamsResourceSchemasInsert, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def insert(
    params: ParamsResourceSchemasInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * directory.schemas.list
    * @desc Retrieve all schemas for a customer
    * @alias directory.schemas.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSchemas] = js.native
  def list(callback: BodyResponseCallback[SchemaSchemas]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSchemas] = js.native
  def list(params: ParamsResourceSchemasList): GaxiosPromise[SchemaSchemas] = js.native
  def list(params: ParamsResourceSchemasList, callback: BodyResponseCallback[SchemaSchemas]): Unit = js.native
  def list(
    params: ParamsResourceSchemasList,
    options: BodyResponseCallback[SchemaSchemas],
    callback: BodyResponseCallback[SchemaSchemas]
  ): Unit = js.native
  def list(params: ParamsResourceSchemasList, options: MethodOptions): GaxiosPromise[SchemaSchemas] = js.native
  def list(
    params: ParamsResourceSchemasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchemas]
  ): Unit = js.native
  /**
    * directory.schemas.patch
    * @desc Update schema. This method supports patch semantics.
    * @alias directory.schemas.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema.
    * @param {().Schema} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSchema] = js.native
  def patch(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def patch(params: ParamsResourceSchemasPatch): GaxiosPromise[SchemaSchema] = js.native
  def patch(params: ParamsResourceSchemasPatch, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def patch(
    params: ParamsResourceSchemasPatch,
    options: BodyResponseCallback[SchemaSchema],
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  def patch(params: ParamsResourceSchemasPatch, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def patch(
    params: ParamsResourceSchemasPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * directory.schemas.update
    * @desc Update schema
    * @alias directory.schemas.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema.
    * @param {().Schema} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSchema] = js.native
  def update(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def update(params: ParamsResourceSchemasUpdate): GaxiosPromise[SchemaSchema] = js.native
  def update(params: ParamsResourceSchemasUpdate, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def update(
    params: ParamsResourceSchemasUpdate,
    options: BodyResponseCallback[SchemaSchema],
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  def update(params: ParamsResourceSchemasUpdate, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def update(
    params: ParamsResourceSchemasUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
}

