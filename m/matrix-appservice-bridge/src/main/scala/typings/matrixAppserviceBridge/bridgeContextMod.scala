package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Room
import typings.matrixAppserviceBridge.matrixMod.MatrixRoom
import typings.matrixAppserviceBridge.remoteMod.RemoteRoom
import typings.matrixAppserviceBridge.roomBridgeStoreMod.RoomBridgeStore
import typings.matrixAppserviceBridge.userBridgeStoreMod.UserBridgeStore
import typings.matrixAppserviceBridge.usersMatrixMod.MatrixUser
import typings.matrixAppserviceBridge.usersRemoteMod.RemoteUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bridgeContextMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/bridge-context", "BridgeContext")
  @js.native
  class BridgeContext protected () extends StObject {
    /**
      * @param ctx Event related data
      * @param ctx.sender Matrix user ID of the sender.
      * @param ctx.target Matrix user ID of the target.
      * @param ctx.room Matrix room ID.
      */
    def this(ctx: Room) = this()
    
    var ctx: js.Any = js.native
    
    /**
      * Returns this instance after its initialization.
      *
      * @param {RoomBridgeStore} roomStore
      * @param {UserBridgeStore} userStore
      * @returns {Promise<BridgeContext>}
      */
    def get(roomStore: RoomBridgeStore, userStore: UserBridgeStore): js.Promise[this.type] = js.native
    
    val rooms: BridgeContextRoom = js.native
    
    val senders: BridgeContextSenders = js.native
    
    val targets: BridgeContextTargets = js.native
  }
  
  @js.native
  trait BridgeContextRoom extends StObject {
    
    var matrix: MatrixRoom = js.native
    
    var remote: RemoteRoom | Null = js.native
    
    var remotes: js.Array[RemoteRoom] = js.native
  }
  object BridgeContextRoom {
    
    @scala.inline
    def apply(matrix: MatrixRoom, remotes: js.Array[RemoteRoom]): BridgeContextRoom = {
      val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeContextRoom]
    }
    
    @scala.inline
    implicit class BridgeContextRoomMutableBuilder[Self <: BridgeContextRoom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatrix(value: MatrixRoom): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: RemoteRoom): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      @scala.inline
      def setRemotes(value: js.Array[RemoteRoom]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotesVarargs(value: RemoteRoom*): Self = StObject.set(x, "remotes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BridgeContextSenders extends StObject {
    
    var matrix: MatrixUser = js.native
    
    var remote: RemoteUser | Null = js.native
    
    var remotes: js.Array[RemoteUser] = js.native
  }
  object BridgeContextSenders {
    
    @scala.inline
    def apply(matrix: MatrixUser, remotes: js.Array[RemoteUser]): BridgeContextSenders = {
      val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeContextSenders]
    }
    
    @scala.inline
    implicit class BridgeContextSendersMutableBuilder[Self <: BridgeContextSenders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatrix(value: MatrixUser): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: RemoteUser): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      @scala.inline
      def setRemotes(value: js.Array[RemoteUser]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotesVarargs(value: RemoteUser*): Self = StObject.set(x, "remotes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BridgeContextTargets extends StObject {
    
    var matrix: MatrixUser | Null = js.native
    
    var remote: RemoteUser | Null = js.native
    
    var remotes: js.Array[RemoteUser] = js.native
  }
  object BridgeContextTargets {
    
    @scala.inline
    def apply(remotes: js.Array[RemoteUser]): BridgeContextTargets = {
      val __obj = js.Dynamic.literal(remotes = remotes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeContextTargets]
    }
    
    @scala.inline
    implicit class BridgeContextTargetsMutableBuilder[Self <: BridgeContextTargets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatrix(value: MatrixUser): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixNull: Self = StObject.set(x, "matrix", null)
      
      @scala.inline
      def setRemote(value: RemoteUser): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      @scala.inline
      def setRemotes(value: js.Array[RemoteUser]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotesVarargs(value: RemoteUser*): Self = StObject.set(x, "remotes", js.Array(value :_*))
    }
  }
}
