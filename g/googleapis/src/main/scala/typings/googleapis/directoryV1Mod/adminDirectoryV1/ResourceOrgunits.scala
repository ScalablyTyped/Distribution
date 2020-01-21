package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Orgunits")
@js.native
class ResourceOrgunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.orgunits.delete
    * @desc Remove organizational unit
    * @alias directory.orgunits.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceOrgunitsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceOrgunitsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceOrgunitsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceOrgunitsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceOrgunitsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * directory.orgunits.get
    * @desc Retrieve organizational unit
    * @alias directory.orgunits.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOrgUnit] = js.native
  def get(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def get(params: ParamsResourceOrgunitsGet): GaxiosPromise[SchemaOrgUnit] = js.native
  def get(params: ParamsResourceOrgunitsGet, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def get(
    params: ParamsResourceOrgunitsGet,
    options: BodyResponseCallback[SchemaOrgUnit],
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  def get(params: ParamsResourceOrgunitsGet, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def get(
    params: ParamsResourceOrgunitsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  /**
    * directory.orgunits.insert
    * @desc Add organizational unit
    * @alias directory.orgunits.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {().OrgUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOrgUnit] = js.native
  def insert(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def insert(params: ParamsResourceOrgunitsInsert): GaxiosPromise[SchemaOrgUnit] = js.native
  def insert(params: ParamsResourceOrgunitsInsert, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def insert(
    params: ParamsResourceOrgunitsInsert,
    options: BodyResponseCallback[SchemaOrgUnit],
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  def insert(params: ParamsResourceOrgunitsInsert, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def insert(
    params: ParamsResourceOrgunitsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  /**
    * directory.orgunits.list
    * @desc Retrieve all organizational units
    * @alias directory.orgunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string=} params.orgUnitPath the URL-encoded organizational unit's path or its ID
    * @param {string=} params.type Whether to return all sub-organizations or just immediate children
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOrgUnits] = js.native
  def list(callback: BodyResponseCallback[SchemaOrgUnits]): Unit = js.native
  def list(params: ParamsResourceOrgunitsList): GaxiosPromise[SchemaOrgUnits] = js.native
  def list(params: ParamsResourceOrgunitsList, callback: BodyResponseCallback[SchemaOrgUnits]): Unit = js.native
  def list(
    params: ParamsResourceOrgunitsList,
    options: BodyResponseCallback[SchemaOrgUnits],
    callback: BodyResponseCallback[SchemaOrgUnits]
  ): Unit = js.native
  def list(params: ParamsResourceOrgunitsList, options: MethodOptions): GaxiosPromise[SchemaOrgUnits] = js.native
  def list(
    params: ParamsResourceOrgunitsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnits]
  ): Unit = js.native
  /**
    * directory.orgunits.patch
    * @desc Update organizational unit. This method supports patch semantics.
    * @alias directory.orgunits.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {().OrgUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOrgUnit] = js.native
  def patch(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def patch(params: ParamsResourceOrgunitsPatch): GaxiosPromise[SchemaOrgUnit] = js.native
  def patch(params: ParamsResourceOrgunitsPatch, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def patch(
    params: ParamsResourceOrgunitsPatch,
    options: BodyResponseCallback[SchemaOrgUnit],
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  def patch(params: ParamsResourceOrgunitsPatch, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def patch(
    params: ParamsResourceOrgunitsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  /**
    * directory.orgunits.update
    * @desc Update organizational unit
    * @alias directory.orgunits.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {().OrgUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOrgUnit] = js.native
  def update(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def update(params: ParamsResourceOrgunitsUpdate): GaxiosPromise[SchemaOrgUnit] = js.native
  def update(params: ParamsResourceOrgunitsUpdate, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def update(
    params: ParamsResourceOrgunitsUpdate,
    options: BodyResponseCallback[SchemaOrgUnit],
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  def update(params: ParamsResourceOrgunitsUpdate, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def update(
    params: ParamsResourceOrgunitsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
}

