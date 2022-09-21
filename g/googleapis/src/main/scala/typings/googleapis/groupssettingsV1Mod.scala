package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupssettingsV1Mod {
  
  object groupssettingsV1 {
    
    @JSImport("googleapis/build/src/apis/groupssettings/v1", "groupssettings_v1.Groupssettings")
    @js.native
    open class Groupssettings protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var groups: ResourceGroups = js.native
    }
    
    @JSImport("googleapis/build/src/apis/groupssettings/v1", "groupssettings_v1.Resource$Groups")
    @js.native
    open class ResourceGroups protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaGroups] = js.native
      def get(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def get(params: ParamsResourceGroupsGet): GaxiosPromise[SchemaGroups] = js.native
      def get(params: ParamsResourceGroupsGet, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def get(
        params: ParamsResourceGroupsGet,
        options: BodyResponseCallback[Readable | SchemaGroups],
        callback: BodyResponseCallback[Readable | SchemaGroups]
      ): Unit = js.native
      def get(params: ParamsResourceGroupsGet, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def get(
        params: ParamsResourceGroupsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      /**
        * Gets one resource by id.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/groupssettings.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const groupssettings = google.groupssettings('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.groups.settings'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await groupsSettings.groups.get({
        *     // The group's email address.
        *     groupUniqueId: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "allowExternalMembers": "my_allowExternalMembers",
        *   //   "allowGoogleCommunication": "my_allowGoogleCommunication",
        *   //   "allowWebPosting": "my_allowWebPosting",
        *   //   "archiveOnly": "my_archiveOnly",
        *   //   "customFooterText": "my_customFooterText",
        *   //   "customReplyTo": "my_customReplyTo",
        *   //   "customRolesEnabledForSettingsToBeMerged": "my_customRolesEnabledForSettingsToBeMerged",
        *   //   "defaultMessageDenyNotificationText": "my_defaultMessageDenyNotificationText",
        *   //   "default_sender": "my_default_sender",
        *   //   "description": "my_description",
        *   //   "email": "my_email",
        *   //   "enableCollaborativeInbox": "my_enableCollaborativeInbox",
        *   //   "favoriteRepliesOnTop": "my_favoriteRepliesOnTop",
        *   //   "includeCustomFooter": "my_includeCustomFooter",
        *   //   "includeInGlobalAddressList": "my_includeInGlobalAddressList",
        *   //   "isArchived": "my_isArchived",
        *   //   "kind": "my_kind",
        *   //   "maxMessageBytes": 0,
        *   //   "membersCanPostAsTheGroup": "my_membersCanPostAsTheGroup",
        *   //   "messageDisplayFont": "my_messageDisplayFont",
        *   //   "messageModerationLevel": "my_messageModerationLevel",
        *   //   "name": "my_name",
        *   //   "primaryLanguage": "my_primaryLanguage",
        *   //   "replyTo": "my_replyTo",
        *   //   "sendMessageDenyNotification": "my_sendMessageDenyNotification",
        *   //   "showInGroupDirectory": "my_showInGroupDirectory",
        *   //   "spamModerationLevel": "my_spamModerationLevel",
        *   //   "whoCanAdd": "my_whoCanAdd",
        *   //   "whoCanAddReferences": "my_whoCanAddReferences",
        *   //   "whoCanApproveMembers": "my_whoCanApproveMembers",
        *   //   "whoCanApproveMessages": "my_whoCanApproveMessages",
        *   //   "whoCanAssignTopics": "my_whoCanAssignTopics",
        *   //   "whoCanAssistContent": "my_whoCanAssistContent",
        *   //   "whoCanBanUsers": "my_whoCanBanUsers",
        *   //   "whoCanContactOwner": "my_whoCanContactOwner",
        *   //   "whoCanDeleteAnyPost": "my_whoCanDeleteAnyPost",
        *   //   "whoCanDeleteTopics": "my_whoCanDeleteTopics",
        *   //   "whoCanDiscoverGroup": "my_whoCanDiscoverGroup",
        *   //   "whoCanEnterFreeFormTags": "my_whoCanEnterFreeFormTags",
        *   //   "whoCanHideAbuse": "my_whoCanHideAbuse",
        *   //   "whoCanInvite": "my_whoCanInvite",
        *   //   "whoCanJoin": "my_whoCanJoin",
        *   //   "whoCanLeaveGroup": "my_whoCanLeaveGroup",
        *   //   "whoCanLockTopics": "my_whoCanLockTopics",
        *   //   "whoCanMakeTopicsSticky": "my_whoCanMakeTopicsSticky",
        *   //   "whoCanMarkDuplicate": "my_whoCanMarkDuplicate",
        *   //   "whoCanMarkFavoriteReplyOnAnyTopic": "my_whoCanMarkFavoriteReplyOnAnyTopic",
        *   //   "whoCanMarkFavoriteReplyOnOwnTopic": "my_whoCanMarkFavoriteReplyOnOwnTopic",
        *   //   "whoCanMarkNoResponseNeeded": "my_whoCanMarkNoResponseNeeded",
        *   //   "whoCanModerateContent": "my_whoCanModerateContent",
        *   //   "whoCanModerateMembers": "my_whoCanModerateMembers",
        *   //   "whoCanModifyMembers": "my_whoCanModifyMembers",
        *   //   "whoCanModifyTagsAndCategories": "my_whoCanModifyTagsAndCategories",
        *   //   "whoCanMoveTopicsIn": "my_whoCanMoveTopicsIn",
        *   //   "whoCanMoveTopicsOut": "my_whoCanMoveTopicsOut",
        *   //   "whoCanPostAnnouncements": "my_whoCanPostAnnouncements",
        *   //   "whoCanPostMessage": "my_whoCanPostMessage",
        *   //   "whoCanTakeTopics": "my_whoCanTakeTopics",
        *   //   "whoCanUnassignTopic": "my_whoCanUnassignTopic",
        *   //   "whoCanUnmarkFavoriteReplyOnAnyTopic": "my_whoCanUnmarkFavoriteReplyOnAnyTopic",
        *   //   "whoCanViewGroup": "my_whoCanViewGroup",
        *   //   "whoCanViewMembership": "my_whoCanViewMembership"
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
      def get(params: ParamsResourceGroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceGroupsGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def patch(): GaxiosPromise[SchemaGroups] = js.native
      def patch(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def patch(params: ParamsResourceGroupsPatch): GaxiosPromise[SchemaGroups] = js.native
      def patch(params: ParamsResourceGroupsPatch, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def patch(
        params: ParamsResourceGroupsPatch,
        options: BodyResponseCallback[Readable | SchemaGroups],
        callback: BodyResponseCallback[Readable | SchemaGroups]
      ): Unit = js.native
      def patch(params: ParamsResourceGroupsPatch, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def patch(
        params: ParamsResourceGroupsPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      /**
        * Updates an existing resource. This method supports patch semantics.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/groupssettings.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const groupssettings = google.groupssettings('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.groups.settings'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await groupsSettings.groups.patch({
        *     // The group's email address.
        *     groupUniqueId: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "allowExternalMembers": "my_allowExternalMembers",
        *       //   "allowGoogleCommunication": "my_allowGoogleCommunication",
        *       //   "allowWebPosting": "my_allowWebPosting",
        *       //   "archiveOnly": "my_archiveOnly",
        *       //   "customFooterText": "my_customFooterText",
        *       //   "customReplyTo": "my_customReplyTo",
        *       //   "customRolesEnabledForSettingsToBeMerged": "my_customRolesEnabledForSettingsToBeMerged",
        *       //   "defaultMessageDenyNotificationText": "my_defaultMessageDenyNotificationText",
        *       //   "default_sender": "my_default_sender",
        *       //   "description": "my_description",
        *       //   "email": "my_email",
        *       //   "enableCollaborativeInbox": "my_enableCollaborativeInbox",
        *       //   "favoriteRepliesOnTop": "my_favoriteRepliesOnTop",
        *       //   "includeCustomFooter": "my_includeCustomFooter",
        *       //   "includeInGlobalAddressList": "my_includeInGlobalAddressList",
        *       //   "isArchived": "my_isArchived",
        *       //   "kind": "my_kind",
        *       //   "maxMessageBytes": 0,
        *       //   "membersCanPostAsTheGroup": "my_membersCanPostAsTheGroup",
        *       //   "messageDisplayFont": "my_messageDisplayFont",
        *       //   "messageModerationLevel": "my_messageModerationLevel",
        *       //   "name": "my_name",
        *       //   "primaryLanguage": "my_primaryLanguage",
        *       //   "replyTo": "my_replyTo",
        *       //   "sendMessageDenyNotification": "my_sendMessageDenyNotification",
        *       //   "showInGroupDirectory": "my_showInGroupDirectory",
        *       //   "spamModerationLevel": "my_spamModerationLevel",
        *       //   "whoCanAdd": "my_whoCanAdd",
        *       //   "whoCanAddReferences": "my_whoCanAddReferences",
        *       //   "whoCanApproveMembers": "my_whoCanApproveMembers",
        *       //   "whoCanApproveMessages": "my_whoCanApproveMessages",
        *       //   "whoCanAssignTopics": "my_whoCanAssignTopics",
        *       //   "whoCanAssistContent": "my_whoCanAssistContent",
        *       //   "whoCanBanUsers": "my_whoCanBanUsers",
        *       //   "whoCanContactOwner": "my_whoCanContactOwner",
        *       //   "whoCanDeleteAnyPost": "my_whoCanDeleteAnyPost",
        *       //   "whoCanDeleteTopics": "my_whoCanDeleteTopics",
        *       //   "whoCanDiscoverGroup": "my_whoCanDiscoverGroup",
        *       //   "whoCanEnterFreeFormTags": "my_whoCanEnterFreeFormTags",
        *       //   "whoCanHideAbuse": "my_whoCanHideAbuse",
        *       //   "whoCanInvite": "my_whoCanInvite",
        *       //   "whoCanJoin": "my_whoCanJoin",
        *       //   "whoCanLeaveGroup": "my_whoCanLeaveGroup",
        *       //   "whoCanLockTopics": "my_whoCanLockTopics",
        *       //   "whoCanMakeTopicsSticky": "my_whoCanMakeTopicsSticky",
        *       //   "whoCanMarkDuplicate": "my_whoCanMarkDuplicate",
        *       //   "whoCanMarkFavoriteReplyOnAnyTopic": "my_whoCanMarkFavoriteReplyOnAnyTopic",
        *       //   "whoCanMarkFavoriteReplyOnOwnTopic": "my_whoCanMarkFavoriteReplyOnOwnTopic",
        *       //   "whoCanMarkNoResponseNeeded": "my_whoCanMarkNoResponseNeeded",
        *       //   "whoCanModerateContent": "my_whoCanModerateContent",
        *       //   "whoCanModerateMembers": "my_whoCanModerateMembers",
        *       //   "whoCanModifyMembers": "my_whoCanModifyMembers",
        *       //   "whoCanModifyTagsAndCategories": "my_whoCanModifyTagsAndCategories",
        *       //   "whoCanMoveTopicsIn": "my_whoCanMoveTopicsIn",
        *       //   "whoCanMoveTopicsOut": "my_whoCanMoveTopicsOut",
        *       //   "whoCanPostAnnouncements": "my_whoCanPostAnnouncements",
        *       //   "whoCanPostMessage": "my_whoCanPostMessage",
        *       //   "whoCanTakeTopics": "my_whoCanTakeTopics",
        *       //   "whoCanUnassignTopic": "my_whoCanUnassignTopic",
        *       //   "whoCanUnmarkFavoriteReplyOnAnyTopic": "my_whoCanUnmarkFavoriteReplyOnAnyTopic",
        *       //   "whoCanViewGroup": "my_whoCanViewGroup",
        *       //   "whoCanViewMembership": "my_whoCanViewMembership"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "allowExternalMembers": "my_allowExternalMembers",
        *   //   "allowGoogleCommunication": "my_allowGoogleCommunication",
        *   //   "allowWebPosting": "my_allowWebPosting",
        *   //   "archiveOnly": "my_archiveOnly",
        *   //   "customFooterText": "my_customFooterText",
        *   //   "customReplyTo": "my_customReplyTo",
        *   //   "customRolesEnabledForSettingsToBeMerged": "my_customRolesEnabledForSettingsToBeMerged",
        *   //   "defaultMessageDenyNotificationText": "my_defaultMessageDenyNotificationText",
        *   //   "default_sender": "my_default_sender",
        *   //   "description": "my_description",
        *   //   "email": "my_email",
        *   //   "enableCollaborativeInbox": "my_enableCollaborativeInbox",
        *   //   "favoriteRepliesOnTop": "my_favoriteRepliesOnTop",
        *   //   "includeCustomFooter": "my_includeCustomFooter",
        *   //   "includeInGlobalAddressList": "my_includeInGlobalAddressList",
        *   //   "isArchived": "my_isArchived",
        *   //   "kind": "my_kind",
        *   //   "maxMessageBytes": 0,
        *   //   "membersCanPostAsTheGroup": "my_membersCanPostAsTheGroup",
        *   //   "messageDisplayFont": "my_messageDisplayFont",
        *   //   "messageModerationLevel": "my_messageModerationLevel",
        *   //   "name": "my_name",
        *   //   "primaryLanguage": "my_primaryLanguage",
        *   //   "replyTo": "my_replyTo",
        *   //   "sendMessageDenyNotification": "my_sendMessageDenyNotification",
        *   //   "showInGroupDirectory": "my_showInGroupDirectory",
        *   //   "spamModerationLevel": "my_spamModerationLevel",
        *   //   "whoCanAdd": "my_whoCanAdd",
        *   //   "whoCanAddReferences": "my_whoCanAddReferences",
        *   //   "whoCanApproveMembers": "my_whoCanApproveMembers",
        *   //   "whoCanApproveMessages": "my_whoCanApproveMessages",
        *   //   "whoCanAssignTopics": "my_whoCanAssignTopics",
        *   //   "whoCanAssistContent": "my_whoCanAssistContent",
        *   //   "whoCanBanUsers": "my_whoCanBanUsers",
        *   //   "whoCanContactOwner": "my_whoCanContactOwner",
        *   //   "whoCanDeleteAnyPost": "my_whoCanDeleteAnyPost",
        *   //   "whoCanDeleteTopics": "my_whoCanDeleteTopics",
        *   //   "whoCanDiscoverGroup": "my_whoCanDiscoverGroup",
        *   //   "whoCanEnterFreeFormTags": "my_whoCanEnterFreeFormTags",
        *   //   "whoCanHideAbuse": "my_whoCanHideAbuse",
        *   //   "whoCanInvite": "my_whoCanInvite",
        *   //   "whoCanJoin": "my_whoCanJoin",
        *   //   "whoCanLeaveGroup": "my_whoCanLeaveGroup",
        *   //   "whoCanLockTopics": "my_whoCanLockTopics",
        *   //   "whoCanMakeTopicsSticky": "my_whoCanMakeTopicsSticky",
        *   //   "whoCanMarkDuplicate": "my_whoCanMarkDuplicate",
        *   //   "whoCanMarkFavoriteReplyOnAnyTopic": "my_whoCanMarkFavoriteReplyOnAnyTopic",
        *   //   "whoCanMarkFavoriteReplyOnOwnTopic": "my_whoCanMarkFavoriteReplyOnOwnTopic",
        *   //   "whoCanMarkNoResponseNeeded": "my_whoCanMarkNoResponseNeeded",
        *   //   "whoCanModerateContent": "my_whoCanModerateContent",
        *   //   "whoCanModerateMembers": "my_whoCanModerateMembers",
        *   //   "whoCanModifyMembers": "my_whoCanModifyMembers",
        *   //   "whoCanModifyTagsAndCategories": "my_whoCanModifyTagsAndCategories",
        *   //   "whoCanMoveTopicsIn": "my_whoCanMoveTopicsIn",
        *   //   "whoCanMoveTopicsOut": "my_whoCanMoveTopicsOut",
        *   //   "whoCanPostAnnouncements": "my_whoCanPostAnnouncements",
        *   //   "whoCanPostMessage": "my_whoCanPostMessage",
        *   //   "whoCanTakeTopics": "my_whoCanTakeTopics",
        *   //   "whoCanUnassignTopic": "my_whoCanUnassignTopic",
        *   //   "whoCanUnmarkFavoriteReplyOnAnyTopic": "my_whoCanUnmarkFavoriteReplyOnAnyTopic",
        *   //   "whoCanViewGroup": "my_whoCanViewGroup",
        *   //   "whoCanViewMembership": "my_whoCanViewMembership"
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
      def patch(params: ParamsResourceGroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def patch(
        params: ParamsResourceGroupsPatch,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def update(): GaxiosPromise[SchemaGroups] = js.native
      def update(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def update(params: ParamsResourceGroupsUpdate): GaxiosPromise[SchemaGroups] = js.native
      def update(params: ParamsResourceGroupsUpdate, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def update(
        params: ParamsResourceGroupsUpdate,
        options: BodyResponseCallback[Readable | SchemaGroups],
        callback: BodyResponseCallback[Readable | SchemaGroups]
      ): Unit = js.native
      def update(params: ParamsResourceGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def update(
        params: ParamsResourceGroupsUpdate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      /**
        * Updates an existing resource.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/groupssettings.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const groupssettings = google.groupssettings('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/apps.groups.settings'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await groupsSettings.groups.update({
        *     // The group's email address.
        *     groupUniqueId: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "allowExternalMembers": "my_allowExternalMembers",
        *       //   "allowGoogleCommunication": "my_allowGoogleCommunication",
        *       //   "allowWebPosting": "my_allowWebPosting",
        *       //   "archiveOnly": "my_archiveOnly",
        *       //   "customFooterText": "my_customFooterText",
        *       //   "customReplyTo": "my_customReplyTo",
        *       //   "customRolesEnabledForSettingsToBeMerged": "my_customRolesEnabledForSettingsToBeMerged",
        *       //   "defaultMessageDenyNotificationText": "my_defaultMessageDenyNotificationText",
        *       //   "default_sender": "my_default_sender",
        *       //   "description": "my_description",
        *       //   "email": "my_email",
        *       //   "enableCollaborativeInbox": "my_enableCollaborativeInbox",
        *       //   "favoriteRepliesOnTop": "my_favoriteRepliesOnTop",
        *       //   "includeCustomFooter": "my_includeCustomFooter",
        *       //   "includeInGlobalAddressList": "my_includeInGlobalAddressList",
        *       //   "isArchived": "my_isArchived",
        *       //   "kind": "my_kind",
        *       //   "maxMessageBytes": 0,
        *       //   "membersCanPostAsTheGroup": "my_membersCanPostAsTheGroup",
        *       //   "messageDisplayFont": "my_messageDisplayFont",
        *       //   "messageModerationLevel": "my_messageModerationLevel",
        *       //   "name": "my_name",
        *       //   "primaryLanguage": "my_primaryLanguage",
        *       //   "replyTo": "my_replyTo",
        *       //   "sendMessageDenyNotification": "my_sendMessageDenyNotification",
        *       //   "showInGroupDirectory": "my_showInGroupDirectory",
        *       //   "spamModerationLevel": "my_spamModerationLevel",
        *       //   "whoCanAdd": "my_whoCanAdd",
        *       //   "whoCanAddReferences": "my_whoCanAddReferences",
        *       //   "whoCanApproveMembers": "my_whoCanApproveMembers",
        *       //   "whoCanApproveMessages": "my_whoCanApproveMessages",
        *       //   "whoCanAssignTopics": "my_whoCanAssignTopics",
        *       //   "whoCanAssistContent": "my_whoCanAssistContent",
        *       //   "whoCanBanUsers": "my_whoCanBanUsers",
        *       //   "whoCanContactOwner": "my_whoCanContactOwner",
        *       //   "whoCanDeleteAnyPost": "my_whoCanDeleteAnyPost",
        *       //   "whoCanDeleteTopics": "my_whoCanDeleteTopics",
        *       //   "whoCanDiscoverGroup": "my_whoCanDiscoverGroup",
        *       //   "whoCanEnterFreeFormTags": "my_whoCanEnterFreeFormTags",
        *       //   "whoCanHideAbuse": "my_whoCanHideAbuse",
        *       //   "whoCanInvite": "my_whoCanInvite",
        *       //   "whoCanJoin": "my_whoCanJoin",
        *       //   "whoCanLeaveGroup": "my_whoCanLeaveGroup",
        *       //   "whoCanLockTopics": "my_whoCanLockTopics",
        *       //   "whoCanMakeTopicsSticky": "my_whoCanMakeTopicsSticky",
        *       //   "whoCanMarkDuplicate": "my_whoCanMarkDuplicate",
        *       //   "whoCanMarkFavoriteReplyOnAnyTopic": "my_whoCanMarkFavoriteReplyOnAnyTopic",
        *       //   "whoCanMarkFavoriteReplyOnOwnTopic": "my_whoCanMarkFavoriteReplyOnOwnTopic",
        *       //   "whoCanMarkNoResponseNeeded": "my_whoCanMarkNoResponseNeeded",
        *       //   "whoCanModerateContent": "my_whoCanModerateContent",
        *       //   "whoCanModerateMembers": "my_whoCanModerateMembers",
        *       //   "whoCanModifyMembers": "my_whoCanModifyMembers",
        *       //   "whoCanModifyTagsAndCategories": "my_whoCanModifyTagsAndCategories",
        *       //   "whoCanMoveTopicsIn": "my_whoCanMoveTopicsIn",
        *       //   "whoCanMoveTopicsOut": "my_whoCanMoveTopicsOut",
        *       //   "whoCanPostAnnouncements": "my_whoCanPostAnnouncements",
        *       //   "whoCanPostMessage": "my_whoCanPostMessage",
        *       //   "whoCanTakeTopics": "my_whoCanTakeTopics",
        *       //   "whoCanUnassignTopic": "my_whoCanUnassignTopic",
        *       //   "whoCanUnmarkFavoriteReplyOnAnyTopic": "my_whoCanUnmarkFavoriteReplyOnAnyTopic",
        *       //   "whoCanViewGroup": "my_whoCanViewGroup",
        *       //   "whoCanViewMembership": "my_whoCanViewMembership"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "allowExternalMembers": "my_allowExternalMembers",
        *   //   "allowGoogleCommunication": "my_allowGoogleCommunication",
        *   //   "allowWebPosting": "my_allowWebPosting",
        *   //   "archiveOnly": "my_archiveOnly",
        *   //   "customFooterText": "my_customFooterText",
        *   //   "customReplyTo": "my_customReplyTo",
        *   //   "customRolesEnabledForSettingsToBeMerged": "my_customRolesEnabledForSettingsToBeMerged",
        *   //   "defaultMessageDenyNotificationText": "my_defaultMessageDenyNotificationText",
        *   //   "default_sender": "my_default_sender",
        *   //   "description": "my_description",
        *   //   "email": "my_email",
        *   //   "enableCollaborativeInbox": "my_enableCollaborativeInbox",
        *   //   "favoriteRepliesOnTop": "my_favoriteRepliesOnTop",
        *   //   "includeCustomFooter": "my_includeCustomFooter",
        *   //   "includeInGlobalAddressList": "my_includeInGlobalAddressList",
        *   //   "isArchived": "my_isArchived",
        *   //   "kind": "my_kind",
        *   //   "maxMessageBytes": 0,
        *   //   "membersCanPostAsTheGroup": "my_membersCanPostAsTheGroup",
        *   //   "messageDisplayFont": "my_messageDisplayFont",
        *   //   "messageModerationLevel": "my_messageModerationLevel",
        *   //   "name": "my_name",
        *   //   "primaryLanguage": "my_primaryLanguage",
        *   //   "replyTo": "my_replyTo",
        *   //   "sendMessageDenyNotification": "my_sendMessageDenyNotification",
        *   //   "showInGroupDirectory": "my_showInGroupDirectory",
        *   //   "spamModerationLevel": "my_spamModerationLevel",
        *   //   "whoCanAdd": "my_whoCanAdd",
        *   //   "whoCanAddReferences": "my_whoCanAddReferences",
        *   //   "whoCanApproveMembers": "my_whoCanApproveMembers",
        *   //   "whoCanApproveMessages": "my_whoCanApproveMessages",
        *   //   "whoCanAssignTopics": "my_whoCanAssignTopics",
        *   //   "whoCanAssistContent": "my_whoCanAssistContent",
        *   //   "whoCanBanUsers": "my_whoCanBanUsers",
        *   //   "whoCanContactOwner": "my_whoCanContactOwner",
        *   //   "whoCanDeleteAnyPost": "my_whoCanDeleteAnyPost",
        *   //   "whoCanDeleteTopics": "my_whoCanDeleteTopics",
        *   //   "whoCanDiscoverGroup": "my_whoCanDiscoverGroup",
        *   //   "whoCanEnterFreeFormTags": "my_whoCanEnterFreeFormTags",
        *   //   "whoCanHideAbuse": "my_whoCanHideAbuse",
        *   //   "whoCanInvite": "my_whoCanInvite",
        *   //   "whoCanJoin": "my_whoCanJoin",
        *   //   "whoCanLeaveGroup": "my_whoCanLeaveGroup",
        *   //   "whoCanLockTopics": "my_whoCanLockTopics",
        *   //   "whoCanMakeTopicsSticky": "my_whoCanMakeTopicsSticky",
        *   //   "whoCanMarkDuplicate": "my_whoCanMarkDuplicate",
        *   //   "whoCanMarkFavoriteReplyOnAnyTopic": "my_whoCanMarkFavoriteReplyOnAnyTopic",
        *   //   "whoCanMarkFavoriteReplyOnOwnTopic": "my_whoCanMarkFavoriteReplyOnOwnTopic",
        *   //   "whoCanMarkNoResponseNeeded": "my_whoCanMarkNoResponseNeeded",
        *   //   "whoCanModerateContent": "my_whoCanModerateContent",
        *   //   "whoCanModerateMembers": "my_whoCanModerateMembers",
        *   //   "whoCanModifyMembers": "my_whoCanModifyMembers",
        *   //   "whoCanModifyTagsAndCategories": "my_whoCanModifyTagsAndCategories",
        *   //   "whoCanMoveTopicsIn": "my_whoCanMoveTopicsIn",
        *   //   "whoCanMoveTopicsOut": "my_whoCanMoveTopicsOut",
        *   //   "whoCanPostAnnouncements": "my_whoCanPostAnnouncements",
        *   //   "whoCanPostMessage": "my_whoCanPostMessage",
        *   //   "whoCanTakeTopics": "my_whoCanTakeTopics",
        *   //   "whoCanUnassignTopic": "my_whoCanUnassignTopic",
        *   //   "whoCanUnmarkFavoriteReplyOnAnyTopic": "my_whoCanUnmarkFavoriteReplyOnAnyTopic",
        *   //   "whoCanViewGroup": "my_whoCanViewGroup",
        *   //   "whoCanViewMembership": "my_whoCanViewMembership"
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
      def update(params: ParamsResourceGroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def update(
        params: ParamsResourceGroupsUpdate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceGroupsGet
      extends StObject
         with StandardParameters {
      
      /**
        * The group's email address.
        */
      var groupUniqueId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceGroupsGet {
      
      inline def apply(): ParamsResourceGroupsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceGroupsGet]
      }
      
      extension [Self <: ParamsResourceGroupsGet](x: Self) {
        
        inline def setGroupUniqueId(value: String): Self = StObject.set(x, "groupUniqueId", value.asInstanceOf[js.Any])
        
        inline def setGroupUniqueIdUndefined: Self = StObject.set(x, "groupUniqueId", js.undefined)
      }
    }
    
    trait ParamsResourceGroupsPatch
      extends StObject
         with StandardParameters {
      
      /**
        * The group's email address.
        */
      var groupUniqueId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGroups] = js.undefined
    }
    object ParamsResourceGroupsPatch {
      
      inline def apply(): ParamsResourceGroupsPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceGroupsPatch]
      }
      
      extension [Self <: ParamsResourceGroupsPatch](x: Self) {
        
        inline def setGroupUniqueId(value: String): Self = StObject.set(x, "groupUniqueId", value.asInstanceOf[js.Any])
        
        inline def setGroupUniqueIdUndefined: Self = StObject.set(x, "groupUniqueId", js.undefined)
        
        inline def setRequestBody(value: SchemaGroups): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceGroupsUpdate
      extends StObject
         with StandardParameters {
      
      /**
        * The group's email address.
        */
      var groupUniqueId: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGroups] = js.undefined
    }
    object ParamsResourceGroupsUpdate {
      
      inline def apply(): ParamsResourceGroupsUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceGroupsUpdate]
      }
      
      extension [Self <: ParamsResourceGroupsUpdate](x: Self) {
        
        inline def setGroupUniqueId(value: String): Self = StObject.set(x, "groupUniqueId", value.asInstanceOf[js.Any])
        
        inline def setGroupUniqueIdUndefined: Self = StObject.set(x, "groupUniqueId", js.undefined)
        
        inline def setRequestBody(value: SchemaGroups): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait SchemaGroups extends StObject {
      
      /**
        * Identifies whether members external to your organization can join the group. Possible values are:
        * - true: G Suite users external to your organization can become members of this group.
        * - false: Users not belonging to the organization are not allowed to become members of this group.
        */
      var allowExternalMembers: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. Allows Google to contact administrator of the group.
        * - true: Allow Google to contact managers of this group. Occasionally Google may send updates on the latest features, ask for input on new features, or ask for permission to highlight your group.
        * - false: Google can not contact managers of this group.
        */
      var allowGoogleCommunication: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Allows posting from web. Possible values are:
        * - true: Allows any member to post to the group forum.
        * - false: Members only use Gmail to communicate with the group.
        */
      var allowWebPosting: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Allows the group to be archived only. Possible values are:
        * - true: Group is archived and the group is inactive. New messages to this group are rejected. The older archived messages are browseable and searchable.
        * - If true, the whoCanPostMessage property is set to NONE_CAN_POST.
        * - If reverted from true to false, whoCanPostMessages is set to ALL_MANAGERS_CAN_POST.
        * - false: The group is active and can receive messages.
        * - When false, updating whoCanPostMessage to NONE_CAN_POST, results in an error.
        */
      var archiveOnly: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Set the content of custom footer text. The maximum number of characters is 1,000.
        */
      var customFooterText: js.UndefOr[String | Null] = js.undefined
      
      /**
        * An email address used when replying to a message if the replyTo property is set to REPLY_TO_CUSTOM. This address is defined by an account administrator.
        * - When the group's ReplyTo property is set to REPLY_TO_CUSTOM, the customReplyTo property holds a custom email address used when replying to a message.
        * - If the group's ReplyTo property is set to REPLY_TO_CUSTOM, the customReplyTo property must have a text value or an error is returned.
        */
      var customReplyTo: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies whether the group has a custom role that's included in one of the settings being merged. This field is read-only and update/patch requests to it are ignored. Possible values are:
        * - true
        * - false
        */
      var customRolesEnabledForSettingsToBeMerged: js.UndefOr[String | Null] = js.undefined
      
      /**
        * When a message is rejected, this is text for the rejection notification sent to the message's author. By default, this property is empty and has no value in the API's response body. The maximum notification text size is 10,000 characters. Note: Requires sendMessageDenyNotification property to be true.
        */
      var defaultMessageDenyNotificationText: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Default sender for members who can post messages as the group. Possible values are: - `DEFAULT_SELF`: By default messages will be sent from the user - `GROUP`: By default messages will be sent from the group
        */
      var default_sender: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Description of the group. This property value may be an empty string if no group description has been entered. If entered, the maximum group description is no more than 300 characters.
        */
      var description: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The group's email address. This property can be updated using the Directory API. Note: Only a group owner can change a group's email address. A group manager can't do this.
        * When you change your group's address using the Directory API or the control panel, you are changing the address your subscribers use to send email and the web address people use to access your group. People can't reach your group by visiting the old address.
        */
      var email: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies whether a collaborative inbox will remain turned on for the group. Possible values are:
        * - true
        * - false
        */
      var enableCollaborativeInbox: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Indicates if favorite replies should be displayed above other replies.
        * - true: Favorite replies will be displayed above other replies.
        * - false: Favorite replies will not be displayed above other replies.
        */
      var favoriteRepliesOnTop: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Whether to include custom footer. Possible values are:
        * - true
        * - false
        */
      var includeCustomFooter: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Enables the group to be included in the Global Address List. For more information, see the help center. Possible values are:
        * - true: Group is included in the Global Address List.
        * - false: Group is not included in the Global Address List.
        */
      var includeInGlobalAddressList: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Allows the Group contents to be archived. Possible values are:
        * - true: Archive messages sent to the group.
        * - false: Do not keep an archive of messages sent to this group. If false, previously archived messages remain in the archive.
        */
      var isArchived: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The type of the resource. It is always groupsSettings#groups.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. The maximum size of a message is 25Mb.
        */
      var maxMessageBytes: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Enables members to post messages as the group. Possible values are:
        * - true: Group member can post messages using the group's email address instead of their own email address. Message appear to originate from the group itself. Note: When true, any message moderation settings on individual users or new members do not apply to posts made on behalf of the group.
        * - false: Members can not post in behalf of the group's email address.
        */
      var membersCanPostAsTheGroup: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. The default message display font always has a value of "DEFAULT_FONT".
        */
      var messageDisplayFont: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Moderation level of incoming messages. Possible values are:
        * - MODERATE_ALL_MESSAGES: All messages are sent to the group owner's email address for approval. If approved, the message is sent to the group.
        * - MODERATE_NON_MEMBERS: All messages from non group members are sent to the group owner's email address for approval. If approved, the message is sent to the group.
        * - MODERATE_NEW_MEMBERS: All messages from new members are sent to the group owner's email address for approval. If approved, the message is sent to the group.
        * - MODERATE_NONE: No moderator approval is required. Messages are delivered directly to the group. Note: When the whoCanPostMessage is set to ANYONE_CAN_POST, we recommend the messageModerationLevel be set to MODERATE_NON_MEMBERS to protect the group from possible spam.
        * When memberCanPostAsTheGroup is true, any message moderation settings on individual users or new members will not apply to posts made on behalf of the group.
        */
      var messageModerationLevel: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Name of the group, which has a maximum size of 75 characters.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The primary language for group. For a group's primary language use the language tags from the G Suite languages found at G Suite Email Settings API Email Language Tags.
        */
      var primaryLanguage: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies who receives the default reply. Possible values are:
        * - REPLY_TO_CUSTOM: For replies to messages, use the group's custom email address.
        * When the group's ReplyTo property is set to REPLY_TO_CUSTOM, the customReplyTo property holds the custom email address used when replying to a message. If the group's ReplyTo property is set to REPLY_TO_CUSTOM, the customReplyTo property must have a value. Otherwise an error is returned.
        *
        * - REPLY_TO_SENDER: The reply sent to author of message.
        * - REPLY_TO_LIST: This reply message is sent to the group.
        * - REPLY_TO_OWNER: The reply is sent to the owner(s) of the group. This does not include the group's managers.
        * - REPLY_TO_IGNORE: Group users individually decide where the message reply is sent.
        * - REPLY_TO_MANAGERS: This reply message is sent to the group's managers, which includes all managers and the group owner.
        */
      var replyTo: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Allows a member to be notified if the member's message to the group is denied by the group owner. Possible values are:
        * - true: When a message is rejected, send the deny message notification to the message author.
        * The defaultMessageDenyNotificationText property is dependent on the sendMessageDenyNotification property being true.
        *
        * - false: When a message is rejected, no notification is sent.
        */
      var sendMessageDenyNotification: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanDiscoverGroup setting. Allows the group to be visible in the Groups Directory. Possible values are:
        * - true: All groups in the account are listed in the Groups directory.
        * - false: All groups in the account are not listed in the directory.
        */
      var showInGroupDirectory: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies moderation levels for messages detected as spam. Possible values are:
        * - ALLOW: Post the message to the group.
        * - MODERATE: Send the message to the moderation queue. This is the default.
        * - SILENTLY_MODERATE: Send the message to the moderation queue, but do not send notification to moderators.
        * - REJECT: Immediately reject the message.
        */
      var spamModerationLevel: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateMembers setting. Permissions to add members. Possible values are:
        * - ALL_MEMBERS_CAN_ADD: Managers and members can directly add new members.
        * - ALL_MANAGERS_CAN_ADD: Only managers can directly add new members. this includes the group's owner.
        * - ALL_OWNERS_CAN_ADD: Only owners can directly add new members.
        * - NONE_CAN_ADD: No one can directly add new members.
        */
      var whoCanAdd: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This functionality is no longer supported in the Google Groups UI. The value is always "NONE".
        */
      var whoCanAddReferences: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies who can approve members who ask to join groups. This permission will be deprecated once it is merged into the new whoCanModerateMembers setting. Possible values are:
        * - ALL_MEMBERS_CAN_APPROVE
        * - ALL_MANAGERS_CAN_APPROVE
        * - ALL_OWNERS_CAN_APPROVE
        * - NONE_CAN_APPROVE
        */
      var whoCanApproveMembers: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can approve pending messages in the moderation queue. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanApproveMessages: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to assign topics in a forum to another user. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanAssignTopics: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies who can moderate metadata. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanAssistContent: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies who can deny membership to users. This permission will be deprecated once it is merged into the new whoCanModerateMembers setting. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanBanUsers: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Permission to contact owner of the group via web UI. Possible values are:
        * - ALL_IN_DOMAIN_CAN_CONTACT
        * - ALL_MANAGERS_CAN_CONTACT
        * - ALL_MEMBERS_CAN_CONTACT
        * - ANYONE_CAN_CONTACT
        * - ALL_OWNERS_CAN_CONTACT
        */
      var whoCanContactOwner: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can delete replies to topics. (Authors can always delete their own posts). Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanDeleteAnyPost: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can delete topics. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanDeleteTopics: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies the set of users for whom this group is discoverable. Possible values are:
        * - ANYONE_CAN_DISCOVER
        * - ALL_IN_DOMAIN_CAN_DISCOVER
        * - ALL_MEMBERS_CAN_DISCOVER
        */
      var whoCanDiscoverGroup: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to enter free form tags for topics in a forum. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanEnterFreeFormTags: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can hide posts by reporting them as abuse. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanHideAbuse: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateMembers setting. Permissions to invite new members. Possible values are:
        * - ALL_MEMBERS_CAN_INVITE: Managers and members can invite a new member candidate.
        * - ALL_MANAGERS_CAN_INVITE: Only managers can invite a new member. This includes the group's owner.
        * - ALL_OWNERS_CAN_INVITE: Only owners can invite a new member.
        * - NONE_CAN_INVITE: No one can invite a new member candidate.
        */
      var whoCanInvite: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Permission to join group. Possible values are:
        * - ANYONE_CAN_JOIN: Anyone in the account domain can join. This includes accounts with multiple domains.
        * - ALL_IN_DOMAIN_CAN_JOIN: Any Internet user who is outside your domain can access your Google Groups service and view the list of groups in your Groups directory. Warning: Group owners can add external addresses, outside of the domain to their groups. They can also allow people outside your domain to join their groups. If you later disable this option, any external addresses already added to users' groups remain in those groups.
        * - INVITED_CAN_JOIN: Candidates for membership can be invited to join.
        * - CAN_REQUEST_TO_JOIN: Non members can request an invitation to join.
        */
      var whoCanJoin: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Permission to leave the group. Possible values are:
        * - ALL_MANAGERS_CAN_LEAVE
        * - ALL_MEMBERS_CAN_LEAVE
        * - NONE_CAN_LEAVE
        */
      var whoCanLeaveGroup: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can prevent users from posting replies to topics. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanLockTopics: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can make topics appear at the top of the topic list. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanMakeTopicsSticky: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark a topic as a duplicate of another topic. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanMarkDuplicate: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark any other user's post as a favorite reply. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanMarkFavoriteReplyOnAnyTopic: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark a post for a topic they started as a favorite reply. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanMarkFavoriteReplyOnOwnTopic: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark a topic as not needing a response. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanMarkNoResponseNeeded: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies who can moderate content. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanModerateContent: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Specifies who can manage members. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanModerateMembers: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateMembers setting. Specifies who can change group members' roles. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanModifyMembers: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to change tags and categories. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanModifyTagsAndCategories: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can move topics into the group or forum. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanMoveTopicsIn: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can move topics out of the group or forum. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanMoveTopicsOut: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can post announcements, a special topic type. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanPostAnnouncements: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Permissions to post messages. Possible values are:
        * - NONE_CAN_POST: The group is disabled and archived. No one can post a message to this group.
        * - When archiveOnly is false, updating whoCanPostMessage to NONE_CAN_POST, results in an error.
        * - If archiveOnly is reverted from true to false, whoCanPostMessages is set to ALL_MANAGERS_CAN_POST.
        * - ALL_MANAGERS_CAN_POST: Managers, including group owners, can post messages.
        * - ALL_MEMBERS_CAN_POST: Any group member can post a message.
        * - ALL_OWNERS_CAN_POST: Only group owners can post a message.
        * - ALL_IN_DOMAIN_CAN_POST: Anyone in the account can post a message.
        * - ANYONE_CAN_POST: Any Internet user who outside your account can access your Google Groups service and post a message. Note: When whoCanPostMessage is set to ANYONE_CAN_POST, we recommend the messageModerationLevel be set to MODERATE_NON_MEMBERS to protect the group from possible spam.
        */
      var whoCanPostMessage: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to take topics in a forum. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanTakeTopics: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to unassign any topic in a forum. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanUnassignTopic: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to unmark any post from a favorite reply. Possible values are:
        * - ALL_MEMBERS
        * - OWNERS_AND_MANAGERS
        * - MANAGERS_ONLY
        * - OWNERS_ONLY
        * - NONE
        */
      var whoCanUnmarkFavoriteReplyOnAnyTopic: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Permissions to view group messages. Possible values are:
        * - ANYONE_CAN_VIEW: Any Internet user can view the group's messages.
        * - ALL_IN_DOMAIN_CAN_VIEW: Anyone in your account can view this group's messages.
        * - ALL_MEMBERS_CAN_VIEW: All group members can view the group's messages.
        * - ALL_MANAGERS_CAN_VIEW: Any group manager can view this group's messages.
        */
      var whoCanViewGroup: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Permissions to view membership. Possible values are:
        * - ALL_IN_DOMAIN_CAN_VIEW: Anyone in the account can view the group members list.
        * If a group already has external members, those members can still send email to this group.
        *
        * - ALL_MEMBERS_CAN_VIEW: The group members can view the group members list.
        * - ALL_MANAGERS_CAN_VIEW: The group managers can view group members list.
        */
      var whoCanViewMembership: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGroups {
      
      inline def apply(): SchemaGroups = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGroups]
      }
      
      extension [Self <: SchemaGroups](x: Self) {
        
        inline def setAllowExternalMembers(value: String): Self = StObject.set(x, "allowExternalMembers", value.asInstanceOf[js.Any])
        
        inline def setAllowExternalMembersNull: Self = StObject.set(x, "allowExternalMembers", null)
        
        inline def setAllowExternalMembersUndefined: Self = StObject.set(x, "allowExternalMembers", js.undefined)
        
        inline def setAllowGoogleCommunication(value: String): Self = StObject.set(x, "allowGoogleCommunication", value.asInstanceOf[js.Any])
        
        inline def setAllowGoogleCommunicationNull: Self = StObject.set(x, "allowGoogleCommunication", null)
        
        inline def setAllowGoogleCommunicationUndefined: Self = StObject.set(x, "allowGoogleCommunication", js.undefined)
        
        inline def setAllowWebPosting(value: String): Self = StObject.set(x, "allowWebPosting", value.asInstanceOf[js.Any])
        
        inline def setAllowWebPostingNull: Self = StObject.set(x, "allowWebPosting", null)
        
        inline def setAllowWebPostingUndefined: Self = StObject.set(x, "allowWebPosting", js.undefined)
        
        inline def setArchiveOnly(value: String): Self = StObject.set(x, "archiveOnly", value.asInstanceOf[js.Any])
        
        inline def setArchiveOnlyNull: Self = StObject.set(x, "archiveOnly", null)
        
        inline def setArchiveOnlyUndefined: Self = StObject.set(x, "archiveOnly", js.undefined)
        
        inline def setCustomFooterText(value: String): Self = StObject.set(x, "customFooterText", value.asInstanceOf[js.Any])
        
        inline def setCustomFooterTextNull: Self = StObject.set(x, "customFooterText", null)
        
        inline def setCustomFooterTextUndefined: Self = StObject.set(x, "customFooterText", js.undefined)
        
        inline def setCustomReplyTo(value: String): Self = StObject.set(x, "customReplyTo", value.asInstanceOf[js.Any])
        
        inline def setCustomReplyToNull: Self = StObject.set(x, "customReplyTo", null)
        
        inline def setCustomReplyToUndefined: Self = StObject.set(x, "customReplyTo", js.undefined)
        
        inline def setCustomRolesEnabledForSettingsToBeMerged(value: String): Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", value.asInstanceOf[js.Any])
        
        inline def setCustomRolesEnabledForSettingsToBeMergedNull: Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", null)
        
        inline def setCustomRolesEnabledForSettingsToBeMergedUndefined: Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", js.undefined)
        
        inline def setDefaultMessageDenyNotificationText(value: String): Self = StObject.set(x, "defaultMessageDenyNotificationText", value.asInstanceOf[js.Any])
        
        inline def setDefaultMessageDenyNotificationTextNull: Self = StObject.set(x, "defaultMessageDenyNotificationText", null)
        
        inline def setDefaultMessageDenyNotificationTextUndefined: Self = StObject.set(x, "defaultMessageDenyNotificationText", js.undefined)
        
        inline def setDefault_sender(value: String): Self = StObject.set(x, "default_sender", value.asInstanceOf[js.Any])
        
        inline def setDefault_senderNull: Self = StObject.set(x, "default_sender", null)
        
        inline def setDefault_senderUndefined: Self = StObject.set(x, "default_sender", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionNull: Self = StObject.set(x, "description", null)
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailNull: Self = StObject.set(x, "email", null)
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setEnableCollaborativeInbox(value: String): Self = StObject.set(x, "enableCollaborativeInbox", value.asInstanceOf[js.Any])
        
        inline def setEnableCollaborativeInboxNull: Self = StObject.set(x, "enableCollaborativeInbox", null)
        
        inline def setEnableCollaborativeInboxUndefined: Self = StObject.set(x, "enableCollaborativeInbox", js.undefined)
        
        inline def setFavoriteRepliesOnTop(value: String): Self = StObject.set(x, "favoriteRepliesOnTop", value.asInstanceOf[js.Any])
        
        inline def setFavoriteRepliesOnTopNull: Self = StObject.set(x, "favoriteRepliesOnTop", null)
        
        inline def setFavoriteRepliesOnTopUndefined: Self = StObject.set(x, "favoriteRepliesOnTop", js.undefined)
        
        inline def setIncludeCustomFooter(value: String): Self = StObject.set(x, "includeCustomFooter", value.asInstanceOf[js.Any])
        
        inline def setIncludeCustomFooterNull: Self = StObject.set(x, "includeCustomFooter", null)
        
        inline def setIncludeCustomFooterUndefined: Self = StObject.set(x, "includeCustomFooter", js.undefined)
        
        inline def setIncludeInGlobalAddressList(value: String): Self = StObject.set(x, "includeInGlobalAddressList", value.asInstanceOf[js.Any])
        
        inline def setIncludeInGlobalAddressListNull: Self = StObject.set(x, "includeInGlobalAddressList", null)
        
        inline def setIncludeInGlobalAddressListUndefined: Self = StObject.set(x, "includeInGlobalAddressList", js.undefined)
        
        inline def setIsArchived(value: String): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
        
        inline def setIsArchivedNull: Self = StObject.set(x, "isArchived", null)
        
        inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMaxMessageBytes(value: Double): Self = StObject.set(x, "maxMessageBytes", value.asInstanceOf[js.Any])
        
        inline def setMaxMessageBytesNull: Self = StObject.set(x, "maxMessageBytes", null)
        
        inline def setMaxMessageBytesUndefined: Self = StObject.set(x, "maxMessageBytes", js.undefined)
        
        inline def setMembersCanPostAsTheGroup(value: String): Self = StObject.set(x, "membersCanPostAsTheGroup", value.asInstanceOf[js.Any])
        
        inline def setMembersCanPostAsTheGroupNull: Self = StObject.set(x, "membersCanPostAsTheGroup", null)
        
        inline def setMembersCanPostAsTheGroupUndefined: Self = StObject.set(x, "membersCanPostAsTheGroup", js.undefined)
        
        inline def setMessageDisplayFont(value: String): Self = StObject.set(x, "messageDisplayFont", value.asInstanceOf[js.Any])
        
        inline def setMessageDisplayFontNull: Self = StObject.set(x, "messageDisplayFont", null)
        
        inline def setMessageDisplayFontUndefined: Self = StObject.set(x, "messageDisplayFont", js.undefined)
        
        inline def setMessageModerationLevel(value: String): Self = StObject.set(x, "messageModerationLevel", value.asInstanceOf[js.Any])
        
        inline def setMessageModerationLevelNull: Self = StObject.set(x, "messageModerationLevel", null)
        
        inline def setMessageModerationLevelUndefined: Self = StObject.set(x, "messageModerationLevel", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPrimaryLanguage(value: String): Self = StObject.set(x, "primaryLanguage", value.asInstanceOf[js.Any])
        
        inline def setPrimaryLanguageNull: Self = StObject.set(x, "primaryLanguage", null)
        
        inline def setPrimaryLanguageUndefined: Self = StObject.set(x, "primaryLanguage", js.undefined)
        
        inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
        
        inline def setReplyToNull: Self = StObject.set(x, "replyTo", null)
        
        inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
        
        inline def setSendMessageDenyNotification(value: String): Self = StObject.set(x, "sendMessageDenyNotification", value.asInstanceOf[js.Any])
        
        inline def setSendMessageDenyNotificationNull: Self = StObject.set(x, "sendMessageDenyNotification", null)
        
        inline def setSendMessageDenyNotificationUndefined: Self = StObject.set(x, "sendMessageDenyNotification", js.undefined)
        
        inline def setShowInGroupDirectory(value: String): Self = StObject.set(x, "showInGroupDirectory", value.asInstanceOf[js.Any])
        
        inline def setShowInGroupDirectoryNull: Self = StObject.set(x, "showInGroupDirectory", null)
        
        inline def setShowInGroupDirectoryUndefined: Self = StObject.set(x, "showInGroupDirectory", js.undefined)
        
        inline def setSpamModerationLevel(value: String): Self = StObject.set(x, "spamModerationLevel", value.asInstanceOf[js.Any])
        
        inline def setSpamModerationLevelNull: Self = StObject.set(x, "spamModerationLevel", null)
        
        inline def setSpamModerationLevelUndefined: Self = StObject.set(x, "spamModerationLevel", js.undefined)
        
        inline def setWhoCanAdd(value: String): Self = StObject.set(x, "whoCanAdd", value.asInstanceOf[js.Any])
        
        inline def setWhoCanAddNull: Self = StObject.set(x, "whoCanAdd", null)
        
        inline def setWhoCanAddReferences(value: String): Self = StObject.set(x, "whoCanAddReferences", value.asInstanceOf[js.Any])
        
        inline def setWhoCanAddReferencesNull: Self = StObject.set(x, "whoCanAddReferences", null)
        
        inline def setWhoCanAddReferencesUndefined: Self = StObject.set(x, "whoCanAddReferences", js.undefined)
        
        inline def setWhoCanAddUndefined: Self = StObject.set(x, "whoCanAdd", js.undefined)
        
        inline def setWhoCanApproveMembers(value: String): Self = StObject.set(x, "whoCanApproveMembers", value.asInstanceOf[js.Any])
        
        inline def setWhoCanApproveMembersNull: Self = StObject.set(x, "whoCanApproveMembers", null)
        
        inline def setWhoCanApproveMembersUndefined: Self = StObject.set(x, "whoCanApproveMembers", js.undefined)
        
        inline def setWhoCanApproveMessages(value: String): Self = StObject.set(x, "whoCanApproveMessages", value.asInstanceOf[js.Any])
        
        inline def setWhoCanApproveMessagesNull: Self = StObject.set(x, "whoCanApproveMessages", null)
        
        inline def setWhoCanApproveMessagesUndefined: Self = StObject.set(x, "whoCanApproveMessages", js.undefined)
        
        inline def setWhoCanAssignTopics(value: String): Self = StObject.set(x, "whoCanAssignTopics", value.asInstanceOf[js.Any])
        
        inline def setWhoCanAssignTopicsNull: Self = StObject.set(x, "whoCanAssignTopics", null)
        
        inline def setWhoCanAssignTopicsUndefined: Self = StObject.set(x, "whoCanAssignTopics", js.undefined)
        
        inline def setWhoCanAssistContent(value: String): Self = StObject.set(x, "whoCanAssistContent", value.asInstanceOf[js.Any])
        
        inline def setWhoCanAssistContentNull: Self = StObject.set(x, "whoCanAssistContent", null)
        
        inline def setWhoCanAssistContentUndefined: Self = StObject.set(x, "whoCanAssistContent", js.undefined)
        
        inline def setWhoCanBanUsers(value: String): Self = StObject.set(x, "whoCanBanUsers", value.asInstanceOf[js.Any])
        
        inline def setWhoCanBanUsersNull: Self = StObject.set(x, "whoCanBanUsers", null)
        
        inline def setWhoCanBanUsersUndefined: Self = StObject.set(x, "whoCanBanUsers", js.undefined)
        
        inline def setWhoCanContactOwner(value: String): Self = StObject.set(x, "whoCanContactOwner", value.asInstanceOf[js.Any])
        
        inline def setWhoCanContactOwnerNull: Self = StObject.set(x, "whoCanContactOwner", null)
        
        inline def setWhoCanContactOwnerUndefined: Self = StObject.set(x, "whoCanContactOwner", js.undefined)
        
        inline def setWhoCanDeleteAnyPost(value: String): Self = StObject.set(x, "whoCanDeleteAnyPost", value.asInstanceOf[js.Any])
        
        inline def setWhoCanDeleteAnyPostNull: Self = StObject.set(x, "whoCanDeleteAnyPost", null)
        
        inline def setWhoCanDeleteAnyPostUndefined: Self = StObject.set(x, "whoCanDeleteAnyPost", js.undefined)
        
        inline def setWhoCanDeleteTopics(value: String): Self = StObject.set(x, "whoCanDeleteTopics", value.asInstanceOf[js.Any])
        
        inline def setWhoCanDeleteTopicsNull: Self = StObject.set(x, "whoCanDeleteTopics", null)
        
        inline def setWhoCanDeleteTopicsUndefined: Self = StObject.set(x, "whoCanDeleteTopics", js.undefined)
        
        inline def setWhoCanDiscoverGroup(value: String): Self = StObject.set(x, "whoCanDiscoverGroup", value.asInstanceOf[js.Any])
        
        inline def setWhoCanDiscoverGroupNull: Self = StObject.set(x, "whoCanDiscoverGroup", null)
        
        inline def setWhoCanDiscoverGroupUndefined: Self = StObject.set(x, "whoCanDiscoverGroup", js.undefined)
        
        inline def setWhoCanEnterFreeFormTags(value: String): Self = StObject.set(x, "whoCanEnterFreeFormTags", value.asInstanceOf[js.Any])
        
        inline def setWhoCanEnterFreeFormTagsNull: Self = StObject.set(x, "whoCanEnterFreeFormTags", null)
        
        inline def setWhoCanEnterFreeFormTagsUndefined: Self = StObject.set(x, "whoCanEnterFreeFormTags", js.undefined)
        
        inline def setWhoCanHideAbuse(value: String): Self = StObject.set(x, "whoCanHideAbuse", value.asInstanceOf[js.Any])
        
        inline def setWhoCanHideAbuseNull: Self = StObject.set(x, "whoCanHideAbuse", null)
        
        inline def setWhoCanHideAbuseUndefined: Self = StObject.set(x, "whoCanHideAbuse", js.undefined)
        
        inline def setWhoCanInvite(value: String): Self = StObject.set(x, "whoCanInvite", value.asInstanceOf[js.Any])
        
        inline def setWhoCanInviteNull: Self = StObject.set(x, "whoCanInvite", null)
        
        inline def setWhoCanInviteUndefined: Self = StObject.set(x, "whoCanInvite", js.undefined)
        
        inline def setWhoCanJoin(value: String): Self = StObject.set(x, "whoCanJoin", value.asInstanceOf[js.Any])
        
        inline def setWhoCanJoinNull: Self = StObject.set(x, "whoCanJoin", null)
        
        inline def setWhoCanJoinUndefined: Self = StObject.set(x, "whoCanJoin", js.undefined)
        
        inline def setWhoCanLeaveGroup(value: String): Self = StObject.set(x, "whoCanLeaveGroup", value.asInstanceOf[js.Any])
        
        inline def setWhoCanLeaveGroupNull: Self = StObject.set(x, "whoCanLeaveGroup", null)
        
        inline def setWhoCanLeaveGroupUndefined: Self = StObject.set(x, "whoCanLeaveGroup", js.undefined)
        
        inline def setWhoCanLockTopics(value: String): Self = StObject.set(x, "whoCanLockTopics", value.asInstanceOf[js.Any])
        
        inline def setWhoCanLockTopicsNull: Self = StObject.set(x, "whoCanLockTopics", null)
        
        inline def setWhoCanLockTopicsUndefined: Self = StObject.set(x, "whoCanLockTopics", js.undefined)
        
        inline def setWhoCanMakeTopicsSticky(value: String): Self = StObject.set(x, "whoCanMakeTopicsSticky", value.asInstanceOf[js.Any])
        
        inline def setWhoCanMakeTopicsStickyNull: Self = StObject.set(x, "whoCanMakeTopicsSticky", null)
        
        inline def setWhoCanMakeTopicsStickyUndefined: Self = StObject.set(x, "whoCanMakeTopicsSticky", js.undefined)
        
        inline def setWhoCanMarkDuplicate(value: String): Self = StObject.set(x, "whoCanMarkDuplicate", value.asInstanceOf[js.Any])
        
        inline def setWhoCanMarkDuplicateNull: Self = StObject.set(x, "whoCanMarkDuplicate", null)
        
        inline def setWhoCanMarkDuplicateUndefined: Self = StObject.set(x, "whoCanMarkDuplicate", js.undefined)
        
        inline def setWhoCanMarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
        
        inline def setWhoCanMarkFavoriteReplyOnAnyTopicNull: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", null)
        
        inline def setWhoCanMarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", js.undefined)
        
        inline def setWhoCanMarkFavoriteReplyOnOwnTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", value.asInstanceOf[js.Any])
        
        inline def setWhoCanMarkFavoriteReplyOnOwnTopicNull: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", null)
        
        inline def setWhoCanMarkFavoriteReplyOnOwnTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", js.undefined)
        
        inline def setWhoCanMarkNoResponseNeeded(value: String): Self = StObject.set(x, "whoCanMarkNoResponseNeeded", value.asInstanceOf[js.Any])
        
        inline def setWhoCanMarkNoResponseNeededNull: Self = StObject.set(x, "whoCanMarkNoResponseNeeded", null)
        
        inline def setWhoCanMarkNoResponseNeededUndefined: Self = StObject.set(x, "whoCanMarkNoResponseNeeded", js.undefined)
        
        inline def setWhoCanModerateContent(value: String): Self = StObject.set(x, "whoCanModerateContent", value.asInstanceOf[js.Any])
        
        inline def setWhoCanModerateContentNull: Self = StObject.set(x, "whoCanModerateContent", null)
        
        inline def setWhoCanModerateContentUndefined: Self = StObject.set(x, "whoCanModerateContent", js.undefined)
        
        inline def setWhoCanModerateMembers(value: String): Self = StObject.set(x, "whoCanModerateMembers", value.asInstanceOf[js.Any])
        
        inline def setWhoCanModerateMembersNull: Self = StObject.set(x, "whoCanModerateMembers", null)
        
        inline def setWhoCanModerateMembersUndefined: Self = StObject.set(x, "whoCanModerateMembers", js.undefined)
        
        inline def setWhoCanModifyMembers(value: String): Self = StObject.set(x, "whoCanModifyMembers", value.asInstanceOf[js.Any])
        
        inline def setWhoCanModifyMembersNull: Self = StObject.set(x, "whoCanModifyMembers", null)
        
        inline def setWhoCanModifyMembersUndefined: Self = StObject.set(x, "whoCanModifyMembers", js.undefined)
        
        inline def setWhoCanModifyTagsAndCategories(value: String): Self = StObject.set(x, "whoCanModifyTagsAndCategories", value.asInstanceOf[js.Any])
        
        inline def setWhoCanModifyTagsAndCategoriesNull: Self = StObject.set(x, "whoCanModifyTagsAndCategories", null)
        
        inline def setWhoCanModifyTagsAndCategoriesUndefined: Self = StObject.set(x, "whoCanModifyTagsAndCategories", js.undefined)
        
        inline def setWhoCanMoveTopicsIn(value: String): Self = StObject.set(x, "whoCanMoveTopicsIn", value.asInstanceOf[js.Any])
        
        inline def setWhoCanMoveTopicsInNull: Self = StObject.set(x, "whoCanMoveTopicsIn", null)
        
        inline def setWhoCanMoveTopicsInUndefined: Self = StObject.set(x, "whoCanMoveTopicsIn", js.undefined)
        
        inline def setWhoCanMoveTopicsOut(value: String): Self = StObject.set(x, "whoCanMoveTopicsOut", value.asInstanceOf[js.Any])
        
        inline def setWhoCanMoveTopicsOutNull: Self = StObject.set(x, "whoCanMoveTopicsOut", null)
        
        inline def setWhoCanMoveTopicsOutUndefined: Self = StObject.set(x, "whoCanMoveTopicsOut", js.undefined)
        
        inline def setWhoCanPostAnnouncements(value: String): Self = StObject.set(x, "whoCanPostAnnouncements", value.asInstanceOf[js.Any])
        
        inline def setWhoCanPostAnnouncementsNull: Self = StObject.set(x, "whoCanPostAnnouncements", null)
        
        inline def setWhoCanPostAnnouncementsUndefined: Self = StObject.set(x, "whoCanPostAnnouncements", js.undefined)
        
        inline def setWhoCanPostMessage(value: String): Self = StObject.set(x, "whoCanPostMessage", value.asInstanceOf[js.Any])
        
        inline def setWhoCanPostMessageNull: Self = StObject.set(x, "whoCanPostMessage", null)
        
        inline def setWhoCanPostMessageUndefined: Self = StObject.set(x, "whoCanPostMessage", js.undefined)
        
        inline def setWhoCanTakeTopics(value: String): Self = StObject.set(x, "whoCanTakeTopics", value.asInstanceOf[js.Any])
        
        inline def setWhoCanTakeTopicsNull: Self = StObject.set(x, "whoCanTakeTopics", null)
        
        inline def setWhoCanTakeTopicsUndefined: Self = StObject.set(x, "whoCanTakeTopics", js.undefined)
        
        inline def setWhoCanUnassignTopic(value: String): Self = StObject.set(x, "whoCanUnassignTopic", value.asInstanceOf[js.Any])
        
        inline def setWhoCanUnassignTopicNull: Self = StObject.set(x, "whoCanUnassignTopic", null)
        
        inline def setWhoCanUnassignTopicUndefined: Self = StObject.set(x, "whoCanUnassignTopic", js.undefined)
        
        inline def setWhoCanUnmarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
        
        inline def setWhoCanUnmarkFavoriteReplyOnAnyTopicNull: Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", null)
        
        inline def setWhoCanUnmarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", js.undefined)
        
        inline def setWhoCanViewGroup(value: String): Self = StObject.set(x, "whoCanViewGroup", value.asInstanceOf[js.Any])
        
        inline def setWhoCanViewGroupNull: Self = StObject.set(x, "whoCanViewGroup", null)
        
        inline def setWhoCanViewGroupUndefined: Self = StObject.set(x, "whoCanViewGroup", js.undefined)
        
        inline def setWhoCanViewMembership(value: String): Self = StObject.set(x, "whoCanViewMembership", value.asInstanceOf[js.Any])
        
        inline def setWhoCanViewMembershipNull: Self = StObject.set(x, "whoCanViewMembership", null)
        
        inline def setWhoCanViewMembershipUndefined: Self = StObject.set(x, "whoCanViewMembership", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
