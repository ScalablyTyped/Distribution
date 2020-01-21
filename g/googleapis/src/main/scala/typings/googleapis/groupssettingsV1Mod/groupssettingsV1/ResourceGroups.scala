package typings.googleapis.groupssettingsV1Mod.groupssettingsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/groupssettings/v1", "groupssettings_v1.Resource$Groups")
@js.native
class ResourceGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * groupsSettings.groups.get
    * @desc Gets one resource by id.
    * @alias groupsSettings.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupUniqueId The resource ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGroups] = js.native
  def get(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def get(params: ParamsResourceGroupsGet): GaxiosPromise[SchemaGroups] = js.native
  def get(params: ParamsResourceGroupsGet, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def get(
    params: ParamsResourceGroupsGet,
    options: BodyResponseCallback[SchemaGroups],
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  def get(params: ParamsResourceGroupsGet, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
  def get(
    params: ParamsResourceGroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  /**
    * groupsSettings.groups.patch
    * @desc Updates an existing resource. This method supports patch semantics.
    * @alias groupsSettings.groups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupUniqueId The resource ID
    * @param {().Groups} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGroups] = js.native
  def patch(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def patch(params: ParamsResourceGroupsPatch): GaxiosPromise[SchemaGroups] = js.native
  def patch(params: ParamsResourceGroupsPatch, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def patch(
    params: ParamsResourceGroupsPatch,
    options: BodyResponseCallback[SchemaGroups],
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  def patch(params: ParamsResourceGroupsPatch, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
  def patch(
    params: ParamsResourceGroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  /**
    * groupsSettings.groups.update
    * @desc Updates an existing resource.
    * @alias groupsSettings.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupUniqueId The resource ID
    * @param {().Groups} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaGroups] = js.native
  def update(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def update(params: ParamsResourceGroupsUpdate): GaxiosPromise[SchemaGroups] = js.native
  def update(params: ParamsResourceGroupsUpdate, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: BodyResponseCallback[SchemaGroups],
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  def update(params: ParamsResourceGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
}

