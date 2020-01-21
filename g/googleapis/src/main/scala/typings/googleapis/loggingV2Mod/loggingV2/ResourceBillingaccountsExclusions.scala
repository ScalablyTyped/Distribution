package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Billingaccounts$Exclusions")
@js.native
class ResourceBillingaccountsExclusions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.billingAccounts.exclusions.create
    * @desc Creates a new exclusion in a specified parent resource. Only log
    * entries belonging to that resource can be excluded. You can have up to 10
    * exclusions in a resource.
    * @alias logging.billingAccounts.exclusions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource in which to create the exclusion: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]" Examples: "projects/my-logging-project", "organizations/123456789".
    * @param {().LogExclusion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaLogExclusion] = js.native
  def create(callback: BodyResponseCallback[SchemaLogExclusion]): Unit = js.native
  def create(params: ParamsResourceBillingaccountsExclusionsCreate): GaxiosPromise[SchemaLogExclusion] = js.native
  def create(
    params: ParamsResourceBillingaccountsExclusionsCreate,
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  def create(
    params: ParamsResourceBillingaccountsExclusionsCreate,
    options: BodyResponseCallback[SchemaLogExclusion],
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  def create(params: ParamsResourceBillingaccountsExclusionsCreate, options: MethodOptions): GaxiosPromise[SchemaLogExclusion] = js.native
  def create(
    params: ParamsResourceBillingaccountsExclusionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  /**
    * logging.billingAccounts.exclusions.delete
    * @desc Deletes an exclusion.
    * @alias logging.billingAccounts.exclusions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of an existing exclusion to delete: "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]" "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]" "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example: "projects/my-project-id/exclusions/my-exclusion-id".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceBillingaccountsExclusionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBillingaccountsExclusionsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceBillingaccountsExclusionsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceBillingaccountsExclusionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceBillingaccountsExclusionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * logging.billingAccounts.exclusions.get
    * @desc Gets the description of an exclusion.
    * @alias logging.billingAccounts.exclusions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of an existing exclusion: "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]" "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]" "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example: "projects/my-project-id/exclusions/my-exclusion-id".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLogExclusion] = js.native
  def get(callback: BodyResponseCallback[SchemaLogExclusion]): Unit = js.native
  def get(params: ParamsResourceBillingaccountsExclusionsGet): GaxiosPromise[SchemaLogExclusion] = js.native
  def get(
    params: ParamsResourceBillingaccountsExclusionsGet,
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  def get(
    params: ParamsResourceBillingaccountsExclusionsGet,
    options: BodyResponseCallback[SchemaLogExclusion],
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  def get(params: ParamsResourceBillingaccountsExclusionsGet, options: MethodOptions): GaxiosPromise[SchemaLogExclusion] = js.native
  def get(
    params: ParamsResourceBillingaccountsExclusionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  /**
    * logging.billingAccounts.exclusions.list
    * @desc Lists all the exclusions in a parent resource.
    * @alias logging.billingAccounts.exclusions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {string} params.parent Required. The parent resource whose exclusions are to be listed. "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListExclusionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListExclusionsResponse]): Unit = js.native
  def list(params: ParamsResourceBillingaccountsExclusionsList): GaxiosPromise[SchemaListExclusionsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsExclusionsList,
    callback: BodyResponseCallback[SchemaListExclusionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingaccountsExclusionsList,
    options: BodyResponseCallback[SchemaListExclusionsResponse],
    callback: BodyResponseCallback[SchemaListExclusionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingaccountsExclusionsList, options: MethodOptions): GaxiosPromise[SchemaListExclusionsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsExclusionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListExclusionsResponse]
  ): Unit = js.native
  /**
    * logging.billingAccounts.exclusions.patch
    * @desc Changes one or more properties of an existing exclusion.
    * @alias logging.billingAccounts.exclusions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the exclusion to update: "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]" "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]" "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example: "projects/my-project-id/exclusions/my-exclusion-id".
    * @param {string=} params.updateMask Required. A nonempty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the filter and description of an exclusion, specify an update_mask of "filter,description".
    * @param {().LogExclusion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaLogExclusion] = js.native
  def patch(callback: BodyResponseCallback[SchemaLogExclusion]): Unit = js.native
  def patch(params: ParamsResourceBillingaccountsExclusionsPatch): GaxiosPromise[SchemaLogExclusion] = js.native
  def patch(
    params: ParamsResourceBillingaccountsExclusionsPatch,
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  def patch(
    params: ParamsResourceBillingaccountsExclusionsPatch,
    options: BodyResponseCallback[SchemaLogExclusion],
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
  def patch(params: ParamsResourceBillingaccountsExclusionsPatch, options: MethodOptions): GaxiosPromise[SchemaLogExclusion] = js.native
  def patch(
    params: ParamsResourceBillingaccountsExclusionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogExclusion]
  ): Unit = js.native
}

