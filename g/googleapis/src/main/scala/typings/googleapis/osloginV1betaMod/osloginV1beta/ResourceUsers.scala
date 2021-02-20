package typings.googleapis.osloginV1betaMod.osloginV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/oslogin/v1beta", "oslogin_v1beta.Resource$Users")
@js.native
class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * oslogin.users.getLoginProfile
    * @desc Retrieves the profile information used for logging in to a virtual
    * machine on Google Compute Engine.
    * @alias oslogin.users.getLoginProfile
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique ID for the user in format `users/{user}`.
    * @param {string=} params.projectId The project ID of the Google Cloud Platform project.
    * @param {string=} params.systemId A system ID for filtering the results of the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLoginProfile(): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(callback: BodyResponseCallback[SchemaLoginProfile]): Unit = js.native
  def getLoginProfile(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(params: ParamsResourceUsersGetloginprofile): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(params: ParamsResourceUsersGetloginprofile, callback: BodyResponseCallback[SchemaLoginProfile]): Unit = js.native
  def getLoginProfile(
    params: ParamsResourceUsersGetloginprofile,
    options: BodyResponseCallback[SchemaLoginProfile],
    callback: BodyResponseCallback[SchemaLoginProfile]
  ): Unit = js.native
  def getLoginProfile(params: ParamsResourceUsersGetloginprofile, options: MethodOptions): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(
    params: ParamsResourceUsersGetloginprofile,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLoginProfile]
  ): Unit = js.native
  
  /**
    * oslogin.users.importSshPublicKey
    * @desc Adds an SSH public key and returns the profile information. Default
    * POSIX account information is set when no username and UID exist as part
    * of the login profile.
    * @alias oslogin.users.importSshPublicKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The unique ID for the user in format `users/{user}`.
    * @param {string=} params.projectId The project ID of the Google Cloud Platform project.
    * @param {().SshPublicKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importSshPublicKey(): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(callback: BodyResponseCallback[SchemaImportSshPublicKeyResponse]): Unit = js.native
  def importSshPublicKey(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(params: ParamsResourceUsersImportsshpublickey): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(
    params: ParamsResourceUsersImportsshpublickey,
    callback: BodyResponseCallback[SchemaImportSshPublicKeyResponse]
  ): Unit = js.native
  def importSshPublicKey(
    params: ParamsResourceUsersImportsshpublickey,
    options: BodyResponseCallback[SchemaImportSshPublicKeyResponse],
    callback: BodyResponseCallback[SchemaImportSshPublicKeyResponse]
  ): Unit = js.native
  def importSshPublicKey(params: ParamsResourceUsersImportsshpublickey, options: MethodOptions): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(
    params: ParamsResourceUsersImportsshpublickey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImportSshPublicKeyResponse]
  ): Unit = js.native
  
  var projects: ResourceUsersProjects = js.native
  
  var sshPublicKeys: ResourceUsersSshpublickeys = js.native
}
