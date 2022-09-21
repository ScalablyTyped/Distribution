package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTopologyConfig extends StObject {
  
  /**
    * The computations associated with a streaming Dataflow job.
    */
  var computations: js.UndefOr[js.Array[SchemaComputationTopology]] = js.undefined
  
  /**
    * The disks assigned to a streaming Dataflow job.
    */
  var dataDiskAssignments: js.UndefOr[js.Array[SchemaDataDiskAssignment]] = js.undefined
  
  /**
    * The size (in bits) of keys that will be assigned to source messages.
    */
  var forwardingKeyBits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Version number for persistent state.
    */
  var persistentStateVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maps user stage names to stable computation names.
    */
  var userStageToComputationNameMap: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaTopologyConfig {
  
  inline def apply(): SchemaTopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopologyConfig]
  }
  
  extension [Self <: SchemaTopologyConfig](x: Self) {
    
    inline def setComputations(value: js.Array[SchemaComputationTopology]): Self = StObject.set(x, "computations", value.asInstanceOf[js.Any])
    
    inline def setComputationsUndefined: Self = StObject.set(x, "computations", js.undefined)
    
    inline def setComputationsVarargs(value: SchemaComputationTopology*): Self = StObject.set(x, "computations", js.Array(value*))
    
    inline def setDataDiskAssignments(value: js.Array[SchemaDataDiskAssignment]): Self = StObject.set(x, "dataDiskAssignments", value.asInstanceOf[js.Any])
    
    inline def setDataDiskAssignmentsUndefined: Self = StObject.set(x, "dataDiskAssignments", js.undefined)
    
    inline def setDataDiskAssignmentsVarargs(value: SchemaDataDiskAssignment*): Self = StObject.set(x, "dataDiskAssignments", js.Array(value*))
    
    inline def setForwardingKeyBits(value: Double): Self = StObject.set(x, "forwardingKeyBits", value.asInstanceOf[js.Any])
    
    inline def setForwardingKeyBitsNull: Self = StObject.set(x, "forwardingKeyBits", null)
    
    inline def setForwardingKeyBitsUndefined: Self = StObject.set(x, "forwardingKeyBits", js.undefined)
    
    inline def setPersistentStateVersion(value: Double): Self = StObject.set(x, "persistentStateVersion", value.asInstanceOf[js.Any])
    
    inline def setPersistentStateVersionNull: Self = StObject.set(x, "persistentStateVersion", null)
    
    inline def setPersistentStateVersionUndefined: Self = StObject.set(x, "persistentStateVersion", js.undefined)
    
    inline def setUserStageToComputationNameMap(value: StringDictionary[String]): Self = StObject.set(x, "userStageToComputationNameMap", value.asInstanceOf[js.Any])
    
    inline def setUserStageToComputationNameMapNull: Self = StObject.set(x, "userStageToComputationNameMap", null)
    
    inline def setUserStageToComputationNameMapUndefined: Self = StObject.set(x, "userStageToComputationNameMap", js.undefined)
  }
}
