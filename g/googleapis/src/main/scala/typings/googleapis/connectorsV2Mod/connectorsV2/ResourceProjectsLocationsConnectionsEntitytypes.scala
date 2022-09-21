package typings.googleapis.connectorsV2Mod.connectorsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/connectors/v2", "connectors_v2.Resource$Projects$Locations$Connections$Entitytypes")
@js.native
open class ResourceProjectsLocationsConnectionsEntitytypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var entities: ResourceProjectsLocationsConnectionsEntitytypesEntities = js.native
  
  def list(): GaxiosPromise[SchemaListEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEntityTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEntityTypesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsEntitytypesList): GaxiosPromise[SchemaListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesList,
    callback: BodyResponseCallback[SchemaListEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesList,
    options: BodyResponseCallback[Readable | SchemaListEntityTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaListEntityTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsEntitytypesList, options: MethodOptions): GaxiosPromise[SchemaListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEntityTypesResponse]
  ): Unit = js.native
  /**
    * Lists metadata related to all entity types present in the external system.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *   const res = await connectors.projects.locations.connections.entityTypes.list({
    *     // Number of entity types to return. Defaults to 25.
    *     pageSize: 'placeholder-value',
    *     // Page token, return from a previous ListEntityTypes call, that can be used retrieve the next page of content. If unspecified, the request returns the first page of entity types.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}
    *     parent:
    *       'projects/my-project/locations/my-location/connections/my-connection',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "types": [],
    *   //   "unsupportedTypeNames": []
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
  def list(params: ParamsResourceProjectsLocationsConnectionsEntitytypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsEntitytypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
