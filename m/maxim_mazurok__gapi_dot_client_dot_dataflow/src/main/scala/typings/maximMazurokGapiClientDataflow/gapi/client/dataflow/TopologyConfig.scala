package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologyConfig extends StObject {
  
  /** The computations associated with a streaming Dataflow job. */
  var computations: js.UndefOr[js.Array[ComputationTopology]] = js.undefined
  
  /** The disks assigned to a streaming Dataflow job. */
  var dataDiskAssignments: js.UndefOr[js.Array[DataDiskAssignment]] = js.undefined
  
  /** The size (in bits) of keys that will be assigned to source messages. */
  var forwardingKeyBits: js.UndefOr[Double] = js.undefined
  
  /** Version number for persistent state. */
  var persistentStateVersion: js.UndefOr[Double] = js.undefined
  
  /** Maps user stage names to stable computation names. */
  var userStageToComputationNameMap: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object TopologyConfig {
  
  inline def apply(): TopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopologyConfig] (val x: Self) extends AnyVal {
    
    inline def setComputations(value: js.Array[ComputationTopology]): Self = StObject.set(x, "computations", value.asInstanceOf[js.Any])
    
    inline def setComputationsUndefined: Self = StObject.set(x, "computations", js.undefined)
    
    inline def setComputationsVarargs(value: ComputationTopology*): Self = StObject.set(x, "computations", js.Array(value*))
    
    inline def setDataDiskAssignments(value: js.Array[DataDiskAssignment]): Self = StObject.set(x, "dataDiskAssignments", value.asInstanceOf[js.Any])
    
    inline def setDataDiskAssignmentsUndefined: Self = StObject.set(x, "dataDiskAssignments", js.undefined)
    
    inline def setDataDiskAssignmentsVarargs(value: DataDiskAssignment*): Self = StObject.set(x, "dataDiskAssignments", js.Array(value*))
    
    inline def setForwardingKeyBits(value: Double): Self = StObject.set(x, "forwardingKeyBits", value.asInstanceOf[js.Any])
    
    inline def setForwardingKeyBitsUndefined: Self = StObject.set(x, "forwardingKeyBits", js.undefined)
    
    inline def setPersistentStateVersion(value: Double): Self = StObject.set(x, "persistentStateVersion", value.asInstanceOf[js.Any])
    
    inline def setPersistentStateVersionUndefined: Self = StObject.set(x, "persistentStateVersion", js.undefined)
    
    inline def setUserStageToComputationNameMap(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userStageToComputationNameMap", value.asInstanceOf[js.Any])
    
    inline def setUserStageToComputationNameMapUndefined: Self = StObject.set(x, "userStageToComputationNameMap", js.undefined)
  }
}
