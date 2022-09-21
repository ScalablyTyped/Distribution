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

@JSImport("googleapis/build/src/apis/connectors/v1", "connectors_v1.Resource$Projects$Locations$Providers$Connectors$Versions")
@js.native
open class ResourceProjectsLocationsProvidersConnectorsVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaConnectorVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaConnectorVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConnectorVersion] = js.native
  def get(params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet): GaxiosPromise[SchemaConnectorVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet,
    callback: BodyResponseCallback[SchemaConnectorVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet,
    options: BodyResponseCallback[Readable | SchemaConnectorVersion],
    callback: BodyResponseCallback[Readable | SchemaConnectorVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaConnectorVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConnectorVersion]
  ): Unit = js.native
  /**
    * Gets details of a single connector version.
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
    *     await connectors.projects.locations.providers.connectors.versions.get({
    *       // Required. Resource name of the form: `projects/x/locations/x/providers/x/connectors/x/versions/x` Only global location is supported for ConnectorVersion resource.
    *       name: 'projects/my-project/locations/my-location/providers/my-provider/connectors/my-connector/versions/my-version',
    *       // Specifies which fields of the ConnectorVersion are returned in the response. Defaults to `CUSTOMER` view.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authConfigTemplates": [],
    *   //   "configVariableTemplates": [],
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "egressControlConfig": {},
    *   //   "labels": {},
    *   //   "launchStage": "my_launchStage",
    *   //   "name": "my_name",
    *   //   "releaseVersion": "my_releaseVersion",
    *   //   "roleGrant": {},
    *   //   "roleGrants": [],
    *   //   "supportedRuntimeFeatures": {},
    *   //   "updateTime": "my_updateTime"
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
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListConnectorVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConnectorVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConnectorVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsList): GaxiosPromise[SchemaListConnectorVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsList,
    callback: BodyResponseCallback[SchemaListConnectorVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsList,
    options: BodyResponseCallback[Readable | SchemaListConnectorVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConnectorVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsList, options: MethodOptions): GaxiosPromise[SchemaListConnectorVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConnectorVersionsResponse]
  ): Unit = js.native
  /**
    * Lists Connector Versions in a given project and location.
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
    *     await connectors.projects.locations.providers.connectors.versions.list({
    *       // Page size.
    *       pageSize: 'placeholder-value',
    *       // Page token.
    *       pageToken: 'placeholder-value',
    *       // Required. Parent resource of the connectors, of the form: `projects/x/locations/x/providers/x/connectors/x` Only global location is supported for ConnectorVersion resource.
    *       parent:
    *         'projects/my-project/locations/my-location/providers/my-provider/connectors/my-connector',
    *       // Specifies which fields of the ConnectorVersion are returned in the response. Defaults to `BASIC` view.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "connectorVersions": [],
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
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersConnectorsVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
