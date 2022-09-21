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

@JSImport("googleapis/build/src/apis/servicenetworking/v1", "servicenetworking_v1.Resource$Services$Roles")
@js.native
open class ResourceServicesRoles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def add(): GaxiosPromise[SchemaOperation] = js.native
  def add(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def add(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def add(params: ParamsResourceServicesRolesAdd): GaxiosPromise[SchemaOperation] = js.native
  def add(params: ParamsResourceServicesRolesAdd, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def add(
    params: ParamsResourceServicesRolesAdd,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def add(params: ParamsResourceServicesRolesAdd, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def add(
    params: ParamsResourceServicesRolesAdd,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Service producers can use this method to add roles in the shared VPC host project. Each role is bound to the provided member. Each role must be selected from within an allowlisted set of roles. Each role is applied at only the granularity specified in the allowlist.
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
    *   const res = await servicenetworking.services.roles.add({
    *     // Required. This is in a form services/{service\} where {service\} is the name of the private access management service. For example 'service-peering.example.com'.
    *     parent: 'services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consumerNetwork": "my_consumerNetwork",
    *       //   "policyBinding": []
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
  def add(params: ParamsResourceServicesRolesAdd, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def add(
    params: ParamsResourceServicesRolesAdd,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
