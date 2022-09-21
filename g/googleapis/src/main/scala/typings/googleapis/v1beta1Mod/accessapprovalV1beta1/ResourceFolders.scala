package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accessapproval/v1beta1", "accessapproval_v1beta1.Resource$Folders")
@js.native
open class ResourceFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var approvalRequests: ResourceFoldersApprovalrequests = js.native
  
  var context: APIRequestContext = js.native
  
  def deleteAccessApprovalSettings(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteAccessApprovalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(params: ParamsResourceFoldersDeleteaccessapprovalsettings): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceFoldersDeleteaccessapprovalsettings,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceFoldersDeleteaccessapprovalsettings,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def deleteAccessApprovalSettings(params: ParamsResourceFoldersDeleteaccessapprovalsettings, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceFoldersDeleteaccessapprovalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * accessapproval.folders.deleteAccessApprovalSettings
    * @desc Deletes the settings associated with a project, folder, or organization. This will have the effect of disabling Access Approval for the project, folder, or organization, but only if all ancestors also have Access Approval disabled. If Access Approval is enabled at a higher level of the hierarchy, then Access Approval will still be enabled at this level as the settings are inherited.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1beta1');
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
    *   const res = await accessapproval.folders.deleteAccessApprovalSettings({
    *     // Name of the AccessApprovalSettings to delete.
    *     name: 'folders/my-folder/accessApprovalSettings',
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
    * @alias accessapproval.folders.deleteAccessApprovalSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the AccessApprovalSettings to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteAccessApprovalSettings(params: ParamsResourceFoldersDeleteaccessapprovalsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteAccessApprovalSettings(
    params: ParamsResourceFoldersDeleteaccessapprovalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAccessApprovalSettings(): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(callback: BodyResponseCallback[SchemaAccessApprovalSettings]): Unit = js.native
  def getAccessApprovalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(params: ParamsResourceFoldersGetaccessapprovalsettings): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceFoldersGetaccessapprovalsettings,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceFoldersGetaccessapprovalsettings,
    options: BodyResponseCallback[Readable | SchemaAccessApprovalSettings],
    callback: BodyResponseCallback[Readable | SchemaAccessApprovalSettings]
  ): Unit = js.native
  def getAccessApprovalSettings(params: ParamsResourceFoldersGetaccessapprovalsettings, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceFoldersGetaccessapprovalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  /**
    * accessapproval.folders.getAccessApprovalSettings
    * @desc Gets the settings associated with a project, folder, or organization.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1beta1');
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
    *   const res = await accessapproval.folders.getAccessApprovalSettings({
    *     // Name of the AccessApprovalSettings to retrieve.
    *     name: 'folders/my-folder/accessApprovalSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enrolledAncestor": false,
    *   //   "enrolledServices": [],
    *   //   "name": "my_name",
    *   //   "notificationEmails": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias accessapproval.folders.getAccessApprovalSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the AccessApprovalSettings to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAccessApprovalSettings(params: ParamsResourceFoldersGetaccessapprovalsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAccessApprovalSettings(
    params: ParamsResourceFoldersGetaccessapprovalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateAccessApprovalSettings(): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(callback: BodyResponseCallback[SchemaAccessApprovalSettings]): Unit = js.native
  def updateAccessApprovalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(params: ParamsResourceFoldersUpdateaccessapprovalsettings): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceFoldersUpdateaccessapprovalsettings,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceFoldersUpdateaccessapprovalsettings,
    options: BodyResponseCallback[Readable | SchemaAccessApprovalSettings],
    callback: BodyResponseCallback[Readable | SchemaAccessApprovalSettings]
  ): Unit = js.native
  def updateAccessApprovalSettings(params: ParamsResourceFoldersUpdateaccessapprovalsettings, options: MethodOptions): GaxiosPromise[SchemaAccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceFoldersUpdateaccessapprovalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccessApprovalSettings]
  ): Unit = js.native
  /**
    * accessapproval.folders.updateAccessApprovalSettings
    * @desc Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1beta1');
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
    *   const res = await accessapproval.folders.updateAccessApprovalSettings({
    *     // The resource name of the settings. Format is one of:
    *     // <ol>
    *     //   <li>"projects/{project_id}/accessApprovalSettings"</li>
    *     //   <li>"folders/{folder_id}/accessApprovalSettings"</li>
    *     //   <li>"organizations/{organization_id}/accessApprovalSettings"</li>
    *     // <ol>
    *     name: 'folders/my-folder/accessApprovalSettings',
    *     // For the `FieldMask` definition, see
    *     // https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     // If this field is left unset, only the notification_emails field will be
    *     // updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "enrolledAncestor": false,
    *       //   "enrolledServices": [],
    *       //   "name": "my_name",
    *       //   "notificationEmails": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enrolledAncestor": false,
    *   //   "enrolledServices": [],
    *   //   "name": "my_name",
    *   //   "notificationEmails": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias accessapproval.folders.updateAccessApprovalSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the settings. Format is one of: <ol>   <li>"projects/{project_id}/accessApprovalSettings"</li>   <li>"folders/{folder_id}/accessApprovalSettings"</li>   <li>"organizations/{organization_id}/accessApprovalSettings"</li> <ol>
    * @param {string=} params.updateMask For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If this field is left unset, only the notification_emails field will be updated.
    * @param {().AccessApprovalSettings} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateAccessApprovalSettings(params: ParamsResourceFoldersUpdateaccessapprovalsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateAccessApprovalSettings(
    params: ParamsResourceFoldersUpdateaccessapprovalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
