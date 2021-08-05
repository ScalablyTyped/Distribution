package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.OnPotSealed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html
	 */
@JSGlobal("KnuddelsServer")
@js.native
class KnuddelsServer () extends StObject
object KnuddelsServer {
  
  @JSGlobal("KnuddelsServer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_createKnuddelPot
  		 */
  /* static member */
  inline def createKnuddelPot(knuddelAmount: KnuddelAmount): KnuddelPot = ^.asInstanceOf[js.Dynamic].applyDynamic("createKnuddelPot")(knuddelAmount.asInstanceOf[js.Any]).asInstanceOf[KnuddelPot]
  inline def createKnuddelPot(knuddelAmount: KnuddelAmount, params: OnPotSealed): KnuddelPot = (^.asInstanceOf[js.Dynamic].applyDynamic("createKnuddelPot")(knuddelAmount.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[KnuddelPot]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_execute
  		 */
  /* static member */
  inline def execute(fileName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAllKnuddelPots
  		 */
  /* static member */
  inline def getAllKnuddelPots(): js.Array[KnuddelPot] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKnuddelPots")().asInstanceOf[js.Array[KnuddelPot]]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppAccess
  		 */
  /* static member */
  inline def getAppAccess(): AppAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppAccess")().asInstanceOf[AppAccess]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppProfileEntryAccess
  		 */
  /* static member */
  inline def getAppProfileEntryAccess(): AppProfileEntryAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppProfileEntryAccess")().asInstanceOf[AppProfileEntryAccess]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getAppServerInfo
  		 */
  /* static member */
  inline def getAppServerInfo(): AppServerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppServerInfo")().asInstanceOf[AppServerInfo]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChannel
  		 */
  /* static member */
  inline def getChannel(): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannel")().asInstanceOf[Channel]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getChatServerInfo
  		 */
  /* static member */
  inline def getChatServerInfo(): ChatServerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getChatServerInfo")().asInstanceOf[ChatServerInfo]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultBotUser
  		 */
  /* static member */
  inline def getDefaultBotUser(): BotUser = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBotUser")().asInstanceOf[BotUser]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getDefaultLogger
  		 */
  /* static member */
  inline def getDefaultLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLogger")().asInstanceOf[Logger]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getExternalServerAccess
  		 */
  /* static member */
  inline def getExternalServerAccess(): ExternalServerAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("getExternalServerAccess")().asInstanceOf[ExternalServerAccess]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getFullImagePath
  		 */
  /* static member */
  inline def getFullImagePath(imageName: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullImagePath")(imageName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getFullSystemImagePath
  		 */
  /* static member */
  inline def getFullSystemImagePath(imageName: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullSystemImagePath")(imageName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getKnuddelPot
  		 */
  /* static member */
  inline def getKnuddelPot(id: Double): KnuddelPot | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getKnuddelPot")(id.asInstanceOf[js.Any]).asInstanceOf[KnuddelPot | Null]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPaymentAccess
  		 * @since AppServer 108571, ChatServer 108571
  		 */
  /* static member */
  inline def getPaymentAccess(): PaymentAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaymentAccess")().asInstanceOf[PaymentAccess]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getPersistence
  		 */
  /* static member */
  inline def getPersistence(): AppPersistence = ^.asInstanceOf[js.Dynamic].applyDynamic("getPersistence")().asInstanceOf[AppPersistence]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getToplistAccess
  		 */
  /* static member */
  inline def getToplistAccess(): ToplistAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("getToplistAccess")().asInstanceOf[ToplistAccess]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_getUserAccess
  		 */
  /* static member */
  inline def getUserAccess(): UserAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAccess")().asInstanceOf[UserAccess]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_listFiles
  		 */
  /* static member */
  inline def listFiles(path: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listFiles")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelsServer.html#method_refreshHooks
  		 */
  /* static member */
  inline def refreshHooks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshHooks")().asInstanceOf[Unit]
}
