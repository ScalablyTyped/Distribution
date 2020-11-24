package typings.googleapis.groupssettingsV1Mod.groupssettingsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Group resource
  */
@js.native
trait SchemaGroups extends js.Object {
  
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
  implicit class SchemaGroupsOps[Self <: SchemaGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowExternalMembers(value: String): Self = this.set("allowExternalMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExternalMembers: Self = this.set("allowExternalMembers", js.undefined)
    
    @scala.inline
    def setAllowGoogleCommunication(value: String): Self = this.set("allowGoogleCommunication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGoogleCommunication: Self = this.set("allowGoogleCommunication", js.undefined)
    
    @scala.inline
    def setAllowWebPosting(value: String): Self = this.set("allowWebPosting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWebPosting: Self = this.set("allowWebPosting", js.undefined)
    
    @scala.inline
    def setArchiveOnly(value: String): Self = this.set("archiveOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveOnly: Self = this.set("archiveOnly", js.undefined)
    
    @scala.inline
    def setCustomFooterText(value: String): Self = this.set("customFooterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFooterText: Self = this.set("customFooterText", js.undefined)
    
    @scala.inline
    def setCustomReplyTo(value: String): Self = this.set("customReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomReplyTo: Self = this.set("customReplyTo", js.undefined)
    
    @scala.inline
    def setCustomRolesEnabledForSettingsToBeMerged(value: String): Self = this.set("customRolesEnabledForSettingsToBeMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRolesEnabledForSettingsToBeMerged: Self = this.set("customRolesEnabledForSettingsToBeMerged", js.undefined)
    
    @scala.inline
    def setDefaultMessageDenyNotificationText(value: String): Self = this.set("defaultMessageDenyNotificationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessageDenyNotificationText: Self = this.set("defaultMessageDenyNotificationText", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEnableCollaborativeInbox(value: String): Self = this.set("enableCollaborativeInbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCollaborativeInbox: Self = this.set("enableCollaborativeInbox", js.undefined)
    
    @scala.inline
    def setFavoriteRepliesOnTop(value: String): Self = this.set("favoriteRepliesOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavoriteRepliesOnTop: Self = this.set("favoriteRepliesOnTop", js.undefined)
    
    @scala.inline
    def setIncludeCustomFooter(value: String): Self = this.set("includeCustomFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCustomFooter: Self = this.set("includeCustomFooter", js.undefined)
    
    @scala.inline
    def setIncludeInGlobalAddressList(value: String): Self = this.set("includeInGlobalAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInGlobalAddressList: Self = this.set("includeInGlobalAddressList", js.undefined)
    
    @scala.inline
    def setIsArchived(value: String): Self = this.set("isArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArchived: Self = this.set("isArchived", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMaxMessageBytes(value: Double): Self = this.set("maxMessageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMessageBytes: Self = this.set("maxMessageBytes", js.undefined)
    
    @scala.inline
    def setMembersCanPostAsTheGroup(value: String): Self = this.set("membersCanPostAsTheGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembersCanPostAsTheGroup: Self = this.set("membersCanPostAsTheGroup", js.undefined)
    
    @scala.inline
    def setMessageDisplayFont(value: String): Self = this.set("messageDisplayFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDisplayFont: Self = this.set("messageDisplayFont", js.undefined)
    
    @scala.inline
    def setMessageModerationLevel(value: String): Self = this.set("messageModerationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageModerationLevel: Self = this.set("messageModerationLevel", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrimaryLanguage(value: String): Self = this.set("primaryLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryLanguage: Self = this.set("primaryLanguage", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    
    @scala.inline
    def setSendMessageDenyNotification(value: String): Self = this.set("sendMessageDenyNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendMessageDenyNotification: Self = this.set("sendMessageDenyNotification", js.undefined)
    
    @scala.inline
    def setShowInGroupDirectory(value: String): Self = this.set("showInGroupDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInGroupDirectory: Self = this.set("showInGroupDirectory", js.undefined)
    
    @scala.inline
    def setSpamModerationLevel(value: String): Self = this.set("spamModerationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpamModerationLevel: Self = this.set("spamModerationLevel", js.undefined)
    
    @scala.inline
    def setWhoCanAdd(value: String): Self = this.set("whoCanAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanAdd: Self = this.set("whoCanAdd", js.undefined)
    
    @scala.inline
    def setWhoCanAddReferences(value: String): Self = this.set("whoCanAddReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanAddReferences: Self = this.set("whoCanAddReferences", js.undefined)
    
    @scala.inline
    def setWhoCanApproveMembers(value: String): Self = this.set("whoCanApproveMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanApproveMembers: Self = this.set("whoCanApproveMembers", js.undefined)
    
    @scala.inline
    def setWhoCanApproveMessages(value: String): Self = this.set("whoCanApproveMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanApproveMessages: Self = this.set("whoCanApproveMessages", js.undefined)
    
    @scala.inline
    def setWhoCanAssignTopics(value: String): Self = this.set("whoCanAssignTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanAssignTopics: Self = this.set("whoCanAssignTopics", js.undefined)
    
    @scala.inline
    def setWhoCanAssistContent(value: String): Self = this.set("whoCanAssistContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanAssistContent: Self = this.set("whoCanAssistContent", js.undefined)
    
    @scala.inline
    def setWhoCanBanUsers(value: String): Self = this.set("whoCanBanUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanBanUsers: Self = this.set("whoCanBanUsers", js.undefined)
    
    @scala.inline
    def setWhoCanContactOwner(value: String): Self = this.set("whoCanContactOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanContactOwner: Self = this.set("whoCanContactOwner", js.undefined)
    
    @scala.inline
    def setWhoCanDeleteAnyPost(value: String): Self = this.set("whoCanDeleteAnyPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanDeleteAnyPost: Self = this.set("whoCanDeleteAnyPost", js.undefined)
    
    @scala.inline
    def setWhoCanDeleteTopics(value: String): Self = this.set("whoCanDeleteTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanDeleteTopics: Self = this.set("whoCanDeleteTopics", js.undefined)
    
    @scala.inline
    def setWhoCanDiscoverGroup(value: String): Self = this.set("whoCanDiscoverGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanDiscoverGroup: Self = this.set("whoCanDiscoverGroup", js.undefined)
    
    @scala.inline
    def setWhoCanEnterFreeFormTags(value: String): Self = this.set("whoCanEnterFreeFormTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanEnterFreeFormTags: Self = this.set("whoCanEnterFreeFormTags", js.undefined)
    
    @scala.inline
    def setWhoCanHideAbuse(value: String): Self = this.set("whoCanHideAbuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanHideAbuse: Self = this.set("whoCanHideAbuse", js.undefined)
    
    @scala.inline
    def setWhoCanInvite(value: String): Self = this.set("whoCanInvite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanInvite: Self = this.set("whoCanInvite", js.undefined)
    
    @scala.inline
    def setWhoCanJoin(value: String): Self = this.set("whoCanJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanJoin: Self = this.set("whoCanJoin", js.undefined)
    
    @scala.inline
    def setWhoCanLeaveGroup(value: String): Self = this.set("whoCanLeaveGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanLeaveGroup: Self = this.set("whoCanLeaveGroup", js.undefined)
    
    @scala.inline
    def setWhoCanLockTopics(value: String): Self = this.set("whoCanLockTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanLockTopics: Self = this.set("whoCanLockTopics", js.undefined)
    
    @scala.inline
    def setWhoCanMakeTopicsSticky(value: String): Self = this.set("whoCanMakeTopicsSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanMakeTopicsSticky: Self = this.set("whoCanMakeTopicsSticky", js.undefined)
    
    @scala.inline
    def setWhoCanMarkDuplicate(value: String): Self = this.set("whoCanMarkDuplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanMarkDuplicate: Self = this.set("whoCanMarkDuplicate", js.undefined)
    
    @scala.inline
    def setWhoCanMarkFavoriteReplyOnAnyTopic(value: String): Self = this.set("whoCanMarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanMarkFavoriteReplyOnAnyTopic: Self = this.set("whoCanMarkFavoriteReplyOnAnyTopic", js.undefined)
    
    @scala.inline
    def setWhoCanMarkFavoriteReplyOnOwnTopic(value: String): Self = this.set("whoCanMarkFavoriteReplyOnOwnTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanMarkFavoriteReplyOnOwnTopic: Self = this.set("whoCanMarkFavoriteReplyOnOwnTopic", js.undefined)
    
    @scala.inline
    def setWhoCanMarkNoResponseNeeded(value: String): Self = this.set("whoCanMarkNoResponseNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanMarkNoResponseNeeded: Self = this.set("whoCanMarkNoResponseNeeded", js.undefined)
    
    @scala.inline
    def setWhoCanModerateContent(value: String): Self = this.set("whoCanModerateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanModerateContent: Self = this.set("whoCanModerateContent", js.undefined)
    
    @scala.inline
    def setWhoCanModerateMembers(value: String): Self = this.set("whoCanModerateMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanModerateMembers: Self = this.set("whoCanModerateMembers", js.undefined)
    
    @scala.inline
    def setWhoCanModifyMembers(value: String): Self = this.set("whoCanModifyMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanModifyMembers: Self = this.set("whoCanModifyMembers", js.undefined)
    
    @scala.inline
    def setWhoCanModifyTagsAndCategories(value: String): Self = this.set("whoCanModifyTagsAndCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanModifyTagsAndCategories: Self = this.set("whoCanModifyTagsAndCategories", js.undefined)
    
    @scala.inline
    def setWhoCanMoveTopicsIn(value: String): Self = this.set("whoCanMoveTopicsIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanMoveTopicsIn: Self = this.set("whoCanMoveTopicsIn", js.undefined)
    
    @scala.inline
    def setWhoCanMoveTopicsOut(value: String): Self = this.set("whoCanMoveTopicsOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanMoveTopicsOut: Self = this.set("whoCanMoveTopicsOut", js.undefined)
    
    @scala.inline
    def setWhoCanPostAnnouncements(value: String): Self = this.set("whoCanPostAnnouncements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanPostAnnouncements: Self = this.set("whoCanPostAnnouncements", js.undefined)
    
    @scala.inline
    def setWhoCanPostMessage(value: String): Self = this.set("whoCanPostMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanPostMessage: Self = this.set("whoCanPostMessage", js.undefined)
    
    @scala.inline
    def setWhoCanTakeTopics(value: String): Self = this.set("whoCanTakeTopics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanTakeTopics: Self = this.set("whoCanTakeTopics", js.undefined)
    
    @scala.inline
    def setWhoCanUnassignTopic(value: String): Self = this.set("whoCanUnassignTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanUnassignTopic: Self = this.set("whoCanUnassignTopic", js.undefined)
    
    @scala.inline
    def setWhoCanUnmarkFavoriteReplyOnAnyTopic(value: String): Self = this.set("whoCanUnmarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanUnmarkFavoriteReplyOnAnyTopic: Self = this.set("whoCanUnmarkFavoriteReplyOnAnyTopic", js.undefined)
    
    @scala.inline
    def setWhoCanViewGroup(value: String): Self = this.set("whoCanViewGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanViewGroup: Self = this.set("whoCanViewGroup", js.undefined)
    
    @scala.inline
    def setWhoCanViewMembership(value: String): Self = this.set("whoCanViewMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoCanViewMembership: Self = this.set("whoCanViewMembership", js.undefined)
  }
}
