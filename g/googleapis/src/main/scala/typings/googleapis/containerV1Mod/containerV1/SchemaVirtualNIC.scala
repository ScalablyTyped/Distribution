package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVirtualNIC extends StObject {
  
  /**
    * Whether gVNIC features are enabled in the node pool.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaVirtualNIC {
  
  inline def apply(): SchemaVirtualNIC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVirtualNIC]
  }
  
  extension [Self <: SchemaVirtualNIC](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
