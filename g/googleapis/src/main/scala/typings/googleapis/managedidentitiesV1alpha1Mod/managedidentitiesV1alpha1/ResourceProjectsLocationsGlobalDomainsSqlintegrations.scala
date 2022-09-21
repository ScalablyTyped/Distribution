package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/managedidentities/v1alpha1", "managedidentities_v1alpha1.Resource$Projects$Locations$Global$Domains$Sqlintegrations")
@js.native
open class ResourceProjectsLocationsGlobalDomainsSqlintegrations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSQLIntegration] = js.native
  def get(callback: BodyResponseCallback[SchemaSQLIntegration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSQLIntegration] = js.native
  def get(params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet): GaxiosPromise[SchemaSQLIntegration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet,
    callback: BodyResponseCallback[SchemaSQLIntegration]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet,
    options: BodyResponseCallback[Readable | SchemaSQLIntegration],
    callback: BodyResponseCallback[Readable | SchemaSQLIntegration]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet, options: MethodOptions): GaxiosPromise[SchemaSQLIntegration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSQLIntegration]
  ): Unit = js.native
  /**
    * Gets details of a single sqlIntegration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1alpha1');
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
    *     await managedidentities.projects.locations.global.domains.sqlIntegrations.get(
    *       {
    *         // Required. MangedOU resource name using the form: `projects/{project_id\}/locations/global/domains/x/sqlIntegrations/{name\}`
    *         name: 'projects/my-project/locations/global/domains/my-domain/sqlIntegrations/my-sqlIntegration',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "sqlInstance": "my_sqlInstance",
    *   //   "state": "my_state",
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
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSQLIntegrationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSQLIntegrationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSQLIntegrationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsList): GaxiosPromise[SchemaListSQLIntegrationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsList,
    callback: BodyResponseCallback[SchemaListSQLIntegrationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsList,
    options: BodyResponseCallback[Readable | SchemaListSQLIntegrationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSQLIntegrationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsList, options: MethodOptions): GaxiosPromise[SchemaListSQLIntegrationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSQLIntegrationsResponse]
  ): Unit = js.native
  /**
    * Lists SQLIntegrations in a given domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1alpha1');
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
    *     await managedidentities.projects.locations.global.domains.sqlIntegrations.list(
    *       {
    *         // Optional. Filter specifying constraints of a list operation. For example, `SqlIntegration.name="sql"`.
    *         filter: 'placeholder-value',
    *         // Optional. Specifies the ordering of results following syntax at https://cloud.google.com/apis/design/design_patterns#sorting_order.
    *         orderBy: 'placeholder-value',
    *         // Optional. The maximum number of items to return. If not specified, a default value of 1000 will be used by the service. Regardless of the page_size value, the response may include a partial list and a caller should only rely on response'ANIZATIONs next_page_token to determine if there are more instances left to be queried.
    *         pageSize: 'placeholder-value',
    *         // Optional. The next_page_token value returned from a previous List request, if any.
    *         pageToken: 'placeholder-value',
    *         // Required. The resource name of the SqlIntegrations using the form: `projects/{project_id\}/locations/global/domains/x`
    *         parent: 'projects/my-project/locations/global/domains/my-domain',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sqlIntegrations": [],
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
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
