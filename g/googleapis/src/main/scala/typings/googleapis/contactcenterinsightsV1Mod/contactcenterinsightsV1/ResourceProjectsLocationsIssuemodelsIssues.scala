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

@JSImport("googleapis/build/src/apis/contactcenterinsights/v1", "contactcenterinsights_v1.Resource$Projects$Locations$Issuemodels$Issues")
@js.native
open class ResourceProjectsLocationsIssuemodelsIssues protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Issue]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def get(params: ParamsResourceProjectsLocationsIssuemodelsIssuesGet): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Issue]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Issue],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Issue]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsIssuemodelsIssuesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Issue]
  ): Unit = js.native
  /**
    * Gets an issue.
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
    *     await contactcenterinsights.projects.locations.issueModels.issues.get({
    *       // Required. The name of the issue to get.
    *       name: 'projects/my-project/locations/my-location/issueModels/my-issueModel/issues/my-issue',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsLocationsIssuemodelsIssuesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsIssuemodelsIssuesList): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesList,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsIssuemodelsIssuesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse]
  ): Unit = js.native
  /**
    * Lists issues.
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
    *     await contactcenterinsights.projects.locations.issueModels.issues.list({
    *       // Required. The parent resource of the issue.
    *       parent:
    *         'projects/my-project/locations/my-location/issueModels/my-issueModel',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "issues": []
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
  def list(params: ParamsResourceProjectsLocationsIssuemodelsIssuesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Issue]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def patch(params: ParamsResourceProjectsLocationsIssuemodelsIssuesPatch): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Issue]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Issue],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Issue]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsIssuemodelsIssuesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Issue] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Issue]
  ): Unit = js.native
  /**
    * Updates an issue.
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
    *     await contactcenterinsights.projects.locations.issueModels.issues.patch({
    *       // Immutable. The resource name of the issue. Format: projects/{project\}/locations/{location\}/issueModels/{issue_model\}/issues/{issue\}
    *       name: 'projects/my-project/locations/my-location/issueModels/my-issueModel/issues/my-issue',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "displayName": "my_displayName",
    *         //   "name": "my_name",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
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
  def patch(params: ParamsResourceProjectsLocationsIssuemodelsIssuesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsIssuemodelsIssuesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
