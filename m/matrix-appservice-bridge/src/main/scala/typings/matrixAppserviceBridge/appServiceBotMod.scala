package typings.matrixAppserviceBridge

import typings.matrixAppservice.mod.AppServiceRegistration
import typings.matrixAppserviceBridge.anon.Avatarurl
import typings.matrixAppserviceBridge.anon.Id
import typings.matrixAppserviceBridge.anon.State
import typings.matrixAppserviceBridge.membershipCacheMod.MembershipCache
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appServiceBotMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/app-service-bot", "AppServiceBot")
  @js.native
  class AppServiceBot protected () extends StObject {
    def this(client: js.Any, registration: AppServiceRegistration, memberCache: MembershipCache) = this()
    
    /* private */ var client: js.Any = js.native
    
    /* private */ var exclusiveUserRegexes: js.Any = js.native
    
    def getClient(): js.Any = js.native
    
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
    
    def getRoomInfo(roomId: String): js.Promise[Id] = js.native
    def getRoomInfo(roomId: String, joinedRoom: State): js.Promise[Id] = js.native
    
    def getUserId(): String = js.native
    
    /**
      * Test a userId to determine if it's a user within the exclusive regexes of the bridge.
      * @return True if it is a remote user, false otherwise.
      */
    def isRemoteUser(userId: String): Boolean = js.native
    
    /* private */ var memberCache: js.Any = js.native
  }
}
