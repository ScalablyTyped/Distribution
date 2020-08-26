package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Dynamictargetingkeys")
@js.native
class ResourceDynamictargetingkeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.dynamicTargetingKeys.delete
    * @desc Deletes an existing dynamic targeting key.
    * @alias dfareporting.dynamicTargetingKeys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of this dynamic targeting key. This is a required field. Must be less than 256 characters long and cannot contain commas. All characters are converted to lowercase.
    * @param {string} params.objectId ID of the object of this dynamic targeting key. This is a required field.
    * @param {string} params.objectType Type of the object of this dynamic targeting key. This is a required field.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDynamictargetingkeysDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDynamictargetingkeysDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDynamictargetingkeysDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDynamictargetingkeysDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDynamictargetingkeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.dynamicTargetingKeys.insert
    * @desc Inserts a new dynamic targeting key. Keys must be created at the
    * advertiser level before being assigned to the advertiser's ads,
    * creatives, or placements. There is a maximum of 1000 keys per advertiser,
    * out of which a maximum of 20 keys can be assigned per ad, creative, or
    * placement.
    * @alias dfareporting.dynamicTargetingKeys.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().DynamicTargetingKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(callback: BodyResponseCallback[SchemaDynamicTargetingKey]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(params: ParamsResourceDynamictargetingkeysInsert): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(
    params: ParamsResourceDynamictargetingkeysInsert,
    callback: BodyResponseCallback[SchemaDynamicTargetingKey]
  ): Unit = js.native
  def insert(
    params: ParamsResourceDynamictargetingkeysInsert,
    options: BodyResponseCallback[SchemaDynamicTargetingKey],
    callback: BodyResponseCallback[SchemaDynamicTargetingKey]
  ): Unit = js.native
  def insert(params: ParamsResourceDynamictargetingkeysInsert, options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKey] = js.native
  def insert(
    params: ParamsResourceDynamictargetingkeysInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDynamicTargetingKey]
  ): Unit = js.native
  /**
    * dfareporting.dynamicTargetingKeys.list
    * @desc Retrieves a list of dynamic targeting keys.
    * @alias dfareporting.dynamicTargetingKeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only dynamic targeting keys whose object has this advertiser ID.
    * @param {string=} params.names Select only dynamic targeting keys exactly matching these names.
    * @param {string=} params.objectId Select only dynamic targeting keys with this object ID.
    * @param {string=} params.objectType Select only dynamic targeting keys with this object type.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(params: ParamsResourceDynamictargetingkeysList): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(
    params: ParamsResourceDynamictargetingkeysList,
    callback: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDynamictargetingkeysList,
    options: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse],
    callback: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDynamictargetingkeysList, options: MethodOptions): GaxiosPromise[SchemaDynamicTargetingKeysListResponse] = js.native
  def list(
    params: ParamsResourceDynamictargetingkeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDynamicTargetingKeysListResponse]
  ): Unit = js.native
}

