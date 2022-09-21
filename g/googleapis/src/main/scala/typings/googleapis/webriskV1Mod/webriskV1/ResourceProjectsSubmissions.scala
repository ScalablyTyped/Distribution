package typings.googleapis.webriskV1Mod.webriskV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webrisk/v1", "webrisk_v1.Resource$Projects$Submissions")
@js.native
open class ResourceProjectsSubmissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudWebriskV1Submission] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1Submission]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1Submission] = js.native
  def create(params: ParamsResourceProjectsSubmissionsCreate): GaxiosPromise[SchemaGoogleCloudWebriskV1Submission] = js.native
  def create(
    params: ParamsResourceProjectsSubmissionsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1Submission]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsSubmissionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1Submission],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1Submission]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsSubmissionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1Submission] = js.native
  def create(
    params: ParamsResourceProjectsSubmissionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1Submission]
  ): Unit = js.native
  /**
    * Creates a Submission of a URI suspected of containing phishing content to be reviewed. If the result verifies the existence of malicious phishing content, the site will be added to the [Google's Social Engineering lists](https://support.google.com/webmasters/answer/6350487/) in order to protect users that could get exposed to this threat in the future. Only allowlisted projects can use this method during Early Access. Please reach out to Sales or your customer engineer to obtain access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/webrisk.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const webrisk = google.webrisk('v1');
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
    *   const res = await webrisk.projects.submissions.create({
    *     // Required. The name of the project that is making the submission. This string is in the format "projects/{project_number\}".
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "threatTypes": [],
    *       //   "uri": "my_uri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "threatTypes": [],
    *   //   "uri": "my_uri"
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
  def create(params: ParamsResourceProjectsSubmissionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsSubmissionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
