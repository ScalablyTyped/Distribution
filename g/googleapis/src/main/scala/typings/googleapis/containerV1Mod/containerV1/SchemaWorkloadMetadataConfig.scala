package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadMetadataConfig extends StObject {
  
  /**
    * Mode is the configuration for how to expose metadata to workloads running on the node pool.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkloadMetadataConfig {
  
  inline def apply(): SchemaWorkloadMetadataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadMetadataConfig]
  }
  
  extension [Self <: SchemaWorkloadMetadataConfig](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
