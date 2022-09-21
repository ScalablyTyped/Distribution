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

@JSImport("googleapis/build/src/apis/servicenetworking/v1", "servicenetworking_v1.Resource$Services")
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
    * For service producers, provisions a new subnet in a peered service's shared VPC network in the requested region and with the requested size that's expressed as a CIDR range (number of leading bits of ipV4 network mask). The method checks against the assigned allocated ranges to find a non-conflicting IP address range. The method will reuse a subnet if subsequent calls contain the same subnet name, region, and prefix length. This method will make producer's tenant project to be a shared VPC service project as needed.
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
    *   const res = await servicenetworking.services.addSubnetwork({
    *     // Required. A tenant project in the service producer organization, in the following format: services/{service\}/{collection-id\}/{resource-id\}. {collection-id\} is the cloud resource collection type that represents the tenant project. Only `projects` are supported. {resource-id\} is the tenant project numeric id, such as `123456`. {service\} the name of the peering service, such as `service-peering.example.com`. This service must already be enabled in the service consumer's project.
    *     parent: 'services/my-service/[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "checkServiceNetworkingUsePermission": false,
    *       //   "computeIdempotencyWindow": "my_computeIdempotencyWindow",
    *       //   "consumer": "my_consumer",
    *       //   "consumerNetwork": "my_consumerNetwork",
    *       //   "description": "my_description",
    *       //   "ipPrefixLength": 0,
    *       //   "outsideAllocationPublicIpRange": "my_outsideAllocationPublicIpRange",
    *       //   "privateIpv6GoogleAccess": "my_privateIpv6GoogleAccess",
    *       //   "purpose": "my_purpose",
    *       //   "region": "my_region",
    *       //   "requestedAddress": "my_requestedAddress",
    *       //   "requestedRanges": [],
    *       //   "secondaryIpRangeSpecs": [],
    *       //   "subnetwork": "my_subnetwork",
    *       //   "subnetworkUsers": [],
    *       //   "useCustomComputeIdempotencyWindow": false
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
  
  def disableVpcServiceControls(): GaxiosPromise[SchemaOperation] = js.native
  def disableVpcServiceControls(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disableVpcServiceControls(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disableVpcServiceControls(params: ParamsResourceServicesDisablevpcservicecontrols): GaxiosPromise[SchemaOperation] = js.native
  def disableVpcServiceControls(
    params: ParamsResourceServicesDisablevpcservicecontrols,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def disableVpcServiceControls(
    params: ParamsResourceServicesDisablevpcservicecontrols,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def disableVpcServiceControls(params: ParamsResourceServicesDisablevpcservicecontrols, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disableVpcServiceControls(
    params: ParamsResourceServicesDisablevpcservicecontrols,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Disables VPC service controls for a connection.
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
    *   const res = await servicenetworking.services.disableVpcServiceControls({
    *     // The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`.
    *     parent: 'services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consumerNetwork": "my_consumerNetwork"
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
  def disableVpcServiceControls(params: ParamsResourceServicesDisablevpcservicecontrols, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def disableVpcServiceControls(
    params: ParamsResourceServicesDisablevpcservicecontrols,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var dnsRecordSets: ResourceServicesDnsrecordsets = js.native
  
  var dnsZones: ResourceServicesDnszones = js.native
  
  def enableVpcServiceControls(): GaxiosPromise[SchemaOperation] = js.native
  def enableVpcServiceControls(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enableVpcServiceControls(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enableVpcServiceControls(params: ParamsResourceServicesEnablevpcservicecontrols): GaxiosPromise[SchemaOperation] = js.native
  def enableVpcServiceControls(
    params: ParamsResourceServicesEnablevpcservicecontrols,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def enableVpcServiceControls(
    params: ParamsResourceServicesEnablevpcservicecontrols,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def enableVpcServiceControls(params: ParamsResourceServicesEnablevpcservicecontrols, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enableVpcServiceControls(
    params: ParamsResourceServicesEnablevpcservicecontrols,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Enables VPC service controls for a connection.
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
    *   const res = await servicenetworking.services.enableVpcServiceControls({
    *     // The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`.
    *     parent: 'services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consumerNetwork": "my_consumerNetwork"
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
  def enableVpcServiceControls(params: ParamsResourceServicesEnablevpcservicecontrols, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enableVpcServiceControls(
    params: ParamsResourceServicesEnablevpcservicecontrols,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var projects: ResourceServicesProjects = js.native
  
  var roles: ResourceServicesRoles = js.native
  
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
    * Service producers can use this method to find a currently unused range within consumer allocated ranges. This returned range is not reserved, and not guaranteed to remain unused. It will validate previously provided allocated ranges, find non-conflicting sub-range of requested size (expressed in number of leading bits of ipv4 network mask, as in CIDR range notation).
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
  
  def validate(): GaxiosPromise[SchemaValidateConsumerConfigResponse] = js.native
  def validate(callback: BodyResponseCallback[SchemaValidateConsumerConfigResponse]): Unit = js.native
  def validate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaValidateConsumerConfigResponse] = js.native
  def validate(params: ParamsResourceServicesValidate): GaxiosPromise[SchemaValidateConsumerConfigResponse] = js.native
  def validate(
    params: ParamsResourceServicesValidate,
    callback: BodyResponseCallback[SchemaValidateConsumerConfigResponse]
  ): Unit = js.native
  def validate(
    params: ParamsResourceServicesValidate,
    options: BodyResponseCallback[Readable | SchemaValidateConsumerConfigResponse],
    callback: BodyResponseCallback[Readable | SchemaValidateConsumerConfigResponse]
  ): Unit = js.native
  def validate(params: ParamsResourceServicesValidate, options: MethodOptions): GaxiosPromise[SchemaValidateConsumerConfigResponse] = js.native
  def validate(
    params: ParamsResourceServicesValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaValidateConsumerConfigResponse]
  ): Unit = js.native
  /**
    * Service producers use this method to validate if the consumer provided network, project and requested range are valid. This allows them to use a fail-fast mechanism for consumer requests, and not have to wait for AddSubnetwork operation completion to determine if user request is invalid.
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
    *   const res = await servicenetworking.services.validate({
    *     // Required. This is in a form services/{service\} where {service\} is the name of the private access management service. For example 'service-peering.example.com'.
    *     parent: 'services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "checkServiceNetworkingUsePermission": false,
    *       //   "consumerNetwork": "my_consumerNetwork",
    *       //   "consumerProject": {},
    *       //   "rangeReservation": {},
    *       //   "validateNetwork": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "existingSubnetworkCandidates": [],
    *   //   "isValid": false,
    *   //   "validationError": "my_validationError"
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
  def validate(params: ParamsResourceServicesValidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validate(
    params: ParamsResourceServicesValidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
