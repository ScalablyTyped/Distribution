package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceWithNamedPorts extends StObject {
  
  /** [Output Only] The URL of the instance. */
  var instance: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The named ports that belong to this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.undefined
  
  /** [Output Only] The status of the instance. */
  var status: js.UndefOr[String] = js.undefined
}
object InstanceWithNamedPorts {
  
  inline def apply(): InstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceWithNamedPorts]
  }
  
  extension [Self <: InstanceWithNamedPorts](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setNamedPorts(value: js.Array[NamedPort]): Self = StObject.set(x, "namedPorts", value.asInstanceOf[js.Any])
    
    inline def setNamedPortsUndefined: Self = StObject.set(x, "namedPorts", js.undefined)
    
    inline def setNamedPortsVarargs(value: NamedPort*): Self = StObject.set(x, "namedPorts", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
