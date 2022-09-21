package typings.googleapis.recommenderV1Mod.recommenderV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recommender/v1", "recommender_v1.Resource$Organizations$Locations$Insighttypes")
@js.native
open class ResourceOrganizationsLocationsInsighttypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getConfig(): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1InsightTypeConfig]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def getConfig(params: ParamsResourceOrganizationsLocationsInsighttypesGetconfig): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def getConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesGetconfig,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1InsightTypeConfig]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesGetconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1InsightTypeConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1InsightTypeConfig]
  ): Unit = js.native
  def getConfig(params: ParamsResourceOrganizationsLocationsInsighttypesGetconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def getConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1InsightTypeConfig]
  ): Unit = js.native
  /**
    * Gets the requested InsightTypeConfig. There is only one instance of the config for each InsightType.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommender.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommender = google.recommender('v1');
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
    *   const res = await recommender.organizations.locations.insightTypes.getConfig({
    *     // Required. Name of the InsightTypeConfig to get. Acceptable formats: * `projects/[PROJECT_NUMBER]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config` * `projects/[PROJECT_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config` * `organizations/[ORGANIZATION_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
    *     name: 'organizations/my-organization/locations/my-location/insightTypes/my-insightType/config',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "insightTypeGenerationConfig": {},
    *   //   "name": "my_name",
    *   //   "revisionId": "my_revisionId",
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
  def getConfig(params: ParamsResourceOrganizationsLocationsInsighttypesGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var insights: ResourceOrganizationsLocationsInsighttypesInsights = js.native
  
  def updateConfig(): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1InsightTypeConfig]): Unit = js.native
  def updateConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def updateConfig(params: ParamsResourceOrganizationsLocationsInsighttypesUpdateconfig): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def updateConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesUpdateconfig,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1InsightTypeConfig]
  ): Unit = js.native
  def updateConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesUpdateconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1InsightTypeConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1InsightTypeConfig]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceOrganizationsLocationsInsighttypesUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def updateConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1InsightTypeConfig]
  ): Unit = js.native
  /**
    * Updates an InsightTypeConfig change. This will create a new revision of the config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommender.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommender = google.recommender('v1');
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
    *     await recommender.organizations.locations.insightTypes.updateConfig({
    *       // Name of insight type config. Eg, projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]/config
    *       name: 'organizations/my-organization/locations/my-location/insightTypes/my-insightType/config',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *       // If true, validate the request and preview the change, but do not actually update it.
    *       validateOnly: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "annotations": {},
    *         //   "displayName": "my_displayName",
    *         //   "etag": "my_etag",
    *         //   "insightTypeGenerationConfig": {},
    *         //   "name": "my_name",
    *         //   "revisionId": "my_revisionId",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "insightTypeGenerationConfig": {},
    *   //   "name": "my_name",
    *   //   "revisionId": "my_revisionId",
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
  def updateConfig(params: ParamsResourceOrganizationsLocationsInsighttypesUpdateconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateConfig(
    params: ParamsResourceOrganizationsLocationsInsighttypesUpdateconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
