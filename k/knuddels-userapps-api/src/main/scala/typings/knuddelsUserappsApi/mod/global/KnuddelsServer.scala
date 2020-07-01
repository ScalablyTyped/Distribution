package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.OnPotSealed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html
	 */
@JSGlobal("KnuddelsServer")
@js.native
class KnuddelsServer () extends js.Object

/* static members */
@JSGlobal("KnuddelsServer")
@js.native
object KnuddelsServer extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_createKnuddelPot
  		 */
  def createKnuddelPot(knuddelAmount: KnuddelAmount): KnuddelPot = js.native
  def createKnuddelPot(knuddelAmount: KnuddelAmount, params: OnPotSealed): KnuddelPot = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_execute
  		 */
  def execute(fileName: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAllKnuddelPots
  		 */
  def getAllKnuddelPots(): js.Array[KnuddelPot] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppAccess
  		 */
  def getAppAccess(): AppAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppProfileEntryAccess
  		 */
  def getAppProfileEntryAccess(): AppProfileEntryAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppServerInfo
  		 */
  def getAppServerInfo(): AppServerInfo = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChannel
  		 */
  def getChannel(): Channel = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChatServerInfo
  		 */
  def getChatServerInfo(): ChatServerInfo = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultBotUser
  		 */
  def getDefaultBotUser(): BotUser = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultLogger
  		 */
  def getDefaultLogger(): Logger = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getExternalServerAccess
  		 */
  def getExternalServerAccess(): ExternalServerAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getFullImagePath
  		 */
  def getFullImagePath(imageName: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getFullSystemImagePath
  		 */
  def getFullSystemImagePath(imageName: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getKnuddelPot
  		 */
  def getKnuddelPot(id: Double): KnuddelPot | Null = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPaymentAccess
  		 * @since AppServer 108571, ChatServer 108571
  		 */
  def getPaymentAccess(): PaymentAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPersistence
  		 */
  def getPersistence(): AppPersistence = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getToplistAccess
  		 */
  def getToplistAccess(): ToplistAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getUserAccess
  		 */
  def getUserAccess(): UserAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_listFiles
  		 */
  def listFiles(path: java.lang.String): js.Array[java.lang.String] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_refreshHooks
  		 */
  def refreshHooks(): Unit = js.native
}

