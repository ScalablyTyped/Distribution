package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebase/v1beta1", "firebase_v1beta1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addFirebase(): GaxiosPromise[SchemaOperation] = js.native
  def addFirebase(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addFirebase(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addFirebase(params: ParamsResourceProjectsAddfirebase): GaxiosPromise[SchemaOperation] = js.native
  def addFirebase(params: ParamsResourceProjectsAddfirebase, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addFirebase(
    params: ParamsResourceProjectsAddfirebase,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addFirebase(params: ParamsResourceProjectsAddfirebase, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addFirebase(
    params: ParamsResourceProjectsAddfirebase,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Adds Firebase resources to the specified existing [Google Cloud Platform (GCP) `Project`] (https://cloud.google.com/resource-manager/reference/rest/v1/projects). Since a FirebaseProject is actually also a GCP `Project`, a `FirebaseProject` has the same underlying GCP identifiers (`projectNumber` and `projectId`). This allows for easy interop with Google APIs. The result of this call is an [`Operation`](../../v1beta1/operations). Poll the `Operation` to track the provisioning process by calling GetOperation until [`done`](../../v1beta1/operations#Operation.FIELDS.done) is `true`. When `done` is `true`, the `Operation` has either succeeded or failed. If the `Operation` succeeded, its [`response`](../../v1beta1/operations#Operation.FIELDS.response) is set to a FirebaseProject; if the `Operation` failed, its [`error`](../../v1beta1/operations#Operation.FIELDS.error) is set to a google.rpc.Status. The `Operation` is automatically deleted after completion, so there is no need to call DeleteOperation. This method does not modify any billing account information on the underlying GCP `Project`. To call `AddFirebase`, a project member or service account must have the following permissions (the IAM roles of Editor and Owner contain these permissions): `firebase.projects.update`, `resourcemanager.projects.get`, `serviceusage.services.enable`, and `serviceusage.services.get`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.addFirebase({
    *     // The resource name of the GCP `Project` to which Firebase resources will be added, in the format: projects/PROJECT_IDENTIFIER Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values. After calling `AddFirebase`, the unique Project identifiers ( [`projectNumber`](https://cloud.google.com/resource-manager/reference/rest/v1/projects#Project.FIELDS.project_number) and [`projectId`](https://cloud.google.com/resource-manager/reference/rest/v1/projects#Project.FIELDS.project_id)) of the underlying GCP `Project` are also the identifiers of the FirebaseProject.
    *     project: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "locationId": "my_locationId"
    *       // }
    *     },
    *   });
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
  def addFirebase(params: ParamsResourceProjectsAddfirebase, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addFirebase(
    params: ParamsResourceProjectsAddfirebase,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def addGoogleAnalytics(): GaxiosPromise[SchemaOperation] = js.native
  def addGoogleAnalytics(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addGoogleAnalytics(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addGoogleAnalytics(params: ParamsResourceProjectsAddgoogleanalytics): GaxiosPromise[SchemaOperation] = js.native
  def addGoogleAnalytics(params: ParamsResourceProjectsAddgoogleanalytics, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addGoogleAnalytics(
    params: ParamsResourceProjectsAddgoogleanalytics,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addGoogleAnalytics(params: ParamsResourceProjectsAddgoogleanalytics, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addGoogleAnalytics(
    params: ParamsResourceProjectsAddgoogleanalytics,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Links the specified FirebaseProject with an existing [Google Analytics account](http://www.google.com/analytics/). Using this call, you can either: - Specify an `analyticsAccountId` to provision a new Google Analytics property within the specified account and associate the new property with the `FirebaseProject`. - Specify an existing `analyticsPropertyId` to associate the property with the `FirebaseProject`. Note that when you call `AddGoogleAnalytics`: 1. The first check determines if any existing data streams in the Google Analytics property correspond to any existing Firebase Apps in the `FirebaseProject` (based on the `packageName` or `bundleId` associated with the data stream). Then, as applicable, the data streams and apps are linked. Note that this auto-linking only applies to `AndroidApps` and `IosApps`. 2. If no corresponding data streams are found for the Firebase Apps, new data streams are provisioned in the Google Analytics property for each of the Firebase Apps. Note that a new data stream is always provisioned for a Web App even if it was previously associated with a data stream in the Analytics property. Learn more about the hierarchy and structure of Google Analytics accounts in the [Analytics documentation](https://support.google.com/analytics/answer/9303323). The result of this call is an [`Operation`](../../v1beta1/operations). Poll the `Operation` to track the provisioning process by calling GetOperation until [`done`](../../v1beta1/operations#Operation.FIELDS.done) is `true`. When `done` is `true`, the `Operation` has either succeeded or failed. If the `Operation` succeeded, its [`response`](../../v1beta1/operations#Operation.FIELDS.response) is set to an AnalyticsDetails; if the `Operation` failed, its [`error`](../../v1beta1/operations#Operation.FIELDS.error) is set to a google.rpc.Status. To call `AddGoogleAnalytics`, a project member must be an Owner for the existing `FirebaseProject` and have the [`Edit` permission](https://support.google.com/analytics/answer/2884495) for the Google Analytics account. If the `FirebaseProject` already has Google Analytics enabled, and you call `AddGoogleAnalytics` using an `analyticsPropertyId` that's different from the currently associated property, then the call will fail. Analytics may have already been enabled in the Firebase console or by specifying `timeZone` and `regionCode` in the call to [`AddFirebase`](../../v1beta1/projects/addFirebase).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.addGoogleAnalytics({
    *     // The resource name of the FirebaseProject to link to an existing Google Analytics account, in the format: projects/PROJECT_IDENTIFIER Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "analyticsAccountId": "my_analyticsAccountId",
    *       //   "analyticsPropertyId": "my_analyticsPropertyId"
    *       // }
    *     },
    *   });
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
  def addGoogleAnalytics(params: ParamsResourceProjectsAddgoogleanalytics, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addGoogleAnalytics(
    params: ParamsResourceProjectsAddgoogleanalytics,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var androidApps: ResourceProjectsAndroidapps = js.native
  
  var availableLocations: ResourceProjectsAvailablelocations = js.native
  
  var context: APIRequestContext = js.native
  
  var defaultLocation: ResourceProjectsDefaultlocation = js.native
  
  def get(): GaxiosPromise[SchemaFirebaseProject] = js.native
  def get(callback: BodyResponseCallback[SchemaFirebaseProject]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirebaseProject] = js.native
  def get(params: ParamsResourceProjectsGet): GaxiosPromise[SchemaFirebaseProject] = js.native
  def get(params: ParamsResourceProjectsGet, callback: BodyResponseCallback[SchemaFirebaseProject]): Unit = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: BodyResponseCallback[Readable | SchemaFirebaseProject],
    callback: BodyResponseCallback[Readable | SchemaFirebaseProject]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsGet, options: MethodOptions): GaxiosPromise[SchemaFirebaseProject] = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirebaseProject]
  ): Unit = js.native
  /**
    * Gets the specified FirebaseProject.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.get({
    *     // The resource name of the FirebaseProject, in the format: projects/ PROJECT_IDENTIFIER Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     name: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "projectNumber": "my_projectNumber",
    *   //   "resources": {},
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAdminSdkConfig(): GaxiosPromise[SchemaAdminSdkConfig] = js.native
  def getAdminSdkConfig(callback: BodyResponseCallback[SchemaAdminSdkConfig]): Unit = js.native
  def getAdminSdkConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdminSdkConfig] = js.native
  def getAdminSdkConfig(params: ParamsResourceProjectsGetadminsdkconfig): GaxiosPromise[SchemaAdminSdkConfig] = js.native
  def getAdminSdkConfig(
    params: ParamsResourceProjectsGetadminsdkconfig,
    callback: BodyResponseCallback[SchemaAdminSdkConfig]
  ): Unit = js.native
  def getAdminSdkConfig(
    params: ParamsResourceProjectsGetadminsdkconfig,
    options: BodyResponseCallback[Readable | SchemaAdminSdkConfig],
    callback: BodyResponseCallback[Readable | SchemaAdminSdkConfig]
  ): Unit = js.native
  def getAdminSdkConfig(params: ParamsResourceProjectsGetadminsdkconfig, options: MethodOptions): GaxiosPromise[SchemaAdminSdkConfig] = js.native
  def getAdminSdkConfig(
    params: ParamsResourceProjectsGetadminsdkconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdminSdkConfig]
  ): Unit = js.native
  /**
    * Gets the configuration artifact associated with the specified FirebaseProject, which can be used by servers to simplify initialization. Typically, this configuration is used with the Firebase Admin SDK [initializeApp](https://firebase.google.com/docs/admin/setup#initialize_the_sdk) command.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.getAdminSdkConfig({
    *     // The resource name of the FirebaseProject, in the format: projects/ PROJECT_IDENTIFIER/adminSdkConfig Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     name: 'projects/my-project/adminSdkConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "databaseURL": "my_databaseURL",
    *   //   "locationId": "my_locationId",
    *   //   "projectId": "my_projectId",
    *   //   "storageBucket": "my_storageBucket"
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
  def getAdminSdkConfig(params: ParamsResourceProjectsGetadminsdkconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAdminSdkConfig(
    params: ParamsResourceProjectsGetadminsdkconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAnalyticsDetails(): GaxiosPromise[SchemaAnalyticsDetails] = js.native
  def getAnalyticsDetails(callback: BodyResponseCallback[SchemaAnalyticsDetails]): Unit = js.native
  def getAnalyticsDetails(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyticsDetails] = js.native
  def getAnalyticsDetails(params: ParamsResourceProjectsGetanalyticsdetails): GaxiosPromise[SchemaAnalyticsDetails] = js.native
  def getAnalyticsDetails(
    params: ParamsResourceProjectsGetanalyticsdetails,
    callback: BodyResponseCallback[SchemaAnalyticsDetails]
  ): Unit = js.native
  def getAnalyticsDetails(
    params: ParamsResourceProjectsGetanalyticsdetails,
    options: BodyResponseCallback[Readable | SchemaAnalyticsDetails],
    callback: BodyResponseCallback[Readable | SchemaAnalyticsDetails]
  ): Unit = js.native
  def getAnalyticsDetails(params: ParamsResourceProjectsGetanalyticsdetails, options: MethodOptions): GaxiosPromise[SchemaAnalyticsDetails] = js.native
  def getAnalyticsDetails(
    params: ParamsResourceProjectsGetanalyticsdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyticsDetails]
  ): Unit = js.native
  /**
    * Gets the Google Analytics details currently associated with the specified FirebaseProject. If the `FirebaseProject` is not yet linked to Google Analytics, then the response to `GetAnalyticsDetails` is `NOT_FOUND`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.getAnalyticsDetails({
    *     // The resource name of the FirebaseProject, in the format: projects/ PROJECT_IDENTIFIER/analyticsDetails Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     name: 'projects/my-project/analyticsDetails',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "analyticsProperty": {},
    *   //   "streamMappings": []
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
  def getAnalyticsDetails(params: ParamsResourceProjectsGetanalyticsdetails, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAnalyticsDetails(
    params: ParamsResourceProjectsGetanalyticsdetails,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var iosApps: ResourceProjectsIosapps = js.native
  
  def list(): GaxiosPromise[SchemaListFirebaseProjectsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFirebaseProjectsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFirebaseProjectsResponse] = js.native
  def list(params: ParamsResourceProjectsList): GaxiosPromise[SchemaListFirebaseProjectsResponse] = js.native
  def list(
    params: ParamsResourceProjectsList,
    callback: BodyResponseCallback[SchemaListFirebaseProjectsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsList,
    options: BodyResponseCallback[Readable | SchemaListFirebaseProjectsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFirebaseProjectsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsList, options: MethodOptions): GaxiosPromise[SchemaListFirebaseProjectsResponse] = js.native
  def list(
    params: ParamsResourceProjectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFirebaseProjectsResponse]
  ): Unit = js.native
  /**
    * Lists each FirebaseProject accessible to the caller. The elements are returned in no particular order, but they will be a consistent view of the Projects when additional requests are made with a `pageToken`. This method is eventually consistent with Project mutations, which means newly provisioned Projects and recent modifications to existing Projects might not be reflected in the set of Projects. The list will include only ACTIVE Projects. Use GetFirebaseProject for consistent reads as well as for additional Project details.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.list({
    *     // The maximum number of Projects to return in the response. The server may return fewer than this at its discretion. If no value is specified (or too large a value is specified), the server will impose its own limit. This value cannot be negative.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to `ListFirebaseProjects` indicating where in the set of Projects to resume listing.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceProjectsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFirebaseProject] = js.native
  def patch(callback: BodyResponseCallback[SchemaFirebaseProject]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirebaseProject] = js.native
  def patch(params: ParamsResourceProjectsPatch): GaxiosPromise[SchemaFirebaseProject] = js.native
  def patch(params: ParamsResourceProjectsPatch, callback: BodyResponseCallback[SchemaFirebaseProject]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsPatch,
    options: BodyResponseCallback[Readable | SchemaFirebaseProject],
    callback: BodyResponseCallback[Readable | SchemaFirebaseProject]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsPatch, options: MethodOptions): GaxiosPromise[SchemaFirebaseProject] = js.native
  def patch(
    params: ParamsResourceProjectsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirebaseProject]
  ): Unit = js.native
  /**
    * Updates the attributes of the specified FirebaseProject. All [query parameters](#query-parameters) are required.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.patch({
    *     // The resource name of the Project, in the format: projects/PROJECT_IDENTIFIER PROJECT_IDENTIFIER: the Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`.
    *     name: 'projects/my-project',
    *     // Specifies which fields to update. If this list is empty, then no state will be updated. Note that the fields `name`, `projectId`, and `projectNumber` are all immutable.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotations": {},
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId",
    *       //   "projectNumber": "my_projectNumber",
    *       //   "resources": {},
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId",
    *   //   "projectNumber": "my_projectNumber",
    *   //   "resources": {},
    *   //   "state": "my_state"
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
  def patch(params: ParamsResourceProjectsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeAnalytics(): GaxiosPromise[SchemaEmpty] = js.native
  def removeAnalytics(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removeAnalytics(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeAnalytics(params: ParamsResourceProjectsRemoveanalytics): GaxiosPromise[SchemaEmpty] = js.native
  def removeAnalytics(params: ParamsResourceProjectsRemoveanalytics, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removeAnalytics(
    params: ParamsResourceProjectsRemoveanalytics,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def removeAnalytics(params: ParamsResourceProjectsRemoveanalytics, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeAnalytics(
    params: ParamsResourceProjectsRemoveanalytics,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Unlinks the specified FirebaseProject from its Google Analytics account. This call removes the association of the specified `FirebaseProject` with its current Google Analytics property. However, this call does not delete the Google Analytics resources, such as the Google Analytics property or any data streams. These resources may be re-associated later to the `FirebaseProject` by calling [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) and specifying the same `analyticsPropertyId`. For Android Apps and iOS Apps, this call re-links data streams with their corresponding apps. However, for Web Apps, this call provisions a *new* data stream for each Web App. To call `RemoveAnalytics`, a project member must be an Owner for the `FirebaseProject`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.removeAnalytics({
    *     // The resource name of the FirebaseProject to unlink from its Google Analytics account, in the format: projects/PROJECT_IDENTIFIER Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "analyticsPropertyId": "my_analyticsPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def removeAnalytics(params: ParamsResourceProjectsRemoveanalytics, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeAnalytics(
    params: ParamsResourceProjectsRemoveanalytics,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchApps(): GaxiosPromise[SchemaSearchFirebaseAppsResponse] = js.native
  def searchApps(callback: BodyResponseCallback[SchemaSearchFirebaseAppsResponse]): Unit = js.native
  def searchApps(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchFirebaseAppsResponse] = js.native
  def searchApps(params: ParamsResourceProjectsSearchapps): GaxiosPromise[SchemaSearchFirebaseAppsResponse] = js.native
  def searchApps(
    params: ParamsResourceProjectsSearchapps,
    callback: BodyResponseCallback[SchemaSearchFirebaseAppsResponse]
  ): Unit = js.native
  def searchApps(
    params: ParamsResourceProjectsSearchapps,
    options: BodyResponseCallback[Readable | SchemaSearchFirebaseAppsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchFirebaseAppsResponse]
  ): Unit = js.native
  def searchApps(params: ParamsResourceProjectsSearchapps, options: MethodOptions): GaxiosPromise[SchemaSearchFirebaseAppsResponse] = js.native
  def searchApps(
    params: ParamsResourceProjectsSearchapps,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchFirebaseAppsResponse]
  ): Unit = js.native
  /**
    * Lists all available Apps for the specified FirebaseProject. This is a convenience method. Typically, interaction with an App should be done using the platform-specific service, but some tool use-cases require a summary of all known Apps (such as for App selector interfaces).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebase.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebase = google.firebase('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebase.projects.searchApps({
    *     // A query string compatible with Google's [AIP-160](https://google.aip.dev/160) standard. Use any of the following fields in a query: * [`app_id`](../projects.apps#FirebaseAppInfo.FIELDS.app_id) * [`namespace`](../projects.apps#FirebaseAppInfo.FIELDS.namespace) * [`platform`](../projects.apps#FirebaseAppInfo.FIELDS.platform) We also support the following "virtual" fields (fields which are not actually part of the returned resource object, but can be queried as if they are pre-populated with specific values): * `sha1_hash` or `sha1_hashes`: This field is considered to be a repeated `string` field, populated with the list of all SHA-1 certificate fingerprints registered with the app. This list is empty if the app is not an Android app. * `sha256_hash` or `sha256_hashes`: This field is considered to be a repeated `string` field, populated with the list of all SHA-256 certificate fingerprints registered with the app. This list is empty if the app is not an Android app. * `app_store_id`: This field is considered to be a singular `string` field, populated with the Apple App Store ID registered with the app. This field is empty if the app is not an iOS app. * `team_id`: This field is considered to be a singular `string` field, populated with the Apple team ID registered with the app. This field is empty if the app is not an iOS app.
    *     filter: 'placeholder-value',
    *     // The maximum number of Apps to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit. This value cannot be negative.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to `SearchFirebaseApps` indicating where in the set of Apps to resume listing.
    *     pageToken: 'placeholder-value',
    *     // The parent FirebaseProject for which to list Apps, in the format: projects/ PROJECT_IDENTIFIER Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    *     parent: 'projects/my-project',
    *     // Controls whether Apps in the DELETED state should be returned. Defaults to false.
    *     showDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apps": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def searchApps(params: ParamsResourceProjectsSearchapps, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchApps(
    params: ParamsResourceProjectsSearchapps,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var webApps: ResourceProjectsWebapps = js.native
}
