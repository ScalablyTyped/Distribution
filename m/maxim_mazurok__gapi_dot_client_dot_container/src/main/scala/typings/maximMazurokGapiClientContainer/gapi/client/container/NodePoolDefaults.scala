package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePoolDefaults extends StObject {
  
  /** Subset of NodeConfig message that has defaults. */
  var nodeConfigDefaults: js.UndefOr[NodeConfigDefaults] = js.undefined
}
object NodePoolDefaults {
  
  inline def apply(): NodePoolDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePoolDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodePoolDefaults] (val x: Self) extends AnyVal {
    
    inline def setNodeConfigDefaults(value: NodeConfigDefaults): Self = StObject.set(x, "nodeConfigDefaults", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigDefaultsUndefined: Self = StObject.set(x, "nodeConfigDefaults", js.undefined)
  }
}
