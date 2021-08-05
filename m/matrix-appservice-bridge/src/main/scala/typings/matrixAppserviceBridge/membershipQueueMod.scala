package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.bridgeMod.Bridge
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.join
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.leave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object membershipQueueMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/membership-queue", "MembershipQueue")
  @js.native
  class MembershipQueue protected () extends StObject {
    def this(bridge: Bridge, opts: MembershipQueueOpts) = this()
    
    /* private */ var bridge: js.Any = js.native
    
    /* private */ var hashRoomId: js.Any = js.native
    
    /**
      * Join a user to a room
      * @param roomId The roomId to join
      * @param userId Leave empty to act as the bot user.
      * @param req The request entry for logging context
      * @param retry Should the request retry if it fails
      */
    def join(roomId: String, userId: String, req: ThinRequest): js.Promise[Unit] = js.native
    def join(roomId: String, userId: String, req: ThinRequest, retry: Boolean): js.Promise[Unit] = js.native
    def join(roomId: String, userId: Unit, req: ThinRequest): js.Promise[Unit] = js.native
    def join(roomId: String, userId: Unit, req: ThinRequest, retry: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Leave OR kick a user from a room
      * @param roomId The roomId to leave
      * @param userId Leave empty to act as the bot user.
      * @param req The request entry for logging context
      * @param retry Should the request retry if it fails
      * @param reason Reason for leaving/kicking
      * @param kickUser The user to be kicked. If left blank, this will be a leave.
      */
    def leave(roomId: String, userId: String, req: ThinRequest): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean, reason: String): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean, reason: String, kickUser: String): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean, reason: Unit, kickUser: String): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Unit, reason: String): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Unit, reason: String, kickUser: String): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Unit, reason: Unit, kickUser: String): js.Promise[Unit] = js.native
    
    /* private */ var opts: js.Any = js.native
    
    def queueMembership(item: QueueUserItem): js.Promise[Unit] = js.native
    
    /* private */ var queues: js.Any = js.native
    
    /* private */ var serviceQueue: js.Any = js.native
    
    /* private */ var shouldRetry: js.Any = js.native
  }
  
  trait MembershipQueueOpts extends StObject {
    
    var concurrentRoomLimit: Double
    
    var joinDelayMs: Double
    
    var maxAttempts: Double
    
    var maxJoinDelayMs: Double
  }
  object MembershipQueueOpts {
    
    inline def apply(concurrentRoomLimit: Double, joinDelayMs: Double, maxAttempts: Double, maxJoinDelayMs: Double): MembershipQueueOpts = {
      val __obj = js.Dynamic.literal(concurrentRoomLimit = concurrentRoomLimit.asInstanceOf[js.Any], joinDelayMs = joinDelayMs.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxJoinDelayMs = maxJoinDelayMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MembershipQueueOpts]
    }
    
    extension [Self <: MembershipQueueOpts](x: Self) {
      
      inline def setConcurrentRoomLimit(value: Double): Self = StObject.set(x, "concurrentRoomLimit", value.asInstanceOf[js.Any])
      
      inline def setJoinDelayMs(value: Double): Self = StObject.set(x, "joinDelayMs", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxJoinDelayMs(value: Double): Self = StObject.set(x, "maxJoinDelayMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueUserItem extends StObject {
    
    var attempts: Double
    
    var kickUser: js.UndefOr[String] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var req: ThinRequest
    
    var retry: Boolean
    
    var roomId: String
    
    var `type`: join | leave
    
    var userId: String
  }
  object QueueUserItem {
    
    inline def apply(
      attempts: Double,
      req: ThinRequest,
      retry: Boolean,
      roomId: String,
      `type`: join | leave,
      userId: String
    ): QueueUserItem = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueUserItem]
    }
    
    extension [Self <: QueueUserItem](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setKickUser(value: String): Self = StObject.set(x, "kickUser", value.asInstanceOf[js.Any])
      
      inline def setKickUserUndefined: Self = StObject.set(x, "kickUser", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setReq(value: ThinRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      inline def setType(value: join | leave): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThinRequest extends StObject {
    
    def getId(): String
  }
  object ThinRequest {
    
    inline def apply(getId: () => String): ThinRequest = {
      val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
      __obj.asInstanceOf[ThinRequest]
    }
    
    extension [Self <: ThinRequest](x: Self) {
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    }
  }
}
