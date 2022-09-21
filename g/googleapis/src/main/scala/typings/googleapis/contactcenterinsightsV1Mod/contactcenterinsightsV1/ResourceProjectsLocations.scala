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

@JSImport("googleapis/build/src/apis/contactcenterinsights/v1", "contactcenterinsights_v1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var conversations: ResourceProjectsLocationsConversations = js.native
  
  def getSettings(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def getSettings(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Settings]): Unit = js.native
  def getSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def getSettings(params: ParamsResourceProjectsLocationsGetsettings): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def getSettings(
    params: ParamsResourceProjectsLocationsGetsettings,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Settings]
  ): Unit = js.native
  def getSettings(
    params: ParamsResourceProjectsLocationsGetsettings,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Settings],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Settings]
  ): Unit = js.native
  def getSettings(params: ParamsResourceProjectsLocationsGetsettings, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def getSettings(
    params: ParamsResourceProjectsLocationsGetsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Settings]
  ): Unit = js.native
  /**
    * Gets project-level settings.
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
    *   const res = await contactcenterinsights.projects.locations.getSettings({
    *     // Required. The name of the settings resource to get.
    *     name: 'projects/my-project/locations/my-location/settings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "analysisConfig": {},
    *   //   "conversationTtl": "my_conversationTtl",
    *   //   "createTime": "my_createTime",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "pubsubNotificationSettings": {},
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
  def getSettings(params: ParamsResourceProjectsLocationsGetsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSettings(
    params: ParamsResourceProjectsLocationsGetsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var insightsdata: ResourceProjectsLocationsInsightsdata = js.native
  
  var issueModels: ResourceProjectsLocationsIssuemodels = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
  
  var phraseMatchers: ResourceProjectsLocationsPhrasematchers = js.native
  
  def updateSettings(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def updateSettings(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Settings]): Unit = js.native
  def updateSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def updateSettings(params: ParamsResourceProjectsLocationsUpdatesettings): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def updateSettings(
    params: ParamsResourceProjectsLocationsUpdatesettings,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Settings]
  ): Unit = js.native
  def updateSettings(
    params: ParamsResourceProjectsLocationsUpdatesettings,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Settings],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Settings]
  ): Unit = js.native
  def updateSettings(params: ParamsResourceProjectsLocationsUpdatesettings, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Settings] = js.native
  def updateSettings(
    params: ParamsResourceProjectsLocationsUpdatesettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Settings]
  ): Unit = js.native
  /**
    * Updates project-level settings.
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
    *   const res = await contactcenterinsights.projects.locations.updateSettings({
    *     // Immutable. The resource name of the settings resource. Format: projects/{project\}/locations/{location\}/settings
    *     name: 'projects/my-project/locations/my-location/settings',
    *     // Required. The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "analysisConfig": {},
    *       //   "conversationTtl": "my_conversationTtl",
    *       //   "createTime": "my_createTime",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name",
    *       //   "pubsubNotificationSettings": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "analysisConfig": {},
    *   //   "conversationTtl": "my_conversationTtl",
    *   //   "createTime": "my_createTime",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "pubsubNotificationSettings": {},
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
  def updateSettings(params: ParamsResourceProjectsLocationsUpdatesettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSettings(
    params: ParamsResourceProjectsLocationsUpdatesettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var views: ResourceProjectsLocationsViews = js.native
}
