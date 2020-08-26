package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Zones")
@js.native
class ResourceProjectsZones protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var clusters: ResourceProjectsZonesClusters = js.native
  var context: APIRequestContext = js.native
  var operations: ResourceProjectsZonesOperations = js.native
  /**
    * container.projects.zones.getServerconfig
    * @desc Returns configuration info about the Kubernetes Engine service.
    * @alias container.projects.zones.getServerconfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.name The name (project and location) of the server config to get, specified in the format 'projects/x/locations/x'.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) to return operations for. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getServerconfig(): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(callback: BodyResponseCallback[SchemaServerConfig]): Unit = js.native
  def getServerconfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(params: ParamsResourceProjectsZonesGetserverconfig): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(
    params: ParamsResourceProjectsZonesGetserverconfig,
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
  def getServerconfig(
    params: ParamsResourceProjectsZonesGetserverconfig,
    options: BodyResponseCallback[SchemaServerConfig],
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
  def getServerconfig(params: ParamsResourceProjectsZonesGetserverconfig, options: MethodOptions): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(
    params: ParamsResourceProjectsZonesGetserverconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
}

