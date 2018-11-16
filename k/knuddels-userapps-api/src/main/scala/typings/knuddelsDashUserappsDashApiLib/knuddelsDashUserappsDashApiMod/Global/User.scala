package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/User.html
	 */
@JSGlobal("User")
@js.native
class User () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_addNicklistIcon
  		 */
  def addNicklistIcon(imagePath: java.lang.String, imageWidth: scala.Double): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_canSendAppContent
  		 */
  def canSendAppContent(appContent: AppContent): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_canShowAppViewMode
  		 */
  def canShowAppViewMode(mode: AppViewMode): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_equals
  		 */
  def equals(user: User): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getAge
  		 */
  def getAge(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getAppContentSession
  		 */
  def getAppContentSession(appViewMode: AppViewMode): AppContentSession = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getAppContentSessions
  		 */
  def getAppContentSessions(): js.Array[AppContentSession] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getAuthenticityClassification
  		 * @since AppServer 94663, ChatServer 94663
  		 */
  def getAuthenticityClassification(): AuthenticityClassification = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getChannelTalkPermission
  		 */
  def getChannelTalkPermission(): ChannelTalkPermission = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getClientType
  		 */
  def getClientType(): ClientType = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getGender
  		 */
  def getGender(): Gender = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getKnuddelAccount
  		 */
  def getKnuddelAccount(): KnuddelAccount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getKnuddelAmount
  		 */
  def getKnuddelAmount(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getNick
  		 */
  def getNick(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getOnlineMinutes
  		 */
  def getOnlineMinutes(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getPersistence
  		 */
  def getPersistence(): UserPersistence = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getProfileLink
  		 */
  def getProfileLink(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getProfileLink
  		 */
  def getProfileLink(displayText: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getProfilePhoto
  		 */
  def getProfilePhoto(width: scala.Double, height: scala.Double): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getQuestAccess
  		 * @since AppServer 82290, ChatServer 82290
  		 */
  def getQuestAccess(): QuestAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getReadme
  		 */
  def getReadme(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getRegDate
  		 */
  def getRegDate(): stdLib.Date = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getUserId
  		 */
  def getUserId(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getUserStatus
  		 */
  def getUserStatus(): UserStatus = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getUserType
  		 */
  def getUserType(): UserType = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_hasProfilePhoto
  		 */
  def hasProfilePhoto(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAgeVerified
  		 */
  def isAgeVerified(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAppDeveloper
  		 */
  def isAppDeveloper(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAppManager
  		 */
  def isAppManager(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAway
  		 */
  def isAway(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isChannelCoreUser
  		 * @since AppServer 92701, ChatServer 92701
  		 */
  def isChannelCoreUser(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isChannelModerator
  		 */
  def isChannelModerator(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isChannelOwner
  		 */
  def isChannelOwner(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isColorMuted
  		 */
  def isColorMuted(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isEventModerator
  		 */
  def isEventModerator(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isInTeam
  		 */
  def isInTeam(teamName: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isInTeam
  		 */
  def isInTeam(teamName: java.lang.String, subTeamName: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isLikingChannel
  		 */
  def isLikingChannel(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isLocked
  		 */
  def isLocked(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isMuted
  		 */
  def isMuted(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isOnline
  		 */
  def isOnline(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isOnlineInChannel
  		 */
  def isOnlineInChannel(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isProfilePhotoVerified
  		 */
  def isProfilePhotoVerified(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isStreamingVideo
  		 */
  def isStreamingVideo(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_removeNicklistIcon
  		 */
  def removeNicklistIcon(imagePath: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_sendAppContent
  		 */
  def sendAppContent(appContent: AppContent): AppContentSession = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_sendPostMessage
  		 */
  def sendPostMessage(topic: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_sendPrivateMessage
  		 */
  def sendPrivateMessage(message: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_triggerDice
  		 * @since AppServer 89159, ChatServer 89159
  		 */
  def triggerDice(diceConfiguration: DiceConfiguration): scala.Unit = js.native
}

