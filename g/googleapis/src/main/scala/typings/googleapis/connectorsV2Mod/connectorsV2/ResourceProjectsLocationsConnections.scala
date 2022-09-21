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

@JSImport("googleapis/build/src/apis/connectors/v2", "connectors_v2.Resource$Projects$Locations$Connections")
@js.native
open class ResourceProjectsLocationsConnections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var actions: ResourceProjectsLocationsConnectionsActions = js.native
  
  var context: APIRequestContext = js.native
  
  var entityTypes: ResourceProjectsLocationsConnectionsEntitytypes = js.native
  
  def executeSqlQuery(): GaxiosPromise[SchemaExecuteSqlQueryResponse] = js.native
  def executeSqlQuery(callback: BodyResponseCallback[SchemaExecuteSqlQueryResponse]): Unit = js.native
  def executeSqlQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecuteSqlQueryResponse] = js.native
  def executeSqlQuery(params: ParamsResourceProjectsLocationsConnectionsExecutesqlquery): GaxiosPromise[SchemaExecuteSqlQueryResponse] = js.native
  def executeSqlQuery(
    params: ParamsResourceProjectsLocationsConnectionsExecutesqlquery,
    callback: BodyResponseCallback[SchemaExecuteSqlQueryResponse]
  ): Unit = js.native
  def executeSqlQuery(
    params: ParamsResourceProjectsLocationsConnectionsExecutesqlquery,
    options: BodyResponseCallback[Readable | SchemaExecuteSqlQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaExecuteSqlQueryResponse]
  ): Unit = js.native
  def executeSqlQuery(params: ParamsResourceProjectsLocationsConnectionsExecutesqlquery, options: MethodOptions): GaxiosPromise[SchemaExecuteSqlQueryResponse] = js.native
  def executeSqlQuery(
    params: ParamsResourceProjectsLocationsConnectionsExecutesqlquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecuteSqlQueryResponse]
  ): Unit = js.native
  /**
    * Executes a SQL statement specified in the body of the request. An example of this SQL statement in the case of Salesforce connector would be 'select * from Account a, Order o where a.Id = o.AccountId'.
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
    *   const res = await connectors.projects.locations.connections.executeSqlQuery({
    *     // Required. Resource name of the Connection. Format: projects/{project\}/locations/{location\}/connections/{connection\}
    *     connection:
    *       'projects/my-project/locations/my-location/connections/my-connection',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "query": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": []
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
  def executeSqlQuery(params: ParamsResourceProjectsLocationsConnectionsExecutesqlquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def executeSqlQuery(
    params: ParamsResourceProjectsLocationsConnectionsExecutesqlquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
