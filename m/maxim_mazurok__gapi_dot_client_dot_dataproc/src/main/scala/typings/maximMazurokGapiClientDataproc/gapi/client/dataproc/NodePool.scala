package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePool extends StObject {
  
  /**
    * Required. A unique id of the node pool. Primary and Secondary workers can be specified using special reserved ids PRIMARY_WORKER_POOL and SECONDARY_WORKER_POOL respectively. Aux
    * node pools can be referenced using corresponding pool id.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** Name of instances to be repaired. These instances must belong to specified node pool. */
  var instanceNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Repair action to take on specified resources of the node pool. */
  var repairAction: js.UndefOr[String] = js.undefined
}
object NodePool {
  
  inline def apply(): NodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodePool] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceNames(value: js.Array[String]): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamesUndefined: Self = StObject.set(x, "instanceNames", js.undefined)
    
    inline def setInstanceNamesVarargs(value: String*): Self = StObject.set(x, "instanceNames", js.Array(value*))
    
    inline def setRepairAction(value: String): Self = StObject.set(x, "repairAction", value.asInstanceOf[js.Any])
    
    inline def setRepairActionUndefined: Self = StObject.set(x, "repairAction", js.undefined)
  }
}
