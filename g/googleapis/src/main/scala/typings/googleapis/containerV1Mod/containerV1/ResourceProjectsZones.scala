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

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Zones")
@js.native
open class ResourceProjectsZones protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var clusters: ResourceProjectsZonesClusters = js.native
  
  var context: APIRequestContext = js.native
  
  def getServerconfig(): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(callback: BodyResponseCallback[SchemaServerConfig]): Unit = js.native
  def getServerconfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(params: ParamsResourceProjectsZonesGetserverconfig): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(
    params: ParamsResourceProjectsZonesGetserverconfig,
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
  def getServerconfig(
    params: ParamsResourceProjectsZonesGetserverconfig,
    options: BodyResponseCallback[Readable | SchemaServerConfig],
    callback: BodyResponseCallback[Readable | SchemaServerConfig]
  ): Unit = js.native
  def getServerconfig(params: ParamsResourceProjectsZonesGetserverconfig, options: MethodOptions): GaxiosPromise[SchemaServerConfig] = js.native
  def getServerconfig(
    params: ParamsResourceProjectsZonesGetserverconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServerConfig]
  ): Unit = js.native
  /**
    * Returns configuration info about the Google Kubernetes Engine service.
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
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await container.projects.zones.getServerconfig({
    *     // The name (project and location) of the server config to get, specified in the format `projects/x/locations/x`.
    *     name: 'placeholder-value',
    *     // Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    *     projectId: 'placeholder-value',
    *     // Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) to return operations for. This field has been deprecated and replaced by the name field.
    *     zone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "channels": [],
    *   //   "defaultClusterVersion": "my_defaultClusterVersion",
    *   //   "defaultImageType": "my_defaultImageType",
    *   //   "validImageTypes": [],
    *   //   "validMasterVersions": [],
    *   //   "validNodeVersions": []
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
  def getServerconfig(params: ParamsResourceProjectsZonesGetserverconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getServerconfig(
    params: ParamsResourceProjectsZonesGetserverconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsZonesOperations = js.native
}
