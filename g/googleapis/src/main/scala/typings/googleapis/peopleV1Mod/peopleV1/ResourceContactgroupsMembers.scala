package typings.googleapis.peopleV1Mod.peopleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$Contactgroups$Members")
@js.native
open class ResourceContactgroupsMembers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def modify(): GaxiosPromise[SchemaModifyContactGroupMembersResponse] = js.native
  def modify(callback: BodyResponseCallback[SchemaModifyContactGroupMembersResponse]): Unit = js.native
  def modify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaModifyContactGroupMembersResponse] = js.native
  def modify(params: ParamsResourceContactgroupsMembersModify): GaxiosPromise[SchemaModifyContactGroupMembersResponse] = js.native
  def modify(
    params: ParamsResourceContactgroupsMembersModify,
    callback: BodyResponseCallback[SchemaModifyContactGroupMembersResponse]
  ): Unit = js.native
  def modify(
    params: ParamsResourceContactgroupsMembersModify,
    options: BodyResponseCallback[Readable | SchemaModifyContactGroupMembersResponse],
    callback: BodyResponseCallback[Readable | SchemaModifyContactGroupMembersResponse]
  ): Unit = js.native
  def modify(params: ParamsResourceContactgroupsMembersModify, options: MethodOptions): GaxiosPromise[SchemaModifyContactGroupMembersResponse] = js.native
  def modify(
    params: ParamsResourceContactgroupsMembersModify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModifyContactGroupMembersResponse]
  ): Unit = js.native
  /**
    * Modify the members of a contact group owned by the authenticated user. The only system contact groups that can have members added are `contactGroups/myContacts` and `contactGroups/starred`. Other system contact groups are deprecated and can only have contacts removed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.contactGroups.members.modify({
    *     // Required. The resource name of the contact group to modify.
    *     resourceName: 'contactGroups/my-contactGroup',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "resourceNamesToAdd": [],
    *       //   "resourceNamesToRemove": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "canNotRemoveLastContactGroupResourceNames": [],
    *   //   "notFoundResourceNames": []
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
  def modify(params: ParamsResourceContactgroupsMembersModify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modify(
    params: ParamsResourceContactgroupsMembersModify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
