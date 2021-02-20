package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sourcerepo/v1", "sourcerepo_v1.Resource$Projects")
@js.native
class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * sourcerepo.projects.getConfig
    * @desc Returns the Cloud Source Repositories configuration of the project.
    * @alias sourcerepo.projects.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested project. Values are of the form `projects/<project>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def getConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig, callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: BodyResponseCallback[SchemaProjectConfig],
    callback: BodyResponseCallback[SchemaProjectConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig, options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectConfig]
  ): Unit = js.native
  
  var repos: ResourceProjectsRepos = js.native
  
  /**
    * sourcerepo.projects.updateConfig
    * @desc Updates the Cloud Source Repositories configuration of the project.
    * @alias sourcerepo.projects.updateConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the requested project. Values are of the form `projects/<project>`.
    * @param {().UpdateProjectConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateConfig(): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def updateConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig, callback: BodyResponseCallback[SchemaProjectConfig]): Unit = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: BodyResponseCallback[SchemaProjectConfig],
    callback: BodyResponseCallback[SchemaProjectConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceProjectsUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaProjectConfig] = js.native
  def updateConfig(
    params: ParamsResourceProjectsUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectConfig]
  ): Unit = js.native
}
