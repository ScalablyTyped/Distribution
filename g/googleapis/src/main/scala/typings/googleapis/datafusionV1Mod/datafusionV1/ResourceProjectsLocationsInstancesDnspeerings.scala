package typings.googleapis.datafusionV1Mod.datafusionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datafusion/v1", "datafusion_v1.Resource$Projects$Locations$Instances$Dnspeerings")
@js.native
open class ResourceProjectsLocationsInstancesDnspeerings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDnsPeering] = js.native
  def create(callback: BodyResponseCallback[SchemaDnsPeering]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDnsPeering] = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate): GaxiosPromise[SchemaDnsPeering] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate,
    callback: BodyResponseCallback[SchemaDnsPeering]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate,
    options: BodyResponseCallback[Readable | SchemaDnsPeering],
    callback: BodyResponseCallback[Readable | SchemaDnsPeering]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate, options: MethodOptions): GaxiosPromise[SchemaDnsPeering] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDnsPeering]
  ): Unit = js.native
  /**
    * Creates DNS peering on the given resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datafusion.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datafusion = google.datafusion('v1');
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
    *   const res = await datafusion.projects.locations.instances.dnsPeerings.create({
    *     // Required. The name of the peering to create.
    *     dnsPeeringId: 'placeholder-value',
    *     // Required. The resource on which DNS peering will be created.
    *     parent: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "domain": "my_domain",
    *       //   "name": "my_name",
    *       //   "targetNetwork": "my_targetNetwork",
    *       //   "targetProject": "my_targetProject"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "domain": "my_domain",
    *   //   "name": "my_name",
    *   //   "targetNetwork": "my_targetNetwork",
    *   //   "targetProject": "my_targetProject"
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
  def create(params: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes DNS peering on the given resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datafusion.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datafusion = google.datafusion('v1');
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
    *   const res = await datafusion.projects.locations.instances.dnsPeerings.delete({
    *     // Required. The name of the DNS peering zone to delete. Format: projects/{project\}/locations/{location\}/instances/{instance\}/dnsPeerings/{dns_peering\}
    *     name: 'projects/my-project/locations/my-location/instances/my-instance/dnsPeerings/my-dnsPeering',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDnsPeeringsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDnsPeeringsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDnsPeeringsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesDnspeeringsList): GaxiosPromise[SchemaListDnsPeeringsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsList,
    callback: BodyResponseCallback[SchemaListDnsPeeringsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsList,
    options: BodyResponseCallback[Readable | SchemaListDnsPeeringsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDnsPeeringsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesDnspeeringsList, options: MethodOptions): GaxiosPromise[SchemaListDnsPeeringsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDnsPeeringsResponse]
  ): Unit = js.native
  /**
    * Lists DNS peerings for a given resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datafusion.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datafusion = google.datafusion('v1');
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
    *   const res = await datafusion.projects.locations.instances.dnsPeerings.list({
    *     // The maximum number of dns peerings to return. The service may return fewer than this value. If unspecified, at most 50 dns peerings will be returned. The maximum value is 200; values above 200 will be coerced to 200.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListDnsPeerings` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListDnsPeerings` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns this collection of dns peerings. Format: projects/{project\}/locations/{location\}/instances/{instance\}
    *     parent: 'projects/my-project/locations/my-location/instances/my-instance',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dnsPeerings": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsLocationsInstancesDnspeeringsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesDnspeeringsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
