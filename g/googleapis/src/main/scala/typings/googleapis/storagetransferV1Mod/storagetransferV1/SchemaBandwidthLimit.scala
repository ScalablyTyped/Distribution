package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBandwidthLimit extends StObject {
  
  /**
    * Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
    */
  var limitMbps: js.UndefOr[String | Null] = js.undefined
}
object SchemaBandwidthLimit {
  
  inline def apply(): SchemaBandwidthLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBandwidthLimit]
  }
  
  extension [Self <: SchemaBandwidthLimit](x: Self) {
    
    inline def setLimitMbps(value: String): Self = StObject.set(x, "limitMbps", value.asInstanceOf[js.Any])
    
    inline def setLimitMbpsNull: Self = StObject.set(x, "limitMbps", null)
    
    inline def setLimitMbpsUndefined: Self = StObject.set(x, "limitMbps", js.undefined)
  }
}
