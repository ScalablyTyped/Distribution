package typings.libp2p

import typings.libp2p.distSrcTransportManagerMod.DefaultTransportManagerComponents
import typings.libp2p.distSrcTransportManagerMod.TransportManagerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object transportManagerMod {
  
  @JSImport("libp2p/transport-manager", "DefaultTransportManager")
  @js.native
  open class DefaultTransportManager protected ()
    extends typings.libp2p.distSrcTransportManagerMod.DefaultTransportManager {
    def this(components: DefaultTransportManagerComponents) = this()
    def this(components: DefaultTransportManagerComponents, init: TransportManagerInit) = this()
  }
  
  @JSImport("libp2p/transport-manager", "FaultTolerance")
  @js.native
  object FaultTolerance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.libp2p.distSrcTransportManagerMod.FaultTolerance & Double] = js.native
    
    /* 0 */ val FATAL_ALL: typings.libp2p.distSrcTransportManagerMod.FaultTolerance.FATAL_ALL & Double = js.native
    
    /* 1 */ val NO_FATAL: typings.libp2p.distSrcTransportManagerMod.FaultTolerance.NO_FATAL & Double = js.native
  }
}
