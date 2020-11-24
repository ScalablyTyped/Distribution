package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Platformtypes")
@js.native
class ResourcePlatformtypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.platformTypes.get
    * @desc Gets one platform type by ID.
    * @alias dfareporting.platformTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Platform type ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPlatformType] = js.native
  def get(callback: BodyResponseCallback[SchemaPlatformType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlatformType] = js.native
  def get(params: ParamsResourcePlatformtypesGet): GaxiosPromise[SchemaPlatformType] = js.native
  def get(params: ParamsResourcePlatformtypesGet, callback: BodyResponseCallback[SchemaPlatformType]): Unit = js.native
  def get(
    params: ParamsResourcePlatformtypesGet,
    options: BodyResponseCallback[SchemaPlatformType],
    callback: BodyResponseCallback[SchemaPlatformType]
  ): Unit = js.native
  def get(params: ParamsResourcePlatformtypesGet, options: MethodOptions): GaxiosPromise[SchemaPlatformType] = js.native
  def get(
    params: ParamsResourcePlatformtypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlatformType]
  ): Unit = js.native
  
  /**
    * dfareporting.platformTypes.list
    * @desc Retrieves a list of platform types.
    * @alias dfareporting.platformTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlatformTypesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlatformTypesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlatformTypesListResponse] = js.native
  def list(params: ParamsResourcePlatformtypesList): GaxiosPromise[SchemaPlatformTypesListResponse] = js.native
  def list(
    params: ParamsResourcePlatformtypesList,
    callback: BodyResponseCallback[SchemaPlatformTypesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlatformtypesList,
    options: BodyResponseCallback[SchemaPlatformTypesListResponse],
    callback: BodyResponseCallback[SchemaPlatformTypesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlatformtypesList, options: MethodOptions): GaxiosPromise[SchemaPlatformTypesListResponse] = js.native
  def list(
    params: ParamsResourcePlatformtypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlatformTypesListResponse]
  ): Unit = js.native
}
