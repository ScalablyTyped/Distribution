package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel> */
trait PartialIModelConnections extends StObject {
  
  var connections: js.UndefOr[Double] = js.undefined
  
  var execution_state: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_activity: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var traceback: js.UndefOr[String] = js.undefined
}
object PartialIModelConnections {
  
  inline def apply(): PartialIModelConnections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIModelConnections]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIModelConnections] (val x: Self) extends AnyVal {
    
    inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setExecution_state(value: String): Self = StObject.set(x, "execution_state", value.asInstanceOf[js.Any])
    
    inline def setExecution_stateUndefined: Self = StObject.set(x, "execution_state", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast_activity(value: String): Self = StObject.set(x, "last_activity", value.asInstanceOf[js.Any])
    
    inline def setLast_activityUndefined: Self = StObject.set(x, "last_activity", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setTraceback(value: String): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
    
    inline def setTracebackUndefined: Self = StObject.set(x, "traceback", js.undefined)
  }
}
