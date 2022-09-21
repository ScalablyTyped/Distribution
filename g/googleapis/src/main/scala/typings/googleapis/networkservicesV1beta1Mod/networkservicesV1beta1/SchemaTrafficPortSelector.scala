package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrafficPortSelector extends StObject {
  
  /**
    * Optional. A list of ports. Can be port numbers or port range (example, [80-90] specifies all ports from 80 to 90, including 80 and 90) or named ports or * to specify all ports. If the list is empty, all ports are selected.
    */
  var ports: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTrafficPortSelector {
  
  inline def apply(): SchemaTrafficPortSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficPortSelector]
  }
  
  extension [Self <: SchemaTrafficPortSelector](x: Self) {
    
    inline def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsNull: Self = StObject.set(x, "ports", null)
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
