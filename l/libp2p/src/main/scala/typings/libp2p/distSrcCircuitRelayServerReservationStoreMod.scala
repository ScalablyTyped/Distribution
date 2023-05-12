package typings.libp2p

import typings.libp2p.anon.Expire
import typings.libp2p.distSrcCircuitRelayMod.RelayReservation
import typings.libp2p.distSrcCircuitRelayPbMod.Limit
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pPeerCollections.mod.PeerMap
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayServerReservationStoreMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/server/reservation-store", "ReservationStore")
  @js.native
  open class ReservationStore ()
    extends StObject
       with Startable {
    def this(options: ReservationStoreOptions) = this()
    
    /* private */ var _started: Any = js.native
    
    /* private */ val applyDefaultLimit: Any = js.native
    
    /* private */ val defaultDataLimit: Any = js.native
    
    /* private */ val defaultDurationLimit: Any = js.native
    
    def get(peer: PeerId): js.UndefOr[RelayReservation] = js.native
    
    def hasReservation(dst: PeerId): Boolean = js.native
    
    /* private */ var interval: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val maxReservations: Any = js.native
    
    def removeReservation(peer: PeerId): Unit = js.native
    
    /* private */ val reservationClearInterval: Any = js.native
    
    /* private */ val reservationTtl: Any = js.native
    
    val reservations: PeerMap[RelayReservation] = js.native
    
    def reserve(peer: PeerId, addr: Multiaddr_): Expire = js.native
    def reserve(peer: PeerId, addr: Multiaddr_, limit: Limit): Expire = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2p.distSrcCircuitRelayPbMod.Status.OK
    - typings.libp2p.distSrcCircuitRelayPbMod.Status.PERMISSION_DENIED
    - typings.libp2p.distSrcCircuitRelayPbMod.Status.RESERVATION_REFUSED
  */
  trait ReservationStatus extends StObject
  
  trait ReservationStoreInit extends StObject {
    
    var applyDefaultLimit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum amount of data allowed to be transferred over a relayed connection
      */
    var defaultDataLimit: js.UndefOr[js.BigInt] = js.undefined
    
    /**
      * The maximum time a relayed connection can be open for
      */
    var defaultDurationLimit: js.UndefOr[Double] = js.undefined
    
    var maxReservations: js.UndefOr[Double] = js.undefined
    
    var reservationClearInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * reservation ttl, default: 2 hours
      */
    var reservationTtl: js.UndefOr[Double] = js.undefined
  }
  object ReservationStoreInit {
    
    inline def apply(): ReservationStoreInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservationStoreInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReservationStoreInit] (val x: Self) extends AnyVal {
      
      inline def setApplyDefaultLimit(value: Boolean): Self = StObject.set(x, "applyDefaultLimit", value.asInstanceOf[js.Any])
      
      inline def setApplyDefaultLimitUndefined: Self = StObject.set(x, "applyDefaultLimit", js.undefined)
      
      inline def setDefaultDataLimit(value: js.BigInt): Self = StObject.set(x, "defaultDataLimit", value.asInstanceOf[js.Any])
      
      inline def setDefaultDataLimitUndefined: Self = StObject.set(x, "defaultDataLimit", js.undefined)
      
      inline def setDefaultDurationLimit(value: Double): Self = StObject.set(x, "defaultDurationLimit", value.asInstanceOf[js.Any])
      
      inline def setDefaultDurationLimitUndefined: Self = StObject.set(x, "defaultDurationLimit", js.undefined)
      
      inline def setMaxReservations(value: Double): Self = StObject.set(x, "maxReservations", value.asInstanceOf[js.Any])
      
      inline def setMaxReservationsUndefined: Self = StObject.set(x, "maxReservations", js.undefined)
      
      inline def setReservationClearInterval(value: Double): Self = StObject.set(x, "reservationClearInterval", value.asInstanceOf[js.Any])
      
      inline def setReservationClearIntervalUndefined: Self = StObject.set(x, "reservationClearInterval", js.undefined)
      
      inline def setReservationTtl(value: Double): Self = StObject.set(x, "reservationTtl", value.asInstanceOf[js.Any])
      
      inline def setReservationTtlUndefined: Self = StObject.set(x, "reservationTtl", js.undefined)
    }
  }
  
  /* Inlined @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<libp2p.libp2p/dist/src/circuit-relay/server/reservation-store.ReservationStoreInit> */
  trait ReservationStoreOptions extends StObject {
    
    var applyDefaultLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: boolean | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : boolean | undefined extends (args : ...any): any ? boolean | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var defaultDataLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: bigint | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : bigint | undefined extends (args : ...any): any ? bigint | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<bigint | undefined> */ js.Any
      ] = js.undefined
    
    var defaultDurationLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ] = js.undefined
    
    var maxReservations: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ] = js.undefined
    
    var reservationClearInterval: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ] = js.undefined
    
    var reservationTtl: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ] = js.undefined
  }
  object ReservationStoreOptions {
    
    inline def apply(): ReservationStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservationStoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReservationStoreOptions] (val x: Self) extends AnyVal {
      
      inline def setApplyDefaultLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: boolean | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : boolean | undefined extends (args : ...any): any ? boolean | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "applyDefaultLimit", value.asInstanceOf[js.Any])
      
      inline def setApplyDefaultLimitUndefined: Self = StObject.set(x, "applyDefaultLimit", js.undefined)
      
      inline def setDefaultDataLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: bigint | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : bigint | undefined extends (args : ...any): any ? bigint | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<bigint | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultDataLimit", value.asInstanceOf[js.Any])
      
      inline def setDefaultDataLimitUndefined: Self = StObject.set(x, "defaultDataLimit", js.undefined)
      
      inline def setDefaultDurationLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultDurationLimit", value.asInstanceOf[js.Any])
      
      inline def setDefaultDurationLimitUndefined: Self = StObject.set(x, "defaultDurationLimit", js.undefined)
      
      inline def setMaxReservations(
        value: /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ): Self = StObject.set(x, "maxReservations", value.asInstanceOf[js.Any])
      
      inline def setMaxReservationsUndefined: Self = StObject.set(x, "maxReservations", js.undefined)
      
      inline def setReservationClearInterval(
        value: /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ): Self = StObject.set(x, "reservationClearInterval", value.asInstanceOf[js.Any])
      
      inline def setReservationClearIntervalUndefined: Self = StObject.set(x, "reservationClearInterval", js.undefined)
      
      inline def setReservationTtl(
        value: /* import warning: importer.ImportType#apply Failed type conversion: number | undefined extends std.Array<infer I> ? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<I>> : number | undefined extends (args : ...any): any ? number | undefined : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<number | undefined> */ js.Any
      ): Self = StObject.set(x, "reservationTtl", value.asInstanceOf[js.Any])
      
      inline def setReservationTtlUndefined: Self = StObject.set(x, "reservationTtl", js.undefined)
    }
  }
}
