package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1beta2", "securitycenter_v1beta2.Resource$Projects$Locations$Clusters")
@js.native
open class ResourceProjectsLocationsClusters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var containerThreatDetectionSettings: ResourceProjectsLocationsClustersContainerthreatdetectionsettings = js.native
  
  var context: APIRequestContext = js.native
  
  def getContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def getContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(params: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings,
    options: MethodOptions
  ): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Get the ContainerThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *   const res =
    *     await securitycenter.projects.locations.clusters.getContainerThreatDetectionSettings(
    *       {
    *         // Required. The name of the ContainerThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *         name: 'projects/my-project/locations/my-location/clusters/my-cluster/containerThreatDetectionSettings',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
    *   //   "updateTime": "my_updateTime"
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
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def updateContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(params: ParamsResourceProjectsLocationsClustersUpdatecontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersUpdatecontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersUpdatecontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersUpdatecontainerthreatdetectionsettings,
    options: MethodOptions
  ): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersUpdatecontainerthreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Update the ContainerThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *   const res =
    *     await securitycenter.projects.locations.clusters.updateContainerThreatDetectionSettings(
    *       {
    *         // The resource name of the ContainerThreatDetectionSettings. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *         name: 'projects/my-project/locations/my-location/clusters/my-cluster/containerThreatDetectionSettings',
    *         // The list of fields to be updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "modules": {},
    *           //   "name": "my_name",
    *           //   "serviceAccount": "my_serviceAccount",
    *           //   "serviceEnablementState": "my_serviceEnablementState",
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
    *   //   "updateTime": "my_updateTime"
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
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersUpdatecontainerthreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsLocationsClustersUpdatecontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
