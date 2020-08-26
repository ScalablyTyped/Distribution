package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/oslogin/v1alpha", "oslogin_v1alpha.Resource$Users$Projects")
@js.native
class ResourceUsersProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * oslogin.users.projects.delete
    * @desc Deletes a POSIX account.
    * @alias oslogin.users.projects.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A reference to the POSIX account to update. POSIX accounts are identified by the project ID they are associated with. A reference to the POSIX account is in format `users/{user}/projects/{project}`.
    * @param {string=} params.operatingSystemType The type of operating system associated with the account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUsersProjectsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUsersProjectsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceUsersProjectsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersProjectsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceUsersProjectsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

