package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.libBridgeMod.Bridge
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.join
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.leave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMembershipQueueMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/membership-queue", "DEFAULT_OPTS")
  @js.native
  val DEFAULT_OPTS: MembershipQueueOptsWithDefaults = js.native
  
  @JSImport("matrix-appservice-bridge/lib/components/membership-queue", "MembershipQueue")
  @js.native
  open class MembershipQueue protected () extends StObject {
    def this(bridge: Bridge, opts: MembershipQueueOpts) = this()
    
    /* private */ var ageOfLastProcessedGauge: Any = js.native
    
    /* private */ var bridge: Any = js.native
    
    /* private */ var failureReasonCounter: Any = js.native
    
    /* private */ var hashRoomId: Any = js.native
    
    /**
      * Join a user to a room
      * @param roomId The roomId to join
      * @param userId Leave empty to act as the bot user.
      * @param req The request entry for logging context
      * @param retry Should the request retry if it fails
      * @param ttl How long should this request remain queued in milliseconds
      * before it's discarded. Defaults to `opts.defaultTtlMs`
      * @returns A promise that resolves when the membership has completed
      */
    def join(roomId: String, userId: String, req: ThinRequest): js.Promise[Unit] = js.native
    def join(roomId: String, userId: String, req: ThinRequest, retry: Boolean): js.Promise[Unit] = js.native
    def join(roomId: String, userId: String, req: ThinRequest, retry: Boolean, ttl: Double): js.Promise[Unit] = js.native
    def join(roomId: String, userId: String, req: ThinRequest, retry: Unit, ttl: Double): js.Promise[Unit] = js.native
    def join(roomId: String, userId: Unit, req: ThinRequest): js.Promise[Unit] = js.native
    def join(roomId: String, userId: Unit, req: ThinRequest, retry: Boolean): js.Promise[Unit] = js.native
    def join(roomId: String, userId: Unit, req: ThinRequest, retry: Boolean, ttl: Double): js.Promise[Unit] = js.native
    def join(roomId: String, userId: Unit, req: ThinRequest, retry: Unit, ttl: Double): js.Promise[Unit] = js.native
    
    /**
      * Leave OR kick a user from a room
      * @param roomId The roomId to leave
      * @param userId Leave empty to act as the bot user.
      * @param req The request entry for logging context
      * @param retry Should the request retry if it fails
      * @param reason Reason for leaving/kicking
      * @param kickUser The user to be kicked. If left blank, this will be a leave.
      * @param ttl How long should this request remain queued in milliseconds
      * before it's discarded. Defaults to `opts.defaultTtlMs`
      * @returns A promise that resolves when the membership has completed
      */
    def leave(roomId: String, userId: String, req: ThinRequest): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean, reason: String): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean, reason: String, kickUser: String): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Boolean,
      reason: String,
      kickUser: String,
      ttl: Double
    ): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Boolean,
      reason: String,
      kickUser: Unit,
      ttl: Double
    ): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Boolean, reason: Unit, kickUser: String): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Boolean,
      reason: Unit,
      kickUser: String,
      ttl: Double
    ): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Boolean,
      reason: Unit,
      kickUser: Unit,
      ttl: Double
    ): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Unit, reason: String): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Unit, reason: String, kickUser: String): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Unit,
      reason: String,
      kickUser: String,
      ttl: Double
    ): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Unit,
      reason: String,
      kickUser: Unit,
      ttl: Double
    ): js.Promise[Unit] = js.native
    def leave(roomId: String, userId: String, req: ThinRequest, retry: Unit, reason: Unit, kickUser: String): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Unit,
      reason: Unit,
      kickUser: String,
      ttl: Double
    ): js.Promise[Unit] = js.native
    def leave(
      roomId: String,
      userId: String,
      req: ThinRequest,
      retry: Unit,
      reason: Unit,
      kickUser: Unit,
      ttl: Double
    ): js.Promise[Unit] = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var pendingGauge: Any = js.native
    
    /* private */ var processedCounter: Any = js.native
    
    def queueMembership(item: QueueUserItem): js.Promise[Unit] = js.native
    
    /* private */ var queues: Any = js.native
    
    /**
      * This should be called after starting the bridge in order
      * to track metrics for the membership queue.
      */
    def registerMetrics(): Unit = js.native
    
    /* private */ var serviceQueue: Any = js.native
    
    /* private */ var shouldRetry: Any = js.native
  }
  
  trait MembershipQueueOpts extends StObject {
    
    /**
      * How long to delay a request for in milliseconds, multiplied by the number of attempts made
      * if a request failed.
      */
    var actionDelayMs: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of concurrent operations to perform.
      */
    var concurrentRoomLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * How long a request can "live" for before it is discarded in
      * milliseconds. This will override `maxAttempts`.
      */
    var defaultTtlMs: js.UndefOr[Double] = js.undefined
    
    /**
      * @deprecated Use `actionDelayMs`
      */
    var joinDelayMs: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of milliseconds a request may be delayed for.
      */
    var maxActionDelayMs: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of attempts to retry an operation before it is discarded.
      */
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    /**
      * @deprecated Use `maxActionDelayMs`
      */
    var maxJoinDelayMs: js.UndefOr[Double] = js.undefined
  }
  object MembershipQueueOpts {
    
    inline def apply(): MembershipQueueOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MembershipQueueOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MembershipQueueOpts] (val x: Self) extends AnyVal {
      
      inline def setActionDelayMs(value: Double): Self = StObject.set(x, "actionDelayMs", value.asInstanceOf[js.Any])
      
      inline def setActionDelayMsUndefined: Self = StObject.set(x, "actionDelayMs", js.undefined)
      
      inline def setConcurrentRoomLimit(value: Double): Self = StObject.set(x, "concurrentRoomLimit", value.asInstanceOf[js.Any])
      
      inline def setConcurrentRoomLimitUndefined: Self = StObject.set(x, "concurrentRoomLimit", js.undefined)
      
      inline def setDefaultTtlMs(value: Double): Self = StObject.set(x, "defaultTtlMs", value.asInstanceOf[js.Any])
      
      inline def setDefaultTtlMsUndefined: Self = StObject.set(x, "defaultTtlMs", js.undefined)
      
      inline def setJoinDelayMs(value: Double): Self = StObject.set(x, "joinDelayMs", value.asInstanceOf[js.Any])
      
      inline def setJoinDelayMsUndefined: Self = StObject.set(x, "joinDelayMs", js.undefined)
      
      inline def setMaxActionDelayMs(value: Double): Self = StObject.set(x, "maxActionDelayMs", value.asInstanceOf[js.Any])
      
      inline def setMaxActionDelayMsUndefined: Self = StObject.set(x, "maxActionDelayMs", js.undefined)
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setMaxJoinDelayMs(value: Double): Self = StObject.set(x, "maxJoinDelayMs", value.asInstanceOf[js.Any])
      
      inline def setMaxJoinDelayMsUndefined: Self = StObject.set(x, "maxJoinDelayMs", js.undefined)
    }
  }
  
  trait MembershipQueueOptsWithDefaults
    extends StObject
       with MembershipQueueOpts {
    
    @JSName("actionDelayMs")
    var actionDelayMs_MembershipQueueOptsWithDefaults: Double
    
    @JSName("concurrentRoomLimit")
    var concurrentRoomLimit_MembershipQueueOptsWithDefaults: Double
    
    @JSName("defaultTtlMs")
    var defaultTtlMs_MembershipQueueOptsWithDefaults: Double
    
    @JSName("maxActionDelayMs")
    var maxActionDelayMs_MembershipQueueOptsWithDefaults: Double
    
    @JSName("maxAttempts")
    var maxAttempts_MembershipQueueOptsWithDefaults: Double
  }
  object MembershipQueueOptsWithDefaults {
    
    inline def apply(
      actionDelayMs: Double,
      concurrentRoomLimit: Double,
      defaultTtlMs: Double,
      maxActionDelayMs: Double,
      maxAttempts: Double
    ): MembershipQueueOptsWithDefaults = {
      val __obj = js.Dynamic.literal(actionDelayMs = actionDelayMs.asInstanceOf[js.Any], concurrentRoomLimit = concurrentRoomLimit.asInstanceOf[js.Any], defaultTtlMs = defaultTtlMs.asInstanceOf[js.Any], maxActionDelayMs = maxActionDelayMs.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MembershipQueueOptsWithDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MembershipQueueOptsWithDefaults] (val x: Self) extends AnyVal {
      
      inline def setActionDelayMs(value: Double): Self = StObject.set(x, "actionDelayMs", value.asInstanceOf[js.Any])
      
      inline def setConcurrentRoomLimit(value: Double): Self = StObject.set(x, "concurrentRoomLimit", value.asInstanceOf[js.Any])
      
      inline def setDefaultTtlMs(value: Double): Self = StObject.set(x, "defaultTtlMs", value.asInstanceOf[js.Any])
      
      inline def setMaxActionDelayMs(value: Double): Self = StObject.set(x, "maxActionDelayMs", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueUserItem extends StObject {
    
    var attempts: Double
    
    var kickUser: js.UndefOr[String] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var req: ThinRequest
    
    var retry: Boolean
    
    var roomId: String
    
    var ts: Double
    
    var ttl: Double
    
    var `type`: join | leave
    
    var userId: String
  }
  object QueueUserItem {
    
    inline def apply(
      attempts: Double,
      req: ThinRequest,
      retry: Boolean,
      roomId: String,
      ts: Double,
      ttl: Double,
      `type`: join | leave,
      userId: String
    ): QueueUserItem = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueUserItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueUserItem] (val x: Self) extends AnyVal {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setKickUser(value: String): Self = StObject.set(x, "kickUser", value.asInstanceOf[js.Any])
      
      inline def setKickUserUndefined: Self = StObject.set(x, "kickUser", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setReq(value: ThinRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThinRequest] (val x: Self) extends AnyVal {
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    }
  }
}
