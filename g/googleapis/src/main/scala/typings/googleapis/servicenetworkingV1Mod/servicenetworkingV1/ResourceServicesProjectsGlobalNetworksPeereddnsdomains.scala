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

@JSImport("googleapis/build/src/apis/servicenetworking/v1", "servicenetworking_v1.Resource$Services$Projects$Global$Networks$Peereddnsdomains")
@js.native
open class ResourceServicesProjectsGlobalNetworksPeereddnsdomains protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a peered DNS domain which sends requests for records in given namespace originating in the service producer VPC network to the consumer VPC network to be resolved.
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
    *     await servicenetworking.services.projects.global.networks.peeredDnsDomains.create(
    *       {
    *         // Required. Parent resource identifying the connection for which the peered DNS domain will be created in the format: `services/{service\}/projects/{project\}/global/networks/{network\}` {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is the number of the project that contains the service consumer's VPC network e.g. `12345`. {network\} is the name of the service consumer's VPC network.
    *         parent:
    *           'services/my-service/projects/my-project/global/networks/my-network',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "dnsSuffix": "my_dnsSuffix",
    *           //   "name": "my_name"
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
  def create(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a peered DNS domain.
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
    *     await servicenetworking.services.projects.global.networks.peeredDnsDomains.delete(
    *       {
    *         // Required. The name of the peered DNS domain to delete in the format: `services/{service\}/projects/{project\}/global/networks/{network\}/peeredDnsDomains/{name\}`. {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is the number of the project that contains the service consumer's VPC network e.g. `12345`. {network\} is the name of the service consumer's VPC network. {name\} is the name of the peered DNS domain.
    *         name: 'services/my-service/projects/my-project/global/networks/my-network/peeredDnsDomains/my-peeredDnsDomain',
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
  def delete(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPeeredDnsDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPeeredDnsDomainsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPeeredDnsDomainsResponse] = js.native
  def list(params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList): GaxiosPromise[SchemaListPeeredDnsDomainsResponse] = js.native
  def list(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList,
    callback: BodyResponseCallback[SchemaListPeeredDnsDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList,
    options: BodyResponseCallback[Readable | SchemaListPeeredDnsDomainsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPeeredDnsDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList, options: MethodOptions): GaxiosPromise[SchemaListPeeredDnsDomainsResponse] = js.native
  def list(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPeeredDnsDomainsResponse]
  ): Unit = js.native
  /**
    * Lists peered DNS domains for a connection.
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
    *     await servicenetworking.services.projects.global.networks.peeredDnsDomains.list(
    *       {
    *         // Required. Parent resource identifying the connection which owns this collection of peered DNS domains in the format: `services/{service\}/projects/{project\}/global/networks/{network\}`. {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is a project number e.g. `12345` that contains the service consumer's VPC network. {network\} is the name of the service consumer's VPC network.
    *         parent:
    *           'services/my-service/projects/my-project/global/networks/my-network',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "peeredDnsDomains": []
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
  def list(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
