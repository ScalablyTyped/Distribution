package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html
	 */
@JSGlobal("KnuddelsServer")
@js.native
class KnuddelsServer () extends js.Object

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html
	 */
@JSGlobal("KnuddelsServer")
@js.native
object KnuddelsServer extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_createKnuddelPot
  		 */
  def createKnuddelPot(knuddelAmount: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelAmount): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_createKnuddelPot
  		 */
  def createKnuddelPot(
    knuddelAmount: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelAmount,
    params: knuddelsDashUserappsDashApiLib.Anon_OnPotSealed
  ): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_execute
  		 */
  def execute(fileName: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAllKnuddelPots
  		 */
  def getAllKnuddelPots(): js.Array[knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppAccess
  		 */
  def getAppAccess(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppProfileEntryAccess
  		 */
  def getAppProfileEntryAccess(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppProfileEntryAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppServerInfo
  		 */
  def getAppServerInfo(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppServerInfo = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChannel
  		 */
  def getChannel(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Channel = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChatServerInfo
  		 */
  def getChatServerInfo(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ChatServerInfo = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultBotUser
  		 */
  def getDefaultBotUser(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.BotUser = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultLogger
  		 */
  def getDefaultLogger(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Logger = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getExternalServerAccess
  		 */
  def getExternalServerAccess(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ExternalServerAccess = js.native
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
  def getKnuddelPot(id: scala.Double): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelPot | scala.Null = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPaymentAccess
  		 * @since AppServer 108571, ChatServer 108571
  		 */
  def getPaymentAccess(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.PaymentAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPersistence
  		 */
  def getPersistence(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppPersistence = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getToplistAccess
  		 */
  def getToplistAccess(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ToplistAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getUserAccess
  		 */
  def getUserAccess(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.UserAccess = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_listFiles
  		 */
  def listFiles(path: java.lang.String): js.Array[java.lang.String] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_refreshHooks
  		 */
  def refreshHooks(): scala.Unit = js.native
}

