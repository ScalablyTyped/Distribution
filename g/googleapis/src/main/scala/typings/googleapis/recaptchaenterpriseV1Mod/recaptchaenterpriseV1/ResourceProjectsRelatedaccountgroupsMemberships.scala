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

@JSImport("googleapis/build/src/apis/recaptchaenterprise/v1", "recaptchaenterprise_v1.Resource$Projects$Relatedaccountgroups$Memberships")
@js.native
open class ResourceProjectsRelatedaccountgroupsMemberships protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse] = js.native
  def list(params: ParamsResourceProjectsRelatedaccountgroupsMembershipsList): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsMembershipsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsMembershipsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsRelatedaccountgroupsMembershipsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsMembershipsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse]
  ): Unit = js.native
  /**
    * Get memberships in a group of related accounts.
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
    *     await recaptchaenterprise.projects.relatedaccountgroups.memberships.list({
    *       // Optional. The maximum number of accounts to return. The service might return fewer than this value. If unspecified, at most 50 accounts are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. A page token, received from a previous `ListRelatedAccountGroupMemberships` call. When paginating, all other parameters provided to `ListRelatedAccountGroupMemberships` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The resource name for the related account group in the format `projects/{project\}/relatedaccountgroups/{relatedaccountgroup\}`.
    *       parent: 'projects/my-project/relatedaccountgroups/my-relatedaccountgroup',
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
  def list(params: ParamsResourceProjectsRelatedaccountgroupsMembershipsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsRelatedaccountgroupsMembershipsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
