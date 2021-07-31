package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputationTopology extends StObject {
  
  /** The ID of the computation. */
  var computationId: js.UndefOr[String] = js.undefined
  
  /** The inputs to the computation. */
  var inputs: js.UndefOr[js.Array[StreamLocation]] = js.undefined
  
  /** The key ranges processed by the computation. */
  var keyRanges: js.UndefOr[js.Array[KeyRangeLocation]] = js.undefined
  
  /** The outputs from the computation. */
  var outputs: js.UndefOr[js.Array[StreamLocation]] = js.undefined
  
  /** The state family values. */
  var stateFamilies: js.UndefOr[js.Array[StateFamilyConfig]] = js.undefined
  
  /** The system stage name. */
  var systemStageName: js.UndefOr[String] = js.undefined
}
object ComputationTopology {
  
  @scala.inline
  def apply(): ComputationTopology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputationTopology]
  }
  
  @scala.inline
  implicit class ComputationTopologyMutableBuilder[Self <: ComputationTopology] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[StreamLocation]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: StreamLocation*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setKeyRanges(value: js.Array[KeyRangeLocation]): Self = StObject.set(x, "keyRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRangesUndefined: Self = StObject.set(x, "keyRanges", js.undefined)
    
    @scala.inline
    def setKeyRangesVarargs(value: KeyRangeLocation*): Self = StObject.set(x, "keyRanges", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[StreamLocation]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: StreamLocation*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setStateFamilies(value: js.Array[StateFamilyConfig]): Self = StObject.set(x, "stateFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFamiliesUndefined: Self = StObject.set(x, "stateFamilies", js.undefined)
    
    @scala.inline
    def setStateFamiliesVarargs(value: StateFamilyConfig*): Self = StObject.set(x, "stateFamilies", js.Array(value :_*))
    
    @scala.inline
    def setSystemStageName(value: String): Self = StObject.set(x, "systemStageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemStageNameUndefined: Self = StObject.set(x, "systemStageName", js.undefined)
  }
}
