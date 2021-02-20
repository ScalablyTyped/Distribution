package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.OnPotSealed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html
	 */
@JSGlobal("KnuddelsServer")
@js.native
class KnuddelsServer () extends StObject
object KnuddelsServer {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_createKnuddelPot
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.createKnuddelPot")
  @js.native
  def createKnuddelPot(knuddelAmount: KnuddelAmount): KnuddelPot = js.native
  @JSGlobal("KnuddelsServer.createKnuddelPot")
  @js.native
  def createKnuddelPot(knuddelAmount: KnuddelAmount, params: OnPotSealed): KnuddelPot = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_execute
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.execute")
  @js.native
  def execute(fileName: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAllKnuddelPots
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getAllKnuddelPots")
  @js.native
  def getAllKnuddelPots(): js.Array[KnuddelPot] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppAccess
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getAppAccess")
  @js.native
  def getAppAccess(): AppAccess = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppProfileEntryAccess
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getAppProfileEntryAccess")
  @js.native
  def getAppProfileEntryAccess(): AppProfileEntryAccess = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppServerInfo
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getAppServerInfo")
  @js.native
  def getAppServerInfo(): AppServerInfo = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChannel
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getChannel")
  @js.native
  def getChannel(): Channel = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChatServerInfo
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getChatServerInfo")
  @js.native
  def getChatServerInfo(): ChatServerInfo = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultBotUser
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getDefaultBotUser")
  @js.native
  def getDefaultBotUser(): BotUser = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultLogger
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getDefaultLogger")
  @js.native
  def getDefaultLogger(): Logger = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getExternalServerAccess
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getExternalServerAccess")
  @js.native
  def getExternalServerAccess(): ExternalServerAccess = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getFullImagePath
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getFullImagePath")
  @js.native
  def getFullImagePath(imageName: java.lang.String): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getFullSystemImagePath
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getFullSystemImagePath")
  @js.native
  def getFullSystemImagePath(imageName: java.lang.String): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getKnuddelPot
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getKnuddelPot")
  @js.native
  def getKnuddelPot(id: Double): KnuddelPot | Null = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPaymentAccess
  		 * @since AppServer 108571, ChatServer 108571
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getPaymentAccess")
  @js.native
  def getPaymentAccess(): PaymentAccess = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPersistence
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getPersistence")
  @js.native
  def getPersistence(): AppPersistence = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getToplistAccess
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getToplistAccess")
  @js.native
  def getToplistAccess(): ToplistAccess = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getUserAccess
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.getUserAccess")
  @js.native
  def getUserAccess(): UserAccess = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_listFiles
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.listFiles")
  @js.native
  def listFiles(path: java.lang.String): js.Array[java.lang.String] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_refreshHooks
  		 */
  /* static member */
  @JSGlobal("KnuddelsServer.refreshHooks")
  @js.native
  def refreshHooks(): Unit = js.native
}
