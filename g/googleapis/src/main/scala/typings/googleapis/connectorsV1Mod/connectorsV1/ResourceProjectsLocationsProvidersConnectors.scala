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

@JSImport("googleapis/build/src/apis/connectors/v1", "connectors_v1.Resource$Projects$Locations$Providers$Connectors")
@js.native
open class ResourceProjectsLocationsProvidersConnectors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaConnector] = js.native
  def get(callback: BodyResponseCallback[SchemaConnector]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConnector] = js.native
  def get(params: ParamsResourceProjectsLocationsProvidersConnectorsGet): GaxiosPromise[SchemaConnector] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsGet,
    callback: BodyResponseCallback[SchemaConnector]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsGet,
    options: BodyResponseCallback[Readable | SchemaConnector],
    callback: BodyResponseCallback[Readable | SchemaConnector]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProvidersConnectorsGet, options: MethodOptions): GaxiosPromise[SchemaConnector] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConnector]
  ): Unit = js.native
  /**
    * Gets details of a single Connector.
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
    *   const res = await connectors.projects.locations.providers.connectors.get({
    *     // Required. Resource name of the form: `projects/x/locations/x/providers/x/connectors/x` Only global location is supported for Connector resource.
    *     name: 'projects/my-project/locations/my-location/providers/my-provider/connectors/my-connector',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "documentationUri": "my_documentationUri",
    *   //   "externalUri": "my_externalUri",
    *   //   "labels": {},
    *   //   "launchStage": "my_launchStage",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "webAssetsLocation": "my_webAssetsLocation"
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
  def get(params: ParamsResourceProjectsLocationsProvidersConnectorsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListConnectorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConnectorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConnectorsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProvidersConnectorsList): GaxiosPromise[SchemaListConnectorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsList,
    callback: BodyResponseCallback[SchemaListConnectorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsList,
    options: BodyResponseCallback[Readable | SchemaListConnectorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConnectorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProvidersConnectorsList, options: MethodOptions): GaxiosPromise[SchemaListConnectorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConnectorsResponse]
  ): Unit = js.native
  /**
    * Lists Connectors in a given project and location.
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
    *   const res = await connectors.projects.locations.providers.connectors.list({
    *     // Page size.
    *     pageSize: 'placeholder-value',
    *     // Page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource of the connectors, of the form: `projects/x/locations/x/providers/x` Only global location is supported for Connector resource.
    *     parent: 'projects/my-project/locations/my-location/providers/my-provider',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "connectors": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsProvidersConnectorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var versions: ResourceProjectsLocationsProvidersConnectorsVersions = js.native
}
