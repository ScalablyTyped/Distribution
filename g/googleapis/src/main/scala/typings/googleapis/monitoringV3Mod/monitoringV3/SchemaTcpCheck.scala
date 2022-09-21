package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTcpCheck extends StObject {
  
  /**
    * The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTcpCheck {
  
  inline def apply(): SchemaTcpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTcpCheck]
  }
  
  extension [Self <: SchemaTcpCheck](x: Self) {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
