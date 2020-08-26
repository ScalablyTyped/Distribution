package typings.googleapis.containerV1Mod.containerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Zones")
@js.native
class ResourceProjectsZones protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var clusters: ResourceProjectsZonesClusters = js.native
  var context: APIRequestContext = js.native
  var operations: ResourceProjectsZonesOperations = js.native
  /**
    * container.projects.zones.getServerconfig
    * @desc Returns configuration info about the Kubernetes Engine service.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available)
    *     // to return operations for.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.getServerconfig(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
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

