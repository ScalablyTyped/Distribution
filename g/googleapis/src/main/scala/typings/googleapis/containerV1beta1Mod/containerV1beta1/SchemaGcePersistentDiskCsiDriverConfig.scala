package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcePersistentDiskCsiDriverConfig extends StObject {
  
  /**
    * Whether the Compute Engine PD CSI driver is enabled for this cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGcePersistentDiskCsiDriverConfig {
  
  inline def apply(): SchemaGcePersistentDiskCsiDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcePersistentDiskCsiDriverConfig]
  }
  
  extension [Self <: SchemaGcePersistentDiskCsiDriverConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
