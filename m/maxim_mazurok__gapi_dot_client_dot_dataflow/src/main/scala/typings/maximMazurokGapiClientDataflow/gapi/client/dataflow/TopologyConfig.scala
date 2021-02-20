package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopologyConfig extends StObject {
  
  /** The computations associated with a streaming Dataflow job. */
  var computations: js.UndefOr[js.Array[ComputationTopology]] = js.native
  
  /** The disks assigned to a streaming Dataflow job. */
  var dataDiskAssignments: js.UndefOr[js.Array[DataDiskAssignment]] = js.native
  
  /** The size (in bits) of keys that will be assigned to source messages. */
  var forwardingKeyBits: js.UndefOr[Double] = js.native
  
  /** Version number for persistent state. */
  var persistentStateVersion: js.UndefOr[Double] = js.native
  
  /** Maps user stage names to stable computation names. */
  var userStageToComputationNameMap: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.TopologyConfig with TopLevel[js.Any]
  ] = js.native
}
object TopologyConfig {
  
  @scala.inline
  def apply(): TopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologyConfig]
  }
  
  @scala.inline
  implicit class TopologyConfigMutableBuilder[Self <: TopologyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputations(value: js.Array[ComputationTopology]): Self = StObject.set(x, "computations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationsUndefined: Self = StObject.set(x, "computations", js.undefined)
    
    @scala.inline
    def setComputationsVarargs(value: ComputationTopology*): Self = StObject.set(x, "computations", js.Array(value :_*))
    
    @scala.inline
    def setDataDiskAssignments(value: js.Array[DataDiskAssignment]): Self = StObject.set(x, "dataDiskAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskAssignmentsUndefined: Self = StObject.set(x, "dataDiskAssignments", js.undefined)
    
    @scala.inline
    def setDataDiskAssignmentsVarargs(value: DataDiskAssignment*): Self = StObject.set(x, "dataDiskAssignments", js.Array(value :_*))
    
    @scala.inline
    def setForwardingKeyBits(value: Double): Self = StObject.set(x, "forwardingKeyBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingKeyBitsUndefined: Self = StObject.set(x, "forwardingKeyBits", js.undefined)
    
    @scala.inline
    def setPersistentStateVersion(value: Double): Self = StObject.set(x, "persistentStateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentStateVersionUndefined: Self = StObject.set(x, "persistentStateVersion", js.undefined)
    
    @scala.inline
    def setUserStageToComputationNameMap(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.TopologyConfig with TopLevel[js.Any]
    ): Self = StObject.set(x, "userStageToComputationNameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStageToComputationNameMapUndefined: Self = StObject.set(x, "userStageToComputationNameMap", js.undefined)
  }
}
