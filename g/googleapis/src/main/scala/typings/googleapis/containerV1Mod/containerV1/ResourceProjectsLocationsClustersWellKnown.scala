package typings.googleapis.containerV1Mod.containerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations$Clusters$WellKnown")
@js.native
open class ResourceProjectsLocationsClustersWellKnown protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getOpenidConfiguration(): GaxiosPromise[SchemaGetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(callback: BodyResponseCallback[SchemaGetOpenIDConfigResponse]): Unit = js.native
  def getOpenidConfiguration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration): GaxiosPromise[SchemaGetOpenIDConfigResponse] = js.native
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    callback: BodyResponseCallback[SchemaGetOpenIDConfigResponse]
  ): Unit = js.native
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    options: BodyResponseCallback[Readable | SchemaGetOpenIDConfigResponse],
    callback: BodyResponseCallback[Readable | SchemaGetOpenIDConfigResponse]
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
  /**
    * Gets the OIDC discovery document for the cluster. See the [OpenID Connect Discovery 1.0 specification](https://openid.net/specs/openid-connect-discovery-1_0.html) for details. This API is not yet intended for general use, and is not available for all clusters.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/container.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     (await container.projects.locations.clusters.well) -
    *     known.getOpenid -
    *     configuration({
    *       // The cluster (project, location, cluster name) to get the discovery document for. Specified in the format `projects/x/locations/x/clusters/x`.
    *       parent: 'projects/my-project/locations/my-location/clusters/my-cluster',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cacheHeader": {},
    *   //   "claims_supported": [],
    *   //   "grant_types": [],
    *   //   "id_token_signing_alg_values_supported": [],
    *   //   "issuer": "my_issuer",
    *   //   "jwks_uri": "my_jwks_uri",
    *   //   "response_types_supported": [],
    *   //   "subject_types_supported": []
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
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getOpenidConfiguration(
    params: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
