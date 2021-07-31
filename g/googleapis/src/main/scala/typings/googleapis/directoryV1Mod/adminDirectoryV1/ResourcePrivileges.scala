package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Privileges")
@js.native
class ResourcePrivileges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.privileges.list
    * @desc Retrieves a paginated list of all privileges for a customer.
    * @alias directory.privileges.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPrivileges] = js.native
  def list(callback: BodyResponseCallback[SchemaPrivileges]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPrivileges] = js.native
  def list(params: ParamsResourcePrivilegesList): GaxiosPromise[SchemaPrivileges] = js.native
  def list(params: ParamsResourcePrivilegesList, callback: BodyResponseCallback[SchemaPrivileges]): Unit = js.native
  def list(
    params: ParamsResourcePrivilegesList,
    options: BodyResponseCallback[SchemaPrivileges],
    callback: BodyResponseCallback[SchemaPrivileges]
  ): Unit = js.native
  def list(params: ParamsResourcePrivilegesList, options: MethodOptions): GaxiosPromise[SchemaPrivileges] = js.native
  def list(
    params: ParamsResourcePrivilegesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPrivileges]
  ): Unit = js.native
}
