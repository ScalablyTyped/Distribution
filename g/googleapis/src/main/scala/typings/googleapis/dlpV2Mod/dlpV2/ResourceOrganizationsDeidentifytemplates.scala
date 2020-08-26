package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations$Deidentifytemplates")
@js.native
class ResourceOrganizationsDeidentifytemplates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.organizations.deidentifyTemplates.create
    * @desc Creates a DeidentifyTemplate for re-using frequently used
    * configuration for de-identifying content, images, and storage. See
    * https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
    * @alias dlp.organizations.deidentifyTemplates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {().GooglePrivacyDlpV2CreateDeidentifyTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(params: ParamsResourceOrganizationsDeidentifytemplatesCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(
    params: ParamsResourceOrganizationsDeidentifytemplatesCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsDeidentifytemplatesCreate,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsDeidentifytemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(
    params: ParamsResourceOrganizationsDeidentifytemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  /**
    * dlp.organizations.deidentifyTemplates.delete
    * @desc Deletes a DeidentifyTemplate. See
    * https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
    * @alias dlp.organizations.deidentifyTemplates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and deidentify template to be deleted, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsDeidentifytemplatesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsDeidentifytemplatesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsDeidentifytemplatesDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsDeidentifytemplatesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsDeidentifytemplatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dlp.organizations.deidentifyTemplates.get
    * @desc Gets a DeidentifyTemplate. See
    * https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
    * @alias dlp.organizations.deidentifyTemplates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and deidentify template to be read, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(params: ParamsResourceOrganizationsDeidentifytemplatesGet): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(
    params: ParamsResourceOrganizationsDeidentifytemplatesGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsDeidentifytemplatesGet,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsDeidentifytemplatesGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(
    params: ParamsResourceOrganizationsDeidentifytemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  /**
    * dlp.organizations.deidentifyTemplates.list
    * @desc Lists DeidentifyTemplates. See
    * https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
    * @alias dlp.organizations.deidentifyTemplates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.orderBy Optional comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant.  Example: `name asc,update_time, create_time desc`  Supported fields are:  - `create_time`: corresponds to time the template was created. - `update_time`: corresponds to time the template was last updated. - `name`: corresponds to template's name. - `display_name`: corresponds to template's display name.
    * @param {integer=} params.pageSize Optional size of the page, can be limited by server. If zero server returns a page of max size 100.
    * @param {string=} params.pageToken Optional page token to continue retrieval. Comes from previous call to `ListDeidentifyTemplates`.
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(params: ParamsResourceOrganizationsDeidentifytemplatesList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsDeidentifytemplatesList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsDeidentifytemplatesList,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsDeidentifytemplatesList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsDeidentifytemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  ): Unit = js.native
  /**
    * dlp.organizations.deidentifyTemplates.patch
    * @desc Updates the DeidentifyTemplate. See
    * https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
    * @alias dlp.organizations.deidentifyTemplates.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of organization and deidentify template to be updated, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    * @param {().GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(params: ParamsResourceOrganizationsDeidentifytemplatesPatch): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(
    params: ParamsResourceOrganizationsDeidentifytemplatesPatch,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsDeidentifytemplatesPatch,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsDeidentifytemplatesPatch, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(
    params: ParamsResourceOrganizationsDeidentifytemplatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
}

