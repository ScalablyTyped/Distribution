package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTemplateNodeTypeFlexibility extends StObject {
  
  var cpus: js.UndefOr[String] = js.undefined
  
  var localSsd: js.UndefOr[String] = js.undefined
  
  var memory: js.UndefOr[String] = js.undefined
}
object NodeTemplateNodeTypeFlexibility {
  
  inline def apply(): NodeTemplateNodeTypeFlexibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTemplateNodeTypeFlexibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeTemplateNodeTypeFlexibility] (val x: Self) extends AnyVal {
    
    inline def setCpus(value: String): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    inline def setLocalSsd(value: String): Self = StObject.set(x, "localSsd", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdUndefined: Self = StObject.set(x, "localSsd", js.undefined)
    
    inline def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
