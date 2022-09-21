package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/oslogin/v1alpha", "oslogin_v1alpha.Resource$Users")
@js.native
open class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getLoginProfile(): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(callback: BodyResponseCallback[SchemaLoginProfile]): Unit = js.native
  def getLoginProfile(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(params: ParamsResourceUsersGetloginprofile): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(params: ParamsResourceUsersGetloginprofile, callback: BodyResponseCallback[SchemaLoginProfile]): Unit = js.native
  def getLoginProfile(
    params: ParamsResourceUsersGetloginprofile,
    options: BodyResponseCallback[Readable | SchemaLoginProfile],
    callback: BodyResponseCallback[Readable | SchemaLoginProfile]
  ): Unit = js.native
  def getLoginProfile(params: ParamsResourceUsersGetloginprofile, options: MethodOptions): GaxiosPromise[SchemaLoginProfile] = js.native
  def getLoginProfile(
    params: ParamsResourceUsersGetloginprofile,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLoginProfile]
  ): Unit = js.native
  /**
    * Retrieves the profile information used for logging in to a virtual machine on Google Compute Engine.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/oslogin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await oslogin.users.getLoginProfile({
    *     // Required. The unique ID for the user in format `users/{user\}`.
    *     name: 'users/my-user',
    *     // The type of operating system associated with the account.
    *     operatingSystemType: 'placeholder-value',
    *     // The project ID of the Google Cloud Platform project.
    *     projectId: 'placeholder-value',
    *     // A system ID for filtering the results of the request.
    *     systemId: 'placeholder-value',
    *     // The view configures whether to retrieve security keys information.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "posixAccounts": [],
    *   //   "securityKeys": [],
    *   //   "sshPublicKeys": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getLoginProfile(params: ParamsResourceUsersGetloginprofile, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getLoginProfile(
    params: ParamsResourceUsersGetloginprofile,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def importSshPublicKey(): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(callback: BodyResponseCallback[SchemaImportSshPublicKeyResponse]): Unit = js.native
  def importSshPublicKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(params: ParamsResourceUsersImportsshpublickey): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(
    params: ParamsResourceUsersImportsshpublickey,
    callback: BodyResponseCallback[SchemaImportSshPublicKeyResponse]
  ): Unit = js.native
  def importSshPublicKey(
    params: ParamsResourceUsersImportsshpublickey,
    options: BodyResponseCallback[Readable | SchemaImportSshPublicKeyResponse],
    callback: BodyResponseCallback[Readable | SchemaImportSshPublicKeyResponse]
  ): Unit = js.native
  def importSshPublicKey(params: ParamsResourceUsersImportsshpublickey, options: MethodOptions): GaxiosPromise[SchemaImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(
    params: ParamsResourceUsersImportsshpublickey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImportSshPublicKeyResponse]
  ): Unit = js.native
  /**
    * Adds an SSH public key and returns the profile information. Default POSIX account information is set when no username and UID exist as part of the login profile.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/oslogin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await oslogin.users.importSshPublicKey({
    *     // The unique ID for the user in format `users/{user\}`.
    *     parent: 'users/my-user',
    *     // The project ID of the Google Cloud Platform project.
    *     projectId: 'placeholder-value',
    *     // The view configures whether to retrieve security keys information.
    *     view: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "expirationTimeUsec": "my_expirationTimeUsec",
    *       //   "fingerprint": "my_fingerprint",
    *       //   "key": "my_key",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "details": "my_details",
    *   //   "loginProfile": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def importSshPublicKey(params: ParamsResourceUsersImportsshpublickey, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def importSshPublicKey(
    params: ParamsResourceUsersImportsshpublickey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var projects: ResourceUsersProjects = js.native
  
  var sshPublicKeys: ResourceUsersSshpublickeys = js.native
}
