package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/contactcenterinsights/v1", "contactcenterinsights_v1.Resource$Projects$Locations$Issuemodels")
@js.native
open class ResourceProjectsLocationsIssuemodels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def calculateIssueModelStats(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse] = js.native
  def calculateIssueModelStats(
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse]
  ): Unit = js.native
  def calculateIssueModelStats(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse] = js.native
  def calculateIssueModelStats(params: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse] = js.native
  def calculateIssueModelStats(
    params: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse]
  ): Unit = js.native
  def calculateIssueModelStats(
    params: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse
    ]
  ): Unit = js.native
  def calculateIssueModelStats(params: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse] = js.native
  def calculateIssueModelStats(
    params: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse]
  ): Unit = js.native
  /**
    * Gets an issue model's statistics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *     await contactcenterinsights.projects.locations.issueModels.calculateIssueModelStats(
    *       {
    *         // Required. The resource name of the issue model to query against.
    *         issueModel:
    *           'projects/my-project/locations/my-location/issueModels/my-issueModel',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentStats": {}
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
  def calculateIssueModelStats(
    params: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def calculateIssueModelStats(
    params: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsIssuemodelsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsIssuemodelsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsIssuemodelsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsIssuemodelsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsIssuemodelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates an issue model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.issueModels.create(
    *     {
    *       // Required. The parent resource of the issue model.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "displayName": "my_displayName",
    *         //   "inputDataConfig": {},
    *         //   "name": "my_name",
    *         //   "state": "my_state",
    *         //   "trainingStats": {},
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     }
    *   );
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
  def create(params: ParamsResourceProjectsLocationsIssuemodelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsIssuemodelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsIssuemodelsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsIssuemodelsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsIssuemodelsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsIssuemodelsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsIssuemodelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes an issue model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.issueModels.delete(
    *     {
    *       // Required. The name of the issue model to delete.
    *       name: 'projects/my-project/locations/my-location/issueModels/my-issueModel',
    *     }
    *   );
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
  def delete(params: ParamsResourceProjectsLocationsIssuemodelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsIssuemodelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deploy(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def deploy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(params: ParamsResourceProjectsLocationsIssuemodelsDeploy): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsIssuemodelsDeploy,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsIssuemodelsDeploy,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def deploy(params: ParamsResourceProjectsLocationsIssuemodelsDeploy, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsIssuemodelsDeploy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deploys an issue model. Returns an error if a model is already deployed. An issue model can only be used in analysis after it has been deployed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.issueModels.deploy(
    *     {
    *       // Required. The issue model to deploy.
    *       name: 'projects/my-project/locations/my-location/issueModels/my-issueModel',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "name": "my_name"
    *         // }
    *       },
    *     }
    *   );
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
  def deploy(params: ParamsResourceProjectsLocationsIssuemodelsDeploy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsIssuemodelsDeploy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1IssueModel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def get(params: ParamsResourceProjectsLocationsIssuemodelsGet): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1IssueModel]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1IssueModel],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1IssueModel]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsIssuemodelsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1IssueModel]
  ): Unit = js.native
  /**
    * Gets an issue model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.issueModels.get({
    *     // Required. The name of the issue model to get.
    *     name: 'projects/my-project/locations/my-location/issueModels/my-issueModel',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "inputDataConfig": {},
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "trainingStats": {},
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
  def get(params: ParamsResourceProjectsLocationsIssuemodelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var issues: ResourceProjectsLocationsIssuemodelsIssues = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsIssuemodelsList): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsList,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsIssuemodelsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse]
  ): Unit = js.native
  /**
    * Lists issue models.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.issueModels.list({
    *     // Required. The parent resource of the issue model.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "issueModels": []
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
  def list(params: ParamsResourceProjectsLocationsIssuemodelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1IssueModel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def patch(params: ParamsResourceProjectsLocationsIssuemodelsPatch): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1IssueModel]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1IssueModel],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1IssueModel]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsIssuemodelsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1IssueModel]
  ): Unit = js.native
  /**
    * Updates an issue model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.issueModels.patch({
    *     // Immutable. The resource name of the issue model. Format: projects/{project\}/locations/{location\}/issueModels/{issue_model\}
    *     name: 'projects/my-project/locations/my-location/issueModels/my-issueModel',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "inputDataConfig": {},
    *       //   "name": "my_name",
    *       //   "state": "my_state",
    *       //   "trainingStats": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "inputDataConfig": {},
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "trainingStats": {},
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
  def patch(params: ParamsResourceProjectsLocationsIssuemodelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undeploy(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def undeploy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(params: ParamsResourceProjectsLocationsIssuemodelsUndeploy): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsIssuemodelsUndeploy,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsIssuemodelsUndeploy,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def undeploy(params: ParamsResourceProjectsLocationsIssuemodelsUndeploy, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsIssuemodelsUndeploy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Undeploys an issue model. An issue model can not be used in analysis after it has been undeployed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *     await contactcenterinsights.projects.locations.issueModels.undeploy({
    *       // Required. The issue model to undeploy.
    *       name: 'projects/my-project/locations/my-location/issueModels/my-issueModel',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
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
  def undeploy(params: ParamsResourceProjectsLocationsIssuemodelsUndeploy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsIssuemodelsUndeploy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
