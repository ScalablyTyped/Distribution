package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Folders$Sources$Findings$Externalsystems")
@js.native
open class ResourceFoldersSourcesFindingsExternalsystems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1ExternalSystem] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1ExternalSystem]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1ExternalSystem] = js.native
  def patch(params: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1ExternalSystem] = js.native
  def patch(
    params: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1ExternalSystem]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1ExternalSystem],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1ExternalSystem]
  ): Unit = js.native
  def patch(params: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1ExternalSystem] = js.native
  def patch(
    params: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1ExternalSystem]
  ): Unit = js.native
  /**
    * Updates external system. This is for a given finding.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1');
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
    *     await securitycenter.folders.sources.findings.externalSystems.patch({
    *       // External System Name e.g. jira, demisto, etc. e.g.: `organizations/1234/sources/5678/findings/123456/externalSystems/jira` `folders/1234/sources/5678/findings/123456/externalSystems/jira` `projects/1234/sources/5678/findings/123456/externalSystems/jira`
    *       name: 'folders/my-folder/sources/my-source/findings/my-finding/externalSystems/my-externalSystem',
    *       // The FieldMask to use when updating the external system resource. If empty all mutable fields will be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "assignees": [],
    *         //   "externalSystemUpdateTime": "my_externalSystemUpdateTime",
    *         //   "externalUid": "my_externalUid",
    *         //   "name": "my_name",
    *         //   "status": "my_status"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignees": [],
    *   //   "externalSystemUpdateTime": "my_externalSystemUpdateTime",
    *   //   "externalUid": "my_externalUid",
    *   //   "name": "my_name",
    *   //   "status": "my_status"
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
  def patch(params: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
