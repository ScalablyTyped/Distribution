package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flows extends StObject {
  
  var flows: js.Array[TypeString]
}
object Flows {
  
  inline def apply(flows: js.Array[TypeString]): Flows = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flows]
  }
  
  extension [Self <: Flows](x: Self) {
    
    inline def setFlows(value: js.Array[TypeString]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsVarargs(value: TypeString*): Self = StObject.set(x, "flows", js.Array(value :_*))
  }
}
