package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations$Storedinfotypes")
@js.native
class ResourceOrganizationsStoredinfotypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dlp.organizations.storedInfoTypes.create
    * @desc Creates a pre-built stored infoType to be used for inspection. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {().GooglePrivacyDlpV2CreateStoredInfoTypeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(params: ParamsResourceOrganizationsStoredinfotypesCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsResourceOrganizationsStoredinfotypesCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsStoredinfotypesCreate,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsStoredinfotypesCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsResourceOrganizationsStoredinfotypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  
  /**
    * dlp.organizations.storedInfoTypes.delete
    * @desc Deletes a stored infoType. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and storedInfoType to be deleted, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsStoredinfotypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsStoredinfotypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsStoredinfotypesDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsStoredinfotypesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsStoredinfotypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  
  /**
    * dlp.organizations.storedInfoTypes.get
    * @desc Gets a stored infoType. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and storedInfoType to be read, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(params: ParamsResourceOrganizationsStoredinfotypesGet): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsResourceOrganizationsStoredinfotypesGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsStoredinfotypesGet,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsStoredinfotypesGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsResourceOrganizationsStoredinfotypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  
  /**
    * dlp.organizations.storedInfoTypes.list
    * @desc Lists stored infoTypes. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.orderBy Optional comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant.  Example: `name asc, display_name, create_time desc`  Supported fields are:  - `create_time`: corresponds to time the most recent version of the resource was created. - `state`: corresponds to the state of the resource. - `name`: corresponds to resource name. - `display_name`: corresponds to info type's display name.
    * @param {integer=} params.pageSize Optional size of the page, can be limited by server. If zero server returns a page of max size 100.
    * @param {string=} params.pageToken Optional page token to continue retrieval. Comes from previous call to `ListStoredInfoTypes`.
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(params: ParamsResourceOrganizationsStoredinfotypesList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsStoredinfotypesList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsStoredinfotypesList,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsStoredinfotypesList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsStoredinfotypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  
  /**
    * dlp.organizations.storedInfoTypes.patch
    * @desc Updates the stored infoType by creating a new version. The existing
    * version will continue to be used until the new version is ready. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of organization and storedInfoType to be updated, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    * @param {().GooglePrivacyDlpV2UpdateStoredInfoTypeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(params: ParamsResourceOrganizationsStoredinfotypesPatch): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsResourceOrganizationsStoredinfotypesPatch,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsStoredinfotypesPatch,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsStoredinfotypesPatch, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsResourceOrganizationsStoredinfotypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
}
