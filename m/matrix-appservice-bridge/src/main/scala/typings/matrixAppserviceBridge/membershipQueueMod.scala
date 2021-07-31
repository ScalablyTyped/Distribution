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
    
    var bridge: js.Any = js.native
    
    var hashRoomId: js.Any = js.native
    
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
    
    var opts: js.Any = js.native
    
    def queueMembership(item: QueueUserItem): js.Promise[Unit] = js.native
    
    var queues: js.Any = js.native
    
    var serviceQueue: js.Any = js.native
    
    var shouldRetry: js.Any = js.native
  }
  
  trait MembershipQueueOpts extends StObject {
    
    var concurrentRoomLimit: Double
    
    var joinDelayMs: Double
    
    var maxAttempts: Double
    
    var maxJoinDelayMs: Double
  }
  object MembershipQueueOpts {
    
    @scala.inline
    def apply(concurrentRoomLimit: Double, joinDelayMs: Double, maxAttempts: Double, maxJoinDelayMs: Double): MembershipQueueOpts = {
      val __obj = js.Dynamic.literal(concurrentRoomLimit = concurrentRoomLimit.asInstanceOf[js.Any], joinDelayMs = joinDelayMs.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxJoinDelayMs = maxJoinDelayMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MembershipQueueOpts]
    }
    
    @scala.inline
    implicit class MembershipQueueOptsMutableBuilder[Self <: MembershipQueueOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrentRoomLimit(value: Double): Self = StObject.set(x, "concurrentRoomLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinDelayMs(value: Double): Self = StObject.set(x, "joinDelayMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxJoinDelayMs(value: Double): Self = StObject.set(x, "maxJoinDelayMs", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class QueueUserItemMutableBuilder[Self <: QueueUserItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKickUser(value: String): Self = StObject.set(x, "kickUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKickUserUndefined: Self = StObject.set(x, "kickUser", js.undefined)
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setReq(value: ThinRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: join | leave): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThinRequest extends StObject {
    
    def getId(): String
  }
  object ThinRequest {
    
    @scala.inline
    def apply(getId: () => String): ThinRequest = {
      val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
      __obj.asInstanceOf[ThinRequest]
    }
    
    @scala.inline
    implicit class ThinRequestMutableBuilder[Self <: ThinRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    }
  }
}
