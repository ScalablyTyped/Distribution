package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Filters")
@js.native
class ResourceUsersSettingsFilters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gmail.users.settings.filters.create
    * @desc Creates a filter.
    * @alias gmail.users.settings.filters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaFilter] = js.native
  def create(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def create(params: ParamsResourceUsersSettingsFiltersCreate): GaxiosPromise[SchemaFilter] = js.native
  def create(params: ParamsResourceUsersSettingsFiltersCreate, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsFiltersCreate,
    options: BodyResponseCallback[SchemaFilter],
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsFiltersCreate, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def create(
    params: ParamsResourceUsersSettingsFiltersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.filters.delete
    * @desc Deletes a filter.
    * @alias gmail.users.settings.filters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the filter to be deleted.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsFiltersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsFiltersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsFiltersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsFiltersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsFiltersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.filters.get
    * @desc Gets a filter.
    * @alias gmail.users.settings.filters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the filter to be fetched.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFilter] = js.native
  def get(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceUsersSettingsFiltersGet): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceUsersSettingsFiltersGet, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsFiltersGet,
    options: BodyResponseCallback[SchemaFilter],
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsFiltersGet, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(
    params: ParamsResourceUsersSettingsFiltersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.filters.list
    * @desc Lists the message filters of a Gmail user.
    * @alias gmail.users.settings.filters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFiltersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(params: ParamsResourceUsersSettingsFiltersList): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsFiltersList,
    callback: BodyResponseCallback[SchemaListFiltersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsFiltersList,
    options: BodyResponseCallback[SchemaListFiltersResponse],
    callback: BodyResponseCallback[SchemaListFiltersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsFiltersList, options: MethodOptions): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsFiltersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFiltersResponse]
  ): Unit = js.native
}
