package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicenetworking/v1beta", "servicenetworking_v1beta.Resource$Services")
@js.native
open class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addSubnetwork(): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addSubnetwork(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(params: ParamsResourceServicesAddsubnetwork): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(params: ParamsResourceServicesAddsubnetwork, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addSubnetwork(
    params: ParamsResourceServicesAddsubnetwork,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addSubnetwork(params: ParamsResourceServicesAddsubnetwork, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(
    params: ParamsResourceServicesAddsubnetwork,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * For service producers, provisions a new subnet in a peered service's shared VPC network in the requested region and with the requested size that's expressed as a CIDR range (number of leading bits of ipV4 network mask). The method checks against the assigned allocated ranges to find a non-conflicting IP address range. The method will reuse a subnet if subsequent calls contain the same subnet name, region, and prefix length. This method will make producer's tenant project to be a shared VPC service project as needed. The response from the `get` operation will be of type `Subnetwork` if the operation successfully completes.
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
    * const servicenetworking = google.servicenetworking('v1beta');
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
    *   const res = await servicenetworking.services.addSubnetwork({
    *     // Required. A tenant project in the service producer organization, in the following format: services/{service\}/{collection-id\}/{resource-id\}. {collection-id\} is the cloud resource collection type that represents the tenant project. Only `projects` are supported. {resource-id\} is the tenant project numeric id, such as `123456`. {service\} the name of the peering service, such as `service-peering.example.com`. This service must already be enabled in the service consumer's project.
    *     parent: 'services/my-service/[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consumer": "my_consumer",
    *       //   "consumerNetwork": "my_consumerNetwork",
    *       //   "description": "my_description",
    *       //   "ipPrefixLength": 0,
    *       //   "region": "my_region",
    *       //   "requestedAddress": "my_requestedAddress",
    *       //   "subnetwork": "my_subnetwork",
    *       //   "subnetworkUsers": []
    *       // }
    *     },
    *   });
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
  def addSubnetwork(params: ParamsResourceServicesAddsubnetwork, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addSubnetwork(
    params: ParamsResourceServicesAddsubnetwork,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var connections: ResourceServicesConnections = js.native
  
  var context: APIRequestContext = js.native
  
  def searchRange(): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def searchRange(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(params: ParamsResourceServicesSearchrange): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(params: ParamsResourceServicesSearchrange, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def searchRange(
    params: ParamsResourceServicesSearchrange,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def searchRange(params: ParamsResourceServicesSearchrange, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(
    params: ParamsResourceServicesSearchrange,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Service producers can use this method to find a currently unused range within consumer allocated ranges. This returned range is not reserved, and not guaranteed to remain unused. It will validate previously provided allocated ranges, find non-conflicting sub-range of requested size (expressed in number of leading bits of ipv4 network mask, as in CIDR range notation). Operation
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
    * const servicenetworking = google.servicenetworking('v1beta');
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
    *   const res = await servicenetworking.services.searchRange({
    *     // Required. This is in a form services/{service\}. {service\} the name of the private access management service, for example 'service-peering.example.com'.
    *     parent: 'services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ipPrefixLength": 0,
    *       //   "network": "my_network"
    *       // }
    *     },
    *   });
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
  def searchRange(params: ParamsResourceServicesSearchrange, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchRange(
    params: ParamsResourceServicesSearchrange,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateConnections(): GaxiosPromise[SchemaOperation] = js.native
  def updateConnections(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateConnections(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateConnections(params: ParamsResourceServicesUpdateconnections): GaxiosPromise[SchemaOperation] = js.native
  def updateConnections(params: ParamsResourceServicesUpdateconnections, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateConnections(
    params: ParamsResourceServicesUpdateconnections,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateConnections(params: ParamsResourceServicesUpdateconnections, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateConnections(
    params: ParamsResourceServicesUpdateconnections,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the allocated ranges that are assigned to a connection. The response from the `get` operation will be of type `Connection` if the operation successfully completes.
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
    * const servicenetworking = google.servicenetworking('v1beta');
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
    *   const res = await servicenetworking.services.updateConnections({
    *     // If a previously defined allocated range is removed, force flag must be set to true.
    *     force: 'placeholder-value',
    *     // The service producer peering service that is managing peering connectivity for a service producer organization. For Google services that support this functionality, this is `services/servicenetworking.googleapis.com`.
    *     name: 'services/my-service',
    *     // The update mask. If this is omitted, it defaults to "*". You can only update the listed peering ranges.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "network": "my_network",
    *       //   "peering": "my_peering",
    *       //   "reservedPeeringRanges": [],
    *       //   "service": "my_service"
    *       // }
    *     },
    *   });
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
  def updateConnections(params: ParamsResourceServicesUpdateconnections, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateConnections(
    params: ParamsResourceServicesUpdateconnections,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
