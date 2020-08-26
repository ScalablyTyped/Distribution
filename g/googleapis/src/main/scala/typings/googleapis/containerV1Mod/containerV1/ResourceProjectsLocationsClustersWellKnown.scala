package typings.googleapis.containerV1Mod.containerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations$Clusters$WellKnown")
@js.native
class ResourceProjectsLocationsClustersWellKnown protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * container.projects.locations.clusters.well-known.getOpenid-configuration
    * @desc GetOpenIDConfig gets the OIDC discovery document for the cluster.
    * See the OpenID Connect Discovery 1.0 specification for details.
    * https://openid.net/specs/openid-connect-discovery-1_0.html This API is
    * not yet intended for general use, and is not available for all clusters.
    * @alias
    * container.projects.locations.clusters.well-known.getOpenid-configuration
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The cluster (project, location, cluster id) to get the discovery document for. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getOpenidConfiguration(): GaxiosPromise[SchemaGetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(callback: BodyResponseCallback[SchemaGetOpenIDConfigResponse]): Unit = js.native
  def getOpenidConfiguration(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration): GaxiosPromise[SchemaGetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    callback: BodyResponseCallback[SchemaGetOpenIDConfigResponse]
  ): Unit = js.native
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    options: BodyResponseCallback[SchemaGetOpenIDConfigResponse],
    callback: BodyResponseCallback[SchemaGetOpenIDConfigResponse]
  ): Unit = js.native
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    options: MethodOptions
  ): GaxiosPromise[SchemaGetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOpenIDConfigResponse]
  ): Unit = js.native
}

