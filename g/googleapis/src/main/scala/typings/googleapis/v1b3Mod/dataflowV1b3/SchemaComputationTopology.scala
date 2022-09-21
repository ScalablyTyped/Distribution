package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputationTopology extends StObject {
  
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String | Null] = js.undefined
  
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
  var systemStageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaComputationTopology {
  
  inline def apply(): SchemaComputationTopology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputationTopology]
  }
  
  extension [Self <: SchemaComputationTopology](x: Self) {
    
    inline def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    inline def setComputationIdNull: Self = StObject.set(x, "computationId", null)
    
    inline def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    inline def setInputs(value: js.Array[SchemaStreamLocation]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SchemaStreamLocation*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKeyRanges(value: js.Array[SchemaKeyRangeLocation]): Self = StObject.set(x, "keyRanges", value.asInstanceOf[js.Any])
    
    inline def setKeyRangesUndefined: Self = StObject.set(x, "keyRanges", js.undefined)
    
    inline def setKeyRangesVarargs(value: SchemaKeyRangeLocation*): Self = StObject.set(x, "keyRanges", js.Array(value*))
    
    inline def setOutputs(value: js.Array[SchemaStreamLocation]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: SchemaStreamLocation*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setStateFamilies(value: js.Array[SchemaStateFamilyConfig]): Self = StObject.set(x, "stateFamilies", value.asInstanceOf[js.Any])
    
    inline def setStateFamiliesUndefined: Self = StObject.set(x, "stateFamilies", js.undefined)
    
    inline def setStateFamiliesVarargs(value: SchemaStateFamilyConfig*): Self = StObject.set(x, "stateFamilies", js.Array(value*))
    
    inline def setSystemStageName(value: String): Self = StObject.set(x, "systemStageName", value.asInstanceOf[js.Any])
    
    inline def setSystemStageNameNull: Self = StObject.set(x, "systemStageName", null)
    
    inline def setSystemStageNameUndefined: Self = StObject.set(x, "systemStageName", js.undefined)
  }
}
