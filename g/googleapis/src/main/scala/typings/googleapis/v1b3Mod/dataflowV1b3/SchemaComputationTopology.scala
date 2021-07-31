package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All configuration data for a particular Computation.
  */
trait SchemaComputationTopology extends StObject {
  
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String] = js.undefined
  
  /**
    * The inputs to the computation.
    */
  var inputs: js.UndefOr[js.Array[SchemaStreamLocation]] = js.undefined
  
  /**
    * The key ranges processed by the computation.
    */
  var keyRanges: js.UndefOr[js.Array[SchemaKeyRangeLocation]] = js.undefined
  
  /**
    * The outputs from the computation.
    */
  var outputs: js.UndefOr[js.Array[SchemaStreamLocation]] = js.undefined
  
  /**
    * The state family values.
    */
  var stateFamilies: js.UndefOr[js.Array[SchemaStateFamilyConfig]] = js.undefined
  
  /**
    * The system stage name.
    */
  var systemStageName: js.UndefOr[String] = js.undefined
}
object SchemaComputationTopology {
  
  @scala.inline
  def apply(): SchemaComputationTopology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputationTopology]
  }
  
  @scala.inline
  implicit class SchemaComputationTopologyMutableBuilder[Self <: SchemaComputationTopology] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[SchemaStreamLocation]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: SchemaStreamLocation*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setKeyRanges(value: js.Array[SchemaKeyRangeLocation]): Self = StObject.set(x, "keyRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRangesUndefined: Self = StObject.set(x, "keyRanges", js.undefined)
    
    @scala.inline
    def setKeyRangesVarargs(value: SchemaKeyRangeLocation*): Self = StObject.set(x, "keyRanges", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[SchemaStreamLocation]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: SchemaStreamLocation*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setStateFamilies(value: js.Array[SchemaStateFamilyConfig]): Self = StObject.set(x, "stateFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFamiliesUndefined: Self = StObject.set(x, "stateFamilies", js.undefined)
    
    @scala.inline
    def setStateFamiliesVarargs(value: SchemaStateFamilyConfig*): Self = StObject.set(x, "stateFamilies", js.Array(value :_*))
    
    @scala.inline
    def setSystemStageName(value: String): Self = StObject.set(x, "systemStageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemStageNameUndefined: Self = StObject.set(x, "systemStageName", js.undefined)
  }
}
