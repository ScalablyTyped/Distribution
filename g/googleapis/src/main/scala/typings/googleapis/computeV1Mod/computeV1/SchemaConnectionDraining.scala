package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionDraining extends StObject {
  
  /**
    * Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
    */
  var drainingTimeoutSec: js.UndefOr[Double | Null] = js.undefined
}
object SchemaConnectionDraining {
  
  inline def apply(): SchemaConnectionDraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionDraining]
  }
  
  extension [Self <: SchemaConnectionDraining](x: Self) {
    
    inline def setDrainingTimeoutSec(value: Double): Self = StObject.set(x, "drainingTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setDrainingTimeoutSecNull: Self = StObject.set(x, "drainingTimeoutSec", null)
    
    inline def setDrainingTimeoutSecUndefined: Self = StObject.set(x, "drainingTimeoutSec", js.undefined)
  }
}
