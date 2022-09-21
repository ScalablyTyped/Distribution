package typings.googleapis.connectorsV1Mod.connectorsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/connectors/v1", "connectors_v1.Resource$Projects$Locations$Connections$Runtimeentityschemas")
@js.native
open class ResourceProjectsLocationsConnectionsRuntimeentityschemas protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListRuntimeEntitySchemasResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRuntimeEntitySchemasResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRuntimeEntitySchemasResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList): GaxiosPromise[SchemaListRuntimeEntitySchemasResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList,
    callback: BodyResponseCallback[SchemaListRuntimeEntitySchemasResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList,
    options: BodyResponseCallback[Readable | SchemaListRuntimeEntitySchemasResponse],
    callback: BodyResponseCallback[Readable | SchemaListRuntimeEntitySchemasResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList, options: MethodOptions): GaxiosPromise[SchemaListRuntimeEntitySchemasResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRuntimeEntitySchemasResponse]
  ): Unit = js.native
  /**
    * List schema of a runtime entities filtered by entity name.
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
    * const connectors = google.connectors('v1');
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
    *     await connectors.projects.locations.connections.runtimeEntitySchemas.list({
    *       // Required. Filter Format: entity="{entityId\}" Only entity field is supported with literal equality operator. Accepted filter example: entity="Order" Wildcards are not supported in the filter currently.
    *       filter: 'placeholder-value',
    *       // Page size.
    *       pageSize: 'placeholder-value',
    *       // Page token.
    *       pageToken: 'placeholder-value',
    *       // Required. Parent resource of RuntimeEntitySchema Format: projects/{project\}/locations/{location\}/connections/{connection\}
    *       parent:
    *         'projects/my-project/locations/my-location/connections/my-connection',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "runtimeEntitySchemas": []
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
    params: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
