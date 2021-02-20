package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.mod._KnuddelsSerializable
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/User.html
	 */
@JSGlobal("User")
@js.native
class User () extends _KnuddelsSerializable {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_addNicklistIcon
  		 */
  def addNicklistIcon(imagePath: java.lang.String, imageWidth: Double): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_canSendAppContent
  		 */
  def canSendAppContent(appContent: AppContent): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_canShowAppViewMode
  		 */
  def canShowAppViewMode(mode: AppViewMode): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_equals
  		 */
  def equals(user: User): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getAge
  		 */
  def getAge(): Double = js.native
  
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
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getLastOnlineTime
  		 */
  def getLastOnlineTime(): Date = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getNick
  		 */
  def getNick(): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getOnlineMinutes
  		 */
  def getOnlineMinutes(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getPersistence
  		 */
  def getPersistence(): UserPersistence = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getProfileLink
  		 */
  def getProfileLink(): java.lang.String = js.native
  def getProfileLink(displayText: java.lang.String): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getProfilePhoto
  		 */
  def getProfilePhoto(width: Double, height: Double): java.lang.String = js.native
  
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
  def getRegDate(): Date = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_getUserId
  		 */
  def getUserId(): Double = js.native
  
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
  def hasProfilePhoto(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAgeVerified
  		 */
  def isAgeVerified(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAppDeveloper
  		 */
  def isAppDeveloper(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAppManager
  		 */
  def isAppManager(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isAway
  		 */
  def isAway(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isChannelCoreUser
  		 * @since AppServer 92701, ChatServer 92701
  		 */
  def isChannelCoreUser(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isChannelModerator
  		 */
  def isChannelModerator(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isChannelOwner
  		 */
  def isChannelOwner(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isColorMuted
  		 */
  def isColorMuted(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isEventModerator
  		 */
  def isEventModerator(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isInTeam
  		 */
  def isInTeam(teamName: java.lang.String): Boolean = js.native
  def isInTeam(teamName: java.lang.String, subTeamName: java.lang.String): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isLikingChannel
  		 */
  def isLikingChannel(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isLocked
  		 */
  def isLocked(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isMuted
  		 */
  def isMuted(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isOnline
  		 */
  def isOnline(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isOnlineInChannel
  		 */
  def isOnlineInChannel(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isProfilePhotoVerified
  		 */
  def isProfilePhotoVerified(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_isStreamingVideo
  		 */
  def isStreamingVideo(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_removeNicklistIcon
  		 */
  def removeNicklistIcon(imagePath: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_sendAppContent
  		 */
  def sendAppContent(appContent: AppContent): AppContentSession = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_sendPostMessage
  		 */
  def sendPostMessage(topic: java.lang.String, text: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_sendPrivateMessage
  		 */
  def sendPrivateMessage(message: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/User.html#method_triggerDice
  		 * @since AppServer 89159, ChatServer 89159
  		 */
  def triggerDice(diceConfiguration: DiceConfiguration): Unit = js.native
}
