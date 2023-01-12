package typings.libp2p.mod

import typings.libp2p.distSrcTransportManagerMod.FaultTolerance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportManagerConfig extends StObject {
  
  var faultTolerance: js.UndefOr[FaultTolerance] = js.undefined
}
object TransportManagerConfig {
  
  inline def apply(): TransportManagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportManagerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransportManagerConfig] (val x: Self) extends AnyVal {
    
    inline def setFaultTolerance(value: FaultTolerance): Self = StObject.set(x, "faultTolerance", value.asInstanceOf[js.Any])
    
    inline def setFaultToleranceUndefined: Self = StObject.set(x, "faultTolerance", js.undefined)
  }
}
