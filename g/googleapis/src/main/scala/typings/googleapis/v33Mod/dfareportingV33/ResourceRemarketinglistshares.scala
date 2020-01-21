package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Remarketinglistshares")
@js.native
class ResourceRemarketinglistshares protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.remarketingListShares.get
    * @desc Gets one remarketing list share by remarketing list ID.
    * @alias dfareporting.remarketingListShares.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.remarketingListId Remarketing list ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def get(callback: BodyResponseCallback[SchemaRemarketingListShare]): Unit = js.native
  def get(params: ParamsResourceRemarketinglistsharesGet): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def get(
    params: ParamsResourceRemarketinglistsharesGet,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def get(
    params: ParamsResourceRemarketinglistsharesGet,
    options: BodyResponseCallback[SchemaRemarketingListShare],
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def get(params: ParamsResourceRemarketinglistsharesGet, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def get(
    params: ParamsResourceRemarketinglistsharesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  /**
    * dfareporting.remarketingListShares.patch
    * @desc Updates an existing remarketing list share. This method supports
    * patch semantics.
    * @alias dfareporting.remarketingListShares.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.remarketingListId Remarketing list ID.
    * @param {().RemarketingListShare} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def patch(callback: BodyResponseCallback[SchemaRemarketingListShare]): Unit = js.native
  def patch(params: ParamsResourceRemarketinglistsharesPatch): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsharesPatch,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def patch(
    params: ParamsResourceRemarketinglistsharesPatch,
    options: BodyResponseCallback[SchemaRemarketingListShare],
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def patch(params: ParamsResourceRemarketinglistsharesPatch, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsharesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  /**
    * dfareporting.remarketingListShares.update
    * @desc Updates an existing remarketing list share.
    * @alias dfareporting.remarketingListShares.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingListShare} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def update(callback: BodyResponseCallback[SchemaRemarketingListShare]): Unit = js.native
  def update(params: ParamsResourceRemarketinglistsharesUpdate): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def update(
    params: ParamsResourceRemarketinglistsharesUpdate,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def update(
    params: ParamsResourceRemarketinglistsharesUpdate,
    options: BodyResponseCallback[SchemaRemarketingListShare],
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def update(params: ParamsResourceRemarketinglistsharesUpdate, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def update(
    params: ParamsResourceRemarketinglistsharesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
}

