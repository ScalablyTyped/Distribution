package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicenetworking/v1", "servicenetworking_v1.Resource$Services$Projects$Global$Networks")
@js.native
open class ResourceServicesProjectsGlobalNetworks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaConsumerConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaConsumerConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsumerConfig] = js.native
  def get(params: ParamsResourceServicesProjectsGlobalNetworksGet): GaxiosPromise[SchemaConsumerConfig] = js.native
  def get(
    params: ParamsResourceServicesProjectsGlobalNetworksGet,
    callback: BodyResponseCallback[SchemaConsumerConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceServicesProjectsGlobalNetworksGet,
    options: BodyResponseCallback[Readable | SchemaConsumerConfig],
    callback: BodyResponseCallback[Readable | SchemaConsumerConfig]
  ): Unit = js.native
  def get(params: ParamsResourceServicesProjectsGlobalNetworksGet, options: MethodOptions): GaxiosPromise[SchemaConsumerConfig] = js.native
  def get(
    params: ParamsResourceServicesProjectsGlobalNetworksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsumerConfig]
  ): Unit = js.native
  /**
    * Service producers use this method to get the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicenetworking.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicenetworking = google.servicenetworking('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicenetworking.services.projects.global.networks.get({
    *     // Optional. When true, include the used IP ranges as part of the GetConsumerConfig output. This includes routes created inside the service networking network, consumer network, peers of the consumer network, and reserved ranges inside the service networking network. By default, this is false
    *     includeUsedIpRanges: 'placeholder-value',
    *     // Required. Name of the consumer config to retrieve in the format: `services/{service\}/projects/{project\}/global/networks/{network\}`. {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is a project number e.g. `12345` that contains the service consumer's VPC network. {network\} is the name of the service consumer's VPC network.
    *     name: 'services/my-service/projects/my-project/global/networks/my-network',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudsqlConfigs": [],
    *   //   "consumerExportCustomRoutes": false,
    *   //   "consumerExportSubnetRoutesWithPublicIp": false,
    *   //   "consumerImportCustomRoutes": false,
    *   //   "consumerImportSubnetRoutesWithPublicIp": false,
    *   //   "producerExportCustomRoutes": false,
    *   //   "producerExportSubnetRoutesWithPublicIp": false,
    *   //   "producerImportCustomRoutes": false,
    *   //   "producerImportSubnetRoutesWithPublicIp": false,
    *   //   "producerNetwork": "my_producerNetwork",
    *   //   "reservedRanges": [],
    *   //   "usedIpRanges": [],
    *   //   "vpcScReferenceArchitectureEnabled": false
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
  def get(params: ParamsResourceServicesProjectsGlobalNetworksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceServicesProjectsGlobalNetworksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var peeredDnsDomains: ResourceServicesProjectsGlobalNetworksPeereddnsdomains = js.native
  
  def updateConsumerConfig(): GaxiosPromise[SchemaOperation] = js.native
  def updateConsumerConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateConsumerConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateConsumerConfig(params: ParamsResourceServicesProjectsGlobalNetworksUpdateconsumerconfig): GaxiosPromise[SchemaOperation] = js.native
  def updateConsumerConfig(
    params: ParamsResourceServicesProjectsGlobalNetworksUpdateconsumerconfig,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateConsumerConfig(
    params: ParamsResourceServicesProjectsGlobalNetworksUpdateconsumerconfig,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateConsumerConfig(params: ParamsResourceServicesProjectsGlobalNetworksUpdateconsumerconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateConsumerConfig(
    params: ParamsResourceServicesProjectsGlobalNetworksUpdateconsumerconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Service producers use this method to update the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicenetworking.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicenetworking = google.servicenetworking('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await servicenetworking.services.projects.global.networks.updateConsumerConfig(
    *       {
    *         // Required. Parent resource identifying the connection for which the consumer config is being updated in the format: `services/{service\}/projects/{project\}/global/networks/{network\}` {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is the number of the project that contains the service consumer's VPC network e.g. `12345`. {network\} is the name of the service consumer's VPC network.
    *         parent:
    *           'services/my-service/projects/my-project/global/networks/my-network',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "consumerConfig": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def updateConsumerConfig(
    params: ParamsResourceServicesProjectsGlobalNetworksUpdateconsumerconfig,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateConsumerConfig(
    params: ParamsResourceServicesProjectsGlobalNetworksUpdateconsumerconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
