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

@JSImport("googleapis/build/src/apis/firebase/v1beta1", "firebase_v1beta1.Resource$Availableprojects")
@js.native
open class ResourceAvailableprojects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListAvailableProjectsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAvailableProjectsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAvailableProjectsResponse] = js.native
  def list(params: ParamsResourceAvailableprojectsList): GaxiosPromise[SchemaListAvailableProjectsResponse] = js.native
  def list(
    params: ParamsResourceAvailableprojectsList,
    callback: BodyResponseCallback[SchemaListAvailableProjectsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAvailableprojectsList,
    options: BodyResponseCallback[Readable | SchemaListAvailableProjectsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAvailableProjectsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAvailableprojectsList, options: MethodOptions): GaxiosPromise[SchemaListAvailableProjectsResponse] = js.native
  def list(
    params: ParamsResourceAvailableprojectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAvailableProjectsResponse]
  ): Unit = js.native
  /**
    * Lists each [Google Cloud Platform (GCP) `Project`] (https://cloud.google.com/resource-manager/reference/rest/v1/projects) that can have Firebase resources added to it. A Project will only be listed if: - The caller has sufficient [Google IAM](https://cloud.google.com/iam) permissions to call AddFirebase. - The Project is not already a FirebaseProject. - The Project is not in an Organization which has policies that prevent Firebase resources from being added.
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
    *   const res = await firebase.availableProjects.list({
    *     // The maximum number of Projects to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), the server will impose its own limit. This value cannot be negative.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to `ListAvailableProjects` indicating where in the set of Projects to resume listing.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "projectInfo": []
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
  def list(params: ParamsResourceAvailableprojectsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAvailableprojectsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
