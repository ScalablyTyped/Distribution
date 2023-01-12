package typings.matrixAppserviceBridge

import typings.matrixAppservice.mod.AppServiceRegistration
import typings.matrixAppserviceBridge.anon.Avatarurl
import typings.matrixAppserviceBridge.anon.State
import typings.matrixAppserviceBridge.libComponentsMembershipCacheMod.MembershipCache
import typings.matrixAppserviceBridge.libComponentsStateLookupMod.StateLookupEvent
import typings.matrixBotSdk.mod.MatrixClient
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAppServiceBotMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/app-service-bot", "AppServiceBot")
  @js.native
  open class AppServiceBot protected () extends StObject {
    def this(
      client: MatrixClient,
      userId: String,
      registration: AppServiceRegistration,
      memberCache: MembershipCache
    ) = this()
    
    /* private */ var client: Any = js.native
    
    /* private */ var exclusiveUserRegexes: Any = js.native
    
    def getClient(): MatrixClient = js.native
    
    /**
      * Get a map of joined user IDs for the given room ID. The values in the map are objects
      * with a 'display_name' and 'avatar_url' properties. These properties may be null.
      * @param roomId The room to get a list of joined user IDs in.
      * @return Resolves to a map of user ID => display_name avatar_url
      */
    def getJoinedMembers(roomId: String): js.Promise[Record[String, Avatarurl]] = js.native
    
    /**
      * Get a list of joined room IDs for the AS bot.
      * @return Resolves to a list of room IDs.
      */
    def getJoinedRooms(): js.Promise[js.Array[String]] = js.native
    
    def getRoomInfo(roomId: String): js.Promise[RoomInfo] = js.native
    def getRoomInfo(roomId: String, joinedRoom: State): js.Promise[RoomInfo] = js.native
    
    def getUserId(): String = js.native
    
    /**
      * Test a userId to determine if it's a user within the exclusive regexes of the bridge.
      * @return True if it is a remote user, false otherwise.
      */
    def isRemoteUser(userId: String): Boolean = js.native
    
    /* private */ var memberCache: Any = js.native
    
    /* private */ var userId: Any = js.native
  }
  
  trait RoomInfo extends StObject {
    
    var id: String
    
    var realJoinedUsers: js.Array[String]
    
    var remoteJoinedUsers: js.Array[String]
    
    var state: js.Array[StateLookupEvent]
  }
  object RoomInfo {
    
    inline def apply(
      id: String,
      realJoinedUsers: js.Array[String],
      remoteJoinedUsers: js.Array[String],
      state: js.Array[StateLookupEvent]
    ): RoomInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], realJoinedUsers = realJoinedUsers.asInstanceOf[js.Any], remoteJoinedUsers = remoteJoinedUsers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRealJoinedUsers(value: js.Array[String]): Self = StObject.set(x, "realJoinedUsers", value.asInstanceOf[js.Any])
      
      inline def setRealJoinedUsersVarargs(value: String*): Self = StObject.set(x, "realJoinedUsers", js.Array(value*))
      
      inline def setRemoteJoinedUsers(value: js.Array[String]): Self = StObject.set(x, "remoteJoinedUsers", value.asInstanceOf[js.Any])
      
      inline def setRemoteJoinedUsersVarargs(value: String*): Self = StObject.set(x, "remoteJoinedUsers", js.Array(value*))
      
      inline def setState(value: js.Array[StateLookupEvent]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateVarargs(value: StateLookupEvent*): Self = StObject.set(x, "state", js.Array(value*))
    }
  }
}
