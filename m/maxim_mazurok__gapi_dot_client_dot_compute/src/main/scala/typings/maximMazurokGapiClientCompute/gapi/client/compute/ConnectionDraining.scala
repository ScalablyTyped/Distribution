package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionDraining extends StObject {
  
  /** The amount of time in seconds to allow existing connections to persist while on unhealthy backend VMs. Only applicable if the protocol is not UDP. The valid range is [0, 3600]. */
  var drainingTimeoutSec: js.UndefOr[Double] = js.undefined
}
object ConnectionDraining {
  
  inline def apply(): ConnectionDraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionDraining]
  }
  
  extension [Self <: ConnectionDraining](x: Self) {
    
    inline def setDrainingTimeoutSec(value: Double): Self = StObject.set(x, "drainingTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setDrainingTimeoutSecUndefined: Self = StObject.set(x, "drainingTimeoutSec", js.undefined)
  }
}
