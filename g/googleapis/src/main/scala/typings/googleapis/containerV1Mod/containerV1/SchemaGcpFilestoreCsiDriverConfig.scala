package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcpFilestoreCsiDriverConfig extends StObject {
  
  /**
    * Whether the GCP Filestore CSI driver is enabled for this cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGcpFilestoreCsiDriverConfig {
  
  inline def apply(): SchemaGcpFilestoreCsiDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcpFilestoreCsiDriverConfig]
  }
  
  extension [Self <: SchemaGcpFilestoreCsiDriverConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
