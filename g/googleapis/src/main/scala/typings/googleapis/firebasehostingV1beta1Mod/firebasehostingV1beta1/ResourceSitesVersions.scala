package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Versions")
@js.native
class ResourceSitesVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var files: ResourceSitesVersionsFiles = js.native
  /**
    * firebasehosting.sites.versions.create
    * @desc Creates a new version for a site.
    * @alias firebasehosting.sites.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent to create the version for, in the format: <code>sites/<var>site-name</var></code>
    * @param {string=} params.sizeBytes The self-reported size of the version. This value is used for a pre-emptive quota check for legacy version uploads.
    * @param {string=} params.versionId A unique id for the new version. This is only specified for legacy version creations.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaVersion] = js.native
  def create(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(params: ParamsResourceSitesVersionsCreate): GaxiosPromise[SchemaVersion] = js.native
  def create(params: ParamsResourceSitesVersionsCreate, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(
    params: ParamsResourceSitesVersionsCreate,
    options: BodyResponseCallback[SchemaVersion],
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  def create(params: ParamsResourceSitesVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def create(
    params: ParamsResourceSitesVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * firebasehosting.sites.versions.delete
    * @desc Deletes the specified version.
    * @alias firebasehosting.sites.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version to be deleted, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceSitesVersionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesVersionsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSitesVersionsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSitesVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSitesVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * firebasehosting.sites.versions.patch
    * @desc Updates the specified metadata for a version. Note that this method
    * will fail with `FAILED_PRECONDITION` in the event of an invalid state
    * transition. The only valid transition for a version is currently from a
    * `CREATED` status to a `FINALIZED` status. Use
    * [`DeleteVersion`](../sites.versions/delete) to set the status of a
    * version to `DELETED`.
    * @alias firebasehosting.sites.versions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique identifier for a version, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code> This name is provided in the response body when you call the [`CreateVersion`](../sites.versions/create) endpoint.
    * @param {string=} params.updateMask A set of field names from your [version](../sites.versions) that you want to update. <br>A field will be overwritten if, and only if, it's in the mask. <br>If a mask is not provided then a default mask of only [`status`](../sites.versions#Version.FIELDS.status) will be used.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaVersion] = js.native
  def patch(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def patch(params: ParamsResourceSitesVersionsPatch): GaxiosPromise[SchemaVersion] = js.native
  def patch(params: ParamsResourceSitesVersionsPatch, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def patch(
    params: ParamsResourceSitesVersionsPatch,
    options: BodyResponseCallback[SchemaVersion],
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  def patch(params: ParamsResourceSitesVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def patch(
    params: ParamsResourceSitesVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * firebasehosting.sites.versions.populateFiles
    * @desc Adds content files to a version.
    * @alias firebasehosting.sites.versions.populateFiles
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The version to add files to, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * @param {().PopulateVersionFilesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def populateFiles(): GaxiosPromise[SchemaPopulateVersionFilesResponse] = js.native
  def populateFiles(callback: BodyResponseCallback[SchemaPopulateVersionFilesResponse]): Unit = js.native
  def populateFiles(params: ParamsResourceSitesVersionsPopulatefiles): GaxiosPromise[SchemaPopulateVersionFilesResponse] = js.native
  def populateFiles(
    params: ParamsResourceSitesVersionsPopulatefiles,
    callback: BodyResponseCallback[SchemaPopulateVersionFilesResponse]
  ): Unit = js.native
  def populateFiles(
    params: ParamsResourceSitesVersionsPopulatefiles,
    options: BodyResponseCallback[SchemaPopulateVersionFilesResponse],
    callback: BodyResponseCallback[SchemaPopulateVersionFilesResponse]
  ): Unit = js.native
  def populateFiles(params: ParamsResourceSitesVersionsPopulatefiles, options: MethodOptions): GaxiosPromise[SchemaPopulateVersionFilesResponse] = js.native
  def populateFiles(
    params: ParamsResourceSitesVersionsPopulatefiles,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPopulateVersionFilesResponse]
  ): Unit = js.native
}

