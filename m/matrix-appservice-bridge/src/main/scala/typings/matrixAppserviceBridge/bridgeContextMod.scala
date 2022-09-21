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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bridgeContextMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/bridge-context", "BridgeContext")
  @js.native
  open class BridgeContext protected () extends StObject {
    /**
      * @param ctx Event related data
      * @param ctx.sender Matrix user ID of the sender.
      * @param ctx.target Matrix user ID of the target.
      * @param ctx.room Matrix room ID.
      */
    def this(ctx: Room) = this()
    
    /* private */ var ctx: Any = js.native
    
    /**
      * Returns this instance after its initialization.
      *
      * @param {RoomBridgeStore} roomStore
      * @param {UserBridgeStore} userStore
      * @returns {Promise<BridgeContext>}
      */
    def get(roomStore: RoomBridgeStore, userStore: UserBridgeStore): js.Promise[BridgeContext] = js.native
    
    val rooms: BridgeContextRoom = js.native
    
    val senders: BridgeContextSenders = js.native
    
    val targets: BridgeContextTargets = js.native
  }
  
  trait BridgeContextRoom extends StObject {
    
    var matrix: MatrixRoom
    
    var remote: RemoteRoom | Null
    
    var remotes: js.Array[RemoteRoom]
  }
  object BridgeContextRoom {
    
    inline def apply(matrix: MatrixRoom, remotes: js.Array[RemoteRoom]): BridgeContextRoom = {
      val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], remote = null)
      __obj.asInstanceOf[BridgeContextRoom]
    }
    
    extension [Self <: BridgeContextRoom](x: Self) {
      
      inline def setMatrix(value: MatrixRoom): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: RemoteRoom): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      inline def setRemotes(value: js.Array[RemoteRoom]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
      
      inline def setRemotesVarargs(value: RemoteRoom*): Self = StObject.set(x, "remotes", js.Array(value*))
    }
  }
  
  trait BridgeContextSenders extends StObject {
    
    var matrix: MatrixUser
    
    var remote: RemoteUser | Null
    
    var remotes: js.Array[RemoteUser]
  }
  object BridgeContextSenders {
    
    inline def apply(matrix: MatrixUser, remotes: js.Array[RemoteUser]): BridgeContextSenders = {
      val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], remote = null)
      __obj.asInstanceOf[BridgeContextSenders]
    }
    
    extension [Self <: BridgeContextSenders](x: Self) {
      
      inline def setMatrix(value: MatrixUser): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: RemoteUser): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      inline def setRemotes(value: js.Array[RemoteUser]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
      
      inline def setRemotesVarargs(value: RemoteUser*): Self = StObject.set(x, "remotes", js.Array(value*))
    }
  }
  
  trait BridgeContextTargets extends StObject {
    
    var matrix: MatrixUser | Null
    
    var remote: RemoteUser | Null
    
    var remotes: js.Array[RemoteUser]
  }
  object BridgeContextTargets {
    
    inline def apply(remotes: js.Array[RemoteUser]): BridgeContextTargets = {
      val __obj = js.Dynamic.literal(remotes = remotes.asInstanceOf[js.Any], matrix = null, remote = null)
      __obj.asInstanceOf[BridgeContextTargets]
    }
    
    extension [Self <: BridgeContextTargets](x: Self) {
      
      inline def setMatrix(value: MatrixUser): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixNull: Self = StObject.set(x, "matrix", null)
      
      inline def setRemote(value: RemoteUser): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteNull: Self = StObject.set(x, "remote", null)
      
      inline def setRemotes(value: js.Array[RemoteUser]): Self = StObject.set(x, "remotes", value.asInstanceOf[js.Any])
      
      inline def setRemotesVarargs(value: RemoteUser*): Self = StObject.set(x, "remotes", js.Array(value*))
    }
  }
}
