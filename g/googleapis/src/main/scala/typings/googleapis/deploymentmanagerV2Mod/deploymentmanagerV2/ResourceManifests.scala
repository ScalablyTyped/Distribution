package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/deploymentmanager/v2", "deploymentmanager_v2.Resource$Manifests")
@js.native
class ResourceManifests protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * deploymentmanager.manifests.get
    * @desc Gets information about a specific manifest.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Deployment Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/deploymentmanager
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var deploymentManager = google.deploymentmanager('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the deployment for this request.
    *     deployment: 'my-deployment',  // TODO: Update placeholder value.
    *
    *     // The name of the manifest for this request.
    *     manifest: 'my-manifest',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   deploymentManager.manifests.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias deploymentmanager.manifests.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string} params.manifest The name of the manifest for this request.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaManifest] = js.native
  def get(callback: BodyResponseCallback[SchemaManifest]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManifest] = js.native
  def get(params: ParamsResourceManifestsGet): GaxiosPromise[SchemaManifest] = js.native
  def get(params: ParamsResourceManifestsGet, callback: BodyResponseCallback[SchemaManifest]): Unit = js.native
  def get(
    params: ParamsResourceManifestsGet,
    options: BodyResponseCallback[SchemaManifest],
    callback: BodyResponseCallback[SchemaManifest]
  ): Unit = js.native
  def get(params: ParamsResourceManifestsGet, options: MethodOptions): GaxiosPromise[SchemaManifest] = js.native
  def get(
    params: ParamsResourceManifestsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManifest]
  ): Unit = js.native
  
  /**
    * deploymentmanager.manifests.list
    * @desc Lists all manifests for a given deployment.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Deployment Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/deploymentmanager
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var deploymentManager = google.deploymentmanager('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the deployment for this request.
    *     deployment: 'my-deployment',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var manifestsPage = response['manifests'];
    *     if (!manifestsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < manifestsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `manifestsPage`: console.log(JSON.stringify(manifestsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       deploymentManager.manifests.list(request, handlePage);
    *     }
    *   };
    *
    *   deploymentManager.manifests.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias deploymentmanager.manifests.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaManifestsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManifestsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManifestsListResponse] = js.native
  def list(params: ParamsResourceManifestsList): GaxiosPromise[SchemaManifestsListResponse] = js.native
  def list(params: ParamsResourceManifestsList, callback: BodyResponseCallback[SchemaManifestsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceManifestsList,
    options: BodyResponseCallback[SchemaManifestsListResponse],
    callback: BodyResponseCallback[SchemaManifestsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManifestsList, options: MethodOptions): GaxiosPromise[SchemaManifestsListResponse] = js.native
  def list(
    params: ParamsResourceManifestsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManifestsListResponse]
  ): Unit = js.native
}
