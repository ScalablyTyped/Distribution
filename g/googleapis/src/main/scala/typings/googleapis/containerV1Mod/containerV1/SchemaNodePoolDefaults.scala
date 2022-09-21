package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodePoolDefaults extends StObject {
  
  /**
    * Subset of NodeConfig message that has defaults.
    */
  var nodeConfigDefaults: js.UndefOr[SchemaNodeConfigDefaults] = js.undefined
}
object SchemaNodePoolDefaults {
  
  inline def apply(): SchemaNodePoolDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePoolDefaults]
  }
  
  extension [Self <: SchemaNodePoolDefaults](x: Self) {
    
    inline def setNodeConfigDefaults(value: SchemaNodeConfigDefaults): Self = StObject.set(x, "nodeConfigDefaults", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigDefaultsUndefined: Self = StObject.set(x, "nodeConfigDefaults", js.undefined)
  }
}
