package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEphemeralStorageConfig extends StObject {
  
  /**
    * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
    */
  var localSsdCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaEphemeralStorageConfig {
  
  inline def apply(): SchemaEphemeralStorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEphemeralStorageConfig]
  }
  
  extension [Self <: SchemaEphemeralStorageConfig](x: Self) {
    
    inline def setLocalSsdCount(value: Double): Self = StObject.set(x, "localSsdCount", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdCountNull: Self = StObject.set(x, "localSsdCount", null)
    
    inline def setLocalSsdCountUndefined: Self = StObject.set(x, "localSsdCount", js.undefined)
  }
}
