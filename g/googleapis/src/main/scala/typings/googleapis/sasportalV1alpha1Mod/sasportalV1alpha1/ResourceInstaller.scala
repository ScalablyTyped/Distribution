package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Installer")
@js.native
open class ResourceInstaller protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generateSecret(): GaxiosPromise[SchemaSasPortalGenerateSecretResponse] = js.native
  def generateSecret(callback: BodyResponseCallback[SchemaSasPortalGenerateSecretResponse]): Unit = js.native
  def generateSecret(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalGenerateSecretResponse] = js.native
  def generateSecret(params: ParamsResourceInstallerGeneratesecret): GaxiosPromise[SchemaSasPortalGenerateSecretResponse] = js.native
  def generateSecret(
    params: ParamsResourceInstallerGeneratesecret,
    callback: BodyResponseCallback[SchemaSasPortalGenerateSecretResponse]
  ): Unit = js.native
  def generateSecret(
    params: ParamsResourceInstallerGeneratesecret,
    options: BodyResponseCallback[Readable | SchemaSasPortalGenerateSecretResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalGenerateSecretResponse]
  ): Unit = js.native
  def generateSecret(params: ParamsResourceInstallerGeneratesecret, options: MethodOptions): GaxiosPromise[SchemaSasPortalGenerateSecretResponse] = js.native
  def generateSecret(
    params: ParamsResourceInstallerGeneratesecret,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalGenerateSecretResponse]
  ): Unit = js.native
  /**
    * Generates a secret to be used with the ValidateInstaller.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.installer.generateSecret({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "secret": "my_secret"
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
  def generateSecret(params: ParamsResourceInstallerGeneratesecret, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateSecret(
    params: ParamsResourceInstallerGeneratesecret,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def validate(): GaxiosPromise[SchemaSasPortalValidateInstallerResponse] = js.native
  def validate(callback: BodyResponseCallback[SchemaSasPortalValidateInstallerResponse]): Unit = js.native
  def validate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalValidateInstallerResponse] = js.native
  def validate(params: ParamsResourceInstallerValidate): GaxiosPromise[SchemaSasPortalValidateInstallerResponse] = js.native
  def validate(
    params: ParamsResourceInstallerValidate,
    callback: BodyResponseCallback[SchemaSasPortalValidateInstallerResponse]
  ): Unit = js.native
  def validate(
    params: ParamsResourceInstallerValidate,
    options: BodyResponseCallback[Readable | SchemaSasPortalValidateInstallerResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalValidateInstallerResponse]
  ): Unit = js.native
  def validate(params: ParamsResourceInstallerValidate, options: MethodOptions): GaxiosPromise[SchemaSasPortalValidateInstallerResponse] = js.native
  def validate(
    params: ParamsResourceInstallerValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalValidateInstallerResponse]
  ): Unit = js.native
  /**
    * Validates the identity of a Certified Professional Installer (CPI).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.installer.validate({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "encodedSecret": "my_encodedSecret",
    *       //   "installerId": "my_installerId",
    *       //   "secret": "my_secret"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def validate(params: ParamsResourceInstallerValidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validate(
    params: ParamsResourceInstallerValidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
