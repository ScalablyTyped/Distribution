package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flows extends StObject {
  
  var flows: js.Array[TypeString] = js.native
}
object Flows {
  
  @scala.inline
  def apply(flows: js.Array[TypeString]): Flows = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flows]
  }
  
  @scala.inline
  implicit class FlowsMutableBuilder[Self <: Flows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlows(value: js.Array[TypeString]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowsVarargs(value: TypeString*): Self = StObject.set(x, "flows", js.Array(value :_*))
  }
}
