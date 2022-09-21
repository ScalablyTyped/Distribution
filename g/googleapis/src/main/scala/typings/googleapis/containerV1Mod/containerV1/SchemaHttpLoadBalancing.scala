package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpLoadBalancing extends StObject {
  
  /**
    * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a small pod in the cluster that manages the load balancers.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHttpLoadBalancing {
  
  inline def apply(): SchemaHttpLoadBalancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpLoadBalancing]
  }
  
  extension [Self <: SchemaHttpLoadBalancing](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
