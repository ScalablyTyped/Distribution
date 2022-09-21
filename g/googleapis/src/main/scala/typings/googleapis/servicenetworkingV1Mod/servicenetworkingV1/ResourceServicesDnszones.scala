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

@JSImport("googleapis/build/src/apis/servicenetworking/v1", "servicenetworking_v1.Resource$Services$Dnszones")
@js.native
open class ResourceServicesDnszones protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def add(): GaxiosPromise[SchemaOperation] = js.native
  def add(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def add(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def add(params: ParamsResourceServicesDnszonesAdd): GaxiosPromise[SchemaOperation] = js.native
  def add(params: ParamsResourceServicesDnszonesAdd, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def add(
    params: ParamsResourceServicesDnszonesAdd,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def add(params: ParamsResourceServicesDnszonesAdd, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def add(
    params: ParamsResourceServicesDnszonesAdd,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Service producers can use this method to add private DNS zones in the shared producer host project and matching peering zones in the consumer project.
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
    *   const res = await servicenetworking.services.dnsZones.add({
    *     // Required. The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`.
    *     parent: 'services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consumerNetwork": "my_consumerNetwork",
    *       //   "dnsSuffix": "my_dnsSuffix",
    *       //   "name": "my_name"
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
  def add(params: ParamsResourceServicesDnszonesAdd, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def add(
    params: ParamsResourceServicesDnszonesAdd,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def remove(): GaxiosPromise[SchemaOperation] = js.native
  def remove(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceServicesDnszonesRemove): GaxiosPromise[SchemaOperation] = js.native
  def remove(params: ParamsResourceServicesDnszonesRemove, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def remove(
    params: ParamsResourceServicesDnszonesRemove,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def remove(params: ParamsResourceServicesDnszonesRemove, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def remove(
    params: ParamsResourceServicesDnszonesRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Service producers can use this method to remove private DNS zones in the shared producer host project and matching peering zones in the consumer project.
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
    *   const res = await servicenetworking.services.dnsZones.remove({
    *     // Required. The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`.
    *     parent: 'services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consumerNetwork": "my_consumerNetwork",
    *       //   "name": "my_name"
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
  def remove(params: ParamsResourceServicesDnszonesRemove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def remove(
    params: ParamsResourceServicesDnszonesRemove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
