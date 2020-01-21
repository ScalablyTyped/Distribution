package typings.googleapis.groupssettingsV1Mod.groupssettingsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    allowExternalMembers: String = null,
    allowGoogleCommunication: String = null,
    allowWebPosting: String = null,
    archiveOnly: String = null,
    customFooterText: String = null,
    customReplyTo: String = null,
    customRolesEnabledForSettingsToBeMerged: String = null,
    defaultMessageDenyNotificationText: String = null,
    description: String = null,
    email: String = null,
    enableCollaborativeInbox: String = null,
    favoriteRepliesOnTop: String = null,
    includeCustomFooter: String = null,
    includeInGlobalAddressList: String = null,
    isArchived: String = null,
    kind: String = null,
    maxMessageBytes: Int | Double = null,
    membersCanPostAsTheGroup: String = null,
    messageDisplayFont: String = null,
    messageModerationLevel: String = null,
    name: String = null,
    primaryLanguage: String = null,
    replyTo: String = null,
    sendMessageDenyNotification: String = null,
    showInGroupDirectory: String = null,
    spamModerationLevel: String = null,
    whoCanAdd: String = null,
    whoCanAddReferences: String = null,
    whoCanApproveMembers: String = null,
    whoCanApproveMessages: String = null,
    whoCanAssignTopics: String = null,
    whoCanAssistContent: String = null,
    whoCanBanUsers: String = null,
    whoCanContactOwner: String = null,
    whoCanDeleteAnyPost: String = null,
    whoCanDeleteTopics: String = null,
    whoCanDiscoverGroup: String = null,
    whoCanEnterFreeFormTags: String = null,
    whoCanHideAbuse: String = null,
    whoCanInvite: String = null,
    whoCanJoin: String = null,
    whoCanLeaveGroup: String = null,
    whoCanLockTopics: String = null,
    whoCanMakeTopicsSticky: String = null,
    whoCanMarkDuplicate: String = null,
    whoCanMarkFavoriteReplyOnAnyTopic: String = null,
    whoCanMarkFavoriteReplyOnOwnTopic: String = null,
    whoCanMarkNoResponseNeeded: String = null,
    whoCanModerateContent: String = null,
    whoCanModerateMembers: String = null,
    whoCanModifyMembers: String = null,
    whoCanModifyTagsAndCategories: String = null,
    whoCanMoveTopicsIn: String = null,
    whoCanMoveTopicsOut: String = null,
    whoCanPostAnnouncements: String = null,
    whoCanPostMessage: String = null,
    whoCanTakeTopics: String = null,
    whoCanUnassignTopic: String = null,
    whoCanUnmarkFavoriteReplyOnAnyTopic: String = null,
    whoCanViewGroup: String = null,
    whoCanViewMembership: String = null
  ): SchemaGroups = {
    val __obj = js.Dynamic.literal()
    if (allowExternalMembers != null) __obj.updateDynamic("allowExternalMembers")(allowExternalMembers.asInstanceOf[js.Any])
    if (allowGoogleCommunication != null) __obj.updateDynamic("allowGoogleCommunication")(allowGoogleCommunication.asInstanceOf[js.Any])
    if (allowWebPosting != null) __obj.updateDynamic("allowWebPosting")(allowWebPosting.asInstanceOf[js.Any])
    if (archiveOnly != null) __obj.updateDynamic("archiveOnly")(archiveOnly.asInstanceOf[js.Any])
    if (customFooterText != null) __obj.updateDynamic("customFooterText")(customFooterText.asInstanceOf[js.Any])
    if (customReplyTo != null) __obj.updateDynamic("customReplyTo")(customReplyTo.asInstanceOf[js.Any])
    if (customRolesEnabledForSettingsToBeMerged != null) __obj.updateDynamic("customRolesEnabledForSettingsToBeMerged")(customRolesEnabledForSettingsToBeMerged.asInstanceOf[js.Any])
    if (defaultMessageDenyNotificationText != null) __obj.updateDynamic("defaultMessageDenyNotificationText")(defaultMessageDenyNotificationText.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (enableCollaborativeInbox != null) __obj.updateDynamic("enableCollaborativeInbox")(enableCollaborativeInbox.asInstanceOf[js.Any])
    if (favoriteRepliesOnTop != null) __obj.updateDynamic("favoriteRepliesOnTop")(favoriteRepliesOnTop.asInstanceOf[js.Any])
    if (includeCustomFooter != null) __obj.updateDynamic("includeCustomFooter")(includeCustomFooter.asInstanceOf[js.Any])
    if (includeInGlobalAddressList != null) __obj.updateDynamic("includeInGlobalAddressList")(includeInGlobalAddressList.asInstanceOf[js.Any])
    if (isArchived != null) __obj.updateDynamic("isArchived")(isArchived.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxMessageBytes != null) __obj.updateDynamic("maxMessageBytes")(maxMessageBytes.asInstanceOf[js.Any])
    if (membersCanPostAsTheGroup != null) __obj.updateDynamic("membersCanPostAsTheGroup")(membersCanPostAsTheGroup.asInstanceOf[js.Any])
    if (messageDisplayFont != null) __obj.updateDynamic("messageDisplayFont")(messageDisplayFont.asInstanceOf[js.Any])
    if (messageModerationLevel != null) __obj.updateDynamic("messageModerationLevel")(messageModerationLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (primaryLanguage != null) __obj.updateDynamic("primaryLanguage")(primaryLanguage.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sendMessageDenyNotification != null) __obj.updateDynamic("sendMessageDenyNotification")(sendMessageDenyNotification.asInstanceOf[js.Any])
    if (showInGroupDirectory != null) __obj.updateDynamic("showInGroupDirectory")(showInGroupDirectory.asInstanceOf[js.Any])
    if (spamModerationLevel != null) __obj.updateDynamic("spamModerationLevel")(spamModerationLevel.asInstanceOf[js.Any])
    if (whoCanAdd != null) __obj.updateDynamic("whoCanAdd")(whoCanAdd.asInstanceOf[js.Any])
    if (whoCanAddReferences != null) __obj.updateDynamic("whoCanAddReferences")(whoCanAddReferences.asInstanceOf[js.Any])
    if (whoCanApproveMembers != null) __obj.updateDynamic("whoCanApproveMembers")(whoCanApproveMembers.asInstanceOf[js.Any])
    if (whoCanApproveMessages != null) __obj.updateDynamic("whoCanApproveMessages")(whoCanApproveMessages.asInstanceOf[js.Any])
    if (whoCanAssignTopics != null) __obj.updateDynamic("whoCanAssignTopics")(whoCanAssignTopics.asInstanceOf[js.Any])
    if (whoCanAssistContent != null) __obj.updateDynamic("whoCanAssistContent")(whoCanAssistContent.asInstanceOf[js.Any])
    if (whoCanBanUsers != null) __obj.updateDynamic("whoCanBanUsers")(whoCanBanUsers.asInstanceOf[js.Any])
    if (whoCanContactOwner != null) __obj.updateDynamic("whoCanContactOwner")(whoCanContactOwner.asInstanceOf[js.Any])
    if (whoCanDeleteAnyPost != null) __obj.updateDynamic("whoCanDeleteAnyPost")(whoCanDeleteAnyPost.asInstanceOf[js.Any])
    if (whoCanDeleteTopics != null) __obj.updateDynamic("whoCanDeleteTopics")(whoCanDeleteTopics.asInstanceOf[js.Any])
    if (whoCanDiscoverGroup != null) __obj.updateDynamic("whoCanDiscoverGroup")(whoCanDiscoverGroup.asInstanceOf[js.Any])
    if (whoCanEnterFreeFormTags != null) __obj.updateDynamic("whoCanEnterFreeFormTags")(whoCanEnterFreeFormTags.asInstanceOf[js.Any])
    if (whoCanHideAbuse != null) __obj.updateDynamic("whoCanHideAbuse")(whoCanHideAbuse.asInstanceOf[js.Any])
    if (whoCanInvite != null) __obj.updateDynamic("whoCanInvite")(whoCanInvite.asInstanceOf[js.Any])
    if (whoCanJoin != null) __obj.updateDynamic("whoCanJoin")(whoCanJoin.asInstanceOf[js.Any])
    if (whoCanLeaveGroup != null) __obj.updateDynamic("whoCanLeaveGroup")(whoCanLeaveGroup.asInstanceOf[js.Any])
    if (whoCanLockTopics != null) __obj.updateDynamic("whoCanLockTopics")(whoCanLockTopics.asInstanceOf[js.Any])
    if (whoCanMakeTopicsSticky != null) __obj.updateDynamic("whoCanMakeTopicsSticky")(whoCanMakeTopicsSticky.asInstanceOf[js.Any])
    if (whoCanMarkDuplicate != null) __obj.updateDynamic("whoCanMarkDuplicate")(whoCanMarkDuplicate.asInstanceOf[js.Any])
    if (whoCanMarkFavoriteReplyOnAnyTopic != null) __obj.updateDynamic("whoCanMarkFavoriteReplyOnAnyTopic")(whoCanMarkFavoriteReplyOnAnyTopic.asInstanceOf[js.Any])
    if (whoCanMarkFavoriteReplyOnOwnTopic != null) __obj.updateDynamic("whoCanMarkFavoriteReplyOnOwnTopic")(whoCanMarkFavoriteReplyOnOwnTopic.asInstanceOf[js.Any])
    if (whoCanMarkNoResponseNeeded != null) __obj.updateDynamic("whoCanMarkNoResponseNeeded")(whoCanMarkNoResponseNeeded.asInstanceOf[js.Any])
    if (whoCanModerateContent != null) __obj.updateDynamic("whoCanModerateContent")(whoCanModerateContent.asInstanceOf[js.Any])
    if (whoCanModerateMembers != null) __obj.updateDynamic("whoCanModerateMembers")(whoCanModerateMembers.asInstanceOf[js.Any])
    if (whoCanModifyMembers != null) __obj.updateDynamic("whoCanModifyMembers")(whoCanModifyMembers.asInstanceOf[js.Any])
    if (whoCanModifyTagsAndCategories != null) __obj.updateDynamic("whoCanModifyTagsAndCategories")(whoCanModifyTagsAndCategories.asInstanceOf[js.Any])
    if (whoCanMoveTopicsIn != null) __obj.updateDynamic("whoCanMoveTopicsIn")(whoCanMoveTopicsIn.asInstanceOf[js.Any])
    if (whoCanMoveTopicsOut != null) __obj.updateDynamic("whoCanMoveTopicsOut")(whoCanMoveTopicsOut.asInstanceOf[js.Any])
    if (whoCanPostAnnouncements != null) __obj.updateDynamic("whoCanPostAnnouncements")(whoCanPostAnnouncements.asInstanceOf[js.Any])
    if (whoCanPostMessage != null) __obj.updateDynamic("whoCanPostMessage")(whoCanPostMessage.asInstanceOf[js.Any])
    if (whoCanTakeTopics != null) __obj.updateDynamic("whoCanTakeTopics")(whoCanTakeTopics.asInstanceOf[js.Any])
    if (whoCanUnassignTopic != null) __obj.updateDynamic("whoCanUnassignTopic")(whoCanUnassignTopic.asInstanceOf[js.Any])
    if (whoCanUnmarkFavoriteReplyOnAnyTopic != null) __obj.updateDynamic("whoCanUnmarkFavoriteReplyOnAnyTopic")(whoCanUnmarkFavoriteReplyOnAnyTopic.asInstanceOf[js.Any])
    if (whoCanViewGroup != null) __obj.updateDynamic("whoCanViewGroup")(whoCanViewGroup.asInstanceOf[js.Any])
    if (whoCanViewMembership != null) __obj.updateDynamic("whoCanViewMembership")(whoCanViewMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroups]
  }
}

