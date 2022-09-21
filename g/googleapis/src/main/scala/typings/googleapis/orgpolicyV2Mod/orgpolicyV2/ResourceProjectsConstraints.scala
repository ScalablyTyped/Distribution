package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/orgpolicy/v2", "orgpolicy_v2.Resource$Projects$Constraints")
@js.native
open class ResourceProjectsConstraints protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse] = js.native
  def list(params: ParamsResourceProjectsConstraintsList): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConstraintsList,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConstraintsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConstraintsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConstraintsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse]
  ): Unit = js.native
  /**
    * Lists `Constraints` that could be applied on the specified resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/orgpolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const orgpolicy = google.orgpolicy('v2');
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
    *   const res = await orgpolicy.projects.constraints.list({
    *     // Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size.
    *     pageSize: 'placeholder-value',
    *     // Page token used to retrieve the next page. This is currently unsupported and will be ignored. The server may at any point start using this field.
    *     pageToken: 'placeholder-value',
    *     // Required. The Cloud resource that parents the constraint. Must be in one of the following forms: * `projects/{project_number\}` * `projects/{project_id\}` * `folders/{folder_id\}` * `organizations/{organization_id\}`
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "constraints": [],
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
  def list(params: ParamsResourceProjectsConstraintsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsConstraintsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
