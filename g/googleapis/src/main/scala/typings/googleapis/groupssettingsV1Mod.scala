package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupssettingsV1Mod {
  
  object groupssettingsV1 {
    
    /**
      * Groups Settings API
      *
      * Manages permission levels and related settings of a group.
      *
      * @example
      * const {google} = require('googleapis');
      * const groupssettings = google.groupssettings('v1');
      *
      * @namespace groupssettings
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Groupssettings
      */
    @JSImport("googleapis/build/src/apis/groupssettings/v1", "groupssettings_v1.Groupssettings")
    @js.native
    class Groupssettings protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var groups: ResourceGroups = js.native
    }
    
    @JSImport("googleapis/build/src/apis/groupssettings/v1", "groupssettings_v1.Resource$Groups")
    @js.native
    class ResourceGroups protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * groupsSettings.groups.get
        * @desc Gets one resource by id.
        * @alias groupsSettings.groups.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.groupUniqueId The resource ID
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaGroups] = js.native
      def get(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def get(params: ParamsResourceGroupsGet): GaxiosPromise[SchemaGroups] = js.native
      def get(params: ParamsResourceGroupsGet, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def get(
        params: ParamsResourceGroupsGet,
        options: BodyResponseCallback[SchemaGroups],
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      def get(params: ParamsResourceGroupsGet, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def get(
        params: ParamsResourceGroupsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      
      /**
        * groupsSettings.groups.patch
        * @desc Updates an existing resource. This method supports patch semantics.
        * @alias groupsSettings.groups.patch
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.groupUniqueId The resource ID
        * @param {().Groups} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def patch(): GaxiosPromise[SchemaGroups] = js.native
      def patch(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def patch(params: ParamsResourceGroupsPatch): GaxiosPromise[SchemaGroups] = js.native
      def patch(params: ParamsResourceGroupsPatch, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def patch(
        params: ParamsResourceGroupsPatch,
        options: BodyResponseCallback[SchemaGroups],
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      def patch(params: ParamsResourceGroupsPatch, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def patch(
        params: ParamsResourceGroupsPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      
      /**
        * groupsSettings.groups.update
        * @desc Updates an existing resource.
        * @alias groupsSettings.groups.update
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.groupUniqueId The resource ID
        * @param {().Groups} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def update(): GaxiosPromise[SchemaGroups] = js.native
      def update(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def update(params: ParamsResourceGroupsUpdate): GaxiosPromise[SchemaGroups] = js.native
      def update(params: ParamsResourceGroupsUpdate, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def update(
        params: ParamsResourceGroupsUpdate,
        options: BodyResponseCallback[SchemaGroups],
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      def update(params: ParamsResourceGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def update(
        params: ParamsResourceGroupsUpdate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceGroupsGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The resource ID
        */
      var groupUniqueId: js.UndefOr[String] = js.native
    }
    object ParamsResourceGroupsGet {
      
      @scala.inline
      def apply(): ParamsResourceGroupsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceGroupsGet]
      }
      
      @scala.inline
      implicit class ParamsResourceGroupsGetMutableBuilder[Self <: ParamsResourceGroupsGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setGroupUniqueId(value: String): Self = StObject.set(x, "groupUniqueId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUniqueIdUndefined: Self = StObject.set(x, "groupUniqueId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceGroupsPatch extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The resource ID
        */
      var groupUniqueId: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGroups] = js.native
    }
    object ParamsResourceGroupsPatch {
      
      @scala.inline
      def apply(): ParamsResourceGroupsPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceGroupsPatch]
      }
      
      @scala.inline
      implicit class ParamsResourceGroupsPatchMutableBuilder[Self <: ParamsResourceGroupsPatch] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setGroupUniqueId(value: String): Self = StObject.set(x, "groupUniqueId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUniqueIdUndefined: Self = StObject.set(x, "groupUniqueId", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaGroups): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceGroupsUpdate extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The resource ID
        */
      var groupUniqueId: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGroups] = js.native
    }
    object ParamsResourceGroupsUpdate {
      
      @scala.inline
      def apply(): ParamsResourceGroupsUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceGroupsUpdate]
      }
      
      @scala.inline
      implicit class ParamsResourceGroupsUpdateMutableBuilder[Self <: ParamsResourceGroupsUpdate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setGroupUniqueId(value: String): Self = StObject.set(x, "groupUniqueId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUniqueIdUndefined: Self = StObject.set(x, "groupUniqueId", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaGroups): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    /**
      * JSON template for Group resource
      */
    @js.native
    trait SchemaGroups extends StObject {
      
      /**
        * Are external members allowed to join the group.
        */
      var allowExternalMembers: js.UndefOr[String] = js.native
      
      /**
        * Is google allowed to contact admins.
        */
      var allowGoogleCommunication: js.UndefOr[String] = js.native
      
      /**
        * If posting from web is allowed.
        */
      var allowWebPosting: js.UndefOr[String] = js.native
      
      /**
        * If the group is archive only
        */
      var archiveOnly: js.UndefOr[String] = js.native
      
      /**
        * Custom footer text.
        */
      var customFooterText: js.UndefOr[String] = js.native
      
      /**
        * Default email to which reply to any message should go.
        */
      var customReplyTo: js.UndefOr[String] = js.native
      
      /**
        * If any of the settings that will be merged have custom roles which is
        * anything other than owners, managers, or group scopes.
        */
      var customRolesEnabledForSettingsToBeMerged: js.UndefOr[String] = js.native
      
      /**
        * Default message deny notification message
        */
      var defaultMessageDenyNotificationText: js.UndefOr[String] = js.native
      
      /**
        * Description of the group
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * Email id of the group
        */
      var email: js.UndefOr[String] = js.native
      
      /**
        * If a primary Collab Inbox feature is enabled.
        */
      var enableCollaborativeInbox: js.UndefOr[String] = js.native
      
      /**
        * If favorite replies should be displayed above other replies.
        */
      var favoriteRepliesOnTop: js.UndefOr[String] = js.native
      
      /**
        * Whether to include custom footer.
        */
      var includeCustomFooter: js.UndefOr[String] = js.native
      
      /**
        * If this groups should be included in global address list or not.
        */
      var includeInGlobalAddressList: js.UndefOr[String] = js.native
      
      /**
        * If the contents of the group are archived.
        */
      var isArchived: js.UndefOr[String] = js.native
      
      /**
        * The type of the resource.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Maximum message size allowed.
        */
      var maxMessageBytes: js.UndefOr[Double] = js.native
      
      /**
        * Can members post using the group email address.
        */
      var membersCanPostAsTheGroup: js.UndefOr[String] = js.native
      
      /**
        * Default message display font. Possible values are: DEFAULT_FONT
        * FIXED_WIDTH_FONT
        */
      var messageDisplayFont: js.UndefOr[String] = js.native
      
      /**
        * Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES
        * MODERATE_NON_MEMBERS MODERATE_NEW_MEMBERS MODERATE_NONE
        */
      var messageModerationLevel: js.UndefOr[String] = js.native
      
      /**
        * Name of the Group
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Primary language for the group.
        */
      var primaryLanguage: js.UndefOr[String] = js.native
      
      /**
        * Whome should the default reply to a message go to. Possible values are:
        * REPLY_TO_CUSTOM REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER
        * REPLY_TO_IGNORE REPLY_TO_MANAGERS
        */
      var replyTo: js.UndefOr[String] = js.native
      
      /**
        * Should the member be notified if his message is denied by owner.
        */
      var sendMessageDenyNotification: js.UndefOr[String] = js.native
      
      /**
        * Is the group listed in groups directory
        */
      var showInGroupDirectory: js.UndefOr[String] = js.native
      
      /**
        * Moderation level for messages detected as spam. Possible values are:
        * ALLOW MODERATE SILENTLY_MODERATE REJECT
        */
      var spamModerationLevel: js.UndefOr[String] = js.native
      
      /**
        * Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD
        * ALL_OWNERS_CAN_ADD ALL_MEMBERS_CAN_ADD NONE_CAN_ADD
        */
      var whoCanAdd: js.UndefOr[String] = js.native
      
      /**
        * Permission to add references to a topic. Possible values are: NONE
        * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanAddReferences: js.UndefOr[String] = js.native
      
      /**
        * Permission to approve members. Possible values are:
        * ALL_OWNERS_CAN_APPROVE ALL_MANAGERS_CAN_APPROVE ALL_MEMBERS_CAN_APPROVE
        * NONE_CAN_APPROVE
        */
      var whoCanApproveMembers: js.UndefOr[String] = js.native
      
      /**
        * Permission to approve pending messages in the moderation queue. Possible
        * values are: NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanApproveMessages: js.UndefOr[String] = js.native
      
      /**
        * Permission to assign topics in a forum to another user. Possible values
        * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanAssignTopics: js.UndefOr[String] = js.native
      
      /**
        * Permission for content assistants. Possible values are: Possible values
        * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanAssistContent: js.UndefOr[String] = js.native
      
      /**
        * Permission to ban users. Possible values are: NONE OWNERS_ONLY
        * OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanBanUsers: js.UndefOr[String] = js.native
      
      /**
        * Permission to contact owner of the group via web UI. Possible values are:
        * ANYONE_CAN_CONTACT ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT
        * ALL_MANAGERS_CAN_CONTACT
        */
      var whoCanContactOwner: js.UndefOr[String] = js.native
      
      /**
        * Permission to delete replies to topics. Possible values are: NONE
        * OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanDeleteAnyPost: js.UndefOr[String] = js.native
      
      /**
        * Permission to delete topics. Possible values are: NONE OWNERS_ONLY
        * OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanDeleteTopics: js.UndefOr[String] = js.native
      
      /**
        * Permission for who can discover the group. Possible values are:
        * ALL_MEMBERS_CAN_DISCOVER ALL_IN_DOMAIN_CAN_DISCOVER ANYONE_CAN_DISCOVER
        */
      var whoCanDiscoverGroup: js.UndefOr[String] = js.native
      
      /**
        * Permission to enter free form tags for topics in a forum. Possible values
        * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanEnterFreeFormTags: js.UndefOr[String] = js.native
      
      /**
        * Permission to hide posts by reporting them as abuse. Possible values are:
        * NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanHideAbuse: js.UndefOr[String] = js.native
      
      /**
        * Permissions to invite members. Possible values are:
        * ALL_MEMBERS_CAN_INVITE ALL_MANAGERS_CAN_INVITE ALL_OWNERS_CAN_INVITE
        * NONE_CAN_INVITE
        */
      var whoCanInvite: js.UndefOr[String] = js.native
      
      /**
        * Permissions to join the group. Possible values are: ANYONE_CAN_JOIN
        * ALL_IN_DOMAIN_CAN_JOIN INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN
        */
      var whoCanJoin: js.UndefOr[String] = js.native
      
      /**
        * Permission to leave the group. Possible values are:
        * ALL_MANAGERS_CAN_LEAVE ALL_OWNERS_CAN_LEAVE ALL_MEMBERS_CAN_LEAVE
        * NONE_CAN_LEAVE
        */
      var whoCanLeaveGroup: js.UndefOr[String] = js.native
      
      /**
        * Permission to lock topics. Possible values are: NONE OWNERS_ONLY
        * OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanLockTopics: js.UndefOr[String] = js.native
      
      /**
        * Permission to make topics appear at the top of the topic list. Possible
        * values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
        * ALL_MEMBERS
        */
      var whoCanMakeTopicsSticky: js.UndefOr[String] = js.native
      
      /**
        * Permission to mark a topic as a duplicate of another topic. Possible
        * values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
        * ALL_MEMBERS
        */
      var whoCanMarkDuplicate: js.UndefOr[String] = js.native
      
      /**
        * Permission to mark any other user&#39;s post as a favorite reply.
        * Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
        * ALL_MEMBERS
        */
      var whoCanMarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
      
      /**
        * Permission to mark a post for a topic they started as a favorite reply.
        * Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
        * ALL_MEMBERS
        */
      var whoCanMarkFavoriteReplyOnOwnTopic: js.UndefOr[String] = js.native
      
      /**
        * Permission to mark a topic as not needing a response. Possible values
        * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanMarkNoResponseNeeded: js.UndefOr[String] = js.native
      
      /**
        * Permission for content moderation. Possible values are: NONE OWNERS_ONLY
        * OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanModerateContent: js.UndefOr[String] = js.native
      
      /**
        * Permission for membership moderation. Possible values are: NONE
        * OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanModerateMembers: js.UndefOr[String] = js.native
      
      /**
        * Permission to modify members (change member roles). Possible values are:
        * NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanModifyMembers: js.UndefOr[String] = js.native
      
      /**
        * Permission to change tags and categories. Possible values are: NONE
        * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanModifyTagsAndCategories: js.UndefOr[String] = js.native
      
      /**
        * Permission to move topics into the group or forum. Possible values are:
        * NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanMoveTopicsIn: js.UndefOr[String] = js.native
      
      /**
        * Permission to move topics out of the group or forum. Possible values are:
        * NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanMoveTopicsOut: js.UndefOr[String] = js.native
      
      /**
        * Permission to post announcements, a special topic type. Possible values
        * are: NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanPostAnnouncements: js.UndefOr[String] = js.native
      
      /**
        * Permissions to post messages to the group. Possible values are:
        * NONE_CAN_POST ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST
        * ALL_OWNERS_CAN_POST ALL_IN_DOMAIN_CAN_POST ANYONE_CAN_POST
        */
      var whoCanPostMessage: js.UndefOr[String] = js.native
      
      /**
        * Permission to take topics in a forum. Possible values are: NONE
        * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanTakeTopics: js.UndefOr[String] = js.native
      
      /**
        * Permission to unassign any topic in a forum. Possible values are: NONE
        * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanUnassignTopic: js.UndefOr[String] = js.native
      
      /**
        * Permission to unmark any post from a favorite reply. Possible values are:
        * NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
        */
      var whoCanUnmarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
      
      /**
        * Permissions to view group. Possible values are: ANYONE_CAN_VIEW
        * ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW
        * ALL_OWNERS_CAN_VIEW
        */
      var whoCanViewGroup: js.UndefOr[String] = js.native
      
      /**
        * Permissions to view membership. Possible values are:
        * ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW
        * ALL_OWNERS_CAN_VIEW
        */
      var whoCanViewMembership: js.UndefOr[String] = js.native
    }
    object SchemaGroups {
      
      @scala.inline
      def apply(): SchemaGroups = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGroups]
      }
      
      @scala.inline
      implicit class SchemaGroupsMutableBuilder[Self <: SchemaGroups] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowExternalMembers(value: String): Self = StObject.set(x, "allowExternalMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowExternalMembersUndefined: Self = StObject.set(x, "allowExternalMembers", js.undefined)
        
        @scala.inline
        def setAllowGoogleCommunication(value: String): Self = StObject.set(x, "allowGoogleCommunication", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowGoogleCommunicationUndefined: Self = StObject.set(x, "allowGoogleCommunication", js.undefined)
        
        @scala.inline
        def setAllowWebPosting(value: String): Self = StObject.set(x, "allowWebPosting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowWebPostingUndefined: Self = StObject.set(x, "allowWebPosting", js.undefined)
        
        @scala.inline
        def setArchiveOnly(value: String): Self = StObject.set(x, "archiveOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArchiveOnlyUndefined: Self = StObject.set(x, "archiveOnly", js.undefined)
        
        @scala.inline
        def setCustomFooterText(value: String): Self = StObject.set(x, "customFooterText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomFooterTextUndefined: Self = StObject.set(x, "customFooterText", js.undefined)
        
        @scala.inline
        def setCustomReplyTo(value: String): Self = StObject.set(x, "customReplyTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomReplyToUndefined: Self = StObject.set(x, "customReplyTo", js.undefined)
        
        @scala.inline
        def setCustomRolesEnabledForSettingsToBeMerged(value: String): Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomRolesEnabledForSettingsToBeMergedUndefined: Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", js.undefined)
        
        @scala.inline
        def setDefaultMessageDenyNotificationText(value: String): Self = StObject.set(x, "defaultMessageDenyNotificationText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultMessageDenyNotificationTextUndefined: Self = StObject.set(x, "defaultMessageDenyNotificationText", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setEnableCollaborativeInbox(value: String): Self = StObject.set(x, "enableCollaborativeInbox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableCollaborativeInboxUndefined: Self = StObject.set(x, "enableCollaborativeInbox", js.undefined)
        
        @scala.inline
        def setFavoriteRepliesOnTop(value: String): Self = StObject.set(x, "favoriteRepliesOnTop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFavoriteRepliesOnTopUndefined: Self = StObject.set(x, "favoriteRepliesOnTop", js.undefined)
        
        @scala.inline
        def setIncludeCustomFooter(value: String): Self = StObject.set(x, "includeCustomFooter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeCustomFooterUndefined: Self = StObject.set(x, "includeCustomFooter", js.undefined)
        
        @scala.inline
        def setIncludeInGlobalAddressList(value: String): Self = StObject.set(x, "includeInGlobalAddressList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeInGlobalAddressListUndefined: Self = StObject.set(x, "includeInGlobalAddressList", js.undefined)
        
        @scala.inline
        def setIsArchived(value: String): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMaxMessageBytes(value: Double): Self = StObject.set(x, "maxMessageBytes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxMessageBytesUndefined: Self = StObject.set(x, "maxMessageBytes", js.undefined)
        
        @scala.inline
        def setMembersCanPostAsTheGroup(value: String): Self = StObject.set(x, "membersCanPostAsTheGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMembersCanPostAsTheGroupUndefined: Self = StObject.set(x, "membersCanPostAsTheGroup", js.undefined)
        
        @scala.inline
        def setMessageDisplayFont(value: String): Self = StObject.set(x, "messageDisplayFont", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageDisplayFontUndefined: Self = StObject.set(x, "messageDisplayFont", js.undefined)
        
        @scala.inline
        def setMessageModerationLevel(value: String): Self = StObject.set(x, "messageModerationLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageModerationLevelUndefined: Self = StObject.set(x, "messageModerationLevel", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPrimaryLanguage(value: String): Self = StObject.set(x, "primaryLanguage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryLanguageUndefined: Self = StObject.set(x, "primaryLanguage", js.undefined)
        
        @scala.inline
        def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
        
        @scala.inline
        def setSendMessageDenyNotification(value: String): Self = StObject.set(x, "sendMessageDenyNotification", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSendMessageDenyNotificationUndefined: Self = StObject.set(x, "sendMessageDenyNotification", js.undefined)
        
        @scala.inline
        def setShowInGroupDirectory(value: String): Self = StObject.set(x, "showInGroupDirectory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowInGroupDirectoryUndefined: Self = StObject.set(x, "showInGroupDirectory", js.undefined)
        
        @scala.inline
        def setSpamModerationLevel(value: String): Self = StObject.set(x, "spamModerationLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpamModerationLevelUndefined: Self = StObject.set(x, "spamModerationLevel", js.undefined)
        
        @scala.inline
        def setWhoCanAdd(value: String): Self = StObject.set(x, "whoCanAdd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAddReferences(value: String): Self = StObject.set(x, "whoCanAddReferences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAddReferencesUndefined: Self = StObject.set(x, "whoCanAddReferences", js.undefined)
        
        @scala.inline
        def setWhoCanAddUndefined: Self = StObject.set(x, "whoCanAdd", js.undefined)
        
        @scala.inline
        def setWhoCanApproveMembers(value: String): Self = StObject.set(x, "whoCanApproveMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanApproveMembersUndefined: Self = StObject.set(x, "whoCanApproveMembers", js.undefined)
        
        @scala.inline
        def setWhoCanApproveMessages(value: String): Self = StObject.set(x, "whoCanApproveMessages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanApproveMessagesUndefined: Self = StObject.set(x, "whoCanApproveMessages", js.undefined)
        
        @scala.inline
        def setWhoCanAssignTopics(value: String): Self = StObject.set(x, "whoCanAssignTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAssignTopicsUndefined: Self = StObject.set(x, "whoCanAssignTopics", js.undefined)
        
        @scala.inline
        def setWhoCanAssistContent(value: String): Self = StObject.set(x, "whoCanAssistContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAssistContentUndefined: Self = StObject.set(x, "whoCanAssistContent", js.undefined)
        
        @scala.inline
        def setWhoCanBanUsers(value: String): Self = StObject.set(x, "whoCanBanUsers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanBanUsersUndefined: Self = StObject.set(x, "whoCanBanUsers", js.undefined)
        
        @scala.inline
        def setWhoCanContactOwner(value: String): Self = StObject.set(x, "whoCanContactOwner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanContactOwnerUndefined: Self = StObject.set(x, "whoCanContactOwner", js.undefined)
        
        @scala.inline
        def setWhoCanDeleteAnyPost(value: String): Self = StObject.set(x, "whoCanDeleteAnyPost", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanDeleteAnyPostUndefined: Self = StObject.set(x, "whoCanDeleteAnyPost", js.undefined)
        
        @scala.inline
        def setWhoCanDeleteTopics(value: String): Self = StObject.set(x, "whoCanDeleteTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanDeleteTopicsUndefined: Self = StObject.set(x, "whoCanDeleteTopics", js.undefined)
        
        @scala.inline
        def setWhoCanDiscoverGroup(value: String): Self = StObject.set(x, "whoCanDiscoverGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanDiscoverGroupUndefined: Self = StObject.set(x, "whoCanDiscoverGroup", js.undefined)
        
        @scala.inline
        def setWhoCanEnterFreeFormTags(value: String): Self = StObject.set(x, "whoCanEnterFreeFormTags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanEnterFreeFormTagsUndefined: Self = StObject.set(x, "whoCanEnterFreeFormTags", js.undefined)
        
        @scala.inline
        def setWhoCanHideAbuse(value: String): Self = StObject.set(x, "whoCanHideAbuse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanHideAbuseUndefined: Self = StObject.set(x, "whoCanHideAbuse", js.undefined)
        
        @scala.inline
        def setWhoCanInvite(value: String): Self = StObject.set(x, "whoCanInvite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanInviteUndefined: Self = StObject.set(x, "whoCanInvite", js.undefined)
        
        @scala.inline
        def setWhoCanJoin(value: String): Self = StObject.set(x, "whoCanJoin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanJoinUndefined: Self = StObject.set(x, "whoCanJoin", js.undefined)
        
        @scala.inline
        def setWhoCanLeaveGroup(value: String): Self = StObject.set(x, "whoCanLeaveGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanLeaveGroupUndefined: Self = StObject.set(x, "whoCanLeaveGroup", js.undefined)
        
        @scala.inline
        def setWhoCanLockTopics(value: String): Self = StObject.set(x, "whoCanLockTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanLockTopicsUndefined: Self = StObject.set(x, "whoCanLockTopics", js.undefined)
        
        @scala.inline
        def setWhoCanMakeTopicsSticky(value: String): Self = StObject.set(x, "whoCanMakeTopicsSticky", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMakeTopicsStickyUndefined: Self = StObject.set(x, "whoCanMakeTopicsSticky", js.undefined)
        
        @scala.inline
        def setWhoCanMarkDuplicate(value: String): Self = StObject.set(x, "whoCanMarkDuplicate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkDuplicateUndefined: Self = StObject.set(x, "whoCanMarkDuplicate", js.undefined)
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", js.undefined)
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnOwnTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnOwnTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", js.undefined)
        
        @scala.inline
        def setWhoCanMarkNoResponseNeeded(value: String): Self = StObject.set(x, "whoCanMarkNoResponseNeeded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkNoResponseNeededUndefined: Self = StObject.set(x, "whoCanMarkNoResponseNeeded", js.undefined)
        
        @scala.inline
        def setWhoCanModerateContent(value: String): Self = StObject.set(x, "whoCanModerateContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModerateContentUndefined: Self = StObject.set(x, "whoCanModerateContent", js.undefined)
        
        @scala.inline
        def setWhoCanModerateMembers(value: String): Self = StObject.set(x, "whoCanModerateMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModerateMembersUndefined: Self = StObject.set(x, "whoCanModerateMembers", js.undefined)
        
        @scala.inline
        def setWhoCanModifyMembers(value: String): Self = StObject.set(x, "whoCanModifyMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModifyMembersUndefined: Self = StObject.set(x, "whoCanModifyMembers", js.undefined)
        
        @scala.inline
        def setWhoCanModifyTagsAndCategories(value: String): Self = StObject.set(x, "whoCanModifyTagsAndCategories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModifyTagsAndCategoriesUndefined: Self = StObject.set(x, "whoCanModifyTagsAndCategories", js.undefined)
        
        @scala.inline
        def setWhoCanMoveTopicsIn(value: String): Self = StObject.set(x, "whoCanMoveTopicsIn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMoveTopicsInUndefined: Self = StObject.set(x, "whoCanMoveTopicsIn", js.undefined)
        
        @scala.inline
        def setWhoCanMoveTopicsOut(value: String): Self = StObject.set(x, "whoCanMoveTopicsOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMoveTopicsOutUndefined: Self = StObject.set(x, "whoCanMoveTopicsOut", js.undefined)
        
        @scala.inline
        def setWhoCanPostAnnouncements(value: String): Self = StObject.set(x, "whoCanPostAnnouncements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanPostAnnouncementsUndefined: Self = StObject.set(x, "whoCanPostAnnouncements", js.undefined)
        
        @scala.inline
        def setWhoCanPostMessage(value: String): Self = StObject.set(x, "whoCanPostMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanPostMessageUndefined: Self = StObject.set(x, "whoCanPostMessage", js.undefined)
        
        @scala.inline
        def setWhoCanTakeTopics(value: String): Self = StObject.set(x, "whoCanTakeTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanTakeTopicsUndefined: Self = StObject.set(x, "whoCanTakeTopics", js.undefined)
        
        @scala.inline
        def setWhoCanUnassignTopic(value: String): Self = StObject.set(x, "whoCanUnassignTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanUnassignTopicUndefined: Self = StObject.set(x, "whoCanUnassignTopic", js.undefined)
        
        @scala.inline
        def setWhoCanUnmarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanUnmarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", js.undefined)
        
        @scala.inline
        def setWhoCanViewGroup(value: String): Self = StObject.set(x, "whoCanViewGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanViewGroupUndefined: Self = StObject.set(x, "whoCanViewGroup", js.undefined)
        
        @scala.inline
        def setWhoCanViewMembership(value: String): Self = StObject.set(x, "whoCanViewMembership", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanViewMembershipUndefined: Self = StObject.set(x, "whoCanViewMembership", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.native
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
