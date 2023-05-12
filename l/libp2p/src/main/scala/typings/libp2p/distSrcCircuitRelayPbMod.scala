package typings.libp2p

import typings.libp2p.anon.PartialHopMessage
import typings.libp2p.anon.PartialLimit
import typings.libp2p.anon.PartialPeer
import typings.libp2p.anon.PartialReservation
import typings.libp2p.anon.PartialReservationVoucher
import typings.libp2p.anon.PartialStopMessage
import typings.libp2p.distSrcCircuitRelayPbMod.HopMessage.Type
import typings.libp2p.distSrcCircuitRelayServerReservationStoreMod.ReservationStatus
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayPbMod {
  
  trait HopMessage extends StObject {
    
    var limit: js.UndefOr[Limit] = js.undefined
    
    var peer: js.UndefOr[Peer] = js.undefined
    
    var reservation: js.UndefOr[Reservation] = js.undefined
    
    var status: js.UndefOr[Status] = js.undefined
    
    var `type`: js.UndefOr[Type] = js.undefined
  }
  object HopMessage {
    
    inline def apply(): HopMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HopMessage]
    }
    
    @JSImport("libp2p/dist/src/circuit-relay/pb", "HopMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait Type extends StObject
    @JSImport("libp2p/dist/src/circuit-relay/pb", "HopMessage.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[Type & String] = js.native
      
      @js.native
      sealed trait CONNECT
        extends StObject
           with Type
      /* "CONNECT" */ val CONNECT: typings.libp2p.distSrcCircuitRelayPbMod.HopMessage.Type.CONNECT & String = js.native
      
      @js.native
      sealed trait RESERVE
        extends StObject
           with Type
      /* "RESERVE" */ val RESERVE: typings.libp2p.distSrcCircuitRelayPbMod.HopMessage.Type.RESERVE & String = js.native
      
      @js.native
      sealed trait STATUS
        extends StObject
           with Type
      /* "STATUS" */ val STATUS: typings.libp2p.distSrcCircuitRelayPbMod.HopMessage.Type.STATUS & String = js.native
      
      def codec(): Codec[Type] = js.native
    }
    
    inline def codec(): Codec[HopMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[HopMessage]]
    
    inline def decode(buf: js.typedarray.Uint8Array): HopMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[HopMessage]
    inline def decode(buf: Uint8ArrayList): HopMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[HopMessage]
    
    inline def encode(obj: PartialHopMessage): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HopMessage] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPeer(value: Peer): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setPeerUndefined: Self = StObject.set(x, "peer", js.undefined)
      
      inline def setReservation(value: Reservation): Self = StObject.set(x, "reservation", value.asInstanceOf[js.Any])
      
      inline def setReservationUndefined: Self = StObject.set(x, "reservation", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Limit extends StObject {
    
    var data: js.UndefOr[js.BigInt] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object Limit {
    
    inline def apply(): Limit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Limit]
    }
    
    @JSImport("libp2p/dist/src/circuit-relay/pb", "Limit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Limit] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Limit]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Limit = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Limit]
    inline def decode(buf: Uint8ArrayList): Limit = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Limit]
    
    inline def encode(obj: PartialLimit): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.BigInt): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait Peer extends StObject {
    
    var addrs: js.Array[js.typedarray.Uint8Array]
    
    var id: js.typedarray.Uint8Array
  }
  object Peer {
    
    inline def apply(addrs: js.Array[js.typedarray.Uint8Array], id: js.typedarray.Uint8Array): Peer = {
      val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Peer]
    }
    
    @JSImport("libp2p/dist/src/circuit-relay/pb", "Peer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Peer] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Peer]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
    inline def decode(buf: Uint8ArrayList): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    inline def encode(obj: PartialPeer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Peer] (val x: Self) extends AnyVal {
      
      inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reservation extends StObject {
    
    var addrs: js.Array[js.typedarray.Uint8Array]
    
    var expire: js.BigInt
    
    var voucher: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Reservation {
    
    inline def apply(addrs: js.Array[js.typedarray.Uint8Array], expire: js.BigInt): Reservation = {
      val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reservation]
    }
    
    @JSImport("libp2p/dist/src/circuit-relay/pb", "Reservation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Reservation] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Reservation]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Reservation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Reservation]
    inline def decode(buf: Uint8ArrayList): Reservation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Reservation]
    
    inline def encode(obj: PartialReservation): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reservation] (val x: Self) extends AnyVal {
      
      inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
      
      inline def setExpire(value: js.BigInt): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setVoucher(value: js.typedarray.Uint8Array): Self = StObject.set(x, "voucher", value.asInstanceOf[js.Any])
      
      inline def setVoucherUndefined: Self = StObject.set(x, "voucher", js.undefined)
    }
  }
  
  trait ReservationVoucher extends StObject {
    
    var expiration: js.BigInt
    
    var peer: js.typedarray.Uint8Array
    
    var relay: js.typedarray.Uint8Array
  }
  object ReservationVoucher {
    
    inline def apply(expiration: js.BigInt, peer: js.typedarray.Uint8Array, relay: js.typedarray.Uint8Array): ReservationVoucher = {
      val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], relay = relay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReservationVoucher]
    }
    
    @JSImport("libp2p/dist/src/circuit-relay/pb", "ReservationVoucher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[ReservationVoucher] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[ReservationVoucher]]
    
    inline def decode(buf: js.typedarray.Uint8Array): ReservationVoucher = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ReservationVoucher]
    inline def decode(buf: Uint8ArrayList): ReservationVoucher = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ReservationVoucher]
    
    inline def encode(obj: PartialReservationVoucher): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReservationVoucher] (val x: Self) extends AnyVal {
      
      inline def setExpiration(value: js.BigInt): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setRelay(value: js.typedarray.Uint8Array): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("libp2p/dist/src/circuit-relay/pb", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Status & String] = js.native
    
    @js.native
    sealed trait CONNECTION_FAILED
      extends StObject
         with Status
    /* "CONNECTION_FAILED" */ val CONNECTION_FAILED: typings.libp2p.distSrcCircuitRelayPbMod.Status.CONNECTION_FAILED & String = js.native
    
    @js.native
    sealed trait MALFORMED_MESSAGE
      extends StObject
         with Status
    /* "MALFORMED_MESSAGE" */ val MALFORMED_MESSAGE: typings.libp2p.distSrcCircuitRelayPbMod.Status.MALFORMED_MESSAGE & String = js.native
    
    @js.native
    sealed trait NO_RESERVATION
      extends StObject
         with Status
    /* "NO_RESERVATION" */ val NO_RESERVATION: typings.libp2p.distSrcCircuitRelayPbMod.Status.NO_RESERVATION & String = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
         with ReservationStatus
    /* "OK" */ val OK: typings.libp2p.distSrcCircuitRelayPbMod.Status.OK & String = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with Status
         with ReservationStatus
    /* "PERMISSION_DENIED" */ val PERMISSION_DENIED: typings.libp2p.distSrcCircuitRelayPbMod.Status.PERMISSION_DENIED & String = js.native
    
    @js.native
    sealed trait RESERVATION_REFUSED
      extends StObject
         with Status
         with ReservationStatus
    /* "RESERVATION_REFUSED" */ val RESERVATION_REFUSED: typings.libp2p.distSrcCircuitRelayPbMod.Status.RESERVATION_REFUSED & String = js.native
    
    @js.native
    sealed trait RESOURCE_LIMIT_EXCEEDED
      extends StObject
         with Status
    /* "RESOURCE_LIMIT_EXCEEDED" */ val RESOURCE_LIMIT_EXCEEDED: typings.libp2p.distSrcCircuitRelayPbMod.Status.RESOURCE_LIMIT_EXCEEDED & String = js.native
    
    @js.native
    sealed trait UNEXPECTED_MESSAGE
      extends StObject
         with Status
    /* "UNEXPECTED_MESSAGE" */ val UNEXPECTED_MESSAGE: typings.libp2p.distSrcCircuitRelayPbMod.Status.UNEXPECTED_MESSAGE & String = js.native
    
    @js.native
    sealed trait UNUSED
      extends StObject
         with Status
    /* "UNUSED" */ val UNUSED: typings.libp2p.distSrcCircuitRelayPbMod.Status.UNUSED & String = js.native
    
    def codec(): Codec[Status] = js.native
  }
  
  trait StopMessage extends StObject {
    
    var limit: js.UndefOr[Limit] = js.undefined
    
    var peer: js.UndefOr[Peer] = js.undefined
    
    var status: js.UndefOr[Status] = js.undefined
    
    var `type`: js.UndefOr[typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type] = js.undefined
  }
  object StopMessage {
    
    inline def apply(): StopMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopMessage]
    }
    
    @JSImport("libp2p/dist/src/circuit-relay/pb", "StopMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait Type extends StObject
    @JSImport("libp2p/dist/src/circuit-relay/pb", "StopMessage.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type & String] = js.native
      
      @js.native
      sealed trait CONNECT
        extends StObject
           with typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type
      /* "CONNECT" */ val CONNECT: typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type.CONNECT & String = js.native
      
      @js.native
      sealed trait STATUS
        extends StObject
           with typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type
      /* "STATUS" */ val STATUS: typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type.STATUS & String = js.native
      
      def codec(): Codec[typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type] = js.native
    }
    
    inline def codec(): Codec[StopMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[StopMessage]]
    
    inline def decode(buf: js.typedarray.Uint8Array): StopMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[StopMessage]
    inline def decode(buf: Uint8ArrayList): StopMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[StopMessage]
    
    inline def encode(obj: PartialStopMessage): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StopMessage] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPeer(value: Peer): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setPeerUndefined: Self = StObject.set(x, "peer", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
