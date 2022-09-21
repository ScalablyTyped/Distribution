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

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Deployments")
@js.native
open class ResourceDeployments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var devices: ResourceDeploymentsDevices = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalDeployment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(params: ParamsResourceDeploymentsGet): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(params: ParamsResourceDeploymentsGet, callback: BodyResponseCallback[SchemaSasPortalDeployment]): Unit = js.native
  def get(
    params: ParamsResourceDeploymentsGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalDeployment],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDeployment]
  ): Unit = js.native
  def get(params: ParamsResourceDeploymentsGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(
    params: ParamsResourceDeploymentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  /**
    * Returns a requested deployment.
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
    *   const res = await sasportal.deployments.get({
    *     // Required. The name of the deployment.
    *     name: 'deployments/my-deployment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "frns": [],
    *   //   "name": "my_name",
    *   //   "sasUserIds": []
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
  def get(params: ParamsResourceDeploymentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDeploymentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
