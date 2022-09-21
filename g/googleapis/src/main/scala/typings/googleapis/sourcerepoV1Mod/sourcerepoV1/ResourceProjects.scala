package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sourcerepo/v1", "sourcerepo_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getConfig(): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig, callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: BodyResponseCallback[Readable | SchemaProjectConfig],
    callback: BodyResponseCallback[Readable | SchemaProjectConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig, options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectConfig]
  ): Unit = js.native
  /**
    * Returns the Cloud Source Repositories configuration of the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sourcerepo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sourcerepo = google.sourcerepo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sourcerepo.projects.getConfig({
    *     // The name of the requested project. Values are of the form `projects/`.
    *     name: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enablePrivateKeyCheck": false,
    *   //   "name": "my_name",
    *   //   "pubsubConfigs": {}
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
  def getConfig(params: ParamsResourceProjectsGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var repos: ResourceProjectsRepos = js.native
  
  def updateConfig(): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def updateConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig, callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: BodyResponseCallback[Readable | SchemaProjectConfig],
    callback: BodyResponseCallback[Readable | SchemaProjectConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectConfig]
  ): Unit = js.native
  /**
    * Updates the Cloud Source Repositories configuration of the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sourcerepo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sourcerepo = google.sourcerepo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sourcerepo.projects.updateConfig({
    *     // The name of the requested project. Values are of the form `projects/`.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "projectConfig": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enablePrivateKeyCheck": false,
    *   //   "name": "my_name",
    *   //   "pubsubConfigs": {}
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
  def updateConfig(params: ParamsResourceProjectsUpdateconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
