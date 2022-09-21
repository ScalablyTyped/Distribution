package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recaptchaenterprise/v1", "recaptchaenterprise_v1.Resource$Projects$Relatedaccountgroups")
@js.native
open class ResourceProjectsRelatedaccountgroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse] = js.native
  def list(params: ParamsResourceProjectsRelatedaccountgroupsList): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsRelatedaccountgroupsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse]
  ): Unit = js.native
  /**
    * List groups of related accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
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
    *   const res = await recaptchaenterprise.projects.relatedaccountgroups.list({
    *     // Optional. The maximum number of groups to return. The service might return fewer than this value. If unspecified, at most 50 groups are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListRelatedAccountGroups` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListRelatedAccountGroups` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the project to list related account groups from, in the format "projects/{project\}".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "relatedAccountGroups": []
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
  def list(params: ParamsResourceProjectsRelatedaccountgroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var memberships: ResourceProjectsRelatedaccountgroupsMemberships = js.native
}
