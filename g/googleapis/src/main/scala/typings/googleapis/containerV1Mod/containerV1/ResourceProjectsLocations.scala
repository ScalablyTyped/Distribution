package typings.googleapis.containerV1Mod.containerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations")
@js.native
class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var clusters: ResourceProjectsLocationsClusters = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * container.projects.locations.getServerConfig
    * @desc Returns configuration info about the Kubernetes Engine service.
    * @alias container.projects.locations.getServerConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project and location) of the server config to get, specified in the format 'projects/x/locations/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) to return operations for. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getServerConfig(): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerConfig(callback: BodyResponseCallback[SchemaServerConfig]): Unit = js.native
  def getServerConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerConfig(params: ParamsResourceProjectsLocationsGetserverconfig): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerConfig(
    params: ParamsResourceProjectsLocationsGetserverconfig,
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
  def getServerConfig(
    params: ParamsResourceProjectsLocationsGetserverconfig,
    options: BodyResponseCallback[SchemaServerConfig],
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
  def getServerConfig(params: ParamsResourceProjectsLocationsGetserverconfig, options: MethodOptions): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerConfig(
    params: ParamsResourceProjectsLocationsGetserverconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
}
