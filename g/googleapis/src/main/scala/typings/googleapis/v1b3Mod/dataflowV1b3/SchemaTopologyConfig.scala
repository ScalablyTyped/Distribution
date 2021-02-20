package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global topology of the streaming Dataflow job, including all computations
  * and their sharded locations.
  */
@js.native
trait SchemaTopologyConfig extends StObject {
  
  /**
    * The computations associated with a streaming Dataflow job.
    */
  var computations: js.UndefOr[js.Array[SchemaComputationTopology]] = js.native
  
  /**
    * The disks assigned to a streaming Dataflow job.
    */
  var dataDiskAssignments: js.UndefOr[js.Array[SchemaDataDiskAssignment]] = js.native
  
  /**
    * The size (in bits) of keys that will be assigned to source messages.
    */
  var forwardingKeyBits: js.UndefOr[Double] = js.native
  
  /**
    * Version number for persistent state.
    */
  var persistentStateVersion: js.UndefOr[Double] = js.native
  
  /**
    * Maps user stage names to stable computation names.
    */
  var userStageToComputationNameMap: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaTopologyConfig {
  
  @scala.inline
  def apply(): SchemaTopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopologyConfig]
  }
  
  @scala.inline
  implicit class SchemaTopologyConfigMutableBuilder[Self <: SchemaTopologyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputations(value: js.Array[SchemaComputationTopology]): Self = StObject.set(x, "computations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationsUndefined: Self = StObject.set(x, "computations", js.undefined)
    
    @scala.inline
    def setComputationsVarargs(value: SchemaComputationTopology*): Self = StObject.set(x, "computations", js.Array(value :_*))
    
    @scala.inline
    def setDataDiskAssignments(value: js.Array[SchemaDataDiskAssignment]): Self = StObject.set(x, "dataDiskAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskAssignmentsUndefined: Self = StObject.set(x, "dataDiskAssignments", js.undefined)
    
    @scala.inline
    def setDataDiskAssignmentsVarargs(value: SchemaDataDiskAssignment*): Self = StObject.set(x, "dataDiskAssignments", js.Array(value :_*))
    
    @scala.inline
    def setForwardingKeyBits(value: Double): Self = StObject.set(x, "forwardingKeyBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingKeyBitsUndefined: Self = StObject.set(x, "forwardingKeyBits", js.undefined)
    
    @scala.inline
    def setPersistentStateVersion(value: Double): Self = StObject.set(x, "persistentStateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentStateVersionUndefined: Self = StObject.set(x, "persistentStateVersion", js.undefined)
    
    @scala.inline
    def setUserStageToComputationNameMap(value: StringDictionary[String]): Self = StObject.set(x, "userStageToComputationNameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStageToComputationNameMapUndefined: Self = StObject.set(x, "userStageToComputationNameMap", js.undefined)
  }
}
