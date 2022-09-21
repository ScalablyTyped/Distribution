package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadALTSConfig extends StObject {
  
  /**
    * enable_alts controls whether the alts handshaker should be enabled or not for direct-path. Requires Workload Identity (workload_pool must be non-empty).
    */
  var enableAlts: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaWorkloadALTSConfig {
  
  inline def apply(): SchemaWorkloadALTSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadALTSConfig]
  }
  
  extension [Self <: SchemaWorkloadALTSConfig](x: Self) {
    
    inline def setEnableAlts(value: Boolean): Self = StObject.set(x, "enableAlts", value.asInstanceOf[js.Any])
    
    inline def setEnableAltsNull: Self = StObject.set(x, "enableAlts", null)
    
    inline def setEnableAltsUndefined: Self = StObject.set(x, "enableAlts", js.undefined)
  }
}
