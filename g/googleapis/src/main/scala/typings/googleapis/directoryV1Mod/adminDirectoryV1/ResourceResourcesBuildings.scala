package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Buildings")
@js.native
class ResourceResourcesBuildings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.resources.buildings.delete
    * @desc Deletes a building.
    * @alias directory.resources.buildings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The ID of the building to delete.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesBuildingsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesBuildingsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResourcesBuildingsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResourcesBuildingsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResourcesBuildingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.resources.buildings.get
    * @desc Retrieves a building.
    * @alias directory.resources.buildings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The unique ID of the building to retrieve.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBuilding] = js.native
  def get(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def get(params: ParamsResourceResourcesBuildingsGet): GaxiosPromise[SchemaBuilding] = js.native
  def get(params: ParamsResourceResourcesBuildingsGet, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def get(
    params: ParamsResourceResourcesBuildingsGet,
    options: BodyResponseCallback[SchemaBuilding],
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  def get(params: ParamsResourceResourcesBuildingsGet, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def get(
    params: ParamsResourceResourcesBuildingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  /**
    * directory.resources.buildings.insert
    * @desc Inserts a building.
    * @alias directory.resources.buildings.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.coordinatesSource Source from which Building.coordinates are derived.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Building} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaBuilding] = js.native
  def insert(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def insert(params: ParamsResourceResourcesBuildingsInsert): GaxiosPromise[SchemaBuilding] = js.native
  def insert(params: ParamsResourceResourcesBuildingsInsert, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def insert(
    params: ParamsResourceResourcesBuildingsInsert,
    options: BodyResponseCallback[SchemaBuilding],
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  def insert(params: ParamsResourceResourcesBuildingsInsert, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def insert(
    params: ParamsResourceResourcesBuildingsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  /**
    * directory.resources.buildings.list
    * @desc Retrieves a list of buildings for an account.
    * @alias directory.resources.buildings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBuildings] = js.native
  def list(callback: BodyResponseCallback[SchemaBuildings]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuildings] = js.native
  def list(params: ParamsResourceResourcesBuildingsList): GaxiosPromise[SchemaBuildings] = js.native
  def list(params: ParamsResourceResourcesBuildingsList, callback: BodyResponseCallback[SchemaBuildings]): Unit = js.native
  def list(
    params: ParamsResourceResourcesBuildingsList,
    options: BodyResponseCallback[SchemaBuildings],
    callback: BodyResponseCallback[SchemaBuildings]
  ): Unit = js.native
  def list(params: ParamsResourceResourcesBuildingsList, options: MethodOptions): GaxiosPromise[SchemaBuildings] = js.native
  def list(
    params: ParamsResourceResourcesBuildingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildings]
  ): Unit = js.native
  /**
    * directory.resources.buildings.patch
    * @desc Updates a building. This method supports patch semantics.
    * @alias directory.resources.buildings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The ID of the building to update.
    * @param {string=} params.coordinatesSource Source from which Building.coordinates are derived.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Building} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaBuilding] = js.native
  def patch(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def patch(params: ParamsResourceResourcesBuildingsPatch): GaxiosPromise[SchemaBuilding] = js.native
  def patch(params: ParamsResourceResourcesBuildingsPatch, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def patch(
    params: ParamsResourceResourcesBuildingsPatch,
    options: BodyResponseCallback[SchemaBuilding],
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  def patch(params: ParamsResourceResourcesBuildingsPatch, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def patch(
    params: ParamsResourceResourcesBuildingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  /**
    * directory.resources.buildings.update
    * @desc Updates a building.
    * @alias directory.resources.buildings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The ID of the building to update.
    * @param {string=} params.coordinatesSource Source from which Building.coordinates are derived.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Building} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaBuilding] = js.native
  def update(callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def update(params: ParamsResourceResourcesBuildingsUpdate): GaxiosPromise[SchemaBuilding] = js.native
  def update(params: ParamsResourceResourcesBuildingsUpdate, callback: BodyResponseCallback[SchemaBuilding]): Unit = js.native
  def update(
    params: ParamsResourceResourcesBuildingsUpdate,
    options: BodyResponseCallback[SchemaBuilding],
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
  def update(params: ParamsResourceResourcesBuildingsUpdate, options: MethodOptions): GaxiosPromise[SchemaBuilding] = js.native
  def update(
    params: ParamsResourceResourcesBuildingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuilding]
  ): Unit = js.native
}

