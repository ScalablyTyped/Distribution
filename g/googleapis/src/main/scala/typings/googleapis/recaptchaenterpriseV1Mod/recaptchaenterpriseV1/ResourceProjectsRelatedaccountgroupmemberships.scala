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

@JSImport("googleapis/build/src/apis/recaptchaenterprise/v1", "recaptchaenterprise_v1.Resource$Projects$Relatedaccountgroupmemberships")
@js.native
open class ResourceProjectsRelatedaccountgroupmemberships protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[
    SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
  ] = js.native
  def search(
    callback: BodyResponseCallback[
      SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
    ]
  ): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[
    SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
  ] = js.native
  def search(params: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch): GaxiosPromise[
    SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
  ] = js.native
  def search(
    params: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch,
    callback: BodyResponseCallback[
      SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
    ]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
    ]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch, options: MethodOptions): GaxiosPromise[
    SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
  ] = js.native
  def search(
    params: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[
      SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsResponse
    ]
  ): Unit = js.native
  /**
    * Search group memberships related to a given account.
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
    *   const res =
    *     await recaptchaenterprise.projects.relatedaccountgroupmemberships.search({
    *       // Required. The name of the project to search related account group memberships from. Specify the project name in the following format: "projects/{project\}".
    *       project: 'projects/my-project',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "hashedAccountId": "my_hashedAccountId",
    *         //   "pageSize": 0,
    *         //   "pageToken": "my_pageToken"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "relatedAccountGroupMemberships": []
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
  def search(params: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
