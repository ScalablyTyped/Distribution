package typings.googleapis.groupsmigrationV1Mod.groupsmigrationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/groupsmigration/v1", "groupsmigration_v1.Resource$Archive")
@js.native
class ResourceArchive protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * groupsmigration.archive.insert
    * @desc Inserts a new mail into the archive of the Google group.
    * @alias groupsmigration.archive.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupId The group ID
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaGroups] = js.native
  def insert(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
  def insert(params: ParamsResourceArchiveInsert): GaxiosPromise[SchemaGroups] = js.native
  def insert(params: ParamsResourceArchiveInsert, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def insert(
    params: ParamsResourceArchiveInsert,
    options: BodyResponseCallback[SchemaGroups],
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  def insert(params: ParamsResourceArchiveInsert, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
  def insert(
    params: ParamsResourceArchiveInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
}

