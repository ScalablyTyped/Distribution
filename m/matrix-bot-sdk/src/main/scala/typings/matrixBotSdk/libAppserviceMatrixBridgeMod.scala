package typings.matrixBotSdk

import typings.matrixBotSdk.libAppserviceAppserviceMod.Appservice
import typings.matrixBotSdk.libAppserviceIntentMod.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppserviceMatrixBridgeMod {
  
  @JSImport("matrix-bot-sdk/lib/appservice/MatrixBridge", "MatrixBridge")
  @js.native
  open class MatrixBridge protected () extends StObject {
    def this(appservice: Appservice) = this()
    
    /* private */ var appservice: Any = js.native
    
    /**
      * Gets a Matrix user intent for the provided remote user ID.
      * @param {string} remoteUserId The remote user ID to look up.
      * @returns {Promise<Intent>} Resolves to the Matrix user intent.
      */
    def getIntentForRemote(remoteUserId: String): js.Promise[Intent] = js.native
    
    /**
      * Gets the Matrix room ID for the provided remote room ID.
      * @param {string} remoteRoomId The remote room ID to look up.
      * @returns {Promise<string>} Resolves to the Matrix room ID.
      */
    def getMatrixRoomIdForRemote(remoteRoomId: String): js.Promise[String] = js.native
    
    /**
      * Gets information about a remote room.
      * @param {string} matrixRoomId The Matrix room ID to get information on.
      * @returns {Promise<IRemoteRoomInfo>} Resolves to the remote room information.
      */
    def getRemoteRoomInfo[T /* <: IRemoteRoomInfo */](matrixRoomId: String): js.Promise[T] = js.native
    
    /**
      * Gets information about a remote user.
      * @param {Intent} userIntent The Matrix user intent to get information on.
      * @returns {Promise<IRemoteUserInfo>} Resolves to the remote user information.
      */
    def getRemoteUserInfo[T /* <: IRemoteUserInfo */](userIntent: Intent): js.Promise[T] = js.native
    
    /**
      * Sets information about a remote room. Calling this function will map the
      * provided remote room ID to the matrix room ID.
      * @param {string} matrixRoomId The Matrix room ID to store information on.
      * @param {IRemoteRoomInfo} remoteInfo The remote room information to store
      * @returns {Promise<any>} Resolves when the information has been updated.
      */
    def setRemoteRoomInfo[T /* <: IRemoteRoomInfo */](matrixRoomId: String, remoteInfo: T): js.Promise[Any] = js.native
    
    /**
      * Sets information about a remote user. Calling this function will map the
      * provided remote user ID to the intent's owner.
      * @param {Intent} userIntent The Matrix user intent to store information on.
      * @param {IRemoteUserInfo} remoteInfo The remote user information to store
      * @returns {Promise<any>} Resolves when the information has been updated.
      */
    def setRemoteUserInfo[T /* <: IRemoteUserInfo */](userIntent: Intent, remoteInfo: T): js.Promise[Any] = js.native
    
    /* private */ var updateRemoteRoomMapping: Any = js.native
    
    /* private */ var updateRemoteUserMapping: Any = js.native
  }
  
  @JSImport("matrix-bot-sdk/lib/appservice/MatrixBridge", "REMOTE_ROOM_INFO_ACCOUNT_DATA_EVENT_TYPE")
  @js.native
  val REMOTE_ROOM_INFO_ACCOUNT_DATA_EVENT_TYPE: /* "io.t2bot.sdk.bot.remote_room_info" */ String = js.native
  
  @JSImport("matrix-bot-sdk/lib/appservice/MatrixBridge", "REMOTE_ROOM_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX")
  @js.native
  val REMOTE_ROOM_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX: /* "io.t2bot.sdk.bot.remote_room_map" */ String = js.native
  
  @JSImport("matrix-bot-sdk/lib/appservice/MatrixBridge", "REMOTE_USER_INFO_ACCOUNT_DATA_EVENT_TYPE")
  @js.native
  val REMOTE_USER_INFO_ACCOUNT_DATA_EVENT_TYPE: /* "io.t2bot.sdk.bot.remote_user_info" */ String = js.native
  
  @JSImport("matrix-bot-sdk/lib/appservice/MatrixBridge", "REMOTE_USER_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX")
  @js.native
  val REMOTE_USER_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX: /* "io.t2bot.sdk.bot.remote_user_map" */ String = js.native
  
  trait IRemoteRoomInfo extends StObject {
    
    /**
      * A unique identifier for the remote user.
      */
    var id: String
  }
  object IRemoteRoomInfo {
    
    inline def apply(id: String): IRemoteRoomInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRemoteRoomInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRemoteRoomInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRemoteUserInfo extends StObject {
    
    /**
      * A unique identifier for the remote room (or room equivalent).
      */
    var id: String
  }
  object IRemoteUserInfo {
    
    inline def apply(id: String): IRemoteUserInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRemoteUserInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRemoteUserInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
